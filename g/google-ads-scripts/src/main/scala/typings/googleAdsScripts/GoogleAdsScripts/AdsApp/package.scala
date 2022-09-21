package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Iterator
import typings.googleAdsScripts.GoogleAdsScripts.Base.Operation
import typings.googleAdsScripts.GoogleAdsScripts.Base.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// tslint:disable-next-line: no-empty-interface
type AccountCallout = Callout

type AccountCalloutIterator = Iterator[AccountCallout]

// tslint:disable-next-line: no-empty-interface
type AccountMessage = Message

type AccountMessageIterator = Iterator[AccountMessage]

// tslint:disable-next-line: no-empty-interface
type AccountMobileApp = MobileApp

type AccountMobileAppIterator = Iterator[AccountMobileApp]

// tslint:disable-next-line: no-empty-interface
type AccountPhoneNumber = PhoneNumber

type AccountPhoneNumberIterator = Iterator[AccountPhoneNumber]

// tslint:disable-next-line: no-empty-interface
type AccountPrice = Price

type AccountPriceIterator = Iterator[AccountPrice]

// tslint:disable-next-line: no-empty-interface
type AccountSitelink = Sitelink

type AccountSitelinkIterator = Iterator[AccountSitelink]

// tslint:disable-next-line: no-empty-interface
type AccountSnippet = Snippet

type AccountSnippetIterator = Iterator[AccountSnippet]

/**
  * An iterator of ad customizer items.
  * Typical usage:
  *
  *      while (adCustomizerItemIterator.hasNext()) {
  *        var adCustomizerItem = adCustomizerItemIterator.next();
  *      }
  */
type AdCustomizerItemIterator = Iterator[AdCustomizerItem]

/**
  * An operation representing creation of a new ad customizer item.
  * Calling any method (getErrors, getResult, or isSuccessful) will cause the operation to execute and create the ad customizer item.
  * To make the script more efficient, it's recommended that you store the operations in an array and only call these methods once you've constructed all the operations you want.
  */
type AdCustomizerItemOperation = Operation[AdCustomizerItem]

/**
  * An iterator of ad customizer sources.
  * Typical usage:
  *
  *      while (adCustomizerSourceIterator.hasNext()) {
  *        var adCustomizerSource = adCustomizerSourceIterator.next();
  *      }
  */
type AdCustomizerSourceIterator = Iterator[AdCustomizerSource]

/**
  * An operation representing creation of a new ad customizer source.
  * Calling any method (`getErrors`, `getResult`, or `isSuccessful`) will cause the operation to execute and create the ad customizer source.
  * To make the script more efficient, it's recommended that you store the operations in an array and only call these methods once you've constructed
  * all the operations you want.
  */
type AdCustomizerSourceOperation = Operation[AdCustomizerSource]

type AdGroupCalloutIterator = Iterator[AdGroupCallout]

/**
  * An iterator of ad groups.
  *
  * Typical usage:
  *
  *      while (adGroupIterator.hasNext()) {
  *        var adGroup = adGroupIterator.next();
  *      }
  */
type AdGroupIterator = Iterator[AdGroup]

type AdGroupMessageIterator = Iterator[AdGroupMessage]

type AdGroupMobileAppIterator = Iterator[AdGroupMobileApp]

/**
  * An operation representing creation of a new ad group
  */
type AdGroupOperation = Operation[AdGroup]

type AdGroupPhoneNumberIterator = Iterator[AdGroupPhoneNumber]

type AdGroupPriceIterator = Iterator[AdGroupPrice]

type AdGroupSitelinkIterator = Iterator[AdGroupSitelink]

type AdGroupSnippetIterator = Iterator[AdGroupSnippet]

/**
  * An iterator of ads.
  *
  * Typical usage:
  *
  *      while (adIterator.hasNext()) {
  *        var ad = adIterator.next();
  *      }
  */
type AdIterator = Iterator[Ad]

/** An operation representing creation of a new ad. */
type AdOperation = Operation[Ad]

/**
  * An iterator of ad params.
  *
  * Typical usage:
  *
  *      while (adParamIterator.hasNext()) {
  *        var adParam = adParamIterator.next();
  *      }
  */
type AdParamIterator = Iterator[AdParam]

/**
  * Fetches ad params. Unlike other selectors, does not support filtering or sorting.
  */
