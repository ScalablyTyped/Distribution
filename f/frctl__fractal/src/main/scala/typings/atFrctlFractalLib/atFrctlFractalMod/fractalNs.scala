package typings
package atFrctlFractalLib.atFrctlFractalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "fractal")
@js.native
object fractalNs extends js.Object {
  val Fractal: atFrctlFractalLib.Anon_New = js.native
  @JSName("api")
  @js.native
  object apiNs extends js.Object {
    @JSName("assets")
    @js.native
    object assetsNs extends js.Object {
      @js.native
      class Asset ()
        extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity {
        val isAsset: atFrctlFractalLib.atFrctlFractalLibNumbers.`true` = js.native
        @JSName("isCollection")
        val isCollection_Asset: js.UndefOr[scala.Nothing] = js.native
        @JSName("isComponent")
        val isComponent_Asset: js.UndefOr[scala.Nothing] = js.native
        @JSName("isDoc")
        val isDoc_Asset: js.UndefOr[scala.Nothing] = js.native
        val isFile: js.UndefOr[scala.Nothing] = js.native
        @JSName("isVariant")
        val isVariant_Asset: js.UndefOr[scala.Nothing] = js.native
        def toVinyl(): vinylLib.vinylMod.File = js.native
      }
      
      @js.native
      trait AssetCollection
        extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.EntityCollection[Asset] {
        def assets(): this.type = js.native
        def toVinylArray(): js.Array[vinylLib.vinylMod.File] = js.native
      }
      
      @js.native
      trait AssetSource
        extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.Source[vinylLib.vinylMod.File, js.Any] {
        def assets(): js.Array[vinylLib.vinylMod.File] = js.native
        def gulpify(): nodeLib.streamMod.Readable = js.native
        def toVinylArray(): js.Array[vinylLib.vinylMod.File] = js.native
        def toVinylStream(): nodeLib.streamMod.Readable = js.native
      }
      
