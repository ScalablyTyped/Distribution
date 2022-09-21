package typings.expoApplication

import typings.expoApplication.mod._PushNotificationServiceEnvironment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoApplicationStrings {
  
  @js.native
  sealed trait development
    extends StObject
       with _PushNotificationServiceEnvironment
  inline def development: development = "development".asInstanceOf[development]
  
  @js.native
  sealed trait production
    extends StObject
       with _PushNotificationServiceEnvironment
  inline def production: production = "production".asInstanceOf[production]
}
