package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDistributionPolicyZoneConfiguration extends StObject {
  
  /**
    * The URL of the zone. The zone must exist in the region where the managed
    * instance group is located.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object SchemaDistributionPolicyZoneConfiguration {
  
  @scala.inline
  def apply(): SchemaDistributionPolicyZoneConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDistributionPolicyZoneConfiguration]
  }
  
  @scala.inline
  implicit class SchemaDistributionPolicyZoneConfigurationMutableBuilder[Self <: SchemaDistributionPolicyZoneConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
