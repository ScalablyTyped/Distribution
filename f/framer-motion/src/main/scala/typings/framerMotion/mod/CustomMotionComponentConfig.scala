package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomMotionComponentConfig extends StObject {
  
  var forwardMotionProps: js.UndefOr[Boolean] = js.undefined
}
object CustomMotionComponentConfig {
  
  inline def apply(): CustomMotionComponentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomMotionComponentConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomMotionComponentConfig] (val x: Self) extends AnyVal {
    
    inline def setForwardMotionProps(value: Boolean): Self = StObject.set(x, "forwardMotionProps", value.asInstanceOf[js.Any])
    
    inline def setForwardMotionPropsUndefined: Self = StObject.set(x, "forwardMotionProps", js.undefined)
  }
}
