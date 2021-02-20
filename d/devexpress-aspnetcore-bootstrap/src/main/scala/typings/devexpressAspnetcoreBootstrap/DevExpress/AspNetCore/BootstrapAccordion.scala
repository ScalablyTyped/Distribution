package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.beginCallback
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.callbackError
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.endCallback
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.expandedChanged
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.expandedChanging
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.headerClick
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.itemClick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapAccordion extends Control {
  
  def collapseAll(): Unit = js.native
  
  def expandAll(): Unit = js.native
  
  def getActiveGroup(): BootstrapAccordionGroup | Null = js.native
  
  def getGroup(index: Double): BootstrapAccordionGroup | Null = js.native
  
  def getGroupByName(name: String): BootstrapAccordionGroup | Null = js.native
  
  def getGroupCount(): Double = js.native
  
  def getItemByName(name: String): BootstrapAccordionItem | Null = js.native
  
  def getSelectedItem(): BootstrapAccordionItem | Null = js.native
  
  def off(
    eventName: js.UndefOr[scala.Nothing],
    callback: js.ThisFunction1[
      /* this */ this.type, 
      js.UndefOr[
        AccordionGroupCancelEventArgs | AccordionGroupClickEventArgs | AccordionGroupEventArgs | AccordionItemEventArgs | BeginCallbackEventArgs | CallbackErrorEventArgs | EndCallbackEventArgs | EventArgs
      ], 
      Unit
    ]
  ): this.type = js.native
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
  def off_endCallback(eventName: endCallback): this.type = js.native
  @JSName("off")
  def off_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_expandedChanged(eventName: expandedChanged): this.type = js.native
  @JSName("off")
  def off_expandedChanged(
    eventName: expandedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AccordionGroupEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_expandedChanging(eventName: expandedChanging): this.type = js.native
  @JSName("off")
  def off_expandedChanging(
    eventName: expandedChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AccordionGroupCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_headerClick(eventName: headerClick): this.type = js.native
  @JSName("off")
  def off_headerClick(
    eventName: headerClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AccordionGroupClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_itemClick(eventName: itemClick): this.type = js.native
  @JSName("off")
  def off_itemClick(
    eventName: itemClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AccordionItemEventArgs], Unit]
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
  def on_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_expandedChanged(
    eventName: expandedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AccordionGroupEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_expandedChanging(
    eventName: expandedChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AccordionGroupCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_headerClick(
    eventName: headerClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AccordionGroupClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_itemClick(
    eventName: itemClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AccordionItemEventArgs], Unit]
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
  def once_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_expandedChanged(
    eventName: expandedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AccordionGroupEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_expandedChanging(
    eventName: expandedChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AccordionGroupCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_headerClick(
    eventName: headerClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AccordionGroupClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_itemClick(
    eventName: itemClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[AccordionItemEventArgs], Unit]
  ): this.type = js.native
  
  def setActiveGroup(group: BootstrapAccordionGroup): Unit = js.native
  
  def setSelectedItem(item: BootstrapAccordionItem): Unit = js.native
}
