package typings.googleapis.buildSrcApisAppengineV1alphaMod.appengine_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A domain serving an App Engine application.
  */
@js.native
trait Schema$DomainMapping extends js.Object {
  /**
    * Relative name of the domain serving the application. Example:
    * example.com.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Full path to the DomainMapping resource in the API. Example:
    * apps/myapp/domainMapping/example.com.@OutputOnly
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The resource records required to configure this domain mapping. These
    * records must be added to the domain&#39;s DNS configuration in order to
    * serve the application via this domain mapping.@OutputOnly
    */
  var resourceRecords: js.UndefOr[js.Array[Schema$ResourceRecord]] = js.native
  /**
    * SSL configuration for this domain. If unconfigured, this domain will not
    * serve with SSL.
    */
  var sslSettings: js.UndefOr[Schema$SslSettings] = js.native
}

object Schema$DomainMapping {
  @scala.inline
  def apply(
    id: String = null,
    name: String = null,
    resourceRecords: js.Array[Schema$ResourceRecord] = null,
    sslSettings: Schema$SslSettings = null
  ): Schema$DomainMapping = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceRecords != null) __obj.updateDynamic("resourceRecords")(resourceRecords.asInstanceOf[js.Any])
    if (sslSettings != null) __obj.updateDynamic("sslSettings")(sslSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DomainMapping]
  }
}

