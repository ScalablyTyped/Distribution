package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a single object that is an item in the search index, such as a
  * file, folder, or a database record.
  */
@js.native
trait SchemaItem extends js.Object {
  /**
    * Access control list for this item.
    */
  var acl: js.UndefOr[SchemaItemAcl] = js.native
  /**
    * Item content to be indexed and made text searchable.
    */
  var content: js.UndefOr[SchemaItemContent] = js.native
  /**
    * Type for this item.
    */
  var itemType: js.UndefOr[String] = js.native
  /**
    * Metadata information.
    */
  var metadata: js.UndefOr[SchemaItemMetadata] = js.native
  /**
    * Name of the Item. Format: datasources/{source_id}/items/{item_id} &lt;br
    * /&gt;This is a required field. The maximum length is 1536 characters.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Additional state connector can store for this item. The maximum length is
    * 10000 bytes.
    */
  var payload: js.UndefOr[String] = js.native
  /**
    * Queue this item belongs to. The maximum length is 100 characters.
    */
  var queue: js.UndefOr[String] = js.native
  /**
    * Status of the item. Output only field.
    */
  var status: js.UndefOr[SchemaItemStatus] = js.native
  /**
    * The structured data for the item that should conform to a registered
    * object definition in the schema for the data source.
    */
  var structuredData: js.UndefOr[SchemaItemStructuredData] = js.native
  /**
    * Required. The indexing system stores the version from the datasource as a
    * byte string and compares the Item version in the index to the version of
    * the queued Item using lexical ordering. &lt;br /&gt;&lt;br /&gt; Cloud
    * Search Indexing won&#39;t index or delete any queued item with a version
    * value that is less than or equal to the version of the currently indexed
    * item. The maximum length for this field is 1024 bytes.
    */
  var version: js.UndefOr[String] = js.native
}

object SchemaItem {
  @scala.inline
  def apply(): SchemaItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItem]
  }
  @scala.inline
  implicit class SchemaItemOps[Self <: SchemaItem] (val x: Self) extends AnyVal {
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
    def setAcl(value: SchemaItemAcl): Self = this.set("acl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcl: Self = this.set("acl", js.undefined)
    @scala.inline
    def setContent(value: SchemaItemContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setItemType(value: String): Self = this.set("itemType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemType: Self = this.set("itemType", js.undefined)
    @scala.inline
    def setMetadata(value: SchemaItemMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setQueue(value: String): Self = this.set("queue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueue: Self = this.set("queue", js.undefined)
    @scala.inline
    def setStatus(value: SchemaItemStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStructuredData(value: SchemaItemStructuredData): Self = this.set("structuredData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStructuredData: Self = this.set("structuredData", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

