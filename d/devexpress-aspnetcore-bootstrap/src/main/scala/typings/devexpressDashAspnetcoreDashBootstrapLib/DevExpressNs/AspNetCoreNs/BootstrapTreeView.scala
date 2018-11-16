package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapTreeView")
@js.native
class BootstrapTreeView () extends Control {
  def collapseAll(): scala.Unit = js.native
  def expandAll(): scala.Unit = js.native
  def getNode(index: scala.Double): BootstrapTreeViewNode | scala.Null = js.native
  def getNodeByName(name: java.lang.String): BootstrapTreeViewNode | scala.Null = js.native
  def getNodeByText(text: java.lang.String): BootstrapTreeViewNode | scala.Null = js.native
  def getNodeCount(): scala.Double = js.native
  def getRootNode(): BootstrapTreeViewNode | scala.Null = js.native
  def getSelectedNode(): BootstrapTreeViewNode | scala.Null = js.native
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
  def off_checkedChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.checkedChanged
  ): this.type = js.native
  @JSName("off")
  def off_checkedChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.checkedChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[TreeViewNodeProcessingModeEventArgs], 
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
  def off_expandedChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.expandedChanged
  ): this.type = js.native
  @JSName("off")
  def off_expandedChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.expandedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TreeViewNodeEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_expandedChanging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.expandedChanging
  ): this.type = js.native
  @JSName("off")
  def off_expandedChanging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.expandedChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TreeViewNodeCancelEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_nodeClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.nodeClick
  ): this.type = js.native
  @JSName("off")
  def off_nodeClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.nodeClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TreeViewNodeClickEventArgs], scala.Unit]
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
  def on_checkedChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.checkedChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[TreeViewNodeProcessingModeEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_expandedChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.expandedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TreeViewNodeEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_expandedChanging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.expandedChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TreeViewNodeCancelEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_nodeClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.nodeClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TreeViewNodeClickEventArgs], scala.Unit]
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
  def once_checkedChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.checkedChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[TreeViewNodeProcessingModeEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_expandedChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.expandedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TreeViewNodeEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_expandedChanging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.expandedChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TreeViewNodeCancelEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_nodeClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.nodeClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TreeViewNodeClickEventArgs], scala.Unit]
  ): this.type = js.native
  def setSelectedNode(node: BootstrapTreeViewNode): scala.Unit = js.native
}

