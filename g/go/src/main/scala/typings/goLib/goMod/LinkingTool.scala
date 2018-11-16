package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    */
@JSImport("go", "LinkingTool")
@js.native
class LinkingTool ()
  extends goLib.goMod.goNs.LinkingTool

/**
    */
@JSImport("go", "LinkingTool")
@js.native
object LinkingTool extends js.Object {
  /**This value for LinkingTool.direction indicates that users may draw new links backwards only.*/
  var BackwardsOnly: goLib.goMod.goNs.EnumValue = js.native
  /**This value for LinkingTool.direction indicates that users may draw new links in either direction.*/
  var Either: goLib.goMod.goNs.EnumValue = js.native
  /**This value for LinkingTool.direction indicates that users may draw new links forwards only.*/
  var ForwardsOnly: goLib.goMod.goNs.EnumValue = js.native
}

