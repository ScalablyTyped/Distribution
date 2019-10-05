package typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Enum

import typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var enumvalueList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.EnumValue.AsObject]
  var name: String
  var optionsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Option.AsObject]
  var sourceContext: js.UndefOr[
    typings.googleDashProtobuf.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContext.AsObject
  ] = js.undefined
  var syntax: Syntax
}

object AsObject {
  @scala.inline
  def apply(
    enumvalueList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.EnumValue.AsObject],
    name: String,
    optionsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Option.AsObject],
    syntax: Syntax,
    sourceContext: typings.googleDashProtobuf.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContext.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(enumvalueList = enumvalueList, name = name, optionsList = optionsList, syntax = syntax)
    if (sourceContext != null) __obj.updateDynamic("sourceContext")(sourceContext)
    __obj.asInstanceOf[AsObject]
  }
}

