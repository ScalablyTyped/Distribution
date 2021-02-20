package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RelationshipType extends StObject
@JSImport("exceljs", "RelationshipType")
@js.native
object RelationshipType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RelationshipType with Double] = js.native
  
  @js.native
  sealed trait CalcChain extends RelationshipType
  /* 3 */ val CalcChain: typings.exceljs.mod.RelationshipType.CalcChain with Double = js.native
  
  @js.native
  sealed trait Hyperlink extends RelationshipType
  /* 7 */ val Hyperlink: typings.exceljs.mod.RelationshipType.Hyperlink with Double = js.native
  
  @js.native
  sealed trait None extends RelationshipType
  /* 0 */ val None: typings.exceljs.mod.RelationshipType.None with Double = js.native
  
  @js.native
  sealed trait OfficeDocument extends RelationshipType
  /* 1 */ val OfficeDocument: typings.exceljs.mod.RelationshipType.OfficeDocument with Double = js.native
  
  @js.native
  sealed trait SharedStrings extends RelationshipType
  /* 4 */ val SharedStrings: typings.exceljs.mod.RelationshipType.SharedStrings with Double = js.native
  
  @js.native
  sealed trait Styles extends RelationshipType
  /* 5 */ val Styles: typings.exceljs.mod.RelationshipType.Styles with Double = js.native
  
  @js.native
  sealed trait Theme extends RelationshipType
  /* 6 */ val Theme: typings.exceljs.mod.RelationshipType.Theme with Double = js.native
  
  @js.native
  sealed trait Worksheet extends RelationshipType
  /* 2 */ val Worksheet: typings.exceljs.mod.RelationshipType.Worksheet with Double = js.native
}
