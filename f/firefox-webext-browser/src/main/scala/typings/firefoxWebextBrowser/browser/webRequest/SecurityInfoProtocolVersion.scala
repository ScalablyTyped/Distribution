package typings.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Protocol version if state is "secure" */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot1
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot2
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot3
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
*/
trait SecurityInfoProtocolVersion extends js.Object
object SecurityInfoProtocolVersion {
  
  @scala.inline
  def TLSv1: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1 = "TLSv1".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1]
  
  @scala.inline
  def TLSv1Dot1: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot1 = "TLSv1.1".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot1]
  
  @scala.inline
  def TLSv1Dot2: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot2 = "TLSv1.2".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot2]
  
  @scala.inline
  def TLSv1Dot3: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot3 = "TLSv1.3".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot3]
  
  @scala.inline
  def unknown: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = "unknown".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown]
}
