package typings.gapiDotDrive.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListParameters extends js.Object {
  var corpora: js.UndefOr[String] = js.undefined
  var corpus: js.UndefOr[String] = js.undefined
  var includeTeamDriveItems: js.UndefOr[Boolean] = js.undefined
  var maxResults: js.UndefOr[Double] = js.undefined
  var orderBy: js.UndefOr[String] = js.undefined
  var pageToken: js.UndefOr[String] = js.undefined
  var projection: js.UndefOr[String] = js.undefined
  var q: js.UndefOr[String] = js.undefined
  var spaces: js.UndefOr[String] = js.undefined
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  var teamDriveId: js.UndefOr[String] = js.undefined
}

object ListParameters {
  @scala.inline
  def apply(
    corpora: String = null,
    corpus: String = null,
    includeTeamDriveItems: js.UndefOr[Boolean] = js.undefined,
    maxResults: Int | Double = null,
    orderBy: String = null,
    pageToken: String = null,
    projection: String = null,
    q: String = null,
    spaces: String = null,
    supportsTeamDrives: js.UndefOr[Boolean] = js.undefined,
    teamDriveId: String = null
  ): ListParameters = {
    val __obj = js.Dynamic.literal()
    if (corpora != null) __obj.updateDynamic("corpora")(corpora)
    if (corpus != null) __obj.updateDynamic("corpus")(corpus)
    if (!js.isUndefined(includeTeamDriveItems)) __obj.updateDynamic("includeTeamDriveItems")(includeTeamDriveItems)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (q != null) __obj.updateDynamic("q")(q)
    if (spaces != null) __obj.updateDynamic("spaces")(spaces)
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives)
    if (teamDriveId != null) __obj.updateDynamic("teamDriveId")(teamDriveId)
    __obj.asInstanceOf[ListParameters]
  }
}

