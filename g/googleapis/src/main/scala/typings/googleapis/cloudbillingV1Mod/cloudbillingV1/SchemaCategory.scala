package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the category hierarchy of a SKU.
  */
trait SchemaCategory extends StObject {
  
  /**
    * The type of product the SKU refers to. Example: &quot;Compute&quot;,
    * &quot;Storage&quot;, &quot;Network&quot;, &quot;ApplicationServices&quot;
    * etc.
    */
  var resourceFamily: js.UndefOr[String] = js.undefined
  
  /**
    * A group classification for related SKUs. Example: &quot;RAM&quot;,
    * &quot;GPU&quot;, &quot;Prediction&quot;, &quot;Ops&quot;,
    * &quot;GoogleEgress&quot; etc.
    */
  var resourceGroup: js.UndefOr[String] = js.undefined
  
  /**
    * The display name of the service this SKU belongs to.
    */
  var serviceDisplayName: js.UndefOr[String] = js.undefined
  
  /**
    * Represents how the SKU is consumed. Example: &quot;OnDemand&quot;,
    * &quot;Preemptible&quot;, &quot;Commit1Mo&quot;, &quot;Commit1Yr&quot;
    * etc.
    */
  var usageType: js.UndefOr[String] = js.undefined
}
object SchemaCategory {
  
  inline def apply(): SchemaCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCategory]
  }
  
  extension [Self <: SchemaCategory](x: Self) {
    
    inline def setResourceFamily(value: String): Self = StObject.set(x, "resourceFamily", value.asInstanceOf[js.Any])
    
    inline def setResourceFamilyUndefined: Self = StObject.set(x, "resourceFamily", js.undefined)
    
    inline def setResourceGroup(value: String): Self = StObject.set(x, "resourceGroup", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupUndefined: Self = StObject.set(x, "resourceGroup", js.undefined)
    
    inline def setServiceDisplayName(value: String): Self = StObject.set(x, "serviceDisplayName", value.asInstanceOf[js.Any])
    
    inline def setServiceDisplayNameUndefined: Self = StObject.set(x, "serviceDisplayName", js.undefined)
    
    inline def setUsageType(value: String): Self = StObject.set(x, "usageType", value.asInstanceOf[js.Any])
    
    inline def setUsageTypeUndefined: Self = StObject.set(x, "usageType", js.undefined)
  }
}
