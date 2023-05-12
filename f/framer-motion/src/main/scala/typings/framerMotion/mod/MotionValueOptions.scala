package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionValueOptions extends StObject {
  
  var owner: js.UndefOr[Owner] = js.undefined
}
object MotionValueOptions {
  
  inline def apply(): MotionValueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionValueOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MotionValueOptions] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: Owner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
