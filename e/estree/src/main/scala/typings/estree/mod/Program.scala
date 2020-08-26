package typings.estree.mod

import typings.estree.estreeStrings.module
import typings.estree.estreeStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Program
  extends BaseNode
     with Node {
  var body: js.Array[Directive | Statement | ModuleDeclaration] = js.native
  var comments: js.UndefOr[js.Array[Comment]] = js.native
  var sourceType: script | module = js.native
  @JSName("type")
  var type_Program: typings.estree.estreeStrings.Program = js.native
}

object Program {
  @scala.inline
  def apply(
    body: js.Array[Directive | Statement | ModuleDeclaration],
    sourceType: script | module,
    `type`: typings.estree.estreeStrings.Program
  ): Program = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Program]
  }
  @scala.inline
  implicit class ProgramOps[Self <: Program] (val x: Self) extends AnyVal {
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
    def setBodyVarargs(value: (Directive | Statement | ModuleDeclaration)*): Self = this.set("body", js.Array(value :_*))
    @scala.inline
    def setBody(value: js.Array[Directive | Statement | ModuleDeclaration]): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceType(value: script | module): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.estree.estreeStrings.Program): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommentsVarargs(value: Comment*): Self = this.set("comments", js.Array(value :_*))
    @scala.inline
    def setComments(value: js.Array[Comment]): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
  }
  
}

