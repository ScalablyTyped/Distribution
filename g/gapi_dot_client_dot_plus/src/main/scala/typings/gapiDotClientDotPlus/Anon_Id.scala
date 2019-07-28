package typings.gapiDotClientDotPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  /** The ID of the activity. */
  var id: js.UndefOr[String] = js.undefined
  /** The URL of the activity. */
  var url: js.UndefOr[String] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(id: String = null, url: String = null): Anon_Id = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Id]
  }
}

