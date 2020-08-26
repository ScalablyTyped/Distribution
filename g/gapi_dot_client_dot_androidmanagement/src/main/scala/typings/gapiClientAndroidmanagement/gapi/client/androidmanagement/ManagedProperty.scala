package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedProperty extends js.Object {
  /** The default value of the properties. BUNDLE_ARRAY properties never have a default value. */
  var defaultValue: js.UndefOr[js.Any] = js.native
  /** A longer description of the property, giving more detail of what it affects. Localized. */
  var description: js.UndefOr[String] = js.native
  /** For CHOICE or MULTISELECT properties, the list of possible entries. */
  var entries: js.UndefOr[js.Array[ManagedPropertyEntry]] = js.native
  /** The unique key that the application uses to identify the property, e.g. "com.google.android.gm.fieldname". */
  var key: js.UndefOr[String] = js.native
  /** For BUNDLE_ARRAY properties, the list of nested properties. A BUNDLE_ARRAY property is at most two levels deep. */
  var nestedProperties: js.UndefOr[js.Array[ManagedProperty]] = js.native
  /** The name of the property. Localized. */
  var title: js.UndefOr[String] = js.native
  /** The type of the property. */
  var `type`: js.UndefOr[String] = js.native
}

object ManagedProperty {
  @scala.inline
  def apply(): ManagedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedProperty]
  }
  @scala.inline
  implicit class ManagedPropertyOps[Self <: ManagedProperty] (val x: Self) extends AnyVal {
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
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEntriesVarargs(value: ManagedPropertyEntry*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[ManagedPropertyEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setNestedPropertiesVarargs(value: ManagedProperty*): Self = this.set("nestedProperties", js.Array(value :_*))
    @scala.inline
    def setNestedProperties(value: js.Array[ManagedProperty]): Self = this.set("nestedProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestedProperties: Self = this.set("nestedProperties", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

