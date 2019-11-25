package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppRestrictionsSchemaRestriction extends js.Object {
  /** The default value of the restriction. bundle and bundleArray restrictions never have a default value. */
  var defaultValue: js.UndefOr[AppRestrictionsSchemaRestrictionRestrictionValue] = js.undefined
  /** A longer description of the restriction, giving more detail of what it affects. */
  var description: js.UndefOr[String] = js.undefined
  /** For choice or multiselect restrictions, the list of possible entries' human-readable names. */
  var entry: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * For choice or multiselect restrictions, the list of possible entries' machine-readable values. These values should be used in the configuration, either
    * as a single string value for a choice restriction or in a stringArray for a multiselect restriction.
    */
  var entryValue: js.UndefOr[js.Array[String]] = js.undefined
  /** The unique key that the product uses to identify the restriction, e.g. "com.google.android.gm.fieldname". */
  var key: js.UndefOr[String] = js.undefined
  /**
    * For bundle or bundleArray restrictions, the list of nested restrictions. A bundle restriction is always nested within a bundleArray restriction, and a
    * bundleArray restriction is at most two levels deep.
    */
  var nestedRestriction: js.UndefOr[js.Array[AppRestrictionsSchemaRestriction]] = js.undefined
  /** The type of the restriction. */
  var restrictionType: js.UndefOr[String] = js.undefined
  /** The name of the restriction. */
  var title: js.UndefOr[String] = js.undefined
}

object AppRestrictionsSchemaRestriction {
  @scala.inline
  def apply(
    defaultValue: AppRestrictionsSchemaRestrictionRestrictionValue = null,
    description: String = null,
    entry: js.Array[String] = null,
    entryValue: js.Array[String] = null,
    key: String = null,
    nestedRestriction: js.Array[AppRestrictionsSchemaRestriction] = null,
    restrictionType: String = null,
    title: String = null
  ): AppRestrictionsSchemaRestriction = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (entry != null) __obj.updateDynamic("entry")(entry.asInstanceOf[js.Any])
    if (entryValue != null) __obj.updateDynamic("entryValue")(entryValue.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nestedRestriction != null) __obj.updateDynamic("nestedRestriction")(nestedRestriction.asInstanceOf[js.Any])
    if (restrictionType != null) __obj.updateDynamic("restrictionType")(restrictionType.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppRestrictionsSchemaRestriction]
  }
}

