package typings.ecmarkup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Algorithms extends js.Object {
  var algorithms: js.Array[Tree]
  var earlyErrors: js.Array[Grammar]
  var mainGrammar: js.Array[Source]
  var sdos: js.Array[Alg]
}

object Algorithms {
  @scala.inline
  def apply(
    algorithms: js.Array[Tree],
    earlyErrors: js.Array[Grammar],
    mainGrammar: js.Array[Source],
    sdos: js.Array[Alg]
  ): Algorithms = {
    val __obj = js.Dynamic.literal(algorithms = algorithms.asInstanceOf[js.Any], earlyErrors = earlyErrors.asInstanceOf[js.Any], mainGrammar = mainGrammar.asInstanceOf[js.Any], sdos = sdos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithms]
  }
}

