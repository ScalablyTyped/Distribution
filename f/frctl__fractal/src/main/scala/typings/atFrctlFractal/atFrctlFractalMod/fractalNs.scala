package typings.atFrctlFractal.atFrctlFractalMod

import org.scalablytyped.runtime.StringDictionary
import typings.atFrctlFractal.Anon_Alias
import typings.atFrctlFractal.Anon_App
import typings.atFrctlFractal.Anon_Cli
import typings.atFrctlFractal.Anon_Current
import typings.atFrctlFractal.Anon_Description
import typings.atFrctlFractal.Anon_ErrorCount
import typings.atFrctlFractal.Anon_Fractal
import typings.atFrctlFractal.Anon_Handle
import typings.atFrctlFractal.Anon_Server
import typings.atFrctlFractal.Anon_ServerSync
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.assetsNs.Asset
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.assetsNs.AssetCollection
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.assetsNs.AssetSource
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.componentsNs.Collator
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.componentsNs.Component
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.componentsNs.ComponentConfig
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.componentsNs.ComponentDefaultConfig
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.docsNs.Doc
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.docsNs.DocConfig
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.docsNs.DocDefaultConfig
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.docsNs.DocMarkdownConfig
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.filesNs.FileCollection
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.variantsNs.Variant
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.variantsNs.VariantCollection
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.cliNs.Console
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.cliNs.Notifier
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.coreNs.StatusInfo
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.EntityCollection
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.EntitySource
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.Collection
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.ConfigurableEmitter
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.Source
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.webNs.Builder
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.webNs.Server
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.webNs.WebBuilderConfig
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.webNs.WebBuilderUrls
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.webNs.WebConfig
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.webNs.WebServerConfig
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.webNs.WebServerSyncOptions
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.webNs.WebStaticConfig
import typings.atFrctlFractal.atFrctlFractalNumbers.`true`
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.fsMod.Stats
import typings.node.streamMod.Readable
import typings.std.Error
import typings.std.IterableIterator
import typings.std.RegExp
import typings.vinyl.vinylMod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "fractal")
@js.native
object fractalNs extends js.Object {
  @js.native
  object Fractal extends js.Object {
    var `new`: typings.atFrctlFractal.atFrctlFractalMod.Fractal = js.native
  }
  
  @JSName("api")
  @js.native
  object apiNs extends js.Object {
    @JSName("assets")
    @js.native
    object assetsNs extends js.Object {
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
        @JSName(scala.scalajs.js.Symbol.iterator)
        var iterator: js.Function0[IterableIterator[AssetSource]] = js.native
        val label: String = js.native
        val title: String = js.native
        def add(name: String, config: js.Any): AssetSource = js.native
        def find(name: String): js.UndefOr[AssetSource] = js.native
        def load(): js.Promise[Unit] = js.native
        def remove(name: String): this.type = js.native
        def sources(): js.Array[AssetSource] = js.native
        def toArray(): js.Array[AssetSource] = js.native
        def toJSON(): js.Object = js.native
        def unwatch(): this.type = js.native
        def visible(): js.Array[AssetSource] = js.native
        def watch(): this.type = js.native
      }
      
    }
    
    @JSName("components")
    @js.native
    object componentsNs extends js.Object {
      @js.native
      class Component protected () extends Entity {
        def this(config: js.Object, files: FileCollection, resources: AssetCollection, parent: Entity) = this()
        val baseHandle: String = js.native
        var configData: String = js.native
        val content: String = js.native
        var defaultName: String = js.native
        var editorMode: String = js.native
        var editorScope: String = js.native
        val isAsset: js.UndefOr[scala.Nothing] = js.native
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
        var viewDir: String = js.native
        var viewPath: String = js.native
        def component(): this.type = js.native
        def flatten(): VariantCollection = js.native
        def getPreviewContent(): js.Promise[String] = js.native
        def getPreviewContext(): js.Promise[_] = js.native
        def hasTag(tag: String): Boolean = js.native
        def isCollated(): Boolean = js.native
        def render(context: js.Any, env: js.Any, opts: js.Any): js.Promise[String] = js.native
        def resources(): AssetCollection = js.native
        def resourcesJSON(): js.Object = js.native
        def setVariants(variantCollection: VariantCollection): Unit = js.native
        def variants(): VariantCollection = js.native
      }
      
