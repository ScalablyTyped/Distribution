package typings.googleDashGax.buildSrcGaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/gax", "RetryOptions")
@js.native
class RetryOptions protected () extends js.Object {
  def this(retryCodes: js.Array[Double], backoffSettings: BackoffSettings) = this()
  var backoffSettings: BackoffSettings = js.native
  var retryCodes: js.Array[Double] = js.native
}

