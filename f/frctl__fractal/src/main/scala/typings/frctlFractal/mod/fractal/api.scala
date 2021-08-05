package typings.frctlFractal.mod.fractal

import org.scalablytyped.runtime.StringDictionary
import typings.frctlFractal.anon.Alias
import typings.frctlFractal.anon.Handle
import typings.frctlFractal.frctlFractalBooleans.`true`
import typings.frctlFractal.mod.fractal.api.assets.AssetCollection
import typings.frctlFractal.mod.fractal.api.components.Component
import typings.frctlFractal.mod.fractal.api.files.FileCollection
import typings.frctlFractal.mod.fractal.api.variants.VariantCollection
import typings.frctlFractal.mod.fractal.core.StatusInfo
import typings.frctlFractal.mod.fractal.core.entities.Entity
import typings.frctlFractal.mod.fractal.core.entities.EntityCollection
import typings.frctlFractal.mod.fractal.core.entities.EntitySource
import typings.frctlFractal.mod.fractal.core.mixins.Collection
import typings.frctlFractal.mod.fractal.core.mixins.ConfigurableEmitter
import typings.frctlFractal.mod.fractal.core.mixins.Source
import typings.node.Buffer
import typings.node.fsMod.Stats
import typings.node.streamMod.Readable
import typings.std.IterableIterator
import typings.std.RegExp
import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object api {
  
  object assets {
    
    @JSImport("@frctl/fractal", "fractal.api.assets.Asset")
    @js.native
    class Asset () extends Entity {
      
      val isAsset: `true` = js.native
      
      @JSName("isCollection")
      val isCollection_Asset: Unit = js.native
      
      @JSName("isComponent")
      val isComponent_Asset: Unit = js.native
      
      @JSName("isDoc")
      val isDoc_Asset: Unit = js.native
      
      val isFile: Unit = js.native
      
      @JSName("isVariant")
      val isVariant_Asset: Unit = js.native
      
      def toVinyl(): File = js.native
    }
    
    @js.native
    trait AssetCollection extends EntityCollection[Asset] {
      
      def assets(): this.type = js.native
      
      def toVinylArray(): js.Array[File] = js.native
    }
    
    @js.native
    trait AssetSource
      extends Source[File, js.Any] {
      
      def assets(): js.Array[File] = js.native
      
      def gulpify(): Readable = js.native
      
      def toVinylArray(): js.Array[File] = js.native
      
      def toVinylStream(): Readable = js.native
    }
    
    @js.native
    trait AssetSourceCollection
      extends ConfigurableEmitter[js.Any] {
      
      def add(name: String, config: js.Any): AssetSource = js.native
      
      def find(name: String): js.UndefOr[AssetSource] = js.native
      
      @JSName(js.Symbol.iterator)
      var iterator: js.Function0[IterableIterator[AssetSource]] = js.native
      
      val label: String = js.native
      
      def load(): js.Promise[Unit] = js.native
      
      def remove(name: String): this.type = js.native
      
      def sources(): js.Array[AssetSource] = js.native
      
      val title: String = js.native
      
      def toArray(): js.Array[AssetSource] = js.native
      
      def toJSON(): js.Object = js.native
      
      def unwatch(): this.type = js.native
      
      def visible(): js.Array[AssetSource] = js.native
      
      def watch(): this.type = js.native
    }
  }
  
  object components {
    
    @JSImport("@frctl/fractal", "fractal.api.components.Component")
    @js.native
    class Component protected () extends Entity {
      def this(config: js.Object, files: FileCollection, resources: AssetCollection, parent: Entity) = this()
      
      val baseHandle: String = js.native
      
      def component(): this.type = js.native
      
      var configData: String = js.native
      
      val content: String = js.native
      
      var defaultName: String = js.native
      
      var editorMode: String = js.native
      
      var editorScope: String = js.native
      
      def flatten(): VariantCollection = js.native
      
      def getPreviewContent(): js.Promise[String] = js.native
      
      def getPreviewContext(): js.Promise[js.Any] = js.native
      
      def hasTag(tag: String): Boolean = js.native
      
      val isAsset: Unit = js.native
      
      def isCollated(): Boolean = js.native
      
      @JSName("isCollection")
      val isCollection_Component: Unit = js.native
      
      @JSName("isComponent")
      val isComponent_Component: `true` = js.native
      
      @JSName("isDoc")
      val isDoc_Component: Unit = js.native
      
      val isFile: Unit = js.native
      
      @JSName("isVariant")
      val isVariant_Component: Unit = js.native
      
      var lang: String = js.native
      
      val notes: String = js.native
      
      val referencedBy: js.Array[js.Any] = js.native
      
      val references: js.Array[js.Any] = js.native
      
      var relViewPath: String = js.native
      
      def render(context: js.Any, env: js.Any, opts: js.Any): js.Promise[String] = js.native
      
      def resources(): AssetCollection = js.native
      
      def resourcesJSON(): js.Object = js.native
      
      def setVariants(variantCollection: VariantCollection): Unit = js.native
      
      def variants(): VariantCollection = js.native
      
      var viewDir: String = js.native
      
      var viewPath: String = js.native
    }
    object Component {
      
      @JSImport("@frctl/fractal", "fractal.api.components.Component")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def create(config: js.Object, files: FileCollection, resources: AssetCollection, parent: Entity): IterableIterator[js.Object | VariantCollection | Component] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], files.asInstanceOf[js.Any], resources.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[js.Object | VariantCollection | Component]]
    }
    
    type Collator = js.Function2[/* markup */ String, /* item */ Handle, String]
    
    @js.native
    trait ComponentCollection extends EntityCollection[Component] {
      
      def components(): this.type = js.native
      
      def variants(): this.type = js.native
    }
    
    trait ComponentConfig extends StObject {
      
      var default: js.UndefOr[ComponentDefaultConfig] = js.undefined
      
      @JSName("default.collated")
      var defaultDotcollated: js.UndefOr[Boolean] = js.undefined
      
      @JSName("default.collator")
      var defaultDotcollator: js.UndefOr[Collator] = js.undefined
      
      @JSName("default.context")
      var defaultDotcontext: js.UndefOr[js.Any] = js.undefined
      
      @JSName("default.display")
      var defaultDotdisplay: js.UndefOr[js.Any] = js.undefined
      
      @JSName("default.prefix")
      var defaultDotprefix: js.UndefOr[String] = js.undefined
      
      @JSName("default.preview")
      var defaultDotpreview: js.UndefOr[String] = js.undefined
      
      @JSName("default.status")
      var defaultDotstatus: js.UndefOr[String] = js.undefined
      
      var ext: js.UndefOr[String] = js.undefined
      
      var label: js.UndefOr[String] = js.undefined
      
      var path: js.UndefOr[String] = js.undefined
      
      var statuses: js.UndefOr[StringDictionary[StatusInfo]] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var `yield`: js.UndefOr[String] = js.undefined
    }
    object ComponentConfig {
      
      inline def apply(): ComponentConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ComponentConfig]
      }
      
      extension [Self <: ComponentConfig](x: Self) {
        
        inline def setDefault(value: ComponentDefaultConfig): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        inline def setDefaultDotcollated(value: Boolean): Self = StObject.set(x, "default.collated", value.asInstanceOf[js.Any])
        
        inline def setDefaultDotcollatedUndefined: Self = StObject.set(x, "default.collated", js.undefined)
        
        inline def setDefaultDotcollator(value: (/* markup */ String, /* item */ Handle) => String): Self = StObject.set(x, "default.collator", js.Any.fromFunction2(value))
        
        inline def setDefaultDotcollatorUndefined: Self = StObject.set(x, "default.collator", js.undefined)
        
        inline def setDefaultDotcontext(value: js.Any): Self = StObject.set(x, "default.context", value.asInstanceOf[js.Any])
        
        inline def setDefaultDotcontextUndefined: Self = StObject.set(x, "default.context", js.undefined)
        
        inline def setDefaultDotdisplay(value: js.Any): Self = StObject.set(x, "default.display", value.asInstanceOf[js.Any])
        
        inline def setDefaultDotdisplayUndefined: Self = StObject.set(x, "default.display", js.undefined)
        
        inline def setDefaultDotprefix(value: String): Self = StObject.set(x, "default.prefix", value.asInstanceOf[js.Any])
        
        inline def setDefaultDotprefixUndefined: Self = StObject.set(x, "default.prefix", js.undefined)
        
        inline def setDefaultDotpreview(value: String): Self = StObject.set(x, "default.preview", value.asInstanceOf[js.Any])
        
        inline def setDefaultDotpreviewUndefined: Self = StObject.set(x, "default.preview", js.undefined)
        
        inline def setDefaultDotstatus(value: String): Self = StObject.set(x, "default.status", value.asInstanceOf[js.Any])
        
        inline def setDefaultDotstatusUndefined: Self = StObject.set(x, "default.status", js.undefined)
        
        inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
        
        inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setStatuses(value: StringDictionary[StatusInfo]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
        
        inline def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setYield(value: String): Self = StObject.set(x, "yield", value.asInstanceOf[js.Any])
        
        inline def setYieldUndefined: Self = StObject.set(x, "yield", js.undefined)
      }
    }
    
    trait ComponentDefaultConfig extends StObject {
      
      var collated: js.UndefOr[Boolean] = js.undefined
      
      var collator: js.UndefOr[Collator] = js.undefined
      
      var context: js.UndefOr[js.Any] = js.undefined
      
      var display: js.UndefOr[js.Any] = js.undefined
      
      var prefix: js.UndefOr[String] = js.undefined
      
      var preview: js.UndefOr[String] = js.undefined
      
      var status: js.UndefOr[String] = js.undefined
    }
    object ComponentDefaultConfig {
      
      inline def apply(): ComponentDefaultConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ComponentDefaultConfig]
      }
      
      extension [Self <: ComponentDefaultConfig](x: Self) {
        
        inline def setCollated(value: Boolean): Self = StObject.set(x, "collated", value.asInstanceOf[js.Any])
        
        inline def setCollatedUndefined: Self = StObject.set(x, "collated", js.undefined)
        
        inline def setCollator(value: (/* markup */ String, /* item */ Handle) => String): Self = StObject.set(x, "collator", js.Any.fromFunction2(value))
        
        inline def setCollatorUndefined: Self = StObject.set(x, "collator", js.undefined)
        
        inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
        
        inline def setDisplay(value: js.Any): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
        
        inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
        
        inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        inline def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
        
        inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
        
        inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    @js.native
    trait ComponentSource extends EntitySource[Component, ComponentConfig] {
      
      def components(): js.Array[Component] = js.native
      
      def find(): js.Any = js.native
      
      def findFile(filePath: String): js.UndefOr[typings.frctlFractal.mod.fractal.api.files.File] = js.native
      
      def getReferencesOf(target: Alias): js.Array[js.Any] = js.native
      
      def render(entity: String, context: js.Any): js.Promise[String] = js.native
      def render(entity: String, context: js.Any, env: js.Any): js.Promise[String] = js.native
      def render(entity: String, context: js.Any, env: js.Any, opts: js.Object): js.Promise[String] = js.native
      def render(entity: String, context: js.Any, env: Unit, opts: js.Object): js.Promise[String] = js.native
      def render(entity: Entity, context: js.Any): js.Promise[String] = js.native
      def render(entity: Entity, context: js.Any, env: js.Any): js.Promise[String] = js.native
      def render(entity: Entity, context: js.Any, env: js.Any, opts: js.Object): js.Promise[String] = js.native
      def render(entity: Entity, context: js.Any, env: Unit, opts: js.Object): js.Promise[String] = js.native
      
      def renderPreview(entity: String): js.Promise[String] = js.native
      def renderPreview(entity: String, preview: Boolean): js.Promise[String] = js.native
      def renderPreview(entity: String, preview: Boolean, env: js.Any): js.Promise[String] = js.native
      def renderPreview(entity: String, preview: Unit, env: js.Any): js.Promise[String] = js.native
      def renderPreview(entity: Entity): js.Promise[String] = js.native
      def renderPreview(entity: Entity, preview: Boolean): js.Promise[String] = js.native
      def renderPreview(entity: Entity, preview: Boolean, env: js.Any): js.Promise[String] = js.native
      def renderPreview(entity: Entity, preview: Unit, env: js.Any): js.Promise[String] = js.native
      
      def renderString(str: String, context: js.Any, env: js.Any): js.Promise[String] = js.native
      
      def resolve(context: js.Any): js.Any = js.native
      
      def resources(): FileCollection = js.native
      
      def variants(): this.type = js.native
    }
  }
  
  object docs {
    
    @JSImport("@frctl/fractal", "fractal.api.docs.Doc")
    @js.native
    class Doc protected () extends Entity {
      def this(config: js.Any, content: String, parent: Entity) = this()
      
      def getContent(): js.Promise[String] = js.native
      
      def getContentSync(): String = js.native
      
      val isAsset: Unit = js.native
      
      @JSName("isCollection")
      val isCollection_Doc: Unit = js.native
      
      @JSName("isComponent")
      val isComponent_Doc: Unit = js.native
      
      @JSName("isDoc")
      val isDoc_Doc: `true` = js.native
      
      val isFile: Unit = js.native
      
      val isIndex: Boolean = js.native
      
      @JSName("isVariant")
      val isVariant_Doc: Unit = js.native
      
      def render(context: js.Any): js.Promise[String] = js.native
      def render(context: js.Any, env: js.Any): js.Promise[String] = js.native
      def render(context: js.Any, env: js.Any, opts: js.Any): js.Promise[String] = js.native
      def render(context: js.Any, env: Unit, opts: js.Any): js.Promise[String] = js.native
      
      def toc(): js.Promise[String] = js.native
      def toc(maxDepth: Double): js.Promise[String] = js.native
    }
    object Doc {
      
      @JSImport("@frctl/fractal", "fractal.api.docs.Doc")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def create(config: js.Any, content: String, parent: Entity): Doc = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], content.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Doc]
    }
    
    @js.native
    trait DocCollection extends EntityCollection[Doc] {
      
      def pages(): this.type = js.native
    }
    
    trait DocConfig extends StObject {
      
      var default: js.UndefOr[DocDefaultConfig] = js.undefined
      
      @JSName("default.context")
      var defaultDotcontext: js.UndefOr[js.Any] = js.undefined
      
      @JSName("default.prefix")
      var defaultDotprefix: js.UndefOr[String] = js.undefined
      
      @JSName("default.status")
      var defaultDotstatus: js.UndefOr[String] = js.undefined
      
      var ext: js.UndefOr[String] = js.undefined
      
      var indexLabel: js.UndefOr[String] = js.undefined
      
      var label: js.UndefOr[String] = js.undefined
      
      var markdown: js.UndefOr[Boolean | DocMarkdownConfig] = js.undefined
      
      @JSName("markdown.breaks")
      var markdownDotbreaks: js.UndefOr[Boolean] = js.undefined
      
      @JSName("markdown.gfm")
      var markdownDotgfm: js.UndefOr[Boolean] = js.undefined
      
      @JSName("markdown.pedantic")
      var markdownDotpedantic: js.UndefOr[Boolean] = js.undefined
      
      @JSName("markdown.sanitize")
      var markdownDotsanitize: js.UndefOr[Boolean] = js.undefined
      
      @JSName("markdown.smartLists")
      var markdownDotsmartLists: js.UndefOr[Boolean] = js.undefined
      
      @JSName("markdown.smartypants")
      var markdownDotsmartypants: js.UndefOr[Boolean] = js.undefined
      
      @JSName("markdown.tables")
      var markdownDottables: js.UndefOr[Boolean] = js.undefined
      
      var path: js.UndefOr[String] = js.undefined
      
      var statuses: js.UndefOr[StringDictionary[StatusInfo]] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object DocConfig {
      
      inline def apply(): DocConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DocConfig]
      }
      
      extension [Self <: DocConfig](x: Self) {
        
        inline def setDefault(value: DocDefaultConfig): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        inline def setDefaultDotcontext(value: js.Any): Self = StObject.set(x, "default.context", value.asInstanceOf[js.Any])
        
        inline def setDefaultDotcontextUndefined: Self = StObject.set(x, "default.context", js.undefined)
        
        inline def setDefaultDotprefix(value: String): Self = StObject.set(x, "default.prefix", value.asInstanceOf[js.Any])
        
        inline def setDefaultDotprefixUndefined: Self = StObject.set(x, "default.prefix", js.undefined)
        
        inline def setDefaultDotstatus(value: String): Self = StObject.set(x, "default.status", value.asInstanceOf[js.Any])
        
        inline def setDefaultDotstatusUndefined: Self = StObject.set(x, "default.status", js.undefined)
        
        inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
        
        inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
        
        inline def setIndexLabel(value: String): Self = StObject.set(x, "indexLabel", value.asInstanceOf[js.Any])
        
        inline def setIndexLabelUndefined: Self = StObject.set(x, "indexLabel", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setMarkdown(value: Boolean | DocMarkdownConfig): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
        
        inline def setMarkdownDotbreaks(value: Boolean): Self = StObject.set(x, "markdown.breaks", value.asInstanceOf[js.Any])
        
        inline def setMarkdownDotbreaksUndefined: Self = StObject.set(x, "markdown.breaks", js.undefined)
        
        inline def setMarkdownDotgfm(value: Boolean): Self = StObject.set(x, "markdown.gfm", value.asInstanceOf[js.Any])
        
        inline def setMarkdownDotgfmUndefined: Self = StObject.set(x, "markdown.gfm", js.undefined)
        
        inline def setMarkdownDotpedantic(value: Boolean): Self = StObject.set(x, "markdown.pedantic", value.asInstanceOf[js.Any])
        
        inline def setMarkdownDotpedanticUndefined: Self = StObject.set(x, "markdown.pedantic", js.undefined)
        
        inline def setMarkdownDotsanitize(value: Boolean): Self = StObject.set(x, "markdown.sanitize", value.asInstanceOf[js.Any])
        
        inline def setMarkdownDotsanitizeUndefined: Self = StObject.set(x, "markdown.sanitize", js.undefined)
        
        inline def setMarkdownDotsmartLists(value: Boolean): Self = StObject.set(x, "markdown.smartLists", value.asInstanceOf[js.Any])
        
        inline def setMarkdownDotsmartListsUndefined: Self = StObject.set(x, "markdown.smartLists", js.undefined)
        
        inline def setMarkdownDotsmartypants(value: Boolean): Self = StObject.set(x, "markdown.smartypants", value.asInstanceOf[js.Any])
        
        inline def setMarkdownDotsmartypantsUndefined: Self = StObject.set(x, "markdown.smartypants", js.undefined)
        
        inline def setMarkdownDottables(value: Boolean): Self = StObject.set(x, "markdown.tables", value.asInstanceOf[js.Any])
        
        inline def setMarkdownDottablesUndefined: Self = StObject.set(x, "markdown.tables", js.undefined)
        
        inline def setMarkdownUndefined: Self = StObject.set(x, "markdown", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setStatuses(value: StringDictionary[StatusInfo]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
        
        inline def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait DocDefaultConfig extends StObject {
      
      var context: js.UndefOr[js.Any] = js.undefined
      
      var prefix: js.UndefOr[String] = js.undefined
      
      var status: js.UndefOr[String] = js.undefined
    }
    object DocDefaultConfig {
      
      inline def apply(): DocDefaultConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DocDefaultConfig]
      }
      
      extension [Self <: DocDefaultConfig](x: Self) {
        
        inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
        
        inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    trait DocMarkdownConfig extends StObject {
      
      var breaks: js.UndefOr[Boolean] = js.undefined
      
      var gfm: js.UndefOr[Boolean] = js.undefined
      
      var pedantic: js.UndefOr[Boolean] = js.undefined
      
      var sanitize: js.UndefOr[Boolean] = js.undefined
      
      var smartLists: js.UndefOr[Boolean] = js.undefined
      
      var smartypants: js.UndefOr[Boolean] = js.undefined
      
      var tables: js.UndefOr[Boolean] = js.undefined
    }
    object DocMarkdownConfig {
      
      inline def apply(): DocMarkdownConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DocMarkdownConfig]
      }
      
      extension [Self <: DocMarkdownConfig](x: Self) {
        
        inline def setBreaks(value: Boolean): Self = StObject.set(x, "breaks", value.asInstanceOf[js.Any])
        
        inline def setBreaksUndefined: Self = StObject.set(x, "breaks", js.undefined)
        
        inline def setGfm(value: Boolean): Self = StObject.set(x, "gfm", value.asInstanceOf[js.Any])
        
        inline def setGfmUndefined: Self = StObject.set(x, "gfm", js.undefined)
        
        inline def setPedantic(value: Boolean): Self = StObject.set(x, "pedantic", value.asInstanceOf[js.Any])
        
        inline def setPedanticUndefined: Self = StObject.set(x, "pedantic", js.undefined)
        
        inline def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
        
        inline def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
        
        inline def setSmartLists(value: Boolean): Self = StObject.set(x, "smartLists", value.asInstanceOf[js.Any])
        
        inline def setSmartListsUndefined: Self = StObject.set(x, "smartLists", js.undefined)
        
        inline def setSmartypants(value: Boolean): Self = StObject.set(x, "smartypants", value.asInstanceOf[js.Any])
        
        inline def setSmartypantsUndefined: Self = StObject.set(x, "smartypants", js.undefined)
        
        inline def setTables(value: Boolean): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
        
        inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
      }
    }
    
    @js.native
    trait DocSource extends EntitySource[Doc, DocConfig] {
      
      def docs(): this.type = js.native
      
      def isPage(file: String): Boolean = js.native
      
      def isTemplate(file: String): Boolean = js.native
      
      def pages(): this.type = js.native
      
      def render(page: String): js.Promise[String] = js.native
      def render(page: String, context: js.Any): js.Promise[String] = js.native
      def render(page: String, context: js.Any, env: js.Any): js.Promise[String] = js.native
      def render(page: String, context: js.Any, env: js.Any, opts: js.Object): js.Promise[String] = js.native
      def render(page: String, context: js.Any, env: Unit, opts: js.Object): js.Promise[String] = js.native
      def render(page: String, context: Unit, env: js.Any): js.Promise[String] = js.native
      def render(page: String, context: Unit, env: js.Any, opts: js.Object): js.Promise[String] = js.native
      def render(page: String, context: Unit, env: Unit, opts: js.Object): js.Promise[String] = js.native
      def render(page: typings.frctlFractal.mod.fractal.api.files.File): js.Promise[String] = js.native
      def render(page: typings.frctlFractal.mod.fractal.api.files.File, context: js.Any): js.Promise[String] = js.native
      def render(page: typings.frctlFractal.mod.fractal.api.files.File, context: js.Any, env: js.Any): js.Promise[String] = js.native
      def render(
        page: typings.frctlFractal.mod.fractal.api.files.File,
        context: js.Any,
        env: js.Any,
        opts: js.Object
      ): js.Promise[String] = js.native
      def render(page: typings.frctlFractal.mod.fractal.api.files.File, context: js.Any, env: Unit, opts: js.Object): js.Promise[String] = js.native
      def render(page: typings.frctlFractal.mod.fractal.api.files.File, context: Unit, env: js.Any): js.Promise[String] = js.native
      def render(page: typings.frctlFractal.mod.fractal.api.files.File, context: Unit, env: js.Any, opts: js.Object): js.Promise[String] = js.native
      def render(page: typings.frctlFractal.mod.fractal.api.files.File, context: Unit, env: Unit, opts: js.Object): js.Promise[String] = js.native
      
      def renderString(str: String, context: js.Any): js.Promise[String] = js.native
      def renderString(str: String, context: js.Any, env: js.Any): js.Promise[String] = js.native
      
      def resolve(context: js.Any): js.Any = js.native
      
      def toc(page: typings.frctlFractal.mod.fractal.api.files.File): js.Promise[String] = js.native
      def toc(page: typings.frctlFractal.mod.fractal.api.files.File, maxDepth: Double): js.Promise[String] = js.native
    }
  }
  
  object variants {
    
    @JSImport("@frctl/fractal", "fractal.api.variants.Variant")
    @js.native
    class Variant protected () extends Entity {
      def this(config: js.Object, view: js.Any, resources: AssetCollection, parent: Component) = this()
      
      val baseHandle: String = js.native
      
      def component(): Component = js.native
      
      val content: String = js.native
      
      def defaultVariant(): this.type = js.native
      
      var editorMode: String = js.native
      
      var editorScope: String = js.native
      
      def getContent(): js.Promise[String] = js.native
      
      def getContentSync(): String = js.native
      
      def getPreviewContent(): js.Promise[String] = js.native
      
      def getPreviewContext(): js.Promise[js.Any] = js.native
      
      val isAsset: Unit = js.native
      
      @JSName("isCollection")
      val isCollection_Variant: Unit = js.native
      
      @JSName("isComponent")
      val isComponent_Variant: Unit = js.native
      
      var isDefault: Boolean = js.native
      
      @JSName("isDoc")
      val isDoc_Variant: Unit = js.native
      
      val isFile: `true` = js.native
      
      @JSName("isVariant")
      val isVariant_Variant: `true` = js.native
      
      var lang: String = js.native
      
      val notes: String = js.native
      
      val referencedBy: js.Array[js.Any] = js.native
      
      val references: js.Array[js.Any] = js.native
      
      var relViewPath: String = js.native
      
      def render(context: js.Any): js.Promise[String] = js.native
      def render(context: js.Any, env: js.Any): js.Promise[String] = js.native
      def render(context: js.Any, env: js.Any, opts: js.Any): js.Promise[String] = js.native
      def render(context: js.Any, env: Unit, opts: js.Any): js.Promise[String] = js.native
      
      def resources(): AssetCollection = js.native
      
      def resourcesJSON(): js.Object = js.native
      
      val siblings: VariantCollection = js.native
      
      def variant(): this.type = js.native
      
      var view: js.Any = js.native
      
      var viewDir: String = js.native
      
      var viewPath: String = js.native
    }
    object Variant {
      
      @JSImport("@frctl/fractal", "fractal.api.variants.Variant")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def create(config: js.Object, view: js.Any, resources: AssetCollection, parent: Component): Variant = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], view.asInstanceOf[js.Any], resources.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Variant]
    }
    
    @js.native
    trait VariantCollection extends EntityCollection[Variant] {
      
      def default(): Variant = js.native
      
      def getCOllatedContext(): js.Promise[js.Any] = js.native
      
      def getCollatedContent(): js.Promise[String] = js.native
      
      def getCollatedContentSync(): String = js.native
      
      val referencedBy: js.Array[js.Any] = js.native
      
      val references: js.Array[js.Any] = js.native
    }
  }
  
  object files {
    
    trait File extends StObject {
      
      var base: String
      
      val contents: Buffer
      
      var cwd: String
      
      var dir: String
      
      var editorMode: String
      
      var editorScope: String
      
      var ext: String
      
      def getContent(): js.Promise[String]
      
      def getContentSync(): String
      
      def getContext(): js.Any
      
      var githubColor: String
      
      var handle: String
      
      var id: String
      
      val isAsset: Unit
      
      var isBinary: Boolean
      
      val isCollection: Unit
      
      val isComponent: Unit
      
      val isDoc: Unit
      
      val isFile: `true`
      
      val isImage: Boolean
      
      val isVariant: Unit
      
      var lang: String
      
      var mime: String
      
      var name: String
      
      var path: String
      
      def read(): js.Promise[String]
      
      def readSync(): String
      
      var relPath: String
      
      var stat: Stats | Null
      
      def toVinyl(): typings.vinyl.mod.File
    }
    object File {
      
      inline def apply(
        base: String,
        contents: Buffer,
        cwd: String,
        dir: String,
        editorMode: String,
        editorScope: String,
        ext: String,
        getContent: () => js.Promise[String],
        getContentSync: () => String,
        getContext: () => js.Any,
        githubColor: String,
        handle: String,
        id: String,
        isAsset: Unit,
        isBinary: Boolean,
        isCollection: Unit,
        isComponent: Unit,
        isDoc: Unit,
        isImage: Boolean,
        isVariant: Unit,
        lang: String,
        mime: String,
        name: String,
        path: String,
        read: () => js.Promise[String],
        readSync: () => String,
        relPath: String,
        toVinyl: () => typings.vinyl.mod.File
      ): typings.frctlFractal.mod.fractal.api.files.File = {
        val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], editorMode = editorMode.asInstanceOf[js.Any], editorScope = editorScope.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], getContent = js.Any.fromFunction0(getContent), getContentSync = js.Any.fromFunction0(getContentSync), getContext = js.Any.fromFunction0(getContext), githubColor = githubColor.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isAsset = isAsset.asInstanceOf[js.Any], isBinary = isBinary.asInstanceOf[js.Any], isCollection = isCollection.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isDoc = isDoc.asInstanceOf[js.Any], isFile = true, isImage = isImage.asInstanceOf[js.Any], isVariant = isVariant.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], read = js.Any.fromFunction0(read), readSync = js.Any.fromFunction0(readSync), relPath = relPath.asInstanceOf[js.Any], toVinyl = js.Any.fromFunction0(toVinyl), stat = null)
        __obj.asInstanceOf[typings.frctlFractal.mod.fractal.api.files.File]
      }
      
      extension [Self <: typings.frctlFractal.mod.fractal.api.files.File](x: Self) {
        
        inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
        
        inline def setContents(value: Buffer): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
        
        inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
        
        inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
        
        inline def setEditorMode(value: String): Self = StObject.set(x, "editorMode", value.asInstanceOf[js.Any])
        
        inline def setEditorScope(value: String): Self = StObject.set(x, "editorScope", value.asInstanceOf[js.Any])
        
        inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
        
        inline def setGetContent(value: () => js.Promise[String]): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
        
        inline def setGetContentSync(value: () => String): Self = StObject.set(x, "getContentSync", js.Any.fromFunction0(value))
        
        inline def setGetContext(value: () => js.Any): Self = StObject.set(x, "getContext", js.Any.fromFunction0(value))
        
        inline def setGithubColor(value: String): Self = StObject.set(x, "githubColor", value.asInstanceOf[js.Any])
        
        inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIsAsset(value: Unit): Self = StObject.set(x, "isAsset", value.asInstanceOf[js.Any])
        
        inline def setIsBinary(value: Boolean): Self = StObject.set(x, "isBinary", value.asInstanceOf[js.Any])
        
        inline def setIsCollection(value: Unit): Self = StObject.set(x, "isCollection", value.asInstanceOf[js.Any])
        
        inline def setIsComponent(value: Unit): Self = StObject.set(x, "isComponent", value.asInstanceOf[js.Any])
        
        inline def setIsDoc(value: Unit): Self = StObject.set(x, "isDoc", value.asInstanceOf[js.Any])
        
        inline def setIsFile(value: `true`): Self = StObject.set(x, "isFile", value.asInstanceOf[js.Any])
        
        inline def setIsImage(value: Boolean): Self = StObject.set(x, "isImage", value.asInstanceOf[js.Any])
        
        inline def setIsVariant(value: Unit): Self = StObject.set(x, "isVariant", value.asInstanceOf[js.Any])
        
        inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
        
        inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setRead(value: () => js.Promise[String]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
        
        inline def setReadSync(value: () => String): Self = StObject.set(x, "readSync", js.Any.fromFunction0(value))
        
        inline def setRelPath(value: String): Self = StObject.set(x, "relPath", value.asInstanceOf[js.Any])
        
        inline def setStat(value: Stats): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
        
        inline def setStatNull: Self = StObject.set(x, "stat", null)
        
        inline def setToVinyl(value: () => typings.vinyl.mod.File): Self = StObject.set(x, "toVinyl", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait FileCollection
      extends StObject
         with Collection[typings.frctlFractal.mod.fractal.api.files.File] {
      
      def files(): this.type = js.native
      
      def gulpify(): Readable = js.native
      
      def `match`(test: String): this.type = js.native
      def `match`(test: js.Array[String | RegExp]): this.type = js.native
      def `match`(test: RegExp): this.type = js.native
      
      def matchItems(items: Collection[typings.frctlFractal.mod.fractal.api.files.File], test: String): typings.frctlFractal.mod.fractal.api.files.File = js.native
      def matchItems(
        items: Collection[typings.frctlFractal.mod.fractal.api.files.File],
        test: js.Array[String | RegExp]
      ): typings.frctlFractal.mod.fractal.api.files.File = js.native
      def matchItems(items: Collection[typings.frctlFractal.mod.fractal.api.files.File], test: RegExp): typings.frctlFractal.mod.fractal.api.files.File = js.native
      
      def toVinylArray(): js.Array[typings.vinyl.mod.File] = js.native
      
      def toVinylStream(): Readable = js.native
    }
  }
}
