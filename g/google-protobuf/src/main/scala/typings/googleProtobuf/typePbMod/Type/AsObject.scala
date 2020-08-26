package typings.googleProtobuf.typePbMod.Type

import typings.googleProtobuf.typePbMod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var fieldsList: js.Array[typings.googleProtobuf.typePbMod.Field.AsObject] = js.native
  var name: String = js.native
  var oneofsList: js.Array[String] = js.native
  var optionsList: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject] = js.native
  var sourceContext: js.UndefOr[typings.googleProtobuf.sourceContextPbMod.SourceContext.AsObject] = js.native
  var syntax: Syntax = js.native
}

object AsObject {
  @scala.inline
  def apply(
    fieldsList: js.Array[typings.googleProtobuf.typePbMod.Field.AsObject],
    name: String,
    oneofsList: js.Array[String],
    optionsList: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject],
    syntax: Syntax
  ): AsObject = {
    val __obj = js.Dynamic.literal(fieldsList = fieldsList.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oneofsList = oneofsList.asInstanceOf[js.Any], optionsList = optionsList.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFieldsListVarargs(value: typings.googleProtobuf.typePbMod.Field.AsObject*): Self = this.set("fieldsList", js.Array(value :_*))
    @scala.inline
    def setFieldsList(value: js.Array[typings.googleProtobuf.typePbMod.Field.AsObject]): Self = this.set("fieldsList", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOneofsListVarargs(value: String*): Self = this.set("oneofsList", js.Array(value :_*))
    @scala.inline
    def setOneofsList(value: js.Array[String]): Self = this.set("oneofsList", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsListVarargs(value: typings.googleProtobuf.typePbMod.Option.AsObject*): Self = this.set("optionsList", js.Array(value :_*))
    @scala.inline
    def setOptionsList(value: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject]): Self = this.set("optionsList", value.asInstanceOf[js.Any])
    @scala.inline
    def setSyntax(value: Syntax): Self = this.set("syntax", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceContext(value: typings.googleProtobuf.sourceContextPbMod.SourceContext.AsObject): Self = this.set("sourceContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceContext: Self = this.set("sourceContext", js.undefined)
  }
  
}

