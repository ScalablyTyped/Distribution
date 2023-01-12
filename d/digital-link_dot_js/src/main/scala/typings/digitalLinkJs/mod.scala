package typings.digitalLinkJs

import typings.digitalLinkJs.anon.Match
import typings.digitalLinkJs.anon.RecordRuleNamestring
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait DigitalLink extends StObject {
    
    def getAttribute(key: String): js.UndefOr[String]
    
    def getAttributes(): Record[String, String]
    
    def getDomain(): String
    
    def getIdentifier(): Record[String, String]
    
    def getKeyQualifier(key: String): js.UndefOr[String]
    
    def getKeyQualifiers(): Record[String, String]
    
    def getKeyQualifiersOrder(): js.Array[String]
    
    def getSortKeyQualifiers(): Boolean
    
    def getValidationTrace(): ValidationTrace
    
    def isValid(): Boolean
    
    /**
      * Set an attribute of the Digital Link
      *
      * @param key - The attribute code
      * @param value - The attribute value
      * @returns the dl instance
      */
    def setAttribute(key: String, value: String): this.type
    
    /**
      * Set the domain of the Digital Link
      *
      * @param value - The domain
      * @returns the dl instance
      */
    def setDomain(value: String): this.type
    
    /**
      * Set the identifier of the Digital Link
      *
      * @param key - The identifier code
      * @param value - The identifier value
      * @returns the dl instance
      */
    def setIdentifier(key: String, value: String): this.type
    
    /**
      * Set a key qualifier of the Digital Link
      *
      * @param key - The key qualifier code
      * @param value - The key qualifier value
      * @returns the dl instance
      */
    def setKeyQualifier(key: String, value: String): this.type
    
    /**
      * Setter for the field keyQualifiersOrder
      *
      * @param value - The list containing all the key qualifiers in the desired order
      * @returns the dl instance
      */
    def setKeyQualifiersOrder(value: js.Array[String]): this.type
    
    /**
      * Setter for the field sortKeyQualifiers
      * If you set it to true, the key qualifiers will be sorted automatically following the grammar
      * Otherwise, they won't
      *
      * @param value
      * @returns the dl instance
      */
    def setSortKeyQualifiers(value: Boolean): this.type
    
    def toCompressedWebUriString(): String
    
    def toJsonString(): String
    
    def toWebUriString(): String
  }
  object DigitalLink {
    
    @JSImport("digital-link.js", "DigitalLink")
    @js.native
    def apply(): DigitalLink = js.native
    @JSImport("digital-link.js", "DigitalLink")
    @js.native
    def apply(input: String): DigitalLink = js.native
    @JSImport("digital-link.js", "DigitalLink")
    @js.native
    def apply(input: DigitalLinkInput): DigitalLink = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DigitalLink] (val x: Self) extends AnyVal {
      
      inline def setGetAttribute(value: String => js.UndefOr[String]): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetAttributes(value: () => Record[String, String]): Self = StObject.set(x, "getAttributes", js.Any.fromFunction0(value))
      
      inline def setGetDomain(value: () => String): Self = StObject.set(x, "getDomain", js.Any.fromFunction0(value))
      
      inline def setGetIdentifier(value: () => Record[String, String]): Self = StObject.set(x, "getIdentifier", js.Any.fromFunction0(value))
      
      inline def setGetKeyQualifier(value: String => js.UndefOr[String]): Self = StObject.set(x, "getKeyQualifier", js.Any.fromFunction1(value))
      
      inline def setGetKeyQualifiers(value: () => Record[String, String]): Self = StObject.set(x, "getKeyQualifiers", js.Any.fromFunction0(value))
      
      inline def setGetKeyQualifiersOrder(value: () => js.Array[String]): Self = StObject.set(x, "getKeyQualifiersOrder", js.Any.fromFunction0(value))
      
      inline def setGetSortKeyQualifiers(value: () => Boolean): Self = StObject.set(x, "getSortKeyQualifiers", js.Any.fromFunction0(value))
      
      inline def setGetValidationTrace(value: () => ValidationTrace): Self = StObject.set(x, "getValidationTrace", js.Any.fromFunction0(value))
      
      inline def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
      
      inline def setSetAttribute(value: (String, String) => DigitalLink): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
      
      inline def setSetDomain(value: String => DigitalLink): Self = StObject.set(x, "setDomain", js.Any.fromFunction1(value))
      
      inline def setSetIdentifier(value: (String, String) => DigitalLink): Self = StObject.set(x, "setIdentifier", js.Any.fromFunction2(value))
      
      inline def setSetKeyQualifier(value: (String, String) => DigitalLink): Self = StObject.set(x, "setKeyQualifier", js.Any.fromFunction2(value))
      
      inline def setSetKeyQualifiersOrder(value: js.Array[String] => DigitalLink): Self = StObject.set(x, "setKeyQualifiersOrder", js.Any.fromFunction1(value))
      
      inline def setSetSortKeyQualifiers(value: Boolean => DigitalLink): Self = StObject.set(x, "setSortKeyQualifiers", js.Any.fromFunction1(value))
      
      inline def setToCompressedWebUriString(value: () => String): Self = StObject.set(x, "toCompressedWebUriString", js.Any.fromFunction0(value))
      
      inline def setToJsonString(value: () => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction0(value))
      
      inline def setToWebUriString(value: () => String): Self = StObject.set(x, "toWebUriString", js.Any.fromFunction0(value))
    }
  }
  
  object Utils {
    
    @JSImport("digital-link.js", "Utils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Individual parser rules that can be run with `testRule()`.
      */
    @JSImport("digital-link.js", "Utils.Rules")
    @js.native
    def Rules: RecordRuleNamestring = js.native
    inline def Rules_=(x: RecordRuleNamestring): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rules")(x.asInstanceOf[js.Any])
    
    /**
      * Use GS1DigitalLinkToolkit to compress a URI string.
      *
      * @param uri - The URI to compress.
      * @param [useOptimisations] - Set to false to disable optimisations.
      * @param [compressOtherKeyValuePairs] - Set to false to disable compression of other
      *                                                 key-value pairs.
      * @returns The equivalent compressed URI.
      */
    inline def compressWebUri(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compressWebUri")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def compressWebUri(uri: String, useOptimisations: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compressWebUri")(uri.asInstanceOf[js.Any], useOptimisations.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def compressWebUri(uri: String, useOptimisations: Boolean, compressOtherKeyValuePairs: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compressWebUri")(uri.asInstanceOf[js.Any], useOptimisations.asInstanceOf[js.Any], compressOtherKeyValuePairs.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def compressWebUri(uri: String, useOptimisations: Unit, compressOtherKeyValuePairs: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compressWebUri")(uri.asInstanceOf[js.Any], useOptimisations.asInstanceOf[js.Any], compressOtherKeyValuePairs.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Use GS1DigitalLinkToolkit to decompress a URI string.
      *
      * @param uri - The URI to decompress.
      * @param [useShortText] - Set to true to use short AI names, eg. 'gtin' instead of '01'.
      * @returns The equivalent decompressed URI.
      */
    inline def decompressWebUri(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decompressWebUri")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Generate the complete HTML fragment provided by apglib for parsing results.
      *
      * @param inputStr - The input URL to generate parser results for.
      * @returns HTML string representing the results of the validation.
      */
    inline def generateResultsHtml(inputStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateResultsHtml")(inputStr.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Generate the stats HTML fragment provided by apglib.
      *
      * @param inputStr - The input URL to generate parser stats for.
      * @returns HTML string representing the stats of the validation.
      */
    inline def generateStatsHtml(inputStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateStatsHtml")(inputStr.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Generate the trace HTML fragment provided by apglib.
      *
      * @param inputStr - The input URL to generate parser trace for.
      * @returns HTML string representing the trace steps of the validation.
      */
    inline def generateTraceHtml(inputStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateTraceHtml")(inputStr.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Returns the index of the identifier code in the segment list passed as a parameter
      * If the url is https://example.com/some/01/other/path/info/01/01234567890128/21/12345?example=true
      * segment will be [some,01,other,path,info,01,01234567890128,21,12345]
      * And it will return 5. (the second '01' is the identifier code)
      *
      * @param segments - The list of the url path element
      * @returns the position of the indentifier in the array (-1 if it there is not any identifier).
      */
    inline def getIdentifierCodeIndex(segments: js.Array[String]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getIdentifierCodeIndex")(segments.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Detect whether a string is a compressed URI or not.
      * The GS1DigitalLinkToolkit returns one of three strings based on if the input looks compressed:
      *   "uncompressed GS1 Digital Link"
      *   "partially compressed GS1 Digital Link"
      *   "fully compressed GS1 Digital Link"
      *
      * Note: this function includes the result's validity, meaning only valid compressed URIs,
      * are supported. Since we cannot compress invalid URIs, this is acceptable.
      *
      * @param uri - The URI.
      * @returns true if the URI is valid and looks compressed, false otherwise.
      */
    inline def isCompressedWebUri(uri: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCompressedWebUri")(uri.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * if the domain has a custom path (ex : https://example.com/path/) it returns the domain without the custom path
      * (ex : https://example.com/)
      * Otherwise, it returns the parameter
      *
      * @param webUriString - The Web URI string (you can get it with dl.toWebUriString())
      * @param domain - The domain of the Digital Link (ex : https://example.com/with/custom/path/ or
      * https://example.com/)
      */
    inline def removeCustomPath(webUriString: String, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCustomPath")(webUriString.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Test a single parser rule for a given value, such as a GTIN.
      * Available rules are found in `Rules` object of this library.
      *
      * @param rule - A rule from the `Rules` object.
      * @param value - The value to validate.
      * @returns true if the value passes against the rule.
      */
    inline def testRule(rule: String, value: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testRule")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  trait DigitalLinkInput extends StObject {
    
    var attributes: js.UndefOr[Record[String, String]] = js.undefined
    
    var domain: String
    
    var identifier: Record[String, String]
    
    var keyQualifiers: js.UndefOr[Record[String, String]] = js.undefined
    
    var keyQualifiersOrder: js.UndefOr[js.Array[String]] = js.undefined
    
    var sortKeyQualifiers: js.UndefOr[Boolean] = js.undefined
  }
  object DigitalLinkInput {
    
    inline def apply(domain: String, identifier: Record[String, String]): DigitalLinkInput = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[DigitalLinkInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DigitalLinkInput] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setIdentifier(value: Record[String, String]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setKeyQualifiers(value: Record[String, String]): Self = StObject.set(x, "keyQualifiers", value.asInstanceOf[js.Any])
      
      inline def setKeyQualifiersOrder(value: js.Array[String]): Self = StObject.set(x, "keyQualifiersOrder", value.asInstanceOf[js.Any])
      
      inline def setKeyQualifiersOrderUndefined: Self = StObject.set(x, "keyQualifiersOrder", js.undefined)
      
      inline def setKeyQualifiersOrderVarargs(value: String*): Self = StObject.set(x, "keyQualifiersOrder", js.Array(value*))
      
      inline def setKeyQualifiersUndefined: Self = StObject.set(x, "keyQualifiers", js.undefined)
      
      inline def setSortKeyQualifiers(value: Boolean): Self = StObject.set(x, "sortKeyQualifiers", value.asInstanceOf[js.Any])
      
      inline def setSortKeyQualifiersUndefined: Self = StObject.set(x, "sortKeyQualifiers", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.digitalLinkJs.digitalLinkJsStrings.gtin
    - typings.digitalLinkJs.digitalLinkJsStrings.itip
    - typings.digitalLinkJs.digitalLinkJsStrings.gmn
    - typings.digitalLinkJs.digitalLinkJsStrings.cpid
    - typings.digitalLinkJs.digitalLinkJsStrings.shipTo
    - typings.digitalLinkJs.digitalLinkJsStrings.billTo
    - typings.digitalLinkJs.digitalLinkJsStrings.purchasedFrom
    - typings.digitalLinkJs.digitalLinkJsStrings.shipFor
    - typings.digitalLinkJs.digitalLinkJsStrings.gln
    - typings.digitalLinkJs.digitalLinkJsStrings.partyGln
    - typings.digitalLinkJs.digitalLinkJsStrings.payTo
    - typings.digitalLinkJs.digitalLinkJsStrings.glnProd
    - typings.digitalLinkJs.digitalLinkJsStrings.gsrnp
    - typings.digitalLinkJs.digitalLinkJsStrings.gsrn
    - typings.digitalLinkJs.digitalLinkJsStrings.gcn
    - typings.digitalLinkJs.digitalLinkJsStrings.sscc
    - typings.digitalLinkJs.digitalLinkJsStrings.gdti
    - typings.digitalLinkJs.digitalLinkJsStrings.ginc
    - typings.digitalLinkJs.digitalLinkJsStrings.gsin
    - typings.digitalLinkJs.digitalLinkJsStrings.grai
    - typings.digitalLinkJs.digitalLinkJsStrings.giai
    - typings.digitalLinkJs.digitalLinkJsStrings.cpv
    - typings.digitalLinkJs.digitalLinkJsStrings.lot
    - typings.digitalLinkJs.digitalLinkJsStrings.ser
    - typings.digitalLinkJs.digitalLinkJsStrings.cpsn
    - typings.digitalLinkJs.digitalLinkJsStrings.glnx
    - typings.digitalLinkJs.digitalLinkJsStrings.refno
    - typings.digitalLinkJs.digitalLinkJsStrings.srin
    - typings.digitalLinkJs.digitalLinkJsStrings.extensionParameter
    - typings.digitalLinkJs.digitalLinkJsStrings.customGS1webURI
    - typings.digitalLinkJs.digitalLinkJsStrings.canonicalGS1webURI
  */
  trait RuleName extends StObject
  object RuleName {
    
    inline def billTo: typings.digitalLinkJs.digitalLinkJsStrings.billTo = "billTo".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.billTo]
    
    inline def canonicalGS1webURI: typings.digitalLinkJs.digitalLinkJsStrings.canonicalGS1webURI = "canonicalGS1webURI".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.canonicalGS1webURI]
    
    inline def cpid: typings.digitalLinkJs.digitalLinkJsStrings.cpid = "cpid".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.cpid]
    
    inline def cpsn: typings.digitalLinkJs.digitalLinkJsStrings.cpsn = "cpsn".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.cpsn]
    
    inline def cpv: typings.digitalLinkJs.digitalLinkJsStrings.cpv = "cpv".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.cpv]
    
    inline def customGS1webURI: typings.digitalLinkJs.digitalLinkJsStrings.customGS1webURI = "customGS1webURI".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.customGS1webURI]
    
    inline def extensionParameter: typings.digitalLinkJs.digitalLinkJsStrings.extensionParameter = "extensionParameter".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.extensionParameter]
    
    inline def gcn: typings.digitalLinkJs.digitalLinkJsStrings.gcn = "gcn".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.gcn]
    
    inline def gdti: typings.digitalLinkJs.digitalLinkJsStrings.gdti = "gdti".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.gdti]
    
    inline def giai: typings.digitalLinkJs.digitalLinkJsStrings.giai = "giai".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.giai]
    
    inline def ginc: typings.digitalLinkJs.digitalLinkJsStrings.ginc = "ginc".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.ginc]
    
    inline def gln: typings.digitalLinkJs.digitalLinkJsStrings.gln = "gln".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.gln]
    
    inline def glnProd: typings.digitalLinkJs.digitalLinkJsStrings.glnProd = "glnProd".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.glnProd]
    
    inline def glnx: typings.digitalLinkJs.digitalLinkJsStrings.glnx = "glnx".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.glnx]
    
    inline def gmn: typings.digitalLinkJs.digitalLinkJsStrings.gmn = "gmn".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.gmn]
    
    inline def grai: typings.digitalLinkJs.digitalLinkJsStrings.grai = "grai".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.grai]
    
    inline def gsin: typings.digitalLinkJs.digitalLinkJsStrings.gsin = "gsin".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.gsin]
    
    inline def gsrn: typings.digitalLinkJs.digitalLinkJsStrings.gsrn = "gsrn".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.gsrn]
    
    inline def gsrnp: typings.digitalLinkJs.digitalLinkJsStrings.gsrnp = "gsrnp".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.gsrnp]
    
    inline def gtin: typings.digitalLinkJs.digitalLinkJsStrings.gtin = "gtin".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.gtin]
    
    inline def itip: typings.digitalLinkJs.digitalLinkJsStrings.itip = "itip".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.itip]
    
    inline def lot: typings.digitalLinkJs.digitalLinkJsStrings.lot = "lot".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.lot]
    
    inline def partyGln: typings.digitalLinkJs.digitalLinkJsStrings.partyGln = "partyGln".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.partyGln]
    
    inline def payTo: typings.digitalLinkJs.digitalLinkJsStrings.payTo = "payTo".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.payTo]
    
    inline def purchasedFrom: typings.digitalLinkJs.digitalLinkJsStrings.purchasedFrom = "purchasedFrom".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.purchasedFrom]
    
    inline def refno: typings.digitalLinkJs.digitalLinkJsStrings.refno = "refno".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.refno]
    
    inline def ser: typings.digitalLinkJs.digitalLinkJsStrings.ser = "ser".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.ser]
    
    inline def shipFor: typings.digitalLinkJs.digitalLinkJsStrings.shipFor = "shipFor".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.shipFor]
    
    inline def shipTo: typings.digitalLinkJs.digitalLinkJsStrings.shipTo = "shipTo".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.shipTo]
    
    inline def srin: typings.digitalLinkJs.digitalLinkJsStrings.srin = "srin".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.srin]
    
    inline def sscc: typings.digitalLinkJs.digitalLinkJsStrings.sscc = "sscc".asInstanceOf[typings.digitalLinkJs.digitalLinkJsStrings.sscc]
  }
  
  trait ValidationTrace extends StObject {
    
    var success: Boolean
    
    var trace: js.Array[Match]
  }
  object ValidationTrace {
    
    inline def apply(success: Boolean, trace: js.Array[Match]): ValidationTrace = {
      val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationTrace]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidationTrace] (val x: Self) extends AnyVal {
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setTrace(value: js.Array[Match]): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setTraceVarargs(value: Match*): Self = StObject.set(x, "trace", js.Array(value*))
    }
  }
}
