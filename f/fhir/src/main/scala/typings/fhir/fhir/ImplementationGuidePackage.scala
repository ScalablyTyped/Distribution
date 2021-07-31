package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Group of resources as used in .page.package
  */
trait ImplementationGuidePackage
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Human readable text describing the package
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Name used .page.package
    */
  var name: String
  
  /**
    * Resource in the implementation guide
    */
  var resource: js.Array[ImplementationGuidePackageResource]
}
object ImplementationGuidePackage {
  
  @scala.inline
  def apply(name: String, resource: js.Array[ImplementationGuidePackageResource]): ImplementationGuidePackage = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuidePackage]
  }
  
  @scala.inline
  implicit class ImplementationGuidePackageMutableBuilder[Self <: ImplementationGuidePackage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: js.Array[ImplementationGuidePackageResource]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceVarargs(value: ImplementationGuidePackageResource*): Self = StObject.set(x, "resource", js.Array(value :_*))
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
