package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowTransformFunction extends StObject {
  
  def apply(row: Rows): Rows = js.native
  def apply(row: Rows, callback: RowTransformCallback): Unit = js.native
}
