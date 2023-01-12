package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.Network.LoaderId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Frame extends StObject {
  
  /**
    * Indicates whether this frame was tagged as an ad and why.
    */
  var adFrameStatus: js.UndefOr[AdFrameStatus] = js.undefined
  
  /**
    * Indicates whether this is a cross origin isolated context.
    */
  var crossOriginIsolatedContextType: CrossOriginIsolatedContextType
  
  /**
    * Frame document's registered domain, taking the public suffixes list into account.
    * Extracted from the Frame's url.
    * Example URLs: http://www.google.com/file.html -> "google.com"
    *               http://a.b.co.uk/file.html      -> "b.co.uk"
    */
  var domainAndRegistry: String
  
  /**
    * Indicated which gated APIs / features are available.
    */
  var gatedAPIFeatures: js.Array[GatedAPIFeatures]
  
  /**
    * Frame unique identifier.
    */
  var id: FrameId
  
  /**
    * Identifier of the loader associated with this frame.
    */
  var loaderId: LoaderId
  
  /**
    * Frame document's mimeType as determined by the browser.
    */
  var mimeType: String
  
  /**
    * Frame's name as specified in the tag.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Parent frame identifier.
    */
  var parentId: js.UndefOr[FrameId] = js.undefined
  
  /**
    * Indicates whether the main document is a secure context and explains why that is the case.
    */
  var secureContextType: SecureContextType
  
  /**
    * Frame document's security origin.
    */
  var securityOrigin: String
  
  /**
    * If the frame failed to load, this contains the URL that could not be loaded. Note that unlike url above, this URL may contain a fragment.
    */
  var unreachableUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Frame document's URL without fragment.
    */
  var url: String
  
  /**
    * Frame document's URL fragment including the '#'.
    */
  var urlFragment: js.UndefOr[String] = js.undefined
}
object Frame {
  
  inline def apply(
    crossOriginIsolatedContextType: CrossOriginIsolatedContextType,
    domainAndRegistry: String,
    gatedAPIFeatures: js.Array[GatedAPIFeatures],
    id: FrameId,
    loaderId: LoaderId,
    mimeType: String,
    secureContextType: SecureContextType,
    securityOrigin: String,
    url: String
  ): Frame = {
    val __obj = js.Dynamic.literal(crossOriginIsolatedContextType = crossOriginIsolatedContextType.asInstanceOf[js.Any], domainAndRegistry = domainAndRegistry.asInstanceOf[js.Any], gatedAPIFeatures = gatedAPIFeatures.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loaderId = loaderId.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], secureContextType = secureContextType.asInstanceOf[js.Any], securityOrigin = securityOrigin.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Frame] (val x: Self) extends AnyVal {
    
    inline def setAdFrameStatus(value: AdFrameStatus): Self = StObject.set(x, "adFrameStatus", value.asInstanceOf[js.Any])
    
    inline def setAdFrameStatusUndefined: Self = StObject.set(x, "adFrameStatus", js.undefined)
    
    inline def setCrossOriginIsolatedContextType(value: CrossOriginIsolatedContextType): Self = StObject.set(x, "crossOriginIsolatedContextType", value.asInstanceOf[js.Any])
    
    inline def setDomainAndRegistry(value: String): Self = StObject.set(x, "domainAndRegistry", value.asInstanceOf[js.Any])
    
    inline def setGatedAPIFeatures(value: js.Array[GatedAPIFeatures]): Self = StObject.set(x, "gatedAPIFeatures", value.asInstanceOf[js.Any])
    
    inline def setGatedAPIFeaturesVarargs(value: GatedAPIFeatures*): Self = StObject.set(x, "gatedAPIFeatures", js.Array(value*))
    
    inline def setId(value: FrameId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLoaderId(value: LoaderId): Self = StObject.set(x, "loaderId", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentId(value: FrameId): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    inline def setSecureContextType(value: SecureContextType): Self = StObject.set(x, "secureContextType", value.asInstanceOf[js.Any])
    
    inline def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
    
    inline def setUnreachableUrl(value: String): Self = StObject.set(x, "unreachableUrl", value.asInstanceOf[js.Any])
    
    inline def setUnreachableUrlUndefined: Self = StObject.set(x, "unreachableUrl", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlFragment(value: String): Self = StObject.set(x, "urlFragment", value.asInstanceOf[js.Any])
    
    inline def setUrlFragmentUndefined: Self = StObject.set(x, "urlFragment", js.undefined)
  }
}
