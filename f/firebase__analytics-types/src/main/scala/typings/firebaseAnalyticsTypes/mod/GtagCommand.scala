package typings.firebaseAnalyticsTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.event
  - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.set
  - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.config
*/
trait GtagCommand extends js.Object

object GtagCommand {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def config: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.config = this.cast("config")
  @scala.inline
  def event: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.event = this.cast("event")
  @scala.inline
  def set: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.set = this.cast("set")
}

