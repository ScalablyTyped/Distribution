package typings.detective.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectiveResults extends js.Object {
  /**
    * an array of each stringified expression found in a require() call
    */
  var expressions: js.Array[String]
  /**
    * (when opts.nodes === true) - an array of AST nodes for each argument found in a require() call
    */
  var nodes: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * an array of each string found in a require()
    */
  var strings: js.Array[String]
}

object DetectiveResults {
  @scala.inline
  def apply(expressions: js.Array[String], strings: js.Array[String], nodes: js.Array[_] = null): DetectiveResults = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectiveResults]
  }
}

