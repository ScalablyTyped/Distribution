package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google Cloud Build information.
  */
@js.native
trait SchemaBuildInfo extends js.Object {
  
  /**
    * The Google Cloud Build id. Example:
    * &quot;f966068f-08b2-42c8-bdfe-74137dff2bf9&quot;
    */
  var cloudBuildId: js.UndefOr[String] = js.native
}
object SchemaBuildInfo {
  
  @scala.inline
  def apply(): SchemaBuildInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildInfo]
  }
  
  @scala.inline
  implicit class SchemaBuildInfoOps[Self <: SchemaBuildInfo] (val x: Self) extends AnyVal {
    
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
    def setCloudBuildId(value: String): Self = this.set("cloudBuildId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudBuildId: Self = this.set("cloudBuildId", js.undefined)
  }
}
