package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTestFailure extends js.Object {
  var actualService: js.UndefOr[String] = js.native
  var expectedService: js.UndefOr[String] = js.native
  var host: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
}

object SchemaTestFailure {
  @scala.inline
  def apply(
    actualService: String = null,
    expectedService: String = null,
    host: String = null,
    path: String = null
  ): SchemaTestFailure = {
    val __obj = js.Dynamic.literal()
    if (actualService != null) __obj.updateDynamic("actualService")(actualService.asInstanceOf[js.Any])
    if (expectedService != null) __obj.updateDynamic("expectedService")(expectedService.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTestFailure]
  }
}

