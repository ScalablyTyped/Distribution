package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a DimensionValue resource.
  */
@js.native
trait Schema$DimensionValue extends js.Object {
  /**
    * The name of the dimension.
    */
  var dimensionName: js.UndefOr[String] = js.native
  /**
    * The eTag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID associated with the value if available.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of resource this is, in this case dfareporting#dimensionValue.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Determines how the &#39;value&#39; field is matched when filtering. If
    * not specified, defaults to EXACT. If set to WILDCARD_EXPRESSION,
    * &#39;*&#39; is allowed as a placeholder for variable length character
    * sequences, and it can be escaped with a backslash. Note, only paid search
    * dimensions (&#39;dfa:paidSearch*&#39;) allow a matchType other than
    * EXACT.
    */
  var matchType: js.UndefOr[String] = js.native
  /**
    * The value of the dimension.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$DimensionValue {
  @scala.inline
  def apply(
    dimensionName: String = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    matchType: String = null,
    value: String = null
  ): Schema$DimensionValue = {
    val __obj = js.Dynamic.literal()
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (matchType != null) __obj.updateDynamic("matchType")(matchType.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DimensionValue]
  }
}

