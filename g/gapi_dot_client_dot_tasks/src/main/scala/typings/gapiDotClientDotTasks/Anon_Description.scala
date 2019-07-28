package typings.gapiDotClientDotTasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  /** The description. In HTML speak: Everything between <a> and </a>. */
  var description: js.UndefOr[String] = js.undefined
  /** The URL. */
  var link: js.UndefOr[String] = js.undefined
  /** Type of the link, e.g. "email". */
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_Description {
  @scala.inline
  def apply(description: String = null, link: String = null, `type`: String = null): Anon_Description = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (link != null) __obj.updateDynamic("link")(link)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Description]
  }
}

