package typings.dwt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BShowIndicator extends StObject {
  
  /**
    * Whether to show the indicator of the device.
    */
  var bShowIndicator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to show the UI of the device.
    */
  var bShowUI: js.UndefOr[Boolean] = js.undefined
}
object BShowIndicator {
  
  @scala.inline
  def apply(): BShowIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BShowIndicator]
  }
  
  @scala.inline
  implicit class BShowIndicatorMutableBuilder[Self <: BShowIndicator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBShowIndicator(value: Boolean): Self = StObject.set(x, "bShowIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBShowIndicatorUndefined: Self = StObject.set(x, "bShowIndicator", js.undefined)
    
    @scala.inline
    def setBShowUI(value: Boolean): Self = StObject.set(x, "bShowUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBShowUIUndefined: Self = StObject.set(x, "bShowUI", js.undefined)
  }
}