type AdParamSelector = Selector[AdParamIterator]

/**
  * An iterator of ad schedules.
  *
  * Typical usage:
  *
  *      while (adScheduleIterator.hasNext()) {
  *        var adSchedule = adScheduleIterator.next();
  *      }
  */
type AdScheduleIterator = Iterator[AdSchedule]

/** An operation representing creation of a new ad schedule. */
type AdScheduleOperation = Operation[AdSchedule]

/**
  * An iterator of assets.
  *
  * Typical usage:
  *
  *      while (assetIterator.hasNext()) {
  *        var asset = assetIterator.next();
  *      }
  */
type AssetIterator = Iterator[Asset]

/**
  * An operation representing creation of a new asset.
  * Calling any method (getErrors, getResult, or isSuccessful) will cause the operation to execute and create the asset.
  * To make the script more efficient, it's recommended that you store the operations in an array and only call these methods once you've constructed all the operations you want.
  */
type AssetOperation = Operation[Asset]

/**
  * An iterator of audiences.
  *
  * Typical usage:
  *
  *      while (audienceIterator.hasNext()) {
  *        var audience = audienceIterator.next();
  *      }
  */
type AudienceIterator = Iterator[Audience]

/**
  * An operation representing creation of a new audience.
  */
type AudienceOperation = Operation[Audience]

/**
  * An iterator of bidding strategies.
  *
  * Typical usage:
  *
  *      while (biddingStrategyIterator.hasNext()) {
  *        var biddingStrategy = biddingStrategyIterator.next();
  *      }
  */
type BiddingStrategyIterator = Iterator[BiddingStrategy]

/**
  * An iterator of budgets.
  *
  * Typical usage:
  *
  *      while (budgetIterator.hasNext()) {
  *        var budget = budgetIterator.next();
  *      }
  */
type BudgetIterator = Iterator[Budget]

/**
  * An iterator of budgetOrders.
  *
  * Typical usage:
  *
  *      while (budgetOrderIterator.hasNext()) {
  *        var budgetOrder = budgetOrderIterator.next();
  *      }
  */
type BudgetOrderIterator = Iterator[BudgetOrder]

type CalloutIterator = Iterator[Callout]

type CalloutOperation = Operation[Callout]

type CampaignCalloutIterator = Iterator[CampaignCallout]

/**
  * An iterator of campaigns.
  *
  * Typical usage:
  *
  *      while (campaignIterator.hasNext()) {
  *        var campaign = campaignIterator.next();
  *      }
  */
type CampaignIterator = Iterator[Campaign]

type CampaignMessageIterator = Iterator[CampaignMessage]

type CampaignMobileAppIterator = Iterator[CampaignMobileApp]

type CampaignPhoneNumberIterator = Iterator[CampaignPhoneNumber]

type CampaignPriceIterator = Iterator[CampaignPrice]

type CampaignSitelinkIterator = Iterator[CampaignSitelink]

type CampaignSnippetIterator = Iterator[CampaignSnippet]

/**
  * An iterator of display keywords.
  *
  * Typical usage:
  *
  *      while (displayKeywordIterator.hasNext()) {
  *        var displayKeyword = displayKeywordIterator.next();
  *      }
  */
type DisplayKeywordIterator = Iterator[DisplayKeyword]

/** An operation representing creation of a new display keyword. */
type DisplayKeywordOperation = Operation[DisplayKeyword]

/**
  * An iterator of drafts.
  *
  * Typical usage:
  *
  *      while (draftIterator.hasNext()) {
  *        var draft = draftIterator.next();
  *      }
  */
type DraftIterator = Iterator[Draft]

/** An operation representing creation of a new draft. */
type DraftOperation = Operation[Draft]

/**
  * An iterator of excludedAudiences.
  *
  * Typical usage:
  *
  *      while (excludedAudienceIterator.hasNext()) {
  *        var excludedAudience = excludedAudienceIterator.next();
  *      }
  */
type ExcludedAudienceIterator = Iterator[ExcludedAudience]

/**
  * An operation representing creation of a new excludedAudience.
  */
type ExcludedAudienceOperation = Operation[ExcludedAudience]

/**
  * An iterator of excluded content labels.
  *
  * Typical usage:
  *
  *      while (excludedContentLabelIterator.hasNext()) {
  *        var excludedContentLabel = excludedContentLabelIterator.next();
  *      }
  */
