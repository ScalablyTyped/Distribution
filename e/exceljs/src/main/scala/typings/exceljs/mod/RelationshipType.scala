package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RelationshipType extends StObject
@JSImport("exceljs", "RelationshipType")
@js.native
object RelationshipType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RelationshipType & Double] = js.native
  
  @js.native
  sealed trait CalcChain
    extends StObject
       with RelationshipType
  /* 3 */ val CalcChain: typings.exceljs.mod.RelationshipType.CalcChain & Double = js.native
  
  @js.native
  sealed trait Hyperlink
    extends StObject
       with RelationshipType
  /* 7 */ val Hyperlink: typings.exceljs.mod.RelationshipType.Hyperlink & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with RelationshipType
  /* 0 */ val None: typings.exceljs.mod.RelationshipType.None & Double = js.native
  
  @js.native
  sealed trait OfficeDocument
    extends StObject
       with RelationshipType
  /* 1 */ val OfficeDocument: typings.exceljs.mod.RelationshipType.OfficeDocument & Double = js.native
  
  @js.native
  sealed trait SharedStrings
    extends StObject
       with RelationshipType
  /* 4 */ val SharedStrings: typings.exceljs.mod.RelationshipType.SharedStrings & Double = js.native
  
  @js.native
  sealed trait Styles
    extends StObject
       with RelationshipType
  /* 5 */ val Styles: typings.exceljs.mod.RelationshipType.Styles & Double = js.native
  
  @js.native
  sealed trait Theme
    extends StObject
       with RelationshipType
  /* 6 */ val Theme: typings.exceljs.mod.RelationshipType.Theme & Double = js.native
  
  @js.native
  sealed trait Worksheet
    extends StObject
       with RelationshipType
  /* 2 */ val Worksheet: typings.exceljs.mod.RelationshipType.Worksheet & Double = js.native
}
