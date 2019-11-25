package typings.documentdbDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options associated with a upsert operation. */
trait IUpsertOptions extends js.Object {
  /** Disables automatic generation of "id" field of the document to be upserted (if it is not provided) */
  var disableAutomaticIdGeneration: js.UndefOr[String] = js.undefined
  /** Specifies indexing directives. */
  var indexAction: js.UndefOr[String] = js.undefined
}

object IUpsertOptions {
  @scala.inline
  def apply(disableAutomaticIdGeneration: String = null, indexAction: String = null): IUpsertOptions = {
    val __obj = js.Dynamic.literal()
    if (disableAutomaticIdGeneration != null) __obj.updateDynamic("disableAutomaticIdGeneration")(disableAutomaticIdGeneration.asInstanceOf[js.Any])
    if (indexAction != null) __obj.updateDynamic("indexAction")(indexAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpsertOptions]
  }
}

