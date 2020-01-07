package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ProductSet contains Products. A ProductSet can contain a maximum of 1
  * million reference images. If the limit is exceeded, periodic indexing will
  * fail.
  */
@js.native
trait Schema$ProductSet extends js.Object {
  /**
    * The user-provided name for this ProductSet. Must not be empty. Must be at
    * most 4096 characters long.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Output only. If there was an error with indexing the product set, the
    * field is populated.  This field is ignored when creating a ProductSet.
    */
  var indexError: js.UndefOr[Schema$Status] = js.native
  /**
    * Output only. The time at which this ProductSet was last indexed. Query
    * results will reflect all updates before this time. If this ProductSet has
    * never been indexed, this timestamp is the default value
    * &quot;1970-01-01T00:00:00Z&quot;.  This field is ignored when creating a
    * ProductSet.
    */
  var indexTime: js.UndefOr[String] = js.native
  /**
    * The resource name of the ProductSet.  Format is:
    * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`.  This
    * field is ignored when creating a ProductSet.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$ProductSet {
  @scala.inline
  def apply(
    displayName: String = null,
    indexError: Schema$Status = null,
    indexTime: String = null,
    name: String = null
  ): Schema$ProductSet = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (indexError != null) __obj.updateDynamic("indexError")(indexError.asInstanceOf[js.Any])
    if (indexTime != null) __obj.updateDynamic("indexTime")(indexTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProductSet]
  }
}