type ExcludedContentLabelIterator = Iterator[ExcludedContentLabel]

/** An operation representing creation of a new excluded content label. */
type ExcludedContentLabelOperation = Operation[ExcludedContentLabel]

/**
  * An iterator of excluded display keywords.
  *
  * Typical usage:
  *
  *      while (excludedDisplayKeywordIterator.hasNext()) {
  *        var excludedDisplayKeyword = excludedDisplayKeywordIterator.next();
  *      }
  */
type ExcludedDisplayKeywordIterator = Iterator[ExcludedDisplayKeyword]

/** An operation representing creation of a new excluded display keyword. */
type ExcludedDisplayKeywordOperation = Operation[ExcludedDisplayKeyword]

/**
  * An iterator of excluded locations.
  *
  * Typical usage:
  *
  *      while (excludedLocationIterator.hasNext()) {
  *        var excludedLocation = excludedLocationIterator.next();
  *      }
  */
type ExcludedLocationIterator = Iterator[ExcludedLocation]

/** An operation representing creation of a new excluded location. */
type ExcludedLocationOperation = Operation[ExcludedLocation]

/**
  * An iterator of excluded placements.
  *
  * Typical usage:
  *
  *      while (excludedPlacementIterator.hasNext()) {
  *        var excludedPlacement = excludedPlacementIterator.next();
  *      }
  */
type ExcludedPlacementIterator = Iterator[ExcludedPlacement]

/**
  * An iterator of excluded placement lists.
  *
  * Typical usage:
  *
  *      while (excludedPlacementListIterator.hasNext()) {
  *        var excludedPlacementList = excludedPlacementListIterator.next();
  *      }
  */
type ExcludedPlacementListIterator = Iterator[ExcludedPlacementList]

/** An operation representing creation of a new excluded placement list.  */
type ExcludedPlacementListOperation = Operation[ExcludedPlacementList]

/** An operation representing creation of a new excluded placement. */
type ExcludedPlacementOperation = Operation[ExcludedPlacement]

/**
  * An iterator of excluded topics.
  *
  * Typical usage:
  *
  *      while (excludedTopicIterator.hasNext()) {
  *        var excludedTopic = excludedTopicIterator.next();
  *      }
  */
type ExcludedTopicIterator = Iterator[ExcludedTopic]

/** An operation representing creation of a new excluded topic. */
type ExcludedTopicOperation = Operation[ExcludedTopic]

/**
  * An iterator of excluded video ages.
  *
  * Typical usage:
  *
  *      while (excludedVideoAgeIterator.hasNext()) {
  *        var excludedVideoAge = excludedVideoAgeIterator.next();
  *      }
  */
type ExcludedVideoAgeIterator = Iterator[ExcludedVideoAge]

/** An operation representing creation of a new excluded video age. */
type ExcludedVideoAgeOperation = Operation[ExcludedVideoAge]

/**
  * An iterator of excluded video audiences.
  *
  * Typical usage:
  *
  *      while (excludedVideoAudienceIterator.hasNext()) {
  *        var excludedVideoAudience = excludedVideoAudienceIterator.next();
  *      }
  */
type ExcludedVideoAudienceIterator = Iterator[ExcludedVideoAudience]

/** An operation representing creation of a new excluded video audience. */
type ExcludedVideoAudienceOperation = Operation[ExcludedVideoAudience]

/**
  * An iterator of excluded video genders.
  *
  * Typical usage:
  *
  *      while (excludedVideoGenderIterator.hasNext()) {
  *        var excludedVideoGender = excludedVideoGenderIterator.next();
  *      }
  */
type ExcludedVideoGenderIterator = Iterator[ExcludedVideoGender]

/** An operation representing creation of a new excluded video gender. */
type ExcludedVideoGenderOperation = Operation[ExcludedVideoGender]

/**
  * An iterator of excluded video keywords.
  *
  * Typical usage:
  *
  *  while (excludedVideoKeywordIterator.hasNext()) {
  *    var excludedVideoKeyword = excludedVideoKeywordIterator.next();
  *  }
  */
type ExcludedVideoKeywordIterator = Iterator[ExcludedVideoKeyword]

/** An operation representing creation of a new excluded video keyword.  */
type ExcludedVideoKeywordOperation = Operation[ExcludedVideoKeyword]

