package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedProperty extends js.Object {
  /** The default value of the properties. BUNDLE_ARRAY properties never have a default value. */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  /** A longer description of the property, giving more detail of what it affects. Localized. */
  var description: js.UndefOr[String] = js.undefined
  /** For CHOICE or MULTISELECT properties, the list of possible entries. */
  var entries: js.UndefOr[js.Array[ManagedPropertyEntry]] = js.undefined
  /** The unique key that the application uses to identify the property, e.g. "com.google.android.gm.fieldname". */
  var key: js.UndefOr[String] = js.undefined
  /** For BUNDLE_ARRAY properties, the list of nested properties. A BUNDLE_ARRAY property is at most two levels deep. */
  var nestedProperties: js.UndefOr[js.Array[ManagedProperty]] = js.undefined
  /** The name of the property. Localized. */
  var title: js.UndefOr[String] = js.undefined
  /** The type of the property. */
  var `type`: js.UndefOr[String] = js.undefined
}

object ManagedProperty {
  @scala.inline
  def apply(
    defaultValue: js.Any = null,
    description: String = null,
    entries: js.Array[ManagedPropertyEntry] = null,
    key: String = null,
    nestedProperties: js.Array[ManagedProperty] = null,
    title: String = null,
    `type`: String = null
  ): ManagedProperty = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nestedProperties != null) __obj.updateDynamic("nestedProperties")(nestedProperties.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedProperty]
  }
}

