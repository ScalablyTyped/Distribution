package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a location entry.
  */
@js.native
trait Schema$UserLocation extends js.Object {
  /**
    * Textual location. This is most useful for display purposes to concisely
    * describe the location. For example, &quot;Mountain View, CA&quot;,
    * &quot;Near Seattle&quot;, &quot;US-NYC-9TH 9A209A&quot;.
    */
  var area: js.UndefOr[String] = js.native
  /**
    * Building Identifier.
    */
  var buildingId: js.UndefOr[String] = js.native
  /**
    * Custom Type.
    */
  var customType: js.UndefOr[String] = js.native
  /**
    * Most specific textual code of individual desk location.
    */
  var deskCode: js.UndefOr[String] = js.native
  /**
    * Floor name/number.
    */
  var floorName: js.UndefOr[String] = js.native
  /**
    * Floor section. More specific location within the floor. For example, if a
    * floor is divided into sections &quot;A&quot;, &quot;B&quot;, and
    * &quot;C&quot;, this field would identify one of those values.
    */
  var floorSection: js.UndefOr[String] = js.native
  /**
    * Each entry can have a type which indicates standard types of that entry.
    * For example location could be of types default and desk. In addition to
    * standard type, an entry can have a custom type and can give it any name.
    * Such types should have &quot;custom&quot; as type and also have a
    * customType value.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$UserLocation {
  @scala.inline
  def apply(
    area: String = null,
    buildingId: String = null,
    customType: String = null,
    deskCode: String = null,
    floorName: String = null,
    floorSection: String = null,
    `type`: String = null
  ): Schema$UserLocation = {
    val __obj = js.Dynamic.literal()
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (buildingId != null) __obj.updateDynamic("buildingId")(buildingId.asInstanceOf[js.Any])
    if (customType != null) __obj.updateDynamic("customType")(customType.asInstanceOf[js.Any])
    if (deskCode != null) __obj.updateDynamic("deskCode")(deskCode.asInstanceOf[js.Any])
    if (floorName != null) __obj.updateDynamic("floorName")(floorName.asInstanceOf[js.Any])
    if (floorSection != null) __obj.updateDynamic("floorSection")(floorSection.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserLocation]
  }
}

