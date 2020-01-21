package typings.ejWebAll.ej.datavisualization.LinearGauge

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScaleType extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.ScaleType")
@js.native
object ScaleType extends js.Object {
  //string
  @js.native
  sealed trait Major extends ScaleType
  
  //string
  @js.native
  sealed trait Minor extends ScaleType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScaleType with Double] = js.native
  /* 0 */ @js.native
  object Major extends TopLevel[Major with Double]
  
  /* 1 */ @js.native
  object Minor extends TopLevel[Minor with Double]
  
}

