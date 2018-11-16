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

