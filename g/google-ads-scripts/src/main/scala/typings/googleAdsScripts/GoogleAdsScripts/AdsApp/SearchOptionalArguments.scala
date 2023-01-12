package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchOptionalArguments extends StObject {
  
  /** The AdWords API version to query. Sunsetted versions are not allowed. Defaults to the most recent supported version. */
  var apiVersion: js.UndefOr[String] = js.undefined
}
object SearchOptionalArguments {
  
  inline def apply(): SearchOptionalArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOptionalArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchOptionalArguments] (val x: Self) extends AnyVal {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
  }
}