/**
  * An iterator of excluded video mobile application categories.
  *
  * Typical usage:
  *
  *      while (excludedVideoMobileAppCategoryIterator.hasNext()) {
  *        var excludedVideoMobileAppCategory = excludedVideoMobileAppCategoryIterator.next();
  *      }
  */
type ExcludedVideoMobileAppCategoryIterator = Iterator[ExcludedVideoMobileAppCategory]

/** An operation representing creation of a new excluded video mobile application category. */
type ExcludedVideoMobileAppCategoryOperation = Operation[ExcludedVideoMobileAppCategory]

/**
  * An iterator of excluded video mobile applications.
  *
  * Typical usage:
  *
  *      while (excludedVideoMobileApplicationIterator.hasNext()) {
  *        var excludedVideoMobileApplication = excludedVideoMobileApplicationIterator.next();
  *      }
  */
type ExcludedVideoMobileApplicationIterator = Iterator[ExcludedVideoMobileApplication]

/** An operation representing creation of a new excluded video mobile applications. */
type ExcludedVideoMobileApplicationOperation = Operation[ExcludedVideoMobileApplication]

/**
  * An iterator of excluded video parental statuses.
  *
  * Typical usage:
  *
  *      while (excludedVideoParentalStatusIterator.hasNext()) {
  *        var excludedVideoParentalStatus = excludedVideoParentalStatusIterator.next();
  *      }
  */
type ExcludedVideoParentalStatusIterator = Iterator[ExcludedVideoParentalStatus]

/** An operation representing creation of a new excluded video parental status. */
type ExcludedVideoParentalStatusOperation = Operation[ExcludedVideoParentalStatus]

/**
  * An iterator of excluded video placements.
  *
  * Typical usage:
  *
  *      while (excludedVideoPlacementIterator.hasNext()) {
  *        var excludedVideoPlacement = excludedVideoPlacementIterator.next();
  *      }
  */
type ExcludedVideoPlacementIterator = Iterator[ExcludedVideoPlacement]

/** An operation representing creation of a new excluded video placement. */
type ExcludedVideoPlacementOperation = Operation[ExcludedVideoPlacement]

/**
  * An iterator of excluded video topics.
  *
  * Typical usage:
  *
  *      while (excludedVideoTopicIterator.hasNext()) {
  *        var excludedVideoTopic = excludedVideoTopicIterator.next();
  *      }
  */
type ExcludedVideoTopicIterator = Iterator[ExcludedVideoTopic]

/** An operation representing creation of a new excluded video topic. */
type ExcludedVideoTopicOperation = Operation[ExcludedVideoTopic]

/**
  * An iterator of excluded video YouTube channels.
  *
  * Typical usage:
  *
  *      while (excludedVideoYouTubeChannelIterator.hasNext()) {
  *        var excludedVideoYouTubeChannel = excludedVideoYouTubeChannelIterator.next();
  *      }
  */
type ExcludedVideoYouTubeChannelIterator = Iterator[ExcludedVideoYouTubeChannel]

/** An operation representing creation of a new excluded video YouTube chanel. */
type ExcludedVideoYouTubeChannelOperation = Operation[ExcludedVideoYouTubeChannel]

/**
  * An iterator of excluded video YouTube videos.
  *
  * Typical usage:
  *
  *      while (excludedVideoYouTubeVideoIterator.hasNext()) {
  *        var excludedVideoYouTubeVideo = excludedVideoYouTubeVideoIterator.next();
  *      }
  */
type ExcludedVideoYouTubeVideoIterator = Iterator[ExcludedVideoYouTubeVideo]

/** An operation representing creation of a new excluded video YouTube video. */
type ExcludedVideoYouTubeVideoOperation = Operation[ExcludedVideoYouTubeVideo]

/**
  * An iterator of excluded YouTube channels.
  *
  * Typical usage:
  *
  *      while (excludedYouTubeChannelIterator.hasNext()) {
  *        var excludedYouTubeChannel = excludedYouTubeChannelIterator.next();
  *      }
  */
type ExcludedYouTubeChannelIterator = Iterator[ExcludedYouTubeChannel]

/** An operation representing creation of a new excluded YouTube channel. */
type ExcludedYouTubeChannelOperation = Operation[ExcludedYouTubeChannel]

