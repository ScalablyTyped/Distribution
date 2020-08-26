package typings.ecmarkup.anon

import typings.ecmarkup.collectNodesMod.CollectNodesReturnType
import typings.ecmarkup.ecmarkupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Algorithms extends CollectNodesReturnType {
  var algorithms: js.Array[Element] = js.native
  var earlyErrors: js.Array[Grammar] = js.native
  var headers: js.Array[Contents] = js.native
  var mainGrammar: js.Array[Source] = js.native
  var sdos: js.Array[Alg] = js.native
  var success: `true` = js.native
}

object Algorithms {
  @scala.inline
  def apply(
    algorithms: js.Array[Element],
    earlyErrors: js.Array[Grammar],
    headers: js.Array[Contents],
    mainGrammar: js.Array[Source],
    sdos: js.Array[Alg],
    success: `true`
  ): Algorithms = {
    val __obj = js.Dynamic.literal(algorithms = algorithms.asInstanceOf[js.Any], earlyErrors = earlyErrors.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], mainGrammar = mainGrammar.asInstanceOf[js.Any], sdos = sdos.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithms]
  }
  @scala.inline
  implicit class AlgorithmsOps[Self <: Algorithms] (val x: Self) extends AnyVal {
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
    def setAlgorithmsVarargs(value: Element*): Self = this.set("algorithms", js.Array(value :_*))
    @scala.inline
    def setAlgorithms(value: js.Array[Element]): Self = this.set("algorithms", value.asInstanceOf[js.Any])
    @scala.inline
    def setEarlyErrorsVarargs(value: Grammar*): Self = this.set("earlyErrors", js.Array(value :_*))
    @scala.inline
    def setEarlyErrors(value: js.Array[Grammar]): Self = this.set("earlyErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadersVarargs(value: Contents*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[Contents]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setMainGrammarVarargs(value: Source*): Self = this.set("mainGrammar", js.Array(value :_*))
    @scala.inline
    def setMainGrammar(value: js.Array[Source]): Self = this.set("mainGrammar", value.asInstanceOf[js.Any])
    @scala.inline
    def setSdosVarargs(value: Alg*): Self = this.set("sdos", js.Array(value :_*))
    @scala.inline
    def setSdos(value: js.Array[Alg]): Self = this.set("sdos", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: `true`): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

