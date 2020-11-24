package typings.exceljs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RelationshipType extends js.Object
@JSImport("exceljs", "RelationshipType")
@js.native
object RelationshipType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RelationshipType with Double] = js.native
  
  @js.native
  sealed trait CalcChain extends RelationshipType
  /* 3 */ @js.native
  object CalcChain extends TopLevel[CalcChain with Double]
  
  @js.native
  sealed trait Hyperlink extends RelationshipType
  /* 7 */ @js.native
  object Hyperlink extends TopLevel[Hyperlink with Double]
  
  @js.native
  sealed trait None extends RelationshipType
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait OfficeDocument extends RelationshipType
  /* 1 */ @js.native
  object OfficeDocument extends TopLevel[OfficeDocument with Double]
  
  @js.native
  sealed trait SharedStrings extends RelationshipType
  /* 4 */ @js.native
  object SharedStrings extends TopLevel[SharedStrings with Double]
  
  @js.native
  sealed trait Styles extends RelationshipType
  /* 5 */ @js.native
  object Styles extends TopLevel[Styles with Double]
  
  @js.native
  sealed trait Theme extends RelationshipType
  /* 6 */ @js.native
  object Theme extends TopLevel[Theme with Double]
  
  @js.native
  sealed trait Worksheet extends RelationshipType
  /* 2 */ @js.native
  object Worksheet
    extends TopLevel[typings.exceljs.mod.RelationshipType.Worksheet with Double]
}
