package typings
package firefoxDashWebextDashBrowserLib.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object downloadsNs {
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
  type DangerType = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.file | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.url | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.content | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.uncommon | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.host | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.unwanted | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.safe | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.accepted
  /**
    * A time specified as a Date object, a number or string representing milliseconds since the epoch, or an ISO 8601
    * string
    */
  type DownloadTime = java.lang.String | firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.Date
  /* downloads types */
  type FilenameConflictAction = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.uniquify | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.overwrite | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.prompt
  type InterruptReason = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.FILE_FAILED | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.FILE_ACCESS_DENIED | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.FILE_NO_SPACE | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.FILE_NAME_TOO_LONG | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.FILE_TOO_LARGE | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.FILE_VIRUS_INFECTED | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.FILE_TRANSIENT_ERROR | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.FILE_BLOCKED | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.FILE_SECURITY_CHECK_FAILED | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.FILE_TOO_SHORT | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.NETWORK_FAILED | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.NETWORK_TIMEOUT | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.NETWORK_DISCONNECTED | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.NETWORK_SERVER_DOWN | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.NETWORK_INVALID_REQUEST | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.SERVER_FAILED | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.SERVER_NO_RANGE | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.SERVER_BAD_CONTENT | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.SERVER_UNAUTHORIZED | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.SERVER_CERT_PROBLEM | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.SERVER_FORBIDDEN | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.USER_CANCELED | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.USER_SHUTDOWN | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.CRASH
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
  type State = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.in_progress | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.interrupted | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.complete
  /** The HTTP method to use if the URL uses the HTTP[S] protocol. */
  type _DownloadMethod = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.GET | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.POST
}
