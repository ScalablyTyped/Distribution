package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An attestor that attests to container image artifacts. An existing attestor
  * cannot be modified except where indicated.
  */
trait SchemaAttestor extends StObject {
  
  /**
    * Optional. A descriptive comment.  This field may be updated. The field
    * may be displayed in chooser dialogs.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name, in the format: `projects/x/attestors/x. This
    * field may not be updated.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Time when the attestor was last updated.
    */
  var updateTime: js.UndefOr[String] = js.undefined
  
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
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUserOwnedDrydockNote(value: SchemaUserOwnedDrydockNote): Self = StObject.set(x, "userOwnedDrydockNote", value.asInstanceOf[js.Any])
    
    inline def setUserOwnedDrydockNoteUndefined: Self = StObject.set(x, "userOwnedDrydockNote", js.undefined)
  }
}
