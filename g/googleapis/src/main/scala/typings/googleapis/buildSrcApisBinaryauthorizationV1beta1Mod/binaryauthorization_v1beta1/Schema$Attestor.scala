package typings.googleapis.buildSrcApisBinaryauthorizationV1beta1Mod.binaryauthorization_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An attestor that attests to container image artifacts. An existing attestor
  * cannot be modified except where indicated.
  */
@js.native
trait Schema$Attestor extends js.Object {
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
  var userOwnedDrydockNote: js.UndefOr[Schema$UserOwnedDrydockNote] = js.native
}

object Schema$Attestor {
  @scala.inline
  def apply(
    description: String = null,
    name: String = null,
    updateTime: String = null,
    userOwnedDrydockNote: Schema$UserOwnedDrydockNote = null
  ): Schema$Attestor = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (userOwnedDrydockNote != null) __obj.updateDynamic("userOwnedDrydockNote")(userOwnedDrydockNote.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Attestor]
  }
}

