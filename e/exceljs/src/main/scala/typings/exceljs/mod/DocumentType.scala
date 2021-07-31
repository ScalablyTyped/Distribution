package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DocumentType extends StObject
@JSImport("exceljs", "DocumentType")
@js.native
object DocumentType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DocumentType & Double] = js.native
  
  @js.native
  sealed trait Xlsx
    extends StObject
       with DocumentType
  /* 1 */ val Xlsx: typings.exceljs.mod.DocumentType.Xlsx & Double = js.native
}
