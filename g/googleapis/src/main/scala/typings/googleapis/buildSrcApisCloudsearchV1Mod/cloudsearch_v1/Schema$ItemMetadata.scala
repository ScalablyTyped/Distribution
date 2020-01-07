package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Available metadata fields for the item.
  */
@js.native
trait Schema$ItemMetadata extends js.Object {
  /**
    * The name of the container for this item. Deletion of the container item
    * leads to automatic deletion of this item.  Note: ACLs are not inherited
    * from a container item. To provide ACL inheritance for an item, use the
    * inheritAclFrom field. The maximum length is 1536 characters.
    */
  var containerName: js.UndefOr[String] = js.native
  /**
    * The BCP-47 language code for the item, such as &quot;en-US&quot; or
    * &quot;sr-Latn&quot;. For more information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. The
    * maximum length is 32 characters.
    */
  var contentLanguage: js.UndefOr[String] = js.native
  /**
    * The time when the item was created in the source repository.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Hashing value provided by the API caller. This can be used with the
    * items.push method to calculate modified state. The maximum length is 2048
    * characters.
    */
  var hash: js.UndefOr[String] = js.native
  /**
    * A list of interactions for the item.  Interactions are used to improve
    * Search quality, but are not exposed to end users. The maximum number of
    * elements is 1000.
    */
  var interactions: js.UndefOr[js.Array[Schema$Interaction]] = js.native
  /**
    * Additional keywords or phrases that should match the item. Used
    * internally for user generated content. The maximum number of elements is
    * 100. The maximum length is 8192 characters.
    */
  var keywords: js.UndefOr[js.Array[String]] = js.native
  /**
    * The original mime-type of ItemContent.content in the source repository.
    * The maximum length is 256 characters.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * The type of the item.  This should correspond to the name of an object
    * definition in the schema registered for the data source.  For example, if
    * the schema for the data source contains an object definition with name
    * &#39;document&#39;, then item indexing requests for objects of that type
    * should set objectType to &#39;document&#39;. The maximum length is 256
    * characters.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * Additional search quality metadata of the item
    */
  var searchQualityMetadata: js.UndefOr[Schema$SearchQualityMetadata] = js.native
  /**
    * Link to the source repository serving the data.  &amp;#83;earch results
    * apply this link to the title. The maximum length is 2048 characters.
    */
  var sourceRepositoryUrl: js.UndefOr[String] = js.native
  /**
    * The title of the item.  If given, this will be the displayed title of the
    * Search result. The maximum length is 2048 characters.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The time when the item was last modified in the source repository.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object Schema$ItemMetadata {
  @scala.inline
  def apply(
    containerName: String = null,
    contentLanguage: String = null,
    createTime: String = null,
    hash: String = null,
    interactions: js.Array[Schema$Interaction] = null,
    keywords: js.Array[String] = null,
    mimeType: String = null,
    objectType: String = null,
    searchQualityMetadata: Schema$SearchQualityMetadata = null,
    sourceRepositoryUrl: String = null,
    title: String = null,
    updateTime: String = null
  ): Schema$ItemMetadata = {
    val __obj = js.Dynamic.literal()
    if (containerName != null) __obj.updateDynamic("containerName")(containerName.asInstanceOf[js.Any])
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (interactions != null) __obj.updateDynamic("interactions")(interactions.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (searchQualityMetadata != null) __obj.updateDynamic("searchQualityMetadata")(searchQualityMetadata.asInstanceOf[js.Any])
    if (sourceRepositoryUrl != null) __obj.updateDynamic("sourceRepositoryUrl")(sourceRepositoryUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ItemMetadata]
  }
}

