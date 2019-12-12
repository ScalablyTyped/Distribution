package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.LabelType.Major
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.LabelType.Minor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelType extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.LabelType")
@js.native
object LabelType extends js.Object {
  //string
  @js.native
  sealed trait Major extends LabelType
  
  //string
  @js.native
  sealed trait Minor extends LabelType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelType with Double] = js.native
  /* 0 */ @js.native
  object Major extends TopLevel[Major with Double]
  
  /* 1 */ @js.native
  object Minor extends TopLevel[Minor with Double]
  
}

