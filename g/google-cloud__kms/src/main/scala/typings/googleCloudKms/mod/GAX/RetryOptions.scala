package typings.googleCloudKms.mod.GAX

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** https://googleapis.github.io/gax-nodejs/global.html#RetryOptions */
@js.native
trait RetryOptions extends js.Object {
  var backoffSettings: BackoffSettings = js.native
  var retryCodes: js.Array[String] = js.native
}

object RetryOptions {
  @scala.inline
  def apply(backoffSettings: BackoffSettings, retryCodes: js.Array[String]): RetryOptions = {
    val __obj = js.Dynamic.literal(backoffSettings = backoffSettings.asInstanceOf[js.Any], retryCodes = retryCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryOptions]
  }
  @scala.inline
  implicit class RetryOptionsOps[Self <: RetryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackoffSettings(value: BackoffSettings): Self = this.set("backoffSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetryCodesVarargs(value: String*): Self = this.set("retryCodes", js.Array(value :_*))
    @scala.inline
    def setRetryCodes(value: js.Array[String]): Self = this.set("retryCodes", value.asInstanceOf[js.Any])
  }
  
}

