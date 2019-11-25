package typings.geodesy.utmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.geodesy.geodesyStrings.N
  - typings.geodesy.geodesyStrings.S
*/
trait Hemisphere extends js.Object

object Hemisphere {
  @scala.inline
  def N: typings.geodesy.geodesyStrings.N = this.cast("N")
  @scala.inline
  def S: typings.geodesy.geodesyStrings.S = this.cast("S")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

