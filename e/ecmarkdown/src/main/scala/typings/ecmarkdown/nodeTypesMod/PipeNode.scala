package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.pipe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeNode
  extends FormatNode
     with Node {
  var contents: Null
  var location: js.UndefOr[LocationRange] = js.undefined
  var name: pipe
  var nonTerminal: String
  var optional: Boolean
  var params: String
}

object PipeNode {
  @scala.inline
  def apply(
    contents: Null,
    name: pipe,
    nonTerminal: String,
    optional: Boolean,
    params: String,
    location: LocationRange = null
  ): PipeNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nonTerminal = nonTerminal.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipeNode]
  }
}

