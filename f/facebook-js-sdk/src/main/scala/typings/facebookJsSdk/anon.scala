package typings.facebookJsSdk

import typings.facebookJsSdk.facebook.AgeRange
import typings.facebookJsSdk.facebook.EducationExperience
import typings.facebookJsSdk.facebook.Experience
import typings.facebookJsSdk.facebook.Page
import typings.facebookJsSdk.facebook.PaymentPricepoints
import typings.facebookJsSdk.facebook.User
import typings.facebookJsSdk.facebook.UserField
import typings.facebookJsSdk.facebook.VideoUploadLimits
import typings.facebookJsSdk.facebookJsSdkNumbers.`13`
import typings.facebookJsSdk.facebookJsSdkNumbers.`17`
import typings.facebookJsSdk.facebookJsSdkNumbers.`18`
import typings.facebookJsSdk.facebookJsSdkNumbers.`20`
import typings.facebookJsSdk.facebookJsSdkNumbers.`21`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait About[TParam /* <: UserField */] extends StObject {
    
    var about: js.UndefOr[String] = js.undefined
    
    var age_range: js.UndefOr[AgeRange] = js.undefined
    
    var birthday: js.UndefOr[String] = js.undefined
    
    var education: js.UndefOr[js.Array[EducationExperience]] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var favorite_athletes: js.UndefOr[js.Array[Experience]] = js.undefined
    
    var favorite_teams: js.UndefOr[js.Array[Experience]] = js.undefined
    
    var first_name: js.UndefOr[String] = js.undefined
    
    var gender: js.UndefOr[String] = js.undefined
    
    var hometown: js.UndefOr[Page] = js.undefined
    
    var id: Double
    
    var inspirational_people: js.UndefOr[js.Array[Experience]] = js.undefined
    
    var install_type: js.UndefOr[scala.Nothing] = js.undefined
    
    var is_guest_user: js.UndefOr[Boolean] = js.undefined
    
    var languages: js.UndefOr[js.Array[Experience]] = js.undefined
    
    var last_name: js.UndefOr[String] = js.undefined
    
    var link: js.UndefOr[String] = js.undefined
    
    var location: js.UndefOr[Page] = js.undefined
    
    var meeting_for: js.UndefOr[js.Array[String]] = js.undefined
    
    var middle_name: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var name_format: js.UndefOr[String] = js.undefined
    
    var name_political: js.UndefOr[String] = js.undefined
    
    var payment_pricepoints: js.UndefOr[PaymentPricepoints] = js.undefined
    
    var profile_pic: js.UndefOr[String] = js.undefined
    
    var quotes: js.UndefOr[String] = js.undefined
    
    var relationship_status: js.UndefOr[String] = js.undefined
    
    var religion: js.UndefOr[String] = js.undefined
    
    var shared_login_upgrade_required_by: js.UndefOr[scala.Nothing] = js.undefined
    
    var short_name: js.UndefOr[scala.Nothing] = js.undefined
    
    var significant_other: js.UndefOr[User] = js.undefined
    
    var sports: js.UndefOr[js.Array[Experience]] = js.undefined
    
    var supports_donate_button_in_live_video: js.UndefOr[Boolean] = js.undefined
    
    var token_for_business: js.UndefOr[VideoUploadLimits] = js.undefined
    
    var video_upload_limits: js.UndefOr[String] = js.undefined
    
    var website: js.UndefOr[String] = js.undefined
  }
  object About {
    
    inline def apply[TParam /* <: UserField */](id: Double): About[TParam] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[About[TParam]]
    }
    
    extension [Self <: About[?], TParam /* <: UserField */](x: Self & About[TParam]) {
      
      inline def setAbout(value: scala.Nothing | String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAge_range(value: scala.Nothing | AgeRange): Self = StObject.set(x, "age_range", value.asInstanceOf[js.Any])
      
      inline def setAge_rangeUndefined: Self = StObject.set(x, "age_range", js.undefined)
      
      inline def setBirthday(value: scala.Nothing | String): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
      
      inline def setBirthdayUndefined: Self = StObject.set(x, "birthday", js.undefined)
      
      inline def setEducation(value: scala.Nothing | js.Array[EducationExperience]): Self = StObject.set(x, "education", value.asInstanceOf[js.Any])
      
      inline def setEducationUndefined: Self = StObject.set(x, "education", js.undefined)
      
      inline def setEducationVarargs(value: EducationExperience*): Self = StObject.set(x, "education", js.Array(value*))
      
      inline def setEmail(value: scala.Nothing | String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFavorite_athletes(value: scala.Nothing | js.Array[Experience]): Self = StObject.set(x, "favorite_athletes", value.asInstanceOf[js.Any])
      
      inline def setFavorite_athletesUndefined: Self = StObject.set(x, "favorite_athletes", js.undefined)
      
      inline def setFavorite_athletesVarargs(value: Experience*): Self = StObject.set(x, "favorite_athletes", js.Array(value*))
      
      inline def setFavorite_teams(value: scala.Nothing | js.Array[Experience]): Self = StObject.set(x, "favorite_teams", value.asInstanceOf[js.Any])
      
      inline def setFavorite_teamsUndefined: Self = StObject.set(x, "favorite_teams", js.undefined)
      
      inline def setFavorite_teamsVarargs(value: Experience*): Self = StObject.set(x, "favorite_teams", js.Array(value*))
      
      inline def setFirst_name(value: scala.Nothing | String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      inline def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
      
      inline def setGender(value: scala.Nothing | String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
      
      inline def setHometown(value: scala.Nothing | Page): Self = StObject.set(x, "hometown", value.asInstanceOf[js.Any])
      
      inline def setHometownUndefined: Self = StObject.set(x, "hometown", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInspirational_people(value: scala.Nothing | js.Array[Experience]): Self = StObject.set(x, "inspirational_people", value.asInstanceOf[js.Any])
      
      inline def setInspirational_peopleUndefined: Self = StObject.set(x, "inspirational_people", js.undefined)
      
      inline def setInspirational_peopleVarargs(value: Experience*): Self = StObject.set(x, "inspirational_people", js.Array(value*))
      
      inline def setIs_guest_user(value: scala.Nothing | Boolean): Self = StObject.set(x, "is_guest_user", value.asInstanceOf[js.Any])
      
      inline def setIs_guest_userUndefined: Self = StObject.set(x, "is_guest_user", js.undefined)
      
      inline def setLanguages(value: scala.Nothing | js.Array[Experience]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
      
      inline def setLanguagesVarargs(value: Experience*): Self = StObject.set(x, "languages", js.Array(value*))
      
      inline def setLast_name(value: scala.Nothing | String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
      
      inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
      
      inline def setLink(value: scala.Nothing | String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setLocation(value: scala.Nothing | Page): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setMeeting_for(value: scala.Nothing | js.Array[String]): Self = StObject.set(x, "meeting_for", value.asInstanceOf[js.Any])
      
      inline def setMeeting_forUndefined: Self = StObject.set(x, "meeting_for", js.undefined)
      
      inline def setMeeting_forVarargs(value: String*): Self = StObject.set(x, "meeting_for", js.Array(value*))
      
      inline def setMiddle_name(value: scala.Nothing | String): Self = StObject.set(x, "middle_name", value.asInstanceOf[js.Any])
      
      inline def setMiddle_nameUndefined: Self = StObject.set(x, "middle_name", js.undefined)
      
      inline def setName(value: scala.Nothing | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setName_format(value: scala.Nothing | String): Self = StObject.set(x, "name_format", value.asInstanceOf[js.Any])
      
      inline def setName_formatUndefined: Self = StObject.set(x, "name_format", js.undefined)
      
      inline def setName_political(value: scala.Nothing | String): Self = StObject.set(x, "name_political", value.asInstanceOf[js.Any])
      
      inline def setName_politicalUndefined: Self = StObject.set(x, "name_political", js.undefined)
      
      inline def setPayment_pricepoints(value: scala.Nothing | PaymentPricepoints): Self = StObject.set(x, "payment_pricepoints", value.asInstanceOf[js.Any])
      
      inline def setPayment_pricepointsUndefined: Self = StObject.set(x, "payment_pricepoints", js.undefined)
      
      inline def setProfile_pic(value: scala.Nothing | String): Self = StObject.set(x, "profile_pic", value.asInstanceOf[js.Any])
      
      inline def setProfile_picUndefined: Self = StObject.set(x, "profile_pic", js.undefined)
      
      inline def setQuotes(value: scala.Nothing | String): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      inline def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
      
      inline def setRelationship_status(value: scala.Nothing | String): Self = StObject.set(x, "relationship_status", value.asInstanceOf[js.Any])
      
      inline def setRelationship_statusUndefined: Self = StObject.set(x, "relationship_status", js.undefined)
      
      inline def setReligion(value: scala.Nothing | String): Self = StObject.set(x, "religion", value.asInstanceOf[js.Any])
      
      inline def setReligionUndefined: Self = StObject.set(x, "religion", js.undefined)
      
      inline def setSignificant_other(value: scala.Nothing | User): Self = StObject.set(x, "significant_other", value.asInstanceOf[js.Any])
      
      inline def setSignificant_otherUndefined: Self = StObject.set(x, "significant_other", js.undefined)
      
      inline def setSports(value: scala.Nothing | js.Array[Experience]): Self = StObject.set(x, "sports", value.asInstanceOf[js.Any])
      
      inline def setSportsUndefined: Self = StObject.set(x, "sports", js.undefined)
      
      inline def setSportsVarargs(value: Experience*): Self = StObject.set(x, "sports", js.Array(value*))
      
      inline def setSupports_donate_button_in_live_video(value: scala.Nothing | Boolean): Self = StObject.set(x, "supports_donate_button_in_live_video", value.asInstanceOf[js.Any])
      
      inline def setSupports_donate_button_in_live_videoUndefined: Self = StObject.set(x, "supports_donate_button_in_live_video", js.undefined)
      
      inline def setToken_for_business(value: scala.Nothing | VideoUploadLimits): Self = StObject.set(x, "token_for_business", value.asInstanceOf[js.Any])
      
      inline def setToken_for_businessUndefined: Self = StObject.set(x, "token_for_business", js.undefined)
      
      inline def setVideo_upload_limits(value: scala.Nothing | String): Self = StObject.set(x, "video_upload_limits", value.asInstanceOf[js.Any])
      
      inline def setVideo_upload_limitsUndefined: Self = StObject.set(x, "video_upload_limits", js.undefined)
      
      inline def setWebsite(value: scala.Nothing | String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
      
      inline def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
    }
  }
  
  trait Fields[TParam /* <: UserField */] extends StObject {
    
    var fields: js.Array[TParam]
  }
  object Fields {
    
    inline def apply[TParam /* <: UserField */](fields: js.Array[TParam]): Fields[TParam] = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields[TParam]]
    }
    
    extension [Self <: Fields[?], TParam /* <: UserField */](x: Self & Fields[TParam]) {
      
      inline def setFields(value: js.Array[TParam]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: TParam*): Self = StObject.set(x, "fields", js.Array(value*))
    }
  }
  
  trait Max
    extends StObject
       with AgeRange {
    
    var max: `17`
    
    var min: `13`
  }
  object Max {
    
    inline def apply(): Max = {
      val __obj = js.Dynamic.literal(max = 17, min = 13)
      __obj.asInstanceOf[Max]
    }
    
    extension [Self <: Max](x: Self) {
      
      inline def setMax(value: `17`): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: `13`): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxMin
    extends StObject
       with AgeRange {
    
    var max: Unit
    
    var min: `21`
  }
  object MaxMin {
    
    inline def apply(max: Unit): MaxMin = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = 21)
      __obj.asInstanceOf[MaxMin]
    }
    
    extension [Self <: MaxMin](x: Self) {
      
      inline def setMax(value: Unit): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: `21`): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  trait Min
    extends StObject
       with AgeRange {
    
    var max: `20`
    
    var min: `18`
  }
  object Min {
    
    inline def apply(): Min = {
      val __obj = js.Dynamic.literal(max = 20, min = 18)
      __obj.asInstanceOf[Min]
    }
    
    extension [Self <: Min](x: Self) {
      
      inline def setMax(value: `20`): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: `18`): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var user_ids: js.Array[String]
  }
  object Name {
    
    inline def apply(name: String, user_ids: js.Array[String]): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], user_ids = user_ids.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUser_ids(value: js.Array[String]): Self = StObject.set(x, "user_ids", value.asInstanceOf[js.Any])
      
      inline def setUser_idsVarargs(value: String*): Self = StObject.set(x, "user_ids", js.Array(value*))
    }
  }
}
