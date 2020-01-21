package typings.firefoxWebextBrowser.browser.history

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* history types */
/** The transition type for this visit from its referrer. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.link
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.typed
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_bookmark
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_subframe
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual_subframe
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.generated
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_toplevel
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.form_submit
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.reload
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword_generated
*/
trait TransitionType extends js.Object

object TransitionType {
  @scala.inline
  def auto_bookmark: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_bookmark = this.cast("auto_bookmark")
  @scala.inline
  def auto_subframe: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_subframe = this.cast("auto_subframe")
  @scala.inline
  def auto_toplevel: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_toplevel = this.cast("auto_toplevel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def form_submit: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.form_submit = this.cast("form_submit")
  @scala.inline
  def generated: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.generated = this.cast("generated")
  @scala.inline
  def keyword: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword = this.cast("keyword")
  @scala.inline
  def keyword_generated: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword_generated = this.cast("keyword_generated")
  @scala.inline
  def link: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.link = this.cast("link")
  @scala.inline
  def manual_subframe: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual_subframe = this.cast("manual_subframe")
  @scala.inline
  def reload: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.reload = this.cast("reload")
  @scala.inline
  def typed: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.typed = this.cast("typed")
}

