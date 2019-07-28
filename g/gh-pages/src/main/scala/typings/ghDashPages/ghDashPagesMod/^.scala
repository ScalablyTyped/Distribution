package typings.ghDashPages.ghDashPagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gh-pages", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def publish(basePath: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def publish(basePath: String, config: PublishOptions): Unit = js.native
  def publish(basePath: String, config: PublishOptions, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
}

