package typings.ecmarkup

import typings.ecmarkup.specMod.Spec
import typings.ecmarkup.specMod.Warning
import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecmarkup/lib/lint/lint", JSImport.Namespace)
@js.native
object lintMod extends js.Object {
  
  def lint(report: js.Function1[/* err */ Warning, Unit], sourceText: String, spec: Spec, document: Document): Unit = js.native
}
