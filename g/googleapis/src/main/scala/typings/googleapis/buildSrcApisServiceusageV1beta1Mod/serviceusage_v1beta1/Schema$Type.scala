package typings.googleapis.buildSrcApisServiceusageV1beta1Mod.serviceusage_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A protocol buffer message type.
  */
@js.native
trait Schema$Type extends js.Object {
  /**
    * The list of fields.
    */
  var fields: js.UndefOr[js.Array[Schema$Field]] = js.native
  /**
    * The fully qualified message name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The list of types appearing in `oneof` definitions in this type.
    */
  var oneofs: js.UndefOr[js.Array[String]] = js.native
  /**
    * The protocol buffer options.
    */
  var options: js.UndefOr[js.Array[Schema$Option]] = js.native
  /**
    * The source context.
    */
  var sourceContext: js.UndefOr[Schema$SourceContext] = js.native
  /**
    * The source syntax.
    */
  var syntax: js.UndefOr[String] = js.native
}

object Schema$Type {
  @scala.inline
  def apply(
    fields: js.Array[Schema$Field] = null,
    name: String = null,
    oneofs: js.Array[String] = null,
    options: js.Array[Schema$Option] = null,
    sourceContext: Schema$SourceContext = null,
    syntax: String = null
  ): Schema$Type = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (oneofs != null) __obj.updateDynamic("oneofs")(oneofs.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (sourceContext != null) __obj.updateDynamic("sourceContext")(sourceContext.asInstanceOf[js.Any])
    if (syntax != null) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Type]
  }
}

