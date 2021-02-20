package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies operators to return facet results for. There will be one
  * FacetResult for every source_name/object_type/operator_name combination.
  */
@js.native
trait SchemaFacetOptions extends StObject {
  
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
object SchemaFacetOptions {
  
  @scala.inline
  def apply(): SchemaFacetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFacetOptions]
  }
  
  @scala.inline
  implicit class SchemaFacetOptionsMutableBuilder[Self <: SchemaFacetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumFacetBuckets(value: Double): Self = StObject.set(x, "numFacetBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumFacetBucketsUndefined: Self = StObject.set(x, "numFacetBuckets", js.undefined)
    
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
