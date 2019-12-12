package typings.ejDotWebDotAll.ej.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Spreadsheet.SelectionType.Column
import typings.ejDotWebDotAll.ej.Spreadsheet.SelectionType.Default
import typings.ejDotWebDotAll.ej.Spreadsheet.SelectionType.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionType extends js.Object

@JSGlobal("ej.Spreadsheet.SelectionType")
@js.native
object SelectionType extends js.Object {
  ///To select only Column in Spreadsheet.
  @js.native
  sealed trait Column extends SelectionType
  
  ///To select both Column/Row in Spreadsheet.
  @js.native
  sealed trait Default extends SelectionType
  
  ///To select only Row in Spreadsheet.
  @js.native
  sealed trait Row extends SelectionType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionType with Double] = js.native
  /* 0 */ @js.native
  object Column extends TopLevel[Column with Double]
  
  /* 2 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 1 */ @js.native
  object Row extends TopLevel[Row with Double]
  
}

