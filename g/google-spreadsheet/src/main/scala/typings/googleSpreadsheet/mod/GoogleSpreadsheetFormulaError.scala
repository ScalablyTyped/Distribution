package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-spreadsheet", "GoogleSpreadsheetFormulaError")
@js.native
open class GoogleSpreadsheetFormulaError protected ()
  extends StObject
     with CellError {
  def this(errorInfo: CellError) = this()
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var `type`: CellErrorType = js.native
}
