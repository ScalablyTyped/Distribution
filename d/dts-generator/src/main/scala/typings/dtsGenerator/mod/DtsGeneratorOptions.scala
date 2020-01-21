package typings.dtsGenerator.mod

import typings.typescript.mod.ModuleResolutionKind
import typings.typescript.mod.ScriptTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DtsGeneratorOptions extends js.Object {
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
  /** The target environment for generated code. Defaults to ts.ScriptTarget.Latest. */
  var target: js.UndefOr[ScriptTarget] = js.undefined
  /**
    * A list of external @types package dependencies that should be inserted as reference comments.
    * Use the --types flag one or more times on the command-line.
    */
  var types: js.UndefOr[js.Array[String]] = js.undefined
}

object DtsGeneratorOptions {
  @scala.inline
  def apply(
    name: String,
    out: String,
    baseDir: String = null,
    eol: String = null,
    exclude: js.Array[String] = null,
    externs: js.Array[String] = null,
    files: js.Array[String] = null,
    indent: String = null,
    main: String = null,
    moduleResolution: ModuleResolutionKind = null,
    project: String = null,
    resolveModuleId: /* params */ ResolveModuleIdParams => String = null,
    resolveModuleImport: /* params */ ResolveModuleImportParams => String = null,
    target: ScriptTarget = null,
    types: js.Array[String] = null
  ): DtsGeneratorOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
    if (baseDir != null) __obj.updateDynamic("baseDir")(baseDir.asInstanceOf[js.Any])
    if (eol != null) __obj.updateDynamic("eol")(eol.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (externs != null) __obj.updateDynamic("externs")(externs.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (moduleResolution != null) __obj.updateDynamic("moduleResolution")(moduleResolution.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (resolveModuleId != null) __obj.updateDynamic("resolveModuleId")(js.Any.fromFunction1(resolveModuleId))
    if (resolveModuleImport != null) __obj.updateDynamic("resolveModuleImport")(js.Any.fromFunction1(resolveModuleImport))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[DtsGeneratorOptions]
  }
}

