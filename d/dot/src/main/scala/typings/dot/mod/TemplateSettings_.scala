package typings.dot.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateSettings_ extends js.Object {
  var append: Boolean = js.native
  var conditional: RegExp = js.native
  var define: RegExp = js.native
  var defineParams: RegExp = js.native
  var encode: RegExp = js.native
  var evaluate: RegExp = js.native
  var interpolate: RegExp = js.native
  var iterate: RegExp = js.native
  var selfcontained: Boolean = js.native
  var strip: Boolean = js.native
  var use: RegExp = js.native
  var useParams: RegExp = js.native
  var varname: String = js.native
}

object TemplateSettings_ {
  @scala.inline
  def apply(
    append: Boolean,
    conditional: RegExp,
    define: RegExp,
    defineParams: RegExp,
    encode: RegExp,
    evaluate: RegExp,
    interpolate: RegExp,
    iterate: RegExp,
    selfcontained: Boolean,
    strip: Boolean,
    use: RegExp,
    useParams: RegExp,
    varname: String
  ): TemplateSettings_ = {
    val __obj = js.Dynamic.literal(append = append.asInstanceOf[js.Any], conditional = conditional.asInstanceOf[js.Any], define = define.asInstanceOf[js.Any], defineParams = defineParams.asInstanceOf[js.Any], encode = encode.asInstanceOf[js.Any], evaluate = evaluate.asInstanceOf[js.Any], interpolate = interpolate.asInstanceOf[js.Any], iterate = iterate.asInstanceOf[js.Any], selfcontained = selfcontained.asInstanceOf[js.Any], strip = strip.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any], useParams = useParams.asInstanceOf[js.Any], varname = varname.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateSettings_]
  }
  @scala.inline
  implicit class TemplateSettings_Ops[Self <: TemplateSettings_] (val x: Self) extends AnyVal {
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
    def setAppend(value: Boolean): Self = this.set("append", value.asInstanceOf[js.Any])
    @scala.inline
    def setConditional(value: RegExp): Self = this.set("conditional", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefine(value: RegExp): Self = this.set("define", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefineParams(value: RegExp): Self = this.set("defineParams", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncode(value: RegExp): Self = this.set("encode", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvaluate(value: RegExp): Self = this.set("evaluate", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterpolate(value: RegExp): Self = this.set("interpolate", value.asInstanceOf[js.Any])
    @scala.inline
    def setIterate(value: RegExp): Self = this.set("iterate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelfcontained(value: Boolean): Self = this.set("selfcontained", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrip(value: Boolean): Self = this.set("strip", value.asInstanceOf[js.Any])
    @scala.inline
    def setUse(value: RegExp): Self = this.set("use", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseParams(value: RegExp): Self = this.set("useParams", value.asInstanceOf[js.Any])
    @scala.inline
    def setVarname(value: String): Self = this.set("varname", value.asInstanceOf[js.Any])
  }
  
}

