package typings.expressSimpleLocale.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://github.com/n26/express-simple-locale#options}
  */
@js.native
trait Options extends js.Object {
  
  /**
    * cookie to try getting the locale from
    * @default 'locale'
    */
  var cookieName: js.UndefOr[String] = js.native
  
  /**
    * locale to fallback to
    * @default 'en'
    */
  var defaultLocale: js.UndefOr[String] = js.native
  
  /**
    * the key to save locale to on the request
    * @default 'locale'
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * the query parameter(s) to look the locale from
    * @default ['locale']
    */
  var queryParams: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * available locales for the app
    * @default []
    */
  var supportedLocales: js.UndefOr[js.Array[String]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCookieName(value: String): Self = this.set("cookieName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieName: Self = this.set("cookieName", js.undefined)
    
    @scala.inline
    def setDefaultLocale(value: String): Self = this.set("defaultLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLocale: Self = this.set("defaultLocale", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setQueryParamsVarargs(value: String*): Self = this.set("queryParams", js.Array(value :_*))
    
    @scala.inline
    def setQueryParams(value: String | js.Array[String]): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryParams: Self = this.set("queryParams", js.undefined)
    
    @scala.inline
    def setSupportedLocalesVarargs(value: String*): Self = this.set("supportedLocales", js.Array(value :_*))
    
    @scala.inline
    def setSupportedLocales(value: js.Array[String]): Self = this.set("supportedLocales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedLocales: Self = this.set("supportedLocales", js.undefined)
  }
}
