package typings.googlePublisherTag.googletag

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the namespace that GPT uses for enum types.
  */
object enums {
  
  @js.native
  sealed trait OutOfPageFormat extends StObject
  /**
    * Out-of-page formats supported by GPT.
    *
    * @see {@link defineOutOfPageSlot}
    */
  @JSGlobal("googletag.enums.OutOfPageFormat")
  @js.native
  object OutOfPageFormat extends StObject {
    
    /** Anchor format where slot sticks to the bottom of the viewport. */
    @js.native
    sealed trait BOTTOM_ANCHOR
      extends StObject
         with OutOfPageFormat
    
    /** Web interstitial creative format. */
    @js.native
    sealed trait INTERSTITIAL
      extends StObject
         with OutOfPageFormat
    
    /** Rewarded format. */
    @js.native
    sealed trait REWARDED
      extends StObject
         with OutOfPageFormat
    
    /** Anchor format where slot sticks to the top of the viewport. */
    @js.native
    sealed trait TOP_ANCHOR
      extends StObject
         with OutOfPageFormat
  }
  
  @js.native
  sealed trait TrafficSource extends StObject
  /**
    * [Traffic sources](https://support.google.com/admanager/answer/11233407)
    * supported by GPT.
    *
    * @see {@link PrivacySettingsConfig.trafficSource}
    */
  @JSGlobal("googletag.enums.TrafficSource")
  @js.native
  object TrafficSource extends StObject {
    
    /** Direct URL entry, site search, or app download. */
    @js.native
    sealed trait ORGANIC
      extends StObject
         with TrafficSource
    
    /**
      * Traffic redirected from properties other than owned (acquired or otherwise
      * incentivized activity).
      */
    @js.native
    sealed trait PURCHASED
      extends StObject
         with TrafficSource
  }
}
