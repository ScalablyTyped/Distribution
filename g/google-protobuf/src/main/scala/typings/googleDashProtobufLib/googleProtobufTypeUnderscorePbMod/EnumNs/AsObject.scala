package typings
package googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.EnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var enumvalueList: js.Array[googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.EnumValueNs.AsObject]
  var name: java.lang.String
  var optionsList: js.Array[googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject]
  var sourceContext: js.UndefOr[
    googleDashProtobufLib.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContextNs.AsObject
  ] = js.undefined
  var syntax: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Syntax
}

object AsObject {
  @scala.inline
  def apply(
    enumvalueList: js.Array[googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.EnumValueNs.AsObject],
    name: java.lang.String,
    optionsList: js.Array[googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject],
    syntax: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Syntax,
    sourceContext: googleDashProtobufLib.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContextNs.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enumvalueList")(enumvalueList)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("optionsList")(optionsList)
    __obj.updateDynamic("syntax")(syntax)
    if (sourceContext != null) __obj.updateDynamic("sourceContext")(sourceContext)
    __obj.asInstanceOf[AsObject]
  }
}

