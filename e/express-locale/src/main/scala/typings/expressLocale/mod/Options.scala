package typings.expressLocale.mod

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://github.com/smhg/express-locale/#configuration}
  */
@js.native
trait Options extends js.Object {
  
  /**
    * Lookup results are validated against this list of allowed locales if provided.
    * @default undefined
    */
  var allowed: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The name of the cookie that contains the locale for the cookie lookup.
    *
    * Use with {@link https://github.com/expressjs/cookie-parser|cookie-parser} middleware.
    *
    * Note: you are responsible for writing the locale to the cookie.
    *
    * @default {name: 'locale'}
    */
  var cookie: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * The default locale for the default lookup.
    * @default 'en-GB'
    */
  var default: js.UndefOr[String] = js.native
  
  /**
    * A mapping of hostnames to locales for the hostname lookup.
    * @default {}
    */
  var hostname: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Add custom lookups or overwrite the default ones
    * @default undefined
    */
  var lookups: js.UndefOr[
    StringDictionary[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]]
  ] = js.native
  
  /**
    * Maps lookup results that return only a language to a full locale.
    * @default {}
    */
  var map: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Defines the order of lookups.
    * The first lookup to return a full locale will be the final result.
    * @default ['accept-language', 'default']
    */
  var priority: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The name of the query string parameter that contains the locale for the query lookup.
    * @default {name: 'locale'}
    */
  var query: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * By default, the locale is attached to `req.locale` but can be configured with the `requestProperty` option.
    * @default 'locale'
    */
  var requestProperty: js.UndefOr[String] = js.native
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
    def setAllowedVarargs(value: String*): Self = this.set("allowed", js.Array(value :_*))
    
    @scala.inline
    def setAllowed(value: js.Array[String]): Self = this.set("allowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowed: Self = this.set("allowed", js.undefined)
    
    @scala.inline
    def setCookie(value: StringDictionary[js.Any]): Self = this.set("cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    
    @scala.inline
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setHostname(value: StringDictionary[String]): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setLookups(value: StringDictionary[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]]): Self = this.set("lookups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookups: Self = this.set("lookups", js.undefined)
    
    @scala.inline
    def setMap(value: StringDictionary[String]): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setPriorityVarargs(value: String*): Self = this.set("priority", js.Array(value :_*))
    
    @scala.inline
    def setPriority(value: js.Array[String]): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setQuery(value: StringDictionary[js.Any]): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setRequestProperty(value: String): Self = this.set("requestProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestProperty: Self = this.set("requestProperty", js.undefined)
  }
}
