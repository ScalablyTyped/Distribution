package typings.gapiDotClientDotCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestFailure extends js.Object {
  var actualService: js.UndefOr[String] = js.undefined
  var expectedService: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object TestFailure {
  @scala.inline
  def apply(
    actualService: String = null,
    expectedService: String = null,
    host: String = null,
    path: String = null
  ): TestFailure = {
    val __obj = js.Dynamic.literal()
    if (actualService != null) __obj.updateDynamic("actualService")(actualService)
    if (expectedService != null) __obj.updateDynamic("expectedService")(expectedService)
    if (host != null) __obj.updateDynamic("host")(host)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[TestFailure]
  }
}