      @js.native
      trait ComponentCollection extends EntityCollection[Component] {
        def components(): this.type = js.native
        def variants(): this.type = js.native
      }
      
      trait ComponentConfig extends js.Object {
        var default: js.UndefOr[ComponentDefaultConfig] = js.undefined
        var `default.collated`: js.UndefOr[Boolean] = js.undefined
        var `default.collator`: js.UndefOr[Collator] = js.undefined
        var `default.context`: js.UndefOr[js.Any] = js.undefined
        var `default.display`: js.UndefOr[js.Any] = js.undefined
        var `default.prefix`: js.UndefOr[String] = js.undefined
        var `default.preview`: js.UndefOr[String] = js.undefined
        var `default.status`: js.UndefOr[String] = js.undefined
        var ext: js.UndefOr[String] = js.undefined
        var label: js.UndefOr[String] = js.undefined
        var path: js.UndefOr[String] = js.undefined
        var statuses: js.UndefOr[StringDictionary[StatusInfo]] = js.undefined
        var title: js.UndefOr[String] = js.undefined
        var `yield`: js.UndefOr[String] = js.undefined
      }
      
      trait ComponentDefaultConfig extends js.Object {
        var collated: js.UndefOr[Boolean] = js.undefined
        var collator: js.UndefOr[Collator] = js.undefined
        var context: js.UndefOr[js.Any] = js.undefined
        var display: js.UndefOr[js.Any] = js.undefined
        var prefix: js.UndefOr[String] = js.undefined
        var preview: js.UndefOr[String] = js.undefined
        var status: js.UndefOr[String] = js.undefined
      }
      
      @js.native
      trait ComponentSource extends EntitySource[Component, ComponentConfig] {
        def components(): js.Array[Component] = js.native
        def find(): js.Any = js.native
        def findFile(filePath: String): js.UndefOr[typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.filesNs.File] = js.native
        def getReferencesOf(target: Anon_Alias): js.Array[_] = js.native
        def render(entity: String, context: js.Any): js.Promise[String] = js.native
        def render(entity: String, context: js.Any, env: js.Any): js.Promise[String] = js.native
        def render(entity: String, context: js.Any, env: js.Any, opts: js.Object): js.Promise[String] = js.native
        def render(entity: Entity, context: js.Any): js.Promise[String] = js.native
        def render(entity: Entity, context: js.Any, env: js.Any): js.Promise[String] = js.native
        def render(entity: Entity, context: js.Any, env: js.Any, opts: js.Object): js.Promise[String] = js.native
        def renderPreview(entity: String): js.Promise[String] = js.native
        def renderPreview(entity: String, preview: Boolean): js.Promise[String] = js.native
        def renderPreview(entity: String, preview: Boolean, env: js.Any): js.Promise[String] = js.native
        def renderPreview(entity: Entity): js.Promise[String] = js.native
        def renderPreview(entity: Entity, preview: Boolean): js.Promise[String] = js.native
        def renderPreview(entity: Entity, preview: Boolean, env: js.Any): js.Promise[String] = js.native
        def renderString(str: String, context: js.Any, env: js.Any): js.Promise[String] = js.native
        def resolve(context: js.Any): js.Any = js.native
        def resources(): FileCollection = js.native
        def variants(): this.type = js.native
      }
      
      /* static members */
      @js.native
      object Component extends js.Object {
        def create(config: js.Object, files: FileCollection, resources: AssetCollection, parent: Entity): IterableIterator[js.Object | VariantCollection | Component] = js.native
      }
      
      type Collator = js.Function2[/* markup */ String, /* item */ Anon_Handle, String]
    }
    
