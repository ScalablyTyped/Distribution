package typings
package ghDashPagesLib.ghDashPagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gh-pages", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def publish(basePath: java.lang.String, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  def publish(basePath: java.lang.String, config: ghDashPagesLib.ghDashPagesMod.PublishOptions): scala.Unit = js.native
  def publish(
    basePath: java.lang.String,
    config: ghDashPagesLib.ghDashPagesMod.PublishOptions,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

