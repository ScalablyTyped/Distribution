package typings.googleapis.buildSrcApisServiceconsumermanagementV1Mod.serviceconsumermanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enum type definition.
  */
@js.native
trait Schema$Enum extends js.Object {
  /**
    * Enum value definitions.
    */
  var enumvalue: js.UndefOr[js.Array[Schema$EnumValue]] = js.native
  /**
    * Enum type name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Protocol buffer options.
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

object Schema$Enum {
  @scala.inline
  def apply(
    enumvalue: js.Array[Schema$EnumValue] = null,
    name: String = null,
    options: js.Array[Schema$Option] = null,
    sourceContext: Schema$SourceContext = null,
    syntax: String = null
  ): Schema$Enum = {
    val __obj = js.Dynamic.literal()
    if (enumvalue != null) __obj.updateDynamic("enumvalue")(enumvalue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (sourceContext != null) __obj.updateDynamic("sourceContext")(sourceContext.asInstanceOf[js.Any])
    if (syntax != null) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Enum]
  }
}

