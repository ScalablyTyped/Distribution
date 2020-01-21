package typings.globalizeCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileTemplateOptions extends js.Object {
  /**
    * the source of the compiled formatters and parsers.
    */
  var code: String
  /**
    * a list of globalize runtime modules that the compiled code depends on, e.g. globalize-runtime/number.
    */
  var dependencies: js.Array[String]
}

object CompileTemplateOptions {
  @scala.inline
  def apply(code: String, dependencies: js.Array[String]): CompileTemplateOptions = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CompileTemplateOptions]
  }
}

