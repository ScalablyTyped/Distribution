package typings.doctrine.doctrineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /** The description of the thing this tag is documenting. */
  var description: String | Null
  /** Any errors that were encountered in parsing the tag. */
  var errors: js.UndefOr[js.Array[String]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  /** The name of the thing this tag is documenting, if any. */
  var name: js.UndefOr[String] = js.undefined
  /** The title of the jsdoc tag. e.g. `@foo` will have a title of 'foo'. */
  var title: String
  /** The type of the thing this tag is documenting. */
  var `type`: js.UndefOr[Type | Null] = js.undefined
}

object Tag {
  @scala.inline
  def apply(
    title: String,
    description: String = null,
    errors: js.Array[String] = null,
    kind: String = null,
    name: String = null,
    `type`: Type = null
  ): Tag = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

