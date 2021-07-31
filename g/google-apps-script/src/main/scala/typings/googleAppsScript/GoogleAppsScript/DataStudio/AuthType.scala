package typings.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AuthType extends StObject
/**
  * An enum that defines the authentication types that can be set for a connector.
  */
@JSGlobal("GoogleAppsScript.Data_Studio.AuthType")
@js.native
object AuthType extends StObject {
  
  @js.native
  sealed trait KEY
    extends StObject
       with AuthType
  
  @js.native
  sealed trait NONE
    extends StObject
       with AuthType
  
  @js.native
  sealed trait OAUTH2
    extends StObject
       with AuthType
  
  @js.native
  sealed trait USER_PASS
    extends StObject
       with AuthType
  
  @js.native
  sealed trait USER_TOKEN
    extends StObject
       with AuthType
}
