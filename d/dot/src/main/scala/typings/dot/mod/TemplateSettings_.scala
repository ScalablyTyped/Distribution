package typings.dot.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateSettings_ extends js.Object {
  var append: Boolean
  var conditional: RegExp
  var define: RegExp
  var defineParams: RegExp
  var encode: RegExp
  var evaluate: RegExp
  var interpolate: RegExp
  var iterate: RegExp
  var selfcontained: Boolean
  var strip: Boolean
  var use: RegExp
  var useParams: RegExp
  var varname: String
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
}

