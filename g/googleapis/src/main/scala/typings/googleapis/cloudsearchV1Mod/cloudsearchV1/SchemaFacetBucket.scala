package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A bucket in a facet is the basic unit of operation. A bucket can comprise
  * either a single value OR a contiguous range of values, depending on the
  * type of the field bucketed. FacetBucket is currently used only for
  * returning the response object.
  */
trait SchemaFacetBucket extends StObject {
  
  /**
    * Number of results that match the bucket value. Counts are only returned
    * for searches when count accuracy is ensured. Can be empty.
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * Percent of results that match the bucket value. This value is between
    * (0-100]. Percentages are returned for all searches, but are an estimate.
    * Because percentages are always returned, you should render percentages
    * instead of counts.
    */
  var percentage: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[SchemaValue] = js.undefined
}
object SchemaFacetBucket {
  
  @scala.inline
  def apply(): SchemaFacetBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFacetBucket]
  }
  
  @scala.inline
  implicit class SchemaFacetBucketMutableBuilder[Self <: SchemaFacetBucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
    
    @scala.inline
    def setValue(value: SchemaValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
