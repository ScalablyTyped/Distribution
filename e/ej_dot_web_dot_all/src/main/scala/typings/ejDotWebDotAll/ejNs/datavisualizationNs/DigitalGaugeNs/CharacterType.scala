package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DigitalGaugeNs

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
  sealed trait EightCrossEightDotMatrix extends CharacterType
  
  //string
  @js.native
  sealed trait EightCrossEightSquareMatrix extends CharacterType
  
  //string
  @js.native
  sealed trait FourteenSegment extends CharacterType
  
  //string
  @js.native
  sealed trait SevenSegment extends CharacterType
  
  //string
  @js.native
  sealed trait SixteenSegment extends CharacterType
  
  /* 3 */ val EightCrossEightDotMatrix: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DigitalGaugeNs.CharacterType.EightCrossEightDotMatrix with Double = js.native
  /* 4 */ val EightCrossEightSquareMatrix: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DigitalGaugeNs.CharacterType.EightCrossEightSquareMatrix with Double = js.native
  /* 1 */ val FourteenSegment: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DigitalGaugeNs.CharacterType.FourteenSegment with Double = js.native
  /* 0 */ val SevenSegment: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DigitalGaugeNs.CharacterType.SevenSegment with Double = js.native
  /* 2 */ val SixteenSegment: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DigitalGaugeNs.CharacterType.SixteenSegment with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CharacterType with Double] = js.native
}

