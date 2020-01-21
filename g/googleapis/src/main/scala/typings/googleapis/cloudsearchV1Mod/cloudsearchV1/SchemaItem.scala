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
  def apply(
    acl: SchemaItemAcl = null,
    content: SchemaItemContent = null,
    itemType: String = null,
    metadata: SchemaItemMetadata = null,
    name: String = null,
    payload: String = null,
    queue: String = null,
    status: SchemaItemStatus = null,
    structuredData: SchemaItemStructuredData = null,
    version: String = null
  ): SchemaItem = {
    val __obj = js.Dynamic.literal()
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (queue != null) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (structuredData != null) __obj.updateDynamic("structuredData")(structuredData.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaItem]
  }
}

