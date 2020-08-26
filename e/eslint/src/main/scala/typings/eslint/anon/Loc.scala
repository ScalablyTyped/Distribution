package typings.eslint.anon

import typings.eslint.mod.AST.SourceLocation
import typings.eslint.mod.Rule.ReportDescriptorLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Loc extends ReportDescriptorLocation {
  var loc: SourceLocation | Column = js.native
}

object Loc {
  @scala.inline
  def apply(loc: SourceLocation | Column): Loc = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loc]
  }
  @scala.inline
  implicit class LocOps[Self <: Loc] (val x: Self) extends AnyVal {
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
    def setLoc(value: SourceLocation | Column): Self = this.set("loc", value.asInstanceOf[js.Any])
  }
  
}

