package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Material extends js.Object {
  /** Google Drive file material. */
  var driveFile: js.UndefOr[SharedDriveFile] = js.undefined
  /** Google Forms material. */
  var form: js.UndefOr[Form] = js.undefined
  /**
    * Link material. On creation, will be upgraded to a more appropriate type
    * if possible, and this will be reflected in the response.
    */
  var link: js.UndefOr[Link] = js.undefined
  /** YouTube video material. */
  var youtubeVideo: js.UndefOr[YouTubeVideo] = js.undefined
}

