package typings.githubUrlToObject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends js.Object {
  
  var api_url: String = js.native
  
  var branch: String = js.native
  
  var clone_url: String = js.native
  
  var https_url: String = js.native
  
  var repo: String = js.native
  
  var tarball_url: String = js.native
  
  var travis_url: String = js.native
  
  var user: String = js.native
  
  var zip_url: String = js.native
}
object Result {
  
  @scala.inline
  def apply(
    api_url: String,
    branch: String,
    clone_url: String,
    https_url: String,
    repo: String,
    tarball_url: String,
    travis_url: String,
    user: String,
    zip_url: String
  ): Result = {
    val __obj = js.Dynamic.literal(api_url = api_url.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], clone_url = clone_url.asInstanceOf[js.Any], https_url = https_url.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tarball_url = tarball_url.asInstanceOf[js.Any], travis_url = travis_url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], zip_url = zip_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    
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
    def setApi_url(value: String): Self = this.set("api_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone_url(value: String): Self = this.set("clone_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttps_url(value: String): Self = this.set("https_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarball_url(value: String): Self = this.set("tarball_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTravis_url(value: String): Self = this.set("travis_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZip_url(value: String): Self = this.set("zip_url", value.asInstanceOf[js.Any])
  }
}