/**
  * An iterator of excluded YouTube videos.
  *
  * Typical usage:
  *
  *      while (excludedYouTubeVideoIterator.hasNext()) {
  *        var excludedYouTubeVideo = excludedYouTubeVideoIterator.next();
  *      }
  */
type ExcludedYouTubeVideoIterator = Iterator[ExcludedYouTubeVideo]

/** An operation representing creation of a new excluded YouTube video. */
type ExcludedYouTubeVideoOperation = Operation[ExcludedYouTubeVideo]

/**
  * An iterator of experiments.
  *
  * Typical usage:
  *
  *      while (experimentIterator.hasNext()) {
  *        var experiment = experimentIterator.next();
  *      }
  */
type ExperimentIterator = Iterator[Experiment]

/**
  * An iterator of keywords.
  *
  * Typical usage:
  *
  *      while (keywordIterator.hasNext()) {
  *        var keyword = keywordIterator.next();
  *      }
  */
type KeywordIterator = Iterator[Keyword]

/**
  * An operation representing creation of a new keyword.
  */
type KeywordOperation = Operation[Keyword]

/**
  * An iterator of labels.
  *
  * Typical usage:
  *
  *      while (labelIterator.hasNext()) {
  *        var label = labelIterator.next();
  *      }
  */
type LabelIterator = Iterator[Label]

/**
  * An iterator of languages.
  *
  * Typical usage:
  *
  *      while (languageIterator.hasNext()) {
  *        var language = languageIterator.next();
  *      }
  */
type LanguageIterator = Iterator[Language]

/** An operation representing creation of a new language. */
type LanguageOperation = Operation[Language]

/**
  * An iterator of media.
  *
  * Typical usage:
  *
  *      while (mediaIterator.hasNext()) {
  *        var media = mediaIterator.next();
  *      }
  */
type MediaIterator = Iterator[Media]

/** An operation representing creation of a new media. */
type MediaOperation = Operation[Media]

type MessageIterator = Iterator[Message]

type MessageOperation = Operation[Message]

type MobileAppIterator = Iterator[MobileApp]

type MobileAppOperation = Operation[MobileApp]

/**
  * An iterator of negative keywords.
  *
  * Typical usage:
  *
  *  while (negativeKeywordIterator.hasNext()) {
  *    var negativeKeyword = negativeKeywordIterator.next();
  *  }
  */
type NegativeKeywordIterator = Iterator[NegativeKeyword]

/** An operation representing creation of a new negative keyword list. */
type NegativeKeywordListOperation = Operation[NegativeKeywordList]

type PhoneNumberIterator = Iterator[PhoneNumber]

type PhoneNumberOperation = Operation[PhoneNumber]

/**
  * An iterator of placements.
  *
  * Typical usage:
  *
  *      while (placementIterator.hasNext()) {
  *        var placement = placementIterator.next();
  *      }
  */
type PlacementIterator = Iterator[Placement]

/** An operation representing creation of a new placement. */
type PlacementOperation = Operation[Placement]

/**
  * An iterator of platforms.
  *
  * Typical usage:
  *
  *      while (platformIterator.hasNext()) {
  *        var platform = platformIterator.next();
  *      }
  */
type PlatformIterator = Iterator[Platform]

type PriceItemIterator = Iterator[PriceItem]

type PriceItemOperation = Operation[PriceItem]

type PriceIterator = Iterator[Price]

type PriceOperation = Operation[Price]

/**
  * An iterator of product ads.
  *
  * Typical usage:
  *
  *      while (productAdIterator.hasNext()) {
  *        var productAd = productAdIterator.next();
  *      }
  */
type ProductAdIterator = Iterator[ProductAd]

/** An operation representing creation of a new product ad. */
type ProductAdOperation = Operation[ProductAd]

/** An operation representing creation of a new product brand. */
type ProductBrandOperation = Operation[ProductBrand]

/** An operation representing creation of a new product category. */
type ProductCategoryOperation = Operation[ProductCategory]

/** An operation representing creation of a new product channel exclusivity. */
type ProductChannelExclusivityOperation = Operation[ProductChannelExclusivity]

/** An operation representing creation of a new product channel. */
type ProductChannelOperation = Operation[ProductChannel]

/** An operation representing creation of a new product condition. */
type ProductConditionOperation = Operation[ProductCondition]

