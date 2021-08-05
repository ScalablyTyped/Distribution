package typings.googleAppsScript.GoogleAppsScript

import org.scalablytyped.runtime.StringDictionary
import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import typings.googleAppsScript.GoogleAppsScript.Base.BlobSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HTML {
  
  @js.native
  sealed trait SandboxMode extends StObject
  /**
    * An enum representing the sandbox modes that can be used for client-side HtmlService
    * scripts. These values can be accessed from HtmlService.SandboxMode, and set by calling
    * HtmlOutput.setSandboxMode(mode).
    *
    * The NATIVE and EMULATED modes were deprecated on October 13, 2015 and both are now sunset. Only
    * IFRAME mode is now supported.
    *
    * To protect users from being served malicious HTML or JavaScript, client-side code served from
    * HTML service executes in a security sandbox that imposes restrictions on the code. The method
    * HtmlOutput.setSandboxMode(mode) previously allowed script authors to choose
    * between different versions of the sandbox, but now has no effect. For more information, see the
    * guide to restrictions in HTML service.
    *
    * The IFRAME mode imposes many fewer restrictions than the other sandbox modes and runs
    * fastest, but does not work at all in certain older browsers, including Internet Explorer 9. The
    * sandbox mode can also be read in a client-side script by inspecting google.script.sandbox.mode. Note that this property returns the actual mode on the client, which
    * may differ from the mode requested on the server if the requested mode is not supported in the
    * user's browser.
    *
    *     <!-- Read the sandbox mode (in a client-side script). -->
    *     <script>
    *       alert(google.script.sandbox.mode);
    *     </script>
    */
  @JSGlobal("GoogleAppsScript.HTML.SandboxMode")
  @js.native
  object SandboxMode extends StObject {
    
    @js.native
    sealed trait EMULATED
      extends StObject
         with SandboxMode
    
    @js.native
    sealed trait IFRAME
      extends StObject
         with SandboxMode
    
    @js.native
    sealed trait NATIVE
      extends StObject
         with SandboxMode
  }
  
  @js.native
  sealed trait XFrameOptionsMode extends StObject
  /**
    * An enum representing the X-Frame-Options modes that can be used for client-side HtmlService scripts. These values can be accessed from HtmlService.XFrameOptionsMode,
    * and set by calling HtmlOutput.setXFrameOptionsMode(mode).
    *
    * Setting XFrameOptionsMode.ALLOWALL will let any site iframe the page, so the developer
    * should implement their own protection against clickjacking.
    *
    * If a script does not set an X-Frame-Options mode, Apps Script uses DEFAULT
    * mode as the default.
    *
    *     // Serve HTML with no X-Frame-Options header (in Apps Script server-side code).
    *     var output = HtmlService.createHtmlOutput('<b>Hello, world!</b>');
    *     output.setXFrameOptionsMode(HtmlService.XFrameOptionsMode.ALLOWALL);
    */
  @JSGlobal("GoogleAppsScript.HTML.XFrameOptionsMode")
  @js.native
  object XFrameOptionsMode extends StObject {
    
    @js.native
    sealed trait ALLOWALL
      extends StObject
         with XFrameOptionsMode
    
    @js.native
    sealed trait DEFAULT
      extends StObject
         with XFrameOptionsMode
  }
  
  /**
    * An HtmlOutput object that can be served from a script. Due to security considerations,
    * scripts cannot directly return HTML to a browser. Instead, they must sanitize it so that it
    * cannot perform malicious actions. You can return sanitized HTML like this:
    *
    *     function doGet() {
    *       return HtmlService.createHtmlOutput('<b>Hello, world!</b>');
    *     }
    *
    * HtmlOutput
    * iframe
    * sandboxing
    * guide to restrictions in HTML service
    */
  trait HtmlOutput extends StObject {
    
    def addMetaTag(name: String, content: String): HtmlOutput
    
    def append(addedContent: String): HtmlOutput
    
    def appendUntrusted(addedContent: String): HtmlOutput
    
    def asTemplate(): HtmlTemplate
    
    def clear(): HtmlOutput
    
    def getAs(contentType: String): Blob
    
    def getBlob(): Blob
    
    def getContent(): String
    
    def getFaviconUrl(): String
    
    def getHeight(): Integer
    
    def getMetaTags(): js.Array[HtmlOutputMetaTag]
    
    def getTitle(): String
    
    def getWidth(): Integer
    
    def setContent(content: String): HtmlOutput
    
    def setFaviconUrl(iconUrl: String): HtmlOutput
    
    def setHeight(height: Integer): HtmlOutput
    
    def setSandboxMode(mode: SandboxMode): HtmlOutput
    
    def setTitle(title: String): HtmlOutput
    
    def setWidth(width: Integer): HtmlOutput
    
    def setXFrameOptionsMode(mode: XFrameOptionsMode): HtmlOutput
  }
  object HtmlOutput {
    
    inline def apply(
      addMetaTag: (String, String) => HtmlOutput,
      append: String => HtmlOutput,
      appendUntrusted: String => HtmlOutput,
      asTemplate: () => HtmlTemplate,
      clear: () => HtmlOutput,
      getAs: String => Blob,
      getBlob: () => Blob,
      getContent: () => String,
      getFaviconUrl: () => String,
      getHeight: () => Integer,
      getMetaTags: () => js.Array[HtmlOutputMetaTag],
      getTitle: () => String,
      getWidth: () => Integer,
      setContent: String => HtmlOutput,
      setFaviconUrl: String => HtmlOutput,
      setHeight: Integer => HtmlOutput,
      setSandboxMode: SandboxMode => HtmlOutput,
      setTitle: String => HtmlOutput,
      setWidth: Integer => HtmlOutput,
      setXFrameOptionsMode: XFrameOptionsMode => HtmlOutput
    ): HtmlOutput = {
      val __obj = js.Dynamic.literal(addMetaTag = js.Any.fromFunction2(addMetaTag), append = js.Any.fromFunction1(append), appendUntrusted = js.Any.fromFunction1(appendUntrusted), asTemplate = js.Any.fromFunction0(asTemplate), clear = js.Any.fromFunction0(clear), getAs = js.Any.fromFunction1(getAs), getBlob = js.Any.fromFunction0(getBlob), getContent = js.Any.fromFunction0(getContent), getFaviconUrl = js.Any.fromFunction0(getFaviconUrl), getHeight = js.Any.fromFunction0(getHeight), getMetaTags = js.Any.fromFunction0(getMetaTags), getTitle = js.Any.fromFunction0(getTitle), getWidth = js.Any.fromFunction0(getWidth), setContent = js.Any.fromFunction1(setContent), setFaviconUrl = js.Any.fromFunction1(setFaviconUrl), setHeight = js.Any.fromFunction1(setHeight), setSandboxMode = js.Any.fromFunction1(setSandboxMode), setTitle = js.Any.fromFunction1(setTitle), setWidth = js.Any.fromFunction1(setWidth), setXFrameOptionsMode = js.Any.fromFunction1(setXFrameOptionsMode))
      __obj.asInstanceOf[HtmlOutput]
    }
    
    extension [Self <: HtmlOutput](x: Self) {
      
      inline def setAddMetaTag(value: (String, String) => HtmlOutput): Self = StObject.set(x, "addMetaTag", js.Any.fromFunction2(value))
      
      inline def setAppend(value: String => HtmlOutput): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
      
      inline def setAppendUntrusted(value: String => HtmlOutput): Self = StObject.set(x, "appendUntrusted", js.Any.fromFunction1(value))
      
      inline def setAsTemplate(value: () => HtmlTemplate): Self = StObject.set(x, "asTemplate", js.Any.fromFunction0(value))
      
      inline def setClear(value: () => HtmlOutput): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setGetAs(value: String => Blob): Self = StObject.set(x, "getAs", js.Any.fromFunction1(value))
      
      inline def setGetBlob(value: () => Blob): Self = StObject.set(x, "getBlob", js.Any.fromFunction0(value))
      
      inline def setGetContent(value: () => String): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      
      inline def setGetFaviconUrl(value: () => String): Self = StObject.set(x, "getFaviconUrl", js.Any.fromFunction0(value))
      
      inline def setGetHeight(value: () => Integer): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
      
      inline def setGetMetaTags(value: () => js.Array[HtmlOutputMetaTag]): Self = StObject.set(x, "getMetaTags", js.Any.fromFunction0(value))
      
      inline def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      inline def setGetWidth(value: () => Integer): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      inline def setSetContent(value: String => HtmlOutput): Self = StObject.set(x, "setContent", js.Any.fromFunction1(value))
      
      inline def setSetFaviconUrl(value: String => HtmlOutput): Self = StObject.set(x, "setFaviconUrl", js.Any.fromFunction1(value))
      
      inline def setSetHeight(value: Integer => HtmlOutput): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
      
      inline def setSetSandboxMode(value: SandboxMode => HtmlOutput): Self = StObject.set(x, "setSandboxMode", js.Any.fromFunction1(value))
      
      inline def setSetTitle(value: String => HtmlOutput): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
      
      inline def setSetWidth(value: Integer => HtmlOutput): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
      
      inline def setSetXFrameOptionsMode(value: XFrameOptionsMode => HtmlOutput): Self = StObject.set(x, "setXFrameOptionsMode", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * An object that represents a meta tag added to the page by calling HtmlOutput.addMetaTag(name, content).
    *
    *     var output = HtmlService.createHtmlOutput('<b>Hello, world!</b>');
    *     output.addMetaTag('viewport', 'width=device-width, initial-scale=1');
    *
    *     var tags = output.getMetaTags();
    *     Logger.log('<meta name="%s" content="%s"/>', tags[0].getName(), tags[0].getContent());
    */
  trait HtmlOutputMetaTag extends StObject {
    
    def getContent(): String
    
    def getName(): String
  }
  object HtmlOutputMetaTag {
    
    inline def apply(getContent: () => String, getName: () => String): HtmlOutputMetaTag = {
      val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction0(getContent), getName = js.Any.fromFunction0(getName))
      __obj.asInstanceOf[HtmlOutputMetaTag]
    }
    
    extension [Self <: HtmlOutputMetaTag](x: Self) {
      
      inline def setGetContent(value: () => String): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      
      inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Service for returning HTML and other text content from a script.
    *
    * Due to security considerations, scripts cannot directly return content to a browser. Instead,
    * they must sanitize the HTML so that it cannot perform malicious actions. See the description of
    * HtmlOutput for what limitations this implies on what can be returned.
    */
  @js.native
  trait HtmlService extends StObject {
    
    var SandboxMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SandboxMode */ js.Any = js.native
    
    var XFrameOptionsMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof XFrameOptionsMode */ js.Any = js.native
    
    def createHtmlOutput(): HtmlOutput = js.native
    def createHtmlOutput(blob: BlobSource): HtmlOutput = js.native
    def createHtmlOutput(html: String): HtmlOutput = js.native
    
    def createHtmlOutputFromFile(filename: String): HtmlOutput = js.native
    
    def createTemplate(blob: BlobSource): HtmlTemplate = js.native
    def createTemplate(html: String): HtmlTemplate = js.native
    
    def createTemplateFromFile(filename: String): HtmlTemplate = js.native
    
    def getUserAgent(): String = js.native
  }
  
  /**
    * A template object for dynamically constructing HTML. For more information, see the guide to templates.
    */
  trait HtmlTemplate
    extends StObject
       with /* propName */ StringDictionary[js.Any] {
    
    def evaluate(): HtmlOutput
    
    def getCode(): String
    
    def getCodeWithComments(): String
    
    def getRawContent(): String
  }
  object HtmlTemplate {
    
    inline def apply(
      evaluate: () => HtmlOutput,
      getCode: () => String,
      getCodeWithComments: () => String,
      getRawContent: () => String
    ): HtmlTemplate = {
      val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction0(evaluate), getCode = js.Any.fromFunction0(getCode), getCodeWithComments = js.Any.fromFunction0(getCodeWithComments), getRawContent = js.Any.fromFunction0(getRawContent))
      __obj.asInstanceOf[HtmlTemplate]
    }
    
    extension [Self <: HtmlTemplate](x: Self) {
      
      inline def setEvaluate(value: () => HtmlOutput): Self = StObject.set(x, "evaluate", js.Any.fromFunction0(value))
      
      inline def setGetCode(value: () => String): Self = StObject.set(x, "getCode", js.Any.fromFunction0(value))
      
      inline def setGetCodeWithComments(value: () => String): Self = StObject.set(x, "getCodeWithComments", js.Any.fromFunction0(value))
      
      inline def setGetRawContent(value: () => String): Self = StObject.set(x, "getRawContent", js.Any.fromFunction0(value))
    }
  }
}
