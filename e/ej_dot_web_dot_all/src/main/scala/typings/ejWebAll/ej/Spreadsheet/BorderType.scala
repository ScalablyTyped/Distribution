package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
