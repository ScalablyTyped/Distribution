package typings.firefoxWebextBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * *file*:
  *   The download's filename is suspicious.
  * *url*:
  *   The download's URL is known to be malicious.
  * *content*:
  *   The downloaded file is known to be malicious.
  * *uncommon*:
  *   The download's URL is not commonly downloaded and could be dangerous.
  * *safe*:
  *   The download presents no known danger to the user's computer.
  *
  * These string constants will never change, however the set of DangerTypes may change.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.file
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.url
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.content
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.uncommon
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.host
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unwanted
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.safe
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.accepted
*/
trait DangerType extends js.Object
object DangerType {
  
  @scala.inline
  def accepted: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.accepted = "accepted".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.accepted]
  
  @scala.inline
  def content: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.content = "content".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.content]
  
  @scala.inline
  def file: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.file = "file".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.file]
  
  @scala.inline
  def host: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.host = "host".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.host]
  
  @scala.inline
  def safe: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.safe = "safe".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.safe]
  
  @scala.inline
  def uncommon: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.uncommon = "uncommon".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.uncommon]
  
  @scala.inline
  def unwanted: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unwanted = "unwanted".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unwanted]
  
  @scala.inline
  def url: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.url = "url".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.url]
}
