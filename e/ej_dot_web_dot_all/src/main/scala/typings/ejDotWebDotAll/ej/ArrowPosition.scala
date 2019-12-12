package typings.ejDotWebDotAll.ej

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.ArrowPosition.Bottom
import typings.ejDotWebDotAll.ej.ArrowPosition.Left
import typings.ejDotWebDotAll.ej.ArrowPosition.Right
import typings.ejDotWebDotAll.ej.ArrowPosition.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArrowPosition extends js.Object

@JSGlobal("ej.ArrowPosition")
@js.native
object ArrowPosition extends js.Object {
  //To set Bottom arrowPosition of the split button
  @js.native
  sealed trait Bottom extends ArrowPosition
  
  //To set Left arrowPosition of the split button
  @js.native
  sealed trait Left extends ArrowPosition
  
  //To set Right arrowPosition of the split button
  @js.native
  sealed trait Right extends ArrowPosition
  
  //To set Top arrowPosition of the split button
  @js.native
  sealed trait Top extends ArrowPosition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ArrowPosition with Double] = js.native
  /* 3 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 0 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 1 */ @js.native
  object Right extends TopLevel[Right with Double]
  
  /* 2 */ @js.native
  object Top extends TopLevel[Top with Double]
  
}

