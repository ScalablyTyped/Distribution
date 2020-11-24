package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the category hierarchy of a SKU.
  */
@js.native
trait SchemaCategory extends js.Object {
  
  /**
    * The type of product the SKU refers to. Example: &quot;Compute&quot;,
    * &quot;Storage&quot;, &quot;Network&quot;, &quot;ApplicationServices&quot;
    * etc.
    */
  var resourceFamily: js.UndefOr[String] = js.native
  
  /**
    * A group classification for related SKUs. Example: &quot;RAM&quot;,
    * &quot;GPU&quot;, &quot;Prediction&quot;, &quot;Ops&quot;,
    * &quot;GoogleEgress&quot; etc.
    */
  var resourceGroup: js.UndefOr[String] = js.native
  
  /**
    * The display name of the service this SKU belongs to.
    */
  var serviceDisplayName: js.UndefOr[String] = js.native
  
  /**
    * Represents how the SKU is consumed. Example: &quot;OnDemand&quot;,
    * &quot;Preemptible&quot;, &quot;Commit1Mo&quot;, &quot;Commit1Yr&quot;
    * etc.
    */
  var usageType: js.UndefOr[String] = js.native
}
object SchemaCategory {
  
  @scala.inline
  def apply(): SchemaCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCategory]
  }
  
  @scala.inline
  implicit class SchemaCategoryOps[Self <: SchemaCategory] (val x: Self) extends AnyVal {
    
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
    def setResourceFamily(value: String): Self = this.set("resourceFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceFamily: Self = this.set("resourceFamily", js.undefined)
    
    @scala.inline
    def setResourceGroup(value: String): Self = this.set("resourceGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceGroup: Self = this.set("resourceGroup", js.undefined)
    
    @scala.inline
    def setServiceDisplayName(value: String): Self = this.set("serviceDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceDisplayName: Self = this.set("serviceDisplayName", js.undefined)
    
    @scala.inline
    def setUsageType(value: String): Self = this.set("usageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsageType: Self = this.set("usageType", js.undefined)
  }
}
