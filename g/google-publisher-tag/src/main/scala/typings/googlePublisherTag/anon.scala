package typings.googlePublisherTag

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AuctionSignals extends StObject {
    
    var auctionSignals: js.UndefOr[Any] = js.undefined
    
    var decisionLogicUrl: String
    
    var interestGroupBuyers: js.UndefOr[js.Array[String]] = js.undefined
    
    var perBuyerExperimentGroupIds: js.UndefOr[StringDictionary[Double]] = js.undefined
    
    var perBuyerGroupLimits: js.UndefOr[StringDictionary[Double]] = js.undefined
    
    var perBuyerSignals: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var perBuyerTimeouts: js.UndefOr[StringDictionary[Double]] = js.undefined
    
    var seller: String
    
    var sellerExperimentGroupId: js.UndefOr[Double] = js.undefined
    
    var sellerSignals: js.UndefOr[Any] = js.undefined
    
    var sellerTimeout: js.UndefOr[Double] = js.undefined
    
    var trustedScoringSignalsUrl: js.UndefOr[String] = js.undefined
  }
  object AuctionSignals {
    
    inline def apply(decisionLogicUrl: String, seller: String): AuctionSignals = {
      val __obj = js.Dynamic.literal(decisionLogicUrl = decisionLogicUrl.asInstanceOf[js.Any], seller = seller.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuctionSignals]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuctionSignals] (val x: Self) extends AnyVal {
      
      inline def setAuctionSignals(value: Any): Self = StObject.set(x, "auctionSignals", value.asInstanceOf[js.Any])
      
      inline def setAuctionSignalsUndefined: Self = StObject.set(x, "auctionSignals", js.undefined)
      
      inline def setDecisionLogicUrl(value: String): Self = StObject.set(x, "decisionLogicUrl", value.asInstanceOf[js.Any])
      
      inline def setInterestGroupBuyers(value: js.Array[String]): Self = StObject.set(x, "interestGroupBuyers", value.asInstanceOf[js.Any])
      
      inline def setInterestGroupBuyersUndefined: Self = StObject.set(x, "interestGroupBuyers", js.undefined)
      
      inline def setInterestGroupBuyersVarargs(value: String*): Self = StObject.set(x, "interestGroupBuyers", js.Array(value*))
      
      inline def setPerBuyerExperimentGroupIds(value: StringDictionary[Double]): Self = StObject.set(x, "perBuyerExperimentGroupIds", value.asInstanceOf[js.Any])
      
      inline def setPerBuyerExperimentGroupIdsUndefined: Self = StObject.set(x, "perBuyerExperimentGroupIds", js.undefined)
      
      inline def setPerBuyerGroupLimits(value: StringDictionary[Double]): Self = StObject.set(x, "perBuyerGroupLimits", value.asInstanceOf[js.Any])
      
      inline def setPerBuyerGroupLimitsUndefined: Self = StObject.set(x, "perBuyerGroupLimits", js.undefined)
      
      inline def setPerBuyerSignals(value: StringDictionary[Any]): Self = StObject.set(x, "perBuyerSignals", value.asInstanceOf[js.Any])
      
      inline def setPerBuyerSignalsUndefined: Self = StObject.set(x, "perBuyerSignals", js.undefined)
      
      inline def setPerBuyerTimeouts(value: StringDictionary[Double]): Self = StObject.set(x, "perBuyerTimeouts", value.asInstanceOf[js.Any])
      
      inline def setPerBuyerTimeoutsUndefined: Self = StObject.set(x, "perBuyerTimeouts", js.undefined)
      
      inline def setSeller(value: String): Self = StObject.set(x, "seller", value.asInstanceOf[js.Any])
      
      inline def setSellerExperimentGroupId(value: Double): Self = StObject.set(x, "sellerExperimentGroupId", value.asInstanceOf[js.Any])
      
      inline def setSellerExperimentGroupIdUndefined: Self = StObject.set(x, "sellerExperimentGroupId", js.undefined)
      
      inline def setSellerSignals(value: Any): Self = StObject.set(x, "sellerSignals", value.asInstanceOf[js.Any])
      
      inline def setSellerSignalsUndefined: Self = StObject.set(x, "sellerSignals", js.undefined)
      
      inline def setSellerTimeout(value: Double): Self = StObject.set(x, "sellerTimeout", value.asInstanceOf[js.Any])
      
      inline def setSellerTimeoutUndefined: Self = StObject.set(x, "sellerTimeout", js.undefined)
      
      inline def setTrustedScoringSignalsUrl(value: String): Self = StObject.set(x, "trustedScoringSignalsUrl", value.asInstanceOf[js.Any])
      
      inline def setTrustedScoringSignalsUrlUndefined: Self = StObject.set(x, "trustedScoringSignalsUrl", js.undefined)
    }
  }
  
  trait ChangeCorrelator extends StObject {
    
    var changeCorrelator: Boolean
  }
  object ChangeCorrelator {
    
    inline def apply(changeCorrelator: Boolean): ChangeCorrelator = {
      val __obj = js.Dynamic.literal(changeCorrelator = changeCorrelator.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeCorrelator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeCorrelator] (val x: Self) extends AnyVal {
      
      inline def setChangeCorrelator(value: Boolean): Self = StObject.set(x, "changeCorrelator", value.asInstanceOf[js.Any])
    }
  }
  
  trait FetchMarginPercent extends StObject {
    
    var fetchMarginPercent: js.UndefOr[Double] = js.undefined
    
    var mobileScaling: js.UndefOr[Double] = js.undefined
    
    var renderMarginPercent: js.UndefOr[Double] = js.undefined
  }
  object FetchMarginPercent {
    
    inline def apply(): FetchMarginPercent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchMarginPercent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchMarginPercent] (val x: Self) extends AnyVal {
      
      inline def setFetchMarginPercent(value: Double): Self = StObject.set(x, "fetchMarginPercent", value.asInstanceOf[js.Any])
      
      inline def setFetchMarginPercentUndefined: Self = StObject.set(x, "fetchMarginPercent", js.undefined)
      
      inline def setMobileScaling(value: Double): Self = StObject.set(x, "mobileScaling", value.asInstanceOf[js.Any])
      
      inline def setMobileScalingUndefined: Self = StObject.set(x, "mobileScaling", js.undefined)
      
      inline def setRenderMarginPercent(value: Double): Self = StObject.set(x, "renderMarginPercent", value.asInstanceOf[js.Any])
      
      inline def setRenderMarginPercentUndefined: Self = StObject.set(x, "renderMarginPercent", js.undefined)
    }
  }
}
