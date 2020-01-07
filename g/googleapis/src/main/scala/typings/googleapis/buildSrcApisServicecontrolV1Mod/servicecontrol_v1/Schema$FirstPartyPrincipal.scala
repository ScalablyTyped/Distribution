package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * First party identity principal.
  */
@js.native
trait Schema$FirstPartyPrincipal extends js.Object {
  /**
    * The email address of a Google account. .
    */
  var principalEmail: js.UndefOr[String] = js.native
  /**
    * Metadata about the service that uses the service account. .
    */
  var serviceMetadata: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object Schema$FirstPartyPrincipal {
  @scala.inline
  def apply(principalEmail: String = null, serviceMetadata: StringDictionary[js.Any] = null): Schema$FirstPartyPrincipal = {
    val __obj = js.Dynamic.literal()
    if (principalEmail != null) __obj.updateDynamic("principalEmail")(principalEmail.asInstanceOf[js.Any])
    if (serviceMetadata != null) __obj.updateDynamic("serviceMetadata")(serviceMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FirstPartyPrincipal]
  }
}

