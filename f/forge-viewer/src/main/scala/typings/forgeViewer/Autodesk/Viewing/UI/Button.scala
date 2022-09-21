package typings.forgeViewer.Autodesk.Viewing.UI

import typings.forgeViewer.Autodesk.Viewing.UI.Button.State
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Button
  extends StObject
     with Control {
  
  def getState(): State = js.native
  
  var icon: HTMLElement = js.native
  
  def onClick(event: Event): Unit = js.native
  
  def onMouseOut(event: Event): Unit = js.native
  
  def onMouseOver(event: Event): Unit = js.native
  
  def setIcon(iconClass: String): Unit = js.native
  
  def setState(state: State): Boolean = js.native
}
// NOTE: TypeScript doesn't support enum inside class. This seems to be commonly used workaround.
object Button {
  
  @js.native
  sealed trait State extends StObject
  @JSGlobal("Autodesk.Viewing.UI.Button.State")
  @js.native
  object State extends StObject {
    
    @js.native
    sealed trait ACTIVE
      extends StObject
         with State
    
    @js.native
    sealed trait DISABLED
      extends StObject
         with State
    
    @js.native
    sealed trait INACTIVE
      extends StObject
         with State
  }
}
