package typings.googleCloudPubsub.iamMod.google.protobuf

import typings.googleCloudPubsub.iamMod.google.protobuf.UninterpretedOption.INamePart
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
    aggregateValue: js.UndefOr[Null | String] = js.undefined,
    doubleValue: js.UndefOr[Null | Double] = js.undefined,
    identifierValue: js.UndefOr[Null | String] = js.undefined,
    name: js.UndefOr[Null | js.Array[INamePart]] = js.undefined,
    negativeIntValue: js.UndefOr[
      Null | Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ] = js.undefined,
    positiveIntValue: js.UndefOr[
      Null | Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ] = js.undefined,
    stringValue: js.UndefOr[Null | Uint8Array] = js.undefined
  ): IUninterpretedOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aggregateValue)) __obj.updateDynamic("aggregateValue")(aggregateValue.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleValue)) __obj.updateDynamic("doubleValue")(doubleValue.asInstanceOf[js.Any])
    if (!js.isUndefined(identifierValue)) __obj.updateDynamic("identifierValue")(identifierValue.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(negativeIntValue)) __obj.updateDynamic("negativeIntValue")(negativeIntValue.asInstanceOf[js.Any])
    if (!js.isUndefined(positiveIntValue)) __obj.updateDynamic("positiveIntValue")(positiveIntValue.asInstanceOf[js.Any])
    if (!js.isUndefined(stringValue)) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUninterpretedOption]
  }
}

