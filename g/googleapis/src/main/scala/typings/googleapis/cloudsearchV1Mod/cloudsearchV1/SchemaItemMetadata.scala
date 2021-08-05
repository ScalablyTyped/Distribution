package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available metadata fields for the item.
  */
trait SchemaItemMetadata extends StObject {
  
  /**
    * The name of the container for this item. Deletion of the container item
    * leads to automatic deletion of this item.  Note: ACLs are not inherited
    * from a container item. To provide ACL inheritance for an item, use the
    * inheritAclFrom field. The maximum length is 1536 characters.
    */
  var containerName: js.UndefOr[String] = js.undefined
  
  /**
    * The BCP-47 language code for the item, such as &quot;en-US&quot; or
    * &quot;sr-Latn&quot;. For more information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. The
    * maximum length is 32 characters.
    */
  var contentLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * The time when the item was created in the source repository.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Hashing value provided by the API caller. This can be used with the
    * items.push method to calculate modified state. The maximum length is 2048
    * characters.
    */
  var hash: js.UndefOr[String] = js.undefined
  
  /**
    * A list of interactions for the item.  Interactions are used to improve
    * Search quality, but are not exposed to end users. The maximum number of
    * elements is 1000.
    */
  var interactions: js.UndefOr[js.Array[SchemaInteraction]] = js.undefined
  
  /**
    * Additional keywords or phrases that should match the item. Used
    * internally for user generated content. The maximum number of elements is
    * 100. The maximum length is 8192 characters.
    */
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The original mime-type of ItemContent.content in the source repository.
    * The maximum length is 256 characters.
    */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the item.  This should correspond to the name of an object
    * definition in the schema registered for the data source.  For example, if
    * the schema for the data source contains an object definition with name
    * &#39;document&#39;, then item indexing requests for objects of that type
    * should set objectType to &#39;document&#39;. The maximum length is 256
    * characters.
    */
  var objectType: js.UndefOr[String] = js.undefined
  
  /**
    * Additional search quality metadata of the item
    */
  var searchQualityMetadata: js.UndefOr[SchemaSearchQualityMetadata] = js.undefined
  
  /**
    * Link to the source repository serving the data.  &amp;#83;earch results
    * apply this link to the title. The maximum length is 2048 characters.
    */
  var sourceRepositoryUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The title of the item.  If given, this will be the displayed title of the
    * Search result. The maximum length is 2048 characters.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The time when the item was last modified in the source repository.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}
object SchemaItemMetadata {
  
  inline def apply(): SchemaItemMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItemMetadata]
  }
  
  extension [Self <: SchemaItemMetadata](x: Self) {
    
    inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setInteractions(value: js.Array[SchemaInteraction]): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
    
    inline def setInteractionsUndefined: Self = StObject.set(x, "interactions", js.undefined)
    
    inline def setInteractionsVarargs(value: SchemaInteraction*): Self = StObject.set(x, "interactions", js.Array(value :_*))
    
    inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    inline def setSearchQualityMetadata(value: SchemaSearchQualityMetadata): Self = StObject.set(x, "searchQualityMetadata", value.asInstanceOf[js.Any])
    
    inline def setSearchQualityMetadataUndefined: Self = StObject.set(x, "searchQualityMetadata", js.undefined)
    
    inline def setSourceRepositoryUrl(value: String): Self = StObject.set(x, "sourceRepositoryUrl", value.asInstanceOf[js.Any])
    
    inline def setSourceRepositoryUrlUndefined: Self = StObject.set(x, "sourceRepositoryUrl", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
