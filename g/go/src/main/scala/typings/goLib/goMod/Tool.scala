package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tools handle mouse events and keyboard events.
  * The currently running tool, Diagram.currentTool, receives all input events from the Diagram.
  */
@JSImport("go", "Tool")
@js.native
/**
  * Don't construct this directly -- this is an abstract class.
  */
abstract class Tool ()
  extends goLib.goMod.goNs.Tool

