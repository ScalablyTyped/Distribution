package typings.dialogflow.protosProtosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Struct. */
trait IStruct extends js.Object {
  /** Struct fields */
  var fields: js.UndefOr[StringDictionary[IValue] | Null] = js.undefined
}

object IStruct {
  @scala.inline
  def apply(fields: StringDictionary[IValue] = null): IStruct = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStruct]
  }
}

