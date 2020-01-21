package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Source specific facet response
  */
@js.native
trait SchemaFacetResult extends js.Object {
  /**
    * FacetBuckets for values in response containing at least a single result.
    */
  var buckets: js.UndefOr[js.Array[SchemaFacetBucket]] = js.native
  /**
    * Object type for which facet results are returned. Can be empty.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * Name of the operator chosen for faceting. @see cloudsearch.SchemaPropertyOptions
    */
  var operatorName: js.UndefOr[String] = js.native
  /**
    * Source name for which facet results are returned. Will not be empty.
    */
  var sourceName: js.UndefOr[String] = js.native
}

object SchemaFacetResult {
  @scala.inline
  def apply(
    buckets: js.Array[SchemaFacetBucket] = null,
    objectType: String = null,
    operatorName: String = null,
    sourceName: String = null
  ): SchemaFacetResult = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (operatorName != null) __obj.updateDynamic("operatorName")(operatorName.asInstanceOf[js.Any])
    if (sourceName != null) __obj.updateDynamic("sourceName")(sourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFacetResult]
  }
}

