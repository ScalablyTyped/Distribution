package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFacetOptions extends StObject {
  
  /**
    * Maximum number of facet buckets that should be returned for this facet. Defaults to 10. Maximum value is 100.
    */
  var numFacetBuckets: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * If object_type is set, only those objects of that type will be used to compute facets. If empty, then all objects will be used to compute facets.
    */
  var objectType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the operator chosen for faceting. @see cloudsearch.SchemaPropertyOptions
    */
  var operatorName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Source name to facet on. Format: datasources/{source_id\} If empty, all data sources will be used.
    */
  var sourceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaFacetOptions {
  
  inline def apply(): SchemaFacetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFacetOptions]
  }
  
  extension [Self <: SchemaFacetOptions](x: Self) {
    
    inline def setNumFacetBuckets(value: Double): Self = StObject.set(x, "numFacetBuckets", value.asInstanceOf[js.Any])
    
    inline def setNumFacetBucketsNull: Self = StObject.set(x, "numFacetBuckets", null)
    
    inline def setNumFacetBucketsUndefined: Self = StObject.set(x, "numFacetBuckets", js.undefined)
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeNull: Self = StObject.set(x, "objectType", null)
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    inline def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    inline def setOperatorNameNull: Self = StObject.set(x, "operatorName", null)
    
    inline def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
    
    inline def setSourceName(value: String): Self = StObject.set(x, "sourceName", value.asInstanceOf[js.Any])
    
    inline def setSourceNameNull: Self = StObject.set(x, "sourceName", null)
    
    inline def setSourceNameUndefined: Self = StObject.set(x, "sourceName", js.undefined)
  }
}
