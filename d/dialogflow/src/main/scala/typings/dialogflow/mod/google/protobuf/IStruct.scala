package typings.dialogflow.mod.google.protobuf

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
  def apply(fields: js.UndefOr[Null | StringDictionary[IValue]] = js.undefined): IStruct = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fields)) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStruct]
  }
}

