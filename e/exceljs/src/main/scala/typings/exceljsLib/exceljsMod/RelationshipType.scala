package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RelationshipType extends js.Object

@JSImport("exceljs", "RelationshipType")
@js.native
object RelationshipType extends js.Object {
  @js.native
  sealed trait CalcChain
    extends exceljsLib.exceljsMod.RelationshipType
  
  @js.native
  sealed trait Hyperlink
    extends exceljsLib.exceljsMod.RelationshipType
  
  @js.native
  sealed trait None
    extends exceljsLib.exceljsMod.RelationshipType
  
  @js.native
  sealed trait OfficeDocument
    extends exceljsLib.exceljsMod.RelationshipType
  
  @js.native
  sealed trait SharedStrings
    extends exceljsLib.exceljsMod.RelationshipType
  
  @js.native
  sealed trait Styles
    extends exceljsLib.exceljsMod.RelationshipType
  
  @js.native
  sealed trait Theme
    extends exceljsLib.exceljsMod.RelationshipType
  
  @js.native
  sealed trait Worksheet
    extends exceljsLib.exceljsMod.RelationshipType
  
  /* 3 */ val CalcChain: CalcChain with scala.Double = js.native
  /* 7 */ val Hyperlink: Hyperlink with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val OfficeDocument: OfficeDocument with scala.Double = js.native
  /* 4 */ val SharedStrings: SharedStrings with scala.Double = js.native
  /* 5 */ val Styles: Styles with scala.Double = js.native
  /* 6 */ val Theme: Theme with scala.Double = js.native
  /* 2 */ val Worksheet: Worksheet with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[exceljsLib.exceljsMod.RelationshipType with scala.Double] = js.native
}

