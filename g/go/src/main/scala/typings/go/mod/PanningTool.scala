package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The PanningTool supports manual panning, where the user can shift the
  * Diagram.position by dragging the mouse.
  */
@JSImport("go", "PanningTool")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the ToolManager.panningTool.
  */
class PanningTool () extends Tool {
  
  /**Gets or sets whether panning actions will allow events to bubble instead of panning in the diagram.*/
  var bubbles: Boolean = js.native
  
  /**This read-only property returns the Point that was the original value of Diagram.position when the panning operation started.*/
  var originalPosition: Point = js.native
}
