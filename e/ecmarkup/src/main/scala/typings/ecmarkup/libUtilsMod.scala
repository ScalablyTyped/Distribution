package typings.ecmarkup

import typings.ecmarkup.anon.Line
import typings.ecmarkup.anon.SyntaxErrorlinenumberunde
import typings.std.Element
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("ecmarkup/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attrValueLocation(
    source: String,
    loc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MarkupData.ElementLocation */ js.Any,
    attr: String
  ): Line = (^.asInstanceOf[js.Dynamic].applyDynamic("attrValueLocation")(source.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], attr.asInstanceOf[js.Any])).asInstanceOf[Line]
  inline def attrValueLocation(
    source: Unit,
    loc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MarkupData.ElementLocation */ js.Any,
    attr: String
  ): Line = (^.asInstanceOf[js.Dynamic].applyDynamic("attrValueLocation")(source.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], attr.asInstanceOf[js.Any])).asInstanceOf[Line]
  
  inline def offsetToLineAndColumn(string: String, offset: Double): Line = (^.asInstanceOf[js.Dynamic].applyDynamic("offsetToLineAndColumn")(string.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Line]
  
  inline def warnEmdFailure_warn(
    report: /* import warning: importer.ImportType#apply Failed type conversion: ecmarkup.ecmarkup/lib/Spec.Spec['warn'] */ js.Any,
    node: Element,
    e: SyntaxErrorlinenumberunde
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warnEmdFailure")(report.asInstanceOf[js.Any], node.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def warnEmdFailure_warn(
    report: /* import warning: importer.ImportType#apply Failed type conversion: ecmarkup.ecmarkup/lib/Spec.Spec['warn'] */ js.Any,
    node: Text,
    e: SyntaxErrorlinenumberunde
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warnEmdFailure")(report.asInstanceOf[js.Any], node.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def wrapEmdFailure(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapEmdFailure")(src.asInstanceOf[js.Any]).asInstanceOf[String]
}
