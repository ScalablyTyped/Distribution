package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A map value.
  */
@js.native
trait Schema$MapValue extends js.Object {
  /**
    * The map&#39;s fields.  The map keys represent field names. Field names
    * matching the regular expression `__.*__` are reserved. Reserved field
    * names are forbidden except in certain documented contexts. The map keys,
    * represented as UTF-8, must not exceed 1,500 bytes and cannot be empty.
    */
  var fields: js.UndefOr[StringDictionary[Schema$Value]] = js.native
}

object Schema$MapValue {
  @scala.inline
  def apply(fields: StringDictionary[Schema$Value] = null): Schema$MapValue = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MapValue]
  }
}

