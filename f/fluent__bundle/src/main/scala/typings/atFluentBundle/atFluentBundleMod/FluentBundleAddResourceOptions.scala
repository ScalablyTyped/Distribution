package typings.atFluentBundle.atFluentBundleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FluentBundleAddResourceOptions extends js.Object {
  var allowOverrides: js.UndefOr[Boolean] = js.undefined
}

object FluentBundleAddResourceOptions {
  @scala.inline
  def apply(allowOverrides: js.UndefOr[Boolean] = js.undefined): FluentBundleAddResourceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowOverrides)) __obj.updateDynamic("allowOverrides")(allowOverrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[FluentBundleAddResourceOptions]
  }
}

