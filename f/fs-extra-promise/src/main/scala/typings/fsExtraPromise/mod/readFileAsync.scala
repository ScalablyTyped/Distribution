package typings.fsExtraPromise.mod

import typings.bluebird.mod.^
import typings.fsExtra.mod.ReadOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "readFileAsync")
@js.native
object readFileAsync extends js.Object {
  def apply(filename: String): ^[Buffer] = js.native
  def apply(filename: String, options: String): ^[String] = js.native
  def apply(filename: String, options: ReadOptions): ^[String] = js.native
}

