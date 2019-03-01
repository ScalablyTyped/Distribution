package typings
package documentdbDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options associated with a create operation. */
trait ICreateOptions extends js.Object {
  /** Disables automatic generation of "id" field of the document to be created (if it is not provided) */
  var disableAutomaticIdGeneration: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies indexing directives. */
  var indexAction: js.UndefOr[java.lang.String] = js.undefined
}

object ICreateOptions {
  @scala.inline
  def apply(disableAutomaticIdGeneration: java.lang.String = null, indexAction: java.lang.String = null): ICreateOptions = {
    val __obj = js.Dynamic.literal()
    if (disableAutomaticIdGeneration != null) __obj.updateDynamic("disableAutomaticIdGeneration")(disableAutomaticIdGeneration)
    if (indexAction != null) __obj.updateDynamic("indexAction")(indexAction)
    __obj.asInstanceOf[ICreateOptions]
  }
}

