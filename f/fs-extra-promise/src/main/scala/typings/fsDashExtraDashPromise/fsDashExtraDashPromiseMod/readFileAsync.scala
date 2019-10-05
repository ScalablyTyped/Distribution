package typings.fsDashExtraDashPromise.fsDashExtraDashPromiseMod

import typings.bluebird.bluebirdMod.^
import typings.fsDashExtra.fsDashExtraMod.ReadOptions
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

