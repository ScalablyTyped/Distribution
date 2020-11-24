package typings.gapiPlus.gapi.client.plus.people

import typings.gapiPlus.anon.CoverInfo
import typings.gapiPlus.anon.Department
import typings.gapiPlus.anon.FamilyName
import typings.gapiPlus.anon.Label
import typings.gapiPlus.anon.Max
import typings.gapiPlus.anon.Primary
import typings.gapiPlus.anon.Type
import typings.gapiPlus.anon.Url
import typings.gapiPlus.gapiPlusStrings.plusNumbersignperson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Person extends js.Object {
  
  var aboutMe: String = js.native
  
  var ageRange: Max = js.native
  
  var birthday: String = js.native
  
  var braggingRights: String = js.native
  
  var circledByCount: Double = js.native
  
  var cover: CoverInfo = js.native
  
  var displayName: String = js.native
  
  var domain: String = js.native
  
  var emails: js.Array[Type] = js.native
  
  var etag: String = js.native
  
  var gender: String = js.native
  
  var id: String = js.native
  
  var image: Url = js.native
  
  var isPlusUser: Boolean = js.native
  
  var kind: plusNumbersignperson = js.native
  
  var language: String = js.native
  
  var name: FamilyName = js.native
  
  var nickname: String = js.native
  
  var objectType: String = js.native
  
  var occupation: String = js.native
  
  var organizations: js.Array[Department] = js.native
  
  var placesLived: js.Array[Primary] = js.native
  
  var plusOneCount: Double = js.native
  
  var relationshipStatus: String = js.native
  
  var skills: String = js.native
  
  var tagline: String = js.native
  
  var url: String = js.native
  
  var urls: js.Array[Label] = js.native
  
  var verified: Boolean = js.native
}
object Person {
  
  @scala.inline
  def apply(
    aboutMe: String,
    ageRange: Max,
    birthday: String,
    braggingRights: String,
    circledByCount: Double,
    cover: CoverInfo,
    displayName: String,
    domain: String,
    emails: js.Array[Type],
    etag: String,
    gender: String,
    id: String,
    image: Url,
    isPlusUser: Boolean,
    kind: plusNumbersignperson,
    language: String,
    name: FamilyName,
    nickname: String,
    objectType: String,
    occupation: String,
    organizations: js.Array[Department],
    placesLived: js.Array[Primary],
    plusOneCount: Double,
    relationshipStatus: String,
    skills: String,
    tagline: String,
    url: String,
    urls: js.Array[Label],
    verified: Boolean
  ): Person = {
    val __obj = js.Dynamic.literal(aboutMe = aboutMe.asInstanceOf[js.Any], ageRange = ageRange.asInstanceOf[js.Any], birthday = birthday.asInstanceOf[js.Any], braggingRights = braggingRights.asInstanceOf[js.Any], circledByCount = circledByCount.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], isPlusUser = isPlusUser.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], occupation = occupation.asInstanceOf[js.Any], organizations = organizations.asInstanceOf[js.Any], placesLived = placesLived.asInstanceOf[js.Any], plusOneCount = plusOneCount.asInstanceOf[js.Any], relationshipStatus = relationshipStatus.asInstanceOf[js.Any], skills = skills.asInstanceOf[js.Any], tagline = tagline.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Person]
  }
  
  @scala.inline
  implicit class PersonOps[Self <: Person] (val x: Self) extends AnyVal {
    
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
    def setAboutMe(value: String): Self = this.set("aboutMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeRange(value: Max): Self = this.set("ageRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBirthday(value: String): Self = this.set("birthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBraggingRights(value: String): Self = this.set("braggingRights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircledByCount(value: Double): Self = this.set("circledByCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCover(value: CoverInfo): Self = this.set("cover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailsVarargs(value: Type*): Self = this.set("emails", js.Array(value :_*))
    
    @scala.inline
    def setEmails(value: js.Array[Type]): Self = this.set("emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGender(value: String): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: Url): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPlusUser(value: Boolean): Self = this.set("isPlusUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: plusNumbersignperson): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: FamilyName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccupation(value: String): Self = this.set("occupation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationsVarargs(value: Department*): Self = this.set("organizations", js.Array(value :_*))
    
    @scala.inline
    def setOrganizations(value: js.Array[Department]): Self = this.set("organizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacesLivedVarargs(value: Primary*): Self = this.set("placesLived", js.Array(value :_*))
    
    @scala.inline
    def setPlacesLived(value: js.Array[Primary]): Self = this.set("placesLived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlusOneCount(value: Double): Self = this.set("plusOneCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipStatus(value: String): Self = this.set("relationshipStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkills(value: String): Self = this.set("skills", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagline(value: String): Self = this.set("tagline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsVarargs(value: Label*): Self = this.set("urls", js.Array(value :_*))
    
    @scala.inline
    def setUrls(value: js.Array[Label]): Self = this.set("urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified(value: Boolean): Self = this.set("verified", value.asInstanceOf[js.Any])
  }
}
