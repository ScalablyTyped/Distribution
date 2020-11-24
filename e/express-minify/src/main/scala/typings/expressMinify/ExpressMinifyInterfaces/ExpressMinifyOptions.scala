package typings.expressMinify.ExpressMinifyInterfaces

import typings.node.NodeRequire
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpressMinifyOptions extends js.Object {
  
  /**
    * The directory for cache storage (must be writeable). Pass false to cache in the memory (not recommended).
    */
  var cache: js.UndefOr[String | Boolean] = js.native
  
  /**
    * Matches CoffeeScript content-type.
    */
  var coffee_match: js.UndefOr[RegExp] = js.native
  
  /**
    * Matches CSS content-type.
    */
  var css_match: js.UndefOr[RegExp] = js.native
  
  /**
    * Customize cssmin instance (require('cssmin')).
    */
  var cssmin: js.UndefOr[NodeRequire] = js.native
  
  /**
    * Matches JavaScript content-type.
    */
  var js_match: js.UndefOr[RegExp] = js.native
  
  /**
    * Matches JSON content-type.
    */
  var json_match: js.UndefOr[RegExp] = js.native
  
  /**
    * Matches LESS content-type.
    */
  var less_match: js.UndefOr[RegExp] = js.native
  
  /**
    * Handle compiling errors or minifying errors. You can determine what to respond when facing such errors.
    */
  var onerror: js.UndefOr[js.Function] = js.native
  
  /**
    * Matches SASS content-type.
    */
  var sass_match: js.UndefOr[RegExp] = js.native
  
  /**
    * Matches Stylus content-type.
    */
  var stylus_match: js.UndefOr[RegExp] = js.native
  
  /**
    * Customize UglifyJS instance (require('uglify-js')).
    */
  var uglifyJS: js.UndefOr[NodeRequire] = js.native
}
object ExpressMinifyOptions {
  
  @scala.inline
  def apply(): ExpressMinifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpressMinifyOptions]
  }
  
  @scala.inline
  implicit class ExpressMinifyOptionsOps[Self <: ExpressMinifyOptions] (val x: Self) extends AnyVal {
    
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
    def setCache(value: String | Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCoffee_match(value: RegExp): Self = this.set("coffee_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoffee_match: Self = this.set("coffee_match", js.undefined)
    
    @scala.inline
    def setCss_match(value: RegExp): Self = this.set("css_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss_match: Self = this.set("css_match", js.undefined)
    
    @scala.inline
    def setCssmin(value: NodeRequire): Self = this.set("cssmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssmin: Self = this.set("cssmin", js.undefined)
    
    @scala.inline
    def setJs_match(value: RegExp): Self = this.set("js_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJs_match: Self = this.set("js_match", js.undefined)
    
    @scala.inline
    def setJson_match(value: RegExp): Self = this.set("json_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJson_match: Self = this.set("json_match", js.undefined)
    
    @scala.inline
    def setLess_match(value: RegExp): Self = this.set("less_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLess_match: Self = this.set("less_match", js.undefined)
    
    @scala.inline
    def setOnerror(value: js.Function): Self = this.set("onerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    
    @scala.inline
    def setSass_match(value: RegExp): Self = this.set("sass_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSass_match: Self = this.set("sass_match", js.undefined)
    
    @scala.inline
    def setStylus_match(value: RegExp): Self = this.set("stylus_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylus_match: Self = this.set("stylus_match", js.undefined)
    
    @scala.inline
    def setUglifyJS(value: NodeRequire): Self = this.set("uglifyJS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUglifyJS: Self = this.set("uglifyJS", js.undefined)
  }
}
