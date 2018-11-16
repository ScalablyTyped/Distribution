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
  
  val Exact: Exact with java.lang.String = js.native
  val Full: Full with java.lang.String = js.native
  val Half: Half with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.RatingNs.Precision with java.lang.String] = js.native
}

