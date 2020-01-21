package typings.googleCloudKms.mod.GAX

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** https://googleapis.github.io/gax-nodejs/global.html#RetryOptions */
trait RetryOptions extends js.Object {
  var backoffSettings: BackoffSettings
  var retryCodes: js.Array[String]
}

object RetryOptions {
  @scala.inline
  def apply(backoffSettings: BackoffSettings, retryCodes: js.Array[String]): RetryOptions = {
    val __obj = js.Dynamic.literal(backoffSettings = backoffSettings.asInstanceOf[js.Any], retryCodes = retryCodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RetryOptions]
  }
}

