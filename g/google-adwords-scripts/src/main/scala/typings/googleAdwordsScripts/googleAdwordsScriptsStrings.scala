package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object googleAdwordsScriptsStrings {
  @js.native
  sealed trait ACTIVE extends TargetingStatus
  
  @js.native
  sealed trait ADGROUP extends BiddingStrategySource
  
  @js.native
  sealed trait ALL_TIME extends DateRange
  
  @js.native
  sealed trait APPROVED
    extends ApprovalStatus
       with PolicyApprovalStatus
  
  @js.native
  sealed trait APPROVED_LIMITED extends PolicyApprovalStatus
  
  @js.native
  sealed trait AUDIO extends MediaType
  
  @js.native
  sealed trait Airport extends TargetType
  
  @js.native
  sealed trait Android extends AppStore
  
  @js.native
  sealed trait `Autonomous Community` extends TargetType
  
  @js.native
  sealed trait BROAD extends MatchType
  
  @js.native
  sealed trait BUDGET_OPTIMIZER extends BiddingStrategyString
  
  @js.native
  sealed trait Borough extends TargetType
  
  @js.native
  sealed trait CAMPAIGN extends BiddingStrategySource
  
  @js.native
  sealed trait CONVERSION_OPTIMIZE extends AdRotationType
  
  @js.native
  sealed trait CONVERSION_OPTIMIZER extends BiddingStrategyString
  
  @js.native
  sealed trait CRITERION extends BiddingStrategySource
  
  @js.native
  sealed trait CRM_BASED extends UserListType
  
  @js.native
  sealed trait Canton extends TargetType
  
  @js.native
  sealed trait City extends TargetType
  
  @js.native
  sealed trait `City Region` extends TargetType
  
  @js.native
  sealed trait `Congressional District` extends TargetType
  
  @js.native
  sealed trait Country extends TargetType
  
  @js.native
  sealed trait County extends TargetType
  
  @js.native
  sealed trait DISAPPROVED
    extends ApprovalStatus
       with PolicyApprovalStatus
  
  @js.native
  sealed trait DYNAMIC_IMAGE extends MediaType
  
  @js.native
  sealed trait Department extends TargetType
  
  @js.native
  sealed trait District extends TargetType
  
  @js.native
  sealed trait ELIGIBLE extends PolicyApprovalStatus
  
  @js.native
  sealed trait EXACT extends MatchType
  
  @js.native
  sealed trait EXPANDED_TEXT_AD extends AdType
  
  @js.native
  sealed trait EXTERNAL_REMARKETING extends UserListType
  
  @js.native
  sealed trait FAMILY_SAFE extends ApprovalStatus
  
  @js.native
  sealed trait FIFTY_THOUSAND_TO_ONE_HUNDRED_THOUSAND extends UserListSizeRange
  
  @js.native
  sealed trait FIVE_HUNDRED_THOUSAND_TO_ONE_MILLION extends UserListSizeRange
  
  @js.native
  sealed trait FIVE_MILLION_TO_TEN_MILLION extends UserListSizeRange
  
  @js.native
  sealed trait FRIDAY extends DayOfWeekString
  
  @js.native
  sealed trait Governorate extends TargetType
  
  @js.native
  sealed trait ICON extends MediaType
  
  @js.native
  sealed trait IMAGE extends MediaType
  
  @js.native
  sealed trait IMAGE_AD extends AdType
  
  @js.native
  sealed trait KILOMETERS extends RadiusUnits
  
  @js.native
  sealed trait LAST_14_DAYS extends DateRange
  
  @js.native
  sealed trait LAST_30_DAYS extends DateRange
  
  @js.native
  sealed trait LAST_7_DAYS extends DateRange
  
  @js.native
  sealed trait LAST_BUSINESS_WEEK extends DateRange
  
  @js.native
  sealed trait LAST_MONTH extends DateRange
  
  @js.native
  sealed trait LAST_WEEK extends DateRange
  
  @js.native
  sealed trait LAST_WEEK_SUN_SAT extends DateRange
  
  @js.native
  sealed trait LESS_THAN_FIVE_HUNDRED extends UserListSizeRange
  
  @js.native
  sealed trait LESS_THAN_ONE_THOUSAND extends UserListSizeRange
  
  @js.native
  sealed trait LOGICAL extends UserListType
  
  @js.native
  sealed trait MANUAL_CPC extends BiddingStrategyString
  
  @js.native
  sealed trait MANUAL_CPM extends BiddingStrategyString
  
  @js.native
  sealed trait MEDIA_BUNDLE extends MediaType
  
  @js.native
  sealed trait MILES extends RadiusUnits
  
  @js.native
  sealed trait MOBILE_AD extends AdType
  
  @js.native
  sealed trait MOBILE_IMAGE_AD extends AdType
  
  @js.native
  sealed trait MONDAY extends DayOfWeekString
  
  @js.native
  sealed trait Municipality extends TargetType
  
  @js.native
  sealed trait NON_FAMILY_SAFE extends ApprovalStatus
  
  @js.native
  sealed trait `National Park` extends TargetType
  
  @js.native
  sealed trait Neighborhood extends TargetType
  
  @js.native
  sealed trait OBSOLETE extends TargetingStatus
  
  @js.native
  sealed trait ONE_HUNDRED_THOUSAND_TO_THREE_HUNDRED_THOUSAND extends UserListSizeRange
  
  @js.native
  sealed trait ONE_MILLION_TO_TWO_MILLION extends UserListSizeRange
  
  @js.native
  sealed trait ONE_THOUSAND_TO_TEN_THOUSAND extends UserListSizeRange
  
  @js.native
  sealed trait OPTIMIZE extends AdRotationType
  
  @js.native
  sealed trait OVER_FIFTY_MILLION extends UserListSizeRange
  
  @js.native
  sealed trait Okrug extends TargetType
  
  @js.native
  sealed trait PERCENT_CPA extends BiddingStrategyString
  
  @js.native
  sealed trait PHASING_OUT extends TargetingStatus
  
  @js.native
  sealed trait PHRASE extends MatchType
  
  @js.native
  sealed trait PORN extends ApprovalStatus
  
  @js.native
  sealed trait PRODUCT_AD extends AdType
  
  @js.native
  sealed trait `Postal Code` extends TargetType
  
  @js.native
  sealed trait Prefecture extends TargetType
  
  @js.native
  sealed trait Province extends TargetType
  
  @js.native
  sealed trait REMARKETING extends UserListType
  
  @js.native
  sealed trait RICH_MEDIA_AD extends AdType
  
  @js.native
  sealed trait ROTATE extends AdRotationType
  
  @js.native
  sealed trait ROTATE_FOREVER extends AdRotationType
  
  @js.native
  sealed trait RULE_BASED extends UserListType
  
  @js.native
  sealed trait Region extends TargetType
  
  @js.native
  sealed trait SATURDAY extends DayOfWeekString
  
  @js.native
  sealed trait SEARCH_OR_DISPLAY extends CampaignType
  
  @js.native
  sealed trait SHOPPING extends CampaignType
  
  @js.native
  sealed trait SIMILAR extends UserListType
  
  @js.native
  sealed trait SITE_SUSPENDED extends PolicyApprovalStatus
  
  @js.native
  sealed trait STANDARD_ICON extends MediaType
  
  @js.native
  sealed trait SUNDAY extends DayOfWeekString
  
  @js.native
  sealed trait State extends TargetType
  
  @js.native
  sealed trait TARGET_ALL_FALSE extends TargetingSetting
  
  @js.native
  sealed trait TARGET_ALL_TRUE extends TargetingSetting
  
  @js.native
  sealed trait TEMPLATE_AD extends AdType
  
  @js.native
  sealed trait TEN_MILLION_TO_TWENTY_MILLION extends UserListSizeRange
  
  @js.native
  sealed trait TEN_THOUSAND_TO_FIFTY_THOUSAND extends UserListSizeRange
  
  @js.native
  sealed trait TEXT_AD extends AdType
  
  @js.native
  sealed trait THIRTY_MILLION_TO_FIFTY_MILLION extends UserListSizeRange
  
  @js.native
  sealed trait THIS_MONTH extends DateRange
  
  @js.native
  sealed trait THIS_WEEK_SUN_TODAY extends DateRange
  
  @js.native
  sealed trait THREE_HUNDRED_THOUSAND_TO_FIVE_HUNDRED_THOUSAND extends UserListSizeRange
  
  @js.native
  sealed trait THREE_MILLION_TO_FIVE_MILLION extends UserListSizeRange
  
  @js.native
  sealed trait THURSDAY extends DayOfWeekString
  
  @js.native
  sealed trait TODAY extends DateRange
  
  @js.native
  sealed trait TUESDAY extends DayOfWeekString
  
  @js.native
  sealed trait `TV Region` extends TargetType
  
  @js.native
  sealed trait TWENTY_MILLION_TO_THIRTY_MILLION extends UserListSizeRange
  
  @js.native
  sealed trait TWO_MILLION_TO_THREE_MILLION extends UserListSizeRange
  
  @js.native
  sealed trait Territory extends TargetType
  
  @js.native
  sealed trait UNCHECKED extends ApprovalStatus
  
  @js.native
  sealed trait UNDER_REVIEW extends PolicyApprovalStatus
  
  @js.native
  sealed trait UNKNOWN extends PolicyApprovalStatus
  
  @js.native
  sealed trait UNKNOWN0 extends UserListType
  
  @js.native
  sealed trait USER_INTEREST extends AudienceType
  
  @js.native
  sealed trait USER_INTEREST_AND_LIST extends js.Object
  
  @js.native
  sealed trait USER_LIST extends AudienceType
  
  @js.native
  sealed trait `Union Territory` extends TargetType
  
  @js.native
  sealed trait University extends TargetType
  
  @js.native
  sealed trait VIDEO
    extends CampaignType
       with MediaType
  
  @js.native
  sealed trait WEDNESDAY extends DayOfWeekString
  
  @js.native
  sealed trait YESTERDAY extends DateRange
  
  @js.native
  sealed trait iOS extends AppStore
  
  @scala.inline
  def ACTIVE: ACTIVE = "ACTIVE".asInstanceOf[ACTIVE]
  @scala.inline
  def ADGROUP: ADGROUP = "ADGROUP".asInstanceOf[ADGROUP]
  @scala.inline
  def ALL_TIME: ALL_TIME = "ALL_TIME".asInstanceOf[ALL_TIME]
  @scala.inline
  def APPROVED: APPROVED = "APPROVED".asInstanceOf[APPROVED]
  @scala.inline
  def APPROVED_LIMITED: APPROVED_LIMITED = "APPROVED_LIMITED".asInstanceOf[APPROVED_LIMITED]
  @scala.inline
  def AUDIO: AUDIO = "AUDIO".asInstanceOf[AUDIO]
  @scala.inline
  def Airport: Airport = "Airport".asInstanceOf[Airport]
  @scala.inline
  def Android: Android = "Android".asInstanceOf[Android]
  @scala.inline
  def `Autonomous Community`: `Autonomous Community` = ("Autonomous Community").asInstanceOf[`Autonomous Community`]
  @scala.inline
  def BROAD: BROAD = "BROAD".asInstanceOf[BROAD]
  @scala.inline
  def BUDGET_OPTIMIZER: BUDGET_OPTIMIZER = "BUDGET_OPTIMIZER".asInstanceOf[BUDGET_OPTIMIZER]
  @scala.inline
  def Borough: Borough = "Borough".asInstanceOf[Borough]
  @scala.inline
  def CAMPAIGN: CAMPAIGN = "CAMPAIGN".asInstanceOf[CAMPAIGN]
  @scala.inline
  def CONVERSION_OPTIMIZE: CONVERSION_OPTIMIZE = "CONVERSION_OPTIMIZE".asInstanceOf[CONVERSION_OPTIMIZE]
  @scala.inline
  def CONVERSION_OPTIMIZER: CONVERSION_OPTIMIZER = "CONVERSION_OPTIMIZER".asInstanceOf[CONVERSION_OPTIMIZER]
  @scala.inline
  def CRITERION: CRITERION = "CRITERION".asInstanceOf[CRITERION]
  @scala.inline
  def CRM_BASED: CRM_BASED = "CRM_BASED".asInstanceOf[CRM_BASED]
  @scala.inline
  def Canton: Canton = "Canton".asInstanceOf[Canton]
  @scala.inline
  def City: City = "City".asInstanceOf[City]
  @scala.inline
  def `City Region`: `City Region` = ("City Region").asInstanceOf[`City Region`]
  @scala.inline
  def `Congressional District`: `Congressional District` = ("Congressional District").asInstanceOf[`Congressional District`]
  @scala.inline
  def Country: Country = "Country".asInstanceOf[Country]
  @scala.inline
  def County: County = "County".asInstanceOf[County]
  @scala.inline
  def DISAPPROVED: DISAPPROVED = "DISAPPROVED".asInstanceOf[DISAPPROVED]
  @scala.inline
  def DYNAMIC_IMAGE: DYNAMIC_IMAGE = "DYNAMIC_IMAGE".asInstanceOf[DYNAMIC_IMAGE]
  @scala.inline
  def Department: Department = "Department".asInstanceOf[Department]
  @scala.inline
  def District: District = "District".asInstanceOf[District]
  @scala.inline
  def ELIGIBLE: ELIGIBLE = "ELIGIBLE".asInstanceOf[ELIGIBLE]
  @scala.inline
  def EXACT: EXACT = "EXACT".asInstanceOf[EXACT]
  @scala.inline
  def EXPANDED_TEXT_AD: EXPANDED_TEXT_AD = "EXPANDED_TEXT_AD".asInstanceOf[EXPANDED_TEXT_AD]
  @scala.inline
  def EXTERNAL_REMARKETING: EXTERNAL_REMARKETING = "EXTERNAL_REMARKETING".asInstanceOf[EXTERNAL_REMARKETING]
  @scala.inline
  def FAMILY_SAFE: FAMILY_SAFE = "FAMILY_SAFE".asInstanceOf[FAMILY_SAFE]
  @scala.inline
  def FIFTY_THOUSAND_TO_ONE_HUNDRED_THOUSAND: FIFTY_THOUSAND_TO_ONE_HUNDRED_THOUSAND = "FIFTY_THOUSAND_TO_ONE_HUNDRED_THOUSAND".asInstanceOf[FIFTY_THOUSAND_TO_ONE_HUNDRED_THOUSAND]
  @scala.inline
  def FIVE_HUNDRED_THOUSAND_TO_ONE_MILLION: FIVE_HUNDRED_THOUSAND_TO_ONE_MILLION = "FIVE_HUNDRED_THOUSAND_TO_ONE_MILLION".asInstanceOf[FIVE_HUNDRED_THOUSAND_TO_ONE_MILLION]
  @scala.inline
  def FIVE_MILLION_TO_TEN_MILLION: FIVE_MILLION_TO_TEN_MILLION = "FIVE_MILLION_TO_TEN_MILLION".asInstanceOf[FIVE_MILLION_TO_TEN_MILLION]
  @scala.inline
  def FRIDAY: FRIDAY = "FRIDAY".asInstanceOf[FRIDAY]
  @scala.inline
  def Governorate: Governorate = "Governorate".asInstanceOf[Governorate]
  @scala.inline
  def ICON: ICON = "ICON".asInstanceOf[ICON]
  @scala.inline
  def IMAGE: IMAGE = "IMAGE".asInstanceOf[IMAGE]
  @scala.inline
  def IMAGE_AD: IMAGE_AD = "IMAGE_AD".asInstanceOf[IMAGE_AD]
  @scala.inline
  def KILOMETERS: KILOMETERS = "KILOMETERS".asInstanceOf[KILOMETERS]
  @scala.inline
  def LAST_14_DAYS: LAST_14_DAYS = "LAST_14_DAYS".asInstanceOf[LAST_14_DAYS]
  @scala.inline
  def LAST_30_DAYS: LAST_30_DAYS = "LAST_30_DAYS".asInstanceOf[LAST_30_DAYS]
  @scala.inline
  def LAST_7_DAYS: LAST_7_DAYS = "LAST_7_DAYS".asInstanceOf[LAST_7_DAYS]
  @scala.inline
  def LAST_BUSINESS_WEEK: LAST_BUSINESS_WEEK = "LAST_BUSINESS_WEEK".asInstanceOf[LAST_BUSINESS_WEEK]
  @scala.inline
  def LAST_MONTH: LAST_MONTH = "LAST_MONTH".asInstanceOf[LAST_MONTH]
  @scala.inline
  def LAST_WEEK: LAST_WEEK = "LAST_WEEK".asInstanceOf[LAST_WEEK]
  @scala.inline
  def LAST_WEEK_SUN_SAT: LAST_WEEK_SUN_SAT = "LAST_WEEK_SUN_SAT".asInstanceOf[LAST_WEEK_SUN_SAT]
  @scala.inline
  def LESS_THAN_FIVE_HUNDRED: LESS_THAN_FIVE_HUNDRED = "LESS_THAN_FIVE_HUNDRED".asInstanceOf[LESS_THAN_FIVE_HUNDRED]
  @scala.inline
  def LESS_THAN_ONE_THOUSAND: LESS_THAN_ONE_THOUSAND = "LESS_THAN_ONE_THOUSAND".asInstanceOf[LESS_THAN_ONE_THOUSAND]
  @scala.inline
  def LOGICAL: LOGICAL = "LOGICAL".asInstanceOf[LOGICAL]
  @scala.inline
  def MANUAL_CPC: MANUAL_CPC = "MANUAL_CPC".asInstanceOf[MANUAL_CPC]
  @scala.inline
  def MANUAL_CPM: MANUAL_CPM = "MANUAL_CPM".asInstanceOf[MANUAL_CPM]
  @scala.inline
  def MEDIA_BUNDLE: MEDIA_BUNDLE = "MEDIA_BUNDLE".asInstanceOf[MEDIA_BUNDLE]
  @scala.inline
  def MILES: MILES = "MILES".asInstanceOf[MILES]
  @scala.inline
  def MOBILE_AD: MOBILE_AD = "MOBILE_AD".asInstanceOf[MOBILE_AD]
  @scala.inline
  def MOBILE_IMAGE_AD: MOBILE_IMAGE_AD = "MOBILE_IMAGE_AD".asInstanceOf[MOBILE_IMAGE_AD]
  @scala.inline
  def MONDAY: MONDAY = "MONDAY".asInstanceOf[MONDAY]
  @scala.inline
  def Municipality: Municipality = "Municipality".asInstanceOf[Municipality]
  @scala.inline
  def NON_FAMILY_SAFE: NON_FAMILY_SAFE = "NON_FAMILY_SAFE".asInstanceOf[NON_FAMILY_SAFE]
  @scala.inline
  def `National Park`: `National Park` = ("National Park").asInstanceOf[`National Park`]
  @scala.inline
  def Neighborhood: Neighborhood = "Neighborhood".asInstanceOf[Neighborhood]
  @scala.inline
  def OBSOLETE: OBSOLETE = "OBSOLETE".asInstanceOf[OBSOLETE]
  @scala.inline
  def ONE_HUNDRED_THOUSAND_TO_THREE_HUNDRED_THOUSAND: ONE_HUNDRED_THOUSAND_TO_THREE_HUNDRED_THOUSAND = "ONE_HUNDRED_THOUSAND_TO_THREE_HUNDRED_THOUSAND".asInstanceOf[ONE_HUNDRED_THOUSAND_TO_THREE_HUNDRED_THOUSAND]
  @scala.inline
  def ONE_MILLION_TO_TWO_MILLION: ONE_MILLION_TO_TWO_MILLION = "ONE_MILLION_TO_TWO_MILLION".asInstanceOf[ONE_MILLION_TO_TWO_MILLION]
  @scala.inline
  def ONE_THOUSAND_TO_TEN_THOUSAND: ONE_THOUSAND_TO_TEN_THOUSAND = "ONE_THOUSAND_TO_TEN_THOUSAND".asInstanceOf[ONE_THOUSAND_TO_TEN_THOUSAND]
  @scala.inline
  def OPTIMIZE: OPTIMIZE = "OPTIMIZE".asInstanceOf[OPTIMIZE]
  @scala.inline
  def OVER_FIFTY_MILLION: OVER_FIFTY_MILLION = "OVER_FIFTY_MILLION".asInstanceOf[OVER_FIFTY_MILLION]
  @scala.inline
  def Okrug: Okrug = "Okrug".asInstanceOf[Okrug]
  @scala.inline
  def PERCENT_CPA: PERCENT_CPA = "PERCENT_CPA".asInstanceOf[PERCENT_CPA]
  @scala.inline
  def PHASING_OUT: PHASING_OUT = "PHASING_OUT".asInstanceOf[PHASING_OUT]
  @scala.inline
  def PHRASE: PHRASE = "PHRASE".asInstanceOf[PHRASE]
  @scala.inline
  def PORN: PORN = "PORN".asInstanceOf[PORN]
  @scala.inline
  def PRODUCT_AD: PRODUCT_AD = "PRODUCT_AD".asInstanceOf[PRODUCT_AD]
  @scala.inline
  def `Postal Code`: `Postal Code` = ("Postal Code").asInstanceOf[`Postal Code`]
  @scala.inline
  def Prefecture: Prefecture = "Prefecture".asInstanceOf[Prefecture]
  @scala.inline
  def Province: Province = "Province".asInstanceOf[Province]
  @scala.inline
  def REMARKETING: REMARKETING = "REMARKETING".asInstanceOf[REMARKETING]
  @scala.inline
  def RICH_MEDIA_AD: RICH_MEDIA_AD = "RICH_MEDIA_AD".asInstanceOf[RICH_MEDIA_AD]
  @scala.inline
  def ROTATE: ROTATE = "ROTATE".asInstanceOf[ROTATE]
  @scala.inline
  def ROTATE_FOREVER: ROTATE_FOREVER = "ROTATE_FOREVER".asInstanceOf[ROTATE_FOREVER]
  @scala.inline
  def RULE_BASED: RULE_BASED = "RULE_BASED".asInstanceOf[RULE_BASED]
  @scala.inline
  def Region: Region = "Region".asInstanceOf[Region]
  @scala.inline
  def SATURDAY: SATURDAY = "SATURDAY".asInstanceOf[SATURDAY]
  @scala.inline
  def SEARCH_OR_DISPLAY: SEARCH_OR_DISPLAY = "SEARCH_OR_DISPLAY".asInstanceOf[SEARCH_OR_DISPLAY]
  @scala.inline
  def SHOPPING: SHOPPING = "SHOPPING".asInstanceOf[SHOPPING]
  @scala.inline
  def SIMILAR: SIMILAR = "SIMILAR".asInstanceOf[SIMILAR]
  @scala.inline
  def SITE_SUSPENDED: SITE_SUSPENDED = "SITE_SUSPENDED".asInstanceOf[SITE_SUSPENDED]
  @scala.inline
  def STANDARD_ICON: STANDARD_ICON = "STANDARD_ICON".asInstanceOf[STANDARD_ICON]
  @scala.inline
  def SUNDAY: SUNDAY = "SUNDAY".asInstanceOf[SUNDAY]
  @scala.inline
  def State: State = "State".asInstanceOf[State]
  @scala.inline
  def TARGET_ALL_FALSE: TARGET_ALL_FALSE = "TARGET_ALL_FALSE".asInstanceOf[TARGET_ALL_FALSE]
  @scala.inline
  def TARGET_ALL_TRUE: TARGET_ALL_TRUE = "TARGET_ALL_TRUE".asInstanceOf[TARGET_ALL_TRUE]
  @scala.inline
  def TEMPLATE_AD: TEMPLATE_AD = "TEMPLATE_AD".asInstanceOf[TEMPLATE_AD]
  @scala.inline
  def TEN_MILLION_TO_TWENTY_MILLION: TEN_MILLION_TO_TWENTY_MILLION = "TEN_MILLION_TO_TWENTY_MILLION".asInstanceOf[TEN_MILLION_TO_TWENTY_MILLION]
  @scala.inline
  def TEN_THOUSAND_TO_FIFTY_THOUSAND: TEN_THOUSAND_TO_FIFTY_THOUSAND = "TEN_THOUSAND_TO_FIFTY_THOUSAND".asInstanceOf[TEN_THOUSAND_TO_FIFTY_THOUSAND]
  @scala.inline
  def TEXT_AD: TEXT_AD = "TEXT_AD".asInstanceOf[TEXT_AD]
  @scala.inline
  def THIRTY_MILLION_TO_FIFTY_MILLION: THIRTY_MILLION_TO_FIFTY_MILLION = "THIRTY_MILLION_TO_FIFTY_MILLION".asInstanceOf[THIRTY_MILLION_TO_FIFTY_MILLION]
  @scala.inline
  def THIS_MONTH: THIS_MONTH = "THIS_MONTH".asInstanceOf[THIS_MONTH]
  @scala.inline
  def THIS_WEEK_SUN_TODAY: THIS_WEEK_SUN_TODAY = "THIS_WEEK_SUN_TODAY".asInstanceOf[THIS_WEEK_SUN_TODAY]
  @scala.inline
  def THREE_HUNDRED_THOUSAND_TO_FIVE_HUNDRED_THOUSAND: THREE_HUNDRED_THOUSAND_TO_FIVE_HUNDRED_THOUSAND = "THREE_HUNDRED_THOUSAND_TO_FIVE_HUNDRED_THOUSAND".asInstanceOf[THREE_HUNDRED_THOUSAND_TO_FIVE_HUNDRED_THOUSAND]
  @scala.inline
  def THREE_MILLION_TO_FIVE_MILLION: THREE_MILLION_TO_FIVE_MILLION = "THREE_MILLION_TO_FIVE_MILLION".asInstanceOf[THREE_MILLION_TO_FIVE_MILLION]
  @scala.inline
  def THURSDAY: THURSDAY = "THURSDAY".asInstanceOf[THURSDAY]
  @scala.inline
  def TODAY: TODAY = "TODAY".asInstanceOf[TODAY]
  @scala.inline
  def TUESDAY: TUESDAY = "TUESDAY".asInstanceOf[TUESDAY]
  @scala.inline
  def `TV Region`: `TV Region` = ("TV Region").asInstanceOf[`TV Region`]
  @scala.inline
  def TWENTY_MILLION_TO_THIRTY_MILLION: TWENTY_MILLION_TO_THIRTY_MILLION = "TWENTY_MILLION_TO_THIRTY_MILLION".asInstanceOf[TWENTY_MILLION_TO_THIRTY_MILLION]
  @scala.inline
  def TWO_MILLION_TO_THREE_MILLION: TWO_MILLION_TO_THREE_MILLION = "TWO_MILLION_TO_THREE_MILLION".asInstanceOf[TWO_MILLION_TO_THREE_MILLION]
  @scala.inline
  def Territory: Territory = "Territory".asInstanceOf[Territory]
  @scala.inline
  def UNCHECKED: UNCHECKED = "UNCHECKED".asInstanceOf[UNCHECKED]
  @scala.inline
  def UNDER_REVIEW: UNDER_REVIEW = "UNDER_REVIEW".asInstanceOf[UNDER_REVIEW]
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  @scala.inline
  def UNKNOWN0: UNKNOWN0 = "UNKNOWN0".asInstanceOf[UNKNOWN0]
  @scala.inline
  def USER_INTEREST: USER_INTEREST = "USER_INTEREST".asInstanceOf[USER_INTEREST]
  @scala.inline
  def USER_INTEREST_AND_LIST: USER_INTEREST_AND_LIST = "USER_INTEREST_AND_LIST".asInstanceOf[USER_INTEREST_AND_LIST]
  @scala.inline
  def USER_LIST: USER_LIST = "USER_LIST".asInstanceOf[USER_LIST]
  @scala.inline
  def `Union Territory`: `Union Territory` = ("Union Territory").asInstanceOf[`Union Territory`]
  @scala.inline
  def University: University = "University".asInstanceOf[University]
  @scala.inline
  def VIDEO: VIDEO = "VIDEO".asInstanceOf[VIDEO]
  @scala.inline
  def WEDNESDAY: WEDNESDAY = "WEDNESDAY".asInstanceOf[WEDNESDAY]
  @scala.inline
  def YESTERDAY: YESTERDAY = "YESTERDAY".asInstanceOf[YESTERDAY]
  @scala.inline
  def iOS: iOS = "iOS".asInstanceOf[iOS]
}

