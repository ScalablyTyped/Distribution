package typings.ejWebAll.ej.ReportViewer

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExcelFormats extends js.Object

@JSGlobal("ej.ReportViewer.ExcelFormats")
@js.native
object ExcelFormats extends js.Object {
  ///Specifies the Excel2007 property in ExcelFormats to get specified version of exported format.
  @js.native
  sealed trait Excel2007 extends ExcelFormats
  
  ///Specifies the Excel2010 property in ExcelFormats to get specified version of exported format.
  @js.native
  sealed trait Excel2010 extends ExcelFormats
  
  ///Specifies the Excel2013 property in ExcelFormats to get specified version of exported format.
  @js.native
  sealed trait Excel2013 extends ExcelFormats
  
  ///Specifies the Excel97to2003 property in ExcelFormats to get specified version of exported format.
  @js.native
  sealed trait Excel97to2003 extends ExcelFormats
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExcelFormats with Double] = js.native
  /* 1 */ @js.native
  object Excel2007 extends TopLevel[Excel2007 with Double]
  
  /* 2 */ @js.native
  object Excel2010 extends TopLevel[Excel2010 with Double]
  
  /* 3 */ @js.native
  object Excel2013 extends TopLevel[Excel2013 with Double]
  
  /* 0 */ @js.native
  object Excel97to2003 extends TopLevel[Excel97to2003 with Double]
  
}

