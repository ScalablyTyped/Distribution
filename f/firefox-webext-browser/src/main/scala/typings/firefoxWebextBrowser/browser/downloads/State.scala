package typings.firefoxWebextBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * *in_progress*:
  *   The download is currently receiving data from the server.
  * *interrupted*:
  *   An error broke the connection with the file host.
  * *complete*:
  *   The download completed successfully.
  *
  * These string constants will never change, however the set of States may change.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.in_progress
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.interrupted
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.complete
*/
trait State extends js.Object
object State {
  
  @scala.inline
  def complete: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.complete = "complete".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.complete]
  
  @scala.inline
  def in_progress: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.in_progress = "in_progress".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.in_progress]
  
  @scala.inline
  def interrupted: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.interrupted = "interrupted".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.interrupted]
}
