package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMyconfigGetusersettings
  extends StObject
     with StandardParameters {
  
  /**
    * Unused. Added only to workaround TEX mandatory request template requirement
    */
  var country: js.UndefOr[String] = js.undefined
}
object ParamsResourceMyconfigGetusersettings {
  
  inline def apply(): ParamsResourceMyconfigGetusersettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMyconfigGetusersettings]
  }
  
  extension [Self <: ParamsResourceMyconfigGetusersettings](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
  }
}
