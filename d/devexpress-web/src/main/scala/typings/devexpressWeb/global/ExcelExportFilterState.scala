package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists values that specify the filter state&#39;s location in the exported Excel file.
  */
@JSGlobal("ExcelExportFilterState")
@js.native
open class ExcelExportFilterState ()
  extends StObject
     with typings.devexpressWeb.ExcelExportFilterState
object ExcelExportFilterState {
  
  /**
    * The filter state is placed below in the exported document.
    */
  /* static member */
  @JSGlobal("ExcelExportFilterState.below")
  @js.native
  val below: String = js.native
  
  /**
    * The filter state is not included in the exported document.
    */
  /* static member */
  @JSGlobal("ExcelExportFilterState.none")
  @js.native
  val none: String = js.native
  
  /**
    * The filter state is placed on a separate sheet in the exported workbook.
    */
  /* static member */
  @JSGlobal("ExcelExportFilterState.separatePage")
  @js.native
  val separatePage: String = js.native
}
