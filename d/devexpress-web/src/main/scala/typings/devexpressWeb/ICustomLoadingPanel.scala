package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines custom loading panel members.
  */
trait ICustomLoadingPanel extends StObject {
  
  /**
    * Hides the loading panel.
    */
  def hide(): Unit
  
  /**
    * Shows the loading panel.
    */
  def show(): Unit
  
  /**
    * Specifies whether the panel is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ICustomLoadingPanel {
  
  inline def apply(hide: () => Unit, show: () => Unit): ICustomLoadingPanel = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[ICustomLoadingPanel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICustomLoadingPanel] (val x: Self) extends AnyVal {
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
