package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValueType extends js.Object

@JSImport("exceljs", "ValueType")
@js.native
object ValueType extends js.Object {
  @js.native
  sealed trait Boolean
    extends exceljsLib.exceljsMod.ValueType
  
  @js.native
  sealed trait Date
    extends exceljsLib.exceljsMod.ValueType
  
  @js.native
  sealed trait Error
    extends exceljsLib.exceljsMod.ValueType
  
  @js.native
  sealed trait Formula
    extends exceljsLib.exceljsMod.ValueType
  
  @js.native
  sealed trait Hyperlink
    extends exceljsLib.exceljsMod.ValueType
  
  @js.native
  sealed trait Merge
    extends exceljsLib.exceljsMod.ValueType
  
  @js.native
  sealed trait Null
    extends exceljsLib.exceljsMod.ValueType
  
  @js.native
  sealed trait Number
    extends exceljsLib.exceljsMod.ValueType
  
  @js.native
  sealed trait RichText
    extends exceljsLib.exceljsMod.ValueType
  
  @js.native
  sealed trait SharedString
    extends exceljsLib.exceljsMod.ValueType
  
  @js.native
  sealed trait String
    extends exceljsLib.exceljsMod.ValueType
  
  /* 9 */ val Boolean: Boolean with scala.Double = js.native
  /* 4 */ val Date: Date with scala.Double = js.native
  /* 10 */ val Error: Error with scala.Double = js.native
  /* 6 */ val Formula: Formula with scala.Double = js.native
  /* 5 */ val Hyperlink: Hyperlink with scala.Double = js.native
  /* 1 */ val Merge: Merge with scala.Double = js.native
  /* 0 */ val Null: Null with scala.Double = js.native
  /* 2 */ val Number: Number with scala.Double = js.native
  /* 8 */ val RichText: RichText with scala.Double = js.native
  /* 7 */ val SharedString: SharedString with scala.Double = js.native
  /* 3 */ val String: String with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[exceljsLib.exceljsMod.ValueType with scala.Double] = js.native
}

