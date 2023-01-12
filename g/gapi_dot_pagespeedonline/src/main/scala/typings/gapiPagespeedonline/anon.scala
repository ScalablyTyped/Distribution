package typings.gapiPagespeedonline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Args extends StObject {
    
    /**
      * List of arguments for the format string.
      */
    var args: js.Array[Type]
    
    /**
      * A localized format string with $N placeholders, where N is the 1-indexed argument number.
      */
    var format: String
  }
  object Args {
    
    inline def apply(args: js.Array[Type], format: String): Args = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Type]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Type*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
  
  trait AvoidBadRequests extends StObject {
    
    var AvoidBadRequests: GoogleApiPageSpeedOnlineRuleResource
    
    var AvoidCharsetInMetaTag: GoogleApiPageSpeedOnlineRuleResource
    
    var AvoidCssImport: GoogleApiPageSpeedOnlineRuleResource
    
    var AvoidLandingPageRedirects: GoogleApiPageSpeedOnlineRuleResource
    
    var AvoidLongRunningScripts: GoogleApiPageSpeedOnlineRuleResource
    
    var DeferParsingJavaScript: GoogleApiPageSpeedOnlineRuleResource
    
    var EnableGzipCompression: GoogleApiPageSpeedOnlineRuleResource
    
    var InlineSmallCss: GoogleApiPageSpeedOnlineRuleResource
    
    var InlineSmallJavaScript: GoogleApiPageSpeedOnlineRuleResource
    
    var LeverageBrowserCaching: GoogleApiPageSpeedOnlineRuleResource
    
    var MinifyCss: GoogleApiPageSpeedOnlineRuleResource
    
    var MinifyHTML: GoogleApiPageSpeedOnlineRuleResource
    
    var MinifyJavaScript: GoogleApiPageSpeedOnlineRuleResource
    
    var MinimizeRedirects: GoogleApiPageSpeedOnlineRuleResource
    
    var MinimizeRequestSize: GoogleApiPageSpeedOnlineRuleResource
    
    var OptimizeImages: GoogleApiPageSpeedOnlineRuleResource
    
    var OptimizeTheOrderOfStylesAndScripts: GoogleApiPageSpeedOnlineRuleResource
    
    var PreferAsyncResources: GoogleApiPageSpeedOnlineRuleResource
    
    var PutCssInTheDocumentHead: GoogleApiPageSpeedOnlineRuleResource
    
    var RemoveQueryStringsFromStaticResources: GoogleApiPageSpeedOnlineRuleResource
    
    var ServeResponseTime: GoogleApiPageSpeedOnlineRuleResource
    
    var ServerResourcesFromAConsistentUrl: GoogleApiPageSpeedOnlineRuleResource
    
    var ServerScaledImages: GoogleApiPageSpeedOnlineRuleResource
    
    var SpecifyACacheValidator: GoogleApiPageSpeedOnlineRuleResource
    
    var SpecifyAVaryAcceptEncodingHeader: GoogleApiPageSpeedOnlineRuleResource
    
    var SpecifyCharsetEarly: GoogleApiPageSpeedOnlineRuleResource
    
    var SpecifyImageDimensions: GoogleApiPageSpeedOnlineRuleResource
    
    var SpriteImages: GoogleApiPageSpeedOnlineRuleResource
  }
  object AvoidBadRequests {
    
    inline def apply(
      AvoidBadRequests: GoogleApiPageSpeedOnlineRuleResource,
      AvoidCharsetInMetaTag: GoogleApiPageSpeedOnlineRuleResource,
      AvoidCssImport: GoogleApiPageSpeedOnlineRuleResource,
      AvoidLandingPageRedirects: GoogleApiPageSpeedOnlineRuleResource,
      AvoidLongRunningScripts: GoogleApiPageSpeedOnlineRuleResource,
      DeferParsingJavaScript: GoogleApiPageSpeedOnlineRuleResource,
      EnableGzipCompression: GoogleApiPageSpeedOnlineRuleResource,
      InlineSmallCss: GoogleApiPageSpeedOnlineRuleResource,
      InlineSmallJavaScript: GoogleApiPageSpeedOnlineRuleResource,
      LeverageBrowserCaching: GoogleApiPageSpeedOnlineRuleResource,
      MinifyCss: GoogleApiPageSpeedOnlineRuleResource,
      MinifyHTML: GoogleApiPageSpeedOnlineRuleResource,
      MinifyJavaScript: GoogleApiPageSpeedOnlineRuleResource,
      MinimizeRedirects: GoogleApiPageSpeedOnlineRuleResource,
      MinimizeRequestSize: GoogleApiPageSpeedOnlineRuleResource,
      OptimizeImages: GoogleApiPageSpeedOnlineRuleResource,
      OptimizeTheOrderOfStylesAndScripts: GoogleApiPageSpeedOnlineRuleResource,
      PreferAsyncResources: GoogleApiPageSpeedOnlineRuleResource,
      PutCssInTheDocumentHead: GoogleApiPageSpeedOnlineRuleResource,
      RemoveQueryStringsFromStaticResources: GoogleApiPageSpeedOnlineRuleResource,
      ServeResponseTime: GoogleApiPageSpeedOnlineRuleResource,
      ServerResourcesFromAConsistentUrl: GoogleApiPageSpeedOnlineRuleResource,
      ServerScaledImages: GoogleApiPageSpeedOnlineRuleResource,
      SpecifyACacheValidator: GoogleApiPageSpeedOnlineRuleResource,
      SpecifyAVaryAcceptEncodingHeader: GoogleApiPageSpeedOnlineRuleResource,
      SpecifyCharsetEarly: GoogleApiPageSpeedOnlineRuleResource,
      SpecifyImageDimensions: GoogleApiPageSpeedOnlineRuleResource,
      SpriteImages: GoogleApiPageSpeedOnlineRuleResource
    ): AvoidBadRequests = {
      val __obj = js.Dynamic.literal(AvoidBadRequests = AvoidBadRequests.asInstanceOf[js.Any], AvoidCharsetInMetaTag = AvoidCharsetInMetaTag.asInstanceOf[js.Any], AvoidCssImport = AvoidCssImport.asInstanceOf[js.Any], AvoidLandingPageRedirects = AvoidLandingPageRedirects.asInstanceOf[js.Any], AvoidLongRunningScripts = AvoidLongRunningScripts.asInstanceOf[js.Any], DeferParsingJavaScript = DeferParsingJavaScript.asInstanceOf[js.Any], EnableGzipCompression = EnableGzipCompression.asInstanceOf[js.Any], InlineSmallCss = InlineSmallCss.asInstanceOf[js.Any], InlineSmallJavaScript = InlineSmallJavaScript.asInstanceOf[js.Any], LeverageBrowserCaching = LeverageBrowserCaching.asInstanceOf[js.Any], MinifyCss = MinifyCss.asInstanceOf[js.Any], MinifyHTML = MinifyHTML.asInstanceOf[js.Any], MinifyJavaScript = MinifyJavaScript.asInstanceOf[js.Any], MinimizeRedirects = MinimizeRedirects.asInstanceOf[js.Any], MinimizeRequestSize = MinimizeRequestSize.asInstanceOf[js.Any], OptimizeImages = OptimizeImages.asInstanceOf[js.Any], OptimizeTheOrderOfStylesAndScripts = OptimizeTheOrderOfStylesAndScripts.asInstanceOf[js.Any], PreferAsyncResources = PreferAsyncResources.asInstanceOf[js.Any], PutCssInTheDocumentHead = PutCssInTheDocumentHead.asInstanceOf[js.Any], RemoveQueryStringsFromStaticResources = RemoveQueryStringsFromStaticResources.asInstanceOf[js.Any], ServeResponseTime = ServeResponseTime.asInstanceOf[js.Any], ServerResourcesFromAConsistentUrl = ServerResourcesFromAConsistentUrl.asInstanceOf[js.Any], ServerScaledImages = ServerScaledImages.asInstanceOf[js.Any], SpecifyACacheValidator = SpecifyACacheValidator.asInstanceOf[js.Any], SpecifyAVaryAcceptEncodingHeader = SpecifyAVaryAcceptEncodingHeader.asInstanceOf[js.Any], SpecifyCharsetEarly = SpecifyCharsetEarly.asInstanceOf[js.Any], SpecifyImageDimensions = SpecifyImageDimensions.asInstanceOf[js.Any], SpriteImages = SpriteImages.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvoidBadRequests]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvoidBadRequests] (val x: Self) extends AnyVal {
      
      inline def setAvoidBadRequests(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "AvoidBadRequests", value.asInstanceOf[js.Any])
      
      inline def setAvoidCharsetInMetaTag(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "AvoidCharsetInMetaTag", value.asInstanceOf[js.Any])
      
      inline def setAvoidCssImport(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "AvoidCssImport", value.asInstanceOf[js.Any])
      
      inline def setAvoidLandingPageRedirects(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "AvoidLandingPageRedirects", value.asInstanceOf[js.Any])
      
      inline def setAvoidLongRunningScripts(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "AvoidLongRunningScripts", value.asInstanceOf[js.Any])
      
      inline def setDeferParsingJavaScript(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "DeferParsingJavaScript", value.asInstanceOf[js.Any])
      
      inline def setEnableGzipCompression(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "EnableGzipCompression", value.asInstanceOf[js.Any])
      
      inline def setInlineSmallCss(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "InlineSmallCss", value.asInstanceOf[js.Any])
      
      inline def setInlineSmallJavaScript(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "InlineSmallJavaScript", value.asInstanceOf[js.Any])
      
      inline def setLeverageBrowserCaching(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "LeverageBrowserCaching", value.asInstanceOf[js.Any])
      
      inline def setMinifyCss(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "MinifyCss", value.asInstanceOf[js.Any])
      
      inline def setMinifyHTML(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "MinifyHTML", value.asInstanceOf[js.Any])
      
      inline def setMinifyJavaScript(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "MinifyJavaScript", value.asInstanceOf[js.Any])
      
      inline def setMinimizeRedirects(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "MinimizeRedirects", value.asInstanceOf[js.Any])
      
      inline def setMinimizeRequestSize(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "MinimizeRequestSize", value.asInstanceOf[js.Any])
      
      inline def setOptimizeImages(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "OptimizeImages", value.asInstanceOf[js.Any])
      
      inline def setOptimizeTheOrderOfStylesAndScripts(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "OptimizeTheOrderOfStylesAndScripts", value.asInstanceOf[js.Any])
      
      inline def setPreferAsyncResources(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "PreferAsyncResources", value.asInstanceOf[js.Any])
      
      inline def setPutCssInTheDocumentHead(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "PutCssInTheDocumentHead", value.asInstanceOf[js.Any])
      
      inline def setRemoveQueryStringsFromStaticResources(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "RemoveQueryStringsFromStaticResources", value.asInstanceOf[js.Any])
      
      inline def setServeResponseTime(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "ServeResponseTime", value.asInstanceOf[js.Any])
      
      inline def setServerResourcesFromAConsistentUrl(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "ServerResourcesFromAConsistentUrl", value.asInstanceOf[js.Any])
      
      inline def setServerScaledImages(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "ServerScaledImages", value.asInstanceOf[js.Any])
      
      inline def setSpecifyACacheValidator(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "SpecifyACacheValidator", value.asInstanceOf[js.Any])
      
      inline def setSpecifyAVaryAcceptEncodingHeader(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "SpecifyAVaryAcceptEncodingHeader", value.asInstanceOf[js.Any])
      
      inline def setSpecifyCharsetEarly(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "SpecifyCharsetEarly", value.asInstanceOf[js.Any])
      
      inline def setSpecifyImageDimensions(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "SpecifyImageDimensions", value.asInstanceOf[js.Any])
      
      inline def setSpriteImages(value: GoogleApiPageSpeedOnlineRuleResource): Self = StObject.set(x, "SpriteImages", value.asInstanceOf[js.Any])
    }
  }
  
  trait CssResponsebytes extends StObject {
    
    /**
      * Number of uncompressed response bytes for CSS resources on the page.
      */
    var cssResponsebytes: String
    
    /**
      * Number of response bytes for Flash resources on the page.
      */
    var flashResponseBytes: String
    
    /**
      * Number of uncompressed response bytes for the main HTML document and all iframes on the page.
      */
    var htmlResponseBytes: String
    
    /**
      * Number of response bytes for image resources on the page.
      */
    var imageResponseBytes: String
    
    /**
      * Number of uncompressed response bytes for JS resources on the page.
      */
    var javascriptResponsebytes: String
    
    /**
      * Number of CSS resources referenced by the page.
      */
    var numberCssResources: Double
    
    /**
      * Number of unique hosts referenced by the page.
      */
    var numberHosts: Double
    
    /**
      * Number of JavaScript resources referenced by the page.
      */
    var numberJsResources: Double
    
    /**
      * Number of HTTP resources loaded by the page.
      */
    var numberResources: Double
    
    /**
      * Number of static (that is, cacheable) resources on the page.
      */
    var numberStaticResources: Double
    
    /**
      * Number of response bytes for other resources on the page.
      */
    var otherResponsebytes: String
    
    /**
      * Number of uncompressed response bytes for text resources on the page that aren't covered by other statistics; that is, non-HTML, non-script, non-CSS resources.
      */
    var textResponseBytes: String
    
    /**
      * Total size of all request bytes sent by the page.
      */
    var totalRequestBytes: String
  }
  object CssResponsebytes {
    
    inline def apply(
      cssResponsebytes: String,
      flashResponseBytes: String,
      htmlResponseBytes: String,
      imageResponseBytes: String,
      javascriptResponsebytes: String,
      numberCssResources: Double,
      numberHosts: Double,
      numberJsResources: Double,
      numberResources: Double,
      numberStaticResources: Double,
      otherResponsebytes: String,
      textResponseBytes: String,
      totalRequestBytes: String
    ): CssResponsebytes = {
      val __obj = js.Dynamic.literal(cssResponsebytes = cssResponsebytes.asInstanceOf[js.Any], flashResponseBytes = flashResponseBytes.asInstanceOf[js.Any], htmlResponseBytes = htmlResponseBytes.asInstanceOf[js.Any], imageResponseBytes = imageResponseBytes.asInstanceOf[js.Any], javascriptResponsebytes = javascriptResponsebytes.asInstanceOf[js.Any], numberCssResources = numberCssResources.asInstanceOf[js.Any], numberHosts = numberHosts.asInstanceOf[js.Any], numberJsResources = numberJsResources.asInstanceOf[js.Any], numberResources = numberResources.asInstanceOf[js.Any], numberStaticResources = numberStaticResources.asInstanceOf[js.Any], otherResponsebytes = otherResponsebytes.asInstanceOf[js.Any], textResponseBytes = textResponseBytes.asInstanceOf[js.Any], totalRequestBytes = totalRequestBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[CssResponsebytes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CssResponsebytes] (val x: Self) extends AnyVal {
      
      inline def setCssResponsebytes(value: String): Self = StObject.set(x, "cssResponsebytes", value.asInstanceOf[js.Any])
      
      inline def setFlashResponseBytes(value: String): Self = StObject.set(x, "flashResponseBytes", value.asInstanceOf[js.Any])
      
      inline def setHtmlResponseBytes(value: String): Self = StObject.set(x, "htmlResponseBytes", value.asInstanceOf[js.Any])
      
      inline def setImageResponseBytes(value: String): Self = StObject.set(x, "imageResponseBytes", value.asInstanceOf[js.Any])
      
      inline def setJavascriptResponsebytes(value: String): Self = StObject.set(x, "javascriptResponsebytes", value.asInstanceOf[js.Any])
      
      inline def setNumberCssResources(value: Double): Self = StObject.set(x, "numberCssResources", value.asInstanceOf[js.Any])
      
      inline def setNumberHosts(value: Double): Self = StObject.set(x, "numberHosts", value.asInstanceOf[js.Any])
      
      inline def setNumberJsResources(value: Double): Self = StObject.set(x, "numberJsResources", value.asInstanceOf[js.Any])
      
      inline def setNumberResources(value: Double): Self = StObject.set(x, "numberResources", value.asInstanceOf[js.Any])
      
      inline def setNumberStaticResources(value: Double): Self = StObject.set(x, "numberStaticResources", value.asInstanceOf[js.Any])
      
      inline def setOtherResponsebytes(value: String): Self = StObject.set(x, "otherResponsebytes", value.asInstanceOf[js.Any])
      
      inline def setTextResponseBytes(value: String): Self = StObject.set(x, "textResponseBytes", value.asInstanceOf[js.Any])
      
      inline def setTotalRequestBytes(value: String): Self = StObject.set(x, "totalRequestBytes", value.asInstanceOf[js.Any])
    }
  }
  
  trait Details extends StObject {
    
    /**
      * List of entries that provide additional details about a single URL. Optional.
      */
    var details: js.Array[Args]
    
    /**
      * A format string that gives information about the URL, and a list of arguments for that format string.
      */
    var result: Args
  }
  object Details {
    
    inline def apply(details: js.Array[Args], result: Args): Details = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Details]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Details] (val x: Self) extends AnyVal {
      
      inline def setDetails(value: js.Array[Args]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsVarargs(value: Args*): Self = StObject.set(x, "details", js.Array(value*))
      
      inline def setResult(value: Args): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fields extends StObject {
    
    /**
      * Selector specifying which fields to include in a partial response.
      */
    var fields: js.UndefOr[String] = js.undefined
    
    /**
      * The locale that results should be generated in.
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /**
      * The PageSpeed rules to run. Can be specified multiple times
      */
    var rule: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Indicates if binary data containing a screenshot should be included
      */
    var screenshot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The strategy to use when analyzing the page. Valid values are desktop and mobile.
      */
    var stategy: js.UndefOr[String] = js.undefined
    
    /**
      * The URL of the page for which the PageSpeed Insights API should generate results.
      */
    var url: String
  }
  object Fields {
    
    inline def apply(url: String): Fields = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setRule(value: js.Array[String]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      
      inline def setRuleVarargs(value: String*): Self = StObject.set(x, "rule", js.Array(value*))
      
      inline def setScreenshot(value: Boolean): Self = StObject.set(x, "screenshot", value.asInstanceOf[js.Any])
      
      inline def setScreenshotUndefined: Self = StObject.set(x, "screenshot", js.undefined)
      
      inline def setStategy(value: String): Self = StObject.set(x, "stategy", value.asInstanceOf[js.Any])
      
      inline def setStategyUndefined: Self = StObject.set(x, "stategy", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Header extends StObject {
    
    /**
      * Heading to be displayed with the list of URLs.
      */
    var header: Args
    
    /**
      * List of entries that provide information about URLs in the URL block. Optional.
      */
    var urls: js.Array[Details]
  }
  object Header {
    
    inline def apply(header: Args, urls: js.Array[Details]): Header = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
      
      inline def setHeader(value: Args): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setUrls(value: js.Array[Details]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsVarargs(value: Details*): Self = StObject.set(x, "urls", js.Array(value*))
    }
  }
  
  trait Locale extends StObject {
    
    /**
      * The locale of the formattedResults, such as en_US.
      */
    var locale: String
    
    /**
      * Dictionary of formatted rule results, with one entry for each PageSpeed rule instantiated and run by the server.
      */
    var ruleResults: AvoidBadRequests
  }
  object Locale {
    
    inline def apply(locale: String, ruleResults: AvoidBadRequests): Locale = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], ruleResults = ruleResults.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setRuleResults(value: AvoidBadRequests): Self = StObject.set(x, "ruleResults", value.asInstanceOf[js.Any])
    }
  }
  
  trait Major extends StObject {
    
    /**
      * The major version number of the PageSpeed SDK used to generate these results.
      */
    var major: Double
    
    /**
      * The minor version number of the PageSpeed SDK used to generate these results.
      */
    var minor: Double
  }
  object Major {
    
    inline def apply(major: Double, minor: Double): Major = {
      val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Major]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Major] (val x: Self) extends AnyVal {
      
      inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    /**
      * Type of argument. One of URL, STRING_LITERAL, INT_LITERAL, BYTES, or DURATION.
      */
    var `type`: String
    
    /**
      * Argument value, as a localized string.
      */
    var value: String
  }
  object Type {
    
    inline def apply(`type`: String, value: String): Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
