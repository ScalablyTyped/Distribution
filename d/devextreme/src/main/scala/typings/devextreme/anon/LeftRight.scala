package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeftRight extends StObject {
  
  /**
    * Specifies range selector&apos;s left indent.
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies range selector&apos;s right indent.
    */
  var right: js.UndefOr[Double] = js.undefined
}
object LeftRight {
  
  inline def apply(): LeftRight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeftRight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LeftRight] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
  }
}
