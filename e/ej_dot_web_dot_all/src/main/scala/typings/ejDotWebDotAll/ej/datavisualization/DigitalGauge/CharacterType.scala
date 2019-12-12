package typings.ejDotWebDotAll.ej.datavisualization.DigitalGauge

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.DigitalGauge.CharacterType.EightCrossEightDotMatrix
import typings.ejDotWebDotAll.ej.datavisualization.DigitalGauge.CharacterType.EightCrossEightSquareMatrix
import typings.ejDotWebDotAll.ej.datavisualization.DigitalGauge.CharacterType.FourteenSegment
import typings.ejDotWebDotAll.ej.datavisualization.DigitalGauge.CharacterType.SevenSegment
import typings.ejDotWebDotAll.ej.datavisualization.DigitalGauge.CharacterType.SixteenSegment
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CharacterType with Double] = js.native
  /* 3 */ @js.native
  object EightCrossEightDotMatrix extends TopLevel[EightCrossEightDotMatrix with Double]
  
  /* 4 */ @js.native
  object EightCrossEightSquareMatrix extends TopLevel[EightCrossEightSquareMatrix with Double]
  
  /* 1 */ @js.native
  object FourteenSegment extends TopLevel[FourteenSegment with Double]
  
  /* 0 */ @js.native
  object SevenSegment extends TopLevel[SevenSegment with Double]
  
  /* 2 */ @js.native
  object SixteenSegment extends TopLevel[SixteenSegment with Double]
  
}

