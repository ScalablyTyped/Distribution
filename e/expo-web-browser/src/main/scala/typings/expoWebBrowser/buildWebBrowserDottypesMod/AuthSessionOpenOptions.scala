package typings.expoWebBrowser.buildWebBrowserDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthSessionOpenOptions
  extends StObject
     with WebBrowserOpenOptions {
  
  /**
    * Determines whether the session should ask the browser for a private authentication session.
    * Set this to `true` to request that the browser doesn’t share cookies or other browsing data between the authentication session and the user’s normal browser session.
    * Whether the request is honored depends on the user’s default web browser.
    *
    * @default false
    * @platform ios 13+
    */
  var preferEphemeralSession: js.UndefOr[Boolean] = js.undefined
}
object AuthSessionOpenOptions {
  
  inline def apply(): AuthSessionOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthSessionOpenOptions]
  }
  
  extension [Self <: AuthSessionOpenOptions](x: Self) {
    
    inline def setPreferEphemeralSession(value: Boolean): Self = StObject.set(x, "preferEphemeralSession", value.asInstanceOf[js.Any])
    
    inline def setPreferEphemeralSessionUndefined: Self = StObject.set(x, "preferEphemeralSession", js.undefined)
  }
}
