package typings
package gapiDotClientDotPlusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CoverInfo extends js.Object {
  /** Extra information about the cover photo. */
  var coverInfo: js.UndefOr[Anon_LeftImageOffset] = js.undefined
  /** The person's primary cover image. */
  var coverPhoto: js.UndefOr[Anon_HeightUrl] = js.undefined
  /**
    * The layout of the cover art. Possible values include, but are not limited to, the following values:
    * - "banner" - One large image banner.
    */
  var layout: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CoverInfo {
  @scala.inline
  def apply(
    coverInfo: Anon_LeftImageOffset = null,
    coverPhoto: Anon_HeightUrl = null,
    layout: java.lang.String = null
  ): Anon_CoverInfo = {
    val __obj = js.Dynamic.literal()
    if (coverInfo != null) __obj.updateDynamic("coverInfo")(coverInfo)
    if (coverPhoto != null) __obj.updateDynamic("coverPhoto")(coverPhoto)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    __obj.asInstanceOf[Anon_CoverInfo]
  }
}

