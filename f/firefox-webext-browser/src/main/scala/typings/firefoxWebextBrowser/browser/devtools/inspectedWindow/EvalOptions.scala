package typings.firefoxWebextBrowser.browser.devtools.inspectedWindow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The options parameter can contain one or more options. */
@js.native
trait EvalOptions extends js.Object {
  
  /**
    * Evaluate the expression in the context of a content script of an extension that matches the specified origin. If given, contextSecurityOrigin overrides the 'true' setting on userContentScriptContext.
    * @deprecated Unsupported on Firefox at this time.
    */
  var contextSecurityOrigin: js.UndefOr[String] = js.native
  
  /**
    * If specified, the expression is evaluated on the iframe whose URL matches the one specified. By default, the expression is evaluated in the top frame of the inspected page.
    * @deprecated Unsupported on Firefox at this time.
    */
  var frameURL: js.UndefOr[String] = js.native
  
  /**
    * Evaluate the expression in the context of the content script of the calling extension, provided that the content script is already injected into the inspected page. If not, the expression is not evaluated and the callback is invoked with the exception parameter set to an object that has the `isError` field set to true and the `code` field set to `E_NOTFOUND`.
    * @deprecated Unsupported on Firefox at this time.
    */
  var useContentScriptContext: js.UndefOr[Boolean] = js.native
}
object EvalOptions {
  
  @scala.inline
  def apply(): EvalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvalOptions]
  }
  
  @scala.inline
  implicit class EvalOptionsOps[Self <: EvalOptions] (val x: Self) extends AnyVal {
    
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
    def setContextSecurityOrigin(value: String): Self = this.set("contextSecurityOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextSecurityOrigin: Self = this.set("contextSecurityOrigin", js.undefined)
    
    @scala.inline
    def setFrameURL(value: String): Self = this.set("frameURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameURL: Self = this.set("frameURL", js.undefined)
    
    @scala.inline
    def setUseContentScriptContext(value: Boolean): Self = this.set("useContentScriptContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseContentScriptContext: Self = this.set("useContentScriptContext", js.undefined)
  }
}