      @js.native
      trait AssetSourceCollection
        extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.ConfigurableEmitter[js.Any] {
        @JSName(org.scalablytyped.runtime.Symbol.iterator)
        var iterator: js.Function0[nodeLib.IterableIterator[AssetSource]] = js.native
        val label: java.lang.String = js.native
        val title: java.lang.String = js.native
        def add(name: java.lang.String, config: js.Any): AssetSource = js.native
        def find(name: java.lang.String): js.UndefOr[AssetSource] = js.native
        def load(): js.Promise[scala.Unit] = js.native
        def remove(name: java.lang.String): this.type = js.native
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
      class Component protected ()
        extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity {
        def this(config: js.Object, files: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.filesNs.FileCollection, resources: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.assetsNs.AssetCollection, parent: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity) = this()
        val baseHandle: java.lang.String = js.native
        var configData: java.lang.String = js.native
        val content: java.lang.String = js.native
        var defaultName: java.lang.String = js.native
        var editorMode: java.lang.String = js.native
        var editorScope: java.lang.String = js.native
        val isAsset: js.UndefOr[scala.Nothing] = js.native
        @JSName("isCollection")
        val isCollection_Component: js.UndefOr[scala.Nothing] = js.native
        @JSName("isComponent")
        val isComponent_Component: atFrctlFractalLib.atFrctlFractalLibNumbers.`true` = js.native
        @JSName("isDoc")
        val isDoc_Component: js.UndefOr[scala.Nothing] = js.native
        val isFile: js.UndefOr[scala.Nothing] = js.native
        @JSName("isVariant")
        val isVariant_Component: js.UndefOr[scala.Nothing] = js.native
        var lang: java.lang.String = js.native
        val notes: java.lang.String = js.native
        val referencedBy: js.Array[_] = js.native
        val references: js.Array[_] = js.native
        var relViewPath: java.lang.String = js.native
        var viewDir: java.lang.String = js.native
        var viewPath: java.lang.String = js.native
        def component(): this.type = js.native
        def flatten(): atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.variantsNs.VariantCollection = js.native
        def getPreviewContent(): js.Promise[java.lang.String] = js.native
        def getPreviewContext(): js.Promise[_] = js.native
        def hasTag(tag: java.lang.String): scala.Boolean = js.native
        def isCollated(): scala.Boolean = js.native
        def render(context: js.Any, env: js.Any, opts: js.Any): js.Promise[java.lang.String] = js.native
        def resources(): atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.assetsNs.AssetCollection = js.native
        def resourcesJSON(): js.Object = js.native
        def setVariants(
          variantCollection: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.variantsNs.VariantCollection
        ): scala.Unit = js.native
        def variants(): atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.variantsNs.VariantCollection = js.native
      }
      
      @js.native
      trait ComponentCollection
        extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.EntityCollection[Component] {
        def components(): this.type = js.native
        def variants(): this.type = js.native
      }
      
      trait ComponentConfig extends js.Object {
        var default: js.UndefOr[ComponentDefaultConfig] = js.undefined
        var `default.collated`: js.UndefOr[scala.Boolean] = js.undefined
        var `default.collator`: js.UndefOr[Collator] = js.undefined
        var `default.context`: js.UndefOr[js.Any] = js.undefined
        var `default.display`: js.UndefOr[js.Any] = js.undefined
        var `default.prefix`: js.UndefOr[java.lang.String] = js.undefined
        var `default.preview`: js.UndefOr[java.lang.String] = js.undefined
        var `default.status`: js.UndefOr[java.lang.String] = js.undefined
        var ext: js.UndefOr[java.lang.String] = js.undefined
        var label: js.UndefOr[java.lang.String] = js.undefined
        var path: js.UndefOr[java.lang.String] = js.undefined
        var statuses: js.UndefOr[
                org.scalablytyped.runtime.StringDictionary[atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.StatusInfo]
              ] = js.undefined
        var title: js.UndefOr[java.lang.String] = js.undefined
        var `yield`: js.UndefOr[java.lang.String] = js.undefined
      }
      
      trait ComponentDefaultConfig extends js.Object {
        var collated: js.UndefOr[scala.Boolean] = js.undefined
        var collator: js.UndefOr[Collator] = js.undefined
        var context: js.UndefOr[js.Any] = js.undefined
        var display: js.UndefOr[js.Any] = js.undefined
        var prefix: js.UndefOr[java.lang.String] = js.undefined
        var preview: js.UndefOr[java.lang.String] = js.undefined
        var status: js.UndefOr[java.lang.String] = js.undefined
      }
      
      @js.native
      trait ComponentSource
        extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.EntitySource[Component, ComponentConfig] {
        def components(): js.Array[Component] = js.native
        def find(): js.Any = js.native
        def findFile(filePath: java.lang.String): js.UndefOr[atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.filesNs.File] = js.native
        def getReferencesOf(target: atFrctlFractalLib.Anon_Alias): js.Array[_] = js.native
        def render(entity: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity, context: js.Any): js.Promise[java.lang.String] = js.native
        def render(
          entity: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity,
          context: js.Any,
          env: js.Any
        ): js.Promise[java.lang.String] = js.native
        def render(
          entity: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity,
          context: js.Any,
          env: js.Any,
          opts: js.Object
        ): js.Promise[java.lang.String] = js.native
        def render(entity: java.lang.String, context: js.Any): js.Promise[java.lang.String] = js.native
        def render(entity: java.lang.String, context: js.Any, env: js.Any): js.Promise[java.lang.String] = js.native
        def render(entity: java.lang.String, context: js.Any, env: js.Any, opts: js.Object): js.Promise[java.lang.String] = js.native
        def renderPreview(entity: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity): js.Promise[java.lang.String] = js.native
        def renderPreview(
          entity: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity,
          preview: scala.Boolean
        ): js.Promise[java.lang.String] = js.native
        def renderPreview(
          entity: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity,
          preview: scala.Boolean,
          env: js.Any
        ): js.Promise[java.lang.String] = js.native
        def renderPreview(entity: java.lang.String): js.Promise[java.lang.String] = js.native
        def renderPreview(entity: java.lang.String, preview: scala.Boolean): js.Promise[java.lang.String] = js.native
        def renderPreview(entity: java.lang.String, preview: scala.Boolean, env: js.Any): js.Promise[java.lang.String] = js.native
        def renderString(str: java.lang.String, context: js.Any, env: js.Any): js.Promise[java.lang.String] = js.native
        def resolve(context: js.Any): js.Any = js.native
        def resources(): atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.filesNs.FileCollection = js.native
        def variants(): this.type = js.native
      }
      
      /* static members */
      @js.native
      object Component extends js.Object {
        def create(
          config: js.Object,
          files: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.filesNs.FileCollection,
          resources: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.assetsNs.AssetCollection,
          parent: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity
        ): nodeLib.IterableIterator[
                js.Object | atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.variantsNs.VariantCollection | atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.componentsNs.Component
              ] = js.native
      }
      
      type Collator = js.Function2[
            /* markup */ java.lang.String, 
            /* item */ atFrctlFractalLib.Anon_Handle, 
            java.lang.String
          ]
    }
    
