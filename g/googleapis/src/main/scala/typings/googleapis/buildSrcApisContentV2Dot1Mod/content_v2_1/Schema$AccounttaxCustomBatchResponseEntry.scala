package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch accounttax response.
  */
@js.native
trait Schema$AccounttaxCustomBatchResponseEntry extends js.Object {
  /**
    * The retrieved or updated account tax settings.
    */
  var accountTax: js.UndefOr[Schema$AccountTax] = js.native
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
    * &quot;content#accounttaxCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$AccounttaxCustomBatchResponseEntry {
  @scala.inline
  def apply(
    accountTax: Schema$AccountTax = null,
    batchId: Int | Double = null,
    errors: Schema$Errors = null,
    kind: String = null
  ): Schema$AccounttaxCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (accountTax != null) __obj.updateDynamic("accountTax")(accountTax.asInstanceOf[js.Any])
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccounttaxCustomBatchResponseEntry]
  }
}

