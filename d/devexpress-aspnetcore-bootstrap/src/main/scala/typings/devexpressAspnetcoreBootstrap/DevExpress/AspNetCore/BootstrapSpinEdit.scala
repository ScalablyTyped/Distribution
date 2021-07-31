package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.buttonClick
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.keyDown
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.keyPress
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.keyUp
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.numberChanged
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.textChanged
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.userInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapSpinEdit
  extends StObject
     with BootstrapClientEdit {
  
  def getButtonVisible(number: Double): Boolean = js.native
  
  def getCaretPosition(): Double = js.native
  
  def getMaxValue(): Double = js.native
  
  def getMinValue(): Double = js.native
  
  def getNumber(): Double = js.native
  
  def getText(): String = js.native
  
  @JSName("off")
  def off_buttonClick(eventName: buttonClick): this.type = js.native
  @JSName("off")
  def off_buttonClick(
    eventName: buttonClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ButtonEditClickEventArgs], Unit]
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
  def off_numberChanged(eventName: numberChanged): this.type = js.native
  @JSName("off")
  def off_numberChanged(
    eventName: numberChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
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
  def on_numberChanged(
    eventName: numberChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
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
  def once_numberChanged(
    eventName: numberChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
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
  
  def setMaxValue(value: Double): Unit = js.native
  
  def setMinValue(value: Double): Unit = js.native
  
  def setNumber(number: Double): Unit = js.native
  
  def setSelection(startPos: Double, endPos: Double, scrollToSelection: Boolean): Unit = js.native
  
  def setText(text: String): Unit = js.native
  
  def setValue(number: Double): Unit = js.native
}
