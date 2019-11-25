package typings.googleDashProtobuf.googleProtobufApiUnderscorePbMod.Api

import typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var methodsList: js.Array[typings.googleDashProtobuf.googleProtobufApiUnderscorePbMod.Method.AsObject]
  var mixinsList: js.Array[typings.googleDashProtobuf.googleProtobufApiUnderscorePbMod.Mixin.AsObject]
  var name: String
  var optionsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Option.AsObject]
  var sourceContext: js.UndefOr[
    typings.googleDashProtobuf.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContext.AsObject
  ] = js.undefined
  var syntax: Syntax
  var version: String
}

object AsObject {
  @scala.inline
  def apply(
    methodsList: js.Array[typings.googleDashProtobuf.googleProtobufApiUnderscorePbMod.Method.AsObject],
    mixinsList: js.Array[typings.googleDashProtobuf.googleProtobufApiUnderscorePbMod.Mixin.AsObject],
    name: String,
    optionsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Option.AsObject],
    syntax: Syntax,
    version: String,
    sourceContext: typings.googleDashProtobuf.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContext.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(methodsList = methodsList.asInstanceOf[js.Any], mixinsList = mixinsList.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionsList = optionsList.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (sourceContext != null) __obj.updateDynamic("sourceContext")(sourceContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

