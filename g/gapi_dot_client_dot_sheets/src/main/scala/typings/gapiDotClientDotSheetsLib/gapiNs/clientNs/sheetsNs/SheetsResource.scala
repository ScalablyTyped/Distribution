package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsResource extends js.Object {
  /**
    * Copies a single sheet from a spreadsheet to another spreadsheet.
    * Returns the properties of the newly created sheet.
    */
  def copyTo(request: gapiDotClientDotSheetsLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[SheetProperties]
}

object SheetsResource {
  @scala.inline
  def apply(
    copyTo: js.Function1[
      gapiDotClientDotSheetsLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[SheetProperties]
    ]
  ): SheetsResource = {
    val __obj = js.Dynamic.literal(copyTo = copyTo)
  
    __obj.asInstanceOf[SheetsResource]
  }
}

