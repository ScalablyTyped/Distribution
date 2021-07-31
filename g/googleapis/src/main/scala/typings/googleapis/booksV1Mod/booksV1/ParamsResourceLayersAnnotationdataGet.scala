package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLayersAnnotationdataGet
  extends StObject
     with StandardParameters {
  
  /**
    * For the dictionary layer. Whether or not to allow web definitions.
    */
  var allowWebDefinitions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the annotation data to retrieve.
    */
  var annotationDataId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The content version for the volume you are trying to retrieve.
    */
  var contentVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The requested pixel height for any images. If height is provided width
    * must also be provided.
    */
  var h: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID for the layer to get the annotations.
    */
  var layerId: js.UndefOr[String] = js.undefined
  
  /**
    * The locale information for the data. ISO-639-1 language and ISO-3166-1
    * country code. Ex: 'en_US'.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * The requested scale for the image.
    */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * The volume to retrieve annotations for.
    */
  var volumeId: js.UndefOr[String] = js.undefined
  
  /**
    * The requested pixel width for any images. If width is provided height
    * must also be provided.
    */
  var w: js.UndefOr[Double] = js.undefined
}
object ParamsResourceLayersAnnotationdataGet {
  
  @scala.inline
  def apply(): ParamsResourceLayersAnnotationdataGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLayersAnnotationdataGet]
  }
  
  @scala.inline
  implicit class ParamsResourceLayersAnnotationdataGetMutableBuilder[Self <: ParamsResourceLayersAnnotationdataGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowWebDefinitions(value: Boolean): Self = StObject.set(x, "allowWebDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowWebDefinitionsUndefined: Self = StObject.set(x, "allowWebDefinitions", js.undefined)
    
    @scala.inline
    def setAnnotationDataId(value: String): Self = StObject.set(x, "annotationDataId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationDataIdUndefined: Self = StObject.set(x, "annotationDataId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setContentVersion(value: String): Self = StObject.set(x, "contentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentVersionUndefined: Self = StObject.set(x, "contentVersion", js.undefined)
    
    @scala.inline
    def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    @scala.inline
    def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
    
    @scala.inline
    def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWUndefined: Self = StObject.set(x, "w", js.undefined)
  }
}
