package typings.ecmarkup

import typings.ecmarkup.anon.Line
import typings.ecmarkup.anon.SyntaxErrorlinenumberunde
import typings.std.Element
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecmarkup/lib/utils", JSImport.Namespace)
@js.native
object libUtilsMod extends js.Object {
  
  def attrValueLocation(
    source: js.UndefOr[scala.Nothing],
    loc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MarkupData.ElementLocation */ js.Any,
    attr: String
  ): Line = js.native
  def attrValueLocation(
    source: String,
    loc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MarkupData.ElementLocation */ js.Any,
    attr: String
  ): Line = js.native
  
  def offsetToLineAndColumn(string: String, offset: Double): Line = js.native
  
  @JSName("warnEmdFailure")
  def warnEmdFailure_warn(
    report: /* import warning: importer.ImportType#apply Failed type conversion: ecmarkup.ecmarkup/lib/Spec.Spec['warn'] */ js.Any,
    node: Element,
    e: SyntaxErrorlinenumberunde
  ): Unit = js.native
  @JSName("warnEmdFailure")
  def warnEmdFailure_warn(
    report: /* import warning: importer.ImportType#apply Failed type conversion: ecmarkup.ecmarkup/lib/Spec.Spec['warn'] */ js.Any,
    node: Text,
    e: SyntaxErrorlinenumberunde
  ): Unit = js.native
  
  def wrapEmdFailure(src: String): String = js.native
}
