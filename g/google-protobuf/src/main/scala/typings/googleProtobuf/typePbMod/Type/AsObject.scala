package typings.googleProtobuf.typePbMod.Type

import typings.googleProtobuf.typePbMod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var fieldsList: js.Array[typings.googleProtobuf.typePbMod.Field.AsObject]
  var name: String
  var oneofsList: js.Array[String]
  var optionsList: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject]
  var sourceContext: js.UndefOr[typings.googleProtobuf.sourceContextPbMod.SourceContext.AsObject] = js.undefined
  var syntax: Syntax
}

object AsObject {
  @scala.inline
  def apply(
    fieldsList: js.Array[typings.googleProtobuf.typePbMod.Field.AsObject],
    name: String,
    oneofsList: js.Array[String],
    optionsList: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject],
    syntax: Syntax,
    sourceContext: typings.googleProtobuf.sourceContextPbMod.SourceContext.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(fieldsList = fieldsList.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oneofsList = oneofsList.asInstanceOf[js.Any], optionsList = optionsList.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
    if (sourceContext != null) __obj.updateDynamic("sourceContext")(sourceContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

