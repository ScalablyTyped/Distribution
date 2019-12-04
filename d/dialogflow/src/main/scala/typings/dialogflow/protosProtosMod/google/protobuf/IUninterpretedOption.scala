package typings.dialogflow.protosProtosMod.google.protobuf

import typings.dialogflow.protosProtosMod.google.protobuf.UninterpretedOption.INamePart
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an UninterpretedOption. */
trait IUninterpretedOption extends js.Object {
  /** UninterpretedOption aggregateValue */
  var aggregateValue: js.UndefOr[String | Null] = js.undefined
  /** UninterpretedOption doubleValue */
  var doubleValue: js.UndefOr[Double | Null] = js.undefined
  /** UninterpretedOption identifierValue */
  var identifierValue: js.UndefOr[String | Null] = js.undefined
  /** UninterpretedOption name */
  var name: js.UndefOr[js.Array[INamePart] | Null] = js.undefined
  /** UninterpretedOption negativeIntValue */
  var negativeIntValue: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.undefined
  /** UninterpretedOption positiveIntValue */
  var positiveIntValue: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.undefined
  /** UninterpretedOption stringValue */
  var stringValue: js.UndefOr[Uint8Array | Null] = js.undefined
}

object IUninterpretedOption {
  @scala.inline
  def apply(
    aggregateValue: String = null,
    doubleValue: Int | Double = null,
    identifierValue: String = null,
    name: js.Array[INamePart] = null,
    negativeIntValue: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = null,
    positiveIntValue: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = null,
    stringValue: Uint8Array = null
  ): IUninterpretedOption = {
    val __obj = js.Dynamic.literal()
    if (aggregateValue != null) __obj.updateDynamic("aggregateValue")(aggregateValue.asInstanceOf[js.Any])
    if (doubleValue != null) __obj.updateDynamic("doubleValue")(doubleValue.asInstanceOf[js.Any])
    if (identifierValue != null) __obj.updateDynamic("identifierValue")(identifierValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (negativeIntValue != null) __obj.updateDynamic("negativeIntValue")(negativeIntValue.asInstanceOf[js.Any])
    if (positiveIntValue != null) __obj.updateDynamic("positiveIntValue")(positiveIntValue.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUninterpretedOption]
  }
}

