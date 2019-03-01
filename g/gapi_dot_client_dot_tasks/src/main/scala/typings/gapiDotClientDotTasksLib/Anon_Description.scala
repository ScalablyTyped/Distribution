package typings
package gapiDotClientDotTasksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  /** The description. In HTML speak: Everything between <a> and </a>. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The URL. */
  var link: js.UndefOr[java.lang.String] = js.undefined
  /** Type of the link, e.g. "email". */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Description {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    link: java.lang.String = null,
    `type`: java.lang.String = null
  ): Anon_Description = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (link != null) __obj.updateDynamic("link")(link)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Description]
  }
}

