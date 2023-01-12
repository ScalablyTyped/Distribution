package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brand extends StObject {
  
  /**
    * The name of the company associated with the brand.
    */
  var brandCompany: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the brand.
    */
  var brandId: js.UndefOr[String] = js.undefined
  
  /**
    * An array of two-letter codes for the languages that you want to use with the brand. The supported languages are:
    *
    * - Arabic (`ar`)
    * - Armenian (`hy`)
    * - Bahasa Indonesia (`id`)
    * - Bahasa Malay (`ms`)
    * - Bulgarian (`bg`)
    * - Chinese Simplified (`zh_CN`)
    * - Chinese Traditional (`zh_TW`)
    * - Croatian (`hr`)
    * - Czech (`cs`)
    * - Danish (`da`)
    * - Dutch (`nl`)
    * - English UK (`en_GB`)
    * - English US (`en`)
    * - Estonian (`et`)
    * - Farsi (`fa`)
    * - Finnish (`fi`)
    * - French (`fr`)
    * - French Canada (`fr_CA`)
    * - German (`de`)
    * - Greek (`el`)
    * - Hebrew (`he`)
    * - Hindi (`hi`)
    * - Hungarian (`hu`)
    * - Italian (`it`)
    * - Japanese (`ja`)
    * - Korean (`ko`)
    * - Latvian (`lv`)
    * - Lithuanian (`lt`)
    * - Norwegian (`no`)
    * - Polish (`pl`)
    * - Portuguese (`pt`)
    * - Portuguese Brasil (`pt_BR`)
    * - Romanian (`ro`)
    * - Russian (`ru`)
    * - Serbian (`sr`)
    * - Slovak (`sk`)
    * - Slovenian (`sl`)
    * - Spanish (`es`)
    * - Spanish Latin America (`es_MX`)
    * - Swedish (`sv`)
    * - Thai (`th`)
    * - Turkish (`tr`)
    * - Ukranian (`uk`)
    * - Vietnamese (`vi`)
    */
  var brandLanguages: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The name of the brand.
    */
  var brandName: js.UndefOr[String] = js.undefined
  
  /**
    * An array of name-value pairs specifying the colors that the brand uses for the following elements:
    *
    * - Button background
    * - Button text
    * - Header background
    * - Header text
    */
  var colors: js.UndefOr[
    js.Array[
      /* A name-value pair that describes an item and provides a value for the item. */ NameValue
    ]
  ] = js.undefined
  
  /**
    * The two-letter code for the language that you want to use as the brand default. The supported languages are:
    *
    * - Arabic (`ar`)
    * - Armenian (`hy`)
    * - Bahasa Indonesia (`id`)
    * - Bahasa Malay (`ms`)
    * - Bulgarian (`bg`)
    * - Chinese Simplified (`zh_CN`)
    * - Chinese Traditional (`zh_TW`)
    * - Croatian (`hr`)
    * - Czech (`cs`)
    * - Danish (`da`)
    * - Dutch (`nl`)
    * - English UK (`en_GB`)
    * - English US (`en`)
    * - Estonian (`et`)
    * - Farsi (`fa`)
    * - Finnish (`fi`)
    * - French (`fr`)
    * - French Canada (`fr_CA`)
    * - German (`de`)
    * - Greek (`el`)
    * - Hebrew (`he`)
    * - Hindi (`hi`)
    * - Hungarian (`hu`)
    * - Italian (`it`)
    * - Japanese (`ja`)
    * - Korean (`ko`)
    * - Latvian (`lv`)
    * - Lithuanian (`lt`)
    * - Norwegian (`no`)
    * - Polish (`pl`)
    * - Portuguese (`pt`)
    * - Portuguese Brasil (`pt_BR`)
    * - Romanian (`ro`)
    * - Russian (`ru`)
    * - Serbian (`sr`)
    * - Slovak (`sk`)
    * - Slovenian (`sl`)
    * - Spanish (`es`)
    * - Spanish Latin America (`es_MX`)
    * - Swedish (`sv`)
    * - Thai (`th`)
    * - Turkish (`tr`)
    * - Ukranian (`uk`)
    * - Vietnamese (`vi`)
    */
  var defaultBrandLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated.
    */
  var emailContent: js.UndefOr[js.Array[/* Deprecated. */ BrandEmailContent]] = js.undefined
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * When **true**, the `brandCompany` property is overriding the name of the company in the account settings.
    */
  var isOverridingCompanyName: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When **true**, the sending brand is the default brand for sending new envelopes.
    */
  var isSendingDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When **true**, the siging brand is the default brand for the signing experience.
    */
  var isSigningDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of name/value pairs specifying the pages to which the user is redirected after the following events occur:
    *
    * - Signing Completed
    * - Viewed Exit
    * - Finish Later
    * - Decline
    * - Session Timeout
    * - Authentication Failure
    *
    * If you do not specify landing pages, the DocuSign default pages are used.
    */
  var landingPages: js.UndefOr[
    js.Array[
      /* A name-value pair that describes an item and provides a value for the item. */ NameValue
    ]
  ] = js.undefined
  
  /**
    * An array of `brandLink` objects that contain information about the links that the brand uses.
    */
  var links: js.UndefOr[js.Array[/* Information about a link that a brand uses. */ BrandLink]] = js.undefined
  
  /**
    * The URIs for retrieving the logos that are associated with the brand.
    */
  var logos: js.UndefOr[/* Information about the logos associated with the brand. */ BrandLogos] = js.undefined
  
  /**
    * An object containing the URLs for the four DocuSign master resource files that the brand uses for sending, signing, email messages, and captive (embedded) signing.
    * You can modify the default email messages and formats in these file to customize the user experience.
    *
    * **Note**: This object is returned only when the `resourceContentType` is `sending`, `signing`, `email`, or `signing_captive`.
    */
  var resources: js.UndefOr[BrandResourceUrls] = js.undefined
}
object Brand {
  
