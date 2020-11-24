package typings.googleAppsScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HorizontalAlignment extends js.Object
/**
  * An enumeration of the supported horizontal alignment types.
  *
  * Use the HorizontalAlignment enumeration to manipulate the alignment of Paragraph contents.
  *
  *     var body = DocumentApp.getActiveDocument().getBody();
  *
  *     // Insert a paragraph and a table at the start of document.
  *     var par1 = body.insertParagraph(0, "Center");
  *     var table = body.insertTable(1, [['Left', 'Right']]);
  *     var par2 = table.getCell(0, 0).getChild(0).asParagraph();
  *     var par3 = table.getCell(0, 0).getChild(0).asParagraph();
  *
  *     // Center align the first paragraph.
  *     par1.setAlignment(DocumentApp.HorizontalAlignment.CENTER);
  *
  *     // Left align the first cell.
  *     par2.setAlignment(DocumentApp.HorizontalAlignment.LEFT);
  *
  *     // Right align the second cell.
  *     par3.setAlignment(DocumentApp.HorizontalAlignment.RIGHT);
  */
@JSGlobal("GoogleAppsScript.Document.HorizontalAlignment")
@js.native
object HorizontalAlignment extends js.Object {
  
  @js.native
  sealed trait CENTER extends HorizontalAlignment
  
  @js.native
  sealed trait JUSTIFY extends HorizontalAlignment
  
  @js.native
  sealed trait LEFT extends HorizontalAlignment
  
  @js.native
  sealed trait RIGHT extends HorizontalAlignment
}
