package typings.googleProtobuf.typePbMod.Field

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
  var optionsList: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject]
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
    optionsList: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject],
    packed: Boolean,
    typeUrl: String
  ): AsObject = {
    val __obj = js.Dynamic.literal(cardinality = cardinality.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], jsonName = jsonName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], oneofIndex = oneofIndex.asInstanceOf[js.Any], optionsList = optionsList.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], typeUrl = typeUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

