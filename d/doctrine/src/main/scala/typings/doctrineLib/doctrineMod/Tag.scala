package typings
package doctrineLib.doctrineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /** The description of the thing this tag is documenting. */
  var description: java.lang.String | scala.Null
  /** Any errors that were encountered in parsing the tag. */
  var errors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the thing this tag is documenting, if any. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The title of the jsdoc tag. e.g. `@foo` will have a title of 'foo'. */
  var title: java.lang.String
  /** The type of the thing this tag is documenting. */
  var `type`: js.UndefOr[Type | scala.Null] = js.undefined
}

object Tag {
  @scala.inline
  def apply(
    title: java.lang.String,
    description: java.lang.String = null,
    errors: js.Array[java.lang.String] = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    `type`: Type = null
  ): Tag = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("title")(title)
    if (description != null) __obj.updateDynamic("description")(description)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Tag]
  }
}

