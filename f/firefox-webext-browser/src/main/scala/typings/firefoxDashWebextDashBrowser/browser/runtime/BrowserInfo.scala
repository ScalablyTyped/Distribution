package typings.firefoxDashWebextDashBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object containing information about the current browser. */
trait BrowserInfo extends js.Object {
  /** The browser's build ID/date, for example '20160101'. */
  var buildID: String
  /** The name of the browser, for example 'Firefox'. */
  var name: String
  /** The name of the browser vendor, for example 'Mozilla'. */
  var vendor: String
  /** The browser's version, for example '42.0.0' or '0.8.1pre'. */
  var version: String
}

object BrowserInfo {
  @scala.inline
  def apply(buildID: String, name: String, vendor: String, version: String): BrowserInfo = {
    val __obj = js.Dynamic.literal(buildID = buildID, name = name, vendor = vendor, version = version)
  
    __obj.asInstanceOf[BrowserInfo]
  }
}

