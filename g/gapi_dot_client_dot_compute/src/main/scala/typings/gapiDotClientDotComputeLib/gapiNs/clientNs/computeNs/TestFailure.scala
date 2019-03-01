package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestFailure extends js.Object {
  var actualService: js.UndefOr[java.lang.String] = js.undefined
  var expectedService: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object TestFailure {
  @scala.inline
  def apply(
    actualService: java.lang.String = null,
    expectedService: java.lang.String = null,
    host: java.lang.String = null,
    path: java.lang.String = null
  ): TestFailure = {
    val __obj = js.Dynamic.literal()
    if (actualService != null) __obj.updateDynamic("actualService")(actualService)
    if (expectedService != null) __obj.updateDynamic("expectedService")(expectedService)
    if (host != null) __obj.updateDynamic("host")(host)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[TestFailure]
  }
}

