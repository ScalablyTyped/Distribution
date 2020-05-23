package typings.fsExtraPromiseEs6.mod

import typings.fsExtraPromiseEs6.anon.AutoClose
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise-es6", "createReadStream")
@js.native
object createReadStream extends js.Object {
  def apply(path: String): ReadStream = js.native
  def apply(path: String, options: AutoClose): ReadStream = js.native
  def apply(path: Buffer): ReadStream = js.native
  def apply(path: Buffer, options: AutoClose): ReadStream = js.native
}

