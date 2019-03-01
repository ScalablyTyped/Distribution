package typings
package gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enum extends js.Object {
  /** Enum value definitions. */
  var enumvalue: js.UndefOr[js.Array[EnumValue]] = js.undefined
  /** Enum type name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Protocol buffer options. */
  var options: js.UndefOr[js.Array[Option]] = js.undefined
  /** The source context. */
  var sourceContext: js.UndefOr[SourceContext] = js.undefined
  /** The source syntax. */
  var syntax: js.UndefOr[java.lang.String] = js.undefined
}

object Enum {
  @scala.inline
  def apply(
    enumvalue: js.Array[EnumValue] = null,
    name: java.lang.String = null,
    options: js.Array[Option] = null,
    sourceContext: SourceContext = null,
    syntax: java.lang.String = null
  ): Enum = {
    val __obj = js.Dynamic.literal()
    if (enumvalue != null) __obj.updateDynamic("enumvalue")(enumvalue)
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    if (sourceContext != null) __obj.updateDynamic("sourceContext")(sourceContext)
    if (syntax != null) __obj.updateDynamic("syntax")(syntax)
    __obj.asInstanceOf[Enum]
  }
}

