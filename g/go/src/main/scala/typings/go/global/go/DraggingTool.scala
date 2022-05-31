package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The DraggingTool is used to move or copy selected parts with the mouse.
  * Dragging the selection moves parts for which Part.canMove is true.
  * If the user holds down the Control key, this tool will make a copy of the parts being dragged,
  * for those parts for which Part.canCopy is true.
  */
@JSGlobal("go.DraggingTool")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the ToolManager.draggingTool, which you can modify.
  */
class DraggingTool ()
  extends typings.go.mod.DraggingTool
