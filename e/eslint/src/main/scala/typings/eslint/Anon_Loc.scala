package typings.eslint

import typings.eslint.eslintMod.AST.SourceLocation
import typings.eslint.eslintMod.Rule.ReportDescriptorLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Loc extends ReportDescriptorLocation {
  var loc: SourceLocation | Anon_Column
}

object Anon_Loc {
  @scala.inline
  def apply(loc: SourceLocation | Anon_Column): Anon_Loc = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Loc]
  }
}