    @JSName("docs")
    @js.native
    object docsNs extends js.Object {
      @js.native
      class Doc protected ()
        extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity {
        def this(config: js.Any, content: java.lang.String, parent: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity) = this()
        val isAsset: js.UndefOr[scala.Nothing] = js.native
        @JSName("isCollection")
        val isCollection_Doc: js.UndefOr[scala.Nothing] = js.native
        @JSName("isComponent")
        val isComponent_Doc: js.UndefOr[scala.Nothing] = js.native
        @JSName("isDoc")
        val isDoc_Doc: atFrctlFractalLib.atFrctlFractalLibNumbers.`true` = js.native
        val isFile: js.UndefOr[scala.Nothing] = js.native
        val isIndex: scala.Boolean = js.native
        @JSName("isVariant")
        val isVariant_Doc: js.UndefOr[scala.Nothing] = js.native
        def getContent(): js.Promise[java.lang.String] = js.native
        def getContentSync(): java.lang.String = js.native
        def render(context: js.Any): js.Promise[java.lang.String] = js.native
        def render(context: js.Any, env: js.Any): js.Promise[java.lang.String] = js.native
        def render(context: js.Any, env: js.Any, opts: js.Any): js.Promise[java.lang.String] = js.native
        def toc(): js.Promise[java.lang.String] = js.native
        def toc(maxDepth: scala.Double): js.Promise[java.lang.String] = js.native
      }
      
      @js.native
      trait DocCollection
        extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.EntityCollection[Doc] {
        def pages(): this.type = js.native
      }
      
      trait DocConfig extends js.Object {
        var default: js.UndefOr[DocDefaultConfig] = js.undefined
        var `default.context`: js.UndefOr[js.Any] = js.undefined
        var `default.prefix`: js.UndefOr[java.lang.String] = js.undefined
        var `default.status`: js.UndefOr[java.lang.String] = js.undefined
        var ext: js.UndefOr[java.lang.String] = js.undefined
        var indexLabel: js.UndefOr[java.lang.String] = js.undefined
        var label: js.UndefOr[java.lang.String] = js.undefined
        var markdown: js.UndefOr[scala.Boolean | DocMarkdownConfig] = js.undefined
        var `markdown.breaks`: js.UndefOr[scala.Boolean] = js.undefined
        var `markdown.gfm`: js.UndefOr[scala.Boolean] = js.undefined
        var `markdown.pedantic`: js.UndefOr[scala.Boolean] = js.undefined
        var `markdown.sanitize`: js.UndefOr[scala.Boolean] = js.undefined
        var `markdown.smartLists`: js.UndefOr[scala.Boolean] = js.undefined
        var `markdown.smartypants`: js.UndefOr[scala.Boolean] = js.undefined
        var `markdown.tables`: js.UndefOr[scala.Boolean] = js.undefined
        var path: js.UndefOr[java.lang.String] = js.undefined
        var statuses: js.UndefOr[
                org.scalablytyped.runtime.StringDictionary[atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.StatusInfo]
              ] = js.undefined
        var title: js.UndefOr[java.lang.String] = js.undefined
      }
      
      trait DocDefaultConfig extends js.Object {
        var context: js.UndefOr[js.Any] = js.undefined
        var prefix: js.UndefOr[java.lang.String] = js.undefined
        var status: js.UndefOr[java.lang.String] = js.undefined
      }
      
      trait DocMarkdownConfig extends js.Object {
        var breaks: js.UndefOr[scala.Boolean] = js.undefined
        var gfm: js.UndefOr[scala.Boolean] = js.undefined
        var pedantic: js.UndefOr[scala.Boolean] = js.undefined
        var sanitize: js.UndefOr[scala.Boolean] = js.undefined
        var smartLists: js.UndefOr[scala.Boolean] = js.undefined
        var smartypants: js.UndefOr[scala.Boolean] = js.undefined
        var tables: js.UndefOr[scala.Boolean] = js.undefined
      }
      
