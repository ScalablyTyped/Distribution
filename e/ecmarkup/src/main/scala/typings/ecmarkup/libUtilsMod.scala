package typings.ecmarkup

import typings.ecmarkup.anon.Line
import typings.ecmarkup.anon.SyntaxErrorlinenumberunde
import typings.std.Element
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("ecmarkup/lib/utils", "attrValueLocation")
  @js.native
  def attrValueLocation(
    source: js.UndefOr[scala.Nothing],
    loc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MarkupData.ElementLocation */ js.Any,
    attr: String
  ): Line = js.native
  @JSImport("ecmarkup/lib/utils", "attrValueLocation")
  @js.native
  def attrValueLocation(
    source: String,
    loc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MarkupData.ElementLocation */ js.Any,
    attr: String
  ): Line = js.native
  
  @JSImport("ecmarkup/lib/utils", "offsetToLineAndColumn")
  @js.native
  def offsetToLineAndColumn(string: String, offset: Double): Line = js.native
  
  @JSImport("ecmarkup/lib/utils", "warnEmdFailure")
  @js.native
  def warnEmdFailure_warn(
    report: /* import warning: importer.ImportType#apply Failed type conversion: ecmarkup.ecmarkup/lib/Spec.Spec['warn'] */ js.Any,
    node: Element,
    e: SyntaxErrorlinenumberunde
  ): Unit = js.native
  @JSImport("ecmarkup/lib/utils", "warnEmdFailure")
  @js.native
  def warnEmdFailure_warn(
    report: /* import warning: importer.ImportType#apply Failed type conversion: ecmarkup.ecmarkup/lib/Spec.Spec['warn'] */ js.Any,
    node: Text,
    e: SyntaxErrorlinenumberunde
  ): Unit = js.native
  
  @JSImport("ecmarkup/lib/utils", "wrapEmdFailure")
  @js.native
  def wrapEmdFailure(src: String): String = js.native
}
