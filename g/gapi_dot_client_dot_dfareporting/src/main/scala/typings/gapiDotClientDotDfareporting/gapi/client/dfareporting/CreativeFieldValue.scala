package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeFieldValue extends js.Object {
  /** ID of this creative field value. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#creativeFieldValue". */
  var kind: js.UndefOr[String] = js.undefined
  /** Value of this creative field value. It needs to be less than 256 characters in length and unique per creative field. */
  var value: js.UndefOr[String] = js.undefined
}

object CreativeFieldValue {
  @scala.inline
  def apply(id: String = null, kind: String = null, value: String = null): CreativeFieldValue = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CreativeFieldValue]
  }
}

