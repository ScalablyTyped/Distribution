package typings.easyXHeaders.fsMod

import typings.easyXHeaders.anon.Flags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "createWriteStream")
@js.native
object createWriteStream extends js.Object {
  def apply(path: String): WriteStream = js.native
  def apply(path: String, options: Flags): WriteStream = js.native
}

