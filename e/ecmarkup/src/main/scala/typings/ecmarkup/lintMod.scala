package typings.ecmarkup

import typings.ecmarkup.algorithmErrorReporterTypeMod.Reporter
import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkup/lib/lint/lint", JSImport.Namespace)
@js.native
object lintMod extends js.Object {
  def lint(report: Reporter, sourceText: String, dom: js.Any, document: Document): Unit = js.native
}

