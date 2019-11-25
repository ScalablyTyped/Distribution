package typings.gapiDotClientDotServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  /** The list of fields. */
  var fields: js.UndefOr[js.Array[Field]] = js.undefined
  /** The fully qualified message name. */
  var name: js.UndefOr[String] = js.undefined
  /** The list of types appearing in `oneof` definitions in this type. */
  var oneofs: js.UndefOr[js.Array[String]] = js.undefined
  /** The protocol buffer options. */
  var options: js.UndefOr[js.Array[Option]] = js.undefined
  /** The source context. */
  var sourceContext: js.UndefOr[SourceContext] = js.undefined
  /** The source syntax. */
  var syntax: js.UndefOr[String] = js.undefined
}

object Type {
  @scala.inline
  def apply(
    fields: js.Array[Field] = null,
    name: String = null,
    oneofs: js.Array[String] = null,
    options: js.Array[Option] = null,
    sourceContext: SourceContext = null,
    syntax: String = null
  ): Type = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (oneofs != null) __obj.updateDynamic("oneofs")(oneofs.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (sourceContext != null) __obj.updateDynamic("sourceContext")(sourceContext.asInstanceOf[js.Any])
    if (syntax != null) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

