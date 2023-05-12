package typings.framerMotion.distThreeEntryMod

import typings.framerMotion.framerMotionBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait None
  extends StObject
     with _TransitionDefinition {
  
  /**
    * Set `type` to `false` for an instant transition.
    *
    * @public
    */
  var `type`: `false`
}
object None {
  
  inline def apply(): None = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(false)
    __obj.asInstanceOf[None]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: None] (val x: Self) extends AnyVal {
    
    inline def setType(value: `false`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
