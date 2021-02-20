package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.AdminLicenseManager.Collection.LicenseAssignmentsCollection
import typings.googleAppsScript.GoogleAppsScript.AdminLicenseManager.Schema.LicenseAssignment
import typings.googleAppsScript.GoogleAppsScript.AdminLicenseManager.Schema.LicenseAssignmentInsert
import typings.googleAppsScript.GoogleAppsScript.AdminLicenseManager.Schema.LicenseAssignmentList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminLicenseManager extends StObject {
  
  var LicenseAssignments: js.UndefOr[LicenseAssignmentsCollection] = js.native
  
  // Create a new instance of LicenseAssignment
  def newLicenseAssignment(): LicenseAssignment = js.native
  
  // Create a new instance of LicenseAssignmentInsert
  def newLicenseAssignmentInsert(): LicenseAssignmentInsert = js.native
}
object AdminLicenseManager {
  
  @scala.inline
  def apply(
    newLicenseAssignment: () => LicenseAssignment,
    newLicenseAssignmentInsert: () => LicenseAssignmentInsert
  ): AdminLicenseManager = {
    val __obj = js.Dynamic.literal(newLicenseAssignment = js.Any.fromFunction0(newLicenseAssignment), newLicenseAssignmentInsert = js.Any.fromFunction0(newLicenseAssignmentInsert))
    __obj.asInstanceOf[AdminLicenseManager]
  }
  
  @scala.inline
  implicit class AdminLicenseManagerMutableBuilder[Self <: AdminLicenseManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLicenseAssignments(value: LicenseAssignmentsCollection): Self = StObject.set(x, "LicenseAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseAssignmentsUndefined: Self = StObject.set(x, "LicenseAssignments", js.undefined)
    
    @scala.inline
    def setNewLicenseAssignment(value: () => LicenseAssignment): Self = StObject.set(x, "newLicenseAssignment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewLicenseAssignmentInsert(value: () => LicenseAssignmentInsert): Self = StObject.set(x, "newLicenseAssignmentInsert", js.Any.fromFunction0(value))
  }
  
  object Collection {
    
    @js.native
    trait LicenseAssignmentsCollection extends StObject {
      
      // Get license assignment of a particular product and sku for a user
      def get(productId: String, skuId: String, userId: String): LicenseAssignment = js.native
      
      // Assign License.
      def insert(resource: LicenseAssignmentInsert, productId: String, skuId: String): LicenseAssignment = js.native
      
      // List license assignments for given product of the customer.
      def listForProduct(productId: String, customerId: String): LicenseAssignmentList = js.native
      // List license assignments for given product of the customer.
      def listForProduct(productId: String, customerId: String, optionalArgs: js.Object): LicenseAssignmentList = js.native
      
      // List license assignments for given product and sku of the customer.
      def listForProductAndSku(productId: String, skuId: String, customerId: String): LicenseAssignmentList = js.native
      // List license assignments for given product and sku of the customer.
      def listForProductAndSku(productId: String, skuId: String, customerId: String, optionalArgs: js.Object): LicenseAssignmentList = js.native
      
      // Assign License. This method supports patch semantics.
      def patch(resource: LicenseAssignment, productId: String, skuId: String, userId: String): LicenseAssignment = js.native
      
      // Revoke License.
      def remove(productId: String, skuId: String, userId: String): Unit = js.native
      
      // Assign License.
      def update(resource: LicenseAssignment, productId: String, skuId: String, userId: String): LicenseAssignment = js.native
    }
  }
  
  object Schema {
    
    @js.native
    trait LicenseAssignment extends StObject {
      
      var etags: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var productId: js.UndefOr[String] = js.native
      
      var productName: js.UndefOr[String] = js.native
      
      var selfLink: js.UndefOr[String] = js.native
      
      var skuId: js.UndefOr[String] = js.native
      
      var skuName: js.UndefOr[String] = js.native
      
      var userId: js.UndefOr[String] = js.native
    }
    object LicenseAssignment {
      
      @scala.inline
      def apply(): LicenseAssignment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LicenseAssignment]
      }
      
      @scala.inline
      implicit class LicenseAssignmentMutableBuilder[Self <: LicenseAssignment] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEtags(value: String): Self = StObject.set(x, "etags", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagsUndefined: Self = StObject.set(x, "etags", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
        
        @scala.inline
        def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
        
        @scala.inline
        def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
        
        @scala.inline
        def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
        
        @scala.inline
        def setSkuName(value: String): Self = StObject.set(x, "skuName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkuNameUndefined: Self = StObject.set(x, "skuName", js.undefined)
        
        @scala.inline
        def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    @js.native
    trait LicenseAssignmentInsert extends StObject {
      
      var userId: js.UndefOr[String] = js.native
    }
    object LicenseAssignmentInsert {
      
      @scala.inline
      def apply(): LicenseAssignmentInsert = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LicenseAssignmentInsert]
      }
      
      @scala.inline
      implicit class LicenseAssignmentInsertMutableBuilder[Self <: LicenseAssignmentInsert] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    @js.native
    trait LicenseAssignmentList extends StObject {
      
      var etag: js.UndefOr[String] = js.native
      
      var items: js.UndefOr[js.Array[LicenseAssignment]] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
    }
    object LicenseAssignmentList {
      
      @scala.inline
      def apply(): LicenseAssignmentList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LicenseAssignmentList]
      }
      
      @scala.inline
      implicit class LicenseAssignmentListMutableBuilder[Self <: LicenseAssignmentList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setItems(value: js.Array[LicenseAssignment]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: LicenseAssignment*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
  }
}
