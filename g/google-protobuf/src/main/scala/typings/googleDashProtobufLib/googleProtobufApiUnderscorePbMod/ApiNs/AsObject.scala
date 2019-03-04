package typings
package googleDashProtobufLib.googleProtobufApiUnderscorePbMod.ApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var methodsList: js.Array[googleDashProtobufLib.googleProtobufApiUnderscorePbMod.MethodNs.AsObject]
  var mixinsList: js.Array[googleDashProtobufLib.googleProtobufApiUnderscorePbMod.MixinNs.AsObject]
  var name: java.lang.String
  var optionsList: js.Array[googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject]
  var sourceContext: js.UndefOr[
    googleDashProtobufLib.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContextNs.AsObject
  ] = js.undefined
  var syntax: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Syntax
  var version: java.lang.String
}

object AsObject {
  @scala.inline
  def apply(
    methodsList: js.Array[googleDashProtobufLib.googleProtobufApiUnderscorePbMod.MethodNs.AsObject],
    mixinsList: js.Array[googleDashProtobufLib.googleProtobufApiUnderscorePbMod.MixinNs.AsObject],
    name: java.lang.String,
    optionsList: js.Array[googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject],
    syntax: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Syntax,
    version: java.lang.String,
    sourceContext: googleDashProtobufLib.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContextNs.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(methodsList = methodsList, mixinsList = mixinsList, name = name, optionsList = optionsList, syntax = syntax, version = version)
    if (sourceContext != null) __obj.updateDynamic("sourceContext")(sourceContext)
    __obj.asInstanceOf[AsObject]
  }
}

