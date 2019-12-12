package typings.ejDotWebDotAll.ej

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Direction.Left
import typings.ejDotWebDotAll.ej.Direction.None
import typings.ejDotWebDotAll.ej.Direction.Right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

@JSGlobal("ej.Direction")
@js.native
object Direction extends js.Object {
  //string
  @js.native
  sealed trait Left extends Direction
  
  //string
  @js.native
  sealed trait None extends Direction
  
  //string
  @js.native
  sealed trait Right extends Direction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Direction with Double] = js.native
  /* 0 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 1 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}

