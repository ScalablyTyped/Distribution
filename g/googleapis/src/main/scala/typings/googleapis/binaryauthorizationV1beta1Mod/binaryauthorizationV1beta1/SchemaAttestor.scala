package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An attestor that attests to container image artifacts. An existing attestor
  * cannot be modified except where indicated.
  */
@js.native
trait SchemaAttestor extends js.Object {
  
  /**
    * Optional. A descriptive comment.  This field may be updated. The field
    * may be displayed in chooser dialogs.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Required. The resource name, in the format: `projects/x/attestors/x. This
    * field may not be updated.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. Time when the attestor was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
  
  /**
    * A Drydock ATTESTATION_AUTHORITY Note, created by the user.
    */
  var userOwnedDrydockNote: js.UndefOr[SchemaUserOwnedDrydockNote] = js.native
}
object SchemaAttestor {
  
  @scala.inline
  def apply(): SchemaAttestor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttestor]
  }
  
  @scala.inline
  implicit class SchemaAttestorOps[Self <: SchemaAttestor] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    
    @scala.inline
    def setUserOwnedDrydockNote(value: SchemaUserOwnedDrydockNote): Self = this.set("userOwnedDrydockNote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserOwnedDrydockNote: Self = this.set("userOwnedDrydockNote", js.undefined)
  }
}
