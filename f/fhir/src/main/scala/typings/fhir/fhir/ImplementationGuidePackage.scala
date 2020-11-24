package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Group of resources as used in .page.package
  */
@js.native
trait ImplementationGuidePackage extends BackboneElement {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Human readable text describing the package
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Name used .page.package
    */
  var name: String = js.native
  
  /**
    * Resource in the implementation guide
    */
  var resource: js.Array[ImplementationGuidePackageResource] = js.native
}
object ImplementationGuidePackage {
  
  @scala.inline
  def apply(name: String, resource: js.Array[ImplementationGuidePackageResource]): ImplementationGuidePackage = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuidePackage]
  }
  
  @scala.inline
  implicit class ImplementationGuidePackageOps[Self <: ImplementationGuidePackage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceVarargs(value: ImplementationGuidePackageResource*): Self = this.set("resource", js.Array(value :_*))
    
    @scala.inline
    def setResource(value: js.Array[ImplementationGuidePackageResource]): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
}
