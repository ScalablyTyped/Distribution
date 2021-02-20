package typings.fastifyStatic

import org.scalablytyped.runtime.Shortcut
import typings.fastify.pluginMod.FastifyPlugin
import typings.fastifyStatic.fastifyStaticStrings.html
import typings.fastifyStatic.fastifyStaticStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("fastify-static", JSImport.Default)
  @js.native
  val default: FastifyPlugin[FastifyStaticOptions] = js.native
  
  @js.native
  trait FastifyStaticOptions extends StObject {
    
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
    implicit class FastifyStaticOptionsMutableBuilder[Self <: FastifyStaticOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptRanges(value: Boolean): Self = StObject.set(x, "acceptRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptRangesUndefined: Self = StObject.set(x, "acceptRanges", js.undefined)
      
      @scala.inline
      def setCacheControl(value: Boolean): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
      
      @scala.inline
      def setDecorateReply(value: Boolean): Self = StObject.set(x, "decorateReply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorateReplyUndefined: Self = StObject.set(x, "decorateReply", js.undefined)
      
      @scala.inline
      def setDotfiles(value: Boolean): Self = StObject.set(x, "dotfiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotfilesUndefined: Self = StObject.set(x, "dotfiles", js.undefined)
      
      @scala.inline
      def setEtag(value: Boolean): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      @scala.inline
      def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
      
      @scala.inline
      def setIndex(value: js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
      
      @scala.inline
      def setLastModified(value: Boolean): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
      
      @scala.inline
      def setList(value: Boolean | ListOptions): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setMaxAge(value: String | Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixAvoidTrailingSlash(value: Boolean): Self = StObject.set(x, "prefixAvoidTrailingSlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixAvoidTrailingSlashUndefined: Self = StObject.set(x, "prefixAvoidTrailingSlash", js.undefined)
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRedirect(value: Boolean): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaHide(value: Boolean): Self = StObject.set(x, "schemaHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaHideUndefined: Self = StObject.set(x, "schemaHide", js.undefined)
      
      @scala.inline
      def setServe(value: Boolean): Self = StObject.set(x, "serve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServeUndefined: Self = StObject.set(x, "serve", js.undefined)
      
      @scala.inline
      def setSetHeaders(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "setHeaders", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHeadersUndefined: Self = StObject.set(x, "setHeaders", js.undefined)
      
      @scala.inline
      def setWildcard(value: Boolean | String): Self = StObject.set(x, "wildcard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWildcardUndefined: Self = StObject.set(x, "wildcard", js.undefined)
    }
  }
  
  @js.native
  trait ListDir extends StObject {
    
    var href: String = js.native
    
    var name: String = js.native
  }
  object ListDir {
    
    @scala.inline
    def apply(href: String, name: String): ListDir = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListDir]
    }
    
    @scala.inline
    implicit class ListDirMutableBuilder[Self <: ListDir] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ListFile extends StObject {
    
    var href: String = js.native
    
    var name: String = js.native
  }
  object ListFile {
    
    @scala.inline
    def apply(href: String, name: String): ListFile = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListFile]
    }
    
    @scala.inline
    implicit class ListFileMutableBuilder[Self <: ListFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ListOptions extends StObject {
    
    var format: json | html = js.native
    
    var names: js.Array[String] = js.native
    
    def render(dirs: js.Array[ListDir], files: js.Array[ListFile]): String = js.native
    @JSName("render")
    var render_Original: ListRender = js.native
  }
  
  type ListRender = js.Function2[/* dirs */ js.Array[ListDir], /* files */ js.Array[ListFile], String]
  
  type _To = FastifyPlugin[FastifyStaticOptions]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FastifyPlugin[FastifyStaticOptions] = default
  
  /* augmented module */
  object fastifyAugmentingMod {
    
    @js.native
    trait FastifyReply extends StObject {
      
      def sendFile(filename: String): FastifyReply = js.native
      def sendFile(filename: String, rootPath: String): FastifyReply = js.native
    }
  }
}
