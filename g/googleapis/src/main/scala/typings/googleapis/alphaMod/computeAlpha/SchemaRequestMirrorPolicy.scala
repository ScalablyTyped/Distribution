package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A policy that specifies how requests intended for the route&#39;s backends
  * are shadowed to a separate mirrored backend service. Loadbalancer does not
  * wait for responses from the shadow service. Prior to sending traffic to the
  * shadow service, the host / authority header is suffixed with -shadow.
  */
@js.native
trait SchemaRequestMirrorPolicy extends StObject {
  
  /**
    * The full or partial URL to the BackendService resource being mirrored to.
    */
  var backendService: js.UndefOr[String] = js.native
}
object SchemaRequestMirrorPolicy {
  
  @scala.inline
  def apply(): SchemaRequestMirrorPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestMirrorPolicy]
  }
  
  @scala.inline
  implicit class SchemaRequestMirrorPolicyMutableBuilder[Self <: SchemaRequestMirrorPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendService(value: String): Self = StObject.set(x, "backendService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendServiceUndefined: Self = StObject.set(x, "backendService", js.undefined)
  }
}