      @js.native
      trait DocSource
        extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.EntitySource[Doc, DocConfig] {
        def docs(): this.type = js.native
        def isPage(file: java.lang.String): scala.Boolean = js.native
        def isTemplate(file: java.lang.String): scala.Boolean = js.native
        def pages(): this.type = js.native
        def render(page: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.filesNs.File): js.Promise[java.lang.String] = js.native
        def render(page: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.filesNs.File, context: js.Any): js.Promise[java.lang.String] = js.native
        def render(
          page: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.filesNs.File,
          context: js.Any,
          env: js.Any
        ): js.Promise[java.lang.String] = js.native
        def render(
          page: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.filesNs.File,
          context: js.Any,
          env: js.Any,
          opts: js.Object
        ): js.Promise[java.lang.String] = js.native
        def render(page: java.lang.String): js.Promise[java.lang.String] = js.native
        def render(page: java.lang.String, context: js.Any): js.Promise[java.lang.String] = js.native
        def render(page: java.lang.String, context: js.Any, env: js.Any): js.Promise[java.lang.String] = js.native
        def render(page: java.lang.String, context: js.Any, env: js.Any, opts: js.Object): js.Promise[java.lang.String] = js.native
        def renderString(str: java.lang.String, context: js.Any): js.Promise[java.lang.String] = js.native
        def renderString(str: java.lang.String, context: js.Any, env: js.Any): js.Promise[java.lang.String] = js.native
        def resolve(context: js.Any): js.Any = js.native
        def toc(page: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.filesNs.File): js.Promise[java.lang.String] = js.native
        def toc(page: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.filesNs.File, maxDepth: scala.Double): js.Promise[java.lang.String] = js.native
      }
      
      /* static members */
      @js.native
      object Doc extends js.Object {
        def create(
          config: js.Any,
          content: java.lang.String,
          parent: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity
        ): atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.docsNs.Doc = js.native
      }
      
    }
    
    @JSName("files")
    @js.native
    object filesNs extends js.Object {
      trait File extends js.Object {
        var base: java.lang.String
        val contents: nodeLib.Buffer
        var cwd: java.lang.String
        var dir: java.lang.String
        var editorMode: java.lang.String
        var editorScope: java.lang.String
        var ext: java.lang.String
        var githubColor: java.lang.String
        var handle: java.lang.String
        var id: java.lang.String
        val isAsset: js.UndefOr[scala.Nothing]
        var isBinary: scala.Boolean
        val isCollection: js.UndefOr[scala.Nothing]
        val isComponent: js.UndefOr[scala.Nothing]
        val isDoc: js.UndefOr[scala.Nothing]
        val isFile: atFrctlFractalLib.atFrctlFractalLibNumbers.`true`
        val isImage: scala.Boolean
        val isVariant: js.UndefOr[scala.Nothing]
        var lang: java.lang.String
        var mime: java.lang.String
        var name: java.lang.String
        var path: java.lang.String
        var relPath: java.lang.String
        var stat: nodeLib.fsMod.Stats | scala.Null
        def getContent(): js.Promise[java.lang.String]
        def getContentSync(): java.lang.String
        def getContext(): js.Any
        def read(): js.Promise[java.lang.String]
        def readSync(): java.lang.String
        def toVinyl(): vinylLib.vinylMod.File
      }
      
      @js.native
      trait FileCollection
        extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.Collection[File] {
        def files(): this.type = js.native
        def gulpify(): nodeLib.streamMod.Readable = js.native
        def `match`(test: java.lang.String): this.type = js.native
        def `match`(test: js.Array[java.lang.String | stdLib.RegExp]): this.type = js.native
        def `match`(test: stdLib.RegExp): this.type = js.native
        def matchItems(
          items: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.Collection[File],
          test: java.lang.String
        ): File = js.native
        def matchItems(
          items: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.Collection[File],
          test: js.Array[java.lang.String | stdLib.RegExp]
        ): File = js.native
        def matchItems(
          items: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.Collection[File],
          test: stdLib.RegExp
        ): File = js.native
        def toVinylArray(): js.Array[vinylLib.vinylMod.File] = js.native
        def toVinylStream(): nodeLib.streamMod.Readable = js.native
      }
      
    }
    
