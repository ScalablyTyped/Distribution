package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Docker image that is used to create a container and start a VM instance for
  * the version that you deploy. Only applicable for instances running in the
  * App Engine flexible environment.
  */
@js.native
trait SchemaContainerInfo extends js.Object {
  
  /**
    * URI to the hosted container image in Google Container Registry. The URI
    * must be fully qualified and include a tag or digest. Examples:
    * &quot;gcr.io/my-project/image:tag&quot; or
    * &quot;gcr.io/my-project/image@digest&quot;
    */
  var image: js.UndefOr[String] = js.native
}
object SchemaContainerInfo {
  
  @scala.inline
  def apply(): SchemaContainerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainerInfo]
  }
  
  @scala.inline
  implicit class SchemaContainerInfoOps[Self <: SchemaContainerInfo] (val x: Self) extends AnyVal {
    
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
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
  }
}
