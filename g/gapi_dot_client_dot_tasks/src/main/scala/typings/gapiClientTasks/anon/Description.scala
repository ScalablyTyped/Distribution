package typings.gapiClientTasks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  /** The description. In HTML speak: Everything between <a> and </a>. */
  var description: js.UndefOr[String] = js.undefined
  /** The URL. */
  var link: js.UndefOr[String] = js.undefined
  /** Type of the link, e.g. "email". */
  var `type`: js.UndefOr[String] = js.undefined
}

object Description {
  @scala.inline
  def apply(description: String = null, link: String = null, `type`: String = null): Description = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
}

