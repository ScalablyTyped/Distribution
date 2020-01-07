package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies an account and how to log into it.
  */
@js.native
trait Schema$Account extends js.Object {
  /**
    * An automatic google login account.
    */
  var googleAuto: js.UndefOr[Schema$GoogleAuto] = js.native
}

object Schema$Account {
  @scala.inline
  def apply(googleAuto: Schema$GoogleAuto = null): Schema$Account = {
    val __obj = js.Dynamic.literal()
    if (googleAuto != null) __obj.updateDynamic("googleAuto")(googleAuto.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Account]
  }
}

