package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcsTokenLink extends js.Object {
  /** URL to retrieve ACS token for pdf download. (In LITE projection.) */
  var acsTokenLink: js.UndefOr[java.lang.String] = js.undefined
  /** URL to download pdf. (In LITE projection.) */
  var downloadLink: js.UndefOr[java.lang.String] = js.undefined
  /** Is a scanned image pdf available either as public domain or for purchase. (In LITE projection.) */
  var isAvailable: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AcsTokenLink {
  @scala.inline
  def apply(
    acsTokenLink: java.lang.String = null,
    downloadLink: java.lang.String = null,
    isAvailable: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AcsTokenLink = {
    val __obj = js.Dynamic.literal()
    if (acsTokenLink != null) __obj.updateDynamic("acsTokenLink")(acsTokenLink)
    if (downloadLink != null) __obj.updateDynamic("downloadLink")(downloadLink)
    if (!js.isUndefined(isAvailable)) __obj.updateDynamic("isAvailable")(isAvailable)
    __obj.asInstanceOf[Anon_AcsTokenLink]
  }
}

