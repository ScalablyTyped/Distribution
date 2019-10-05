package typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Type

import typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var fieldsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Field.AsObject]
  var name: String
  var oneofsList: js.Array[String]
  var optionsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Option.AsObject]
  var sourceContext: js.UndefOr[
    typings.googleDashProtobuf.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContext.AsObject
  ] = js.undefined
  var syntax: Syntax
}

object AsObject {
  @scala.inline
  def apply(
    fieldsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Field.AsObject],
    name: String,
    oneofsList: js.Array[String],
    optionsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Option.AsObject],
    syntax: Syntax,
    sourceContext: typings.googleDashProtobuf.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContext.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(fieldsList = fieldsList, name = name, oneofsList = oneofsList, optionsList = optionsList, syntax = syntax)
    if (sourceContext != null) __obj.updateDynamic("sourceContext")(sourceContext)
    __obj.asInstanceOf[AsObject]
  }
}

