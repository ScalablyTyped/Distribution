package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

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
trait SchemaManagedProperty extends js.Object {
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
  var valueBundle: js.UndefOr[SchemaManagedPropertyBundle] = js.native
  /**
    * The list of bundles of properties - this will only be present if type of
    * the property is bundle_array.
    */
  var valueBundleArray: js.UndefOr[js.Array[SchemaManagedPropertyBundle]] = js.native
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

object SchemaManagedProperty {
  @scala.inline
  def apply(): SchemaManagedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedProperty]
  }
  @scala.inline
  implicit class SchemaManagedPropertyOps[Self <: SchemaManagedProperty] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setValueBool(value: Boolean): Self = this.set("valueBool", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueBool: Self = this.set("valueBool", js.undefined)
    @scala.inline
    def setValueBundle(value: SchemaManagedPropertyBundle): Self = this.set("valueBundle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueBundle: Self = this.set("valueBundle", js.undefined)
    @scala.inline
    def setValueBundleArrayVarargs(value: SchemaManagedPropertyBundle*): Self = this.set("valueBundleArray", js.Array(value :_*))
    @scala.inline
    def setValueBundleArray(value: js.Array[SchemaManagedPropertyBundle]): Self = this.set("valueBundleArray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueBundleArray: Self = this.set("valueBundleArray", js.undefined)
    @scala.inline
    def setValueInteger(value: Double): Self = this.set("valueInteger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueInteger: Self = this.set("valueInteger", js.undefined)
    @scala.inline
    def setValueString(value: String): Self = this.set("valueString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueString: Self = this.set("valueString", js.undefined)
    @scala.inline
    def setValueStringArrayVarargs(value: String*): Self = this.set("valueStringArray", js.Array(value :_*))
    @scala.inline
    def setValueStringArray(value: js.Array[String]): Self = this.set("valueStringArray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueStringArray: Self = this.set("valueStringArray", js.undefined)
  }
  
}

