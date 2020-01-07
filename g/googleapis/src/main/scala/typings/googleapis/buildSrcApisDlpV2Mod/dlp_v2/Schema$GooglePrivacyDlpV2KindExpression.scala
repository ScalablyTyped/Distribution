package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a Datastore kind.
  */
@js.native
trait Schema$GooglePrivacyDlpV2KindExpression extends js.Object {
  /**
    * The name of the kind.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2KindExpression {
  @scala.inline
  def apply(name: String = null): Schema$GooglePrivacyDlpV2KindExpression = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2KindExpression]
  }
}

