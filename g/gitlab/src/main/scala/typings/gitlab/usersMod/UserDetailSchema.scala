package typings.gitlab.usersMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDetailSchema extends UserSchema {
  
  var bio: js.UndefOr[String] = js.native
  
  var created_at: Date = js.native
  
  var linkedin: String = js.native
  
  var location: js.UndefOr[String] = js.native
  
  var organization: js.UndefOr[String] = js.native
  
  var public_email: String = js.native
  
  var skype: String = js.native
  
  var twitter: String = js.native
  
  var website_url: js.UndefOr[String] = js.native
}
object UserDetailSchema {
  
  @scala.inline
  def apply(
    avatar_url: String,
    created_at: Date,
    id: Double,
    linkedin: String,
    name: String,
    public_email: String,
    skype: String,
    state: String,
    twitter: String,
    username: String,
    web_url: String
  ): UserDetailSchema = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], linkedin = linkedin.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public_email = public_email.asInstanceOf[js.Any], skype = skype.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], twitter = twitter.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDetailSchema]
  }
  
  @scala.inline
  implicit class UserDetailSchemaOps[Self <: UserDetailSchema] (val x: Self) extends AnyVal {
    
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
    def setCreated_at(value: Date): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedin(value: String): Self = this.set("linkedin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic_email(value: String): Self = this.set("public_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkype(value: String): Self = this.set("skype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwitter(value: String): Self = this.set("twitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBio(value: String): Self = this.set("bio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBio: Self = this.set("bio", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setOrganization(value: String): Self = this.set("organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
    
    @scala.inline
    def setWebsite_url(value: String): Self = this.set("website_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsite_url: Self = this.set("website_url", js.undefined)
  }
}
