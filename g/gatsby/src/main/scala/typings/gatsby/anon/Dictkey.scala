package typings.gatsby.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var force: js.UndefOr[Boolean] = js.undefined
  var fromPath: String
  var isPermanent: js.UndefOr[Boolean] = js.undefined
  var redirectInBrowser: js.UndefOr[Boolean] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
  var toPath: String
}

object Dictkey {
  @scala.inline
  def apply(
    fromPath: String,
    toPath: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    force: js.UndefOr[Boolean] = js.undefined,
    isPermanent: js.UndefOr[Boolean] = js.undefined,
    redirectInBrowser: js.UndefOr[Boolean] = js.undefined,
    statusCode: js.UndefOr[Double] = js.undefined
  ): Dictkey = {
    val __obj = js.Dynamic.literal(fromPath = fromPath.asInstanceOf[js.Any], toPath = toPath.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPermanent)) __obj.updateDynamic("isPermanent")(isPermanent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(redirectInBrowser)) __obj.updateDynamic("redirectInBrowser")(redirectInBrowser.get.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
}

