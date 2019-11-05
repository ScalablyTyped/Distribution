package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalAlignment extends js.Object

/**
  * An enumeration of the supported vertical alignment types.
  *
  * Use the VerticalAlignment enumeration to set the vertical alignment of table cells.
  *
  *     var body = DocumentApp.getActiveDocument().getBody();
  *
  *     // Append table containing two cells.
  *     var table = body.appendTable([['Top', 'Center', 'Bottom']]);
  *
  *     // Align the first cell's contents to the top.
  *     table.getCell(0, 0).setVerticalAlignment(DocumentApp.VerticalAlignment.TOP);
  *
  *     // Align the second cell's contents to the center.
  *     table.getCell(0, 1).setVerticalAlignment(DocumentApp.VerticalAlignment.CENTER);
  *
  *     // Align the third cell's contents to the bottom.
  *     table.getCell(0, 2).setVerticalAlignment(DocumentApp.VerticalAlignment.BOTTOM);
  */
@JSGlobal("GoogleAppsScript.Document.VerticalAlignment")
@js.native
object VerticalAlignment extends js.Object {
  @js.native
  sealed trait BOTTOM extends VerticalAlignment
  
  @js.native
  sealed trait CENTER extends VerticalAlignment
  
  @js.native
  sealed trait TOP extends VerticalAlignment
  
  /* 0 */ val BOTTOM: typings.googleDashAppsDashScript.GoogleAppsScript.Document.VerticalAlignment.BOTTOM with Double = js.native
  /* 1 */ val CENTER: typings.googleDashAppsDashScript.GoogleAppsScript.Document.VerticalAlignment.CENTER with Double = js.native
  /* 2 */ val TOP: typings.googleDashAppsDashScript.GoogleAppsScript.Document.VerticalAlignment.TOP with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VerticalAlignment with Double] = js.native
}

