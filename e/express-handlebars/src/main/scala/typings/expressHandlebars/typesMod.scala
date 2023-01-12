package typings.expressHandlebars

import org.scalablytyped.runtime.StringDictionary
import typings.expressHandlebars.anon.Views
import typings.expressHandlebars.expressHandlebarsBooleans.`false`
import typings.handlebars.CompileOptions
import typings.handlebars.Handlebars.RuntimeOptions
import typings.handlebars.Handlebars.TemplateDelegate
import typings.handlebars.PrecompileOptions
import typings.handlebars.TemplateSpecification
import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type CompiledCache = StringDictionary[js.Promise[TemplateDelegate[Any]]]
  
  trait ConfigOptions extends StObject {
    
    var compilerOptions: js.UndefOr[CompileOptions] = js.undefined
    
    var defaultLayout: js.UndefOr[String | `false`] = js.undefined
    
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var extname: js.UndefOr[String] = js.undefined
    
    var handlebars: js.UndefOr[HandlebarsImport] = js.undefined
    
    var helpers: js.UndefOr[UnknownObject] = js.undefined
    
    var layoutsDir: js.UndefOr[String] = js.undefined
    
    var partialsDir: js.UndefOr[String | (js.Array[PartialsDirObject | String]) | PartialsDirObject] = js.undefined
    
    var runtimeOptions: js.UndefOr[RuntimeOptions] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setCompilerOptions(value: CompileOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      inline def setDefaultLayout(value: String | `false`): Self = StObject.set(x, "defaultLayout", value.asInstanceOf[js.Any])
      
      inline def setDefaultLayoutUndefined: Self = StObject.set(x, "defaultLayout", js.undefined)
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
      
      inline def setExtnameUndefined: Self = StObject.set(x, "extname", js.undefined)
      
      inline def setHandlebars(value: HandlebarsImport): Self = StObject.set(x, "handlebars", value.asInstanceOf[js.Any])
      
      inline def setHandlebarsUndefined: Self = StObject.set(x, "handlebars", js.undefined)
      
      inline def setHelpers(value: UnknownObject): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
      
      inline def setHelpersUndefined: Self = StObject.set(x, "helpers", js.undefined)
      
      inline def setLayoutsDir(value: String): Self = StObject.set(x, "layoutsDir", value.asInstanceOf[js.Any])
      
      inline def setLayoutsDirUndefined: Self = StObject.set(x, "layoutsDir", js.undefined)
      
      inline def setPartialsDir(value: String | (js.Array[PartialsDirObject | String]) | PartialsDirObject): Self = StObject.set(x, "partialsDir", value.asInstanceOf[js.Any])
      
      inline def setPartialsDirUndefined: Self = StObject.set(x, "partialsDir", js.undefined)
      
      inline def setPartialsDirVarargs(value: (PartialsDirObject | String)*): Self = StObject.set(x, "partialsDir", js.Array(value*))
      
      inline def setRuntimeOptions(value: RuntimeOptions): Self = StObject.set(x, "runtimeOptions", value.asInstanceOf[js.Any])
      
      inline def setRuntimeOptionsUndefined: Self = StObject.set(x, "runtimeOptions", js.undefined)
    }
  }
  
  type Engine = js.Function3[
    /* viewPath */ String, 
    /* options */ ConfigOptions, 
    /* callback */ js.UndefOr[RenderCallback], 
    js.Promise[String]
  ]
  
  trait EngineOptions
    extends StObject
       with ConfigOptions
       with /* index */ StringDictionary[Any]
  object EngineOptions {
    
    inline def apply(): EngineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EngineOptions]
    }
  }
  
  type FsCache = StringDictionary[String | js.Array[String] | (js.Promise[String | js.Array[String]])]
  
  type FunctionObject = StringDictionary[js.Function1[/* repeated */ Any, Any]]
  
  type HandlebarsCompile = js.Function2[/* input */ Any, /* options */ CompileOptions, TemplateDelegate[Any]]
  
  trait HandlebarsImport
    extends StObject
       with /* index */ StringDictionary[Any] {
    
    def compile(input: Any, options: CompileOptions): TemplateDelegate[Any]
    @JSName("compile")
    var compile_Original: HandlebarsCompile
    
    def precompile(input: Any, options: PrecompileOptions): TemplateSpecification
    @JSName("precompile")
    var precompile_Original: HandlebarsPrecompile
  }
  object HandlebarsImport {
    
    inline def apply(
      compile: (/* input */ Any, /* options */ CompileOptions) => TemplateDelegate[Any],
      precompile: (/* input */ Any, /* options */ PrecompileOptions) => TemplateSpecification
    ): HandlebarsImport = {
      val __obj = js.Dynamic.literal(compile = js.Any.fromFunction2(compile), precompile = js.Any.fromFunction2(precompile))
      __obj.asInstanceOf[HandlebarsImport]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HandlebarsImport] (val x: Self) extends AnyVal {
      
      inline def setCompile(value: (/* input */ Any, /* options */ CompileOptions) => TemplateDelegate[Any]): Self = StObject.set(x, "compile", js.Any.fromFunction2(value))
      
      inline def setPrecompile(value: (/* input */ Any, /* options */ PrecompileOptions) => TemplateSpecification): Self = StObject.set(x, "precompile", js.Any.fromFunction2(value))
    }
  }
  
  type HandlebarsPrecompile = js.Function2[/* input */ Any, /* options */ PrecompileOptions, TemplateSpecification]
  
  trait PartialTemplateOptions extends StObject {
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var precompiled: js.UndefOr[Boolean] = js.undefined
  }
  object PartialTemplateOptions {
    
    inline def apply(): PartialTemplateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTemplateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialTemplateOptions] (val x: Self) extends AnyVal {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setPrecompiled(value: Boolean): Self = StObject.set(x, "precompiled", value.asInstanceOf[js.Any])
      
      inline def setPrecompiledUndefined: Self = StObject.set(x, "precompiled", js.undefined)
    }
  }
  
  trait PartialsDirObject extends StObject {
    
    var dir: String
    
    var namespace: String
    
    var rename: js.UndefOr[RenameFunction] = js.undefined
    
    var templates: TemplateDelegateObject
  }
  object PartialsDirObject {
    
    inline def apply(dir: String, namespace: String, templates: TemplateDelegateObject): PartialsDirObject = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any])
      __obj.asInstanceOf[PartialsDirObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialsDirObject] (val x: Self) extends AnyVal {
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setRename(value: (/* filePath */ String, /* namespace */ js.UndefOr[String]) => String): Self = StObject.set(x, "rename", js.Any.fromFunction2(value))
      
      inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
      
      inline def setTemplates(value: TemplateDelegateObject): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    }
  }
  
  type PrecompiledCache = StringDictionary[js.Promise[TemplateSpecification]]
  
  type RenameFunction = js.Function2[/* filePath */ String, /* namespace */ js.UndefOr[String], String]
  
  type RenderCallback = js.Function2[/* err */ js.Error | Null, /* content */ js.UndefOr[String], Unit]
  
  trait RenderOptions extends StObject {
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var data: js.UndefOr[UnknownObject] = js.undefined
    
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var helpers: js.UndefOr[FunctionObject] = js.undefined
    
    var layout: js.UndefOr[String] = js.undefined
    
    var partials: js.UndefOr[TemplateDelegateObject] = js.undefined
    
    var runtimeOptions: js.UndefOr[RuntimeOptions] = js.undefined
  }
  object RenderOptions {
    
    inline def apply(): RenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setData(value: UnknownObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setHelpers(value: FunctionObject): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
      
      inline def setHelpersUndefined: Self = StObject.set(x, "helpers", js.undefined)
      
      inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setPartials(value: TemplateDelegateObject): Self = StObject.set(x, "partials", value.asInstanceOf[js.Any])
      
      inline def setPartialsUndefined: Self = StObject.set(x, "partials", js.undefined)
      
      inline def setRuntimeOptions(value: RuntimeOptions): Self = StObject.set(x, "runtimeOptions", value.asInstanceOf[js.Any])
      
      inline def setRuntimeOptionsUndefined: Self = StObject.set(x, "runtimeOptions", js.undefined)
    }
  }
  
  trait RenderViewOptions
    extends StObject
       with RenderOptions
       with /* index */ StringDictionary[Any] {
    
    var settings: js.UndefOr[Views] = js.undefined
  }
  object RenderViewOptions {
    
    inline def apply(): RenderViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderViewOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderViewOptions] (val x: Self) extends AnyVal {
      
      inline def setSettings(value: Views): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    }
  }
  
  type TemplateDelegateObject = StringDictionary[TemplateDelegate[Any]]
  
  type TemplateSpecificationObject = StringDictionary[TemplateSpecification]
  
  type UnknownObject = StringDictionary[Any]
}
