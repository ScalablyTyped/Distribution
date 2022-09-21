package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1AppDetails extends StObject {
  
  /**
    * Output only. Android app information.
    */
  var androidAppInfo: js.UndefOr[SchemaGoogleChromeManagementV1AndroidAppInfo] = js.undefined
  
  /**
    * Output only. Unique store identifier for the item. Examples: "gmbmikajjgmnabiglmofipeabaddhgne" for the Save to Google Drive Chrome extension, "com.google.android.apps.docs" for the Google Drive Android app.
    */
  var appId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Chrome Web Store app information.
    */
  var chromeAppInfo: js.UndefOr[SchemaGoogleChromeManagementV1ChromeAppInfo] = js.undefined
  
  /**
    * Output only. App's description.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The uri for the detail page of the item.
    */
  var detailUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. App's display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. First published time.
    */
  var firstPublishTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Home page or Website uri.
    */
  var homepageUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A link to an image that can be used as an icon for the product.
    */
  var iconUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Indicates if the app has to be paid for OR has paid content.
    */
  var isPaidApp: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Latest published time.
    */
  var latestPublishTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Format: name=customers/{customer_id\}/apps/{chrome|android|web\}/{app_id\}@{version\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The URI pointing to the privacy policy of the app, if it was provided by the developer. Version-specific field that will only be set when the requested app version is found.
    */
  var privacyPolicyUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The publisher of the item.
    */
  var publisher: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Number of reviews received. Chrome Web Store review information will always be for the latest version of an app.
    */
  var reviewNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The rating of the app (on 5 stars). Chrome Web Store review information will always be for the latest version of an app.
    */
  var reviewRating: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. App version. A new revision is committed whenever a new version of the app is published.
    */
  var revisionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Information about a partial service error if applicable.
    */
  var serviceError: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
  
  /**
    * Output only. App type.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1AppDetails {
  
  inline def apply(): SchemaGoogleChromeManagementV1AppDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1AppDetails]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1AppDetails](x: Self) {
    
    inline def setAndroidAppInfo(value: SchemaGoogleChromeManagementV1AndroidAppInfo): Self = StObject.set(x, "androidAppInfo", value.asInstanceOf[js.Any])
    
    inline def setAndroidAppInfoUndefined: Self = StObject.set(x, "androidAppInfo", js.undefined)
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setChromeAppInfo(value: SchemaGoogleChromeManagementV1ChromeAppInfo): Self = StObject.set(x, "chromeAppInfo", value.asInstanceOf[js.Any])
    
    inline def setChromeAppInfoUndefined: Self = StObject.set(x, "chromeAppInfo", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetailUri(value: String): Self = StObject.set(x, "detailUri", value.asInstanceOf[js.Any])
    
    inline def setDetailUriNull: Self = StObject.set(x, "detailUri", null)
    
    inline def setDetailUriUndefined: Self = StObject.set(x, "detailUri", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFirstPublishTime(value: String): Self = StObject.set(x, "firstPublishTime", value.asInstanceOf[js.Any])
    
    inline def setFirstPublishTimeNull: Self = StObject.set(x, "firstPublishTime", null)
    
    inline def setFirstPublishTimeUndefined: Self = StObject.set(x, "firstPublishTime", js.undefined)
    
    inline def setHomepageUri(value: String): Self = StObject.set(x, "homepageUri", value.asInstanceOf[js.Any])
    
    inline def setHomepageUriNull: Self = StObject.set(x, "homepageUri", null)
    
    inline def setHomepageUriUndefined: Self = StObject.set(x, "homepageUri", js.undefined)
    
    inline def setIconUri(value: String): Self = StObject.set(x, "iconUri", value.asInstanceOf[js.Any])
    
    inline def setIconUriNull: Self = StObject.set(x, "iconUri", null)
    
    inline def setIconUriUndefined: Self = StObject.set(x, "iconUri", js.undefined)
    
    inline def setIsPaidApp(value: Boolean): Self = StObject.set(x, "isPaidApp", value.asInstanceOf[js.Any])
    
    inline def setIsPaidAppNull: Self = StObject.set(x, "isPaidApp", null)
    
    inline def setIsPaidAppUndefined: Self = StObject.set(x, "isPaidApp", js.undefined)
    
    inline def setLatestPublishTime(value: String): Self = StObject.set(x, "latestPublishTime", value.asInstanceOf[js.Any])
    
    inline def setLatestPublishTimeNull: Self = StObject.set(x, "latestPublishTime", null)
    
    inline def setLatestPublishTimeUndefined: Self = StObject.set(x, "latestPublishTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrivacyPolicyUri(value: String): Self = StObject.set(x, "privacyPolicyUri", value.asInstanceOf[js.Any])
    
    inline def setPrivacyPolicyUriNull: Self = StObject.set(x, "privacyPolicyUri", null)
    
    inline def setPrivacyPolicyUriUndefined: Self = StObject.set(x, "privacyPolicyUri", js.undefined)
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherNull: Self = StObject.set(x, "publisher", null)
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setReviewNumber(value: String): Self = StObject.set(x, "reviewNumber", value.asInstanceOf[js.Any])
    
    inline def setReviewNumberNull: Self = StObject.set(x, "reviewNumber", null)
    
    inline def setReviewNumberUndefined: Self = StObject.set(x, "reviewNumber", js.undefined)
    
    inline def setReviewRating(value: Double): Self = StObject.set(x, "reviewRating", value.asInstanceOf[js.Any])
    
    inline def setReviewRatingNull: Self = StObject.set(x, "reviewRating", null)
    
    inline def setReviewRatingUndefined: Self = StObject.set(x, "reviewRating", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdNull: Self = StObject.set(x, "revisionId", null)
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    inline def setServiceError(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "serviceError", value.asInstanceOf[js.Any])
    
    inline def setServiceErrorUndefined: Self = StObject.set(x, "serviceError", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
