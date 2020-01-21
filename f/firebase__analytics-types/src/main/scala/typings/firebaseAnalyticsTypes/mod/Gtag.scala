package typings.firebaseAnalyticsTypes.mod

import typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.config
import typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.event
import typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gtag extends js.Object {
  def apply(command: config, targetId: String): Unit = js.native
  def apply(command: config, targetId: String, config: ControlParams): Unit = js.native
  def apply(command: config, targetId: String, config: CustomParams): Unit = js.native
  def apply(command: config, targetId: String, config: EventParams): Unit = js.native
  def apply(command: event, eventName: String): Unit = js.native
  def apply(command: event, eventName: String, eventParams: ControlParams): Unit = js.native
  def apply(command: event, eventName: String, eventParams: CustomParams): Unit = js.native
  def apply(command: event, eventName: String, eventParams: EventParams): Unit = js.native
  def apply(command: set, config: CustomParams): Unit = js.native
}

