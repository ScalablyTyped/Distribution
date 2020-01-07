package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Directory Site Contact List Response
  */
@js.native
trait Schema$DirectorySiteContactsListResponse extends js.Object {
  /**
    * Directory site contact collection
    */
  var directorySiteContacts: js.UndefOr[js.Array[Schema$DirectorySiteContact]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#directorySiteContactsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$DirectorySiteContactsListResponse {
  @scala.inline
  def apply(
    directorySiteContacts: js.Array[Schema$DirectorySiteContact] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$DirectorySiteContactsListResponse = {
    val __obj = js.Dynamic.literal()
    if (directorySiteContacts != null) __obj.updateDynamic("directorySiteContacts")(directorySiteContacts.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DirectorySiteContactsListResponse]
  }
}

