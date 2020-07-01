package typings.ecmarkup.anon

import typings.ecmarkup.collectNodesMod.CollectNodesReturnType
import typings.ecmarkup.ecmarkupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Algorithms extends CollectNodesReturnType {
  var algorithms: js.Array[Element]
  var earlyErrors: js.Array[Grammar]
  var headers: js.Array[Contents]
  var mainGrammar: js.Array[Source]
  var sdos: js.Array[Alg]
  var success: `true`
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
}

