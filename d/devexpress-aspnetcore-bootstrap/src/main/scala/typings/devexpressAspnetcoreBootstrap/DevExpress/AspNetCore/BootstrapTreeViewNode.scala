package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapTreeViewNode extends Control {
  
  def getBadgeIconCssClass(): String = js.native
  
  def getBadgeText(): String = js.native
  
  def getCheckState(): String = js.native
  
  def getChecked(): Boolean = js.native
  
  def getEnabled(): Boolean = js.native
  
  def getExpanded(): Boolean = js.native
  
  def getHtmlElement(): js.Any = js.native
  
  def getIconCssClass(): String = js.native
  
  def getImageUrl(): String = js.native
  
  def getNavigateUrl(): String = js.native
  
  def getNode(index: Double): BootstrapTreeViewNode | Null = js.native
  
  def getNodeByName(name: String): BootstrapTreeViewNode | Null = js.native
  
  def getNodeByText(text: String): BootstrapTreeViewNode | Null = js.native
  
  def getNodeCount(): Double = js.native
  
  def getText(): String = js.native
  
  val index: Double = js.native
  
  def off(
    eventName: js.UndefOr[scala.Nothing],
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  
  val parent: BootstrapTreeViewNode | Null = js.native
  
  def setBadgeIconCssClass(cssClass: String): Unit = js.native
  
  def setBadgeText(text: String): Unit = js.native
  
  def setChecked(value: Boolean): Unit = js.native
  
  def setEnabled(value: Boolean): Unit = js.native
  
  def setExpanded(value: Boolean): Unit = js.native
  
  def setIconCssClass(cssClass: String): Unit = js.native
  
  def setImageUrl(value: String): Unit = js.native
  
  def setNavigateUrl(value: String): Unit = js.native
  
  def setText(value: String): Unit = js.native
  
  val treeView: BootstrapTreeView | Null = js.native
}
