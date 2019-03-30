package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Origination extends js.Object {
  var owner: js.UndefOr[java.lang.String] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
}

object Origination {
  @scala.inline
  def apply(owner: java.lang.String = null, source: java.lang.String = null): Origination = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Origination]
  }
}

