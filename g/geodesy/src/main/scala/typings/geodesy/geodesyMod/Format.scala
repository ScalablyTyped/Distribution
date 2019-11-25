package typings.geodesy.geodesyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.geodesy.geodesyStrings.d
  - typings.geodesy.geodesyStrings.dm
  - typings.geodesy.geodesyStrings.dms
*/
trait Format extends js.Object

object Format {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def d: typings.geodesy.geodesyStrings.d = this.cast("d")
  @scala.inline
  def dm: typings.geodesy.geodesyStrings.dm = this.cast("dm")
  @scala.inline
  def dms: typings.geodesy.geodesyStrings.dms = this.cast("dms")
}

