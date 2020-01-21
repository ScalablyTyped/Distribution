package typings.ejWebAll.ej.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BorderType extends js.Object

@JSGlobal("ej.Spreadsheet.BorderType")
@js.native
object BorderType extends js.Object {
  ///To apply all border for the given range of cell.
  @js.native
  sealed trait AllBorder extends BorderType
  
  ///To apply bottom border for the given range of cell.
  @js.native
  sealed trait Bottom extends BorderType
  
  ///To apply left border for the given range of cell.
  @js.native
  sealed trait Left extends BorderType
  
  ///To apply outside border for the given range of cell.
  @js.native
  sealed trait OutSide extends BorderType
  
  ///To apply right border for the given range of cell.
  @js.native
  sealed trait Right extends BorderType
  
  ///To apply thick bottom border for the given range of cell.
  @js.native
  sealed trait ThickBottom extends BorderType
  
  ///To apply thick box border for the given range of cell.
  @js.native
  sealed trait ThickBox extends BorderType
  
  ///To apply top border for the given range of cell.
  @js.native
  sealed trait Top extends BorderType
  
  ///To apply top and bottom border for the given range of cell.
  @js.native
  sealed trait TopandBottom extends BorderType
  
  ///To apply top and thick bottom border for the given range of cell.
  @js.native
  sealed trait TopandThickBottom extends BorderType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BorderType with Double] = js.native
  /* 5 */ @js.native
  object AllBorder extends TopLevel[AllBorder with Double]
  
  /* 3 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 1 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 4 */ @js.native
  object OutSide extends TopLevel[OutSide with Double]
  
  /* 2 */ @js.native
  object Right extends TopLevel[Right with Double]
  
  /* 7 */ @js.native
  object ThickBottom extends TopLevel[ThickBottom with Double]
  
  /* 6 */ @js.native
  object ThickBox extends TopLevel[ThickBox with Double]
  
  /* 0 */ @js.native
  object Top extends TopLevel[Top with Double]
  
  /* 8 */ @js.native
  object TopandBottom extends TopLevel[TopandBottom with Double]
  
  /* 9 */ @js.native
  object TopandThickBottom extends TopLevel[TopandThickBottom with Double]
  
}

