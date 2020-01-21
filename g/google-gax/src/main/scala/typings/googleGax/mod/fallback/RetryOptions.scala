package typings.googleGax.mod.fallback

import typings.googleGax.gaxMod.BackoffSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "fallback.RetryOptions")
@js.native
class RetryOptions protected ()
  extends typings.googleGax.fallbackMod.RetryOptions {
  def this(retryCodes: js.Array[Double], backoffSettings: BackoffSettings) = this()
}

