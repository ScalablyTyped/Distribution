package typings
package atGoogleDashCloudStorageLib.buildSrcNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNotificationOptions extends js.Object {
  /**
    * Automatically create the object if it does not exist. Default: `false`.
    */
  var autoCreate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The ID of the project which will be billed for the request.
    */
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object GetNotificationOptions {
  @scala.inline
  def apply(autoCreate: js.UndefOr[scala.Boolean] = js.undefined, userProject: java.lang.String = null): GetNotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCreate)) __obj.updateDynamic("autoCreate")(autoCreate)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[GetNotificationOptions]
  }
}

