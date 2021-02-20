package typings.dtsGenerator

import typings.bluebird.mod.^
import typings.typescript.mod.ModuleResolutionKind
import typings.typescript.mod.ScriptTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dts-generator", JSImport.Namespace)
  @js.native
  def apply(options: DtsGeneratorOptions): ^[Unit] = js.native
  
  @js.native
  trait DtsGeneratorOptions extends StObject {
    
    /**
      * The base directory for the package being bundled. Any dependencies discovered outside this directory will be excluded
      * from the bundle.
      * Note this is no longer the preferred way to configure dts-generator, please see project.
      */
    var baseDir: js.UndefOr[String] = js.native
    
    /** The end-of-line character that should be used when outputting code. Defaults to os.EOL. */
    var eol: js.UndefOr[String] = js.native
    
    /**
      * A list of glob patterns, relative to baseDir, that should be excluded from the bundle.
      * Use the --exclude flag one or more times on the command-line. Defaults to [ "node_modules\/ **\/ *.d.ts" ].
      */
    var exclude: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * A list of external module reference paths that should be inserted as reference comments.
      * Use the --extern flag one or more times on the command-line.
      */
    var externs: js.UndefOr[js.Array[String]] = js.native
    
    /** A list of files from the baseDir to bundle. */
    var files: js.UndefOr[js.Array[String]] = js.native
    
    /** The character(s) that should be used to indent the declarations in the output. Defaults to \t. */
    var indent: js.UndefOr[String] = js.native
    
    /** The module ID that should be used as the exported value of the package’s “main” module. */
    var main: js.UndefOr[String] = js.native
    
    /** The type of module resolution to use when generating the bundle. */
    var moduleResolution: js.UndefOr[ModuleResolutionKind] = js.native
    
    /** The name of the package. Used to determine the correct exported package name for modules. */
    var name: String = js.native
    
    /** The filename where the generated bundle will be created. */
    var out: String = js.native
    
    /**
      * The base directory for the project being bundled. It is assumed that this directory contains a
      * tsconfig.json which will be parsed to determine the files that should be bundled as well as
      * other configuration information like target
      */
    var project: js.UndefOr[String] = js.native
    
    /**
      * An optional callback provided by the invoker to customize the declared module ids the output d.ts files.
      * @see {@link https://github.com/SitePen/dts-generator/blob/master/docs/resolving-module-ids.md Resolving Module Ids}
      */
    var resolveModuleId: js.UndefOr[js.Function1[/* params */ ResolveModuleIdParams, String]] = js.native
    
    /**
      * An optional callback provided by the invoker to customize the imported module ids in the output d.ts files.
      * @see {@link https://github.com/SitePen/dts-generator/blob/master/docs/resolving-module-ids.md Resolving Module Ids}
      */
    var resolveModuleImport: js.UndefOr[js.Function1[/* params */ ResolveModuleImportParams, String]] = js.native
    
    /** The target environment for generated code. Defaults to ts.ScriptTarget.Latest. */
    var target: js.UndefOr[ScriptTarget] = js.native
    
    /**
      * A list of external @types package dependencies that should be inserted as reference comments.
      * Use the --types flag one or more times on the command-line.
      */
    var types: js.UndefOr[js.Array[String]] = js.native
  }
  object DtsGeneratorOptions {
    
    @scala.inline
    def apply(name: String, out: String): DtsGeneratorOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
      __obj.asInstanceOf[DtsGeneratorOptions]
    }
    
    @scala.inline
    implicit class DtsGeneratorOptionsMutableBuilder[Self <: DtsGeneratorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseDirUndefined: Self = StObject.set(x, "baseDir", js.undefined)
      
      @scala.inline
      def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setExterns(value: js.Array[String]): Self = StObject.set(x, "externs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternsUndefined: Self = StObject.set(x, "externs", js.undefined)
      
      @scala.inline
      def setExternsVarargs(value: String*): Self = StObject.set(x, "externs", js.Array(value :_*))
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      @scala.inline
      def setModuleResolution(value: ModuleResolutionKind): Self = StObject.set(x, "moduleResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleResolutionUndefined: Self = StObject.set(x, "moduleResolution", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      @scala.inline
      def setResolveModuleId(value: /* params */ ResolveModuleIdParams => String): Self = StObject.set(x, "resolveModuleId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolveModuleIdUndefined: Self = StObject.set(x, "resolveModuleId", js.undefined)
      
      @scala.inline
      def setResolveModuleImport(value: /* params */ ResolveModuleImportParams => String): Self = StObject.set(x, "resolveModuleImport", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolveModuleImportUndefined: Self = StObject.set(x, "resolveModuleImport", js.undefined)
      
      @scala.inline
      def setTarget(value: ScriptTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      @scala.inline
      def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ResolveModuleIdParams extends StObject {
    
    /** The identifier of the module being declared in the generated d.ts */
    var currentModuleId: String = js.native
  }
  object ResolveModuleIdParams {
    
    @scala.inline
    def apply(currentModuleId: String): ResolveModuleIdParams = {
      val __obj = js.Dynamic.literal(currentModuleId = currentModuleId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveModuleIdParams]
    }
    
    @scala.inline
    implicit class ResolveModuleIdParamsMutableBuilder[Self <: ResolveModuleIdParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentModuleId(value: String): Self = StObject.set(x, "currentModuleId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResolveModuleImportParams extends StObject {
    
    /** The identifier of the enclosing module currently being declared in the generated d.ts */
    var currentModuleId: String = js.native
    
    /** The identifier of the module currently being imported in the generated d.ts */
    var importedModuleId: String = js.native
    
    /** True if the imported module id is declared as a module in the input files. */
    var isDeclaredExternalModule: Boolean = js.native
  }
  object ResolveModuleImportParams {
    
    @scala.inline
    def apply(currentModuleId: String, importedModuleId: String, isDeclaredExternalModule: Boolean): ResolveModuleImportParams = {
      val __obj = js.Dynamic.literal(currentModuleId = currentModuleId.asInstanceOf[js.Any], importedModuleId = importedModuleId.asInstanceOf[js.Any], isDeclaredExternalModule = isDeclaredExternalModule.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveModuleImportParams]
    }
    
    @scala.inline
    implicit class ResolveModuleImportParamsMutableBuilder[Self <: ResolveModuleImportParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentModuleId(value: String): Self = StObject.set(x, "currentModuleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportedModuleId(value: String): Self = StObject.set(x, "importedModuleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDeclaredExternalModule(value: Boolean): Self = StObject.set(x, "isDeclaredExternalModule", value.asInstanceOf[js.Any])
    }
  }
}
