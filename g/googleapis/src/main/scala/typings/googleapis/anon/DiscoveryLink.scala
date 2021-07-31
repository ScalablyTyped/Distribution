package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscoveryLink extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var discoveryLink: js.UndefOr[String] = js.undefined
  
  var discoveryRestUrl: js.UndefOr[String] = js.undefined
  
  var documentationLink: js.UndefOr[String] = js.undefined
  
  var icons: js.UndefOr[X16] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var labels: js.UndefOr[js.Array[String]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var preferred: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object DiscoveryLink {
  
  @scala.inline
  def apply(): DiscoveryLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoveryLink]
  }
  
  @scala.inline
  implicit class DiscoveryLinkMutableBuilder[Self <: DiscoveryLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDiscoveryLink(value: String): Self = StObject.set(x, "discoveryLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscoveryLinkUndefined: Self = StObject.set(x, "discoveryLink", js.undefined)
    
    @scala.inline
    def setDiscoveryRestUrl(value: String): Self = StObject.set(x, "discoveryRestUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscoveryRestUrlUndefined: Self = StObject.set(x, "discoveryRestUrl", js.undefined)
    
    @scala.inline
    def setDocumentationLink(value: String): Self = StObject.set(x, "documentationLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationLinkUndefined: Self = StObject.set(x, "documentationLink", js.undefined)
    
    @scala.inline
    def setIcons(value: X16): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPreferred(value: Boolean): Self = StObject.set(x, "preferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredUndefined: Self = StObject.set(x, "preferred", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
