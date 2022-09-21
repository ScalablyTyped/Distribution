package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagerStatusAllInstancesConfig extends StObject {
  
  /**
    * [Output Only] Current all-instances configuration revision. This value is in RFC3339 text format.
    */
  var currentRevision: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] A bit indicating whether this configuration has been applied to all managed instances in the group.
    */
  var effective: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaInstanceGroupManagerStatusAllInstancesConfig {
  
  inline def apply(): SchemaInstanceGroupManagerStatusAllInstancesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerStatusAllInstancesConfig]
  }
  
  extension [Self <: SchemaInstanceGroupManagerStatusAllInstancesConfig](x: Self) {
    
    inline def setCurrentRevision(value: String): Self = StObject.set(x, "currentRevision", value.asInstanceOf[js.Any])
    
    inline def setCurrentRevisionNull: Self = StObject.set(x, "currentRevision", null)
    
    inline def setCurrentRevisionUndefined: Self = StObject.set(x, "currentRevision", js.undefined)
    
    inline def setEffective(value: Boolean): Self = StObject.set(x, "effective", value.asInstanceOf[js.Any])
    
    inline def setEffectiveNull: Self = StObject.set(x, "effective", null)
    
    inline def setEffectiveUndefined: Self = StObject.set(x, "effective", js.undefined)
  }
}
