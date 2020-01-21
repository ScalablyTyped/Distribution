package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access control list information for the item. For more information see
  * https://developers.google.com/cloud-search/docs/guides/index-your-data#acls
  */
@js.native
trait SchemaItemAcl extends js.Object {
  /**
    * Sets the type of access rules to apply when an item inherits its ACL from
    * a parent. This should always be set in tandem with the inheritAclFrom
    * field. Also, when the inheritAclFrom field is set, this field should be
    * set to a valid AclInheritanceType.
    */
  var aclInheritanceType: js.UndefOr[String] = js.native
  /**
    * List of principals who are explicitly denied access to the item in search
    * results. While principals are denied access by default, use denied
    * readers to handle exceptions and override the list allowed readers. The
    * maximum number of elements is 100.
    */
  var deniedReaders: js.UndefOr[js.Array[SchemaPrincipal]] = js.native
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
  var inheritAclFrom: js.UndefOr[String] = js.native
  /**
    * Optional. List of owners for the item. This field has no bearing on
    * document access permissions. It does, however, offer a slight ranking
    * boosts items where the querying user is an owner. The maximum number of
    * elements is 5.
    */
  var owners: js.UndefOr[js.Array[SchemaPrincipal]] = js.native
  /**
    * List of principals who are allowed to see the item in search results.
    * Optional if inheriting permissions from another item or if the item is
    * not intended to be visible, such as virtual containers. The maximum
    * number of elements is 1000.
    */
  var readers: js.UndefOr[js.Array[SchemaPrincipal]] = js.native
}

object SchemaItemAcl {
  @scala.inline
  def apply(
    aclInheritanceType: String = null,
    deniedReaders: js.Array[SchemaPrincipal] = null,
    inheritAclFrom: String = null,
    owners: js.Array[SchemaPrincipal] = null,
    readers: js.Array[SchemaPrincipal] = null
  ): SchemaItemAcl = {
    val __obj = js.Dynamic.literal()
    if (aclInheritanceType != null) __obj.updateDynamic("aclInheritanceType")(aclInheritanceType.asInstanceOf[js.Any])
    if (deniedReaders != null) __obj.updateDynamic("deniedReaders")(deniedReaders.asInstanceOf[js.Any])
    if (inheritAclFrom != null) __obj.updateDynamic("inheritAclFrom")(inheritAclFrom.asInstanceOf[js.Any])
    if (owners != null) __obj.updateDynamic("owners")(owners.asInstanceOf[js.Any])
    if (readers != null) __obj.updateDynamic("readers")(readers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaItemAcl]
  }
}

