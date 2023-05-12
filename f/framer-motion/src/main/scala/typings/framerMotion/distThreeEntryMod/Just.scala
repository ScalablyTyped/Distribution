package typings.framerMotion.distThreeEntryMod

import typings.framerMotion.framerMotionStrings.just
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait Just
  extends StObject
     with _TransitionDefinition {
  
  /**
    * @public
    */
  var `type`: just
}
object Just {
  
  inline def apply(): Just = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("just")
    __obj.asInstanceOf[Just]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Just] (val x: Self) extends AnyVal {
    
    inline def setType(value: just): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
