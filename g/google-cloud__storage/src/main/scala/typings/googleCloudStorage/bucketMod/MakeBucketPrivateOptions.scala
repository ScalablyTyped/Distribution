package typings.googleCloudStorage.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MakeBucketPrivateOptions extends js.Object {
  
  var force: js.UndefOr[Boolean] = js.native
  
  var includeFiles: js.UndefOr[Boolean] = js.native
  
  var userProject: js.UndefOr[String] = js.native
}
object MakeBucketPrivateOptions {
  
  @scala.inline
  def apply(): MakeBucketPrivateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeBucketPrivateOptions]
  }
  
  @scala.inline
  implicit class MakeBucketPrivateOptionsOps[Self <: MakeBucketPrivateOptions] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setUserProject(value: String): Self = this.set("userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProject: Self = this.set("userProject", js.undefined)
  }
}