    @JSName("docs")
    @js.native
    object docsNs extends js.Object {
      @js.native
      class Doc protected () extends Entity {
        def this(config: js.Any, content: String, parent: Entity) = this()
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
        def getContent(): js.Promise[String] = js.native
        def getContentSync(): String = js.native
        def render(context: js.Any): js.Promise[String] = js.native
        def render(context: js.Any, env: js.Any): js.Promise[String] = js.native
        def render(context: js.Any, env: js.Any, opts: js.Any): js.Promise[String] = js.native
        def toc(): js.Promise[String] = js.native
        def toc(maxDepth: Double): js.Promise[String] = js.native
      }
      
      @js.native
      trait DocCollection extends EntityCollection[Doc] {
        def pages(): this.type = js.native
      }
      
      trait DocConfig extends js.Object {
        var default: js.UndefOr[DocDefaultConfig] = js.undefined
        var `default.context`: js.UndefOr[js.Any] = js.undefined
        var `default.prefix`: js.UndefOr[String] = js.undefined
        var `default.status`: js.UndefOr[String] = js.undefined
        var ext: js.UndefOr[String] = js.undefined
        var indexLabel: js.UndefOr[String] = js.undefined
        var label: js.UndefOr[String] = js.undefined
        var markdown: js.UndefOr[Boolean | DocMarkdownConfig] = js.undefined
        var `markdown.breaks`: js.UndefOr[Boolean] = js.undefined
        var `markdown.gfm`: js.UndefOr[Boolean] = js.undefined
        var `markdown.pedantic`: js.UndefOr[Boolean] = js.undefined
        var `markdown.sanitize`: js.UndefOr[Boolean] = js.undefined
        var `markdown.smartLists`: js.UndefOr[Boolean] = js.undefined
        var `markdown.smartypants`: js.UndefOr[Boolean] = js.undefined
        var `markdown.tables`: js.UndefOr[Boolean] = js.undefined
        var path: js.UndefOr[String] = js.undefined
        var statuses: js.UndefOr[StringDictionary[StatusInfo]] = js.undefined
        var title: js.UndefOr[String] = js.undefined
      }
      
      trait DocDefaultConfig extends js.Object {
        var context: js.UndefOr[js.Any] = js.undefined
        var prefix: js.UndefOr[String] = js.undefined
        var status: js.UndefOr[String] = js.undefined
      }
      
      trait DocMarkdownConfig extends js.Object {
        var breaks: js.UndefOr[Boolean] = js.undefined
        var gfm: js.UndefOr[Boolean] = js.undefined
        var pedantic: js.UndefOr[Boolean] = js.undefined
        var sanitize: js.UndefOr[Boolean] = js.undefined
        var smartLists: js.UndefOr[Boolean] = js.undefined
        var smartypants: js.UndefOr[Boolean] = js.undefined
        var tables: js.UndefOr[Boolean] = js.undefined
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
        def render(page: typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.filesNs.File): js.Promise[String] = js.native
        def render(page: typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.filesNs.File, context: js.Any): js.Promise[String] = js.native
        def render(
          page: typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.filesNs.File,
          context: js.Any,
          env: js.Any
        ): js.Promise[String] = js.native
        def render(
          page: typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.filesNs.File,
          context: js.Any,
          env: js.Any,
          opts: js.Object
        ): js.Promise[String] = js.native
        def renderString(str: String, context: js.Any): js.Promise[String] = js.native
        def renderString(str: String, context: js.Any, env: js.Any): js.Promise[String] = js.native
        def resolve(context: js.Any): js.Any = js.native
        def toc(page: typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.filesNs.File): js.Promise[String] = js.native
        def toc(page: typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.filesNs.File, maxDepth: Double): js.Promise[String] = js.native
      }
      
      /* static members */
      @js.native
      object Doc extends js.Object {
        def create(config: js.Any, content: String, parent: Entity): Doc = js.native
      }
      
    }
    