/** An operation representing creation of a new product custom label. */
type ProductCustomLabelOperation = Operation[ProductCustomLabel]

/**
  * An iterator of product groups.
  *
  * Typical usage:
  *
  *      while (productGroupIterator.hasNext()) {
  *        var productGroup = productGroupIterator.next();
  *      }
  */
type ProductGroupIterator = Iterator[ProductGroup]

/** An operation representing creation of a new product group. */
type ProductGroupOperation = Operation[ProductGroup]

/** An operation representing creation of a new product item id. */
type ProductItemIdOperation = Operation[ProductItemId]

/** An operation representing creation of a new product type. */
type ProductTypeOperation = Operation[ProductType]

/**
  * An iterator of audiences.
  *
  * Typical usage:
  *
  *      while (audienceIterator.hasNext()) {
  *        var audience = audienceIterator.next();
  *      }
  */
type SearchAdGroupAudienceIterator = Iterator[SearchAdGroupAudience]

/** An operation representing creation of a new audience. */
type SearchAdGroupAudienceOperation = Operation[SearchAdGroupAudience]

/**
  * An iterator of excluded audiences.
  *
  * Typical usage:
  *
  *      while (excludedAudienceIterator.hasNext()) {
  *        var excludedAudience = excludedAudienceIterator.next();
  *      }
  */
type SearchAdGroupExcludedAudienceIterator = Iterator[SearchAdGroupExcludedAudience]

/** An operation representing creation of a new excluded audience. */
type SearchAdGroupExcludedAudienceOperation = Operation[SearchAdGroupExcludedAudience]

/**
  * An iterator of audiences.
  *
  * Typical usage:
  *
  *      while (audienceIterator.hasNext()) {
  *        var audience = audienceIterator.next();
  *      }
  */
type SearchCampaignAudienceIterator = Iterator[SearchCampaignAudience]

/** An operation representing creation of a new audience. */
type SearchCampaignAudienceOperation = Operation[SearchCampaignAudience]

/**
  * An iterator of excluded audiences.
  *
  * Typical usage:
  *
  *      while (excludedAudienceIterator.hasNext()) {
  *        var excludedAudience = excludedAudienceIterator.next();
  *      }
  */
type SearchCampaignExcludedAudienceIterator = Iterator[SearchCampaignExcludedAudience]

/** An operation representing creation of a new excluded audience. */
type SearchCampaignExcludedAudienceOperation = Operation[SearchCampaignExcludedAudience]

/**
  * An iterator of shared excluded placements.
  *
  * Typical usage:
  *
  *      while (sharedExcludedPlacementIterator.hasNext()) {
  *        var sharedExcludedPlacement = sharedExcludedPlacementIterator.next();
  *      }
  */
type SharedExcludedPlacementIterator = Iterator[SharedExcludedPlacement]

/**
  * An iterator of shared negative keyword.
  *
  * Typical usage:
  *
  *      while (sharedNegativeKeywordIterator.hasNext()) {
  *        var sharedNegativeKeyword = sharedNegativeKeywordIterator.next();
  *      }
  */
type SharedNegativeKeywordIterator = Iterator[SharedNegativeKeyword]

/**
  * An iterator of shopping audiences.
  *
  * Typical usage:
  *
  *      while (shoppingAudienceIterator.hasNext()) {
  *        var shoppingAudience = shoppingAudienceIterator.next();
  *      }
  */
type ShoppingAdGroupAudienceIterator = Iterator[ShoppingAdGroupAudience]

/**
  * An operation representing creation of a new shopping audience.
  */
type ShoppingAdGroupAudienceOperation = Operation[ShoppingAdGroupAudience]

/**
  * An iterator of shopping ad groups.
  *
  * Typical usage:
  *
  *      while (shoppingAdGroupIterator.hasNext()) {
  *        var shoppingAdGroup = shoppingAdGroupIterator.next();
  *      }
  */
type ShoppingAdGroupIterator = Iterator[ShoppingAdGroup]

/** An operation representing creation of a new shopping ad group. */
type ShoppingAdGroupOperation = Operation[ShoppingAdGroup]

/**
  * An iterator of shopping audiences.
  *
  * Typical usage:
  *
  *      while (shoppingAudienceIterator.hasNext()) {
  *        var shoppingAudience = shoppingAudienceIterator.next();
  *      }
  */
