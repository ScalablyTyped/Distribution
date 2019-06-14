package typings
package ejDotWebDotAllLib.ejNs.RatingNs

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
  sealed trait Exact
    extends ejDotWebDotAllLib.ejNs.RatingNs.Precision
  
  ///string
  @js.native
  sealed trait Full
    extends ejDotWebDotAllLib.ejNs.RatingNs.Precision
  
  ///string
  @js.native
  sealed trait Half
    extends ejDotWebDotAllLib.ejNs.RatingNs.Precision
  
  /* 0 */ val Exact: Exact with scala.Double = js.native
  /* 1 */ val Full: Full with scala.Double = js.native
  /* 2 */ val Half: Half with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.RatingNs.Precision with scala.Double] = js.native
}

