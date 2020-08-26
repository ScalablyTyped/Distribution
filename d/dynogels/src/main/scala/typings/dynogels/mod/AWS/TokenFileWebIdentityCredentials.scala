package typings.dynogels.mod.AWS

import typings.awsSdk.configMod.ConfigurationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynogels", "AWS.TokenFileWebIdentityCredentials")
@js.native
/**
  * Creates a new credentials object with optional configuraion.
  * @param {Object} clientConfig - a map of configuration options to pass to the underlying STS client.
  */
class TokenFileWebIdentityCredentials ()
  extends typings.awsSdk.mod.TokenFileWebIdentityCredentials {
  def this(clientConfig: ConfigurationOptions) = this()
}

