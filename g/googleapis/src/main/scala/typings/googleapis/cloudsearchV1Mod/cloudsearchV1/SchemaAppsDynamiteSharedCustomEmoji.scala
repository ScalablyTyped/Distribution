package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedCustomEmoji extends StObject {
  
  /**
    * ID for the underlying image data in Blobstore. This field should *only* be present in Spanner or within the server, but should not be exposed in public APIs.
    */
  var blobId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Content type of the file used to upload the emoji. Used for takeout. Written to Spanner when the emoji is created.
    */
  var contentType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time when the Emoji was created, in microseconds. This field may be present in Spanner, within the server, or in public APIs.
    */
  var createTimeMicros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field should *never* be persisted to Spanner.
    */
  var creatorUserId: js.UndefOr[SchemaUserId] = js.undefined
  
  /**
    * Time when the emoji was deleted, in microseconds. This field may be present in Spanner, within the server, or in public APIs. Only present if the emoji has been deleted.
    */
  var deleteTimeMicros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A short-lived URL clients can use for directly accessing a custom emoji image. This field is intended for API consumption, and should *never* be persisted to Spanner.
    */
  var ephemeralUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field should *never* be persisted to Spanner.
    */
  var ownerCustomerId: js.UndefOr[SchemaCustomerId] = js.undefined
  
  /**
    * Opaque token that clients use to construct the URL for accessing the custom emoji’s image data. This field is intended for API consumption, and should *never* be persisted to Spanner.
    */
  var readToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User-provided, human-readable ID for the custom emoji. Users are expected to observe this field in the UI instead of the UUID. This shortcode should be unique within an organization, but has no global uniqueness guarantees, unlike the UUID. This field should *never* be persisted to Spanner.
    */
  var shortcode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Snapshot of the current state of the emoji, which may differ from the source-of-truth in the CustomEmojis table. This field should *never* be persisted to Spanner.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  var updateTimeMicros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique key for a custom emoji resource. Required. This field is *always* populated.
    */
  var uuid: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedCustomEmoji {
  
  inline def apply(): SchemaAppsDynamiteSharedCustomEmoji = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedCustomEmoji]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedCustomEmoji](x: Self) {
    
    inline def setBlobId(value: String): Self = StObject.set(x, "blobId", value.asInstanceOf[js.Any])
    
    inline def setBlobIdNull: Self = StObject.set(x, "blobId", null)
    
    inline def setBlobIdUndefined: Self = StObject.set(x, "blobId", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCreateTimeMicros(value: String): Self = StObject.set(x, "createTimeMicros", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeMicrosNull: Self = StObject.set(x, "createTimeMicros", null)
    
    inline def setCreateTimeMicrosUndefined: Self = StObject.set(x, "createTimeMicros", js.undefined)
    
    inline def setCreatorUserId(value: SchemaUserId): Self = StObject.set(x, "creatorUserId", value.asInstanceOf[js.Any])
    
    inline def setCreatorUserIdUndefined: Self = StObject.set(x, "creatorUserId", js.undefined)
    
    inline def setDeleteTimeMicros(value: String): Self = StObject.set(x, "deleteTimeMicros", value.asInstanceOf[js.Any])
    
    inline def setDeleteTimeMicrosNull: Self = StObject.set(x, "deleteTimeMicros", null)
    
    inline def setDeleteTimeMicrosUndefined: Self = StObject.set(x, "deleteTimeMicros", js.undefined)
    
    inline def setEphemeralUrl(value: String): Self = StObject.set(x, "ephemeralUrl", value.asInstanceOf[js.Any])
    
    inline def setEphemeralUrlNull: Self = StObject.set(x, "ephemeralUrl", null)
    
    inline def setEphemeralUrlUndefined: Self = StObject.set(x, "ephemeralUrl", js.undefined)
    
    inline def setOwnerCustomerId(value: SchemaCustomerId): Self = StObject.set(x, "ownerCustomerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerCustomerIdUndefined: Self = StObject.set(x, "ownerCustomerId", js.undefined)
    
    inline def setReadToken(value: String): Self = StObject.set(x, "readToken", value.asInstanceOf[js.Any])
    
    inline def setReadTokenNull: Self = StObject.set(x, "readToken", null)
    
    inline def setReadTokenUndefined: Self = StObject.set(x, "readToken", js.undefined)
    
    inline def setShortcode(value: String): Self = StObject.set(x, "shortcode", value.asInstanceOf[js.Any])
    
    inline def setShortcodeNull: Self = StObject.set(x, "shortcode", null)
    
    inline def setShortcodeUndefined: Self = StObject.set(x, "shortcode", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTimeMicros(value: String): Self = StObject.set(x, "updateTimeMicros", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeMicrosNull: Self = StObject.set(x, "updateTimeMicros", null)
    
    inline def setUpdateTimeMicrosUndefined: Self = StObject.set(x, "updateTimeMicros", js.undefined)
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidNull: Self = StObject.set(x, "uuid", null)
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
