package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access control list information for the item. For more information see
  * https://developers.google.com/cloud-search/docs/guides/index-your-data#acls
  */
trait SchemaItemAcl extends StObject {
  
  /**
    * Sets the type of access rules to apply when an item inherits its ACL from
    * a parent. This should always be set in tandem with the inheritAclFrom
    * field. Also, when the inheritAclFrom field is set, this field should be
    * set to a valid AclInheritanceType.
    */
  var aclInheritanceType: js.UndefOr[String] = js.undefined
  
  /**
    * List of principals who are explicitly denied access to the item in search
    * results. While principals are denied access by default, use denied
    * readers to handle exceptions and override the list allowed readers. The
    * maximum number of elements is 100.
    */
  var deniedReaders: js.UndefOr[js.Array[SchemaPrincipal]] = js.undefined
  
  /**
    * Name of the item to inherit the Access Permission List (ACL) from. Note:
    * ACL inheritance *only* provides access permissions to child items and
    * does not define structural relationships, nor does it provide convenient
    * ways to delete large groups of items. Deleting an ACL parent from the
    * index only alters the access permissions of child items that reference
    * the parent in the inheritAclFrom field. The item is still in the index,
    * but may not visible in search results. By contrast, deletion of a
    * container item also deletes all items that reference the container via
    * the containerName field. The maximum length for this field is 1536
    * characters.
    */
  var inheritAclFrom: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. List of owners for the item. This field has no bearing on
    * document access permissions. It does, however, offer a slight ranking
    * boosts items where the querying user is an owner. The maximum number of
    * elements is 5.
    */
  var owners: js.UndefOr[js.Array[SchemaPrincipal]] = js.undefined
  
  /**
    * List of principals who are allowed to see the item in search results.
    * Optional if inheriting permissions from another item or if the item is
    * not intended to be visible, such as virtual containers. The maximum
    * number of elements is 1000.
    */
  var readers: js.UndefOr[js.Array[SchemaPrincipal]] = js.undefined
}
object SchemaItemAcl {
  
  @scala.inline
  def apply(): SchemaItemAcl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItemAcl]
  }
  
  @scala.inline
  implicit class SchemaItemAclMutableBuilder[Self <: SchemaItemAcl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAclInheritanceType(value: String): Self = StObject.set(x, "aclInheritanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAclInheritanceTypeUndefined: Self = StObject.set(x, "aclInheritanceType", js.undefined)
    
    @scala.inline
    def setDeniedReaders(value: js.Array[SchemaPrincipal]): Self = StObject.set(x, "deniedReaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeniedReadersUndefined: Self = StObject.set(x, "deniedReaders", js.undefined)
    
    @scala.inline
    def setDeniedReadersVarargs(value: SchemaPrincipal*): Self = StObject.set(x, "deniedReaders", js.Array(value :_*))
    
    @scala.inline
    def setInheritAclFrom(value: String): Self = StObject.set(x, "inheritAclFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritAclFromUndefined: Self = StObject.set(x, "inheritAclFrom", js.undefined)
    
    @scala.inline
    def setOwners(value: js.Array[SchemaPrincipal]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
    
    @scala.inline
    def setOwnersVarargs(value: SchemaPrincipal*): Self = StObject.set(x, "owners", js.Array(value :_*))
    
    @scala.inline
    def setReaders(value: js.Array[SchemaPrincipal]): Self = StObject.set(x, "readers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadersUndefined: Self = StObject.set(x, "readers", js.undefined)
    
    @scala.inline
    def setReadersVarargs(value: SchemaPrincipal*): Self = StObject.set(x, "readers", js.Array(value :_*))
  }
}
