package typings.ejDotWebDotAll.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AnimationType extends js.Object

@JSGlobal("ej.AnimationType")
@js.native
object AnimationType extends js.Object {
  //string
  @js.native
  sealed trait Default extends AnimationType
  
  //string
  @js.native
  sealed trait None extends AnimationType
  
  /* 0 */ val Default: typings.ejDotWebDotAll.ejNs.AnimationType.Default with Double = js.native
  /* 1 */ val None: typings.ejDotWebDotAll.ejNs.AnimationType.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AnimationType with Double] = js.native
}

