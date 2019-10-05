package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PointerType extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.PointerType")
@js.native
object PointerType extends js.Object {
  //string
  @js.native
  sealed trait Marker extends PointerType
  
  //string
  @js.native
  sealed trait Needle extends PointerType
  
  /* 1 */ val Marker: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.PointerType.Marker with Double = js.native
  /* 0 */ val Needle: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.PointerType.Needle with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointerType with Double] = js.native
}

