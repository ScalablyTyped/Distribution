package typings.detective.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectiveResults extends js.Object {
  /**
    * an array of each stringified expression found in a require() call
    */
  var expressions: js.Array[String] = js.native
  /**
    * (when opts.nodes === true) - an array of AST nodes for each argument found in a require() call
    */
  var nodes: js.UndefOr[js.Array[_]] = js.native
  /**
    * an array of each string found in a require()
    */
  var strings: js.Array[String] = js.native
}

object DetectiveResults {
  @scala.inline
  def apply(expressions: js.Array[String], strings: js.Array[String]): DetectiveResults = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectiveResults]
  }
  @scala.inline
  implicit class DetectiveResultsOps[Self <: DetectiveResults] (val x: Self) extends AnyVal {
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
    def setExpressionsVarargs(value: String*): Self = this.set("expressions", js.Array(value :_*))
    @scala.inline
    def setExpressions(value: js.Array[String]): Self = this.set("expressions", value.asInstanceOf[js.Any])
    @scala.inline
    def setStringsVarargs(value: String*): Self = this.set("strings", js.Array(value :_*))
    @scala.inline
    def setStrings(value: js.Array[String]): Self = this.set("strings", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodesVarargs(value: js.Any*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[_]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
  }
  
}

