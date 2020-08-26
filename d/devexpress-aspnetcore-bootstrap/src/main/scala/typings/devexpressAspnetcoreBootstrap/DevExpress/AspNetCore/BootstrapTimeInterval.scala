package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapTimeInterval extends js.Object {
  val instance: js.Any = js.native
  def contains(interval: BootstrapTimeInterval): Boolean = js.native
  def equals(interval: BootstrapTimeInterval): Boolean = js.native
  def getAllDay(): Boolean = js.native
  def getDuration(): Double = js.native
  def getEnd(): Date = js.native
  def getStart(): Date = js.native
  def intersectsWith(interval: BootstrapTimeInterval): Boolean = js.native
  def intersectsWithExcludingBounds(interval: BootstrapTimeInterval): Boolean = js.native
  def setAllDay(allDayValue: Boolean): Unit = js.native
  def setDuration(value: Double): Unit = js.native
  def setEnd(value: Date): Unit = js.native
  def setStart(value: Date): Unit = js.native
}

object BootstrapTimeInterval {
  @scala.inline
  def apply(
    contains: BootstrapTimeInterval => Boolean,
    equals: BootstrapTimeInterval => Boolean,
    getAllDay: () => Boolean,
    getDuration: () => Double,
    getEnd: () => Date,
    getStart: () => Date,
    instance: js.Any,
    intersectsWith: BootstrapTimeInterval => Boolean,
    intersectsWithExcludingBounds: BootstrapTimeInterval => Boolean,
    setAllDay: Boolean => Unit,
    setDuration: Double => Unit,
    setEnd: Date => Unit,
    setStart: Date => Unit
  ): BootstrapTimeInterval = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), equals = js.Any.fromFunction1(equals), getAllDay = js.Any.fromFunction0(getAllDay), getDuration = js.Any.fromFunction0(getDuration), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), instance = instance.asInstanceOf[js.Any], intersectsWith = js.Any.fromFunction1(intersectsWith), intersectsWithExcludingBounds = js.Any.fromFunction1(intersectsWithExcludingBounds), setAllDay = js.Any.fromFunction1(setAllDay), setDuration = js.Any.fromFunction1(setDuration), setEnd = js.Any.fromFunction1(setEnd), setStart = js.Any.fromFunction1(setStart))
    __obj.asInstanceOf[BootstrapTimeInterval]
  }
  @scala.inline
  implicit class BootstrapTimeIntervalOps[Self <: BootstrapTimeInterval] (val x: Self) extends AnyVal {
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
    def setContains(value: BootstrapTimeInterval => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    @scala.inline
    def setEquals(value: BootstrapTimeInterval => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAllDay(value: () => Boolean): Self = this.set("getAllDay", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDuration(value: () => Double): Self = this.set("getDuration", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEnd(value: () => Date): Self = this.set("getEnd", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStart(value: () => Date): Self = this.set("getStart", js.Any.fromFunction0(value))
    @scala.inline
    def setInstance(value: js.Any): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntersectsWith(value: BootstrapTimeInterval => Boolean): Self = this.set("intersectsWith", js.Any.fromFunction1(value))
    @scala.inline
    def setIntersectsWithExcludingBounds(value: BootstrapTimeInterval => Boolean): Self = this.set("intersectsWithExcludingBounds", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAllDay(value: Boolean => Unit): Self = this.set("setAllDay", js.Any.fromFunction1(value))
    @scala.inline
    def setSetDuration(value: Double => Unit): Self = this.set("setDuration", js.Any.fromFunction1(value))
    @scala.inline
    def setSetEnd(value: Date => Unit): Self = this.set("setEnd", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStart(value: Date => Unit): Self = this.set("setStart", js.Any.fromFunction1(value))
  }
  
}

