package typings.googleCloudPubsub.protosMod.google.`type`

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Expr. */
trait IExpr extends js.Object {
  /** Expr description */
  var description: js.UndefOr[String | Null] = js.undefined
  /** Expr expression */
  var expression: js.UndefOr[String | Null] = js.undefined
  /** Expr location */
  var location: js.UndefOr[String | Null] = js.undefined
  /** Expr title */
  var title: js.UndefOr[String | Null] = js.undefined
}

object IExpr {
  @scala.inline
  def apply(
    description: js.UndefOr[Null | String] = js.undefined,
    expression: js.UndefOr[Null | String] = js.undefined,
    location: js.UndefOr[Null | String] = js.undefined,
    title: js.UndefOr[Null | String] = js.undefined
  ): IExpr = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(expression)) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (!js.isUndefined(location)) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExpr]
  }
}

