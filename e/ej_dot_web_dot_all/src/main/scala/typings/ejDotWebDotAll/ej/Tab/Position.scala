package typings.ejDotWebDotAll.ej.Tab

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Tab.Position.Bottom
import typings.ejDotWebDotAll.ej.Tab.Position.Left
import typings.ejDotWebDotAll.ej.Tab.Position.Right
import typings.ejDotWebDotAll.ej.Tab.Position.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Position extends js.Object

@JSGlobal("ej.Tab.Position")
@js.native
object Position extends js.Object {
  ///Tab headers display to bottom position
  @js.native
  sealed trait Bottom extends Position
  
  ///Tab headers display to left position.
  @js.native
  sealed trait Left extends Position
  
  ///Tab headers display to right position.
  @js.native
  sealed trait Right extends Position
  
  ///Tab headers display to top position
  @js.native
  sealed trait Top extends Position
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Position with Double] = js.native
  /* 1 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 2 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 3 */ @js.native
  object Right extends TopLevel[Right with Double]
  
  /* 0 */ @js.native
  object Top extends TopLevel[Top with Double]
  
}

