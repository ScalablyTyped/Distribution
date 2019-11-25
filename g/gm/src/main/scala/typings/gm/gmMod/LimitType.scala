package typings.gm.gmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gm.gmStrings.disk
  - typings.gm.gmStrings.file
  - typings.gm.gmStrings.map
  - typings.gm.gmStrings.memory
  - typings.gm.gmStrings.pixels
  - typings.gm.gmStrings.threads
*/
trait LimitType extends js.Object

object LimitType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disk: typings.gm.gmStrings.disk = this.cast("disk")
  @scala.inline
  def file: typings.gm.gmStrings.file = this.cast("file")
  @scala.inline
  def map: typings.gm.gmStrings.map = this.cast("map")
  @scala.inline
  def memory: typings.gm.gmStrings.memory = this.cast("memory")
  @scala.inline
  def pixels: typings.gm.gmStrings.pixels = this.cast("pixels")
  @scala.inline
  def threads: typings.gm.gmStrings.threads = this.cast("threads")
}

