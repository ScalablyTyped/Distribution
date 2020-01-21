package typings.ghPages.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gh-pages", "publish")
@js.native
object publish extends js.Object {
  def apply(basePath: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def apply(basePath: String, config: PublishOptions): Unit = js.native
  def apply(basePath: String, config: PublishOptions, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
}

