package typings.dva.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.dva.dvaStrings.takeEvery
  - typings.dva.dvaStrings.takeLatest
  - typings.dva.dvaStrings.watcher
  - typings.dva.dvaStrings.throttle
*/
trait EffectType extends js.Object

object EffectType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def takeEvery: typings.dva.dvaStrings.takeEvery = this.cast("takeEvery")
  @scala.inline
  def takeLatest: typings.dva.dvaStrings.takeLatest = this.cast("takeLatest")
  @scala.inline
  def throttle: typings.dva.dvaStrings.throttle = this.cast("throttle")
  @scala.inline
  def watcher: typings.dva.dvaStrings.watcher = this.cast("watcher")
}

