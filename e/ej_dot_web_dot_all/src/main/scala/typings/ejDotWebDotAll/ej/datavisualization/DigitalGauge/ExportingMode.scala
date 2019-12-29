package typings.ejDotWebDotAll.ej.datavisualization.DigitalGauge

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExportingMode extends js.Object

@JSGlobal("ej.datavisualization.DigitalGauge.ExportingMode")
@js.native
object ExportingMode extends js.Object {
  //string
  @js.native
  sealed trait ClientSide extends ExportingMode
  
  //string
  @js.native
  sealed trait ServerSide extends ExportingMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExportingMode with Double] = js.native
  /* 1 */ @js.native
  object ClientSide extends TopLevel[ClientSide with Double]
  
  /* 0 */ @js.native
  object ServerSide extends TopLevel[ServerSide with Double]
  
}

