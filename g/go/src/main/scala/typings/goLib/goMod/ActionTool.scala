package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * The ActionTool is responsible for handling and dispatching mouse events on GraphObjects
    * that have GraphObject.isActionable set to true.
    * This is how one implements "controls", such as buttons or sliders or knobs, as GraphObjects
    * that can be inside Parts without interfering with the standard tool behaviors.
    */
@JSImport("go", "ActionTool")
@js.native
class ActionTool ()
  extends goLib.goMod.goNs.ActionTool

