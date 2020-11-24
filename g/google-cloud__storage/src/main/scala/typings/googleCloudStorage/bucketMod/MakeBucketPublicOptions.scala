package typings.googleCloudStorage.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MakeBucketPublicOptions extends js.Object {
  
  var force: js.UndefOr[Boolean] = js.native
  
  var includeFiles: js.UndefOr[Boolean] = js.native
}
object MakeBucketPublicOptions {
  
  @scala.inline
  def apply(): MakeBucketPublicOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeBucketPublicOptions]
  }
  
  @scala.inline
  implicit class MakeBucketPublicOptionsOps[Self <: MakeBucketPublicOptions] (val x: Self) extends AnyVal {
    
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
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setIncludeFiles(value: Boolean): Self = this.set("includeFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeFiles: Self = this.set("includeFiles", js.undefined)
  }
}
