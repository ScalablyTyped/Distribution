package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Meta
  extends StObject
     with Element {
  
  var _lastUpdated: js.UndefOr[Element] = js.undefined
  
  var _profile: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _source: js.UndefOr[Element] = js.undefined
  
  var _versionId: js.UndefOr[Element] = js.undefined
  
  /**
    * This value is always populated except when the resource is first being created. The server / resource manager sets this value; what a client provides is irrelevant. This is equivalent to the HTTP Last-Modified and SHOULD have the same value on a [read](http.html#read) interaction.
    */
  var lastUpdated: js.UndefOr[String] = js.undefined
  
  /**
    * It is up to the server and/or other infrastructure of policy to determine whether/how these claims are verified and/or updated over time.  The list of profile URLs is a set.
    */
  var profile: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The security labels can be updated without changing the stated version of the resource. The list of security labels is a set. Uniqueness is based the system/code, and version and display are ignored.
    */
  var security: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * In the provenance resource, this corresponds to Provenance.entity.what[x]. The exact use of the source (and the implied Provenance.entity.role) is left to implementer discretion. Only one nominated source is allowed; for additional provenance details, a full Provenance resource should be used.
    * This element can be used to indicate where the current master source of a resource that has a canonical URL if the resource is no longer hosted at the canonical URL.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * The tags can be updated without changing the stated version of the resource. The list of tags is a set. Uniqueness is based the system/code, and version and display are ignored.
    */
  var tag: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * The server assigns this value, and ignores what the client specifies, except in the case that the server is imposing version integrity on updates/deletes.
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
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
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
    
    inline def set_source(value: Element): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    inline def set_versionId(value: Element): Self = StObject.set(x, "_versionId", value.asInstanceOf[js.Any])
    
    inline def set_versionIdUndefined: Self = StObject.set(x, "_versionId", js.undefined)
  }
}
