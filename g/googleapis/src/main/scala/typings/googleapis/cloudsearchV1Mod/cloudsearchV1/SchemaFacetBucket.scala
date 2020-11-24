package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A bucket in a facet is the basic unit of operation. A bucket can comprise
  * either a single value OR a contiguous range of values, depending on the
  * type of the field bucketed. FacetBucket is currently used only for
  * returning the response object.
  */
@js.native
trait SchemaFacetBucket extends js.Object {
  
  /**
    * Number of results that match the bucket value. Counts are only returned
    * for searches when count accuracy is ensured. Can be empty.
    */
  var count: js.UndefOr[Double] = js.native
  
  /**
    * Percent of results that match the bucket value. This value is between
    * (0-100]. Percentages are returned for all searches, but are an estimate.
    * Because percentages are always returned, you should render percentages
    * instead of counts.
    */
  var percentage: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[SchemaValue] = js.native
}
object SchemaFacetBucket {
  
  @scala.inline
  def apply(): SchemaFacetBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFacetBucket]
  }
  
  @scala.inline
  implicit class SchemaFacetBucketOps[Self <: SchemaFacetBucket] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setPercentage(value: Double): Self = this.set("percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentage: Self = this.set("percentage", js.undefined)
    
    @scala.inline
    def setValue(value: SchemaValue): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
