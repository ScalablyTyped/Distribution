package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to represent a field transform on a mutation. */
trait TransformOperation extends StObject {
  
  /* private */ @JSName("_")
  var _underscore: Any
}
object TransformOperation {
  
  inline def apply(_underscore: Any): TransformOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformOperation] (val x: Self) extends AnyVal {
    
    inline def set_underscore(value: Any): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
  }
}
