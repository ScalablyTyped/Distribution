package typings.dtsGenerator.mod

import typings.typescript.mod.ModuleResolutionKind
import typings.typescript.mod.ScriptTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DtsGeneratorOptions extends js.Object {
  
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
  implicit class DtsGeneratorOptionsOps[Self <: DtsGeneratorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOut(value: String): Self = this.set("out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseDir(value: String): Self = this.set("baseDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseDir: Self = this.set("baseDir", js.undefined)
    
    @scala.inline
    def setEol(value: String): Self = this.set("eol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEol: Self = this.set("eol", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setExternsVarargs(value: String*): Self = this.set("externs", js.Array(value :_*))
    
    @scala.inline
    def setExterns(value: js.Array[String]): Self = this.set("externs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExterns: Self = this.set("externs", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setMain(value: String): Self = this.set("main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMain: Self = this.set("main", js.undefined)
    
    @scala.inline
    def setModuleResolution(value: ModuleResolutionKind): Self = this.set("moduleResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleResolution: Self = this.set("moduleResolution", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    
    @scala.inline
    def setResolveModuleId(value: /* params */ ResolveModuleIdParams => String): Self = this.set("resolveModuleId", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResolveModuleId: Self = this.set("resolveModuleId", js.undefined)
    
    @scala.inline
    def setResolveModuleImport(value: /* params */ ResolveModuleImportParams => String): Self = this.set("resolveModuleImport", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResolveModuleImport: Self = this.set("resolveModuleImport", js.undefined)
    
    @scala.inline
    def setTarget(value: ScriptTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
}
