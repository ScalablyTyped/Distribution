package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of the saved query.
  */
@js.native
trait Schema$SavedQuery extends js.Object {
  /**
    * Output only. The server generated timestamp at which saved query was
    * created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Name of the saved query.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Output only. The matter id of the associated matter. The server does not
    * look at this field during create and always uses matter id in the URL.
    */
  var matterId: js.UndefOr[String] = js.native
  /**
    * The underlying Query object which contains all the information of the
    * saved query.
    */
  var query: js.UndefOr[Schema$Query] = js.native
  /**
    * A unique identifier for the saved query.
    */
  var savedQueryId: js.UndefOr[String] = js.native
}

object Schema$SavedQuery {
  @scala.inline
  def apply(
    createTime: String = null,
    displayName: String = null,
    matterId: String = null,
    query: Schema$Query = null,
    savedQueryId: String = null
  ): Schema$SavedQuery = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (matterId != null) __obj.updateDynamic("matterId")(matterId.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (savedQueryId != null) __obj.updateDynamic("savedQueryId")(savedQueryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SavedQuery]
  }
}

