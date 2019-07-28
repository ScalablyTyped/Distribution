package typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.TypeNs

import typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var fieldsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.AsObject]
  var name: String
  var oneofsList: js.Array[String]
  var optionsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject]
  var sourceContext: js.UndefOr[
    typings.googleDashProtobuf.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContextNs.AsObject
  ] = js.undefined
  var syntax: Syntax
}

object AsObject {
  @scala.inline
  def apply(
    fieldsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.AsObject],
    name: String,
    oneofsList: js.Array[String],
    optionsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject],
    syntax: Syntax,
    sourceContext: typings.googleDashProtobuf.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContextNs.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(fieldsList = fieldsList, name = name, oneofsList = oneofsList, optionsList = optionsList, syntax = syntax)
    if (sourceContext != null) __obj.updateDynamic("sourceContext")(sourceContext)
    __obj.asInstanceOf[AsObject]
  }
}

