package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniversalAdId extends js.Object {
  /** Registry used for the Ad ID value. */
  var registry: js.UndefOr[String] = js.undefined
  /**
    * ID value for this creative. Only alphanumeric characters and the following symbols are valid: "_/\-". Maximum length is 64 characters. Read only when
    * registry is DCM.
    */
  var value: js.UndefOr[String] = js.undefined
}

object UniversalAdId {
  @scala.inline
  def apply(registry: String = null, value: String = null): UniversalAdId = {
    val __obj = js.Dynamic.literal()
    if (registry != null) __obj.updateDynamic("registry")(registry)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[UniversalAdId]
  }
}

