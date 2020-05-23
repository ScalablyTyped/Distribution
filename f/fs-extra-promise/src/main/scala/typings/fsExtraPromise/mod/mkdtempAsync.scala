package typings.fsExtraPromise.mod

import typings.bluebird.mod.^
import typings.fsExtraPromise.anon.Encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "mkdtempAsync")
@js.native
object mkdtempAsync extends js.Object {
  def apply(prefix: String, options: String): ^[String] = js.native
  def apply(prefix: String, options: Encoding): ^[String] = js.native
}

