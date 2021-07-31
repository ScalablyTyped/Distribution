package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUInfo extends StObject {
  
  var renderer: String
  
  var vendor: String
}
object GPUInfo {
  
  @scala.inline
  def apply(renderer: String, vendor: String): GPUInfo = {
    val __obj = js.Dynamic.literal(renderer = renderer.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUInfo]
  }
  
  @scala.inline
  implicit class GPUInfoMutableBuilder[Self <: GPUInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderer(value: String): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
  }
}
