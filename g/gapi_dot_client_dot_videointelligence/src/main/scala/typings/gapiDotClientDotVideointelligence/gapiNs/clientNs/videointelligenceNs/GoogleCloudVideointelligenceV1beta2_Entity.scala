package typings.gapiDotClientDotVideointelligence.gapiNs.clientNs.videointelligenceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta2_Entity extends js.Object {
  /** Textual description, e.g. `Fixed-gear bicycle`. */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Opaque entity ID. Some IDs may be available in
    * [Google Knowledge Graph Search
    * API](https://developers.google.com/knowledge-graph/).
    */
  var entityId: js.UndefOr[String] = js.undefined
  /** Language code for `description` in BCP-47 format. */
  var languageCode: js.UndefOr[String] = js.undefined
}

object GoogleCloudVideointelligenceV1beta2_Entity {
  @scala.inline
  def apply(description: String = null, entityId: String = null, languageCode: String = null): GoogleCloudVideointelligenceV1beta2_Entity = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (entityId != null) __obj.updateDynamic("entityId")(entityId)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2_Entity]
  }
}

