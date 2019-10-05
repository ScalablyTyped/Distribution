package typings.dot.dotMod

import org.scalablytyped.runtime.TopLevel
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateSettings extends js.Object {
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

object TemplateSettings {
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
  ): TemplateSettings = {
    val __obj = js.Dynamic.literal(append = append, conditional = conditional, define = define, defineParams = defineParams, encode = encode, evaluate = evaluate, interpolate = interpolate, iterate = iterate, selfcontained = selfcontained, strip = strip, use = use, useParams = useParams, varname = varname)
  
    __obj.asInstanceOf[TemplateSettings]
  }
}

@JSImport("dot", "templateSettings")
@js.native
object templateSettings extends TopLevel[TemplateSettings]

