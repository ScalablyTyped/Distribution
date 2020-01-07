package typings.googleapis.buildSrcApisGroupsmigrationV1Mod.groupsmigration_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON response template for groups migration API.
  */
@js.native
trait Schema$Groups extends js.Object {
  /**
    * The kind of insert resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The status of the insert request.
    */
  var responseCode: js.UndefOr[String] = js.native
}

object Schema$Groups {
  @scala.inline
  def apply(kind: String = null, responseCode: String = null): Schema$Groups = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (responseCode != null) __obj.updateDynamic("responseCode")(responseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Groups]
  }
}

