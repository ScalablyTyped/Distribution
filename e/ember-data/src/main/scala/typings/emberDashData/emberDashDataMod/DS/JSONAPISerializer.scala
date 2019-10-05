package typings.emberDashData.emberDashDataMod.DS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Ember Data 2.0 Serializer:
  */
@JSImport("ember-data", "DS.JSONAPISerializer")
@js.native
class JSONAPISerializer () extends JSONSerializer {
  /**
    * Converts the model name to a pluralized version of the model name.
    */
  def payloadKeyFromModelName[K /* <: String */](modelName: K): String = js.native
  /**
    * `payloadTypeFromModelName` can be used to change the mapping for the type in
    * the payload, taken from the model name.
    */
  def payloadTypeFromModelName[K /* <: String */](modelName: K): String = js.native
  def pushPayload(store: Store, payload: js.Object): js.Any = js.native
}

