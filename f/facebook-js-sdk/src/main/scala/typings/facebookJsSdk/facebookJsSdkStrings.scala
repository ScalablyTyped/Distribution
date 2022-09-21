package typings.facebookJsSdk

import typings.facebookJsSdk.facebook.FacebookEventType
import typings.facebookJsSdk.facebook.LoginStatus
import typings.facebookJsSdk.facebook.UserField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facebookJsSdkStrings {
  
  @js.native
  sealed trait APP_INSTALLS extends StObject
  inline def APP_INSTALLS: APP_INSTALLS = "APP_INSTALLS".asInstanceOf[APP_INSTALLS]
  
  @js.native
  sealed trait CONVERSIONS extends StObject
  inline def CONVERSIONS: CONVERSIONS = "CONVERSIONS".asInstanceOf[CONVERSIONS]
  
  @js.native
  sealed trait LINK_CLICKS extends StObject
  inline def LINK_CLICKS: LINK_CLICKS = "LINK_CLICKS".asInstanceOf[LINK_CLICKS]
  
  @js.native
  sealed trait OFFER_CLAIMS extends StObject
  inline def OFFER_CLAIMS: OFFER_CLAIMS = "OFFER_CLAIMS".asInstanceOf[OFFER_CLAIMS]
  
  @js.native
  sealed trait PRODUCT_CATALOG_SALES extends StObject
  inline def PRODUCT_CATALOG_SALES: PRODUCT_CATALOG_SALES = "PRODUCT_CATALOG_SALES".asInstanceOf[PRODUCT_CATALOG_SALES]
  
  @js.native
  sealed trait STORE_VISITS extends StObject
  inline def STORE_VISITS: STORE_VISITS = "STORE_VISITS".asInstanceOf[STORE_VISITS]
  
  @js.native
  sealed trait Slashme extends StObject
  inline def Slashme: Slashme = "/me".asInstanceOf[Slashme]
  
  @js.native
  sealed trait about
    extends StObject
       with UserField
  inline def about: about = "about".asInstanceOf[about]
  
  @js.native
  sealed trait age_range
    extends StObject
       with UserField
  inline def age_range: age_range = "age_range".asInstanceOf[age_range]
  
  @js.native
  sealed trait app_non_users extends StObject
  inline def app_non_users: app_non_users = "app_non_users".asInstanceOf[app_non_users]
  
  @js.native
  sealed trait app_users extends StObject
  inline def app_users: app_users = "app_users".asInstanceOf[app_users]
  
  @js.native
  sealed trait apprequests extends StObject
  inline def apprequests: apprequests = "apprequests".asInstanceOf[apprequests]
  
  @js.native
  sealed trait askfor extends StObject
  inline def askfor: askfor = "askfor".asInstanceOf[askfor]
  
  @js.native
  sealed trait async extends StObject
  inline def async: async = "async".asInstanceOf[async]
  
  @js.native
  sealed trait authDotauthResponseChange
    extends StObject
       with FacebookEventType
  inline def authDotauthResponseChange: authDotauthResponseChange = "auth.authResponseChange".asInstanceOf[authDotauthResponseChange]
  
  @js.native
  sealed trait authDotlogin
    extends StObject
       with FacebookEventType
  inline def authDotlogin: authDotlogin = "auth.login".asInstanceOf[authDotlogin]
  
  @js.native
  sealed trait authDotlogout
    extends StObject
       with FacebookEventType
  inline def authDotlogout: authDotlogout = "auth.logout".asInstanceOf[authDotlogout]
  
  @js.native
  sealed trait authDotstatusChange
    extends StObject
       with FacebookEventType
  inline def authDotstatusChange: authDotstatusChange = "auth.statusChange".asInstanceOf[authDotstatusChange]
  
  @js.native
  sealed trait authorization_expired
    extends StObject
       with LoginStatus
  inline def authorization_expired: authorization_expired = "authorization_expired".asInstanceOf[authorization_expired]
  
  @js.native
  sealed trait birthday
    extends StObject
       with UserField
  inline def birthday: birthday = "birthday".asInstanceOf[birthday]
  
  @js.native
  sealed trait canvas_editor extends StObject
  inline def canvas_editor: canvas_editor = "canvas_editor".asInstanceOf[canvas_editor]
  
  @js.native
  sealed trait canvas_preview extends StObject
  inline def canvas_preview: canvas_preview = "canvas_preview".asInstanceOf[canvas_preview]
  
  @js.native
  sealed trait completed extends StObject
  inline def completed: completed = "completed".asInstanceOf[completed]
  
  @js.native
  sealed trait connected
    extends StObject
       with LoginStatus
  inline def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait create extends StObject
  inline def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait create_offer extends StObject
  inline def create_offer: create_offer = "create_offer".asInstanceOf[create_offer]
  
  @js.native
  sealed trait delete extends StObject
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait education
    extends StObject
       with UserField
  inline def education: education = "education".asInstanceOf[education]
  
  @js.native
  sealed trait email
    extends StObject
       with UserField
  inline def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait favorite_athletes
    extends StObject
       with UserField
  inline def favorite_athletes: favorite_athletes = "favorite_athletes".asInstanceOf[favorite_athletes]
  
  @js.native
  sealed trait favorite_teams
    extends StObject
       with UserField
  inline def favorite_teams: favorite_teams = "favorite_teams".asInstanceOf[favorite_teams]
  
  @js.native
  sealed trait first_name
    extends StObject
       with UserField
  inline def first_name: first_name = "first_name".asInstanceOf[first_name]
  
  @js.native
  sealed trait gender
    extends StObject
       with UserField
  inline def gender: gender = "gender".asInstanceOf[gender]
  
  @js.native
  sealed trait get extends StObject
  inline def get: get = "get".asInstanceOf[get]
  
  @js.native
  sealed trait hometown
    extends StObject
       with UserField
  inline def hometown: hometown = "hometown".asInstanceOf[hometown]
  
  @js.native
  sealed trait id
    extends StObject
       with UserField
  inline def id: id = "id".asInstanceOf[id]
  
  @js.native
  sealed trait iframe extends StObject
  inline def iframe: iframe = "iframe".asInstanceOf[iframe]
  
  @js.native
  sealed trait initiated extends StObject
  inline def initiated: initiated = "initiated".asInstanceOf[initiated]
  
  @js.native
  sealed trait inspirational_people
    extends StObject
       with UserField
  inline def inspirational_people: inspirational_people = "inspirational_people".asInstanceOf[inspirational_people]
  
  @js.native
  sealed trait install_type
    extends StObject
       with UserField
  inline def install_type: install_type = "install_type".asInstanceOf[install_type]
  
  @js.native
  sealed trait is_guest_user
    extends StObject
       with UserField
  inline def is_guest_user: is_guest_user = "is_guest_user".asInstanceOf[is_guest_user]
  
  @js.native
  sealed trait languages
    extends StObject
       with UserField
  inline def languages: languages = "languages".asInstanceOf[languages]
  
  @js.native
  sealed trait last_name
    extends StObject
       with UserField
  inline def last_name: last_name = "last_name".asInstanceOf[last_name]
  
  @js.native
  sealed trait lead_gen extends StObject
  inline def lead_gen: lead_gen = "lead_gen".asInstanceOf[lead_gen]
  
  @js.native
  sealed trait link
    extends StObject
       with UserField
  inline def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait live_broadcast extends StObject
  inline def live_broadcast: live_broadcast = "live_broadcast".asInstanceOf[live_broadcast]
  
  @js.native
  sealed trait location
    extends StObject
       with UserField
  inline def location: location = "location".asInstanceOf[location]
  
  @js.native
  sealed trait meeting_for
    extends StObject
       with UserField
  inline def meeting_for: meeting_for = "meeting_for".asInstanceOf[meeting_for]
  
  @js.native
  sealed trait middle_name
    extends StObject
       with UserField
  inline def middle_name: middle_name = "middle_name".asInstanceOf[middle_name]
  
  @js.native
  sealed trait name
    extends StObject
       with UserField
  inline def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait name_format
    extends StObject
       with UserField
  inline def name_format: name_format = "name_format".asInstanceOf[name_format]
  
  @js.native
  sealed trait name_political
    extends StObject
       with UserField
  inline def name_political: name_political = "name_political".asInstanceOf[name_political]
  
  @js.native
  sealed trait not_authorized
    extends StObject
       with LoginStatus
  inline def not_authorized: not_authorized = "not_authorized".asInstanceOf[not_authorized]
  
  @js.native
  sealed trait page extends StObject
  inline def page: page = "page".asInstanceOf[page]
  
  @js.native
  sealed trait pagetab extends StObject
  inline def pagetab: pagetab = "pagetab".asInstanceOf[pagetab]
  
  @js.native
  sealed trait pay extends StObject
  inline def pay: pay = "pay".asInstanceOf[pay]
  
  @js.native
  sealed trait payment_pricepoints
    extends StObject
       with UserField
  inline def payment_pricepoints: payment_pricepoints = "payment_pricepoints".asInstanceOf[payment_pricepoints]
  
  @js.native
  sealed trait popup extends StObject
  inline def popup: popup = "popup".asInstanceOf[popup]
  
  @js.native
  sealed trait post extends StObject
  inline def post: post = "post".asInstanceOf[post]
  
  @js.native
  sealed trait profile_pic
    extends StObject
       with UserField
  inline def profile_pic: profile_pic = "profile_pic".asInstanceOf[profile_pic]
  
  @js.native
  sealed trait publish extends StObject
  inline def publish: publish = "publish".asInstanceOf[publish]
  
  @js.native
  sealed trait purchaseiap extends StObject
  inline def purchaseiap: purchaseiap = "purchaseiap".asInstanceOf[purchaseiap]
  
  @js.native
  sealed trait purchaseitem extends StObject
  inline def purchaseitem: purchaseitem = "purchaseitem".asInstanceOf[purchaseitem]
  
  @js.native
  sealed trait quotes
    extends StObject
       with UserField
  inline def quotes: quotes = "quotes".asInstanceOf[quotes]
  
  @js.native
  sealed trait reauthenticate extends StObject
  inline def reauthenticate: reauthenticate = "reauthenticate".asInstanceOf[reauthenticate]
  
  @js.native
  sealed trait reauthorize extends StObject
  inline def reauthorize: reauthorize = "reauthorize".asInstanceOf[reauthorize]
  
  @js.native
  sealed trait relationship_status
    extends StObject
       with UserField
  inline def relationship_status: relationship_status = "relationship_status".asInstanceOf[relationship_status]
  
  @js.native
  sealed trait religion
    extends StObject
       with UserField
  inline def religion: religion = "religion".asInstanceOf[religion]
  
  @js.native
  sealed trait rerequest extends StObject
  inline def rerequest: rerequest = "rerequest".asInstanceOf[rerequest]
  
  @js.native
  sealed trait send extends StObject
  inline def send: send = "send".asInstanceOf[send]
  
  @js.native
  sealed trait share extends StObject
  inline def share: share = "share".asInstanceOf[share]
  
  @js.native
  sealed trait share_open_graph extends StObject
  inline def share_open_graph: share_open_graph = "share_open_graph".asInstanceOf[share_open_graph]
  
  @js.native
  sealed trait shared_login_upgrade_required_by
    extends StObject
       with UserField
  inline def shared_login_upgrade_required_by: shared_login_upgrade_required_by = "shared_login_upgrade_required_by".asInstanceOf[shared_login_upgrade_required_by]
  
  @js.native
  sealed trait short_name
    extends StObject
       with UserField
  inline def short_name: short_name = "short_name".asInstanceOf[short_name]
  
  @js.native
  sealed trait significant_other
    extends StObject
       with UserField
  inline def significant_other: significant_other = "significant_other".asInstanceOf[significant_other]
  
  @js.native
  sealed trait sports
    extends StObject
       with UserField
  inline def sports: sports = "sports".asInstanceOf[sports]
  
  @js.native
  sealed trait supports_donate_button_in_live_video
    extends StObject
       with UserField
  inline def supports_donate_button_in_live_video: supports_donate_button_in_live_video = "supports_donate_button_in_live_video".asInstanceOf[supports_donate_button_in_live_video]
  
  @js.native
  sealed trait token_for_business
    extends StObject
       with UserField
  inline def token_for_business: token_for_business = "token_for_business".asInstanceOf[token_for_business]
  
  @js.native
  sealed trait turn extends StObject
  inline def turn: turn = "turn".asInstanceOf[turn]
  
  @js.native
  sealed trait unknown
    extends StObject
       with LoginStatus
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait video_upload_limits
    extends StObject
       with UserField
  inline def video_upload_limits: video_upload_limits = "video_upload_limits".asInstanceOf[video_upload_limits]
  
  @js.native
  sealed trait website
    extends StObject
       with UserField
  inline def website: website = "website".asInstanceOf[website]
  
  @js.native
  sealed trait xfbmlDotrender
    extends StObject
       with FacebookEventType
  inline def xfbmlDotrender: xfbmlDotrender = "xfbml.render".asInstanceOf[xfbmlDotrender]
}
