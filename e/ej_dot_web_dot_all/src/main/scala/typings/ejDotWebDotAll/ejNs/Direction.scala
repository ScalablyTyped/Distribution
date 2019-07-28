package typings.ejDotWebDotAll.ejNs

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
  
  /* 0 */ val Left: typings.ejDotWebDotAll.ejNs.Direction.Left with Double = js.native
  /* 1 */ val None: typings.ejDotWebDotAll.ejNs.Direction.None with Double = js.native
  /* 2 */ val Right: typings.ejDotWebDotAll.ejNs.Direction.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Direction with Double] = js.native
}

