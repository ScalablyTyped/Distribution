package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A GroupPlacementPolicy specifies resource placement configuration. It
  * specifies the failure bucket separation as well as network locality
  */
trait SchemaResourcePolicyGroupPlacementPolicy extends StObject {
  
  /**
    * Specifies network locality
    */
  var locality: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies instances to hosts placement relationship
    */
  var style: js.UndefOr[String] = js.undefined
  
  /**
    * Number of vms in this placement group
    */
  var vmCount: js.UndefOr[Double] = js.undefined
}
object SchemaResourcePolicyGroupPlacementPolicy {
  
  @scala.inline
  def apply(): SchemaResourcePolicyGroupPlacementPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicyGroupPlacementPolicy]
  }
  
  @scala.inline
  implicit class SchemaResourcePolicyGroupPlacementPolicyMutableBuilder[Self <: SchemaResourcePolicyGroupPlacementPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setVmCount(value: Double): Self = StObject.set(x, "vmCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmCountUndefined: Self = StObject.set(x, "vmCount", js.undefined)
  }
}
