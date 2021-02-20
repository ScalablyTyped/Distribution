package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DuplicateDuplicateProperties extends StObject {
  
  /**
    * Whether the tab should become the active tab in the window. Does not affect whether the window is focused (see `windows.update`). Defaults to `true`.
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * The position the new tab should take in the window. The provided value will be clamped to between zero and the number of tabs in the window.
    */
  var index: js.UndefOr[Double] = js.native
}
object DuplicateDuplicateProperties {
  
  @scala.inline
  def apply(): DuplicateDuplicateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplicateDuplicateProperties]
  }
  
  @scala.inline
  implicit class DuplicateDuplicatePropertiesMutableBuilder[Self <: DuplicateDuplicateProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
