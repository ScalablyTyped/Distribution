package typings
package documentdbDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options associated with a replace operation. */
trait IReplaceOptions extends js.Object {
  /**
  	 * The entity tag associated with the resource.
  	 * This is matched with the persisted resource before deletion.
  	 */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies indexing directives. */
  var indexAction: js.UndefOr[java.lang.String] = js.undefined
}

object IReplaceOptions {
  @scala.inline
  def apply(etag: java.lang.String = null, indexAction: java.lang.String = null): IReplaceOptions = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (indexAction != null) __obj.updateDynamic("indexAction")(indexAction)
    __obj.asInstanceOf[IReplaceOptions]
  }
}

