package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A typed name-value pair for structured data.  The type of the value should
  * be the same as the registered type for the `name` property in the object
  * definition of `objectType`.
  */
@js.native
trait Schema$NamedProperty extends js.Object {
  var booleanValue: js.UndefOr[Boolean] = js.native
  var dateValues: js.UndefOr[Schema$DateValues] = js.native
  var doubleValues: js.UndefOr[Schema$DoubleValues] = js.native
  var enumValues: js.UndefOr[Schema$EnumValues] = js.native
  var htmlValues: js.UndefOr[Schema$HtmlValues] = js.native
  var integerValues: js.UndefOr[Schema$IntegerValues] = js.native
  /**
    * The name of the property.  This name should correspond to the name of the
    * property that was registered for object definition in the schema. The
    * maximum allowable length for this property is 256 characters.
    */
  var name: js.UndefOr[String] = js.native
  var objectValues: js.UndefOr[Schema$ObjectValues] = js.native
  var textValues: js.UndefOr[Schema$TextValues] = js.native
  var timestampValues: js.UndefOr[Schema$TimestampValues] = js.native
}

object Schema$NamedProperty {
  @scala.inline
  def apply(
    booleanValue: js.UndefOr[Boolean] = js.undefined,
    dateValues: Schema$DateValues = null,
    doubleValues: Schema$DoubleValues = null,
    enumValues: Schema$EnumValues = null,
    htmlValues: Schema$HtmlValues = null,
    integerValues: Schema$IntegerValues = null,
    name: String = null,
    objectValues: Schema$ObjectValues = null,
    textValues: Schema$TextValues = null,
    timestampValues: Schema$TimestampValues = null
  ): Schema$NamedProperty = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(booleanValue)) __obj.updateDynamic("booleanValue")(booleanValue.asInstanceOf[js.Any])
    if (dateValues != null) __obj.updateDynamic("dateValues")(dateValues.asInstanceOf[js.Any])
    if (doubleValues != null) __obj.updateDynamic("doubleValues")(doubleValues.asInstanceOf[js.Any])
    if (enumValues != null) __obj.updateDynamic("enumValues")(enumValues.asInstanceOf[js.Any])
    if (htmlValues != null) __obj.updateDynamic("htmlValues")(htmlValues.asInstanceOf[js.Any])
    if (integerValues != null) __obj.updateDynamic("integerValues")(integerValues.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (objectValues != null) __obj.updateDynamic("objectValues")(objectValues.asInstanceOf[js.Any])
    if (textValues != null) __obj.updateDynamic("textValues")(textValues.asInstanceOf[js.Any])
    if (timestampValues != null) __obj.updateDynamic("timestampValues")(timestampValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NamedProperty]
  }
}

