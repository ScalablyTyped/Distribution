package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ColumnProperties.HorizontalAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ColumnProperties. */
trait IColumnProperties extends js.Object {
  /** ColumnProperties header */
  var header: js.UndefOr[String | Null] = js.undefined
  /** ColumnProperties horizontalAlignment */
  var horizontalAlignment: js.UndefOr[
    HorizontalAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.ColumnProperties.HorizontalAlignment * / any */ String) | Null
  ] = js.undefined
}

object IColumnProperties {
  @scala.inline
  def apply(
    header: js.UndefOr[Null | String] = js.undefined,
    horizontalAlignment: js.UndefOr[
      Null | HorizontalAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.ColumnProperties.HorizontalAlignment * / any */ String)
    ] = js.undefined
  ): IColumnProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalAlignment)) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnProperties]
  }
}

