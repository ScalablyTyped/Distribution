package typings.googleProtobuf.apiPbMod.Api

import typings.googleProtobuf.typePbMod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var methodsList: js.Array[typings.googleProtobuf.apiPbMod.Method.AsObject] = js.native
  var mixinsList: js.Array[typings.googleProtobuf.apiPbMod.Mixin.AsObject] = js.native
  var name: String = js.native
  var optionsList: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject] = js.native
  var sourceContext: js.UndefOr[typings.googleProtobuf.sourceContextPbMod.SourceContext.AsObject] = js.native
  var syntax: Syntax = js.native
  var version: String = js.native
}

object AsObject {
  @scala.inline
  def apply(
    methodsList: js.Array[typings.googleProtobuf.apiPbMod.Method.AsObject],
    mixinsList: js.Array[typings.googleProtobuf.apiPbMod.Mixin.AsObject],
    name: String,
    optionsList: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject],
    syntax: Syntax,
    version: String
  ): AsObject = {
    val __obj = js.Dynamic.literal(methodsList = methodsList.asInstanceOf[js.Any], mixinsList = mixinsList.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionsList = optionsList.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
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
    def setMethodsListVarargs(value: typings.googleProtobuf.apiPbMod.Method.AsObject*): Self = this.set("methodsList", js.Array(value :_*))
    @scala.inline
    def setMethodsList(value: js.Array[typings.googleProtobuf.apiPbMod.Method.AsObject]): Self = this.set("methodsList", value.asInstanceOf[js.Any])
    @scala.inline
    def setMixinsListVarargs(value: typings.googleProtobuf.apiPbMod.Mixin.AsObject*): Self = this.set("mixinsList", js.Array(value :_*))
    @scala.inline
    def setMixinsList(value: js.Array[typings.googleProtobuf.apiPbMod.Mixin.AsObject]): Self = this.set("mixinsList", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsListVarargs(value: typings.googleProtobuf.typePbMod.Option.AsObject*): Self = this.set("optionsList", js.Array(value :_*))
    @scala.inline
    def setOptionsList(value: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject]): Self = this.set("optionsList", value.asInstanceOf[js.Any])
    @scala.inline
    def setSyntax(value: Syntax): Self = this.set("syntax", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceContext(value: typings.googleProtobuf.sourceContextPbMod.SourceContext.AsObject): Self = this.set("sourceContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceContext: Self = this.set("sourceContext", js.undefined)
  }
  
}

