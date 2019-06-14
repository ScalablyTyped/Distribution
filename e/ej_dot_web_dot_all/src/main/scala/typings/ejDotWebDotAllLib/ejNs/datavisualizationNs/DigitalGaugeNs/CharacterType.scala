package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CharacterType extends js.Object

@JSGlobal("ej.datavisualization.DigitalGauge.CharacterType")
@js.native
object CharacterType extends js.Object {
  //string
  @js.native
  sealed trait EightCrossEightDotMatrix
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs.CharacterType
  
  //string
  @js.native
  sealed trait EightCrossEightSquareMatrix
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs.CharacterType
  
  //string
  @js.native
  sealed trait FourteenSegment
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs.CharacterType
  
  //string
  @js.native
  sealed trait SevenSegment
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs.CharacterType
  
  //string
  @js.native
  sealed trait SixteenSegment
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs.CharacterType
  
  /* 3 */ val EightCrossEightDotMatrix: EightCrossEightDotMatrix with scala.Double = js.native
  /* 4 */ val EightCrossEightSquareMatrix: EightCrossEightSquareMatrix with scala.Double = js.native
  /* 1 */ val FourteenSegment: FourteenSegment with scala.Double = js.native
  /* 0 */ val SevenSegment: SevenSegment with scala.Double = js.native
  /* 2 */ val SixteenSegment: SixteenSegment with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs.CharacterType with scala.Double
  ] = js.native
}