    @JSName("variants")
    @js.native
    object variantsNs extends js.Object {
      @js.native
      class Variant protected ()
        extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity {
        def this(config: js.Object, view: js.Any, resources: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.assetsNs.AssetCollection, parent: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.componentsNs.Component) = this()
        val baseHandle: java.lang.String = js.native
        val content: java.lang.String = js.native
        var editorMode: java.lang.String = js.native
        var editorScope: java.lang.String = js.native
        val isAsset: js.UndefOr[scala.Nothing] = js.native
        @JSName("isCollection")
        val isCollection_Variant: js.UndefOr[scala.Nothing] = js.native
        @JSName("isComponent")
        val isComponent_Variant: js.UndefOr[scala.Nothing] = js.native
        var isDefault: scala.Boolean = js.native
        @JSName("isDoc")
        val isDoc_Variant: js.UndefOr[scala.Nothing] = js.native
        val isFile: atFrctlFractalLib.atFrctlFractalLibNumbers.`true` = js.native
        @JSName("isVariant")
        val isVariant_Variant: atFrctlFractalLib.atFrctlFractalLibNumbers.`true` = js.native
        var lang: java.lang.String = js.native
        val notes: java.lang.String = js.native
        val referencedBy: js.Array[_] = js.native
        val references: js.Array[_] = js.native
        var relViewPath: java.lang.String = js.native
        val siblings: VariantCollection = js.native
        var view: js.Any = js.native
        var viewDir: java.lang.String = js.native
        var viewPath: java.lang.String = js.native
        def component(): atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.componentsNs.Component = js.native
        def defaultVariant(): this.type = js.native
        def getContent(): js.Promise[java.lang.String] = js.native
        def getContentSync(): java.lang.String = js.native
        def getPreviewContent(): js.Promise[java.lang.String] = js.native
        def getPreviewContext(): js.Promise[_] = js.native
        def render(context: js.Any): js.Promise[java.lang.String] = js.native
        def render(context: js.Any, env: js.Any): js.Promise[java.lang.String] = js.native
        def render(context: js.Any, env: js.Any, opts: js.Any): js.Promise[java.lang.String] = js.native
        def resources(): atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.assetsNs.AssetCollection = js.native
        def resourcesJSON(): js.Object = js.native
        def variant(): this.type = js.native
      }
      
      @js.native
      trait VariantCollection
        extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.EntityCollection[Variant] {
        val referencedBy: js.Array[_] = js.native
        val references: js.Array[_] = js.native
        def default(): Variant = js.native
        def getCOllatedContext(): js.Promise[_] = js.native
        def getCollatedContent(): js.Promise[java.lang.String] = js.native
        def getCollatedContentSync(): java.lang.String = js.native
      }
      
      /* static members */
      @js.native
      object Variant extends js.Object {
        def create(
          config: js.Object,
          view: js.Any,
          resources: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.assetsNs.AssetCollection,
          parent: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.componentsNs.Component
        ): atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.variantsNs.Variant = js.native
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
        commandString: java.lang.String,
        callback: js.ThisFunction2[
              /* this */ this.type with atFrctlFractalLib.Anon_Fractal, 
              /* args */ js.Any, 
              /* done */ js.Function0[scala.Unit], 
              scala.Unit
            ]
      ): scala.Unit = js.native
      def command(
        commandString: java.lang.String,
        callback: js.ThisFunction2[
              /* this */ this.type with atFrctlFractalLib.Anon_Fractal, 
              /* args */ js.Any, 
              /* done */ js.Function0[scala.Unit], 
              scala.Unit
            ],
        opts: atFrctlFractalLib.Anon_Description
      ): scala.Unit = js.native
      def command(
        commandString: java.lang.String,
        callback: js.ThisFunction2[
              /* this */ this.type with atFrctlFractalLib.Anon_Fractal, 
              /* args */ js.Any, 
              /* done */ js.Function0[scala.Unit], 
              scala.Unit
            ],
        opts: java.lang.String
      ): scala.Unit = js.native
      def error(message: java.lang.String): scala.Unit = js.native
      def exec(command: java.lang.String): scala.Unit = js.native
      def get(command: java.lang.String): js.Any = js.native
      def has(command: java.lang.String): scala.Boolean = js.native
      def isInteractive(): scala.Boolean = js.native
      def log(message: java.lang.String): scala.Unit = js.native
    }
    
    @js.native
    class Console () extends js.Object {
      var theme: atFrctlFractalLib.atFrctlFractalMod.CliTheme = js.native
      def box(): this.type = js.native
      def box(header: java.lang.String): this.type = js.native
      def box(header: java.lang.String, body: js.Array[java.lang.String]): this.type = js.native
      def box(header: java.lang.String, body: js.Array[java.lang.String], footer: java.lang.String): this.type = js.native
      def br(): this.type = js.native
      def clear(): this.type = js.native
      def columns(data: js.Any): this.type = js.native
      def columns(data: js.Any, options: js.Any): this.type = js.native
      def debug(text: java.lang.String): this.type = js.native
      def debug(text: java.lang.String, data: js.Any): this.type = js.native
      def debugMode(status: scala.Boolean): scala.Unit = js.native
      def dump(data: js.Any): scala.Unit = js.native
      def error(err: java.lang.String, data: nodeLib.Error): this.type = js.native
      def error(err: nodeLib.Error): this.type = js.native
      def isSlogging(): scala.Boolean = js.native
      def log(text: java.lang.String): this.type = js.native
      def persist(): this.type = js.native
      def slog(): this.type = js.native
      def success(text: java.lang.String): this.type = js.native
      def unslog(): this.type = js.native
      def update(text: java.lang.String): this.type = js.native
      def update(text: java.lang.String, `type`: java.lang.String): this.type = js.native
      def warn(text: java.lang.String): this.type = js.native
      def write(str: java.lang.String): scala.Unit = js.native
      def write(str: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
    }
    
