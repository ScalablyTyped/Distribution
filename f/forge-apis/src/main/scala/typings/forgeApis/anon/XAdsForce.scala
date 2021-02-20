package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XAdsForce extends StObject {
  
  var xAdsForce: js.UndefOr[Boolean] = js.native
}
object XAdsForce {
  
  @scala.inline
  def apply(): XAdsForce = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XAdsForce]
  }
  
  @scala.inline
  implicit class XAdsForceMutableBuilder[Self <: XAdsForce] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXAdsForce(value: Boolean): Self = StObject.set(x, "xAdsForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAdsForceUndefined: Self = StObject.set(x, "xAdsForce", js.undefined)
  }
}
