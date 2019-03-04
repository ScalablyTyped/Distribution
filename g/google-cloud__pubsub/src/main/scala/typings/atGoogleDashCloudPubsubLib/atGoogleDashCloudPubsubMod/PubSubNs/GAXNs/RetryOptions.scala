package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** https://googleapis.github.io/gax-nodejs/global.html#RetryOptions */
trait RetryOptions extends js.Object {
  var backoffSettings: BackoffSettings
  var retryCodes: js.Array[java.lang.String]
}

object RetryOptions {
  @scala.inline
  def apply(backoffSettings: BackoffSettings, retryCodes: js.Array[java.lang.String]): RetryOptions = {
    val __obj = js.Dynamic.literal(backoffSettings = backoffSettings, retryCodes = retryCodes)
  
    __obj.asInstanceOf[RetryOptions]
  }
}

