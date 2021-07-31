package typings.gapiPlus

import typings.gapiPlus.anon.CoverInfo
import typings.gapiPlus.anon.Department
import typings.gapiPlus.anon.FamilyName
import typings.gapiPlus.anon.Label
import typings.gapiPlus.anon.Max
import typings.gapiPlus.anon.Primary
import typings.gapiPlus.anon.Type
import typings.gapiPlus.anon.Url
import typings.gapiPlus.gapiPlusStrings.plusNumbersignpeopleFeed
import typings.gapiPlus.gapiPlusStrings.plusNumbersignperson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    // See Google+ REST API Reference https://developers.google.com/+/web/api/rest/latest/
    object plus {
      
      object people {
        
        trait GetParameters extends StObject {
          
          var userId: String
        }
        object GetParameters {
          
          @scala.inline
          def apply(userId: String): GetParameters = {
            val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
            __obj.asInstanceOf[GetParameters]
          }
          
          @scala.inline
          implicit class GetParametersMutableBuilder[Self <: GetParameters] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
          }
        }
        
        // Search response
        trait PeopleFeed extends StObject {
          
          var etag: String
          
          var items: js.Array[Person]
          
          var kind: plusNumbersignpeopleFeed
          
          var nextPageToken: String
          
          var selfLink: String
          
          var title: String
          
          var totalItems: Double
        }
        object PeopleFeed {
          
          @scala.inline
          def apply(
            etag: String,
            items: js.Array[Person],
            nextPageToken: String,
            selfLink: String,
            title: String,
            totalItems: Double
          ): PeopleFeed = {
            val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = "plus#peopleFeed", nextPageToken = nextPageToken.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], totalItems = totalItems.asInstanceOf[js.Any])
            __obj.asInstanceOf[PeopleFeed]
          }
          
          @scala.inline
          implicit class PeopleFeedMutableBuilder[Self <: PeopleFeed] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setItems(value: js.Array[Person]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setItemsVarargs(value: Person*): Self = StObject.set(x, "items", js.Array(value :_*))
            
            @scala.inline
            def setKind(value: plusNumbersignpeopleFeed): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
          }
        }
        
        trait Person extends StObject {
          
          var aboutMe: String
          
          var ageRange: Max
          
          var birthday: String
          
          var braggingRights: String
          
          var circledByCount: Double
          
          var cover: CoverInfo
          
          var displayName: String
          
          var domain: String
          
          var emails: js.Array[Type]
          
          var etag: String
          
          var gender: String
          
          var id: String
          
          var image: Url
          
          var isPlusUser: Boolean
          
          var kind: plusNumbersignperson
          
          var language: String
          
          var name: FamilyName
          
          var nickname: String
          
          var objectType: String
          
          var occupation: String
          
          var organizations: js.Array[Department]
          
          var placesLived: js.Array[Primary]
          
          var plusOneCount: Double
          
          var relationshipStatus: String
          
          var skills: String
          
          var tagline: String
          
          var url: String
          
          var urls: js.Array[Label]
          
          var verified: Boolean
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
            val __obj = js.Dynamic.literal(aboutMe = aboutMe.asInstanceOf[js.Any], ageRange = ageRange.asInstanceOf[js.Any], birthday = birthday.asInstanceOf[js.Any], braggingRights = braggingRights.asInstanceOf[js.Any], circledByCount = circledByCount.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], isPlusUser = isPlusUser.asInstanceOf[js.Any], kind = "plus#person", language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], occupation = occupation.asInstanceOf[js.Any], organizations = organizations.asInstanceOf[js.Any], placesLived = placesLived.asInstanceOf[js.Any], plusOneCount = plusOneCount.asInstanceOf[js.Any], relationshipStatus = relationshipStatus.asInstanceOf[js.Any], skills = skills.asInstanceOf[js.Any], tagline = tagline.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
            __obj.asInstanceOf[Person]
          }
          
          @scala.inline
          implicit class PersonMutableBuilder[Self <: Person] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setAboutMe(value: String): Self = StObject.set(x, "aboutMe", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setAgeRange(value: Max): Self = StObject.set(x, "ageRange", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setBirthday(value: String): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setBraggingRights(value: String): Self = StObject.set(x, "braggingRights", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setCircledByCount(value: Double): Self = StObject.set(x, "circledByCount", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setCover(value: CoverInfo): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setEmails(value: js.Array[Type]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setEmailsVarargs(value: Type*): Self = StObject.set(x, "emails", js.Array(value :_*))
            
            @scala.inline
            def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setImage(value: Url): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setIsPlusUser(value: Boolean): Self = StObject.set(x, "isPlusUser", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setKind(value: plusNumbersignperson): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setName(value: FamilyName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setOccupation(value: String): Self = StObject.set(x, "occupation", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setOrganizations(value: js.Array[Department]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setOrganizationsVarargs(value: Department*): Self = StObject.set(x, "organizations", js.Array(value :_*))
            
            @scala.inline
            def setPlacesLived(value: js.Array[Primary]): Self = StObject.set(x, "placesLived", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setPlacesLivedVarargs(value: Primary*): Self = StObject.set(x, "placesLived", js.Array(value :_*))
            
            @scala.inline
            def setPlusOneCount(value: Double): Self = StObject.set(x, "plusOneCount", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setRelationshipStatus(value: String): Self = StObject.set(x, "relationshipStatus", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setSkills(value: String): Self = StObject.set(x, "skills", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setTagline(value: String): Self = StObject.set(x, "tagline", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setUrls(value: js.Array[Label]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setUrlsVarargs(value: Label*): Self = StObject.set(x, "urls", js.Array(value :_*))
            
            @scala.inline
            def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
          }
        }
        
        trait SearchParameters extends StObject {
          
          var language: js.UndefOr[String] = js.undefined
          
          var maxResults: js.UndefOr[Double] = js.undefined
          
          var pageToken: js.UndefOr[String] = js.undefined
          
          var query: String
        }
        object SearchParameters {
          
          @scala.inline
          def apply(query: String): SearchParameters = {
            val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
            __obj.asInstanceOf[SearchParameters]
          }
          
          @scala.inline
          implicit class SearchParametersMutableBuilder[Self <: SearchParameters] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
            
            @scala.inline
            def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
            
            @scala.inline
            def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
            
            @scala.inline
            def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
          }
        }
      }
    }
  }
}
