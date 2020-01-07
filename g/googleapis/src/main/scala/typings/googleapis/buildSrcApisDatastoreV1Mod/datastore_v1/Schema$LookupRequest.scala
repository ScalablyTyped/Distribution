package typings.googleapis.buildSrcApisDatastoreV1Mod.datastore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Datastore.Lookup.
  */
@js.native
trait Schema$LookupRequest extends js.Object {
  /**
    * Keys of entities to look up.
    */
  var keys: js.UndefOr[js.Array[Schema$Key]] = js.native
  /**
    * The options for this lookup request.
    */
  var readOptions: js.UndefOr[Schema$ReadOptions] = js.native
}

object Schema$LookupRequest {
  @scala.inline
  def apply(keys: js.Array[Schema$Key] = null, readOptions: Schema$ReadOptions = null): Schema$LookupRequest = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (readOptions != null) __obj.updateDynamic("readOptions")(readOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LookupRequest]
  }
}

