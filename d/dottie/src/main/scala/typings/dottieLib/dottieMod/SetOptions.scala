package typings
package dottieLib.dottieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions extends js.Object {
  /**
    * force overwrite defined non-object keys into objects if needed
    */
  var force: js.UndefOr[scala.Boolean] = js.undefined
}

object SetOptions {
  @scala.inline
  def apply(force: js.UndefOr[scala.Boolean] = js.undefined): SetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[SetOptions]
  }
}

