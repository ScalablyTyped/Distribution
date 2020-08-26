package typings.exceljs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RelationshipType extends js.Object

@JSImport("exceljs", "RelationshipType")
@js.native
object RelationshipType extends js.Object {
  @js.native
  sealed trait CalcChain extends RelationshipType
  
  @js.native
  sealed trait Hyperlink extends RelationshipType
  
  @js.native
  sealed trait None extends RelationshipType
  
  @js.native
  sealed trait OfficeDocument extends RelationshipType
  
  @js.native
  sealed trait SharedStrings extends RelationshipType
  
  @js.native
  sealed trait Styles extends RelationshipType
  
  @js.native
  sealed trait Theme extends RelationshipType
  
  @js.native
  sealed trait Worksheet extends RelationshipType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RelationshipType with Double] = js.native
  /* 3 */ @js.native
  object CalcChain extends TopLevel[CalcChain with Double]
  
  /* 7 */ @js.native
  object Hyperlink extends TopLevel[Hyperlink with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object OfficeDocument extends TopLevel[OfficeDocument with Double]
  
  /* 4 */ @js.native
  object SharedStrings extends TopLevel[SharedStrings with Double]
  
  /* 5 */ @js.native
  object Styles extends TopLevel[Styles with Double]
  
  /* 6 */ @js.native
  object Theme extends TopLevel[Theme with Double]
  
  /* 2 */ @js.native
  object Worksheet
    extends TopLevel[typings.exceljs.mod.RelationshipType.Worksheet with Double]
  
}

