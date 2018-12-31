package typings
package gapiDotClientDotAdsenseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Location extends js.Object {
  /** The name used to describe this channel externally. */
  var adsAppearOn: js.UndefOr[java.lang.String] = js.undefined
  /** The external description of the channel. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The locations in which ads appear. (Only valid for content and mobile content ads (deprecated)). Acceptable values for content ads are: TOP_LEFT,
    * TOP_CENTER, TOP_RIGHT, MIDDLE_LEFT, MIDDLE_CENTER, MIDDLE_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT, MULTIPLE_LOCATIONS. Acceptable values for
    * mobile content ads (deprecated) are: TOP, MIDDLE, BOTTOM, MULTIPLE_LOCATIONS.
    */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /** The language of the sites ads will be displayed on. */
  var siteLanguage: js.UndefOr[java.lang.String] = js.undefined
}

