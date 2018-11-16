package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LocalizedCompanyInfo extends js.Object {
  /** List of country codes for the localized company info. */
  var countryCodes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Localized display name. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Language code of the localized company info, as defined by
               * <a href="https://tools.ietf.org/html/bcp47">BCP 47</a>
               * (IETF BCP 47, "Tags for Identifying Languages").
               */
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  /** Localized brief description that the company uses to advertise themselves. */
  var overview: js.UndefOr[java.lang.String] = js.undefined
}

