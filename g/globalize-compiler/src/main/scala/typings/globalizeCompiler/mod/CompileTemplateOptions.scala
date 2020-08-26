package typings.globalizeCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompileTemplateOptions extends js.Object {
  /**
    * the source of the compiled formatters and parsers.
    */
  var code: String = js.native
  /**
    * a list of globalize runtime modules that the compiled code depends on, e.g. globalize-runtime/number.
    */
  var dependencies: js.Array[String] = js.native
}

object CompileTemplateOptions {
  @scala.inline
  def apply(code: String, dependencies: js.Array[String]): CompileTemplateOptions = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileTemplateOptions]
  }
  @scala.inline
  implicit class CompileTemplateOptionsOps[Self <: CompileTemplateOptions] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependenciesVarargs(value: String*): Self = this.set("dependencies", js.Array(value :_*))
    @scala.inline
    def setDependencies(value: js.Array[String]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
  }
  
}