    @JSName("files")
    @js.native
    object filesNs extends js.Object {
      trait File extends js.Object {
        var base: String
        val contents: Buffer
        var cwd: String
        var dir: String
        var editorMode: String
        var editorScope: String
        var ext: String
        var githubColor: String
        var handle: String
        var id: String
        val isAsset: js.UndefOr[scala.Nothing] = js.undefined
        var isBinary: Boolean
        val isCollection: js.UndefOr[scala.Nothing] = js.undefined
        val isComponent: js.UndefOr[scala.Nothing] = js.undefined
        val isDoc: js.UndefOr[scala.Nothing] = js.undefined
        val isFile: `true`
        val isImage: Boolean
        val isVariant: js.UndefOr[scala.Nothing] = js.undefined
        var lang: String
        var mime: String
        var name: String
        var path: String
        var relPath: String
        var stat: Stats | Null
        def getContent(): js.Promise[String]
        def getContentSync(): String
        def getContext(): js.Any
        def read(): js.Promise[String]
        def readSync(): String
        def toVinyl(): typings.vinyl.vinylMod.File
      }
      
      @js.native
      trait FileCollection
        extends Collection[typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.filesNs.File] {
        def files(): this.type = js.native
        def gulpify(): Readable = js.native
        def `match`(test: String): this.type = js.native
        def `match`(test: js.Array[String | RegExp]): this.type = js.native
        def `match`(test: RegExp): this.type = js.native
        def matchItems(
          items: Collection[typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.filesNs.File],
          test: String
        ): typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.filesNs.File = js.native
        def matchItems(
          items: Collection[typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.filesNs.File],
          test: js.Array[String | RegExp]
        ): typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.filesNs.File = js.native
        def matchItems(
          items: Collection[typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.filesNs.File],
          test: RegExp
        ): typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.filesNs.File = js.native
        def toVinylArray(): js.Array[typings.vinyl.vinylMod.File] = js.native
        def toVinylStream(): Readable = js.native
      }
      
    }
    
    @JSName("variants")
    @js.native
    object variantsNs extends js.Object {
      @js.native
      class Variant protected () extends Entity {
        def this(config: js.Object, view: js.Any, resources: AssetCollection, parent: Component) = this()
        val baseHandle: String = js.native
        val content: String = js.native
        var editorMode: String = js.native
        var editorScope: String = js.native
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
        val siblings: VariantCollection = js.native
        var view: js.Any = js.native
        var viewDir: String = js.native
        var viewPath: String = js.native
        def component(): Component = js.native
        def defaultVariant(): this.type = js.native
        def getContent(): js.Promise[String] = js.native
        def getContentSync(): String = js.native
        def getPreviewContent(): js.Promise[String] = js.native
        def getPreviewContext(): js.Promise[_] = js.native
        def render(context: js.Any): js.Promise[String] = js.native
        def render(context: js.Any, env: js.Any): js.Promise[String] = js.native
        def render(context: js.Any, env: js.Any, opts: js.Any): js.Promise[String] = js.native
        def resources(): AssetCollection = js.native
        def resourcesJSON(): js.Object = js.native
        def variant(): this.type = js.native
      }
      
      @js.native
      trait VariantCollection extends EntityCollection[Variant] {
        val referencedBy: js.Array[_] = js.native
        val references: js.Array[_] = js.native
        def default(): Variant = js.native
        def getCOllatedContext(): js.Promise[_] = js.native
        def getCollatedContent(): js.Promise[String] = js.native
        def getCollatedContentSync(): String = js.native
      }
      
