package typings.googleapis.buildSrcApisAppengineV1Mod.appengine_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for DomainMappings.ListDomainMappings.
  */
@js.native
trait Schema$ListDomainMappingsResponse extends js.Object {
  /**
    * The domain mappings for the application.
    */
  var domainMappings: js.UndefOr[js.Array[Schema$DomainMapping]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListDomainMappingsResponse {
  @scala.inline
  def apply(domainMappings: js.Array[Schema$DomainMapping] = null, nextPageToken: String = null): Schema$ListDomainMappingsResponse = {
    val __obj = js.Dynamic.literal()
    if (domainMappings != null) __obj.updateDynamic("domainMappings")(domainMappings.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListDomainMappingsResponse]
  }
}

