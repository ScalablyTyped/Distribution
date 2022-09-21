package typings.excelColumnName

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("excel-column-name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def excelColToInt(colName: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("excelColToInt")(colName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def intToExcelCol(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("intToExcelCol")(number.asInstanceOf[js.Any]).asInstanceOf[String]
}
