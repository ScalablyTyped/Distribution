package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for the given google.cloud.location.Location.
  */
trait SchemaLocationMetadata extends StObject {
  
  /**
    * App Engine flexible environment is available in the given
    * location.@OutputOnly
    */
  var flexibleEnvironmentAvailable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * App Engine standard environment is available in the given
    * location.@OutputOnly
    */
  var standardEnvironmentAvailable: js.UndefOr[Boolean] = js.undefined
}
object SchemaLocationMetadata {
  
  @scala.inline
  def apply(): SchemaLocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationMetadata]
  }
  
  @scala.inline
  implicit class SchemaLocationMetadataMutableBuilder[Self <: SchemaLocationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlexibleEnvironmentAvailable(value: Boolean): Self = StObject.set(x, "flexibleEnvironmentAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexibleEnvironmentAvailableUndefined: Self = StObject.set(x, "flexibleEnvironmentAvailable", js.undefined)
    
    @scala.inline
    def setStandardEnvironmentAvailable(value: Boolean): Self = StObject.set(x, "standardEnvironmentAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardEnvironmentAvailableUndefined: Self = StObject.set(x, "standardEnvironmentAvailable", js.undefined)
  }
}
