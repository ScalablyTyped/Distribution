package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The list of elections available for this version of the API.
  */
@js.native
trait SchemaElectionsQueryResponse extends js.Object {
  /**
    * A list of available elections
    */
  var elections: js.UndefOr[js.Array[SchemaElection]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;civicinfo#electionsQueryResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaElectionsQueryResponse {
  @scala.inline
  def apply(elections: js.Array[SchemaElection] = null, kind: String = null): SchemaElectionsQueryResponse = {
    val __obj = js.Dynamic.literal()
    if (elections != null) __obj.updateDynamic("elections")(elections.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaElectionsQueryResponse]
  }
}