    @js.native
    class Notifier () extends js.Object {
      def updateAvailable(details: atFrctlFractalLib.Anon_Current): scala.Unit = js.native
      def versionMismatch(details: atFrctlFractalLib.Anon_Cli): scala.Unit = js.native
    }
    
  }
  
  @JSName("core")
  @js.native
  object coreNs extends js.Object {
    trait StatusInfo extends js.Object {
      var color: js.UndefOr[java.lang.String] = js.undefined
      var description: js.UndefOr[java.lang.String] = js.undefined
      var label: java.lang.String
    }
    
    @JSName("entities")
    @js.native
    object entitiesNs extends js.Object {
      @js.native
      abstract class Entity ()
        extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.Entity {
        val isCollection: js.UndefOr[atFrctlFractalLib.atFrctlFractalLibNumbers.`true`] = js.native
        val isComponent: js.UndefOr[atFrctlFractalLib.atFrctlFractalLibNumbers.`true`] = js.native
        val isDoc: js.UndefOr[atFrctlFractalLib.atFrctlFractalLibNumbers.`true`] = js.native
        val isVariant: js.UndefOr[atFrctlFractalLib.atFrctlFractalLibNumbers.`true`] = js.native
        val status: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.StatusInfo = js.native
        def getContext(): js.Any = js.native
        def getResolvedContext(): js.Any = js.native
        def hasContext(): js.Promise[scala.Boolean] = js.native
        def setContext(data: js.Any): scala.Unit = js.native
      }
      
      @js.native
      trait EntityCollection[T /* <: Entity */]
        extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.Entity
           with atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.Collection[T] {
        val entities: this.type = js.native
        /* InferMemberOverrides */
        override def toJSON(): js.Object = js.native
      }
      
      @js.native
      trait EntitySource[T /* <: Entity */, TConfig]
        extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.Source[T, TConfig] {
        def engine[TEngine](): atFrctlFractalLib.atFrctlFractalMod.Adapter[TEngine] = js.native
        def engine[TEngine](adapterFactory: atFrctlFractalLib.Anon_App[T, TEngine]): atFrctlFractalLib.atFrctlFractalMod.Adapter[TEngine] = js.native
        def engine[TEngine](adapterFactory: java.lang.String): atFrctlFractalLib.atFrctlFractalMod.Adapter[TEngine] = js.native
        def engine[TEngine](adapterFactory: js.Function0[atFrctlFractalLib.Anon_App[T, TEngine]]): atFrctlFractalLib.atFrctlFractalMod.Adapter[TEngine] = js.native
        def entities(): js.Array[T] = js.native
        def getProp(key: java.lang.String): java.lang.String | js.Object = js.native
        def statusInfo(handle: java.lang.String): atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.StatusInfo | scala.Null = js.native
      }
      
    }
    
    @JSName("mixins")
    @js.native
    object mixinsNs extends js.Object {
      @js.native
      trait Collection[T] extends js.Object {
        val isAsset: js.UndefOr[scala.Nothing] = js.native
        val isCollection: atFrctlFractalLib.atFrctlFractalLibNumbers.`true` = js.native
        val isComponent: js.UndefOr[scala.Nothing] = js.native
        val isDoc: js.UndefOr[scala.Nothing] = js.native
        val isFile: js.UndefOr[scala.Nothing] = js.native
        val isVariant: js.UndefOr[scala.Nothing] = js.native
        val items: js.Array[T] = js.native
        @JSName(org.scalablytyped.runtime.Symbol.iterator)
        var iterator: js.Function0[nodeLib.IterableIterator[T]] = js.native
        val size: scala.Double = js.native
        def collections(): this.type = js.native
        def each(fn: js.Function1[/* item */ T, scala.Unit]): this.type = js.native
        def eq(pos: scala.Double): js.UndefOr[T] = js.native
        def filter(handle: java.lang.String): js.Array[T] = js.native
        def filter[TKey /* <: java.lang.String */](name: TKey, value: /* import warning: ImportType.apply Failed type conversion: T[TKey] */ js.Any): js.Array[T] = js.native
        def filterItems(items: js.Array[T], handle: java.lang.String): js.Array[T] = js.native
        def filterItems[TKey /* <: java.lang.String */](
          items: js.Array[T],
          name: TKey,
          value: /* import warning: ImportType.apply Failed type conversion: T[TKey] */ js.Any
        ): js.Array[T] = js.native
        def find(handle: java.lang.String): T = js.native
        def find[TKey /* <: java.lang.String */](name: TKey, value: /* import warning: ImportType.apply Failed type conversion: T[TKey] */ js.Any): T = js.native
        def findCollection(handle: java.lang.String): Collection[T] = js.native
        def findCollection[TKey /* <: java.lang.String */](name: TKey, value: /* import warning: ImportType.apply Failed type conversion: T[TKey] */ js.Any): Collection[T] = js.native
        def first(): js.UndefOr[T] = js.native
        def flatten(): this.type = js.native
        def flattenDeep(): this.type = js.native
        def flattenItems(items: js.Array[T]): js.Array[T] = js.native
        def flattenItems(items: js.Array[T], deep: scala.Boolean): js.Array[T] = js.native
        def forEach(fn: js.Function1[/* item */ T, scala.Unit]): this.type = js.native
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
        def toStream(): nodeLib.streamMod.Readable = js.native
      }
      
