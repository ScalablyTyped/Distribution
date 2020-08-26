package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppRestrictionsSchemaRestriction extends js.Object {
  /** The default value of the restriction. bundle and bundleArray restrictions never have a default value. */
  var defaultValue: js.UndefOr[AppRestrictionsSchemaRestrictionRestrictionValue] = js.native
  /** A longer description of the restriction, giving more detail of what it affects. */
  var description: js.UndefOr[String] = js.native
  /** For choice or multiselect restrictions, the list of possible entries' human-readable names. */
  var entry: js.UndefOr[js.Array[String]] = js.native
  /**
    * For choice or multiselect restrictions, the list of possible entries' machine-readable values. These values should be used in the configuration, either
    * as a single string value for a choice restriction or in a stringArray for a multiselect restriction.
    */
  var entryValue: js.UndefOr[js.Array[String]] = js.native
  /** The unique key that the product uses to identify the restriction, e.g. "com.google.android.gm.fieldname". */
  var key: js.UndefOr[String] = js.native
  /**
    * For bundle or bundleArray restrictions, the list of nested restrictions. A bundle restriction is always nested within a bundleArray restriction, and a
    * bundleArray restriction is at most two levels deep.
    */
  var nestedRestriction: js.UndefOr[js.Array[AppRestrictionsSchemaRestriction]] = js.native
  /** The type of the restriction. */
  var restrictionType: js.UndefOr[String] = js.native
  /** The name of the restriction. */
  var title: js.UndefOr[String] = js.native
}

object AppRestrictionsSchemaRestriction {
  @scala.inline
  def apply(): AppRestrictionsSchemaRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppRestrictionsSchemaRestriction]
  }
  @scala.inline
  implicit class AppRestrictionsSchemaRestrictionOps[Self <: AppRestrictionsSchemaRestriction] (val x: Self) extends AnyVal {
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
    def setDefaultValue(value: AppRestrictionsSchemaRestrictionRestrictionValue): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEntryVarargs(value: String*): Self = this.set("entry", js.Array(value :_*))
    @scala.inline
    def setEntry(value: js.Array[String]): Self = this.set("entry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntry: Self = this.set("entry", js.undefined)
    @scala.inline
    def setEntryValueVarargs(value: String*): Self = this.set("entryValue", js.Array(value :_*))
    @scala.inline
    def setEntryValue(value: js.Array[String]): Self = this.set("entryValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntryValue: Self = this.set("entryValue", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setNestedRestrictionVarargs(value: AppRestrictionsSchemaRestriction*): Self = this.set("nestedRestriction", js.Array(value :_*))
    @scala.inline
    def setNestedRestriction(value: js.Array[AppRestrictionsSchemaRestriction]): Self = this.set("nestedRestriction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestedRestriction: Self = this.set("nestedRestriction", js.undefined)
    @scala.inline
    def setRestrictionType(value: String): Self = this.set("restrictionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestrictionType: Self = this.set("restrictionType", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

