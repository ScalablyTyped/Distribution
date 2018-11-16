package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dialogflow", "v2beta1")
@js.native
object v2beta1Ns extends js.Object {
  @js.native
  class AgentsClient ()
    extends dialogflowLib.dialogflowMod.v2Ns.AgentsClient
  
  @js.native
  class ContextsClient ()
    extends dialogflowLib.dialogflowMod.v2Ns.ContextsClient {
    def environmentContextPath(
      project: java.lang.String,
      environment: java.lang.String,
      user: java.lang.String,
      session: java.lang.String,
      context: java.lang.String
    ): java.lang.String = js.native
    def environmentSessionPath(
      project: java.lang.String,
      environment: java.lang.String,
      user: java.lang.String,
      session: java.lang.String
    ): java.lang.String = js.native
    def matchContextFromEnvironmentContextName(environmentContextName: java.lang.String): java.lang.String = js.native
    def matchEnvironmentFromEnvironmentContextName(environmentContextName: java.lang.String): java.lang.String = js.native
    def matchEnvironmentFromEnvironmentSessionName(environmentSessionName: java.lang.String): java.lang.String = js.native
    def matchProjectFromEnvironmentContextName(environmentContextName: java.lang.String): java.lang.String = js.native
    def matchProjectFromEnvironmentSessionName(environmentSessionName: java.lang.String): java.lang.String = js.native
    def matchSessionFromEnvironmentContextName(environmentContextName: java.lang.String): java.lang.String = js.native
    def matchSessionFromEnvironmentSessionName(environmentSessionName: java.lang.String): java.lang.String = js.native
    def matchUserFromEnvironmentContextName(environmentContextName: java.lang.String): java.lang.String = js.native
    def matchUserFromEnvironmentSessionName(environmentSessionName: java.lang.String): java.lang.String = js.native
  }
  
  @js.native
  class EntityTypesClient ()
    extends dialogflowLib.dialogflowMod.v2Ns.EntityTypesClient
  
  @js.native
  class IntentsClient ()
    extends dialogflowLib.dialogflowMod.v2Ns.IntentsClient
  
  @js.native
  class SessionEntityTypesClient ()
    extends dialogflowLib.dialogflowMod.v2Ns.SessionEntityTypesClient
  
  @js.native
  class SessionsClient ()
    extends dialogflowLib.dialogflowMod.v2Ns.SessionsClient {
    def environmentSessionPath(
      project: java.lang.String,
      environment: java.lang.String,
      user: java.lang.String,
      session: java.lang.String
    ): java.lang.String = js.native
    def matchEnvironmentFromEnvironmentSessionName(environmentSessionName: java.lang.String): java.lang.String = js.native
    def matchProjectFromEnvironmentSessionName(environmentSessionName: java.lang.String): java.lang.String = js.native
    def matchSessionFromEnvironmentSessionName(environmentSessionName: java.lang.String): java.lang.String = js.native
    def matchUserFromEnvironmentSessionName(environmentSessionName: java.lang.String): java.lang.String = js.native
  }
  
}

