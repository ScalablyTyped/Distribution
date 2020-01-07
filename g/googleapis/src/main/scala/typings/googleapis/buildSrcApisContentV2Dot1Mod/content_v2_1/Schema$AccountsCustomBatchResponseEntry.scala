package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch accounts response.
  */
@js.native
trait Schema$AccountsCustomBatchResponseEntry extends js.Object {
  /**
    * The retrieved, created, or updated account. Not defined if the method was
    * delete, claimwebsite or link.
    */
  var account: js.UndefOr[Schema$Account] = js.native
  /**
    * The ID of the request entry this entry responds to.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * A list of errors defined if and only if the request failed.
    */
  var errors: js.UndefOr[Schema$Errors] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#accountsCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$AccountsCustomBatchResponseEntry {
  @scala.inline
  def apply(
    account: Schema$Account = null,
    batchId: Int | Double = null,
    errors: Schema$Errors = null,
    kind: String = null
  ): Schema$AccountsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountsCustomBatchResponseEntry]
  }
}

