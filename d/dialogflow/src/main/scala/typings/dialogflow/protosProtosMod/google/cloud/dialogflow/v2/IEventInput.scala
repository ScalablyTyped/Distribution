package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import typings.dialogflow.protosProtosMod.google.protobuf.IStruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an EventInput. */
trait IEventInput extends js.Object {
  /** EventInput languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** EventInput name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** EventInput parameters */
  var parameters: js.UndefOr[IStruct | Null] = js.undefined
}

object IEventInput {
  @scala.inline
  def apply(languageCode: String = null, name: String = null, parameters: IStruct = null): IEventInput = {
    val __obj = js.Dynamic.literal()
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventInput]
  }
}