type ShoppingCampaignAudienceIterator = Iterator[ShoppingCampaignAudience]

/** An operation representing creation of a new shopping audience. */
type ShoppingCampaignAudienceOperation = Operation[ShoppingCampaignAudience]

/**
  * An iterator of shopping campaigns.
  *
  * Typical usage:
  *
  *      while (shoppingCampaignIterator.hasNext()) {
  *        var shoppingCampaign = shoppingCampaignIterator.next();
  *      }
  */
type ShoppingCampaignIterator = Iterator[ShoppingCampaign]

type SitelinkIterator = Iterator[Sitelink]

type SitelinkOperation = Operation[Sitelink]

type SnippetIterator = Iterator[Snippet]

type SnippetOperation = Operation[Snippet]

/**
  * An iterator of targeted locations.
  *
  * Typical usage:
  *
  *      while (targetedLocationIterator.hasNext()) {
  *        var targetedLocation = targetedLocationIterator.next();
  *      }
  */
type TargetedLocationIterator = Iterator[TargetedLocation]

/** An operation representing creation of a new targeted location. */
type TargetedLocationOperation = Operation[TargetedLocation]

/**
  * An iterator of targeted proximities.
  *
  * Typical usage:
  *
  *      while (targetedProximityIterator.hasNext()) {
  *        var targetedProximity = targetedProximityIterator.next();
  *      }
  */
type TargetedProximityIterator = Iterator[TargetedProximity]

/** An operation representing creation of a new targeted proximity. */
type TargetedProximityOperation = Operation[TargetedProximity]

/**
  * An iterator of topics.
  *
  * Typical usage:
  *
  *      while (topicIterator.hasNext()) {
  *        var topic = topicIterator.next();
  *      }
  */
type TopicIterator = Iterator[Topic]

/** An operation representing creation of a new topic. */
type TopicOperation = Operation[Topic]

/**
  * An iterator of user lists.
  *
  * Typical usage:
  *
  *  while (userListIterator.hasNext()) {
  *    var userList = userListIterator.next();
  *  }
  */
type UserListIterator = Iterator[UserList]

/**
  * An iterator of video ad group.
  *
  * Typical usage:
  *
  *      while (videoAdGroupIterator.hasNext()) {
  *        var videoAdGroup = videoAdGroupIterator.next();
  *      }
  */
type VideoAdGroupIterator = Iterator[VideoAdGroup]

/** An operation representing creation of a new video ad group.  */
type VideoAdGroupOperation = Operation[VideoAdGroup]

/**
  * An iterator of video ads.
  *
  * Typical usage:
  *
  *  while (videoAdIterator.hasNext()) {
  *    var videoAd = videoAdIterator.next();
  *  }
  */
type VideoAdIterator = Iterator[VideoAd]

/** An operation representing creation of a new video ad. */
type VideoAdOperation = Operation[VideoAd]

/**
  * An iterator of video ages.
  *
  * Typical usage:
  *
  *      while (videoAgeIterator.hasNext()) {
  *        var videoAge = videoAgeIterator.next();
  *      }
  */
type VideoAgeIterator = Iterator[VideoAge]

/** An operation representing creation of a new video age. */
type VideoAgeOperation = Operation[VideoAge]

/**
  * An iterator of video audiences.
  *
  * Typical usage:
  *
  *  while (videoAudienceIterator.hasNext()) {
  *    var videoAudience = videoAudienceIterator.next();
  *  }
  */
type VideoAudienceIterator = Iterator[VideoAudience]

/** An operation representing creation of a new video audience. */
type VideoAudienceOperation = Operation[VideoAudience]

/**
  * An iterator of video campaigns.
  *
  * Typical usage:
  *
  *      while (videoCampaignIterator.hasNext()) {
  *        var videoCampaign = videoCampaignIterator.next();
  *      }
  */
type VideoCampaignIterator = Iterator[VideoCampaign]

/**
  * An iterator of video genders.
  *
  * Typical usage:
  *
  *      while (videoGenderIterator.hasNext()) {
  *        var videoGender = videoGenderIterator.next();
  *      }
  */
type VideoGenderIterator = Iterator[VideoGender]

/** An operation representing creation of a new video gender. */
type VideoGenderOperation = Operation[VideoGender]

