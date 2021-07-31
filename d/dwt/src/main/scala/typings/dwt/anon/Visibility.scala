package typings.dwt.anon

import typings.dwt.dwtNumbers.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Visibility extends StObject {
  
  // Example: 'viewMenu'
  var iconClass: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[String] = js.undefined
  
  var onButtonClick: js.UndefOr[String] = js.undefined
  
  // Example: 'icon-undo'
  var sequence: js.UndefOr[`7`] = js.undefined
  
  var visibility: js.UndefOr[Boolean] = js.undefined
}
object Visibility {
  
  @scala.inline
  def apply(): Visibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Visibility]
  }
  
  @scala.inline
  implicit class VisibilityMutableBuilder[Self <: Visibility] (val x: Self) extends AnyVal {
    
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
    def setSequence(value: `7`): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    @scala.inline
    def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
