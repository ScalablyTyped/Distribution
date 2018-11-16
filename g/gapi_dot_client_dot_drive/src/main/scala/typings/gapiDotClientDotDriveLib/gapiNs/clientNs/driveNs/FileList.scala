package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FileList extends js.Object {
  /** The list of files. If nextPageToken is populated, then this list may be incomplete and an additional page of results should be fetched. */
  var files: js.UndefOr[js.Array[File]] = js.undefined
  /**
               * Whether the search process was incomplete. If true, then some search results may be missing, since all documents were not searched. This may occur when
               * searching multiple Team Drives with the "user,allTeamDrives" corpora, but all corpora could not be searched. When this happens, it is suggested that
               * clients narrow their query by choosing a different corpus such as "user" or "teamDrive".
               */
  var incompleteSearch: js.UndefOr[scala.Boolean] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "drive#fileList". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The page token for the next page of files. This will be absent if the end of the files list has been reached. If the token is rejected for any reason,
               * it should be discarded, and pagination should be restarted from the first page of results.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

