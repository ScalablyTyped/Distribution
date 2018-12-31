package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppRestrictionsSchemaRestriction extends js.Object {
  /** The default value of the restriction. bundle and bundleArray restrictions never have a default value. */
  var defaultValue: js.UndefOr[AppRestrictionsSchemaRestrictionRestrictionValue] = js.undefined
  /** A longer description of the restriction, giving more detail of what it affects. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** For choice or multiselect restrictions, the list of possible entries' human-readable names. */
  var entry: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * For choice or multiselect restrictions, the list of possible entries' machine-readable values. These values should be used in the configuration, either
    * as a single string value for a choice restriction or in a stringArray for a multiselect restriction.
    */
  var entryValue: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The unique key that the product uses to identify the restriction, e.g. "com.google.android.gm.fieldname". */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * For bundle or bundleArray restrictions, the list of nested restrictions. A bundle restriction is always nested within a bundleArray restriction, and a
    * bundleArray restriction is at most two levels deep.
    */
  var nestedRestriction: js.UndefOr[js.Array[AppRestrictionsSchemaRestriction]] = js.undefined
  /** The type of the restriction. */
  var restrictionType: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the restriction. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

