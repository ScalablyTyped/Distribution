package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProjectsEnableXpnResourceRequest extends StObject {
  
  /**
    * Service resource (a.k.a service project) ID.
    */
  var xpnResource: js.UndefOr[SchemaXpnResourceId] = js.undefined
}
object SchemaProjectsEnableXpnResourceRequest {
  
  @scala.inline
  def apply(): SchemaProjectsEnableXpnResourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectsEnableXpnResourceRequest]
  }
  
  @scala.inline
  implicit class SchemaProjectsEnableXpnResourceRequestMutableBuilder[Self <: SchemaProjectsEnableXpnResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXpnResource(value: SchemaXpnResourceId): Self = StObject.set(x, "xpnResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXpnResourceUndefined: Self = StObject.set(x, "xpnResource", js.undefined)
  }
}
