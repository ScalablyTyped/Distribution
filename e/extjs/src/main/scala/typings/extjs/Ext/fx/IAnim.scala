package typings.extjs.Ext.fx

import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnim extends IObservable {
  /** [Config Option] (Boolean) */
  var alternate: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Function) */
  var callback: js.UndefOr[js.Any] = js.native
  /** [Property] (Number) */
  var currentIteration: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var delay: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var duration: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var easing: js.UndefOr[String] = js.native
  /** [Method] Fire afteranimate event and end the animation  */
  var end: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Object) */
  var from: js.UndefOr[js.Any] = js.native
  /** [Property] (Boolean) */
  var isAnimation: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var iterations: js.UndefOr[Double] = js.native
  /** [Config Option] (Object) */
  var keyframes: js.UndefOr[js.Any] = js.native
  /** [Property] (Boolean) */
  var paused: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var reverse: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var running: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Function) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Property] (Date) */
  var startTime: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Object) */
  var target: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var to: js.UndefOr[js.Any] = js.native
}

object IAnim {
  @scala.inline
  def apply(): IAnim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnim]
  }
  @scala.inline
  implicit class IAnimOps[Self <: IAnim] (val x: Self) extends AnyVal {
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
    def setAlternate(value: Boolean): Self = this.set("alternate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternate: Self = this.set("alternate", js.undefined)
    @scala.inline
    def setCallback(value: js.Any): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setCurrentIteration(value: Double): Self = this.set("currentIteration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentIteration: Self = this.set("currentIteration", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setDynamic(value: Boolean): Self = this.set("dynamic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamic: Self = this.set("dynamic", js.undefined)
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setFrom(value: js.Any): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setIsAnimation(value: Boolean): Self = this.set("isAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAnimation: Self = this.set("isAnimation", js.undefined)
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
    @scala.inline
    def setKeyframes(value: js.Any): Self = this.set("keyframes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyframes: Self = this.set("keyframes", js.undefined)
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaused: Self = this.set("paused", js.undefined)
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    @scala.inline
    def setRunning(value: Boolean): Self = this.set("running", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunning: Self = this.set("running", js.undefined)
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setStartTime(value: js.Any): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTo(value: js.Any): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

