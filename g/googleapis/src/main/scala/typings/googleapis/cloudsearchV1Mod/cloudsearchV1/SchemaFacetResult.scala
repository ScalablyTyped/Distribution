package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Source specific facet response
  */
@js.native
trait SchemaFacetResult extends StObject {
  
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
  implicit class SchemaFacetResultMutableBuilder[Self <: SchemaFacetResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuckets(value: js.Array[SchemaFacetBucket]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    @scala.inline
    def setBucketsVarargs(value: SchemaFacetBucket*): Self = StObject.set(x, "buckets", js.Array(value :_*))
    
    @scala.inline
    def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    @scala.inline
    def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
    
    @scala.inline
    def setSourceName(value: String): Self = StObject.set(x, "sourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNameUndefined: Self = StObject.set(x, "sourceName", js.undefined)
  }
}
