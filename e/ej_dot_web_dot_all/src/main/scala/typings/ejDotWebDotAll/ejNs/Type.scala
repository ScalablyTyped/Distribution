package typings.ejDotWebDotAll.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSGlobal("ej.Type")
@js.native
object Type extends js.Object {
  @js.native
  sealed trait Overlay extends Type
  
  @js.native
  sealed trait Slide extends Type
  
  /* 0 */ val Overlay: typings.ejDotWebDotAll.ejNs.Type.Overlay with Double = js.native
  /* 1 */ val Slide: typings.ejDotWebDotAll.ejNs.Type.Slide with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
}

