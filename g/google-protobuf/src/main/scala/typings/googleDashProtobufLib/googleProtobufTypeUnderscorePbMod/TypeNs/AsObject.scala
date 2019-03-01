package typings
package googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.TypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var fieldsList: js.Array[googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.AsObject]
  var name: java.lang.String
  var oneofsList: js.Array[java.lang.String]
  var optionsList: js.Array[googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject]
  var sourceContext: js.UndefOr[
    googleDashProtobufLib.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContextNs.AsObject
  ] = js.undefined
  var syntax: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Syntax
}

object AsObject {
  @scala.inline
  def apply(
    fieldsList: js.Array[googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.AsObject],
    name: java.lang.String,
    oneofsList: js.Array[java.lang.String],
    optionsList: js.Array[googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject],
    syntax: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Syntax,
    sourceContext: googleDashProtobufLib.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContextNs.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fieldsList")(fieldsList)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("oneofsList")(oneofsList)
    __obj.updateDynamic("optionsList")(optionsList)
    __obj.updateDynamic("syntax")(syntax)
    if (sourceContext != null) __obj.updateDynamic("sourceContext")(sourceContext)
    __obj.asInstanceOf[AsObject]
  }
}