  inline def apply(): Brand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Brand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Brand] (val x: Self) extends AnyVal {
    
    inline def setBrandCompany(value: String): Self = StObject.set(x, "brandCompany", value.asInstanceOf[js.Any])
    
    inline def setBrandCompanyUndefined: Self = StObject.set(x, "brandCompany", js.undefined)
    
    inline def setBrandId(value: String): Self = StObject.set(x, "brandId", value.asInstanceOf[js.Any])
    
    inline def setBrandIdUndefined: Self = StObject.set(x, "brandId", js.undefined)
    
    inline def setBrandLanguages(value: js.Array[String]): Self = StObject.set(x, "brandLanguages", value.asInstanceOf[js.Any])
    
    inline def setBrandLanguagesUndefined: Self = StObject.set(x, "brandLanguages", js.undefined)
    
    inline def setBrandLanguagesVarargs(value: String*): Self = StObject.set(x, "brandLanguages", js.Array(value*))
    
    inline def setBrandName(value: String): Self = StObject.set(x, "brandName", value.asInstanceOf[js.Any])
    
    inline def setBrandNameUndefined: Self = StObject.set(x, "brandName", js.undefined)
    
    inline def setColors(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setDefaultBrandLanguage(value: String): Self = StObject.set(x, "defaultBrandLanguage", value.asInstanceOf[js.Any])
    
    inline def setDefaultBrandLanguageUndefined: Self = StObject.set(x, "defaultBrandLanguage", js.undefined)
    
    inline def setEmailContent(value: js.Array[/* Deprecated. */ BrandEmailContent]): Self = StObject.set(x, "emailContent", value.asInstanceOf[js.Any])
    
    inline def setEmailContentUndefined: Self = StObject.set(x, "emailContent", js.undefined)
    
    inline def setEmailContentVarargs(value: (/* Deprecated. */ BrandEmailContent)*): Self = StObject.set(x, "emailContent", js.Array(value*))
    
    inline def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setIsOverridingCompanyName(value: Boolean): Self = StObject.set(x, "isOverridingCompanyName", value.asInstanceOf[js.Any])
    
    inline def setIsOverridingCompanyNameUndefined: Self = StObject.set(x, "isOverridingCompanyName", js.undefined)
    
    inline def setIsSendingDefault(value: Boolean): Self = StObject.set(x, "isSendingDefault", value.asInstanceOf[js.Any])
    
    inline def setIsSendingDefaultUndefined: Self = StObject.set(x, "isSendingDefault", js.undefined)
    
    inline def setIsSigningDefault(value: Boolean): Self = StObject.set(x, "isSigningDefault", value.asInstanceOf[js.Any])
    
    inline def setIsSigningDefaultUndefined: Self = StObject.set(x, "isSigningDefault", js.undefined)
    
    inline def setLandingPages(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = StObject.set(x, "landingPages", value.asInstanceOf[js.Any])
    
    inline def setLandingPagesUndefined: Self = StObject.set(x, "landingPages", js.undefined)
    
    inline def setLandingPagesVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = StObject.set(x, "landingPages", js.Array(value*))
    
    inline def setLinks(value: js.Array[/* Information about a link that a brand uses. */ BrandLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: (/* Information about a link that a brand uses. */ BrandLink)*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setLogos(value: /* Information about the logos associated with the brand. */ BrandLogos): Self = StObject.set(x, "logos", value.asInstanceOf[js.Any])
    
    inline def setLogosUndefined: Self = StObject.set(x, "logos", js.undefined)
    
    inline def setResources(value: BrandResourceUrls): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
  }
}
