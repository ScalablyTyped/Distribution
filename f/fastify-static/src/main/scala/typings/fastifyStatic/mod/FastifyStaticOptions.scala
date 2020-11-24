package typings.fastifyStatic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastifyStaticOptions extends js.Object {
  
  // Passed on to `send`
  var acceptRanges: js.UndefOr[Boolean] = js.native
  
  var cacheControl: js.UndefOr[Boolean] = js.native
  
  var decorateReply: js.UndefOr[Boolean] = js.native
  
  var dotfiles: js.UndefOr[Boolean] = js.native
  
  var etag: js.UndefOr[Boolean] = js.native
  
  var extensions: js.UndefOr[js.Array[String]] = js.native
  
  var immutable: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[js.Array[String]] = js.native
  
  var lastModified: js.UndefOr[Boolean] = js.native
  
  var list: js.UndefOr[Boolean | ListOptions] = js.native
  
  var maxAge: js.UndefOr[String | Double] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var prefixAvoidTrailingSlash: js.UndefOr[Boolean] = js.native
  
  var redirect: js.UndefOr[Boolean] = js.native
  
  var root: String = js.native
  
  var schemaHide: js.UndefOr[Boolean] = js.native
  
  var serve: js.UndefOr[Boolean] = js.native
  
  var setHeaders: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var wildcard: js.UndefOr[Boolean | String] = js.native
}
object FastifyStaticOptions {
  
  @scala.inline
  def apply(root: String): FastifyStaticOptions = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastifyStaticOptions]
  }
  
  @scala.inline
  implicit class FastifyStaticOptionsOps[Self <: FastifyStaticOptions] (val x: Self) extends AnyVal {
    
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
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptRanges(value: Boolean): Self = this.set("acceptRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptRanges: Self = this.set("acceptRanges", js.undefined)
    
    @scala.inline
    def setCacheControl(value: Boolean): Self = this.set("cacheControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheControl: Self = this.set("cacheControl", js.undefined)
    
    @scala.inline
    def setDecorateReply(value: Boolean): Self = this.set("decorateReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecorateReply: Self = this.set("decorateReply", js.undefined)
    
    @scala.inline
    def setDotfiles(value: Boolean): Self = this.set("dotfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotfiles: Self = this.set("dotfiles", js.undefined)
    
    @scala.inline
    def setEtag(value: Boolean): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setImmutable(value: Boolean): Self = this.set("immutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmutable: Self = this.set("immutable", js.undefined)
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: js.Array[String]): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setLastModified(value: Boolean): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModified: Self = this.set("lastModified", js.undefined)
    
    @scala.inline
    def setList(value: Boolean | ListOptions): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    
    @scala.inline
    def setMaxAge(value: String | Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setPrefixAvoidTrailingSlash(value: Boolean): Self = this.set("prefixAvoidTrailingSlash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixAvoidTrailingSlash: Self = this.set("prefixAvoidTrailingSlash", js.undefined)
    
    @scala.inline
    def setRedirect(value: Boolean): Self = this.set("redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    
    @scala.inline
    def setSchemaHide(value: Boolean): Self = this.set("schemaHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaHide: Self = this.set("schemaHide", js.undefined)
    
    @scala.inline
    def setServe(value: Boolean): Self = this.set("serve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServe: Self = this.set("serve", js.undefined)
    
    @scala.inline
    def setSetHeaders(value: /* repeated */ js.Any => Unit): Self = this.set("setHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHeaders: Self = this.set("setHeaders", js.undefined)
    
    @scala.inline
    def setWildcard(value: Boolean | String): Self = this.set("wildcard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWildcard: Self = this.set("wildcard", js.undefined)
  }
}
