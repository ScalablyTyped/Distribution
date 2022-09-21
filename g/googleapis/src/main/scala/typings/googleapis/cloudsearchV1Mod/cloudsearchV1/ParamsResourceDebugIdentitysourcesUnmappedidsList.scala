package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDebugIdentitysourcesUnmappedidsList
  extends StObject
     with StandardParameters {
  
  /**
    * If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field.
    */
  @JSName("debugOptions.enableDebugging")
  var debugOptionsDotenableDebugging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum number of items to fetch in a request. Defaults to 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The next_page_token value returned from a previous List request, if any.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the identity source, in the following format: identitysources/{source_id\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Limit users selection to this status.
    */
  var resolutionStatusCode: js.UndefOr[String] = js.undefined
}
object ParamsResourceDebugIdentitysourcesUnmappedidsList {
  
  inline def apply(): ParamsResourceDebugIdentitysourcesUnmappedidsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDebugIdentitysourcesUnmappedidsList]
  }
  
  extension [Self <: ParamsResourceDebugIdentitysourcesUnmappedidsList](x: Self) {
    
    inline def setDebugOptionsDotenableDebugging(value: Boolean): Self = StObject.set(x, "debugOptions.enableDebugging", value.asInstanceOf[js.Any])
    
    inline def setDebugOptionsDotenableDebuggingUndefined: Self = StObject.set(x, "debugOptions.enableDebugging", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setResolutionStatusCode(value: String): Self = StObject.set(x, "resolutionStatusCode", value.asInstanceOf[js.Any])
    
    inline def setResolutionStatusCodeUndefined: Self = StObject.set(x, "resolutionStatusCode", js.undefined)
  }
}
