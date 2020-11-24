package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration of a Cloud Function backend.
  */
@js.native
trait SchemaBackendServiceCloudFunctionBackend extends js.Object {
  
  /**
    * Required. A cloud function name. Special value ?*? represents all cloud
    * functions in the project.
    */
  var functionName: js.UndefOr[String] = js.native
  
  /**
    * Required. Project ID of the project hosting the cloud function.
    */
  var targetProject: js.UndefOr[String] = js.native
}
object SchemaBackendServiceCloudFunctionBackend {
  
  @scala.inline
  def apply(): SchemaBackendServiceCloudFunctionBackend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceCloudFunctionBackend]
  }
  
  @scala.inline
  implicit class SchemaBackendServiceCloudFunctionBackendOps[Self <: SchemaBackendServiceCloudFunctionBackend] (val x: Self) extends AnyVal {
    
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
    def setFunctionName(value: String): Self = this.set("functionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionName: Self = this.set("functionName", js.undefined)
    
    @scala.inline
    def setTargetProject(value: String): Self = this.set("targetProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetProject: Self = this.set("targetProject", js.undefined)
  }
}
