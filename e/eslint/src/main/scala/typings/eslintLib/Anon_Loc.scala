package typings
package eslintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Loc
  extends eslintLib.eslintMod.RuleNs.ReportDescriptorLocation {
  var loc: eslintLib.eslintMod.ASTNs.SourceLocation | Anon_Column
}

object Anon_Loc {
  @scala.inline
  def apply(loc: eslintLib.eslintMod.ASTNs.SourceLocation | Anon_Column): Anon_Loc = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Loc]
  }
}

