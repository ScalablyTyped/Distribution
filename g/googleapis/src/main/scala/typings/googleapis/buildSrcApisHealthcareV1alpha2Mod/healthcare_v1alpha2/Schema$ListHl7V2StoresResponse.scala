package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists the HL7v2 stores in the given dataset.
  */
@js.native
trait Schema$ListHl7V2StoresResponse extends js.Object {
  /**
    * The returned HL7v2 stores. Won&#39;t be more HL7v2 stores than the value
    * of page_size in the request.
    */
  var hl7V2Stores: js.UndefOr[js.Array[Schema$Hl7V2Store]] = js.native
  /**
    * Token to retrieve the next page of results or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListHl7V2StoresResponse {
  @scala.inline
  def apply(hl7V2Stores: js.Array[Schema$Hl7V2Store] = null, nextPageToken: String = null): Schema$ListHl7V2StoresResponse = {
    val __obj = js.Dynamic.literal()
    if (hl7V2Stores != null) __obj.updateDynamic("hl7V2Stores")(hl7V2Stores.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListHl7V2StoresResponse]
  }
}

