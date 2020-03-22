package typings.electron.Electron

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadFileOptions extends js.Object {
  /**
    * Passed to `url.format()`.
    */
  var hash: js.UndefOr[String] = js.undefined
  /**
    * Passed to `url.format()`.
    */
  var query: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * Passed to `url.format()`.
    */
  var search: js.UndefOr[String] = js.undefined
}

object LoadFileOptions {
  @scala.inline
  def apply(hash: String = null, query: Record[String, String] = null, search: String = null): LoadFileOptions = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadFileOptions]
  }
}

