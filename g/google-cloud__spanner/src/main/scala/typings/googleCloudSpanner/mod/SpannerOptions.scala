package typings.googleCloudSpanner.mod

import typings.googleGax.buildSrcGrpcMod.GrpcClientOptions
import typings.googleGax.mod.grpc.ChannelCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpannerOptions
  extends StObject
     with GrpcClientOptions {
  
  var apiEndpoint: js.UndefOr[String] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var routeToLeaderEnabled: js.UndefOr[Boolean] = js.undefined
  
  var servicePath: js.UndefOr[String] = js.undefined
  
  var sslCreds: js.UndefOr[ChannelCredentials] = js.undefined
}
object SpannerOptions {
  
  inline def apply(): SpannerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpannerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpannerOptions] (val x: Self) extends AnyVal {
    
    inline def setApiEndpoint(value: String): Self = StObject.set(x, "apiEndpoint", value.asInstanceOf[js.Any])
    
    inline def setApiEndpointUndefined: Self = StObject.set(x, "apiEndpoint", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setRouteToLeaderEnabled(value: Boolean): Self = StObject.set(x, "routeToLeaderEnabled", value.asInstanceOf[js.Any])
    
    inline def setRouteToLeaderEnabledUndefined: Self = StObject.set(x, "routeToLeaderEnabled", js.undefined)
    
    inline def setServicePath(value: String): Self = StObject.set(x, "servicePath", value.asInstanceOf[js.Any])
    
    inline def setServicePathUndefined: Self = StObject.set(x, "servicePath", js.undefined)
    
    inline def setSslCreds(value: ChannelCredentials): Self = StObject.set(x, "sslCreds", value.asInstanceOf[js.Any])
    
    inline def setSslCredsUndefined: Self = StObject.set(x, "sslCreds", js.undefined)
  }
}
