package typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalIndexeddbSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbTimestamp extends StObject {
  
  var nanoseconds: Double
  
  var seconds: Double
}
object DbTimestamp {
  
  inline def apply(nanoseconds: Double, seconds: Double): DbTimestamp = {
    val __obj = js.Dynamic.literal(nanoseconds = nanoseconds.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbTimestamp]
  }
  
  extension [Self <: DbTimestamp](x: Self) {
    
    inline def setNanoseconds(value: Double): Self = StObject.set(x, "nanoseconds", value.asInstanceOf[js.Any])
    
    inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
  }
}
