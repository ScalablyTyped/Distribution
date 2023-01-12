package typings.dtsGenerator

import typings.typescript.mod.ModuleResolutionKind
import typings.typescript.mod.ScriptTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: DtsGeneratorOptions): typings.bluebird.mod.^[Unit] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[Unit]]
  
  @JSImport("dts-generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DtsGeneratorOptions extends StObject {
    
    /**
      * The base directory for the package being bundled. Any dependencies discovered outside this directory will be excluded
      * from the bundle.
      * Note this is no longer the preferred way to configure dts-generator, please see project.
      */
    var baseDir: js.UndefOr[String] = js.undefined
    
    /** The end-of-line character that should be used when outputting code. Defaults to os.EOL. */
    var eol: js.UndefOr[String] = js.undefined
    
    /**
      * A list of glob patterns, relative to baseDir, that should be excluded from the bundle.
      * Use the --exclude flag one or more times on the command-line. Defaults to [ "node_modules\/ **\/ *.d.ts" ].
      */
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A list of external module reference paths that should be inserted as reference comments.
      * Use the --extern flag one or more times on the command-line.
      */
    var externs: js.UndefOr[js.Array[String]] = js.undefined
    
    /** A list of files from the baseDir to bundle. */
    var files: js.UndefOr[js.Array[String]] = js.undefined
    
    var includes: js.UndefOr[js.Array[String]] = js.undefined
    
    /** The character(s) that should be used to indent the declarations in the output. Defaults to \t. */
    var indent: js.UndefOr[String] = js.undefined
    
    /** The module ID that should be used as the exported value of the package’s “main” module. */
    var main: js.UndefOr[String] = js.undefined
    
    /** The type of module resolution to use when generating the bundle. */
    var moduleResolution: js.UndefOr[ModuleResolutionKind] = js.undefined
    
    /** The name of the package. Used to determine the correct exported package name for modules. */
    var name: String
    
    /** The filename where the generated bundle will be created. */
    var out: String
    
    var outDir: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * The base directory for the project being bundled. It is assumed that this directory contains a
      * tsconfig.json which will be parsed to determine the files that should be bundled as well as
      * other configuration information like target
      */
    var project: js.UndefOr[String] = js.undefined
    
    /**
      * An optional callback provided by the invoker to customize the declared module ids the output d.ts files.
      * @see {@link https://github.com/SitePen/dts-generator/blob/master/docs/resolving-module-ids.md Resolving Module Ids}
      */
    var resolveModuleId: js.UndefOr[js.Function1[/* params */ ResolveModuleIdParams, String]] = js.undefined
    
    /**
      * An optional callback provided by the invoker to customize the imported module ids in the output d.ts files.
      * @see {@link https://github.com/SitePen/dts-generator/blob/master/docs/resolving-module-ids.md Resolving Module Ids}
      */
    var resolveModuleImport: js.UndefOr[js.Function1[/* params */ ResolveModuleImportParams, String]] = js.undefined
    
    var rootDir: js.UndefOr[String] = js.undefined
    
    var sendMessage: js.UndefOr[js.Function2[/* message */ Any, /* repeated */ Any, Unit]] = js.undefined
    
    /** The target environment for generated code. Defaults to ts.ScriptTarget.Latest. */
    var target: js.UndefOr[ScriptTarget] = js.undefined
    
    /**
      * A list of external @types package dependencies that should be inserted as reference comments.
      * Use the --types flag one or more times on the command-line.
      */
    var types: js.UndefOr[js.Array[String]] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object DtsGeneratorOptions {
    
    inline def apply(name: String, out: String): DtsGeneratorOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
      __obj.asInstanceOf[DtsGeneratorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DtsGeneratorOptions] (val x: Self) extends AnyVal {
      
      inline def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      inline def setBaseDirUndefined: Self = StObject.set(x, "baseDir", js.undefined)
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setExterns(value: js.Array[String]): Self = StObject.set(x, "externs", value.asInstanceOf[js.Any])
      
      inline def setExternsUndefined: Self = StObject.set(x, "externs", js.undefined)
      
      inline def setExternsVarargs(value: String*): Self = StObject.set(x, "externs", js.Array(value*))
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setIncludes(value: js.Array[String]): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
      
      inline def setIncludesVarargs(value: String*): Self = StObject.set(x, "includes", js.Array(value*))
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def setModuleResolution(value: ModuleResolutionKind): Self = StObject.set(x, "moduleResolution", value.asInstanceOf[js.Any])
      
      inline def setModuleResolutionUndefined: Self = StObject.set(x, "moduleResolution", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutDir(value: String): Self = StObject.set(x, "outDir", value.asInstanceOf[js.Any])
      
      inline def setOutDirUndefined: Self = StObject.set(x, "outDir", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setResolveModuleId(value: /* params */ ResolveModuleIdParams => String): Self = StObject.set(x, "resolveModuleId", js.Any.fromFunction1(value))
      
      inline def setResolveModuleIdUndefined: Self = StObject.set(x, "resolveModuleId", js.undefined)
      
      inline def setResolveModuleImport(value: /* params */ ResolveModuleImportParams => String): Self = StObject.set(x, "resolveModuleImport", js.Any.fromFunction1(value))
      
      inline def setResolveModuleImportUndefined: Self = StObject.set(x, "resolveModuleImport", js.undefined)
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
      
      inline def setSendMessage(value: (/* message */ Any, /* repeated */ Any) => Unit): Self = StObject.set(x, "sendMessage", js.Any.fromFunction2(value))
      
      inline def setSendMessageUndefined: Self = StObject.set(x, "sendMessage", js.undefined)
      
      inline def setTarget(value: ScriptTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait ResolveModuleIdParams extends StObject {
    
    /** The identifier of the module being declared in the generated d.ts */
    var currentModuleId: String
  }
  object ResolveModuleIdParams {
    
    inline def apply(currentModuleId: String): ResolveModuleIdParams = {
      val __obj = js.Dynamic.literal(currentModuleId = currentModuleId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveModuleIdParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolveModuleIdParams] (val x: Self) extends AnyVal {
      
      inline def setCurrentModuleId(value: String): Self = StObject.set(x, "currentModuleId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolveModuleImportParams extends StObject {
    
    /** The identifier of the enclosing module currently being declared in the generated d.ts */
    var currentModuleId: String
    
    /** The identifier of the module currently being imported in the generated d.ts */
    var importedModuleId: String
    
    /** True if the imported module id is declared as a module in the input files. */
    var isDeclaredExternalModule: Boolean
  }
  object ResolveModuleImportParams {
    
    inline def apply(currentModuleId: String, importedModuleId: String, isDeclaredExternalModule: Boolean): ResolveModuleImportParams = {
      val __obj = js.Dynamic.literal(currentModuleId = currentModuleId.asInstanceOf[js.Any], importedModuleId = importedModuleId.asInstanceOf[js.Any], isDeclaredExternalModule = isDeclaredExternalModule.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveModuleImportParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolveModuleImportParams] (val x: Self) extends AnyVal {
      
      inline def setCurrentModuleId(value: String): Self = StObject.set(x, "currentModuleId", value.asInstanceOf[js.Any])
      
      inline def setImportedModuleId(value: String): Self = StObject.set(x, "importedModuleId", value.asInstanceOf[js.Any])
      
      inline def setIsDeclaredExternalModule(value: Boolean): Self = StObject.set(x, "isDeclaredExternalModule", value.asInstanceOf[js.Any])
    }
  }
}
