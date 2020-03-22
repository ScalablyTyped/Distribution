package typings.gaze.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gaze.gazeStrings.auto
  - typings.gaze.gazeStrings.watch
  - typings.gaze.gazeStrings.poll
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  def auto: typings.gaze.gazeStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def poll: typings.gaze.gazeStrings.poll = this.cast("poll")
  @scala.inline
  def watch: typings.gaze.gazeStrings.watch = this.cast("watch")
}

