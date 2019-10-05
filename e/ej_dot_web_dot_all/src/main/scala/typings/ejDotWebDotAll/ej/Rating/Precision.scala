package typings.ejDotWebDotAll.ej.Rating

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Precision extends js.Object

@JSGlobal("ej.Rating.Precision")
@js.native
object Precision extends js.Object {
  ///string
  @js.native
  sealed trait Exact extends Precision
  
  ///string
  @js.native
  sealed trait Full extends Precision
  
  ///string
  @js.native
  sealed trait Half extends Precision
  
  /* 0 */ val Exact: typings.ejDotWebDotAll.ej.Rating.Precision.Exact with Double = js.native
  /* 1 */ val Full: typings.ejDotWebDotAll.ej.Rating.Precision.Full with Double = js.native
  /* 2 */ val Half: typings.ejDotWebDotAll.ej.Rating.Precision.Half with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Precision with Double] = js.native
}

