package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapAccordion")
@js.native
class BootstrapAccordion () extends Control {
  def collapseAll(): scala.Unit = js.native
  def expandAll(): scala.Unit = js.native
  def getActiveGroup(): BootstrapAccordionGroup | scala.Null = js.native
  def getGroup(index: scala.Double): BootstrapAccordionGroup | scala.Null = js.native
  def getGroupByName(name: java.lang.String): BootstrapAccordionGroup | scala.Null = js.native
  def getGroupCount(): scala.Double = js.native
  def getItemByName(name: java.lang.String): BootstrapAccordionItem | scala.Null = js.native
  def getSelectedItem(): BootstrapAccordionItem | scala.Null = js.native
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
  def off_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback
  ): this.type = js.native
  @JSName("off")
  def off_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_expandedChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.expandedChanged
  ): this.type = js.native
  @JSName("off")
  def off_expandedChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.expandedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AccordionGroupEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_expandedChanging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.expandedChanging
  ): this.type = js.native
  @JSName("off")
  def off_expandedChanging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.expandedChanging,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[AccordionGroupCancelEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_headerClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.headerClick
  ): this.type = js.native
  @JSName("off")
  def off_headerClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.headerClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[AccordionGroupClickEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_itemClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.itemClick
  ): this.type = js.native
  @JSName("off")
  def off_itemClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.itemClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AccordionItemEventArgs], scala.Unit]
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
  def on_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_expandedChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.expandedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AccordionGroupEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_expandedChanging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.expandedChanging,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[AccordionGroupCancelEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_headerClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.headerClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[AccordionGroupClickEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_itemClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.itemClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AccordionItemEventArgs], scala.Unit]
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
  def once_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_expandedChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.expandedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AccordionGroupEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_expandedChanging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.expandedChanging,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[AccordionGroupCancelEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_headerClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.headerClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[AccordionGroupClickEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_itemClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.itemClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AccordionItemEventArgs], scala.Unit]
  ): this.type = js.native
  def setActiveGroup(group: BootstrapAccordionGroup): scala.Unit = js.native
  def setSelectedItem(item: BootstrapAccordionItem): scala.Unit = js.native
}

