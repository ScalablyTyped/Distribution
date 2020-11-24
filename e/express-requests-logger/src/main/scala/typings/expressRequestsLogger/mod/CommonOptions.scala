package typings.expressRequestsLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonOptions extends js.Object {
  
  /**
    * `true` - include request in audit, `false` - don't.
    * {@link https://github.com/PayU/express-request-logger#audit}
    */
  var audit: js.UndefOr[Boolean] = js.native
  
  /**
    * pass the fields you wish to exclude in the body of the requests (sensitive data like passwords, credit cards numbers etc..). * field - exclude all body
    * {@link https://github.com/PayU/express-request-logger#excludebody}
    */
  var excludeBody: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * pass the header names you wish to exclude from the audit (senstitive data like authorization headers etc..). * field - exclude all headers
    * {@link https://github.com/PayU/express-request-logger#excludeheaders}
    */
  var excludeHeaders: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * pass the fields you wish to mask in the body of the requests (sensitive data like passwords, credit cards numbers etc..).
    * {@link https://github.com/PayU/express-request-logger#maskbody}
    */
  var maskBody: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * pass the fields you wish to mask in the headers of the requests (senstitive data like authorization headers etc..).
    * {@link https://github.com/PayU/express-request-logger#maskheaders}
    */
  var maskHeaders: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * pass the fields you wish to mask in the query of the requests (sensitive data like passwords, credit cards numbers etc..).
    * {@link https://github.com/PayU/express-request-logger#maskquery}
    */
  var maskQuery: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Restrict request body's logged content length (inputs other than positive integers will be ignored).
    * {@link https://github.com/PayU/express-request-logger#maxbodylength}
    */
  var maxBodyLength: js.UndefOr[Double] = js.native
}
object CommonOptions {
  
  @scala.inline
  def apply(): CommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptions]
  }
  
  @scala.inline
  implicit class CommonOptionsOps[Self <: CommonOptions] (val x: Self) extends AnyVal {
    
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
    def setAudit(value: Boolean): Self = this.set("audit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudit: Self = this.set("audit", js.undefined)
    
    @scala.inline
    def setExcludeBodyVarargs(value: String*): Self = this.set("excludeBody", js.Array(value :_*))
    
    @scala.inline
    def setExcludeBody(value: js.Array[String]): Self = this.set("excludeBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeBody: Self = this.set("excludeBody", js.undefined)
    
    @scala.inline
    def setExcludeHeadersVarargs(value: String*): Self = this.set("excludeHeaders", js.Array(value :_*))
    
    @scala.inline
    def setExcludeHeaders(value: js.Array[String]): Self = this.set("excludeHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeHeaders: Self = this.set("excludeHeaders", js.undefined)
    
    @scala.inline
    def setMaskBodyVarargs(value: String*): Self = this.set("maskBody", js.Array(value :_*))
    
    @scala.inline
    def setMaskBody(value: js.Array[String]): Self = this.set("maskBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskBody: Self = this.set("maskBody", js.undefined)
    
    @scala.inline
    def setMaskHeadersVarargs(value: String*): Self = this.set("maskHeaders", js.Array(value :_*))
    
    @scala.inline
    def setMaskHeaders(value: js.Array[String]): Self = this.set("maskHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskHeaders: Self = this.set("maskHeaders", js.undefined)
    
    @scala.inline
    def setMaskQueryVarargs(value: String*): Self = this.set("maskQuery", js.Array(value :_*))
    
    @scala.inline
    def setMaskQuery(value: js.Array[String]): Self = this.set("maskQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskQuery: Self = this.set("maskQuery", js.undefined)
    
    @scala.inline
    def setMaxBodyLength(value: Double): Self = this.set("maxBodyLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBodyLength: Self = this.set("maxBodyLength", js.undefined)
  }
}
