package typings
package gapiDotClientDotDriveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Limit extends js.Object {
  /** The usage limit, if applicable. This will not be present if the user has unlimited storage. */
  var limit: js.UndefOr[java.lang.String] = js.undefined
  /** The total usage across all services. */
  var usage: js.UndefOr[java.lang.String] = js.undefined
  /** The usage by all files in Google Drive. */
  var usageInDrive: js.UndefOr[java.lang.String] = js.undefined
  /** The usage by trashed files in Google Drive. */
  var usageInDriveTrash: js.UndefOr[java.lang.String] = js.undefined
}

