package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vn extends StObject {
  
  var _aggregateType: String
  
  var _internalFieldPath: Any
  
  /** A type string to uniquely identify instances of this class. */
  var `type`: String
}
object Vn {
  
  inline def apply(_aggregateType: String, _internalFieldPath: Any, `type`: String): Vn = {
    val __obj = js.Dynamic.literal(_aggregateType = _aggregateType.asInstanceOf[js.Any], _internalFieldPath = _internalFieldPath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Vn] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_aggregateType(value: String): Self = StObject.set(x, "_aggregateType", value.asInstanceOf[js.Any])
    
    inline def set_internalFieldPath(value: Any): Self = StObject.set(x, "_internalFieldPath", value.asInstanceOf[js.Any])
  }
}
