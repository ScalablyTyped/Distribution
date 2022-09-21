package typings.firebaseAppCheck

import typings.firebaseAppCheck.srcErrorsMod.AppCheckError
import typings.firebaseAppCheck.srcTypesMod.ListenerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseAppCheckStrings {
  
  @js.native
  sealed trait EXTERNAL
    extends StObject
       with ListenerType
       with typings.firebaseAppCheck.typesMod.ListenerType
  inline def EXTERNAL: EXTERNAL = "EXTERNAL".asInstanceOf[EXTERNAL]
  
  @js.native
  sealed trait INTERNAL
    extends StObject
       with ListenerType
       with typings.firebaseAppCheck.typesMod.ListenerType
  inline def INTERNAL: INTERNAL = "INTERNAL".asInstanceOf[INTERNAL]
  
  @js.native
  sealed trait `already-initialized`
    extends StObject
       with AppCheckError
       with typings.firebaseAppCheck.errorsMod.AppCheckError
  inline def `already-initialized`: `already-initialized` = "already-initialized".asInstanceOf[`already-initialized`]
  
  @js.native
  sealed trait `app-check` extends StObject
  inline def `app-check`: `app-check` = "app-check".asInstanceOf[`app-check`]
  
  @js.native
  sealed trait `app-check-internal` extends StObject
  inline def `app-check-internal`: `app-check-internal` = "app-check-internal".asInstanceOf[`app-check-internal`]
  
  @js.native
  sealed trait `fetch-network-error`
    extends StObject
       with AppCheckError
       with typings.firebaseAppCheck.errorsMod.AppCheckError
  inline def `fetch-network-error`: `fetch-network-error` = "fetch-network-error".asInstanceOf[`fetch-network-error`]
  
  @js.native
  sealed trait `fetch-parse-error`
    extends StObject
       with AppCheckError
       with typings.firebaseAppCheck.errorsMod.AppCheckError
  inline def `fetch-parse-error`: `fetch-parse-error` = "fetch-parse-error".asInstanceOf[`fetch-parse-error`]
  
  @js.native
  sealed trait `fetch-status-error`
    extends StObject
       with AppCheckError
       with typings.firebaseAppCheck.errorsMod.AppCheckError
  inline def `fetch-status-error`: `fetch-status-error` = "fetch-status-error".asInstanceOf[`fetch-status-error`]
  
  @js.native
  sealed trait heartbeat extends StObject
  inline def heartbeat: heartbeat = "heartbeat".asInstanceOf[heartbeat]
  
  @js.native
  sealed trait invisible extends StObject
  inline def invisible: invisible = "invisible".asInstanceOf[invisible]
  
  @js.native
  sealed trait `recaptcha-error`
    extends StObject
       with AppCheckError
       with typings.firebaseAppCheck.errorsMod.AppCheckError
  inline def `recaptcha-error`: `recaptcha-error` = "recaptcha-error".asInstanceOf[`recaptcha-error`]
  
  @js.native
  sealed trait `storage-get`
    extends StObject
       with AppCheckError
       with typings.firebaseAppCheck.errorsMod.AppCheckError
  inline def `storage-get`: `storage-get` = "storage-get".asInstanceOf[`storage-get`]
  
  @js.native
  sealed trait `storage-open`
    extends StObject
       with AppCheckError
       with typings.firebaseAppCheck.errorsMod.AppCheckError
  inline def `storage-open`: `storage-open` = "storage-open".asInstanceOf[`storage-open`]
  
  @js.native
  sealed trait `storage-set`
    extends StObject
       with AppCheckError
       with typings.firebaseAppCheck.errorsMod.AppCheckError
  inline def `storage-set`: `storage-set` = "storage-set".asInstanceOf[`storage-set`]
  
  @js.native
  sealed trait throttled
    extends StObject
       with AppCheckError
       with typings.firebaseAppCheck.errorsMod.AppCheckError
  inline def throttled: throttled = "throttled".asInstanceOf[throttled]
  
  @js.native
  sealed trait `use-before-activation`
    extends StObject
       with AppCheckError
       with typings.firebaseAppCheck.errorsMod.AppCheckError
  inline def `use-before-activation`: `use-before-activation` = "use-before-activation".asInstanceOf[`use-before-activation`]
}
