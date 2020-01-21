package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.beginCallback
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.callbackError
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.customHighlighting
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.endCallback
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.itemDoubleClick
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.itemFiltering
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.keyDown
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.keyPress
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.keyUp
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.selectedIndexChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapListBox")
@js.native
class BootstrapListBox () extends BootstrapClientEdit {
  def addItem(text: String): Double = js.native
   // tslint:disable-line:unified-signatures
  def addItem(text: String, value: js.Any): Double = js.native
   // tslint:disable-line:unified-signatures
  def addItem(text: String, value: js.Any, iconCssClass: String): Double = js.native
  def addItem(texts: js.Array[String]): Double = js.native
   // tslint:disable-line:unified-signatures
  def addItem(texts: js.Array[String], value: js.Any): Double = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def addItem(texts: js.Array[String], value: js.Any, iconCssClass: String): Double = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def addItemCssClass(index: Double, className: String): Unit = js.native
  def addItemTextCellCssClass(itemIndex: Double, textCellIndex: Double, className: String): Unit = js.native
  def beginUpdate(): Unit = js.native
  def clearItems(): Unit = js.native
  def endUpdate(): Unit = js.native
  def findItemByText(text: String): BootstrapListBoxItem | Null = js.native
  def findItemByValue(value: js.Any): BootstrapListBoxItem | Null = js.native
  def getItem(index: Double): BootstrapListBoxItem | Null = js.native
  def getItemBadgeIconCssClass(index: Double): String = js.native
  def getItemBadgeText(index: Double): String = js.native
  def getItemCount(): Double = js.native
  def getSelectedIndex(): Double = js.native
  def getSelectedIndices(): js.Array[Double] = js.native
  def getSelectedItem(): BootstrapListBoxItem | Null = js.native
  def getSelectedItems(): js.Array[BootstrapListBoxItem] = js.native
  def getSelectedValues(): js.Array[_] = js.native
  def insertItem(index: Double, text: String): Unit = js.native
   // tslint:disable-line:unified-signatures
  def insertItem(index: Double, text: String, value: js.Any): Unit = js.native
   // tslint:disable-line:unified-signatures
  def insertItem(index: Double, text: String, value: js.Any, iconCssClass: String): Unit = js.native
  def insertItem(index: Double, texts: js.Array[String]): Unit = js.native
   // tslint:disable-line:unified-signatures
  def insertItem(index: Double, texts: js.Array[String], value: js.Any): Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def insertItem(index: Double, texts: js.Array[String], value: js.Any, iconCssClass: String): Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def makeItemVisible(index: Double): Unit = js.native
  @JSName("off")
  def off_beginCallback(eventName: beginCallback): this.type = js.native
  @JSName("off")
  def off_beginCallback(
    eventName: beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_callbackError(eventName: callbackError): this.type = js.native
  @JSName("off")
  def off_callbackError(
    eventName: callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_customHighlighting(eventName: customHighlighting): this.type = js.native
  @JSName("off")
  def off_customHighlighting(
    eventName: customHighlighting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[ListEditCustomHighlightingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_endCallback(eventName: endCallback): this.type = js.native
  @JSName("off")
  def off_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_itemDoubleClick(eventName: itemDoubleClick): this.type = js.native
  @JSName("off")
  def off_itemDoubleClick(
    eventName: itemDoubleClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_itemFiltering(eventName: itemFiltering): this.type = js.native
  @JSName("off")
  def off_itemFiltering(
    eventName: itemFiltering,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ListEditItemFilteringEventArgs], Unit]
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
  def off_selectedIndexChanged(eventName: selectedIndexChanged): this.type = js.native
  @JSName("off")
  def off_selectedIndexChanged(
    eventName: selectedIndexChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_beginCallback(
    eventName: beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_callbackError(
    eventName: callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_customHighlighting(
    eventName: customHighlighting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[ListEditCustomHighlightingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_itemDoubleClick(
    eventName: itemDoubleClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_itemFiltering(
    eventName: itemFiltering,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ListEditItemFilteringEventArgs], Unit]
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
  def on_selectedIndexChanged(
    eventName: selectedIndexChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_beginCallback(
    eventName: beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_callbackError(
    eventName: callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_customHighlighting(
    eventName: customHighlighting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[ListEditCustomHighlightingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_itemDoubleClick(
    eventName: itemDoubleClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_itemFiltering(
    eventName: itemFiltering,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ListEditItemFilteringEventArgs], Unit]
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
  def once_selectedIndexChanged(
    eventName: selectedIndexChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  def performCallback(data: js.Any): js.Promise[Unit] = js.native
  def performCallback(data: js.Any, onSuccess: js.Function0[Unit]): Unit = js.native
  def removeItem(index: Double): Unit = js.native
  def removeItemCssClass(index: Double, className: String): Unit = js.native
  def removeItemTextCellCssClass(itemIndex: Double, textCellIndex: Double, className: String): Unit = js.native
  def selectAll(): Unit = js.native
  def selectIndices(indices: js.Array[Double]): Unit = js.native
  def selectItems(items: js.Array[BootstrapListBoxItem]): Unit = js.native
  def selectValues(values: js.Array[_]): Unit = js.native
  def setItemBadgeIconCssClass(index: Double, cssClass: String): Unit = js.native
  def setItemBadgeText(index: Double, text: String): Unit = js.native
  def setItemHtml(index: Double, html: String): Unit = js.native
  def setItemTextCellHtml(itemIndex: Double, textCellIndex: Double, html: String): Unit = js.native
  def setItemTextCellTooltip(itemIndex: Double, textCellIndex: Double, tooltip: String): Unit = js.native
  def setItemTooltip(index: Double, tooltip: String): Unit = js.native
  def setSelectedIndex(index: Double): Unit = js.native
  def setSelectedItem(item: BootstrapListBoxItem): Unit = js.native
  def unselectAll(): Unit = js.native
  def unselectIndices(indices: js.Array[Double]): Unit = js.native
  def unselectItems(items: js.Array[BootstrapListBoxItem]): Unit = js.native
  def unselectValues(values: js.Array[_]): Unit = js.native
}

