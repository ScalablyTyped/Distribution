package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Amount extends js.Object {
  /**
    * [required] Value before taxes.
    */
  var pretax: js.UndefOr[Schema$Price] = js.native
  /**
    * [required] Tax value.
    */
  var tax: js.UndefOr[Schema$Price] = js.native
}

object Schema$Amount {
  @scala.inline
  def apply(pretax: Schema$Price = null, tax: Schema$Price = null): Schema$Amount = {
    val __obj = js.Dynamic.literal()
    if (pretax != null) __obj.updateDynamic("pretax")(pretax.asInstanceOf[js.Any])
    if (tax != null) __obj.updateDynamic("tax")(tax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Amount]
  }
}

