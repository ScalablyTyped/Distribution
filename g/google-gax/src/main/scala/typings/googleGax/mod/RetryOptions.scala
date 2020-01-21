package typings.googleGax.mod

import typings.googleGax.gaxMod.BackoffSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "RetryOptions")
@js.native
class RetryOptions protected ()
  extends typings.googleGax.gaxMod.RetryOptions {
  def this(retryCodes: js.Array[Double], backoffSettings: BackoffSettings) = this()
}

