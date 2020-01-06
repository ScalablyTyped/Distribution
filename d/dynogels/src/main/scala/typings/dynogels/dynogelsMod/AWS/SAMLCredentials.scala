package typings.dynogels.dynogelsMod.AWS

import typings.awsDashSdk.libCredentialsSamlUnderscoreCredentialsMod.SAMLCredentialsParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynogels", "AWS.SAMLCredentials")
@js.native
class SAMLCredentials protected ()
  extends typings.awsDashSdk.awsDashSdkMod.SAMLCredentials {
  /**
  		 * Creates a new credentials object.
  		 * @param {object} params - The map of params passed to AWS.STS.assumeRoleWithSAML().
  		 */
  def this(params: SAMLCredentialsParams) = this()
}

