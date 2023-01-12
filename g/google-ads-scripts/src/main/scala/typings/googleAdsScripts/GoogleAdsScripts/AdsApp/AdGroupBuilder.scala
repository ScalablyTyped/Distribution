package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for an ad group under construction.
  *
  * Typical usage:
  *
  *      var adGroupBuilder = campaign.newAdGroupBuilder();
  *      var adGroupOperation = adGroupBuilder
  *         .withName("ad group name")
  *         .withStatus("PAUSED")
  *         .build();
  *      var adGroup = adGroupOperation.getResult();
  */
trait AdGroupBuilder
  extends StObject
     with Builder[AdGroupOperation] {
  
  /** Sets the Target CPA bid of the new ad group to the specified value. */
  def withCpa(cpa: Double): this.type
  
  /** Sets the max CPC bid of the new ad group to the specified value. */
  def withCpc(cpc: Double): this.type
  
  /** Sets the CPM bid of the new ad group to the specified value. */
  def withCpm(cpm: Double): this.type
  
  /** Sets the custom parameters of the new ad group to the specified value. */
  def withCustomParameters(customParameters: Record[String, String]): this.type
  
  /** Sets the final URL suffix of the new ad group to the specified value. */
  def withFinalUrlSuffix(suffix: String): this.type
  
  /** Sets the name of the new ad group to the specified value. */
  def withName(name: String): this.type
  
  /** Sets the status of the new ad group to the specified value. */
  def withStatus(status: String): this.type
  
  /** Sets the tracking template of the new ad group to the specified value. */
  def withTrackingTemplate(trackingTemplate: String): this.type
}
object AdGroupBuilder {
  
  inline def apply(
    build: () => AdGroupOperation,
    withCpa: Double => AdGroupBuilder,
    withCpc: Double => AdGroupBuilder,
    withCpm: Double => AdGroupBuilder,
    withCustomParameters: Record[String, String] => AdGroupBuilder,
    withFinalUrlSuffix: String => AdGroupBuilder,
    withName: String => AdGroupBuilder,
    withStatus: String => AdGroupBuilder,
    withTrackingTemplate: String => AdGroupBuilder
  ): AdGroupBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withCpa = js.Any.fromFunction1(withCpa), withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withFinalUrlSuffix = js.Any.fromFunction1(withFinalUrlSuffix), withName = js.Any.fromFunction1(withName), withStatus = js.Any.fromFunction1(withStatus), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[AdGroupBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdGroupBuilder] (val x: Self) extends AnyVal {
    
    inline def setWithCpa(value: Double => AdGroupBuilder): Self = StObject.set(x, "withCpa", js.Any.fromFunction1(value))
    
    inline def setWithCpc(value: Double => AdGroupBuilder): Self = StObject.set(x, "withCpc", js.Any.fromFunction1(value))
    
    inline def setWithCpm(value: Double => AdGroupBuilder): Self = StObject.set(x, "withCpm", js.Any.fromFunction1(value))
    
    inline def setWithCustomParameters(value: Record[String, String] => AdGroupBuilder): Self = StObject.set(x, "withCustomParameters", js.Any.fromFunction1(value))
    
    inline def setWithFinalUrlSuffix(value: String => AdGroupBuilder): Self = StObject.set(x, "withFinalUrlSuffix", js.Any.fromFunction1(value))
    
    inline def setWithName(value: String => AdGroupBuilder): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
    
    inline def setWithStatus(value: String => AdGroupBuilder): Self = StObject.set(x, "withStatus", js.Any.fromFunction1(value))
    
    inline def setWithTrackingTemplate(value: String => AdGroupBuilder): Self = StObject.set(x, "withTrackingTemplate", js.Any.fromFunction1(value))
  }
}
