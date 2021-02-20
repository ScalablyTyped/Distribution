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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object api {
  
  object assets {
    
    @JSImport("@frctl/fractal", "fractal.api.assets.Asset")
    @js.native
    class Asset () extends Entity {
      
      val isAsset: `true` = js.native
      
      @JSName("isCollection")
      val isCollection_Asset: js.UndefOr[scala.Nothing] = js.native
      
      @JSName("isComponent")
      val isComponent_Asset: js.UndefOr[scala.Nothing] = js.native
      
      @JSName("isDoc")
      val isDoc_Asset: js.UndefOr[scala.Nothing] = js.native
      
      val isFile: js.UndefOr[scala.Nothing] = js.native
      
      @JSName("isVariant")
      val isVariant_Asset: js.UndefOr[scala.Nothing] = js.native
      
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
      
      def getPreviewContext(): js.Promise[_] = js.native
      
      def hasTag(tag: String): Boolean = js.native
      
      val isAsset: js.UndefOr[scala.Nothing] = js.native
      
      def isCollated(): Boolean = js.native
      
      @JSName("isCollection")
      val isCollection_Component: js.UndefOr[scala.Nothing] = js.native
      
      @JSName("isComponent")
      val isComponent_Component: `true` = js.native
      
      @JSName("isDoc")
      val isDoc_Component: js.UndefOr[scala.Nothing] = js.native
      
      val isFile: js.UndefOr[scala.Nothing] = js.native
      
      @JSName("isVariant")
      val isVariant_Component: js.UndefOr[scala.Nothing] = js.native
      
      var lang: String = js.native
      
      val notes: String = js.native
      
      val referencedBy: js.Array[_] = js.native
      
      val references: js.Array[_] = js.native
      
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
      
      /* static member */
      @JSImport("@frctl/fractal", "fractal.api.components.Component.create")
      @js.native
      def create(config: js.Object, files: FileCollection, resources: AssetCollection, parent: Entity): IterableIterator[js.Object | VariantCollection | Component] = js.native
    }
    
    type Collator = js.Function2[/* markup */ String, /* item */ Handle, String]
    
    @js.native
    trait ComponentCollection extends EntityCollection[Component] {
      
      def components(): this.type = js.native
      
      def variants(): this.type = js.native
    }
    
    @js.native
    trait ComponentConfig extends StObject {
      
      var default: js.UndefOr[ComponentDefaultConfig] = js.native
      
      @JSName("default.collated")
      var defaultDotcollated: js.UndefOr[Boolean] = js.native
      
      @JSName("default.collator")
      var defaultDotcollator: js.UndefOr[Collator] = js.native
      
      @JSName("default.context")
      var defaultDotcontext: js.UndefOr[js.Any] = js.native
      
      @JSName("default.display")
      var defaultDotdisplay: js.UndefOr[js.Any] = js.native
      
      @JSName("default.prefix")
      var defaultDotprefix: js.UndefOr[String] = js.native
      
      @JSName("default.preview")
      var defaultDotpreview: js.UndefOr[String] = js.native
      
      @JSName("default.status")
      var defaultDotstatus: js.UndefOr[String] = js.native
      
      var ext: js.UndefOr[String] = js.native
      
      var label: js.UndefOr[String] = js.native
      
      var path: js.UndefOr[String] = js.native
      
      var statuses: js.UndefOr[StringDictionary[StatusInfo]] = js.native
      
      var title: js.UndefOr[String] = js.native
      
      var `yield`: js.UndefOr[String] = js.native
    }
    object ComponentConfig {
      
      @scala.inline
      def apply(): ComponentConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ComponentConfig]
      }
      
      @scala.inline
      implicit class ComponentConfigMutableBuilder[Self <: ComponentConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefault(value: ComponentDefaultConfig): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultDotcollated(value: Boolean): Self = StObject.set(x, "default.collated", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultDotcollatedUndefined: Self = StObject.set(x, "default.collated", js.undefined)
        
        @scala.inline
        def setDefaultDotcollator(value: (/* markup */ String, /* item */ Handle) => String): Self = StObject.set(x, "default.collator", js.Any.fromFunction2(value))
        
        @scala.inline
        def setDefaultDotcollatorUndefined: Self = StObject.set(x, "default.collator", js.undefined)
        
        @scala.inline
        def setDefaultDotcontext(value: js.Any): Self = StObject.set(x, "default.context", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultDotcontextUndefined: Self = StObject.set(x, "default.context", js.undefined)
        
        @scala.inline
        def setDefaultDotdisplay(value: js.Any): Self = StObject.set(x, "default.display", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultDotdisplayUndefined: Self = StObject.set(x, "default.display", js.undefined)
        
        @scala.inline
        def setDefaultDotprefix(value: String): Self = StObject.set(x, "default.prefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultDotprefixUndefined: Self = StObject.set(x, "default.prefix", js.undefined)
        
        @scala.inline
        def setDefaultDotpreview(value: String): Self = StObject.set(x, "default.preview", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultDotpreviewUndefined: Self = StObject.set(x, "default.preview", js.undefined)
        
        @scala.inline
        def setDefaultDotstatus(value: String): Self = StObject.set(x, "default.status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultDotstatusUndefined: Self = StObject.set(x, "default.status", js.undefined)
        
        @scala.inline
        def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        @scala.inline
        def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setStatuses(value: StringDictionary[StatusInfo]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setYield(value: String): Self = StObject.set(x, "yield", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setYieldUndefined: Self = StObject.set(x, "yield", js.undefined)
      }
    }
    
    @js.native
    trait ComponentDefaultConfig extends StObject {
      
      var collated: js.UndefOr[Boolean] = js.native
      
      var collator: js.UndefOr[Collator] = js.native
      
      var context: js.UndefOr[js.Any] = js.native
      
      var display: js.UndefOr[js.Any] = js.native
      
      var prefix: js.UndefOr[String] = js.native
      
      var preview: js.UndefOr[String] = js.native
      
      var status: js.UndefOr[String] = js.native
    }
    object ComponentDefaultConfig {
      
      @scala.inline
      def apply(): ComponentDefaultConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ComponentDefaultConfig]
      }
      
      @scala.inline
      implicit class ComponentDefaultConfigMutableBuilder[Self <: ComponentDefaultConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCollated(value: Boolean): Self = StObject.set(x, "collated", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCollatedUndefined: Self = StObject.set(x, "collated", js.undefined)
        
        @scala.inline
        def setCollator(value: (/* markup */ String, /* item */ Handle) => String): Self = StObject.set(x, "collator", js.Any.fromFunction2(value))
        
        @scala.inline
        def setCollatorUndefined: Self = StObject.set(x, "collator", js.undefined)
        
        @scala.inline
        def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
        
        @scala.inline
        def setDisplay(value: js.Any): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
        
        @scala.inline
        def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        @scala.inline
        def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
        
        @scala.inline
        def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    @js.native
    trait ComponentSource extends EntitySource[Component, ComponentConfig] {
      
      def components(): js.Array[Component] = js.native
      
      def find(): js.Any = js.native
      
      def findFile(filePath: String): js.UndefOr[typings.frctlFractal.mod.fractal.api.files.File] = js.native
      
      def getReferencesOf(target: Alias): js.Array[_] = js.native
      
      def render(entity: String, context: js.Any): js.Promise[String] = js.native
      def render(entity: String, context: js.Any, env: js.UndefOr[scala.Nothing], opts: js.Object): js.Promise[String] = js.native
      def render(entity: String, context: js.Any, env: js.Any): js.Promise[String] = js.native
      def render(entity: String, context: js.Any, env: js.Any, opts: js.Object): js.Promise[String] = js.native
      def render(entity: Entity, context: js.Any): js.Promise[String] = js.native
      def render(entity: Entity, context: js.Any, env: js.UndefOr[scala.Nothing], opts: js.Object): js.Promise[String] = js.native
      def render(entity: Entity, context: js.Any, env: js.Any): js.Promise[String] = js.native
      def render(entity: Entity, context: js.Any, env: js.Any, opts: js.Object): js.Promise[String] = js.native
      
      def renderPreview(entity: String): js.Promise[String] = js.native
      def renderPreview(entity: String, preview: js.UndefOr[scala.Nothing], env: js.Any): js.Promise[String] = js.native
      def renderPreview(entity: String, preview: Boolean): js.Promise[String] = js.native
      def renderPreview(entity: String, preview: Boolean, env: js.Any): js.Promise[String] = js.native
      def renderPreview(entity: Entity): js.Promise[String] = js.native
      def renderPreview(entity: Entity, preview: js.UndefOr[scala.Nothing], env: js.Any): js.Promise[String] = js.native
      def renderPreview(entity: Entity, preview: Boolean): js.Promise[String] = js.native
      def renderPreview(entity: Entity, preview: Boolean, env: js.Any): js.Promise[String] = js.native
      
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
      
      val isAsset: js.UndefOr[scala.Nothing] = js.native
      
      @JSName("isCollection")
      val isCollection_Doc: js.UndefOr[scala.Nothing] = js.native
      
      @JSName("isComponent")
      val isComponent_Doc: js.UndefOr[scala.Nothing] = js.native
      
      @JSName("isDoc")
      val isDoc_Doc: `true` = js.native
      
      val isFile: js.UndefOr[scala.Nothing] = js.native
      
      val isIndex: Boolean = js.native
      
      @JSName("isVariant")
      val isVariant_Doc: js.UndefOr[scala.Nothing] = js.native
      
      def render(context: js.Any): js.Promise[String] = js.native
      def render(context: js.Any, env: js.UndefOr[scala.Nothing], opts: js.Any): js.Promise[String] = js.native
      def render(context: js.Any, env: js.Any): js.Promise[String] = js.native
      def render(context: js.Any, env: js.Any, opts: js.Any): js.Promise[String] = js.native
      
      def toc(): js.Promise[String] = js.native
      def toc(maxDepth: Double): js.Promise[String] = js.native
    }
    object Doc {
      
      /* static member */
      @JSImport("@frctl/fractal", "fractal.api.docs.Doc.create")
      @js.native
      def create(config: js.Any, content: String, parent: Entity): Doc = js.native
    }
    
    @js.native
    trait DocCollection extends EntityCollection[Doc] {
      
      def pages(): this.type = js.native
    }
    
    @js.native
    trait DocConfig extends StObject {
      
      var default: js.UndefOr[DocDefaultConfig] = js.native
      
      @JSName("default.context")
      var defaultDotcontext: js.UndefOr[js.Any] = js.native
      
      @JSName("default.prefix")
      var defaultDotprefix: js.UndefOr[String] = js.native
      
      @JSName("default.status")
      var defaultDotstatus: js.UndefOr[String] = js.native
      
      var ext: js.UndefOr[String] = js.native
      
      var indexLabel: js.UndefOr[String] = js.native
      
      var label: js.UndefOr[String] = js.native
      
      var markdown: js.UndefOr[Boolean | DocMarkdownConfig] = js.native
      
      @JSName("markdown.breaks")
      var markdownDotbreaks: js.UndefOr[Boolean] = js.native
      
      @JSName("markdown.gfm")
      var markdownDotgfm: js.UndefOr[Boolean] = js.native
      
      @JSName("markdown.pedantic")
      var markdownDotpedantic: js.UndefOr[Boolean] = js.native
      
      @JSName("markdown.sanitize")
      var markdownDotsanitize: js.UndefOr[Boolean] = js.native
      
      @JSName("markdown.smartLists")
      var markdownDotsmartLists: js.UndefOr[Boolean] = js.native
      
      @JSName("markdown.smartypants")
      var markdownDotsmartypants: js.UndefOr[Boolean] = js.native
      
      @JSName("markdown.tables")
      var markdownDottables: js.UndefOr[Boolean] = js.native
      
      var path: js.UndefOr[String] = js.native
      
      var statuses: js.UndefOr[StringDictionary[StatusInfo]] = js.native
      
      var title: js.UndefOr[String] = js.native
    }
    object DocConfig {
      
      @scala.inline
      def apply(): DocConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DocConfig]
      }
      
      @scala.inline
      implicit class DocConfigMutableBuilder[Self <: DocConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefault(value: DocDefaultConfig): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultDotcontext(value: js.Any): Self = StObject.set(x, "default.context", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultDotcontextUndefined: Self = StObject.set(x, "default.context", js.undefined)
        
        @scala.inline
        def setDefaultDotprefix(value: String): Self = StObject.set(x, "default.prefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultDotprefixUndefined: Self = StObject.set(x, "default.prefix", js.undefined)
        
        @scala.inline
        def setDefaultDotstatus(value: String): Self = StObject.set(x, "default.status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultDotstatusUndefined: Self = StObject.set(x, "default.status", js.undefined)
        
        @scala.inline
        def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        @scala.inline
        def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
        
        @scala.inline
        def setIndexLabel(value: String): Self = StObject.set(x, "indexLabel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndexLabelUndefined: Self = StObject.set(x, "indexLabel", js.undefined)
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        @scala.inline
        def setMarkdown(value: Boolean | DocMarkdownConfig): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkdownDotbreaks(value: Boolean): Self = StObject.set(x, "markdown.breaks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkdownDotbreaksUndefined: Self = StObject.set(x, "markdown.breaks", js.undefined)
        
        @scala.inline
        def setMarkdownDotgfm(value: Boolean): Self = StObject.set(x, "markdown.gfm", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkdownDotgfmUndefined: Self = StObject.set(x, "markdown.gfm", js.undefined)
        
        @scala.inline
        def setMarkdownDotpedantic(value: Boolean): Self = StObject.set(x, "markdown.pedantic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkdownDotpedanticUndefined: Self = StObject.set(x, "markdown.pedantic", js.undefined)
        
        @scala.inline
        def setMarkdownDotsanitize(value: Boolean): Self = StObject.set(x, "markdown.sanitize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkdownDotsanitizeUndefined: Self = StObject.set(x, "markdown.sanitize", js.undefined)
        
        @scala.inline
        def setMarkdownDotsmartLists(value: Boolean): Self = StObject.set(x, "markdown.smartLists", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkdownDotsmartListsUndefined: Self = StObject.set(x, "markdown.smartLists", js.undefined)
        
        @scala.inline
        def setMarkdownDotsmartypants(value: Boolean): Self = StObject.set(x, "markdown.smartypants", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkdownDotsmartypantsUndefined: Self = StObject.set(x, "markdown.smartypants", js.undefined)
        
        @scala.inline
        def setMarkdownDottables(value: Boolean): Self = StObject.set(x, "markdown.tables", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkdownDottablesUndefined: Self = StObject.set(x, "markdown.tables", js.undefined)
        
        @scala.inline
        def setMarkdownUndefined: Self = StObject.set(x, "markdown", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setStatuses(value: StringDictionary[StatusInfo]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait DocDefaultConfig extends StObject {
      
      var context: js.UndefOr[js.Any] = js.native
      
      var prefix: js.UndefOr[String] = js.native
      
      var status: js.UndefOr[String] = js.native
    }
    object DocDefaultConfig {
      
      @scala.inline
      def apply(): DocDefaultConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DocDefaultConfig]
      }
      
      @scala.inline
      implicit class DocDefaultConfigMutableBuilder[Self <: DocDefaultConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
        
        @scala.inline
        def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        @scala.inline
        def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    @js.native
    trait DocMarkdownConfig extends StObject {
      
      var breaks: js.UndefOr[Boolean] = js.native
      
      var gfm: js.UndefOr[Boolean] = js.native
      
      var pedantic: js.UndefOr[Boolean] = js.native
      
      var sanitize: js.UndefOr[Boolean] = js.native
      
      var smartLists: js.UndefOr[Boolean] = js.native
      
      var smartypants: js.UndefOr[Boolean] = js.native
      
      var tables: js.UndefOr[Boolean] = js.native
    }
    object DocMarkdownConfig {
      
      @scala.inline
      def apply(): DocMarkdownConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DocMarkdownConfig]
      }
      
      @scala.inline
      implicit class DocMarkdownConfigMutableBuilder[Self <: DocMarkdownConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBreaks(value: Boolean): Self = StObject.set(x, "breaks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBreaksUndefined: Self = StObject.set(x, "breaks", js.undefined)
        
        @scala.inline
        def setGfm(value: Boolean): Self = StObject.set(x, "gfm", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGfmUndefined: Self = StObject.set(x, "gfm", js.undefined)
        
        @scala.inline
        def setPedantic(value: Boolean): Self = StObject.set(x, "pedantic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPedanticUndefined: Self = StObject.set(x, "pedantic", js.undefined)
        
        @scala.inline
        def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
        
        @scala.inline
        def setSmartLists(value: Boolean): Self = StObject.set(x, "smartLists", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSmartListsUndefined: Self = StObject.set(x, "smartLists", js.undefined)
        
        @scala.inline
        def setSmartypants(value: Boolean): Self = StObject.set(x, "smartypants", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSmartypantsUndefined: Self = StObject.set(x, "smartypants", js.undefined)
        
        @scala.inline
        def setTables(value: Boolean): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
      }
    }
    
    @js.native
    trait DocSource extends EntitySource[Doc, DocConfig] {
      
      def docs(): this.type = js.native
      
      def isPage(file: String): Boolean = js.native
      
      def isTemplate(file: String): Boolean = js.native
      
      def pages(): this.type = js.native
      
      def render(page: String): js.Promise[String] = js.native
      def render(page: String, context: js.UndefOr[scala.Nothing], env: js.UndefOr[scala.Nothing], opts: js.Object): js.Promise[String] = js.native
      def render(page: String, context: js.UndefOr[scala.Nothing], env: js.Any): js.Promise[String] = js.native
      def render(page: String, context: js.UndefOr[scala.Nothing], env: js.Any, opts: js.Object): js.Promise[String] = js.native
      def render(page: String, context: js.Any): js.Promise[String] = js.native
      def render(page: String, context: js.Any, env: js.UndefOr[scala.Nothing], opts: js.Object): js.Promise[String] = js.native
      def render(page: String, context: js.Any, env: js.Any): js.Promise[String] = js.native
      def render(page: String, context: js.Any, env: js.Any, opts: js.Object): js.Promise[String] = js.native
      def render(page: typings.frctlFractal.mod.fractal.api.files.File): js.Promise[String] = js.native
      def render(
        page: typings.frctlFractal.mod.fractal.api.files.File,
        context: js.UndefOr[scala.Nothing],
        env: js.UndefOr[scala.Nothing],
        opts: js.Object
      ): js.Promise[String] = js.native
      def render(
        page: typings.frctlFractal.mod.fractal.api.files.File,
        context: js.UndefOr[scala.Nothing],
        env: js.Any
      ): js.Promise[String] = js.native
      def render(
        page: typings.frctlFractal.mod.fractal.api.files.File,
        context: js.UndefOr[scala.Nothing],
        env: js.Any,
        opts: js.Object
      ): js.Promise[String] = js.native
      def render(page: typings.frctlFractal.mod.fractal.api.files.File, context: js.Any): js.Promise[String] = js.native
      def render(
        page: typings.frctlFractal.mod.fractal.api.files.File,
        context: js.Any,
        env: js.UndefOr[scala.Nothing],
        opts: js.Object
      ): js.Promise[String] = js.native
      def render(page: typings.frctlFractal.mod.fractal.api.files.File, context: js.Any, env: js.Any): js.Promise[String] = js.native
      def render(
        page: typings.frctlFractal.mod.fractal.api.files.File,
        context: js.Any,
        env: js.Any,
        opts: js.Object
      ): js.Promise[String] = js.native
      
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
      
      def getPreviewContext(): js.Promise[_] = js.native
      
      val isAsset: js.UndefOr[scala.Nothing] = js.native
      
      @JSName("isCollection")
      val isCollection_Variant: js.UndefOr[scala.Nothing] = js.native
      
      @JSName("isComponent")
      val isComponent_Variant: js.UndefOr[scala.Nothing] = js.native
      
      var isDefault: Boolean = js.native
      
      @JSName("isDoc")
      val isDoc_Variant: js.UndefOr[scala.Nothing] = js.native
      
      val isFile: `true` = js.native
      
      @JSName("isVariant")
      val isVariant_Variant: `true` = js.native
      
      var lang: String = js.native
      
      val notes: String = js.native
      
      val referencedBy: js.Array[_] = js.native
      
      val references: js.Array[_] = js.native
      
      var relViewPath: String = js.native
      
      def render(context: js.Any): js.Promise[String] = js.native
      def render(context: js.Any, env: js.UndefOr[scala.Nothing], opts: js.Any): js.Promise[String] = js.native
      def render(context: js.Any, env: js.Any): js.Promise[String] = js.native
      def render(context: js.Any, env: js.Any, opts: js.Any): js.Promise[String] = js.native
      
      def resources(): AssetCollection = js.native
      
      def resourcesJSON(): js.Object = js.native
      
      val siblings: VariantCollection = js.native
      
      def variant(): this.type = js.native
      
      var view: js.Any = js.native
      
      var viewDir: String = js.native
      
      var viewPath: String = js.native
    }
    object Variant {
      
      /* static member */
      @JSImport("@frctl/fractal", "fractal.api.variants.Variant.create")
      @js.native
      def create(config: js.Object, view: js.Any, resources: AssetCollection, parent: Component): Variant = js.native
    }
    
    @js.native
    trait VariantCollection extends EntityCollection[Variant] {
      
      def default(): Variant = js.native
      
      def getCOllatedContext(): js.Promise[_] = js.native
      
      def getCollatedContent(): js.Promise[String] = js.native
      
      def getCollatedContentSync(): String = js.native
      
      val referencedBy: js.Array[_] = js.native
      
      val references: js.Array[_] = js.native
    }
  }
  
  object files {
    
    @js.native
    trait File extends StObject {
      
      var base: String = js.native
      
      val contents: Buffer = js.native
      
      var cwd: String = js.native
      
      var dir: String = js.native
      
      var editorMode: String = js.native
      
      var editorScope: String = js.native
      
      var ext: String = js.native
      
      def getContent(): js.Promise[String] = js.native
      
      def getContentSync(): String = js.native
      
      def getContext(): js.Any = js.native
      
      var githubColor: String = js.native
      
      var handle: String = js.native
      
      var id: String = js.native
      
      val isAsset: js.UndefOr[scala.Nothing] = js.native
      
      var isBinary: Boolean = js.native
      
      val isCollection: js.UndefOr[scala.Nothing] = js.native
      
      val isComponent: js.UndefOr[scala.Nothing] = js.native
      
      val isDoc: js.UndefOr[scala.Nothing] = js.native
      
      val isFile: `true` = js.native
      
      val isImage: Boolean = js.native
      
      val isVariant: js.UndefOr[scala.Nothing] = js.native
      
      var lang: String = js.native
      
      var mime: String = js.native
      
      var name: String = js.native
      
      var path: String = js.native
      
      def read(): js.Promise[String] = js.native
      
      def readSync(): String = js.native
      
      var relPath: String = js.native
      
      var stat: Stats | Null = js.native
      
      def toVinyl(): typings.vinyl.mod.File = js.native
    }
    object File {
      
      @scala.inline
      def apply(
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
        isBinary: Boolean,
        isFile: `true`,
        isImage: Boolean,
        lang: String,
        mime: String,
        name: String,
        path: String,
        read: () => js.Promise[String],
        readSync: () => String,
        relPath: String,
        toVinyl: () => typings.vinyl.mod.File
      ): typings.frctlFractal.mod.fractal.api.files.File = {
        val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], editorMode = editorMode.asInstanceOf[js.Any], editorScope = editorScope.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], getContent = js.Any.fromFunction0(getContent), getContentSync = js.Any.fromFunction0(getContentSync), getContext = js.Any.fromFunction0(getContext), githubColor = githubColor.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isBinary = isBinary.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], isImage = isImage.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], read = js.Any.fromFunction0(read), readSync = js.Any.fromFunction0(readSync), relPath = relPath.asInstanceOf[js.Any], toVinyl = js.Any.fromFunction0(toVinyl))
        __obj.asInstanceOf[typings.frctlFractal.mod.fractal.api.files.File]
      }
      
      @scala.inline
      implicit class FileMutableBuilder[Self <: typings.frctlFractal.mod.fractal.api.files.File] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContents(value: Buffer): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEditorMode(value: String): Self = StObject.set(x, "editorMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEditorScope(value: String): Self = StObject.set(x, "editorScope", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGetContent(value: () => js.Promise[String]): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetContentSync(value: () => String): Self = StObject.set(x, "getContentSync", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetContext(value: () => js.Any): Self = StObject.set(x, "getContext", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGithubColor(value: String): Self = StObject.set(x, "githubColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsBinary(value: Boolean): Self = StObject.set(x, "isBinary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsFile(value: `true`): Self = StObject.set(x, "isFile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsImage(value: Boolean): Self = StObject.set(x, "isImage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRead(value: () => js.Promise[String]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
        
        @scala.inline
        def setReadSync(value: () => String): Self = StObject.set(x, "readSync", js.Any.fromFunction0(value))
        
        @scala.inline
        def setRelPath(value: String): Self = StObject.set(x, "relPath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStat(value: Stats): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatNull: Self = StObject.set(x, "stat", null)
        
        @scala.inline
        def setToVinyl(value: () => typings.vinyl.mod.File): Self = StObject.set(x, "toVinyl", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait FileCollection
      extends Collection[typings.frctlFractal.mod.fractal.api.files.File] {
      
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
