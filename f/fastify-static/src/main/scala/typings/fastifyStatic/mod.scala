package typings.fastifyStatic

import org.scalablytyped.runtime.Shortcut
import typings.fastify.pluginMod.FastifyPlugin
import typings.fastifyStatic.fastifyStaticStrings.html
import typings.fastifyStatic.fastifyStaticStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("fastify-static", JSImport.Default)
  @js.native
  val default: FastifyPlugin[FastifyStaticOptions] = js.native
  
  trait FastifyStaticOptions extends StObject {
    
    // Passed on to `send`
    var acceptRanges: js.UndefOr[Boolean] = js.undefined
    
    var cacheControl: js.UndefOr[Boolean] = js.undefined
    
    var decorateReply: js.UndefOr[Boolean] = js.undefined
    
    var dotfiles: js.UndefOr[Boolean] = js.undefined
    
    var etag: js.UndefOr[Boolean] = js.undefined
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var immutable: js.UndefOr[Boolean] = js.undefined
    
    var index: js.UndefOr[js.Array[String]] = js.undefined
    
    var lastModified: js.UndefOr[Boolean] = js.undefined
    
    var list: js.UndefOr[Boolean | ListOptions] = js.undefined
    
    var maxAge: js.UndefOr[String | Double] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var prefixAvoidTrailingSlash: js.UndefOr[Boolean] = js.undefined
    
    var redirect: js.UndefOr[Boolean] = js.undefined
    
    var root: String
    
    var schemaHide: js.UndefOr[Boolean] = js.undefined
    
    var serve: js.UndefOr[Boolean] = js.undefined
    
    var setHeaders: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    var wildcard: js.UndefOr[Boolean | String] = js.undefined
  }
  object FastifyStaticOptions {
    
    inline def apply(root: String): FastifyStaticOptions = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastifyStaticOptions]
    }
    
    extension [Self <: FastifyStaticOptions](x: Self) {
      
      inline def setAcceptRanges(value: Boolean): Self = StObject.set(x, "acceptRanges", value.asInstanceOf[js.Any])
      
      inline def setAcceptRangesUndefined: Self = StObject.set(x, "acceptRanges", js.undefined)
      
      inline def setCacheControl(value: Boolean): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
      
      inline def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
      
      inline def setDecorateReply(value: Boolean): Self = StObject.set(x, "decorateReply", value.asInstanceOf[js.Any])
      
      inline def setDecorateReplyUndefined: Self = StObject.set(x, "decorateReply", js.undefined)
      
      inline def setDotfiles(value: Boolean): Self = StObject.set(x, "dotfiles", value.asInstanceOf[js.Any])
      
      inline def setDotfilesUndefined: Self = StObject.set(x, "dotfiles", js.undefined)
      
      inline def setEtag(value: Boolean): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      inline def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
      
      inline def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
      
      inline def setIndex(value: js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
      
      inline def setLastModified(value: Boolean): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
      
      inline def setList(value: Boolean | ListOptions): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setMaxAge(value: String | Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixAvoidTrailingSlash(value: Boolean): Self = StObject.set(x, "prefixAvoidTrailingSlash", value.asInstanceOf[js.Any])
      
      inline def setPrefixAvoidTrailingSlashUndefined: Self = StObject.set(x, "prefixAvoidTrailingSlash", js.undefined)
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRedirect(value: Boolean): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSchemaHide(value: Boolean): Self = StObject.set(x, "schemaHide", value.asInstanceOf[js.Any])
      
      inline def setSchemaHideUndefined: Self = StObject.set(x, "schemaHide", js.undefined)
      
      inline def setServe(value: Boolean): Self = StObject.set(x, "serve", value.asInstanceOf[js.Any])
      
      inline def setServeUndefined: Self = StObject.set(x, "serve", js.undefined)
      
      inline def setSetHeaders(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "setHeaders", js.Any.fromFunction1(value))
      
      inline def setSetHeadersUndefined: Self = StObject.set(x, "setHeaders", js.undefined)
      
      inline def setWildcard(value: Boolean | String): Self = StObject.set(x, "wildcard", value.asInstanceOf[js.Any])
      
      inline def setWildcardUndefined: Self = StObject.set(x, "wildcard", js.undefined)
    }
  }
  
  trait ListDir extends StObject {
    
    var href: String
    
    var name: String
  }
  object ListDir {
    
    inline def apply(href: String, name: String): ListDir = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListDir]
    }
    
    extension [Self <: ListDir](x: Self) {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListFile extends StObject {
    
    var href: String
    
    var name: String
  }
  object ListFile {
    
    inline def apply(href: String, name: String): ListFile = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListFile]
    }
    
    extension [Self <: ListFile](x: Self) {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListOptions extends StObject {
    
    var format: json | html
    
    var names: js.Array[String]
    
    def render(dirs: js.Array[ListDir], files: js.Array[ListFile]): String
    @JSName("render")
    var render_Original: ListRender
  }
  object ListOptions {
    
    inline def apply(
      format: json | html,
      names: js.Array[String],
      render: (/* dirs */ js.Array[ListDir], /* files */ js.Array[ListFile]) => String
    ): ListOptions = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
      __obj.asInstanceOf[ListOptions]
    }
    
    extension [Self <: ListOptions](x: Self) {
      
      inline def setFormat(value: json | html): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
      
      inline def setRender(value: (/* dirs */ js.Array[ListDir], /* files */ js.Array[ListFile]) => String): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
    }
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
