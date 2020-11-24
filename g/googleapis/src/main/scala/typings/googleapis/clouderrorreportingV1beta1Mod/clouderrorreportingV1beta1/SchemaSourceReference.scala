package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a particular snapshot of the source tree used to build and
  * deploy an application.
  */
@js.native
trait SchemaSourceReference extends js.Object {
  
  /**
    * Optional. A URI string identifying the repository. Example:
    * &quot;https://github.com/GoogleCloudPlatform/kubernetes.git&quot;
    */
  var repository: js.UndefOr[String] = js.native
  
  /**
    * The canonical and persistent identifier of the deployed revision. Example
    * (git): &quot;0035781c50ec7aa23385dc841529ce8a4b70db1b&quot;
    */
  var revisionId: js.UndefOr[String] = js.native
}
object SchemaSourceReference {
  
  @scala.inline
  def apply(): SchemaSourceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceReference]
  }
  
  @scala.inline
  implicit class SchemaSourceReferenceOps[Self <: SchemaSourceReference] (val x: Self) extends AnyVal {
    
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
    def setRepository(value: String): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = this.set("revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionId: Self = this.set("revisionId", js.undefined)
  }
}
