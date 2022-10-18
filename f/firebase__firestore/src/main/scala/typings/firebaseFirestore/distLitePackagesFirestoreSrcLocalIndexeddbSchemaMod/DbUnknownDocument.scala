package typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalIndexeddbSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbUnknownDocument extends StObject {
  
  var path: js.Array[String]
  
  var version: DbTimestamp
}
object DbUnknownDocument {
  
  inline def apply(path: js.Array[String], version: DbTimestamp): DbUnknownDocument = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbUnknownDocument]
  }
  
  extension [Self <: DbUnknownDocument](x: Self) {
    
    inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setVersion(value: DbTimestamp): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
