package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapListBox")
@js.native
class BootstrapListBox () extends BootstrapClientEdit {
  def addItem(text: java.lang.String): scala.Double = js.native
   // tslint:disable-line:unified-signatures
  def addItem(text: java.lang.String, value: js.Any): scala.Double = js.native
   // tslint:disable-line:unified-signatures
  def addItem(text: java.lang.String, value: js.Any, iconCssClass: java.lang.String): scala.Double = js.native
  def addItem(texts: js.Array[java.lang.String]): scala.Double = js.native
   // tslint:disable-line:unified-signatures
  def addItem(texts: js.Array[java.lang.String], value: js.Any): scala.Double = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def addItem(texts: js.Array[java.lang.String], value: js.Any, iconCssClass: java.lang.String): scala.Double = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def addItemCssClass(index: scala.Double, className: java.lang.String): scala.Unit = js.native
  def addItemTextCellCssClass(itemIndex: scala.Double, textCellIndex: scala.Double, className: java.lang.String): scala.Unit = js.native
  def beginUpdate(): scala.Unit = js.native
  def clearItems(): scala.Unit = js.native
  def endUpdate(): scala.Unit = js.native
  def findItemByText(text: java.lang.String): BootstrapListBoxItem | scala.Null = js.native
  def findItemByValue(value: js.Any): BootstrapListBoxItem | scala.Null = js.native
  def getItem(index: scala.Double): BootstrapListBoxItem | scala.Null = js.native
  def getItemBadgeIconCssClass(index: scala.Double): java.lang.String = js.native
  def getItemBadgeText(index: scala.Double): java.lang.String = js.native
  def getItemCount(): scala.Double = js.native
  def getSelectedIndex(): scala.Double = js.native
  def getSelectedIndices(): js.Array[scala.Double] = js.native
  def getSelectedItem(): BootstrapListBoxItem | scala.Null = js.native
  def getSelectedItems(): js.Array[BootstrapListBoxItem] = js.native
  def getSelectedValues(): js.Array[_] = js.native
  def insertItem(index: scala.Double, text: java.lang.String): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def insertItem(index: scala.Double, text: java.lang.String, value: js.Any): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def insertItem(index: scala.Double, text: java.lang.String, value: js.Any, iconCssClass: java.lang.String): scala.Unit = js.native
  def insertItem(index: scala.Double, texts: js.Array[java.lang.String]): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def insertItem(index: scala.Double, texts: js.Array[java.lang.String], value: js.Any): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def insertItem(
    index: scala.Double,
    texts: js.Array[java.lang.String],
    value: js.Any,
    iconCssClass: java.lang.String
  ): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def makeItemVisible(index: scala.Double): scala.Unit = js.native
  @JSName("off")
  def off_beginCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.beginCallback
  ): this.type = js.native
  @JSName("off")
  def off_beginCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_callbackError(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.callbackError
  ): this.type = js.native
  @JSName("off")
  def off_callbackError(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_customHighlighting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.customHighlighting
  ): this.type = js.native
  @JSName("off")
  def off_customHighlighting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.customHighlighting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[ListEditCustomHighlightingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback
  ): this.type = js.native
  @JSName("off")
  def off_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_itemDoubleClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.itemDoubleClick
  ): this.type = js.native
  @JSName("off")
  def off_itemDoubleClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.itemDoubleClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_itemFiltering(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.itemFiltering
  ): this.type = js.native
  @JSName("off")
  def off_itemFiltering(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.itemFiltering,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[ListEditItemFilteringEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_keyDown(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.keyDown
  ): this.type = js.native
  @JSName("off")
  def off_keyDown(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.keyDown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_keyPress(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.keyPress
  ): this.type = js.native
  @JSName("off")
  def off_keyPress(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.keyPress,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_keyUp(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.keyUp
  ): this.type = js.native
  @JSName("off")
  def off_keyUp(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.keyUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_selectedIndexChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.selectedIndexChanged
  ): this.type = js.native
  @JSName("off")
  def off_selectedIndexChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.selectedIndexChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_beginCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_callbackError(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_customHighlighting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.customHighlighting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[ListEditCustomHighlightingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_itemDoubleClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.itemDoubleClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_itemFiltering(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.itemFiltering,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[ListEditItemFilteringEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_keyDown(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.keyDown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_keyPress(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.keyPress,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_keyUp(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.keyUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_selectedIndexChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.selectedIndexChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_beginCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_callbackError(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_customHighlighting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.customHighlighting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[ListEditCustomHighlightingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_itemDoubleClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.itemDoubleClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_itemFiltering(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.itemFiltering,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[ListEditItemFilteringEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_keyDown(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.keyDown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_keyPress(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.keyPress,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_keyUp(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.keyUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_selectedIndexChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.selectedIndexChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], scala.Unit]
  ): this.type = js.native
  def performCallback(data: js.Any): js.Promise[scala.Unit] = js.native
  def performCallback(data: js.Any, onSuccess: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeItem(index: scala.Double): scala.Unit = js.native
  def removeItemCssClass(index: scala.Double, className: java.lang.String): scala.Unit = js.native
  def removeItemTextCellCssClass(itemIndex: scala.Double, textCellIndex: scala.Double, className: java.lang.String): scala.Unit = js.native
  def selectAll(): scala.Unit = js.native
  def selectIndices(indices: js.Array[scala.Double]): scala.Unit = js.native
  def selectItems(items: js.Array[BootstrapListBoxItem]): scala.Unit = js.native
  def selectValues(values: js.Array[_]): scala.Unit = js.native
  def setItemBadgeIconCssClass(index: scala.Double, cssClass: java.lang.String): scala.Unit = js.native
  def setItemBadgeText(index: scala.Double, text: java.lang.String): scala.Unit = js.native
  def setItemHtml(index: scala.Double, html: java.lang.String): scala.Unit = js.native
  def setItemTextCellHtml(itemIndex: scala.Double, textCellIndex: scala.Double, html: java.lang.String): scala.Unit = js.native
  def setItemTextCellTooltip(itemIndex: scala.Double, textCellIndex: scala.Double, tooltip: java.lang.String): scala.Unit = js.native
  def setItemTooltip(index: scala.Double, tooltip: java.lang.String): scala.Unit = js.native
  def setSelectedIndex(index: scala.Double): scala.Unit = js.native
  def setSelectedItem(item: BootstrapListBoxItem): scala.Unit = js.native
  def unselectAll(): scala.Unit = js.native
  def unselectIndices(indices: js.Array[scala.Double]): scala.Unit = js.native
  def unselectItems(items: js.Array[BootstrapListBoxItem]): scala.Unit = js.native
  def unselectValues(values: js.Array[_]): scala.Unit = js.native
}

