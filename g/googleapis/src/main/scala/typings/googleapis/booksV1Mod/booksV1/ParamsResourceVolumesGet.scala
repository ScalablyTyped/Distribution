package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVolumesGet
  extends StObject
     with StandardParameters {
  
  /**
    * ISO-3166-1 code to override the IP-based location.
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * Set to true to include non-comics series. Defaults to false.
    */
  var includeNonComicsSeries: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Brand results for partner ID.
    */
  var partner: js.UndefOr[String] = js.undefined
  
  /**
    * Restrict information returned to a set of selected fields.
    */
  var projection: js.UndefOr[String] = js.undefined
  
  /**
    * string to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var user_library_consistent_read: js.UndefOr[Boolean] = js.undefined
  
  /**
    * ID of volume to retrieve.
    */
  var volumeId: js.UndefOr[String] = js.undefined
}
object ParamsResourceVolumesGet {
  
  inline def apply(): ParamsResourceVolumesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVolumesGet]
  }
  
  extension [Self <: ParamsResourceVolumesGet](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setIncludeNonComicsSeries(value: Boolean): Self = StObject.set(x, "includeNonComicsSeries", value.asInstanceOf[js.Any])
    
    inline def setIncludeNonComicsSeriesUndefined: Self = StObject.set(x, "includeNonComicsSeries", js.undefined)
    
    inline def setPartner(value: String): Self = StObject.set(x, "partner", value.asInstanceOf[js.Any])
    
    inline def setPartnerUndefined: Self = StObject.set(x, "partner", js.undefined)
    
    inline def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setUser_library_consistent_read(value: Boolean): Self = StObject.set(x, "user_library_consistent_read", value.asInstanceOf[js.Any])
    
    inline def setUser_library_consistent_readUndefined: Self = StObject.set(x, "user_library_consistent_read", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