/**
  * An iterator of video keywords.
  *
  * Typical usage:
  *
  *      while (videoKeywordIterator.hasNext()) {
  *        var videoKeyword = videoKeywordIterator.next();
  *      }
  */
type VideoKeywordIterator = Iterator[VideoKeyword]

/** An operation representing creation of a new video keyword. */
type VideoKeywordOperation = Operation[VideoKeyword]

/**
  * An iterator of video mobile application categories.
  *
  * Typical usage:
  *
  *      while (videoMobileAppCategoryIterator.hasNext()) {
  *        var videoMobileAppCategory = videoMobileAppCategoryIterator.next();
  *      }
  */
type VideoMobileAppCategoryIterator = Iterator[VideoMobileAppCategory]

/** An operation representing creation of a new video mobile application category. */
type VideoMobileAppCategoryOperation = Operation[VideoMobileAppCategory]

/**
  * An iterator of video mobile applications.
  *
  * Typical usage:
  *
  *      while (videoMobileApplicationIterator.hasNext()) {
  *        var videoMobileApplication = videoMobileApplicationIterator.next();
  *      }
  */
type VideoMobileApplicationIterator = Iterator[VideoMobileApplication]

/** An operation representing creation of a new video mobile application. */
type VideoMobileApplicationOperation = Operation[VideoMobileApplication]

/**
  * An iterator of video parental statuses.
  *
  * Typical usage:
  *
  *      while (videoParentalStatusIterator.hasNext()) {
  *        var videoParentalStatus = videoParentalStatusIterator.next();
  *      }
  */
type VideoParentalStatusIterator = Iterator[VideoParentalStatus]

/** An operation representing creation of a new video parental status. */
type VideoParentalStatusOperation = Operation[VideoParentalStatus]

/**
  * An iterator of video placements.
  *
  * Typical usage:
  *
  *      while (videoPlacementIterator.hasNext()) {
  *        var videoPlacement = videoPlacementIterator.next();
  *      }
  */
type VideoPlacementIterator = Iterator[VideoPlacement]

/** An operation representing creation of a new video placement. */
type VideoPlacementOperation = Operation[VideoPlacement]

/**
  * An iterator of video topics.
  *
  * Typical usage:
  *
  *      while (videoTopicIterator.hasNext()) {
  *        var videoTopic = videoTopicIterator.next();
  *      }
  */
type VideoTopicIterator = Iterator[VideoTopic]

/** An operation representing creation of a new video topic. */
type VideoTopicOperation = Operation[VideoTopic]

/**
  * An iterator of video YouTube channels.
  *
  * Typical usage:
  *
  *      while (videoYouTubeChannelIterator.hasNext()) {
  *        var videoYouTubeChannel = videoYouTubeChannelIterator.next();
  *      }
  */
type VideoYouTubeChannelIterator = Iterator[VideoYouTubeChannel]

/** An operation representing creation of a new video YouTube channel. */
type VideoYouTubeChannelOperation = Operation[VideoYouTubeChannel]

/**
  * An iterator of video YouTube videos.
  *
  * Typical usage:
  *
  *      while (videoYouTubeVideoIterator.hasNext()) {
  *        var videoYouTubeVideo = videoYouTubeVideoIterator.next();
  *      }
  */
type VideoYouTubeVideoIterator = Iterator[VideoYouTubeVideo]

/** An operation representing creation of a new video YouTube video. */
type VideoYouTubeVideoOperation = Operation[VideoYouTubeVideo]

/**
  * An iterator of YouTube channels.
  *
  * Typical usage:
  *
  *      while (youTubeChannelIterator.hasNext()) {
  *        var youTubeChannel = youTubeChannelIterator.next();
  *      }
  */
type YouTubeChannelIterator = Iterator[YouTubeChannel]

/** An operation representing creation of a new YouTube channel. */
type YouTubeChannelOperation = Operation[YouTubeChannel]

/**
  * An iterator of YouTube videos.
  *
  * Typical usage:
  *
  *  while (youTubeVideoIterator.hasNext()) {
  *    var youTubeVideo = youTubeVideoIterator.next();
  *  }
  */
type YouTubeVideoIterator = Iterator[YouTubeVideo]

/** An operation representing creation of a new YouTube video. */
type YouTubeVideoOperation = Operation[YouTubeVideo]
