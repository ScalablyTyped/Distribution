package typings
package gatsbyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Force
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var fromPath: java.lang.String
  var isPermanent: js.UndefOr[scala.Boolean] = js.undefined
  var redirectInBrowser: js.UndefOr[scala.Boolean] = js.undefined
  var statusCode: js.UndefOr[scala.Double] = js.undefined
  var toPath: java.lang.String
}

object Anon_Force {
  @scala.inline
  def apply(
    fromPath: java.lang.String,
    toPath: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    isPermanent: js.UndefOr[scala.Boolean] = js.undefined,
    redirectInBrowser: js.UndefOr[scala.Boolean] = js.undefined,
    statusCode: scala.Int | scala.Double = null
  ): Anon_Force = {
    val __obj = js.Dynamic.literal(fromPath = fromPath, toPath = toPath)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(isPermanent)) __obj.updateDynamic("isPermanent")(isPermanent)
    if (!js.isUndefined(redirectInBrowser)) __obj.updateDynamic("redirectInBrowser")(redirectInBrowser)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Force]
  }
}

