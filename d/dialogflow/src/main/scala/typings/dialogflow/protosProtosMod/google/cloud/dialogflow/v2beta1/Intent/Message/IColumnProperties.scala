package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.ColumnProperties.HorizontalAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ColumnProperties. */
trait IColumnProperties extends js.Object {
  /** ColumnProperties header */
  var header: js.UndefOr[String | Null] = js.undefined
  /** ColumnProperties horizontalAlignment */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment | Null] = js.undefined
}

object IColumnProperties {
  @scala.inline
  def apply(header: String = null, horizontalAlignment: HorizontalAlignment = null): IColumnProperties = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header)
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment)
    __obj.asInstanceOf[IColumnProperties]
  }
}

