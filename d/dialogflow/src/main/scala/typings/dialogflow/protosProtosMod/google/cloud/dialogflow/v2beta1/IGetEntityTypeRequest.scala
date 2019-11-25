package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetEntityTypeRequest. */
trait IGetEntityTypeRequest extends js.Object {
  /** GetEntityTypeRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** GetEntityTypeRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IGetEntityTypeRequest {
  @scala.inline
  def apply(languageCode: String = null, name: String = null): IGetEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetEntityTypeRequest]
  }
}

