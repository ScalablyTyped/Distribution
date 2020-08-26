package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.beginCallback
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.callbackError
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.checkedChanged
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.endCallback
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.expandedChanged
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.expandedChanging
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.nodeClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapTreeView extends Control {
  def collapseAll(): Unit = js.native
  def expandAll(): Unit = js.native
  def getNode(index: Double): BootstrapTreeViewNode | Null = js.native
  def getNodeByName(name: String): BootstrapTreeViewNode | Null = js.native
  def getNodeByText(text: String): BootstrapTreeViewNode | Null = js.native
  def getNodeCount(): Double = js.native
  def getRootNode(): BootstrapTreeViewNode | Null = js.native
  def getSelectedNode(): BootstrapTreeViewNode | Null = js.native
  def off(
    eventName: js.UndefOr[scala.Nothing],
    callback: js.ThisFunction1[
      /* this */ this.type, 
      js.UndefOr[
        BeginCallbackEventArgs | CallbackErrorEventArgs | EndCallbackEventArgs | EventArgs | TreeViewNodeCancelEventArgs | TreeViewNodeClickEventArgs | TreeViewNodeEventArgs | TreeViewNodeProcessingModeEventArgs
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
  def off_checkedChanged(eventName: checkedChanged): this.type = js.native
  @JSName("off")
  def off_checkedChanged(
    eventName: checkedChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[TreeViewNodeProcessingModeEventArgs], 
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
  def off_expandedChanged(eventName: expandedChanged): this.type = js.native
  @JSName("off")
  def off_expandedChanged(
    eventName: expandedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TreeViewNodeEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_expandedChanging(eventName: expandedChanging): this.type = js.native
  @JSName("off")
  def off_expandedChanging(
    eventName: expandedChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TreeViewNodeCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_nodeClick(eventName: nodeClick): this.type = js.native
  @JSName("off")
  def off_nodeClick(
    eventName: nodeClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TreeViewNodeClickEventArgs], Unit]
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
  def on_checkedChanged(
    eventName: checkedChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[TreeViewNodeProcessingModeEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_expandedChanged(
    eventName: expandedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TreeViewNodeEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_expandedChanging(
    eventName: expandedChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TreeViewNodeCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_nodeClick(
    eventName: nodeClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TreeViewNodeClickEventArgs], Unit]
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
  def once_checkedChanged(
    eventName: checkedChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[TreeViewNodeProcessingModeEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_expandedChanged(
    eventName: expandedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TreeViewNodeEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_expandedChanging(
    eventName: expandedChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TreeViewNodeCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_nodeClick(
    eventName: nodeClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TreeViewNodeClickEventArgs], Unit]
  ): this.type = js.native
  def setSelectedNode(node: BootstrapTreeViewNode): Unit = js.native
}

