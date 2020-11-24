package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available metadata fields for the item.
  */
@js.native
trait SchemaItemMetadata extends js.Object {
  
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
  var interactions: js.UndefOr[js.Array[SchemaInteraction]] = js.native
  
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
  var searchQualityMetadata: js.UndefOr[SchemaSearchQualityMetadata] = js.native
  
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
object SchemaItemMetadata {
  
  @scala.inline
  def apply(): SchemaItemMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItemMetadata]
  }
  
  @scala.inline
  implicit class SchemaItemMetadataOps[Self <: SchemaItemMetadata] (val x: Self) extends AnyVal {
    
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
    def setContainerName(value: String): Self = this.set("containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerName: Self = this.set("containerName", js.undefined)
    
    @scala.inline
    def setContentLanguage(value: String): Self = this.set("contentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentLanguage: Self = this.set("contentLanguage", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setInteractionsVarargs(value: SchemaInteraction*): Self = this.set("interactions", js.Array(value :_*))
    
    @scala.inline
    def setInteractions(value: js.Array[SchemaInteraction]): Self = this.set("interactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractions: Self = this.set("interactions", js.undefined)
    
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = this.set("keywords", js.Array(value :_*))
    
    @scala.inline
    def setKeywords(value: js.Array[String]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectType: Self = this.set("objectType", js.undefined)
    
    @scala.inline
    def setSearchQualityMetadata(value: SchemaSearchQualityMetadata): Self = this.set("searchQualityMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchQualityMetadata: Self = this.set("searchQualityMetadata", js.undefined)
    
    @scala.inline
    def setSourceRepositoryUrl(value: String): Self = this.set("sourceRepositoryUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceRepositoryUrl: Self = this.set("sourceRepositoryUrl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
