package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In contrast to a single BackendService in  HttpRouteAction to which all
  * matching traffic is directed to, WeightedBackendService allows traffic to
  * be split across multiple BackendServices. The volume of traffic for each
  * BackendService is proportional to the weight specified in each
  * WeightedBackendService
  */
trait SchemaWeightedBackendService extends StObject {
  
  /**
    * The full or partial URL to the default BackendService resource. Before
    * forwarding the request to backendService, the loadbalancer applies any
    * relevant headerActions specified as part of this backendServiceWeight.
    */
  var backendService: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies changes to request and response headers that need to take
    * effect for the selected backendService. headerAction specified here take
    * effect before headerAction in the enclosing HttpRouteRule, PathMatcher
    * and UrlMap.
    */
  var headerAction: js.UndefOr[SchemaHttpHeaderAction] = js.undefined
  
  /**
    * Specifies the fraction of traffic sent to backendService, computed as
    * weight / (sum of all weightedBackendService weights in routeAction) . The
    * selection of a backend service is determined only for new traffic. Once a
    * user&#39;s request has been directed to a backendService, subsequent
    * requests will be sent to the same backendService as determined by the
    * BackendService&#39;s session affinity policy. The value must be between 0
    * and 1000
    */
  var weight: js.UndefOr[Double] = js.undefined
}
object SchemaWeightedBackendService {
  
  inline def apply(): SchemaWeightedBackendService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWeightedBackendService]
  }
  
  extension [Self <: SchemaWeightedBackendService](x: Self) {
    
    inline def setBackendService(value: String): Self = StObject.set(x, "backendService", value.asInstanceOf[js.Any])
    
    inline def setBackendServiceUndefined: Self = StObject.set(x, "backendService", js.undefined)
    
    inline def setHeaderAction(value: SchemaHttpHeaderAction): Self = StObject.set(x, "headerAction", value.asInstanceOf[js.Any])
    
    inline def setHeaderActionUndefined: Self = StObject.set(x, "headerAction", js.undefined)
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
