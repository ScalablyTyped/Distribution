package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.PointerType.Marker
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.PointerType.Needle
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointerType with Double] = js.native
  /* 1 */ @js.native
  object Marker extends TopLevel[Marker with Double]
  
  /* 0 */ @js.native
  object Needle extends TopLevel[Needle with Double]
  
}

