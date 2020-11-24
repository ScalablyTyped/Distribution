package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definition of a managed Google Play store cluster, a list of products
  * displayed as part of a store page.
  */
@js.native
trait SchemaStoreCluster extends js.Object {
  
  /**
    * Unique ID of this cluster. Assigned by the server. Immutable once
    * assigned.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#storeCluster&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Ordered list of localized strings giving the name of this page. The text
    * displayed is the one that best matches the user locale, or the first
    * entry if there is no good match. There needs to be at least one entry.
    */
  var name: js.UndefOr[js.Array[SchemaLocalizedText]] = js.native
  
  /**
    * String (US-ASCII only) used to determine order of this cluster within the
    * parent page&#39;s elements. Page elements are sorted in lexicographic
    * order of this field. Duplicated values are allowed, but ordering between
    * elements with duplicate order is undefined.  The value of this field is
    * never visible to a user, it is used solely for the purpose of defining an
    * ordering. Maximum length is 256 characters.
    */
  var orderInPage: js.UndefOr[String] = js.native
  
  /**
    * List of products in the order they are displayed in the cluster. There
    * should not be duplicates within a cluster.
    */
  var productId: js.UndefOr[js.Array[String]] = js.native
}
object SchemaStoreCluster {
  
  @scala.inline
  def apply(): SchemaStoreCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStoreCluster]
  }
  
  @scala.inline
  implicit class SchemaStoreClusterOps[Self <: SchemaStoreCluster] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: SchemaLocalizedText*): Self = this.set("name", js.Array(value :_*))
    
    @scala.inline
    def setName(value: js.Array[SchemaLocalizedText]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOrderInPage(value: String): Self = this.set("orderInPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderInPage: Self = this.set("orderInPage", js.undefined)
    
    @scala.inline
    def setProductIdVarargs(value: String*): Self = this.set("productId", js.Array(value :_*))
    
    @scala.inline
    def setProductId(value: js.Array[String]): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
  }
}
