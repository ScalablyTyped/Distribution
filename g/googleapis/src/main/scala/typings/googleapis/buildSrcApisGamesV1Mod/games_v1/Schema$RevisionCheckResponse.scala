package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for the result of checking a revision.
  */
@js.native
trait Schema$RevisionCheckResponse extends js.Object {
  /**
    * The version of the API this client revision should use when calling API
    * methods.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#revisionCheckResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The result of the revision check. Possible values are:   - &quot;OK&quot;
    * - The revision being used is current.  - &quot;DEPRECATED&quot; - There
    * is currently a newer version available, but the revision being used still
    * works.  - &quot;INVALID&quot; - The revision being used is not supported
    * in any released version.
    */
  var revisionStatus: js.UndefOr[String] = js.native
}

object Schema$RevisionCheckResponse {
  @scala.inline
  def apply(apiVersion: String = null, kind: String = null, revisionStatus: String = null): Schema$RevisionCheckResponse = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (revisionStatus != null) __obj.updateDynamic("revisionStatus")(revisionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RevisionCheckResponse]
  }
}

