package typings
package globalizeDashCompilerLib.globalizeDashCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileOptions extends js.Object {
  /**
    * A function that replaces the default template.
    */
  var template: js.UndefOr[js.Function1[/* options */ CompileTemplateOptions, java.lang.String]] = js.undefined
}

object CompileOptions {
  @scala.inline
  def apply(template: /* options */ CompileTemplateOptions => java.lang.String = null): CompileOptions = {
    val __obj = js.Dynamic.literal()
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction1(template))
    __obj.asInstanceOf[CompileOptions]
  }
}

