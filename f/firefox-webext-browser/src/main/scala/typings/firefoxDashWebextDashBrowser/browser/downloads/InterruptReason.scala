package typings.firefoxDashWebextDashBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.FILE_FAILED
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.FILE_ACCESS_DENIED
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.FILE_NO_SPACE
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.FILE_NAME_TOO_LONG
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.FILE_TOO_LARGE
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.FILE_VIRUS_INFECTED
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.FILE_TRANSIENT_ERROR
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.FILE_BLOCKED
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.FILE_SECURITY_CHECK_FAILED
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.FILE_TOO_SHORT
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.NETWORK_FAILED
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.NETWORK_TIMEOUT
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.NETWORK_DISCONNECTED
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.NETWORK_SERVER_DOWN
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.NETWORK_INVALID_REQUEST
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.SERVER_FAILED
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.SERVER_NO_RANGE
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.SERVER_BAD_CONTENT
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.SERVER_UNAUTHORIZED
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.SERVER_CERT_PROBLEM
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.SERVER_FORBIDDEN
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.USER_CANCELED
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.USER_SHUTDOWN
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.CRASH
*/
trait InterruptReason extends js.Object

object InterruptReason {
  @scala.inline
  def CRASH: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.CRASH = this.cast("CRASH")
  @scala.inline
  def FILE_ACCESS_DENIED: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.FILE_ACCESS_DENIED = this.cast("FILE_ACCESS_DENIED")
  @scala.inline
  def FILE_BLOCKED: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.FILE_BLOCKED = this.cast("FILE_BLOCKED")
  @scala.inline
  def FILE_FAILED: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.FILE_FAILED = this.cast("FILE_FAILED")
  @scala.inline
  def FILE_NAME_TOO_LONG: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.FILE_NAME_TOO_LONG = this.cast("FILE_NAME_TOO_LONG")
  @scala.inline
  def FILE_NO_SPACE: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.FILE_NO_SPACE = this.cast("FILE_NO_SPACE")
  @scala.inline
  def FILE_SECURITY_CHECK_FAILED: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.FILE_SECURITY_CHECK_FAILED = this.cast("FILE_SECURITY_CHECK_FAILED")
  @scala.inline
  def FILE_TOO_LARGE: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.FILE_TOO_LARGE = this.cast("FILE_TOO_LARGE")
  @scala.inline
  def FILE_TOO_SHORT: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.FILE_TOO_SHORT = this.cast("FILE_TOO_SHORT")
  @scala.inline
  def FILE_TRANSIENT_ERROR: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.FILE_TRANSIENT_ERROR = this.cast("FILE_TRANSIENT_ERROR")
  @scala.inline
  def FILE_VIRUS_INFECTED: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.FILE_VIRUS_INFECTED = this.cast("FILE_VIRUS_INFECTED")
  @scala.inline
  def NETWORK_DISCONNECTED: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.NETWORK_DISCONNECTED = this.cast("NETWORK_DISCONNECTED")
  @scala.inline
  def NETWORK_FAILED: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.NETWORK_FAILED = this.cast("NETWORK_FAILED")
  @scala.inline
  def NETWORK_INVALID_REQUEST: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.NETWORK_INVALID_REQUEST = this.cast("NETWORK_INVALID_REQUEST")
  @scala.inline
  def NETWORK_SERVER_DOWN: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.NETWORK_SERVER_DOWN = this.cast("NETWORK_SERVER_DOWN")
  @scala.inline
  def NETWORK_TIMEOUT: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.NETWORK_TIMEOUT = this.cast("NETWORK_TIMEOUT")
  @scala.inline
  def SERVER_BAD_CONTENT: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.SERVER_BAD_CONTENT = this.cast("SERVER_BAD_CONTENT")
  @scala.inline
  def SERVER_CERT_PROBLEM: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.SERVER_CERT_PROBLEM = this.cast("SERVER_CERT_PROBLEM")
  @scala.inline
  def SERVER_FAILED: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.SERVER_FAILED = this.cast("SERVER_FAILED")
  @scala.inline
  def SERVER_FORBIDDEN: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.SERVER_FORBIDDEN = this.cast("SERVER_FORBIDDEN")
  @scala.inline
  def SERVER_NO_RANGE: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.SERVER_NO_RANGE = this.cast("SERVER_NO_RANGE")
  @scala.inline
  def SERVER_UNAUTHORIZED: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.SERVER_UNAUTHORIZED = this.cast("SERVER_UNAUTHORIZED")
  @scala.inline
  def USER_CANCELED: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.USER_CANCELED = this.cast("USER_CANCELED")
  @scala.inline
  def USER_SHUTDOWN: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.USER_SHUTDOWN = this.cast("USER_SHUTDOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

