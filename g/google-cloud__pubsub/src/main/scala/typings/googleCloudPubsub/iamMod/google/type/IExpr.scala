package typings.googleCloudPubsub.iamMod.google.`type`

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
    description: String = null,
    expression: String = null,
    location: String = null,
    title: String = null
  ): IExpr = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExpr]
  }
}

