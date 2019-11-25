package typings.gapiDotClientDotCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hash extends js.Object {
  /** The type of hash that was performed. */
  var `type`: js.UndefOr[String] = js.undefined
  /** The hash value. */
  var value: js.UndefOr[String] = js.undefined
}

object Hash {
  @scala.inline
  def apply(`type`: String = null, value: String = null): Hash = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
}

