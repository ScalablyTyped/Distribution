package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for DomainMappings.ListDomainMappings.
  */
@js.native
trait SchemaListDomainMappingsResponse extends js.Object {
  /**
    * The domain mappings for the application.
    */
  var domainMappings: js.UndefOr[js.Array[SchemaDomainMapping]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDomainMappingsResponse {
  @scala.inline
  def apply(domainMappings: js.Array[SchemaDomainMapping] = null, nextPageToken: String = null): SchemaListDomainMappingsResponse = {
    val __obj = js.Dynamic.literal()
    if (domainMappings != null) __obj.updateDynamic("domainMappings")(domainMappings.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListDomainMappingsResponse]
  }
}

