package typings.firefoxDashWebextDashBrowser.browser.bookmarks

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.Anon_IndexNode
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a bookmark or folder is removed. When a folder is removed recursively, a single notification is fired
  * for the folder, and none for its contents.
  */
@JSGlobal("browser.bookmarks.onRemoved")
@js.native
object onRemoved
  extends TopLevel[
      WebExtEvent[js.Function2[/* id */ String, /* removeInfo */ Anon_IndexNode, Unit]]
    ]

