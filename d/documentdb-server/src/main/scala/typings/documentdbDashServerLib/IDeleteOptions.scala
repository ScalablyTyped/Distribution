package typings
package documentdbDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options associated with a delete operation. */
trait IDeleteOptions extends js.Object {
  /**
  	 * The entity tag associated with the resource.
  	 * This is matched with the persisted resource before deletion.
  	 */
  var etag: js.UndefOr[java.lang.String] = js.undefined
}

object IDeleteOptions {
  @scala.inline
  def apply(etag: java.lang.String = null): IDeleteOptions = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    __obj.asInstanceOf[IDeleteOptions]
  }
}

