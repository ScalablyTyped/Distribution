package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppPackage extends js.Object {
  
  var description: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var isObjectEnabler: js.UndefOr[Boolean] = js.native
  
  var isPublic: js.UndefOr[Boolean] = js.native
  
  var references: js.Array[String] = js.native
  
  var requiredEngineVersion: String = js.native
  
  var resource: String = js.native
  
  var version: Double = js.native
}
object AppPackage {
  
  @scala.inline
  def apply(
    id: String,
    references: js.Array[String],
    requiredEngineVersion: String,
    resource: String,
    version: Double
  ): AppPackage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], requiredEngineVersion = requiredEngineVersion.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppPackage]
  }
  
  @scala.inline
  implicit class AppPackageOps[Self <: AppPackage] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencesVarargs(value: String*): Self = this.set("references", js.Array(value :_*))
    
    @scala.inline
    def setReferences(value: js.Array[String]): Self = this.set("references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredEngineVersion(value: String): Self = this.set("requiredEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setIsObjectEnabler(value: Boolean): Self = this.set("isObjectEnabler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsObjectEnabler: Self = this.set("isObjectEnabler", js.undefined)
    
    @scala.inline
    def setIsPublic(value: Boolean): Self = this.set("isPublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPublic: Self = this.set("isPublic", js.undefined)
  }
}
