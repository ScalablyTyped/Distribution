package typings.googleAppsScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A script trigger.
  */
@js.native
trait Trigger extends js.Object {
  def getEventType(): EventType = js.native
  def getHandlerFunction(): String = js.native
  def getTriggerSource(): TriggerSource = js.native
  def getTriggerSourceId(): String = js.native
  def getUniqueId(): String = js.native
}

object Trigger {
  @scala.inline
  def apply(
    getEventType: () => EventType,
    getHandlerFunction: () => String,
    getTriggerSource: () => TriggerSource,
    getTriggerSourceId: () => String,
    getUniqueId: () => String
  ): Trigger = {
    val __obj = js.Dynamic.literal(getEventType = js.Any.fromFunction0(getEventType), getHandlerFunction = js.Any.fromFunction0(getHandlerFunction), getTriggerSource = js.Any.fromFunction0(getTriggerSource), getTriggerSourceId = js.Any.fromFunction0(getTriggerSourceId), getUniqueId = js.Any.fromFunction0(getUniqueId))
    __obj.asInstanceOf[Trigger]
  }
  @scala.inline
  implicit class TriggerOps[Self <: Trigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetEventType(value: () => EventType): Self = this.set("getEventType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHandlerFunction(value: () => String): Self = this.set("getHandlerFunction", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTriggerSource(value: () => TriggerSource): Self = this.set("getTriggerSource", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTriggerSourceId(value: () => String): Self = this.set("getTriggerSourceId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUniqueId(value: () => String): Self = this.set("getUniqueId", js.Any.fromFunction0(value))
  }
  
}

