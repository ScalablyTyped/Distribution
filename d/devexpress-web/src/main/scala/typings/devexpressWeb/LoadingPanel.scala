package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the loading panel functionality.
  */
@js.native
trait LoadingPanel extends StObject {
  
  /**
    * Allows you to provide a custom loading panel.
    */
  var customPanel: js.UndefOr[ICustomLoadingPanel] = js.native
  
  /**
    * Specifies whether the loading panel is enabled in the control.
    */
  var enabled: Boolean = js.native
  
  /**
    * Hides the loading panel.
    */
  def hide(): Unit = js.native
  
  /**
    * Shows the loading panel.
    */
  def show(): Unit = js.native
}
object LoadingPanel {
  
  @scala.inline
  def apply(enabled: Boolean, hide: () => Unit, show: () => Unit): LoadingPanel = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[LoadingPanel]
  }
  
  @scala.inline
  implicit class LoadingPanelMutableBuilder[Self <: LoadingPanel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomPanel(value: ICustomLoadingPanel): Self = StObject.set(x, "customPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomPanelUndefined: Self = StObject.set(x, "customPanel", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
