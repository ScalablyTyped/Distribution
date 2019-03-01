package typings
package detectiveLib.detectiveMod.detectiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectiveResults extends js.Object {
  /**
    * an array of each stringified expression found in a require() call
    */
  var expressions: js.Array[java.lang.String]
  /**
    * (when opts.nodes === true) - an array of AST nodes for each argument found in a require() call
    */
  var nodes: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * an array of each string found in a require()
    */
  var strings: js.Array[java.lang.String]
}

object DetectiveResults {
  @scala.inline
  def apply(
    expressions: js.Array[java.lang.String],
    strings: js.Array[java.lang.String],
    nodes: js.Array[_] = null
  ): DetectiveResults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expressions")(expressions)
    __obj.updateDynamic("strings")(strings)
    if (nodes != null) __obj.updateDynamic("nodes")(nodes)
    __obj.asInstanceOf[DetectiveResults]
  }
}

