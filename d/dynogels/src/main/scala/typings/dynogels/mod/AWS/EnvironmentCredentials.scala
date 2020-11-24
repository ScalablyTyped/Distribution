package typings.dynogels.mod.AWS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dynogels", "AWS.EnvironmentCredentials")
@js.native
class EnvironmentCredentials protected ()
  extends typings.awsSdk.mod.EnvironmentCredentials {
  /**
    * Creates a new EnvironmentCredentials class with a given variable prefix envPrefix.
    * @param {string} envPrefix - The prefix for the environment variable names excluding the separating underscore.
    */
  def this(envPrefix: String) = this()
}
