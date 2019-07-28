package typings.gapiDotClientDotAppengine.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDomainMappingsResponse extends js.Object {
  /** The domain mappings for the application. */
  var domainMappings: js.UndefOr[js.Array[DomainMapping]] = js.undefined
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListDomainMappingsResponse {
  @scala.inline
  def apply(domainMappings: js.Array[DomainMapping] = null, nextPageToken: String = null): ListDomainMappingsResponse = {
    val __obj = js.Dynamic.literal()
    if (domainMappings != null) __obj.updateDynamic("domainMappings")(domainMappings)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListDomainMappingsResponse]
  }
}