      @js.native
      abstract class Configurable[T] () extends js.Object {
        def config(): T = js.native
        def config(config: T): this.type = js.native
        def get[K /* <: java.lang.String */, V](path: K): js.UndefOr[
                (/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any) | V | scala.Null
              ] = js.native
        def get[K /* <: java.lang.String */, V](path: K, defaultValue: V): js.UndefOr[
                (/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any) | V | scala.Null
              ] = js.native
        def set[K /* <: java.lang.String */](path: K): this.type = js.native
        def set[K /* <: java.lang.String */](path: K, value: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any): this.type = js.native
      }
      
      /**
        * Combined EventEmitter and Configurable mixins
        */
      /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
      - atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.Configurable because Inheritance from two classes. Inlined config, config, set, set, get, get */ @js.native
      abstract class ConfigurableEmitter[T] ()
        extends nodeLib.eventsMod.EventEmitter {
        def config(): T = js.native
        def config(config: T): this.type = js.native
        def get[K /* <: java.lang.String */, V](path: K): js.UndefOr[
                (/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any) | V | scala.Null
              ] = js.native
        def get[K /* <: java.lang.String */, V](path: K, defaultValue: V): js.UndefOr[
                (/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any) | V | scala.Null
              ] = js.native
        def set[K /* <: java.lang.String */](path: K): this.type = js.native
        def set[K /* <: java.lang.String */](path: K, value: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any): this.type = js.native
      }
      
      @js.native
      abstract class Entity () extends js.Object {
        val alias: java.lang.String | scala.Null = js.native
        var config: js.Any = js.native
        var handle: java.lang.String = js.native
        var id: java.lang.String = js.native
        val isHidden: scala.Boolean = js.native
        var label: java.lang.String = js.native
        var name: java.lang.String = js.native
        var order: scala.Double = js.native
        val parent: Entity = js.native
        val source: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.EntitySource[atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity, _] = js.native
        var title: java.lang.String = js.native
        def initEntity(name: java.lang.String, config: js.Any, parent: Entity): scala.Unit = js.native
        def toJSON(): js.Object = js.native
      }
      
      @js.native
      trait Source[T, TConfig]
        extends ConfigurableEmitter[TConfig]
           with Collection[T] {
        val fullPath: java.lang.String | scala.Null = js.native
        val isWatching: scala.Boolean = js.native
        val label: java.lang.String = js.native
        val relPath: java.lang.String = js.native
        val source: this.type = js.native
        val title: java.lang.String = js.native
        def exists(): scala.Boolean = js.native
        def isConfig(file: java.lang.String): scala.Boolean = js.native
        def load(): js.Promise[this.type] = js.native
        def load(force: scala.Boolean): js.Promise[this.type] = js.native
        def refresh(): js.Promise[this.type] = js.native
        def unwatch(): scala.Unit = js.native
        def watch(): scala.Unit = js.native
      }
      
    }
    
  }
  
  @JSName("web")
  @js.native
  object webNs extends js.Object {
    @js.native
    class Builder ()
      extends nodeLib.eventsMod.EventEmitter {
      /**
        * @deprecated Use start() instead.
        */
      def build(): js.Promise[atFrctlFractalLib.Anon_ErrorCount] = js.native
      def start(): js.Promise[atFrctlFractalLib.Anon_ErrorCount] = js.native
      def stop(): scala.Unit = js.native
      def use(): scala.Unit = js.native
    }
    
