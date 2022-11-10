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
trait dxDrawer
  extends StObject
     with Widget[dxDrawerOptions] {
  
  /**
    * Gets the drawer&apos;s content.
    */
  def content(): DxElement_[HTMLElement] = js.native
  
  /**
    * Closes the drawer.
    */
  def hide(): js.Promise[Unit] = js.native
  
  /**
    * Opens the drawer.
    */
  def show(): js.Promise[Unit] = js.native
  
  /**
    * Opens or closes the drawer, reversing the current state.
    */
  def toggle(): js.Promise[Unit] = js.native
}
object dxDrawer {
  
  type DisposingEvent = EventInfo[dxDrawer]
  
  type InitializedEvent = InitializedEventInfo[dxDrawer]
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.overlap
    - typings.devextreme.devextremeStrings.shrink
    - typings.devextreme.devextremeStrings.push
  */
  trait OpenedStateMode extends StObject
  object OpenedStateMode {
    
    inline def overlap: typings.devextreme.devextremeStrings.overlap = "overlap".asInstanceOf[typings.devextreme.devextremeStrings.overlap]
    
    inline def push: typings.devextreme.devextremeStrings.push = "push".asInstanceOf[typings.devextreme.devextremeStrings.push]
    
    inline def shrink: typings.devextreme.devextremeStrings.shrink = "shrink".asInstanceOf[typings.devextreme.devextremeStrings.shrink]
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxDrawer]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxDrawer, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.left
    - typings.devextreme.devextremeStrings.right
    - typings.devextreme.devextremeStrings.top
    - typings.devextreme.devextremeStrings.bottom
    - typings.devextreme.devextremeStrings.before
    - typings.devextreme.devextremeStrings.after
  */
  trait PanelLocation extends StObject
  object PanelLocation {
    
    inline def after: typings.devextreme.devextremeStrings.after = "after".asInstanceOf[typings.devextreme.devextremeStrings.after]
    
    inline def before: typings.devextreme.devextremeStrings.before = "before".asInstanceOf[typings.devextreme.devextremeStrings.before]
    
    inline def bottom: typings.devextreme.devextremeStrings.bottom = "bottom".asInstanceOf[typings.devextreme.devextremeStrings.bottom]
    
    inline def left: typings.devextreme.devextremeStrings.left = "left".asInstanceOf[typings.devextreme.devextremeStrings.left]
    
    inline def right: typings.devextreme.devextremeStrings.right = "right".asInstanceOf[typings.devextreme.devextremeStrings.right]
    
    inline def top: typings.devextreme.devextremeStrings.top = "top".asInstanceOf[typings.devextreme.devextremeStrings.top]
  }
  
  type Properties = dxDrawerOptions
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.slide
    - typings.devextreme.devextremeStrings.expand
  */
  trait RevealMode extends StObject
  object RevealMode {
    
    inline def expand: typings.devextreme.devextremeStrings.expand = "expand".asInstanceOf[typings.devextreme.devextremeStrings.expand]
    
    inline def slide: typings.devextreme.devextremeStrings.slide = "slide".asInstanceOf[typings.devextreme.devextremeStrings.slide]
  }
}
