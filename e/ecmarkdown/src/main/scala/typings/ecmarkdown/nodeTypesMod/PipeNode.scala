package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.pipe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipeNode
  extends FormatNode
     with Node {
  var contents: Null = js.native
  var location: js.UndefOr[LocationRange] = js.native
  var name: pipe = js.native
  var nonTerminal: String = js.native
  var optional: Boolean = js.native
  var params: String = js.native
}

object PipeNode {
  @scala.inline
  def apply(contents: Null, name: pipe, nonTerminal: String, optional: Boolean, params: String): PipeNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nonTerminal = nonTerminal.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipeNode]
  }
  @scala.inline
  implicit class PipeNodeOps[Self <: PipeNode] (val x: Self) extends AnyVal {
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
    def setContents(value: Null): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: pipe): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonTerminal(value: String): Self = this.set("nonTerminal", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: String): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: LocationRange): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}

