package typings.firefoxWebextBrowser.browser.contextMenus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* contextMenus types */
/**
  * The different contexts a menu can appear in. Specifying 'all' is equivalent to the combination of all other
  * contexts except for 'tab' and 'tools_menu'.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.all
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.page
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.frame
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.selection
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.link
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.editable
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.password
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.image
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.video
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.audio
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.launcher
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.browser_action
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.page_action
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab
*/
trait ContextType extends js.Object

object ContextType {
  @scala.inline
  def all: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.all = this.cast("all")
  @scala.inline
  def audio: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.audio = this.cast("audio")
  @scala.inline
  def bookmark: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark = this.cast("bookmark")
  @scala.inline
  def browser_action: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.browser_action = this.cast("browser_action")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def editable: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.editable = this.cast("editable")
  @scala.inline
  def frame: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.frame = this.cast("frame")
  @scala.inline
  def image: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.image = this.cast("image")
  @scala.inline
  def launcher: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.launcher = this.cast("launcher")
  @scala.inline
  def link: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.link = this.cast("link")
  @scala.inline
  def page: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.page = this.cast("page")
  @scala.inline
  def page_action: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.page_action = this.cast("page_action")
  @scala.inline
  def password: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.password = this.cast("password")
  @scala.inline
  def selection: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.selection = this.cast("selection")
  @scala.inline
  def tab: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = this.cast("tab")
  @scala.inline
  def video: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.video = this.cast("video")
}

