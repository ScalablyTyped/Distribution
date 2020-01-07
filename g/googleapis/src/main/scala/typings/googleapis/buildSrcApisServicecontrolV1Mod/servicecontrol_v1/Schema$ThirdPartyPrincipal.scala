package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Third party identity principal.
  */
@js.native
trait Schema$ThirdPartyPrincipal extends js.Object {
  /**
    * Metadata about third party identity.
    */
  var thirdPartyClaims: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object Schema$ThirdPartyPrincipal {
  @scala.inline
  def apply(thirdPartyClaims: StringDictionary[js.Any] = null): Schema$ThirdPartyPrincipal = {
    val __obj = js.Dynamic.literal()
    if (thirdPartyClaims != null) __obj.updateDynamic("thirdPartyClaims")(thirdPartyClaims.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ThirdPartyPrincipal]
  }
}

