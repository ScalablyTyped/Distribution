package typings.express.expressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterOptions extends js.Object {
  /**
    * Enable case sensitivity.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /**
    * Preserve the req.params values from the parent router.
    * If the parent and the child have conflicting param names, the child’s value take precedence.
    *
    * @default false
    * @since 4.5.0
    */
  var mergeParams: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable strict routing.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
}

object RouterOptions {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    mergeParams: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined
  ): RouterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeParams)) __obj.updateDynamic("mergeParams")(mergeParams.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterOptions]
  }
}

