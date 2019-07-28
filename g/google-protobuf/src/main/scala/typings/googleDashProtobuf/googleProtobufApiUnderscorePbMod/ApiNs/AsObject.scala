package typings.googleDashProtobuf.googleProtobufApiUnderscorePbMod.ApiNs

import typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var methodsList: js.Array[typings.googleDashProtobuf.googleProtobufApiUnderscorePbMod.MethodNs.AsObject]
  var mixinsList: js.Array[typings.googleDashProtobuf.googleProtobufApiUnderscorePbMod.MixinNs.AsObject]
  var name: String
  var optionsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject]
  var sourceContext: js.UndefOr[
    typings.googleDashProtobuf.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContextNs.AsObject
  ] = js.undefined
  var syntax: Syntax
  var version: String
}

object AsObject {
  @scala.inline
  def apply(
    methodsList: js.Array[typings.googleDashProtobuf.googleProtobufApiUnderscorePbMod.MethodNs.AsObject],
    mixinsList: js.Array[typings.googleDashProtobuf.googleProtobufApiUnderscorePbMod.MixinNs.AsObject],
    name: String,
    optionsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject],
    syntax: Syntax,
    version: String,
    sourceContext: typings.googleDashProtobuf.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContextNs.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(methodsList = methodsList, mixinsList = mixinsList, name = name, optionsList = optionsList, syntax = syntax, version = version)
    if (sourceContext != null) __obj.updateDynamic("sourceContext")(sourceContext)
    __obj.asInstanceOf[AsObject]
  }
}

