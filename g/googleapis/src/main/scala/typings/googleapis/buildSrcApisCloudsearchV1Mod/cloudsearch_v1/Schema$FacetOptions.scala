package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies operators to return facet results for. There will be one
  * FacetResult for every source_name/object_type/operator_name combination.
  */
@js.native
trait Schema$FacetOptions extends js.Object {
  /**
    * Maximum number of facet buckets that should be returned for this facet.
    * Defaults to 10. Maximum value is 100.
    */
  var numFacetBuckets: js.UndefOr[Double] = js.native
  /**
    * If object_type is set, only those objects of that type will be used to
    * compute facets. If empty, then all objects will be used to compute
    * facets.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * Name of the operator chosen for faceting. @see cloudsearch.SchemaPropertyOptions
    */
  var operatorName: js.UndefOr[String] = js.native
  /**
    * Source name to facet on. Format: datasources/{source_id} If empty, all
    * data sources will be used.
    */
  var sourceName: js.UndefOr[String] = js.native
}

object Schema$FacetOptions {
  @scala.inline
  def apply(
    numFacetBuckets: Int | Double = null,
    objectType: String = null,
    operatorName: String = null,
    sourceName: String = null
  ): Schema$FacetOptions = {
    val __obj = js.Dynamic.literal()
    if (numFacetBuckets != null) __obj.updateDynamic("numFacetBuckets")(numFacetBuckets.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (operatorName != null) __obj.updateDynamic("operatorName")(operatorName.asInstanceOf[js.Any])
    if (sourceName != null) __obj.updateDynamic("sourceName")(sourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FacetOptions]
  }
}

