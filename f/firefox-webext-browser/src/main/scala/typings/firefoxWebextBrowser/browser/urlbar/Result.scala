package typings.firefoxWebextBrowser.browser.urlbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A result of a query. Queries can have many results. Each result is created by a provider. */
trait Result extends js.Object {
  /** An object with arbitrary properties depending on the result's type. */
  var payload: js.Object
  /** The result's source. */
  var source: SourceType
  /** The result's type. */
  var `type`: ResultType
}

object Result {
  @scala.inline
  def apply(payload: js.Object, source: SourceType, `type`: ResultType): Result = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

