package typings.easyXHeaders.fsMod

import typings.easyXHeaders.AnonFlag
import typings.easyXHeaders.AnonFlagString
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "readFileSync")
@js.native
object readFileSync extends js.Object {
  def apply(filename: String): Buffer = js.native
  def apply(filename: String, encoding: String): String = js.native
  def apply(filename: String, options: AnonFlag): String = js.native
  def apply(filename: String, options: AnonFlagString): Buffer = js.native
}

