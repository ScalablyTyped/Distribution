package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.buttonClick
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.calendarCustomDisabledDate
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.closeUp
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.dateChanged
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.dropDown
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.keyDown
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.keyPress
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.keyUp
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.parseDate
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.queryCloseUp
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.textChanged
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.userInput
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapDateEdit")
@js.native
class BootstrapDateEdit () extends BootstrapClientEdit {
  def adjustDropDownWindow(): Unit = js.native
  def getButtonVisible(number: Double): Boolean = js.native
  def getCalendar(): BootstrapCalendar | Null = js.native
  def getCaretPosition(): Double = js.native
  def getDate(): Date = js.native
  def getMaxDate(): Date = js.native
  def getMinDate(): Date = js.native
  def getRangeDayCount(): Double = js.native
  def getText(): String = js.native
  def getTimeEdit(): BootstrapTimeEdit | Null = js.native
  def hideDropDown(): Unit = js.native
  @JSName("off")
  def off_buttonClick(eventName: buttonClick): this.type = js.native
  @JSName("off")
  def off_buttonClick(
    eventName: buttonClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ButtonEditClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_calendarCustomDisabledDate(eventName: calendarCustomDisabledDate): this.type = js.native
  @JSName("off")
  def off_calendarCustomDisabledDate(
    eventName: calendarCustomDisabledDate,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CalendarCustomDisabledDateEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_closeUp(eventName: closeUp): this.type = js.native
  @JSName("off")
  def off_closeUp(
    eventName: closeUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_dateChanged(eventName: dateChanged): this.type = js.native
  @JSName("off")
  def off_dateChanged(
    eventName: dateChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_dropDown(eventName: dropDown): this.type = js.native
  @JSName("off")
  def off_dropDown(
    eventName: dropDown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_keyDown(eventName: keyDown): this.type = js.native
  @JSName("off")
  def off_keyDown(
    eventName: keyDown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_keyPress(eventName: keyPress): this.type = js.native
  @JSName("off")
  def off_keyPress(
    eventName: keyPress,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_keyUp(eventName: keyUp): this.type = js.native
  @JSName("off")
  def off_keyUp(
    eventName: keyUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_parseDate(eventName: parseDate): this.type = js.native
  @JSName("off")
  def off_parseDate(
    eventName: parseDate,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ParseDateEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_queryCloseUp(eventName: queryCloseUp): this.type = js.native
  @JSName("off")
  def off_queryCloseUp(
    eventName: queryCloseUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_textChanged(eventName: textChanged): this.type = js.native
  @JSName("off")
  def off_textChanged(
    eventName: textChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_userInput(eventName: userInput): this.type = js.native
  @JSName("off")
  def off_userInput(
    eventName: userInput,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_buttonClick(
    eventName: buttonClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ButtonEditClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_calendarCustomDisabledDate(
    eventName: calendarCustomDisabledDate,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CalendarCustomDisabledDateEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_closeUp(
    eventName: closeUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_dateChanged(
    eventName: dateChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_dropDown(
    eventName: dropDown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_keyDown(
    eventName: keyDown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_keyPress(
    eventName: keyPress,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_keyUp(
    eventName: keyUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_parseDate(
    eventName: parseDate,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ParseDateEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_queryCloseUp(
    eventName: queryCloseUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_textChanged(
    eventName: textChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_userInput(
    eventName: userInput,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_buttonClick(
    eventName: buttonClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ButtonEditClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_calendarCustomDisabledDate(
    eventName: calendarCustomDisabledDate,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CalendarCustomDisabledDateEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_closeUp(
    eventName: closeUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_dateChanged(
    eventName: dateChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_dropDown(
    eventName: dropDown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_keyDown(
    eventName: keyDown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_keyPress(
    eventName: keyPress,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_keyUp(
    eventName: keyUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_parseDate(
    eventName: parseDate,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ParseDateEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_queryCloseUp(
    eventName: queryCloseUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_textChanged(
    eventName: textChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_userInput(
    eventName: userInput,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  def selectAll(): Unit = js.native
  def setButtonVisible(number: Double, value: Boolean): Unit = js.native
  def setCaretPosition(position: Double): Unit = js.native
  def setDate(date: Date): Unit = js.native
  def setMaxDate(date: Date): Unit = js.native
  def setMinDate(date: Date): Unit = js.native
  def setSelection(startPos: Double, endPos: Double, scrollToSelection: Boolean): Unit = js.native
  def setText(text: String): Unit = js.native
  def showDropDown(): Unit = js.native
}

