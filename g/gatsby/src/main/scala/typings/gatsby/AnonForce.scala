package typings.gatsby

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForce
  extends /* key */ StringDictionary[js.Any] {
  var force: js.UndefOr[Boolean] = js.undefined
  var fromPath: String
  var isPermanent: js.UndefOr[Boolean] = js.undefined
  var redirectInBrowser: js.UndefOr[Boolean] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
  var toPath: String
}

object AnonForce {
  @scala.inline
  def apply(
    fromPath: String,
    toPath: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    force: js.UndefOr[Boolean] = js.undefined,
    isPermanent: js.UndefOr[Boolean] = js.undefined,
    redirectInBrowser: js.UndefOr[Boolean] = js.undefined,
    statusCode: Int | Double = null
  ): AnonForce = {
    val __obj = js.Dynamic.literal(fromPath = fromPath.asInstanceOf[js.Any], toPath = toPath.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(isPermanent)) __obj.updateDynamic("isPermanent")(isPermanent.asInstanceOf[js.Any])
    if (!js.isUndefined(redirectInBrowser)) __obj.updateDynamic("redirectInBrowser")(redirectInBrowser.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForce]
  }
}

