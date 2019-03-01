package typings
package gapiDotClientDotPlusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  /** The label of the URL. */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of URL. Possible values include, but are not limited to, the following values:
    * - "otherProfile" - URL for another profile.
    * - "contributor" - URL to a site for which this person is a contributor.
    * - "website" - URL for this Google+ Page's primary website.
    * - "other" - Other URL.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** The URL value. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Label {
  @scala.inline
  def apply(label: java.lang.String = null, `type`: java.lang.String = null, value: java.lang.String = null): Anon_Label = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Label]
  }
}

