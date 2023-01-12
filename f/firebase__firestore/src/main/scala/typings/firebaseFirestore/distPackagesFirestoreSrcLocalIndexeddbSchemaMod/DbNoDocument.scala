package typings.firebaseFirestore.distPackagesFirestoreSrcLocalIndexeddbSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbNoDocument extends StObject {
  
  var path: js.Array[String]
  
  var readTime: DbTimestamp
}
object DbNoDocument {
  
  inline def apply(path: js.Array[String], readTime: DbTimestamp): DbNoDocument = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], readTime = readTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbNoDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DbNoDocument] (val x: Self) extends AnyVal {
    
    inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setReadTime(value: DbTimestamp): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
  }
}
