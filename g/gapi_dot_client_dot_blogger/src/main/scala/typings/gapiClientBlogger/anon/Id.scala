package typings.gapiClientBlogger.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  /** The identifier of the Blog that contains this Post. */
  var id: js.UndefOr[String] = js.undefined
}

object Id {
  @scala.inline
  def apply(id: String = null): Id = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

