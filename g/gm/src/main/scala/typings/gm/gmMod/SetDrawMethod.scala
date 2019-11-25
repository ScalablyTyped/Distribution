package typings.gm.gmMod

import typings.gm.gmStrings.point_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gm.gmStrings.point_
  - typings.gm.gmStrings.replace
  - typings.gm.gmStrings.floodfill
  - typings.gm.gmStrings.filltoborder
  - typings.gm.gmStrings.reset
*/
trait SetDrawMethod extends js.Object

object SetDrawMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def filltoborder: typings.gm.gmStrings.filltoborder = this.cast("filltoborder")
  @scala.inline
  def floodfill: typings.gm.gmStrings.floodfill = this.cast("floodfill")
  @scala.inline
  def point: point_ = this.cast("point")
  @scala.inline
  def replace: typings.gm.gmStrings.replace = this.cast("replace")
  @scala.inline
  def reset: typings.gm.gmStrings.reset = this.cast("reset")
}

