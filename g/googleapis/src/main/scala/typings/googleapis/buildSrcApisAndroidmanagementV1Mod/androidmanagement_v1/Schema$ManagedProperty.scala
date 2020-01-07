package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Managed property.
  */
@js.native
trait Schema$ManagedProperty extends js.Object {
  /**
    * The default value of the property. BUNDLE_ARRAY properties don&#39;t have
    * a default value.
    */
  var defaultValue: js.UndefOr[js.Any] = js.native
  /**
    * A longer description of the property, providing more detail of what it
    * affects. Localized.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * For CHOICE or MULTISELECT properties, the list of possible entries.
    */
  var entries: js.UndefOr[js.Array[Schema$ManagedPropertyEntry]] = js.native
  /**
    * The unique key that the app uses to identify the property, e.g.
    * &quot;com.google.android.gm.fieldname&quot;.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * For BUNDLE_ARRAY properties, the list of nested properties. A
    * BUNDLE_ARRAY property is at most two levels deep.
    */
  var nestedProperties: js.UndefOr[js.Array[Schema$ManagedProperty]] = js.native
  /**
    * The name of the property. Localized.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The type of the property.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$ManagedProperty {
  @scala.inline
  def apply(
    defaultValue: js.Any = null,
    description: String = null,
    entries: js.Array[Schema$ManagedPropertyEntry] = null,
    key: String = null,
    nestedProperties: js.Array[Schema$ManagedProperty] = null,
    title: String = null,
    `type`: String = null
  ): Schema$ManagedProperty = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nestedProperties != null) __obj.updateDynamic("nestedProperties")(nestedProperties.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ManagedProperty]
  }
}

