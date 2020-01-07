package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A managed property of a managed configuration. The property must match one
  * of the properties in the app restrictions schema of the product. Exactly
  * one of the value fields must be populated, and it must match the
  * property&#39;s type in the app restrictions schema.
  */
@js.native
trait Schema$ManagedProperty extends js.Object {
  /**
    * The unique key that identifies the property.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The boolean value - this will only be present if type of the property is
    * bool.
    */
  var valueBool: js.UndefOr[Boolean] = js.native
  /**
    * The bundle of managed properties - this will only be present if type of
    * the property is bundle.
    */
  var valueBundle: js.UndefOr[Schema$ManagedPropertyBundle] = js.native
  /**
    * The list of bundles of properties - this will only be present if type of
    * the property is bundle_array.
    */
  var valueBundleArray: js.UndefOr[js.Array[Schema$ManagedPropertyBundle]] = js.native
  /**
    * The integer value - this will only be present if type of the property is
    * integer.
    */
  var valueInteger: js.UndefOr[Double] = js.native
  /**
    * The string value - this will only be present if type of the property is
    * string, choice or hidden.
    */
  var valueString: js.UndefOr[String] = js.native
  /**
    * The list of string values - this will only be present if type of the
    * property is multiselect.
    */
  var valueStringArray: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ManagedProperty {
  @scala.inline
  def apply(
    key: String = null,
    valueBool: js.UndefOr[Boolean] = js.undefined,
    valueBundle: Schema$ManagedPropertyBundle = null,
    valueBundleArray: js.Array[Schema$ManagedPropertyBundle] = null,
    valueInteger: Int | Double = null,
    valueString: String = null,
    valueStringArray: js.Array[String] = null
  ): Schema$ManagedProperty = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(valueBool)) __obj.updateDynamic("valueBool")(valueBool.asInstanceOf[js.Any])
    if (valueBundle != null) __obj.updateDynamic("valueBundle")(valueBundle.asInstanceOf[js.Any])
    if (valueBundleArray != null) __obj.updateDynamic("valueBundleArray")(valueBundleArray.asInstanceOf[js.Any])
    if (valueInteger != null) __obj.updateDynamic("valueInteger")(valueInteger.asInstanceOf[js.Any])
    if (valueString != null) __obj.updateDynamic("valueString")(valueString.asInstanceOf[js.Any])
    if (valueStringArray != null) __obj.updateDynamic("valueStringArray")(valueStringArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ManagedProperty]
  }
}

