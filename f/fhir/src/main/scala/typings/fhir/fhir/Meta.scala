package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata about a resource
  */
@js.native
trait Meta extends Element {
  
  /**
    * Contains extended information for property 'lastUpdated'.
    */
  var _lastUpdated: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'profile'.
    */
  var _profile: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'versionId'.
    */
  var _versionId: js.UndefOr[Element] = js.native
  
  /**
    * When the resource version last changed
    */
  var lastUpdated: js.UndefOr[instant] = js.native
  
  /**
    * Profiles this resource claims to conform to
    */
  var profile: js.UndefOr[js.Array[uri]] = js.native
  
  /**
    * Security Labels applied to this resource
    */
  var security: js.UndefOr[js.Array[Coding]] = js.native
  
  /**
    * Tags applied to this resource
    */
  var tag: js.UndefOr[js.Array[Coding]] = js.native
  
  /**
    * Version specific identifier
    */
  var versionId: js.UndefOr[id] = js.native
}
object Meta {
  
  @scala.inline
  def apply(): Meta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Meta]
  }
  
  @scala.inline
  implicit class MetaMutableBuilder[Self <: Meta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastUpdated(value: instant): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    @scala.inline
    def setProfile(value: js.Array[uri]): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    @scala.inline
    def setProfileVarargs(value: uri*): Self = StObject.set(x, "profile", js.Array(value :_*))
    
    @scala.inline
    def setSecurity(value: js.Array[Coding]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    @scala.inline
    def setSecurityVarargs(value: Coding*): Self = StObject.set(x, "security", js.Array(value :_*))
    
    @scala.inline
    def setTag(value: js.Array[Coding]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setTagVarargs(value: Coding*): Self = StObject.set(x, "tag", js.Array(value :_*))
    
    @scala.inline
    def setVersionId(value: id): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
    
    @scala.inline
    def set_lastUpdated(value: Element): Self = StObject.set(x, "_lastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lastUpdatedUndefined: Self = StObject.set(x, "_lastUpdated", js.undefined)
    
    @scala.inline
    def set_profile(value: js.Array[Element]): Self = StObject.set(x, "_profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_profileUndefined: Self = StObject.set(x, "_profile", js.undefined)
    
    @scala.inline
    def set_profileVarargs(value: Element*): Self = StObject.set(x, "_profile", js.Array(value :_*))
    
    @scala.inline
    def set_versionId(value: Element): Self = StObject.set(x, "_versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_versionIdUndefined: Self = StObject.set(x, "_versionId", js.undefined)
  }
}
