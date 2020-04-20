package typings.eslint

import typings.eslint.mod.AST.SourceLocation
import typings.eslint.mod.Rule.ReportDescriptorLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLoc extends ReportDescriptorLocation {
  var loc: SourceLocation | AnonColumn
}

object AnonLoc {
  @scala.inline
  def apply(loc: SourceLocation | AnonColumn): AnonLoc = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLoc]
  }
}

