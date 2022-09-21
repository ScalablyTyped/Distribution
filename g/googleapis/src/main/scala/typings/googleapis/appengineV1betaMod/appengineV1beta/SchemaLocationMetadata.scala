package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocationMetadata extends StObject {
  
  /**
    * App Engine flexible environment is available in the given location.@OutputOnly
    */
  var flexibleEnvironmentAvailable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Search API (https://cloud.google.com/appengine/docs/standard/python/search) is available in the given location.
    */
  var searchApiAvailable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * App Engine standard environment is available in the given location.@OutputOnly
    */
  var standardEnvironmentAvailable: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaLocationMetadata {
  
  inline def apply(): SchemaLocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationMetadata]
  }
  
  extension [Self <: SchemaLocationMetadata](x: Self) {
    
    inline def setFlexibleEnvironmentAvailable(value: Boolean): Self = StObject.set(x, "flexibleEnvironmentAvailable", value.asInstanceOf[js.Any])
    
    inline def setFlexibleEnvironmentAvailableNull: Self = StObject.set(x, "flexibleEnvironmentAvailable", null)
    
    inline def setFlexibleEnvironmentAvailableUndefined: Self = StObject.set(x, "flexibleEnvironmentAvailable", js.undefined)
    
    inline def setSearchApiAvailable(value: Boolean): Self = StObject.set(x, "searchApiAvailable", value.asInstanceOf[js.Any])
    
    inline def setSearchApiAvailableNull: Self = StObject.set(x, "searchApiAvailable", null)
    
    inline def setSearchApiAvailableUndefined: Self = StObject.set(x, "searchApiAvailable", js.undefined)
    
    inline def setStandardEnvironmentAvailable(value: Boolean): Self = StObject.set(x, "standardEnvironmentAvailable", value.asInstanceOf[js.Any])
    
    inline def setStandardEnvironmentAvailableNull: Self = StObject.set(x, "standardEnvironmentAvailable", null)
    
    inline def setStandardEnvironmentAvailableUndefined: Self = StObject.set(x, "standardEnvironmentAvailable", js.undefined)
  }
}
