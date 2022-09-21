package typings.expressHandlebars

import typings.expressHandlebars.typesMod.CompiledCache
import typings.expressHandlebars.typesMod.ConfigOptions
import typings.expressHandlebars.typesMod.Engine
import typings.expressHandlebars.typesMod.FsCache
import typings.expressHandlebars.typesMod.FunctionObject
import typings.expressHandlebars.typesMod.HandlebarsImport
import typings.expressHandlebars.typesMod.PartialTemplateOptions
import typings.expressHandlebars.typesMod.PartialsDirObject
import typings.expressHandlebars.typesMod.PrecompiledCache
import typings.expressHandlebars.typesMod.RenderCallback
import typings.expressHandlebars.typesMod.RenderOptions
import typings.expressHandlebars.typesMod.RenderViewOptions
import typings.expressHandlebars.typesMod.TemplateDelegateObject
import typings.expressHandlebars.typesMod.TemplateSpecificationObject
import typings.expressHandlebars.typesMod.UnknownObject
import typings.handlebars.CompileOptions
import typings.handlebars.HandlebarsTemplateDelegate
import typings.handlebars.RuntimeOptions
import typings.handlebars.TemplateSpecification
import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressHandlebarsMod {
  
  @JSImport("express-handlebars/dist/express-handlebars", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ExpressHandlebars {
    def this(config: ConfigOptions) = this()
  }
  
  @js.native
  trait ExpressHandlebars extends StObject {
    
    /* protected */ def _compileTemplate(template: String): HandlebarsTemplateDelegate[Any] = js.native
    /* protected */ def _compileTemplate(template: String, options: RuntimeOptions): HandlebarsTemplateDelegate[Any] = js.native
    
    var _fsCache: FsCache = js.native
    
    /* private */ var _getDir: Any = js.native
    
    /* private */ var _getFile: Any = js.native
    
    /* private */ var _getTemplateName: Any = js.native
    
    /* protected */ def _precompileTemplate(template: String): TemplateSpecification = js.native
    /* protected */ def _precompileTemplate(template: String, options: RuntimeOptions): TemplateSpecification = js.native
    
    /* protected */ def _renderTemplate(template: HandlebarsTemplateDelegate[Any]): String = js.native
    /* protected */ def _renderTemplate(template: HandlebarsTemplateDelegate[Any], context: Unit, options: RuntimeOptions): String = js.native
    /* protected */ def _renderTemplate(template: HandlebarsTemplateDelegate[Any], context: UnknownObject): String = js.native
    /* protected */ def _renderTemplate(template: HandlebarsTemplateDelegate[Any], context: UnknownObject, options: RuntimeOptions): String = js.native
    
    /* private */ var _resolveLayoutPath: Any = js.native
    
    /* private */ var _resolveViewsPath: Any = js.native
    
    var compiled: CompiledCache = js.native
    
    var compilerOptions: CompileOptions = js.native
    
    var config: ConfigOptions = js.native
    
    var defaultLayout: String = js.native
    
    var encoding: BufferEncoding = js.native
    
    def engine(viewPath: String, options: ConfigOptions): js.Promise[String] = js.native
    def engine(viewPath: String, options: ConfigOptions, callback: RenderCallback): js.Promise[String] = js.native
    @JSName("engine")
    var engine_Original: Engine = js.native
    
    var extname: String = js.native
    
    def getPartials(): js.Promise[TemplateSpecificationObject | TemplateDelegateObject] = js.native
    def getPartials(options: PartialTemplateOptions): js.Promise[TemplateSpecificationObject | TemplateDelegateObject] = js.native
    
    def getTemplate(filePath: String): js.Promise[HandlebarsTemplateDelegate[Any] | TemplateSpecification] = js.native
    def getTemplate(filePath: String, options: PartialTemplateOptions): js.Promise[HandlebarsTemplateDelegate[Any] | TemplateSpecification] = js.native
    
    def getTemplates(dirPath: String): js.Promise[HandlebarsTemplateDelegate[Any] | TemplateSpecification] = js.native
    def getTemplates(dirPath: String, options: PartialTemplateOptions): js.Promise[HandlebarsTemplateDelegate[Any] | TemplateSpecification] = js.native
    
    var handlebars: HandlebarsImport = js.native
    
    var helpers: FunctionObject = js.native
    
    var layoutsDir: String = js.native
    
    var partialsDir: String | PartialsDirObject | (js.Array[String | PartialsDirObject]) = js.native
    
    var precompiled: PrecompiledCache = js.native
    
    def render(filePath: String): js.Promise[String] = js.native
    def render(filePath: String, context: Unit, options: RenderOptions): js.Promise[String] = js.native
    def render(filePath: String, context: UnknownObject): js.Promise[String] = js.native
    def render(filePath: String, context: UnknownObject, options: RenderOptions): js.Promise[String] = js.native
    
    def renderView(viewPath: String): js.Promise[String] = js.native
    def renderView(viewPath: String, callback: RenderCallback): js.Promise[Null] = js.native
    def renderView(viewPath: String, options: RenderViewOptions): js.Promise[String] = js.native
    def renderView(viewPath: String, options: RenderViewOptions, callback: RenderCallback): js.Promise[Null] = js.native
    
    var runtimeOptions: RuntimeOptions = js.native
  }
}
