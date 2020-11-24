package typings.fhirJsClient

import typings.fhirJsClient.FHIR.SMART.Client
import typings.fhirJsClient.FHIR.SMART.Context
import typings.fhirJsClient.FHIR.SMART.OAuth2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object FHIR extends js.Object {
    
    /**
      * Construct the SMART client directly without using the Oauth2 workflow
      * @param context Context required to construct the client.
      */
    def client(context: Context): Client = js.native
    
    /**
      * Property which exposes the OAUth2 specific workflow helpers
      */
    val oauth2: OAuth2 = js.native
    
    /**
      * Namespace containing all the SMART on FHIR related definitions
      */
    @js.native
    object SMART extends js.Object
  }
}
