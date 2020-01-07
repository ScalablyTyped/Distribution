package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a relation entry.
  */
@js.native
trait Schema$UserRelation extends js.Object {
  /**
    * Custom Type.
    */
  var customType: js.UndefOr[String] = js.native
  /**
    * The relation of the user. Some of the possible values are mother, father,
    * sister, brother, manager, assistant, partner.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The name of the relation.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$UserRelation {
  @scala.inline
  def apply(customType: String = null, `type`: String = null, value: String = null): Schema$UserRelation = {
    val __obj = js.Dynamic.literal()
    if (customType != null) __obj.updateDynamic("customType")(customType.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserRelation]
  }
}

