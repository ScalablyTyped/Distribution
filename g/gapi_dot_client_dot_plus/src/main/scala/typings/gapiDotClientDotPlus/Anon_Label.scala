package typings.gapiDotClientDotPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  /** The label of the URL. */
  var label: js.UndefOr[String] = js.undefined
  /**
    * The type of URL. Possible values include, but are not limited to, the following values:
    * - "otherProfile" - URL for another profile.
    * - "contributor" - URL to a site for which this person is a contributor.
    * - "website" - URL for this Google+ Page's primary website.
    * - "other" - Other URL.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** The URL value. */
  var value: js.UndefOr[String] = js.undefined
}

object Anon_Label {
  @scala.inline
  def apply(label: String = null, `type`: String = null, value: String = null): Anon_Label = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Label]
  }
}

