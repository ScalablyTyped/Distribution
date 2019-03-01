package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  /** The list of fields. */
  var fields: js.UndefOr[js.Array[Field]] = js.undefined
  /** The fully qualified message name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The list of types appearing in oneof definitions in this type. */
  var oneofs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The protocol buffer options. */
  var options: js.UndefOr[js.Array[Option]] = js.undefined
  /** The source context. */
  var sourceContext: js.UndefOr[SourceContext] = js.undefined
  /** The source syntax. */
  var syntax: js.UndefOr[java.lang.String] = js.undefined
}

object Type {
  @scala.inline
  def apply(
    fields: js.Array[Field] = null,
    name: java.lang.String = null,
    oneofs: js.Array[java.lang.String] = null,
    options: js.Array[Option] = null,
    sourceContext: SourceContext = null,
    syntax: java.lang.String = null
  ): Type = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (name != null) __obj.updateDynamic("name")(name)
    if (oneofs != null) __obj.updateDynamic("oneofs")(oneofs)
    if (options != null) __obj.updateDynamic("options")(options)
    if (sourceContext != null) __obj.updateDynamic("sourceContext")(sourceContext)
    if (syntax != null) __obj.updateDynamic("syntax")(syntax)
    __obj.asInstanceOf[Type]
  }
}

