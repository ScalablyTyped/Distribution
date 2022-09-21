package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAttestor extends StObject {
  
  /**
    * Optional. A descriptive comment. This field may be updated. The field may be displayed in chooser dialogs.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A checksum, returned by the server, that can be sent on update requests to ensure the attestor has an up-to-date value before attempting to update it. See https://google.aip.dev/154.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The resource name, in the format: `projects/x/attestors/x`. This field may not be updated.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Time when the attestor was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A Drydock ATTESTATION_AUTHORITY Note, created by the user.
    */
  var userOwnedDrydockNote: js.UndefOr[SchemaUserOwnedDrydockNote] = js.undefined
}
object SchemaAttestor {
  
  inline def apply(): SchemaAttestor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttestor]
  }
  
  extension [Self <: SchemaAttestor](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUserOwnedDrydockNote(value: SchemaUserOwnedDrydockNote): Self = StObject.set(x, "userOwnedDrydockNote", value.asInstanceOf[js.Any])
    
    inline def setUserOwnedDrydockNoteUndefined: Self = StObject.set(x, "userOwnedDrydockNote", js.undefined)
  }
}
