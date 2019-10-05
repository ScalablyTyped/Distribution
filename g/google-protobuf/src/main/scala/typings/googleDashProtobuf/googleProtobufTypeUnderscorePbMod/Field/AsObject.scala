package typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var cardinality: Cardinality
  var defaultValue: String
  var jsonName: String
  var kind: Kind
  var name: String
  var number: Double
  var oneofIndex: Double
  var optionsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Option.AsObject]
  var packed: Boolean
  var typeUrl: String
}

object AsObject {
  @scala.inline
  def apply(
    cardinality: Cardinality,
    defaultValue: String,
    jsonName: String,
    kind: Kind,
    name: String,
    number: Double,
    oneofIndex: Double,
    optionsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Option.AsObject],
    packed: Boolean,
    typeUrl: String
  ): AsObject = {
    val __obj = js.Dynamic.literal(cardinality = cardinality, defaultValue = defaultValue, jsonName = jsonName, kind = kind, name = name, number = number, oneofIndex = oneofIndex, optionsList = optionsList, packed = packed, typeUrl = typeUrl)
  
    __obj.asInstanceOf[AsObject]
  }
}

