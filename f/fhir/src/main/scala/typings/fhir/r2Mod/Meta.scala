package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Meta
  extends StObject
     with Element {
  
  var _lastUpdated: js.UndefOr[Element] = js.undefined
  
  var _profile: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _versionId: js.UndefOr[Element] = js.undefined
  
  /**
    * When the resource last changed - e.g. when the version changed.
    */
  var lastUpdated: js.UndefOr[String] = js.undefined
  
  /**
    * A list of profiles [[[StructureDefinition]]]s that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]].
    */
  var profile: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Security labels applied to this resource. These tags connect specific resources to the overall security policy and infrastructure.
    */
  var security: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and workflow, and applications are not required to consider the tags when interpreting the meaning of a resource.
    */
  var tag: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * The version specific identifier, as it appears in the version portion of the URL. This values changes when the resource is created, updated, or deleted.
    */
  var versionId: js.UndefOr[String] = js.undefined
}
object Meta {
  
  inline def apply(): Meta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Meta]
  }
  
  extension [Self <: Meta](x: Self) {
    
    inline def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    inline def setProfile(value: js.Array[String]): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setProfileVarargs(value: String*): Self = StObject.set(x, "profile", js.Array(value*))
    
    inline def setSecurity(value: js.Array[Coding]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setSecurityVarargs(value: Coding*): Self = StObject.set(x, "security", js.Array(value*))
    
    inline def setTag(value: js.Array[Coding]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setTagVarargs(value: Coding*): Self = StObject.set(x, "tag", js.Array(value*))
    
    inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
    
    inline def set_lastUpdated(value: Element): Self = StObject.set(x, "_lastUpdated", value.asInstanceOf[js.Any])
    
    inline def set_lastUpdatedUndefined: Self = StObject.set(x, "_lastUpdated", js.undefined)
    
    inline def set_profile(value: js.Array[Element]): Self = StObject.set(x, "_profile", value.asInstanceOf[js.Any])
    
    inline def set_profileUndefined: Self = StObject.set(x, "_profile", js.undefined)
    
    inline def set_profileVarargs(value: Element*): Self = StObject.set(x, "_profile", js.Array(value*))
    
    inline def set_versionId(value: Element): Self = StObject.set(x, "_versionId", value.asInstanceOf[js.Any])
    
    inline def set_versionIdUndefined: Self = StObject.set(x, "_versionId", js.undefined)
  }
}
