package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The RotatingTool is used to interactively change the GraphObject.angle of a GraphObject.
  * This tool allows the user to rotate the Part.rotateObject of the selected Part.
  * Normally this works with Parts or Nodes; it does not make sense for Links.
  * The Part must be Part.rotatable, which is false by default.
  */
@JSGlobal("go.RotatingTool")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the ToolManager.rotatingTool, which you can modify.
  */
class RotatingTool ()
  extends typings.go.mod.RotatingTool
