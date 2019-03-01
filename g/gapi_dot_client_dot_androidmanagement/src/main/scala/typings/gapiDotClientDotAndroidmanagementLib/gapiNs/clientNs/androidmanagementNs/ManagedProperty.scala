package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedProperty extends js.Object {
  /** The default value of the properties. BUNDLE_ARRAY properties never have a default value. */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  /** A longer description of the property, giving more detail of what it affects. Localized. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** For CHOICE or MULTISELECT properties, the list of possible entries. */
  var entries: js.UndefOr[js.Array[ManagedPropertyEntry]] = js.undefined
  /** The unique key that the application uses to identify the property, e.g. "com.google.android.gm.fieldname". */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** For BUNDLE_ARRAY properties, the list of nested properties. A BUNDLE_ARRAY property is at most two levels deep. */
  var nestedProperties: js.UndefOr[js.Array[ManagedProperty]] = js.undefined
  /** The name of the property. Localized. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The type of the property. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ManagedProperty {
  @scala.inline
  def apply(
    defaultValue: js.Any = null,
    description: java.lang.String = null,
    entries: js.Array[ManagedPropertyEntry] = null,
    key: java.lang.String = null,
    nestedProperties: js.Array[ManagedProperty] = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null
  ): ManagedProperty = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description)
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (key != null) __obj.updateDynamic("key")(key)
    if (nestedProperties != null) __obj.updateDynamic("nestedProperties")(nestedProperties)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ManagedProperty]
  }
}