      /* static members */
      @js.native
      object Variant extends js.Object {
        def create(config: js.Object, view: js.Any, resources: AssetCollection, parent: Component): Variant = js.native
      }
      
    }
    
  }
  
  @JSName("cli")
  @js.native
  object cliNs extends js.Object {
    @js.native
    class Cli () extends js.Object {
      var console: Console = js.native
      @JSName("notify")
      var notify_FCli: Notifier = js.native
      def command(
        commandString: String,
        callback: js.ThisFunction2[
              /* this */ this.type with Anon_Fractal, 
              /* args */ js.Any, 
              /* done */ js.Function0[Unit], 
              Unit
            ]
      ): Unit = js.native
      def command(
        commandString: String,
        callback: js.ThisFunction2[
              /* this */ this.type with Anon_Fractal, 
              /* args */ js.Any, 
              /* done */ js.Function0[Unit], 
              Unit
            ],
        opts: String
      ): Unit = js.native
      def command(
        commandString: String,
        callback: js.ThisFunction2[
              /* this */ this.type with Anon_Fractal, 
              /* args */ js.Any, 
              /* done */ js.Function0[Unit], 
              Unit
            ],
        opts: Anon_Description
      ): Unit = js.native
      def error(message: String): Unit = js.native
      def exec(command: String): Unit = js.native
      def get(command: String): js.Any = js.native
      def has(command: String): Boolean = js.native
      def isInteractive(): Boolean = js.native
      def log(message: String): Unit = js.native
    }
    
    @js.native
    class Console () extends js.Object {
      var theme: CliTheme = js.native
      def box(): this.type = js.native
      def box(header: String): this.type = js.native
      def box(header: String, body: js.Array[String]): this.type = js.native
      def box(header: String, body: js.Array[String], footer: String): this.type = js.native
      def br(): this.type = js.native
      def clear(): this.type = js.native
      def columns(data: js.Any): this.type = js.native
      def columns(data: js.Any, options: js.Any): this.type = js.native
      def debug(text: String): this.type = js.native
      def debug(text: String, data: js.Any): this.type = js.native
      def debugMode(status: Boolean): Unit = js.native
      def dump(data: js.Any): Unit = js.native
      def error(err: String, data: Error): this.type = js.native
      def error(err: Error): this.type = js.native
      def isSlogging(): Boolean = js.native
      def log(text: String): this.type = js.native
      def persist(): this.type = js.native
      def slog(): this.type = js.native
      def success(text: String): this.type = js.native
      def unslog(): this.type = js.native
      def update(text: String): this.type = js.native
      def update(text: String, `type`: String): this.type = js.native
      def warn(text: String): this.type = js.native
      def write(str: String): Unit = js.native
      def write(str: String, `type`: String): Unit = js.native
    }
    
    @js.native
    class Notifier () extends js.Object {
      def updateAvailable(details: Anon_Current): Unit = js.native
      def versionMismatch(details: Anon_Cli): Unit = js.native
    }
    
  }
  
  @JSName("core")
  @js.native
  object coreNs extends js.Object {
    trait StatusInfo extends js.Object {
      var color: js.UndefOr[String] = js.undefined
      var description: js.UndefOr[String] = js.undefined
      var label: String
    }
    
    @JSName("entities")
    @js.native
    object entitiesNs extends js.Object {
      @js.native
      abstract class Entity ()
        extends typings.atFrctlFractal.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.Entity {
        val isCollection: js.UndefOr[`true`] = js.native
        val isComponent: js.UndefOr[`true`] = js.native
        val isDoc: js.UndefOr[`true`] = js.native
        val isVariant: js.UndefOr[`true`] = js.native
        val status: StatusInfo = js.native
        def getContext(): js.Any = js.native
        def getResolvedContext(): js.Any = js.native
        def hasContext(): js.Promise[Boolean] = js.native
        def setContext(data: js.Any): Unit = js.native
      }
      
      @js.native
      trait EntityCollection[T /* <: Entity */]
        extends typings.atFrctlFractal.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.Entity
           with Collection[T] {
        val entities: this.type = js.native
        /* InferMemberOverrides */
        override def toJSON(): js.Object = js.native
      }
      
      @js.native
      trait EntitySource[T /* <: Entity */, TConfig] extends Source[T, TConfig] {
        def engine[TEngine](): Adapter[TEngine] = js.native
        def engine[TEngine](adapterFactory: String): Adapter[TEngine] = js.native
        def engine[TEngine](adapterFactory: js.Function0[Anon_App[T, TEngine]]): Adapter[TEngine] = js.native
        def engine[TEngine](adapterFactory: Anon_App[T, TEngine]): Adapter[TEngine] = js.native
        def entities(): js.Array[T] = js.native
        def getProp(key: String): String | js.Object = js.native
        def statusInfo(handle: String): StatusInfo | Null = js.native
      }
      
    }
    
    @JSName("mixins")
    @js.native
    object mixinsNs extends js.Object {
      @js.native
      trait Collection[T] extends js.Object {
        val isAsset: js.UndefOr[scala.Nothing] = js.native
        val isCollection: `true` = js.native
        val isComponent: js.UndefOr[scala.Nothing] = js.native
        val isDoc: js.UndefOr[scala.Nothing] = js.native
        val isFile: js.UndefOr[scala.Nothing] = js.native
        val isVariant: js.UndefOr[scala.Nothing] = js.native
        val items: js.Array[T] = js.native
        @JSName(scala.scalajs.js.Symbol.iterator)
        var iterator: js.Function0[IterableIterator[T]] = js.native
        val size: Double = js.native
        def collections(): this.type = js.native
        def each(fn: js.Function1[/* item */ T, Unit]): this.type = js.native
        def eq(pos: Double): js.UndefOr[T] = js.native
        def filter(handle: String): js.Array[T] = js.native
        def filter[TKey /* <: String */](name: TKey, value: /* import warning: ImportType.apply Failed type conversion: T[TKey] */ js.Any): js.Array[T] = js.native
        def filterItems(items: js.Array[T], handle: String): js.Array[T] = js.native
        def filterItems[TKey /* <: String */](
          items: js.Array[T],
          name: TKey,
          value: /* import warning: ImportType.apply Failed type conversion: T[TKey] */ js.Any
        ): js.Array[T] = js.native
        def find(handle: String): T = js.native
        def find[TKey /* <: String */](name: TKey, value: /* import warning: ImportType.apply Failed type conversion: T[TKey] */ js.Any): T = js.native
        def findCollection(handle: String): Collection[T] = js.native
        def findCollection[TKey /* <: String */](name: TKey, value: /* import warning: ImportType.apply Failed type conversion: T[TKey] */ js.Any): Collection[T] = js.native
        def first(): js.UndefOr[T] = js.native
        def flatten(): this.type = js.native
        def flattenDeep(): this.type = js.native
        def flattenItems(items: js.Array[T]): js.Array[T] = js.native
        def flattenItems(items: js.Array[T], deep: Boolean): js.Array[T] = js.native
        def forEach(fn: js.Function1[/* item */ T, Unit]): this.type = js.native
        def last(): js.UndefOr[T] = js.native
        def map(fn: js.Function1[/* item */ T, T]): this.type = js.native
        def newSelf(items: js.Array[T]): this.type = js.native
        def orderBy(): this.type = js.native
        def pushItem(item: T): this.type = js.native
        def removeItem(item: T): this.type = js.native
        def setItems(items: js.Array[T]): this.type = js.native
        def squash(): this.type = js.native
        def squashItems(items: js.Array[T]): js.Array[T] = js.native
        def toArray(): js.Array[T] = js.native
        def toJSON(): js.Object = js.native
        def toStream(): Readable = js.native
      }
      
      @js.native
      abstract class Configurable[T] () extends js.Object {
        def config(): T = js.native
        def config(config: T): this.type = js.native
        def get[K /* <: String */, V](path: K): js.UndefOr[
                (/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any) | V | Null
              ] = js.native
        def get[K /* <: String */, V](path: K, defaultValue: V): js.UndefOr[
                (/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any) | V | Null
              ] = js.native
        def set[K /* <: String */](path: K): this.type = js.native
        def set[K /* <: String */](path: K, value: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any): this.type = js.native
      }
      
      /**
        * Combined EventEmitter and Configurable mixins
        */
      /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
      - typings.atFrctlFractal.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.Configurable because Inheritance from two classes. Inlined config, config, set, set, get, get */ @js.native
      abstract class ConfigurableEmitter[T] () extends EventEmitter {
        def config(): T = js.native
        def config(config: T): this.type = js.native
        def get[K /* <: String */, V](path: K): js.UndefOr[
                (/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any) | V | Null
              ] = js.native
        def get[K /* <: String */, V](path: K, defaultValue: V): js.UndefOr[
                (/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any) | V | Null
              ] = js.native
        def set[K /* <: String */](path: K): this.type = js.native
        def set[K /* <: String */](path: K, value: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any): this.type = js.native
      }
      
      @js.native
      abstract class Entity () extends js.Object {
        val alias: String | Null = js.native
        var config: js.Any = js.native
        var handle: String = js.native
        var id: String = js.native
        val isHidden: Boolean = js.native
        var label: String = js.native
        var name: String = js.native
        var order: Double = js.native
        val parent: typings.atFrctlFractal.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.Entity = js.native
        val source: EntitySource[typings.atFrctlFractal.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity, _] = js.native
        var title: String = js.native
        def initEntity(
          name: String,
          config: js.Any,
          parent: typings.atFrctlFractal.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.Entity
        ): Unit = js.native
        def toJSON(): js.Object = js.native
      }
      
      @js.native
      trait Source[T, TConfig]
        extends ConfigurableEmitter[TConfig]
           with Collection[T] {
        val fullPath: String | Null = js.native
        val isWatching: Boolean = js.native
        val label: String = js.native
        val relPath: String = js.native
        val source: this.type = js.native
        val title: String = js.native
        /* InferMemberOverrides */
        override def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        /* InferMemberOverrides */
        override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        /* InferMemberOverrides */
        override def emit(event: String, args: js.Any*): Boolean = js.native
        /* InferMemberOverrides */
        override def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
        /* InferMemberOverrides */
        override def eventNames(): js.Array[String | js.Symbol] = js.native
        def exists(): Boolean = js.native
        /* InferMemberOverrides */
        override def getMaxListeners(): Double = js.native
        def isConfig(file: String): Boolean = js.native
        /* InferMemberOverrides */
        override def listenerCount(`type`: String): Double = js.native
        /* InferMemberOverrides */
        override def listenerCount(`type`: js.Symbol): Double = js.native
        /* InferMemberOverrides */
        override def listeners(event: String): js.Array[js.Function] = js.native
        /* InferMemberOverrides */
        override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
        def load(): js.Promise[this.type] = js.native
        def load(force: Boolean): js.Promise[this.type] = js.native
        /* InferMemberOverrides */
        override def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        /* InferMemberOverrides */
        override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        /* InferMemberOverrides */
        override def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        /* InferMemberOverrides */
        override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        /* InferMemberOverrides */
        override def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        /* InferMemberOverrides */
        override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        // Added in Node 6...
        /* InferMemberOverrides */
        override def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        /* InferMemberOverrides */
        override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        /* InferMemberOverrides */
        override def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        /* InferMemberOverrides */
        override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        /* InferMemberOverrides */
        override def rawListeners(event: String): js.Array[js.Function] = js.native
        /* InferMemberOverrides */
        override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
        def refresh(): js.Promise[this.type] = js.native
        /* InferMemberOverrides */
        override def removeAllListeners(): this.type = js.native
        /* InferMemberOverrides */
        override def removeAllListeners(event: String): this.type = js.native
        /* InferMemberOverrides */
        override def removeAllListeners(event: js.Symbol): this.type = js.native
        /* InferMemberOverrides */
        override def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        /* InferMemberOverrides */
        override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        /* InferMemberOverrides */
        override def setMaxListeners(n: Double): this.type = js.native
        def unwatch(): Unit = js.native
        def watch(): Unit = js.native
      }
      
    }
    
  }
  
  @JSName("web")
  @js.native
  object webNs extends js.Object {
    @js.native
    class Builder () extends EventEmitter {
      /**
        * @deprecated Use start() instead.
        */
      def build(): js.Promise[Anon_ErrorCount] = js.native
      def start(): js.Promise[Anon_ErrorCount] = js.native
      def stop(): Unit = js.native
      def use(): Unit = js.native
    }
    
    @js.native
    class Server () extends EventEmitter {
      val isSynced: Boolean = js.native
      val port: js.UndefOr[Double] = js.native
      val ports: Anon_Server = js.native
      val url: js.UndefOr[String] = js.native
      val urls: Anon_ServerSync = js.native
      def start(): js.Promise[typings.node.httpMod.Server] = js.native
      def start(sync: Boolean): js.Promise[typings.node.httpMod.Server] = js.native
      def stop(): Unit = js.native
      def use(mount: String, middleware: js.Any): Unit = js.native
    }
    
    @js.native
    class Web () extends ConfigurableEmitter[WebConfig] {
      def builder(): Builder = js.native
      def builder(config: WebBuilderConfig): Builder = js.native
      def defaultTheme(): WebTheme = js.native
      def defaultTheme(instance: WebTheme): this.type = js.native
      def server(): Server = js.native
      def server(config: WebServerConfig): Server = js.native
      def theme(name: String): this.type = js.native
      def theme(name: String, instance: WebTheme): this.type = js.native
    }
    
    trait WebBuilderConfig extends js.Object {
      var concurrency: js.UndefOr[Double] = js.undefined
      var dest: js.UndefOr[String] = js.undefined
      var ext: js.UndefOr[String] = js.undefined
      var theme: js.UndefOr[WebTheme | String] = js.undefined
      var urls: js.UndefOr[WebBuilderUrls] = js.undefined
    }
    
    trait WebBuilderUrls extends js.Object {
      var ext: js.UndefOr[String] = js.undefined
    }
    
    trait WebConfig extends js.Object {
      var builder: js.UndefOr[WebBuilderConfig] = js.undefined
      var `builder.concurrency`: js.UndefOr[Double] = js.undefined
      var `builder.dest`: js.UndefOr[String] = js.undefined
      var `builder.ext`: js.UndefOr[String] = js.undefined
      var `builder.theme`: js.UndefOr[WebTheme | String] = js.undefined
      var `builder.urls`: js.UndefOr[WebBuilderUrls] = js.undefined
      var `builder.urls.ext`: js.UndefOr[String] = js.undefined
      var server: js.UndefOr[WebServerConfig] = js.undefined
      var `server.port`: js.UndefOr[Double] = js.undefined
      var `server.sync`: js.UndefOr[Boolean] = js.undefined
      var `server.syncOptions`: js.UndefOr[WebServerSyncOptions] = js.undefined
      var `server.syncOptions.browser`: js.UndefOr[js.Array[String]] = js.undefined
      var `server.syncOptions.notify`: js.UndefOr[Boolean] = js.undefined
      var `server.syncOptions.open`: js.UndefOr[Boolean] = js.undefined
      var `server.theme`: js.UndefOr[WebTheme | String] = js.undefined
      var `server.watch`: js.UndefOr[Boolean] = js.undefined
      var static: js.UndefOr[WebStaticConfig] = js.undefined
      var `static.mount`: js.UndefOr[String] = js.undefined
      var `static.path`: js.UndefOr[String] = js.undefined
    }
    
    trait WebServerConfig extends js.Object {
      var port: js.UndefOr[Double] = js.undefined
      var sync: js.UndefOr[Boolean] = js.undefined
      var syncOptions: js.UndefOr[WebServerSyncOptions] = js.undefined
      var theme: js.UndefOr[WebTheme | String] = js.undefined
      var watch: js.UndefOr[Boolean] = js.undefined
    }
    
    trait WebServerSyncOptions extends js.Object {
      var browser: js.UndefOr[js.Array[String]] = js.undefined
      @JSName("notify")
      var notify_FWebServerSyncOptions: js.UndefOr[Boolean] = js.undefined
      var open: js.UndefOr[Boolean] = js.undefined
    }
    
    trait WebStaticConfig extends js.Object {
      var mount: js.UndefOr[String] = js.undefined
      var path: js.UndefOr[String] = js.undefined
    }
    
  }
  
}

