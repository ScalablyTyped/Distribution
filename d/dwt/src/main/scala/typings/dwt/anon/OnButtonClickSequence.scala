package typings.dwt.anon

import typings.dwt.dwtNumbers.`10`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnButtonClickSequence extends StObject {
  
  // Example: 'viewMenu'
  var iconClass: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[String] = js.native
  
  var onButtonClick: js.UndefOr[String] = js.native
  
  // Example: 'icon-shrinkImage'
  var sequence: js.UndefOr[`10`] = js.native
  
  var visibility: js.UndefOr[Boolean] = js.native
}
object OnButtonClickSequence {
  
  @scala.inline
  def apply(): OnButtonClickSequence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnButtonClickSequence]
  }
  
  @scala.inline
  implicit class OnButtonClickSequenceMutableBuilder[Self <: OnButtonClickSequence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setOnButtonClick(value: String): Self = StObject.set(x, "onButtonClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnButtonClickUndefined: Self = StObject.set(x, "onButtonClick", js.undefined)
    
    @scala.inline
    def setSequence(value: `10`): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    @scala.inline
    def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
