package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Base interface for the Serializer implementation. */
trait Serializer extends StObject {
  
  val useProto3Json: Boolean
}
object Serializer {
  
  inline def apply(useProto3Json: Boolean): Serializer = {
    val __obj = js.Dynamic.literal(useProto3Json = useProto3Json.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serializer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Serializer] (val x: Self) extends AnyVal {
    
    inline def setUseProto3Json(value: Boolean): Self = StObject.set(x, "useProto3Json", value.asInstanceOf[js.Any])
  }
}
