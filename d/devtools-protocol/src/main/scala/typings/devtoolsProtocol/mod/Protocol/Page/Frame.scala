package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.Network.LoaderId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Frame extends StObject {
  
  /**
    * Indicates whether this frame was tagged as an ad.
    */
  var adFrameType: js.UndefOr[AdFrameType] = js.native
  
  /**
    * Indicates whether this is a cross origin isolated context.
    */
  var crossOriginIsolatedContextType: CrossOriginIsolatedContextType = js.native
  
  /**
    * Frame document's registered domain, taking the public suffixes list into account.
    * Extracted from the Frame's url.
    * Example URLs: http://www.google.com/file.html -> "google.com"
    *               http://a.b.co.uk/file.html      -> "b.co.uk"
    */
  var domainAndRegistry: String = js.native
  
  /**
    * Frame unique identifier.
    */
  var id: FrameId = js.native
  
  /**
    * Identifier of the loader associated with this frame.
    */
  var loaderId: LoaderId = js.native
  
  /**
    * Frame document's mimeType as determined by the browser.
    */
  var mimeType: String = js.native
  
  /**
    * Frame's name as specified in the tag.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Parent frame identifier.
    */
  var parentId: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the main document is a secure context and explains why that is the case.
    */
  var secureContextType: SecureContextType = js.native
  
  /**
    * Frame document's security origin.
    */
  var securityOrigin: String = js.native
  
  /**
    * If the frame failed to load, this contains the URL that could not be loaded. Note that unlike url above, this URL may contain a fragment.
    */
  var unreachableUrl: js.UndefOr[String] = js.native
  
  /**
    * Frame document's URL without fragment.
    */
  var url: String = js.native
  
  /**
    * Frame document's URL fragment including the '#'.
    */
  var urlFragment: js.UndefOr[String] = js.native
}
object Frame {
  
  @scala.inline
  def apply(
    crossOriginIsolatedContextType: CrossOriginIsolatedContextType,
    domainAndRegistry: String,
    id: FrameId,
    loaderId: LoaderId,
    mimeType: String,
    secureContextType: SecureContextType,
    securityOrigin: String,
    url: String
  ): Frame = {
    val __obj = js.Dynamic.literal(crossOriginIsolatedContextType = crossOriginIsolatedContextType.asInstanceOf[js.Any], domainAndRegistry = domainAndRegistry.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loaderId = loaderId.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], secureContextType = secureContextType.asInstanceOf[js.Any], securityOrigin = securityOrigin.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  
  @scala.inline
  implicit class FrameMutableBuilder[Self <: Frame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdFrameType(value: AdFrameType): Self = StObject.set(x, "adFrameType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdFrameTypeUndefined: Self = StObject.set(x, "adFrameType", js.undefined)
    
    @scala.inline
    def setCrossOriginIsolatedContextType(value: CrossOriginIsolatedContextType): Self = StObject.set(x, "crossOriginIsolatedContextType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainAndRegistry(value: String): Self = StObject.set(x, "domainAndRegistry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: FrameId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaderId(value: LoaderId): Self = StObject.set(x, "loaderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    @scala.inline
    def setSecureContextType(value: SecureContextType): Self = StObject.set(x, "secureContextType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreachableUrl(value: String): Self = StObject.set(x, "unreachableUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreachableUrlUndefined: Self = StObject.set(x, "unreachableUrl", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlFragment(value: String): Self = StObject.set(x, "urlFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlFragmentUndefined: Self = StObject.set(x, "urlFragment", js.undefined)
  }
}
