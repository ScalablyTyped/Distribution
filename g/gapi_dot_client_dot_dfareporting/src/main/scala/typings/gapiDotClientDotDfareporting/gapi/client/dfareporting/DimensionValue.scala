package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionValue extends js.Object {
  /** The name of the dimension. */
  var dimensionName: js.UndefOr[String] = js.undefined
  /** The eTag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.undefined
  /** The ID associated with the value if available. */
  var id: js.UndefOr[String] = js.undefined
  /** The kind of resource this is, in this case dfareporting#dimensionValue. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Determines how the 'value' field is matched when filtering. If not specified, defaults to EXACT. If set to WILDCARD_EXPRESSION, '&#42;' is allowed as a
    * placeholder for variable length character sequences, and it can be escaped with a backslash. Note, only paid search dimensions ('dfa:paidSearch&#42;')
    * allow a matchType other than EXACT.
    */
  var matchType: js.UndefOr[String] = js.undefined
  /** The value of the dimension. */
  var value: js.UndefOr[String] = js.undefined
}

object DimensionValue {
  @scala.inline
  def apply(
    dimensionName: String = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    matchType: String = null,
    value: String = null
  ): DimensionValue = {
    val __obj = js.Dynamic.literal()
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (matchType != null) __obj.updateDynamic("matchType")(matchType.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionValue]
  }
}

