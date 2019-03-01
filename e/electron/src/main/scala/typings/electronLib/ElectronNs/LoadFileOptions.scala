package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadFileOptions extends js.Object {
  /**
    * Passed to url.format().
    */
  var hash: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Passed to url.format().
    */
  var query: js.UndefOr[Query] = js.undefined
  /**
    * Passed to url.format().
    */
  var search: js.UndefOr[java.lang.String] = js.undefined
}

object LoadFileOptions {
  @scala.inline
  def apply(hash: java.lang.String = null, query: Query = null, search: java.lang.String = null): LoadFileOptions = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (query != null) __obj.updateDynamic("query")(query)
    if (search != null) __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[LoadFileOptions]
  }
}

