package typings.ejWebAll.ej.datavisualization.DigitalGauge

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
  
}

