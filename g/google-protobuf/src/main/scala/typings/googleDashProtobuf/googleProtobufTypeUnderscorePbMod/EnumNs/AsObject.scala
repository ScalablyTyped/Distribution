package typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.EnumNs

import typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var enumvalueList: js.Array[
    typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.EnumValueNs.AsObject
  ]
  var name: String
  var optionsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject]
  var sourceContext: js.UndefOr[
    typings.googleDashProtobuf.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContextNs.AsObject
  ] = js.undefined
  var syntax: Syntax
}

object AsObject {
  @scala.inline
  def apply(
    enumvalueList: js.Array[
      typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.EnumValueNs.AsObject
    ],
    name: String,
    optionsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject],
    syntax: Syntax,
    sourceContext: typings.googleDashProtobuf.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContextNs.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(enumvalueList = enumvalueList, name = name, optionsList = optionsList, syntax = syntax)
    if (sourceContext != null) __obj.updateDynamic("sourceContext")(sourceContext)
    __obj.asInstanceOf[AsObject]
  }
}

