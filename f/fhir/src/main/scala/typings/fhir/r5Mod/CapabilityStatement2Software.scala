package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapabilityStatement2Software
  extends StObject
     with BackboneElement {
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _releaseDate: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * Name the software is known by.
    */
  var name: String
  
  /**
    * Date this version of the software was released.
    */
  var releaseDate: js.UndefOr[String] = js.undefined
  
  /**
    * If possible, a version should be specified, as statements are likely to be different for different versions of software.
    */
  var version: js.UndefOr[String] = js.undefined
}
object CapabilityStatement2Software {
  
  inline def apply(name: String): CapabilityStatement2Software = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatement2Software]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapabilityStatement2Software] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
    
    inline def setReleaseDateUndefined: Self = StObject.set(x, "releaseDate", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_releaseDate(value: Element): Self = StObject.set(x, "_releaseDate", value.asInstanceOf[js.Any])
    
    inline def set_releaseDateUndefined: Self = StObject.set(x, "_releaseDate", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
