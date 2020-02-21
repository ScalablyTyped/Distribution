package typings.docxTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Query = java.lang.String
  type QueryResolver = js.Function2[
    /* query */ js.UndefOr[typings.docxTemplates.mod.Query], 
    /* queryVars */ js.UndefOr[js.Any], 
    typings.docxTemplates.mod.ReportData | js.Promise[typings.docxTemplates.mod.ReportData]
  ]
  type ReportData = js.Any
}
