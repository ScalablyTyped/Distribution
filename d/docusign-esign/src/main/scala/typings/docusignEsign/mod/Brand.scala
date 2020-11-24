package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Brand extends js.Object {
  
  /**
    * The name of the company associated with the brand.
    */
  var brandCompany: js.UndefOr[String] = js.native
  
  /**
    * The id of the brand.
    */
  var brandId: js.UndefOr[String] = js.native
  
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
  var brandLanguages: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The name of the brand.
    */
  var brandName: js.UndefOr[String] = js.native
  
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
  ] = js.native
  
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
  var defaultBrandLanguage: js.UndefOr[String] = js.native
  
  /**
    * Deprecated.
    */
  var emailContent: js.UndefOr[js.Array[/* Deprecated. */ BrandEmailContent]] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * When **true**, the `brandCompany` property is overriding the name of the company in the account settings.
    */
  var isOverridingCompanyName: js.UndefOr[Boolean] = js.native
  
  /**
    * When **true**, the sending brand is the default brand for sending new envelopes.
    */
  var isSendingDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * When **true**, the siging brand is the default brand for the signing experience.
    */
  var isSigningDefault: js.UndefOr[Boolean] = js.native
  
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
  ] = js.native
  
  /**
    * An array of `brandLink` objects that contain information about the links that the brand uses.
    */
  var links: js.UndefOr[js.Array[/* Information about a link that a brand uses. */ BrandLink]] = js.native
  
  /**
    * The URIs for retrieving the logos that are associated with the brand.
    */
  var logos: js.UndefOr[/* Information about the logos associated with the brand. */ BrandLogos] = js.native
  
  /**
    * An object containing the URLs for the four DocuSign master resource files that the brand uses for sending, signing, email messages, and captive (embedded) signing.
    * You can modify the default email messages and formats in these file to customize the user experience.
    *
    * **Note**: This object is returned only when the `resourceContentType` is `sending`, `signing`, `email`, or `signing_captive`.
    */
  var resources: js.UndefOr[BrandResourceUrls] = js.native
}
object Brand {
  
  @scala.inline
  def apply(): Brand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Brand]
  }
  
  @scala.inline
  implicit class BrandOps[Self <: Brand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBrandCompany(value: String): Self = this.set("brandCompany", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrandCompany: Self = this.set("brandCompany", js.undefined)
    
    @scala.inline
    def setBrandId(value: String): Self = this.set("brandId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrandId: Self = this.set("brandId", js.undefined)
    
    @scala.inline
    def setBrandLanguagesVarargs(value: String*): Self = this.set("brandLanguages", js.Array(value :_*))
    
    @scala.inline
    def setBrandLanguages(value: js.Array[String]): Self = this.set("brandLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrandLanguages: Self = this.set("brandLanguages", js.undefined)
    
    @scala.inline
    def setBrandName(value: String): Self = this.set("brandName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrandName: Self = this.set("brandName", js.undefined)
    
    @scala.inline
    def setColorsVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setDefaultBrandLanguage(value: String): Self = this.set("defaultBrandLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultBrandLanguage: Self = this.set("defaultBrandLanguage", js.undefined)
    
    @scala.inline
    def setEmailContentVarargs(value: (/* Deprecated. */ BrandEmailContent)*): Self = this.set("emailContent", js.Array(value :_*))
    
    @scala.inline
    def setEmailContent(value: js.Array[/* Deprecated. */ BrandEmailContent]): Self = this.set("emailContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailContent: Self = this.set("emailContent", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setIsOverridingCompanyName(value: Boolean): Self = this.set("isOverridingCompanyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOverridingCompanyName: Self = this.set("isOverridingCompanyName", js.undefined)
    
    @scala.inline
    def setIsSendingDefault(value: Boolean): Self = this.set("isSendingDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSendingDefault: Self = this.set("isSendingDefault", js.undefined)
    
    @scala.inline
    def setIsSigningDefault(value: Boolean): Self = this.set("isSigningDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSigningDefault: Self = this.set("isSigningDefault", js.undefined)
    
    @scala.inline
    def setLandingPagesVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = this.set("landingPages", js.Array(value :_*))
    
    @scala.inline
    def setLandingPages(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = this.set("landingPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLandingPages: Self = this.set("landingPages", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: (/* Information about a link that a brand uses. */ BrandLink)*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[/* Information about a link that a brand uses. */ BrandLink]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setLogos(value: /* Information about the logos associated with the brand. */ BrandLogos): Self = this.set("logos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogos: Self = this.set("logos", js.undefined)
    
    @scala.inline
    def setResources(value: BrandResourceUrls): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
  }
}
