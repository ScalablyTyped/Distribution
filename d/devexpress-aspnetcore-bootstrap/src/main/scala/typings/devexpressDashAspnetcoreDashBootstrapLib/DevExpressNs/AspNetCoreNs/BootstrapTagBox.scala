package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapTagBox")
@js.native
class BootstrapTagBox () extends BootstrapClientEdit {
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
  def addTag(text: java.lang.String): scala.Unit = js.native
  def adjustDropDownWindow(): scala.Unit = js.native
  def beginUpdate(): scala.Unit = js.native
  def clearItems(): scala.Unit = js.native
  def clearTagCollection(): scala.Unit = js.native
  def endUpdate(): scala.Unit = js.native
  def ensureDropDownLoaded(callbackFunction: js.Any): scala.Unit = js.native
  def findItemByText(text: java.lang.String): BootstrapListBoxItem | scala.Null = js.native
  def findItemByValue(value: js.Any): BootstrapListBoxItem | scala.Null = js.native
  def getButtonVisible(number: scala.Double): scala.Boolean = js.native
  def getCaretPosition(): scala.Double = js.native
  def getItem(index: scala.Double): BootstrapListBoxItem | scala.Null = js.native
  def getItemBadgeIconCssClass(index: scala.Double): java.lang.String = js.native
  def getItemBadgeText(index: scala.Double): java.lang.String = js.native
  def getItemCount(): scala.Double = js.native
  def getSelectedIndex(): scala.Double = js.native
  def getSelectedItem(): BootstrapListBoxItem | scala.Null = js.native
  def getTagCollection(): js.Array[java.lang.String] = js.native
  def getTagHtmlElement(index: scala.Double): js.Any = js.native
  def getTagIndexByText(text: java.lang.String): scala.Double = js.native
  def getTagRemoveButtonHtmlElement(index: scala.Double): js.Any = js.native
  def getTagTextHtmlElement(index: scala.Double): js.Any = js.native
  def getText(): java.lang.String = js.native
  def hideDropDown(): scala.Unit = js.native
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
  def isCustomTag(text: java.lang.String, caseSensitive: scala.Boolean): scala.Boolean = js.native
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
  def off_buttonClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.buttonClick
  ): this.type = js.native
  @JSName("off")
  def off_buttonClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.buttonClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ButtonEditClickEventArgs], scala.Unit]
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
  def off_closeUp(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.closeUp
  ): this.type = js.native
  @JSName("off")
  def off_closeUp(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.closeUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
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
  def off_dropDown(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.dropDown
  ): this.type = js.native
  @JSName("off")
  def off_dropDown(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.dropDown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
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
  def off_queryCloseUp(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.queryCloseUp
  ): this.type = js.native
  @JSName("off")
  def off_queryCloseUp(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.queryCloseUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CancelEventArgs], scala.Unit]
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
  @JSName("off")
  def off_tagsChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.tagsChanged
  ): this.type = js.native
  @JSName("off")
  def off_tagsChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.tagsChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_textChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.textChanged
  ): this.type = js.native
  @JSName("off")
  def off_textChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.textChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_userInput(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.userInput
  ): this.type = js.native
  @JSName("off")
  def off_userInput(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.userInput,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_beginCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_buttonClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.buttonClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ButtonEditClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_callbackError(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_closeUp(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.closeUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
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
  def on_dropDown(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.dropDown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], scala.Unit]
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
  def on_queryCloseUp(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.queryCloseUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CancelEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_selectedIndexChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.selectedIndexChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_tagsChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.tagsChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_textChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.textChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_userInput(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.userInput,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_beginCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_buttonClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.buttonClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ButtonEditClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_callbackError(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_closeUp(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.closeUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
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
  def once_dropDown(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.dropDown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], scala.Unit]
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
  def once_queryCloseUp(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.queryCloseUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CancelEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_selectedIndexChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.selectedIndexChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_tagsChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.tagsChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_textChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.textChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_userInput(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.userInput,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  def performCallback(data: js.Any): stdLib.Promise[scala.Unit] = js.native
  def performCallback(data: js.Any, onSuccess: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeItem(index: scala.Double): scala.Unit = js.native
  def removeItemCssClass(index: scala.Double, className: java.lang.String): scala.Unit = js.native
  def removeItemTextCellCssClass(itemIndex: scala.Double, textCellIndex: scala.Double, className: java.lang.String): scala.Unit = js.native
  def removeTag(index: scala.Double): scala.Unit = js.native
  def removeTagByText(text: java.lang.String): scala.Unit = js.native
  def selectAll(): scala.Unit = js.native
  def setButtonVisible(number: scala.Double, value: scala.Boolean): scala.Unit = js.native
  def setCaretPosition(position: scala.Double): scala.Unit = js.native
  def setItemBadgeIconCssClass(index: scala.Double, cssClass: java.lang.String): scala.Unit = js.native
  def setItemBadgeText(index: scala.Double, text: java.lang.String): scala.Unit = js.native
  def setItemHtml(index: scala.Double, html: java.lang.String): scala.Unit = js.native
  def setItemTextCellHtml(itemIndex: scala.Double, textCellIndex: scala.Double, html: java.lang.String): scala.Unit = js.native
  def setItemTextCellTooltip(itemIndex: scala.Double, textCellIndex: scala.Double, tooltip: java.lang.String): scala.Unit = js.native
  def setItemTooltip(index: scala.Double, tooltip: java.lang.String): scala.Unit = js.native
  def setSelectedIndex(index: scala.Double): scala.Unit = js.native
  def setSelectedItem(item: BootstrapListBoxItem): scala.Unit = js.native
  def setSelection(startPos: scala.Double, endPos: scala.Double, scrollToSelection: scala.Boolean): scala.Unit = js.native
  def setTagCollection(collection: js.Array[java.lang.String]): scala.Unit = js.native
  def setText(text: java.lang.String): scala.Unit = js.native
  def setValue(value: java.lang.String): scala.Unit = js.native
  def showDropDown(): scala.Unit = js.native
}

