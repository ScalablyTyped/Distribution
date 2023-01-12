package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImplementationGuideDependsOn
  extends StObject
     with BackboneElement {
  
  var _packageId: js.UndefOr[Element] = js.undefined
  
  var _uri: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * The NPM package name for the Implementation Guide that this IG depends on.
    */
  var packageId: js.UndefOr[String] = js.undefined
  
  /**
    * Usually, A canonical reference to the implementation guide is the same as the master location at which the implementation guide is published.
    */
  var uri: String
  
  /**
    * This follows the syntax of the NPM packaging version field - see [[reference]].
    */
  var version: js.UndefOr[String] = js.undefined
}
object ImplementationGuideDependsOn {
  
  inline def apply(uri: String): ImplementationGuideDependsOn = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuideDependsOn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImplementationGuideDependsOn] (val x: Self) extends AnyVal {
    
    inline def setPackageId(value: String): Self = StObject.set(x, "packageId", value.asInstanceOf[js.Any])
    
    inline def setPackageIdUndefined: Self = StObject.set(x, "packageId", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_packageId(value: Element): Self = StObject.set(x, "_packageId", value.asInstanceOf[js.Any])
    
    inline def set_packageIdUndefined: Self = StObject.set(x, "_packageId", js.undefined)
    
    inline def set_uri(value: Element): Self = StObject.set(x, "_uri", value.asInstanceOf[js.Any])
    
    inline def set_uriUndefined: Self = StObject.set(x, "_uri", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
