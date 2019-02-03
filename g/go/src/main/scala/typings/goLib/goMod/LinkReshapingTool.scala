package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The LinkReshapingTool is used to interactively change the route of a Link.
  * This tool makes use of an Adornment, shown when the adorned Link is selected,
  * that includes some number of reshape handles.
  * This tool conducts a transaction while the tool is active.
  * A successful reshaping will result in a "LinkReshaped" DiagramEvent and a "LinkReshaping" transaction.
  */
@JSImport("go", "LinkReshapingTool")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the ToolManager.linkReshapingTool, which you can modify.
  */
class LinkReshapingTool ()
  extends goLib.goMod.goNs.LinkReshapingTool

/* static members */
@JSImport("go", "LinkReshapingTool")
@js.native
object LinkReshapingTool extends js.Object {
  /**Allow dragging in any direction.*/
  var All: goLib.goMod.goNs.EnumValue = js.native
  /**Allow only horizontal (left-and-right) dragging.*/
  var Horizontal: goLib.goMod.goNs.EnumValue = js.native
  /**Disallow dragging.*/
  var None: goLib.goMod.goNs.EnumValue = js.native
  /**Allow only vertical (up-and-down) dragging.*/
  var Vertical: goLib.goMod.goNs.EnumValue = js.native
}

