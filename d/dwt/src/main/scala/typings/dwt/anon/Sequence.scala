package typings.dwt.anon

import typings.dwt.dwtNumbers.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sequence extends StObject {
  
  // Example: 'viewMenu'
  var iconClass: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[String] = js.undefined
  
  var onButtonClick: js.UndefOr[String] = js.undefined
  
  // Example: 'icon-wipe'
  var sequence: js.UndefOr[`6`] = js.undefined
  
  var visibility: js.UndefOr[Boolean] = js.undefined
}
object Sequence {
  
  @scala.inline
  def apply(): Sequence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sequence]
  }
  
  @scala.inline
  implicit class SequenceMutableBuilder[Self <: Sequence] (val x: Self) extends AnyVal {
    
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
    def setSequence(value: `6`): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    @scala.inline
    def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
