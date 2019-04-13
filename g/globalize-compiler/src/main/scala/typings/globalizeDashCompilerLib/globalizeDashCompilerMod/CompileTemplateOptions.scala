package typings
package globalizeDashCompilerLib.globalizeDashCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileTemplateOptions extends js.Object {
  /**
    * the source of the compiled formatters and parsers.
    */
  var code: java.lang.String
  /**
    * a list of globalize runtime modules that the compiled code depends on, e.g. globalize-runtime/number.
    */
  var dependencies: js.Array[java.lang.String]
}

object CompileTemplateOptions {
  @scala.inline
  def apply(code: java.lang.String, dependencies: js.Array[java.lang.String]): CompileTemplateOptions = {
    val __obj = js.Dynamic.literal(code = code, dependencies = dependencies)
  
    __obj.asInstanceOf[CompileTemplateOptions]
  }
}