    @js.native
    class Server ()
      extends nodeLib.eventsMod.EventEmitter {
      val isSynced: scala.Boolean = js.native
      val port: js.UndefOr[scala.Double] = js.native
      val ports: atFrctlFractalLib.Anon_Server = js.native
      val url: js.UndefOr[java.lang.String] = js.native
      val urls: atFrctlFractalLib.Anon_ServerSync = js.native
      def start(): js.Promise[nodeLib.httpMod.Server] = js.native
      def start(sync: scala.Boolean): js.Promise[nodeLib.httpMod.Server] = js.native
      def stop(): scala.Unit = js.native
      def use(mount: java.lang.String, middleware: js.Any): scala.Unit = js.native
    }
    
    @js.native
    class Web ()
      extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.mixinsNs.ConfigurableEmitter[WebConfig] {
      def builder(): Builder = js.native
      def builder(config: WebBuilderConfig): Builder = js.native
      def defaultTheme(): atFrctlFractalLib.atFrctlFractalMod.WebTheme = js.native
      def defaultTheme(instance: atFrctlFractalLib.atFrctlFractalMod.WebTheme): this.type = js.native
      def server(): Server = js.native
      def server(config: WebServerConfig): Server = js.native
      def theme(name: java.lang.String): this.type = js.native
      def theme(name: java.lang.String, instance: atFrctlFractalLib.atFrctlFractalMod.WebTheme): this.type = js.native
    }
    
    trait WebBuilderConfig extends js.Object {
      var concurrency: js.UndefOr[scala.Double] = js.undefined
      var dest: js.UndefOr[java.lang.String] = js.undefined
      var ext: js.UndefOr[java.lang.String] = js.undefined
      var theme: js.UndefOr[atFrctlFractalLib.atFrctlFractalMod.WebTheme | java.lang.String] = js.undefined
      var urls: js.UndefOr[WebBuilderUrls] = js.undefined
    }
    
    trait WebBuilderUrls extends js.Object {
      var ext: js.UndefOr[java.lang.String] = js.undefined
    }
    
    trait WebConfig extends js.Object {
      var builder: js.UndefOr[WebBuilderConfig] = js.undefined
      var `builder.concurrency`: js.UndefOr[scala.Double] = js.undefined
      var `builder.dest`: js.UndefOr[java.lang.String] = js.undefined
      var `builder.ext`: js.UndefOr[java.lang.String] = js.undefined
      var `builder.theme`: js.UndefOr[atFrctlFractalLib.atFrctlFractalMod.WebTheme | java.lang.String] = js.undefined
      var `builder.urls`: js.UndefOr[WebBuilderUrls] = js.undefined
      var `builder.urls.ext`: js.UndefOr[java.lang.String] = js.undefined
      var server: js.UndefOr[WebServerConfig] = js.undefined
      var `server.port`: js.UndefOr[scala.Double] = js.undefined
      var `server.sync`: js.UndefOr[scala.Boolean] = js.undefined
      var `server.syncOptions`: js.UndefOr[WebServerSyncOptions] = js.undefined
      var `server.syncOptions.browser`: js.UndefOr[js.Array[java.lang.String]] = js.undefined
      var `server.syncOptions.notify`: js.UndefOr[scala.Boolean] = js.undefined
      var `server.syncOptions.open`: js.UndefOr[scala.Boolean] = js.undefined
      var `server.theme`: js.UndefOr[atFrctlFractalLib.atFrctlFractalMod.WebTheme | java.lang.String] = js.undefined
      var `server.watch`: js.UndefOr[scala.Boolean] = js.undefined
      var static: js.UndefOr[WebStaticConfig] = js.undefined
      var `static.mount`: js.UndefOr[java.lang.String] = js.undefined
      var `static.path`: js.UndefOr[java.lang.String] = js.undefined
    }
    
    trait WebServerConfig extends js.Object {
      var port: js.UndefOr[scala.Double] = js.undefined
      var sync: js.UndefOr[scala.Boolean] = js.undefined
      var syncOptions: js.UndefOr[WebServerSyncOptions] = js.undefined
      var theme: js.UndefOr[atFrctlFractalLib.atFrctlFractalMod.WebTheme | java.lang.String] = js.undefined
      var watch: js.UndefOr[scala.Boolean] = js.undefined
    }
    
    trait WebServerSyncOptions extends js.Object {
      var browser: js.UndefOr[js.Array[java.lang.String]] = js.undefined
      @JSName("notify")
      var notify_FWebServerSyncOptions: js.UndefOr[scala.Boolean] = js.undefined
      var open: js.UndefOr[scala.Boolean] = js.undefined
    }
    
    trait WebStaticConfig extends js.Object {
      var mount: js.UndefOr[java.lang.String] = js.undefined
      var path: js.UndefOr[java.lang.String] = js.undefined
    }
    
  }
  
}

