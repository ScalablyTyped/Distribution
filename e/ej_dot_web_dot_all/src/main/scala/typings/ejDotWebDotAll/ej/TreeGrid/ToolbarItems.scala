package typings.ejDotWebDotAll.ej.TreeGrid

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.TreeGrid.ToolbarItems.Add
import typings.ejDotWebDotAll.ej.TreeGrid.ToolbarItems.Cancel
import typings.ejDotWebDotAll.ej.TreeGrid.ToolbarItems.CollapseAll
import typings.ejDotWebDotAll.ej.TreeGrid.ToolbarItems.Delete
import typings.ejDotWebDotAll.ej.TreeGrid.ToolbarItems.Edit
import typings.ejDotWebDotAll.ej.TreeGrid.ToolbarItems.ExcelExport
import typings.ejDotWebDotAll.ej.TreeGrid.ToolbarItems.ExpandAll
import typings.ejDotWebDotAll.ej.TreeGrid.ToolbarItems.PdfExport
import typings.ejDotWebDotAll.ej.TreeGrid.ToolbarItems.Search
import typings.ejDotWebDotAll.ej.TreeGrid.ToolbarItems.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToolbarItems extends js.Object

@JSGlobal("ej.TreeGrid.ToolbarItems")
@js.native
object ToolbarItems extends js.Object {
  ///Enables the add icon in toolbar
  @js.native
  sealed trait Add extends ToolbarItems
  
  ///Enables the cancel icon in toolbar
  @js.native
  sealed trait Cancel extends ToolbarItems
  
  ///Enables the collapse all icon in toolbar
  @js.native
  sealed trait CollapseAll extends ToolbarItems
  
  ///Enables the edit icon in toolbar
  @js.native
  sealed trait Delete extends ToolbarItems
  
  ///Enables the edit icon in toolbar
  @js.native
  sealed trait Edit extends ToolbarItems
  
  ///Enables the excel export icon in toolbar
  @js.native
  sealed trait ExcelExport extends ToolbarItems
  
  ///Enables the expand all icon in toolbar
  @js.native
  sealed trait ExpandAll extends ToolbarItems
  
  ///Enables the PDF export icon in toolbar
  @js.native
  sealed trait PdfExport extends ToolbarItems
  
  ///Enables the printing icon in toolbar
  @js.native
  sealed trait Print extends ToolbarItems
  
  ///Enables the search textbox in toolbar
  @js.native
  sealed trait Search extends ToolbarItems
  
  ///Enables the update icon in toolbar
  @js.native
  sealed trait Update extends ToolbarItems
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ToolbarItems with Double] = js.native
  /* 0 */ @js.native
  object Add extends TopLevel[Add with Double]
  
  /* 4 */ @js.native
  object Cancel extends TopLevel[Cancel with Double]
  
  /* 6 */ @js.native
  object CollapseAll extends TopLevel[CollapseAll with Double]
  
  /* 2 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  /* 1 */ @js.native
  object Edit extends TopLevel[Edit with Double]
  
  /* 8 */ @js.native
  object ExcelExport extends TopLevel[ExcelExport with Double]
  
  /* 5 */ @js.native
  object ExpandAll extends TopLevel[ExpandAll with Double]
  
  /* 7 */ @js.native
  object PdfExport extends TopLevel[PdfExport with Double]
  
  /* 9 */ @js.native
  object Print
    extends TopLevel[typings.ejDotWebDotAll.ej.TreeGrid.ToolbarItems.Print with Double]
  
  /* 10 */ @js.native
  object Search extends TopLevel[Search with Double]
  
  /* 3 */ @js.native
  object Update extends TopLevel[Update with Double]
  
}

