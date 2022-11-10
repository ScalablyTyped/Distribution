package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxSlideOutView
  extends StObject
     with Widget[dxSlideOutViewOptions] {
  
  /**
    * Gets the UI component&apos;s content.
    */
  def content(): DxElement_[HTMLElement] = js.native
  
  /**
    * Hides the UI component&apos;s slide-out menu.
    */
  def hideMenu(): js.Promise[Unit] = js.native
  
  /**
    * Gets the slide-out menu&apos;s content.
    */
  def menuContent(): DxElement_[HTMLElement] = js.native
  
  /**
    * Shows the slide-out menu.
    */
  def showMenu(): js.Promise[Unit] = js.native
  
  /**
    * Shows or hides the slide-out menu depending on the argument.
    */
  def toggleMenuVisibility(): js.Promise[Unit] = js.native
  def toggleMenuVisibility(showing: Boolean): js.Promise[Unit] = js.native
}
object dxSlideOutView {
  
  type DisposingEvent = EventInfo[dxSlideOutView]
  
  type InitializedEvent = InitializedEventInfo[dxSlideOutView]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxSlideOutView]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxSlideOutView, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxSlideOutViewOptions
}
