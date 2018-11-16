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
  
  val EightCrossEightDotMatrix: EightCrossEightDotMatrix with java.lang.String = js.native
  val EightCrossEightSquareMatrix: EightCrossEightSquareMatrix with java.lang.String = js.native
  val FourteenSegment: FourteenSegment with java.lang.String = js.native
  val SevenSegment: SevenSegment with java.lang.String = js.native
  val SixteenSegment: SixteenSegment with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs.CharacterType with java.lang.String
  ] = js.native
}

