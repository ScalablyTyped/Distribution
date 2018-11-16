package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * The RotatingTool is used to interactively change the GraphObject.angle of a GraphObject.
    * This tool allows the user to rotate the Part.rotateObject of the selected Part.
    * Normally this works with Parts or Nodes; it does not make sense for Links.
    * The Part must be Part.rotatable, which is false by default.
    */
@JSImport("go", "RotatingTool")
@js.native
class RotatingTool ()
  extends goLib.goMod.goNs.RotatingTool

