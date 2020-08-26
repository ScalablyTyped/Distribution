package typings.eslint.mod.Rule

import org.scalablytyped.runtime.StringDictionary
import typings.eslint.mod.Linter.ParserOptions
import typings.eslint.mod.Scope.Scope
import typings.eslint.mod.Scope.Variable
import typings.eslint.mod.SourceCode
import typings.eslint.mod.SourceCode.ParserServices
import typings.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleContext extends js.Object {
  var id: String = js.native
  var options: js.Array[_] = js.native
  var parserOptions: ParserOptions = js.native
  var parserPath: String = js.native
  var parserServices: ParserServices = js.native
  var settings: StringDictionary[js.Any] = js.native
  def getAncestors(): js.Array[Node] = js.native
  def getDeclaredVariables(node: Node): js.Array[Variable] = js.native
  def getFilename(): String = js.native
  def getScope(): Scope = js.native
  def getSourceCode(): SourceCode = js.native
  def markVariableAsUsed(name: String): Boolean = js.native
  def report(descriptor: ReportDescriptor): Unit = js.native
}

object RuleContext {
  @scala.inline
  def apply(
    getAncestors: () => js.Array[Node],
    getDeclaredVariables: Node => js.Array[Variable],
    getFilename: () => String,
    getScope: () => Scope,
    getSourceCode: () => SourceCode,
    id: String,
    markVariableAsUsed: String => Boolean,
    options: js.Array[_],
    parserOptions: ParserOptions,
    parserPath: String,
    parserServices: ParserServices,
    report: ReportDescriptor => Unit,
    settings: StringDictionary[js.Any]
  ): RuleContext = {
    val __obj = js.Dynamic.literal(getAncestors = js.Any.fromFunction0(getAncestors), getDeclaredVariables = js.Any.fromFunction1(getDeclaredVariables), getFilename = js.Any.fromFunction0(getFilename), getScope = js.Any.fromFunction0(getScope), getSourceCode = js.Any.fromFunction0(getSourceCode), id = id.asInstanceOf[js.Any], markVariableAsUsed = js.Any.fromFunction1(markVariableAsUsed), options = options.asInstanceOf[js.Any], parserOptions = parserOptions.asInstanceOf[js.Any], parserPath = parserPath.asInstanceOf[js.Any], parserServices = parserServices.asInstanceOf[js.Any], report = js.Any.fromFunction1(report), settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleContext]
  }
  @scala.inline
  implicit class RuleContextOps[Self <: RuleContext] (val x: Self) extends AnyVal {
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
    def setGetAncestors(value: () => js.Array[Node]): Self = this.set("getAncestors", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDeclaredVariables(value: Node => js.Array[Variable]): Self = this.set("getDeclaredVariables", js.Any.fromFunction1(value))
    @scala.inline
    def setGetFilename(value: () => String): Self = this.set("getFilename", js.Any.fromFunction0(value))
    @scala.inline
    def setGetScope(value: () => Scope): Self = this.set("getScope", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSourceCode(value: () => SourceCode): Self = this.set("getSourceCode", js.Any.fromFunction0(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkVariableAsUsed(value: String => Boolean): Self = this.set("markVariableAsUsed", js.Any.fromFunction1(value))
    @scala.inline
    def setOptionsVarargs(value: js.Any*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[_]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setParserOptions(value: ParserOptions): Self = this.set("parserOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setParserPath(value: String): Self = this.set("parserPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setParserServices(value: ParserServices): Self = this.set("parserServices", value.asInstanceOf[js.Any])
    @scala.inline
    def setReport(value: ReportDescriptor => Unit): Self = this.set("report", js.Any.fromFunction1(value))
    @scala.inline
    def setSettings(value: StringDictionary[js.Any]): Self = this.set("settings", value.asInstanceOf[js.Any])
  }
  
}

