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
  def apply(): SchemaFacetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFacetResult]
  }
  @scala.inline
  implicit class SchemaFacetResultOps[Self <: SchemaFacetResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucketsVarargs(value: SchemaFacetBucket*): Self = this.set("buckets", js.Array(value :_*))
    @scala.inline
    def setBuckets(value: js.Array[SchemaFacetBucket]): Self = this.set("buckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuckets: Self = this.set("buckets", js.undefined)
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectType: Self = this.set("objectType", js.undefined)
    @scala.inline
    def setOperatorName(value: String): Self = this.set("operatorName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatorName: Self = this.set("operatorName", js.undefined)
    @scala.inline
    def setSourceName(value: String): Self = this.set("sourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceName: Self = this.set("sourceName", js.undefined)
  }
  
}

