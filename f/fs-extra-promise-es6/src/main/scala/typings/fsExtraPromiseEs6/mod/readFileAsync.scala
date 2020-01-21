package typings.fsExtraPromiseEs6.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise-es6", "readFileAsync")
@js.native
object readFileAsync extends js.Object {
  def apply(filename: String): js.Promise[Buffer] = js.native
  def apply(filename: String, options: String): js.Promise[String] = js.native
  def apply(filename: String, options: OpenOptions): js.Promise[String] = js.native
}

