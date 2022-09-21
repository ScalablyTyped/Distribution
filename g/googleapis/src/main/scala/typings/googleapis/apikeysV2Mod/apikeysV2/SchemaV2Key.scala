package typings.googleapis.apikeysV2Mod.apikeysV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV2Key extends StObject {
  
  /**
    * Annotations is an unstructured key-value map stored with a policy that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects.
    */
  var annotations: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. A timestamp identifying the time this key was originally created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A timestamp when this key was deleted. If the resource is not deleted, this must be empty.
    */
  var deleteTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Human-readable display name of this key that you can modify. The maximum length is 63 characters.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A checksum computed by the server based on the current value of the Key resource. This may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding. See https://google.aip.dev/154.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. An encrypted and signed value held by this key. This field can be accessed only through the `GetKeyString` method.
    */
  var keyString: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name of the key. The `name` has the form: `projects//locations/global/keys/`. For example: `projects/123456867718/locations/global/keys/b7ff1f9f-8275-410a-94dd-3855ee9b5dd2` NOTE: Key is a global resource; hence the only supported value for location is `global`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Key restrictions.
    */
  var restrictions: js.UndefOr[SchemaV2Restrictions] = js.undefined
  
  /**
    * Output only. Unique id in UUID4 format.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A timestamp identifying the time this key was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaV2Key {
  
  inline def apply(): SchemaV2Key = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV2Key]
  }
  
  extension [Self <: SchemaV2Key](x: Self) {
    
    inline def setAnnotations(value: StringDictionary[String]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsNull: Self = StObject.set(x, "annotations", null)
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeleteTime(value: String): Self = StObject.set(x, "deleteTime", value.asInstanceOf[js.Any])
    
    inline def setDeleteTimeNull: Self = StObject.set(x, "deleteTime", null)
    
    inline def setDeleteTimeUndefined: Self = StObject.set(x, "deleteTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKeyString(value: String): Self = StObject.set(x, "keyString", value.asInstanceOf[js.Any])
    
    inline def setKeyStringNull: Self = StObject.set(x, "keyString", null)
    
    inline def setKeyStringUndefined: Self = StObject.set(x, "keyString", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRestrictions(value: SchemaV2Restrictions): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
