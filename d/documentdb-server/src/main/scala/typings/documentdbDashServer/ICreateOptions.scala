package typings.documentdbDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options associated with a create operation. */
trait ICreateOptions extends js.Object {
  /** Disables automatic generation of "id" field of the document to be created (if it is not provided) */
  var disableAutomaticIdGeneration: js.UndefOr[String] = js.undefined
  /** Specifies indexing directives. */
  var indexAction: js.UndefOr[String] = js.undefined
}

object ICreateOptions {
  @scala.inline
  def apply(disableAutomaticIdGeneration: String = null, indexAction: String = null): ICreateOptions = {
    val __obj = js.Dynamic.literal()
    if (disableAutomaticIdGeneration != null) __obj.updateDynamic("disableAutomaticIdGeneration")(disableAutomaticIdGeneration)
    if (indexAction != null) __obj.updateDynamic("indexAction")(indexAction)
    __obj.asInstanceOf[ICreateOptions]
  }
}

