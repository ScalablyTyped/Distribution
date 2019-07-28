package typings.googleDotFeeds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait findResult extends js.Object {
  var error: js.UndefOr[feedError] = js.undefined
  var findEntries: js.Array[findEntry]
  var xmlDocument: js.UndefOr[String] = js.undefined
}

object findResult {
  @scala.inline
  def apply(findEntries: js.Array[findEntry], error: feedError = null, xmlDocument: String = null): findResult = {
    val __obj = js.Dynamic.literal(findEntries = findEntries)
    if (error != null) __obj.updateDynamic("error")(error)
    if (xmlDocument != null) __obj.updateDynamic("xmlDocument")(xmlDocument)
    __obj.asInstanceOf[findResult]
  }
}

