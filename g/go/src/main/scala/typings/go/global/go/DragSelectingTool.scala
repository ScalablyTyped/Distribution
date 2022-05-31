package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The DragSelectingTool lets the user select multiple parts with a rectangular area.
  * There is a temporary part, the .box,
  * that shows the current area encompassed between the mouse-down
  * point and the current mouse point.
  * The default drag selection box is a blue rectangle.
  * You can change the .box to customize its appearance -- see its documentation for an example.
  */
@JSGlobal("go.DragSelectingTool")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the ToolManager.dragSelectingTool, which you can modify.
  */
class DragSelectingTool ()
  extends typings.go.mod.DragSelectingTool
