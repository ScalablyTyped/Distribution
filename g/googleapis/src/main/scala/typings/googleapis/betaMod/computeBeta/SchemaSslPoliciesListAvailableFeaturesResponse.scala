package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSslPoliciesListAvailableFeaturesResponse extends StObject {
  
  var features: js.UndefOr[js.Array[String]] = js.native
}
object SchemaSslPoliciesListAvailableFeaturesResponse {
  
  @scala.inline
  def apply(): SchemaSslPoliciesListAvailableFeaturesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslPoliciesListAvailableFeaturesResponse]
  }
  
  @scala.inline
  implicit class SchemaSslPoliciesListAvailableFeaturesResponseMutableBuilder[Self <: SchemaSslPoliciesListAvailableFeaturesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value :_*))
  }
}
