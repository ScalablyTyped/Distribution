package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The definition of a property within an object.
  */
@js.native
trait Schema$PropertyDefinition extends js.Object {
  var booleanPropertyOptions: js.UndefOr[Schema$BooleanPropertyOptions] = js.native
  var datePropertyOptions: js.UndefOr[Schema$DatePropertyOptions] = js.native
  /**
    * Options that determine how the property is displayed in the Cloud Search
    * results page if it is specified to be displayed in the object&#39;s
    * display options .
    */
  var displayOptions: js.UndefOr[Schema$PropertyDisplayOptions] = js.native
  var doublePropertyOptions: js.UndefOr[Schema$DoublePropertyOptions] = js.native
  var enumPropertyOptions: js.UndefOr[Schema$EnumPropertyOptions] = js.native
  var htmlPropertyOptions: js.UndefOr[Schema$HtmlPropertyOptions] = js.native
  var integerPropertyOptions: js.UndefOr[Schema$IntegerPropertyOptions] = js.native
  /**
    * Indicates that the property can be used for generating facets. Cannot be
    * true for properties whose type is object. IsReturnable must be true to
    * set this option. Only supported for Boolean, Enum, and Text properties.
    */
  var isFacetable: js.UndefOr[Boolean] = js.native
  /**
    * Indicates that multiple values are allowed for the property. For example,
    * a document only has one description but can have multiple comments.
    * Cannot be true for properties whose type is a boolean. If set to false,
    * properties that contain more than one value will cause the indexing
    * request for that item to be rejected.
    */
  var isRepeatable: js.UndefOr[Boolean] = js.native
  /**
    * Indicates that the property identifies data that should be returned in
    * search results via the Query API. If set to *true*, indicates that Query
    * API users can use matching property fields in results. However, storing
    * fields requires more space allocation and uses more bandwidth for search
    * queries, which impacts performance over large datasets. Set to *true*
    * here only if the field is needed for search results. Cannot be true for
    * properties whose type is an object.
    */
  var isReturnable: js.UndefOr[Boolean] = js.native
  /**
    * Indicates that the property can be used for sorting. Cannot be true for
    * properties that are repeatable. Cannot be true for properties whose type
    * is object or user identifier. IsReturnable must be true to set this
    * option. Only supported for Boolean, Date, Double, Integer, and Timestamp
    * properties.
    */
  var isSortable: js.UndefOr[Boolean] = js.native
  /**
    * The name of the property. Item indexing requests sent to the Indexing API
    * should set the property name equal to this value. For example, if name is
    * *subject_line*, then indexing requests for document items with subject
    * fields should set the name for that field equal to *subject_line*. Use
    * the name as the identifier for the object property. Once registered as a
    * property for an object, you cannot re-use this name for another property
    * within that object. The name must start with a letter and can only
    * contain letters (A-Z, a-z) or numbers (0-9). The maximum length is 256
    * characters.
    */
  var name: js.UndefOr[String] = js.native
  var objectPropertyOptions: js.UndefOr[Schema$ObjectPropertyOptions] = js.native
  var textPropertyOptions: js.UndefOr[Schema$TextPropertyOptions] = js.native
  var timestampPropertyOptions: js.UndefOr[Schema$TimestampPropertyOptions] = js.native
}

object Schema$PropertyDefinition {
  @scala.inline
  def apply(
    booleanPropertyOptions: Schema$BooleanPropertyOptions = null,
    datePropertyOptions: Schema$DatePropertyOptions = null,
    displayOptions: Schema$PropertyDisplayOptions = null,
    doublePropertyOptions: Schema$DoublePropertyOptions = null,
    enumPropertyOptions: Schema$EnumPropertyOptions = null,
    htmlPropertyOptions: Schema$HtmlPropertyOptions = null,
    integerPropertyOptions: Schema$IntegerPropertyOptions = null,
    isFacetable: js.UndefOr[Boolean] = js.undefined,
    isRepeatable: js.UndefOr[Boolean] = js.undefined,
    isReturnable: js.UndefOr[Boolean] = js.undefined,
    isSortable: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    objectPropertyOptions: Schema$ObjectPropertyOptions = null,
    textPropertyOptions: Schema$TextPropertyOptions = null,
    timestampPropertyOptions: Schema$TimestampPropertyOptions = null
  ): Schema$PropertyDefinition = {
    val __obj = js.Dynamic.literal()
    if (booleanPropertyOptions != null) __obj.updateDynamic("booleanPropertyOptions")(booleanPropertyOptions.asInstanceOf[js.Any])
    if (datePropertyOptions != null) __obj.updateDynamic("datePropertyOptions")(datePropertyOptions.asInstanceOf[js.Any])
    if (displayOptions != null) __obj.updateDynamic("displayOptions")(displayOptions.asInstanceOf[js.Any])
    if (doublePropertyOptions != null) __obj.updateDynamic("doublePropertyOptions")(doublePropertyOptions.asInstanceOf[js.Any])
    if (enumPropertyOptions != null) __obj.updateDynamic("enumPropertyOptions")(enumPropertyOptions.asInstanceOf[js.Any])
    if (htmlPropertyOptions != null) __obj.updateDynamic("htmlPropertyOptions")(htmlPropertyOptions.asInstanceOf[js.Any])
    if (integerPropertyOptions != null) __obj.updateDynamic("integerPropertyOptions")(integerPropertyOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(isFacetable)) __obj.updateDynamic("isFacetable")(isFacetable.asInstanceOf[js.Any])
    if (!js.isUndefined(isRepeatable)) __obj.updateDynamic("isRepeatable")(isRepeatable.asInstanceOf[js.Any])
    if (!js.isUndefined(isReturnable)) __obj.updateDynamic("isReturnable")(isReturnable.asInstanceOf[js.Any])
    if (!js.isUndefined(isSortable)) __obj.updateDynamic("isSortable")(isSortable.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (objectPropertyOptions != null) __obj.updateDynamic("objectPropertyOptions")(objectPropertyOptions.asInstanceOf[js.Any])
    if (textPropertyOptions != null) __obj.updateDynamic("textPropertyOptions")(textPropertyOptions.asInstanceOf[js.Any])
    if (timestampPropertyOptions != null) __obj.updateDynamic("timestampPropertyOptions")(timestampPropertyOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PropertyDefinition]
  }
}

