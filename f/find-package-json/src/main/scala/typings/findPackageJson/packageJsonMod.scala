package typings.findPackageJson

import org.scalablytyped.runtime.StringDictionary
import typings.findPackageJson.anon.Access
import typings.findPackageJson.anon.Bin
import typings.findPackageJson.anon.Browser
import typings.findPackageJson.anon.Default
import typings.findPackageJson.anon.Dictk
import typings.findPackageJson.anon.Directory
import typings.findPackageJson.anon.Email
import typings.findPackageJson.anon.Install
import typings.findPackageJson.anon.Node
import typings.findPackageJson.anon.Nohoist
import typings.findPackageJson.anon.Optional
import typings.findPackageJson.anon.Shasum
import typings.findPackageJson.anon.Type
import typings.findPackageJson.anon._empty
import typings.findPackageJson.anon.`0`
import typings.findPackageJson.findPackageJsonStrings.commonjs
import typings.findPackageJson.findPackageJsonStrings.module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageJsonMod {
  
  type Dependency = StringDictionary[js.UndefOr[String]]
  
  type FundingUrl = String
  
  trait FundingWay extends StObject {
    
    /**
      * The type of funding or the platform through which funding can be provided, e.g. patreon, opencollective, tidelift or github.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    var url: FundingUrl
  }
  object FundingWay {
    
    inline def apply(url: FundingUrl): FundingWay = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FundingWay]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FundingWay] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: FundingUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type PackageExportsEntry = PackageExportsEntryPath | PackageExportsEntryObject
  
  trait PackageExportsEntryObject
    extends StObject
       with /**
    * The module path that is resolved when this environment matches the property name.
    *
    * This interface was referenced by `PackageExportsEntryObject`'s JSON-Schema definition
    * via the `patternProperty` "^(?![\.0-9]).".
    *
    * This interface was referenced by `undefined`'s JSON-Schema definition
    * via the `patternProperty` "^(?![\.0-9]).".
    */
  /* k */ StringDictionary[js.UndefOr[PackageExportsEntry | PackageExportsFallback]] {
    
    /**
      * The module path that is resolved when no other export type matches.
      */
    var default: js.UndefOr[PackageExportsEntry | PackageExportsFallback] = js.undefined
    
    /**
      * The module path that is resolved when this specifier is imported as an ECMAScript module using an `import` declaration or the dynamic `import(...)` function.
      */
    var `import`: js.UndefOr[PackageExportsEntry | PackageExportsFallback] = js.undefined
    
    /**
      * The module path that is resolved when this environment is Node.js.
      */
    var node: js.UndefOr[PackageExportsEntry | PackageExportsFallback] = js.undefined
    
    /**
      * The module path that is resolved when this specifier is imported as a CommonJS module using the `require(...)` function.
      */
    var require: js.UndefOr[PackageExportsEntry | PackageExportsFallback] = js.undefined
  }
  object PackageExportsEntryObject {
    
    inline def apply(): PackageExportsEntryObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PackageExportsEntryObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PackageExportsEntryObject] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: PackageExportsEntry | PackageExportsFallback): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultNull: Self = StObject.set(x, "default", null)
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(value: PackageExportsEntry*): Self = StObject.set(x, "default", js.Array(value*))
      
      inline def setImport(value: PackageExportsEntry | PackageExportsFallback): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
      
      inline def setImportNull: Self = StObject.set(x, "import", null)
      
      inline def setImportUndefined: Self = StObject.set(x, "import", js.undefined)
      
      inline def setImportVarargs(value: PackageExportsEntry*): Self = StObject.set(x, "import", js.Array(value*))
      
      inline def setNode(value: PackageExportsEntry | PackageExportsFallback): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeNull: Self = StObject.set(x, "node", null)
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setNodeVarargs(value: PackageExportsEntry*): Self = StObject.set(x, "node", js.Array(value*))
      
      inline def setRequire(value: PackageExportsEntry | PackageExportsFallback): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      inline def setRequireNull: Self = StObject.set(x, "require", null)
      
      inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
      
      inline def setRequireVarargs(value: PackageExportsEntry*): Self = StObject.set(x, "require", js.Array(value*))
    }
  }
  
  type PackageExportsEntryPath = String | Null
  
  type PackageExportsFallback = js.Array[PackageExportsEntry]
  
  trait PackageJSON
    extends StObject
       with PackageJSON1
       with PackageJSON2
  object PackageJSON {
    
    inline def apply(): PackageJSON = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PackageJSON]
    }
  }
  
  type PackageJSON1 = StringDictionary[js.UndefOr[Any]]
  
  trait PackageJSON2
    extends StObject
       with /**
    * Any property starting with _ is valid.
    *
    * This interface was referenced by `PackageJSON2`'s JSON-Schema definition
    * via the `patternProperty` "^_".
    */
  /* k */ StringDictionary[Any] {
    
    var author: js.UndefOr[Person] = js.undefined
    
    var bin: js.UndefOr[String | StringDictionary[js.UndefOr[String]]] = js.undefined
    
    /**
      * The url to your project's issue tracker and / or the email address to which issues should be reported. These are helpful for people who encounter issues with your package.
      */
    var bugs: js.UndefOr[Email | String] = js.undefined
    
    /**
      * DEPRECATED: This field is honored, but "bundledDependencies" is the correct field name.
      * @deprecated
      */
    var bundleDependencies: js.UndefOr[js.Array[String] | Boolean] = js.undefined
    
    /**
      * Array of package names that will be bundled when publishing the package.
      */
    var bundledDependencies: js.UndefOr[js.Array[String] | Boolean] = js.undefined
    
    /**
      * A 'config' hash can be used to set configuration parameters used in package scripts that persist across upgrades.
      */
    var config: js.UndefOr[StringDictionary[js.UndefOr[Any]]] = js.undefined
    
    /**
      * A list of people who contributed to this package.
      */
    var contributors: js.UndefOr[js.Array[Person]] = js.undefined
    
    /**
      * Specify that your code only runs on certain cpu architectures.
      */
    var cpu: js.UndefOr[js.Array[String]] = js.undefined
    
    var dependencies: js.UndefOr[Dependency] = js.undefined
    
    /**
      * This helps people discover your package, as it's listed in 'npm search'.
      */
    var description: js.UndefOr[String] = js.undefined
    
    var devDependencies: js.UndefOr[Dependency] = js.undefined
    
    var directories: js.UndefOr[Bin] = js.undefined
    
    var dist: js.UndefOr[Shasum] = js.undefined
    
    var engineStrict: js.UndefOr[Boolean] = js.undefined
    
    var engines: js.UndefOr[Node] = js.undefined
    
    /**
      * A module ID with untranspiled code that is the primary entry point to your program.
      */
    var esnext: js.UndefOr[String | Browser] = js.undefined
    
    /**
      * The "exports" field is used to restrict external access to non-exported module files, also enables a module to import itself using "name".
      */
    var exports: js.UndefOr[String | Null | _empty | Default | js.Array[PackageExportsEntry]] = js.undefined
    
    /**
      * The 'files' field is an array of files to include in your project. If you name a folder in the array, then it will also include the files inside that folder.
      */
    var files: js.UndefOr[js.Array[String]] = js.undefined
    
    var funding: js.UndefOr[FundingUrl | FundingWay | (Array[FundingUrl | FundingWay])] = js.undefined
    
    /**
      * The url to the project homepage.
      */
    var homepage: js.UndefOr[String] = js.undefined
    
    var jspm: js.UndefOr[PackageJSON1] = js.undefined
    
    /**
      * This helps people discover your package as it's listed in 'npm search'.
      */
    var keywords: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * You should specify a license for your package so that people know how they are permitted to use it, and any restrictions you're placing on it.
      */
    var license: js.UndefOr[String] = js.undefined
    
    /**
      * DEPRECATED: Instead, use SPDX expressions, like this: { "license": "ISC" } or
      * { "license": "(MIT OR Apache-2.0)" } see: 'https://docs.npmjs.com/files/package.json#license'.
      * @deprecated
      */
    var licenses: js.UndefOr[js.Array[Type]] = js.undefined
    
    /**
      * The main field is a module ID that is the primary entry point to your program.
      */
    var main: js.UndefOr[String] = js.undefined
    
    /**
      * A list of people who maintains this package.
      */
    var maintainers: js.UndefOr[js.Array[Person]] = js.undefined
    
    /**
      * Specify either a single file or an array of filenames to put in place for the man program to find.
      */
    var man: js.UndefOr[js.Array[String] | String] = js.undefined
    
    /**
      * An ECMAScript module ID that is the primary entry point to your program.
      */
    var module: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the package.
      */
    var name: js.UndefOr[String] = js.undefined
    
    var optionalDependencies: js.UndefOr[Dependency] = js.undefined
    
    /**
      * Specify which operating systems your module will run on.
      */
    var os: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Defines which package manager is expected to be used when working on the current project. This field is currently experimental and needs to be opted-in; see https://nodejs.org/api/corepack.html
      */
    var packageManager: js.UndefOr[String] = js.undefined
    
    var peerDependencies: js.UndefOr[Dependency] = js.undefined
    
    /**
      * When a user installs your package, warnings are emitted if packages specified in "peerDependencies" are not
      * already installed. The "peerDependenciesMeta" field serves to provide more information on how your peer
      * dependencies are utilized. Most commonly, it allows peer dependencies to be marked as optional. Metadata for
      * this field is specified with a simple hash of the package name to a metadata object.
      */
    var peerDependenciesMeta: js.UndefOr[StringDictionary[js.UndefOr[Optional]]] = js.undefined
    
    /**
      * DEPRECATED: This option used to trigger an npm warning, but it will no longer warn. It is purely there for
      * informational purposes. It is now recommended that you install any binaries as local devDependencies wherever possible.
      * @deprecated
      */
    var preferGlobal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to true, then npm will refuse to publish it.
      */
    var `private`: js.UndefOr[Boolean] = js.undefined
    
    var publishConfig: js.UndefOr[Access] = js.undefined
    
    var readme: js.UndefOr[String] = js.undefined
    
    /**
      * Specify the place where your code lives. This is helpful for people who want to contribute.
      */
    var repository: js.UndefOr[Directory | String] = js.undefined
    
    /**
      * Resolutions is used to support selective version resolutions, which lets you define custom package versions or
      * ranges inside your dependencies. See: https://classic.yarnpkg.com/en/docs/selective-version-resolutions
      */
    var resolutions: js.UndefOr[StringDictionary[js.UndefOr[Any]]] = js.undefined
    
    /**
      * The 'scripts' member is an object hash of script commands that are run at various times in the lifecycle of
      * your package. The key is the lifecycle event, and the value is the command to run at that point.
      */
    var scripts: js.UndefOr[Install] = js.undefined
    
    /**
      * When set to "module", the type field allows a package to specify all .js files within are ES modules. If the "type" field is omitted or set to "commonjs", all .js files are treated as CommonJS.
      */
    var `type`: js.UndefOr[commonjs | module] = js.undefined
    
    /**
      * Set the types property to point to your bundled declaration file.
      */
    var types: js.UndefOr[String] = js.undefined
    
    /**
      * The "typesVersions" field is used since TypeScript 3.1 to support features that were only made available in newer TypeScript versions.
      */
    var typesVersions: js.UndefOr[
        /**
      * Contains overrides for the TypeScript version that matches the version range matching the property key.
      */
    StringDictionary[js.UndefOr[`0`]]
      ] = js.undefined
    
    /**
      * Note that the "typings" field is synonymous with "types", and could be used as well.
      */
    @JSName("typings")
    var typings_ : js.UndefOr[String] = js.undefined
    
    /**
      * Version must be parseable by node-semver, which is bundled with npm as a dependency.
      */
    var version: js.UndefOr[String] = js.undefined
    
    /**
      * Allows packages within a directory to depend on one another using direct linking of local files. Additionally,
      * dependencies within a workspace are hoisted to the workspace root when possible to reduce duplication. Note:
      * It's also a good idea to set "private" to true when using this feature.
      */
    var workspaces: js.UndefOr[js.Array[String] | Nohoist] = js.undefined
  }
  object PackageJSON2 {
    
    inline def apply(): PackageJSON2 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PackageJSON2]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PackageJSON2] (val x: Self) extends AnyVal {
      
      inline def setAuthor(value: Person): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setBin(value: String | StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
      
      inline def setBugs(value: Email | String): Self = StObject.set(x, "bugs", value.asInstanceOf[js.Any])
      
      inline def setBugsUndefined: Self = StObject.set(x, "bugs", js.undefined)
      
      inline def setBundleDependencies(value: js.Array[String] | Boolean): Self = StObject.set(x, "bundleDependencies", value.asInstanceOf[js.Any])
      
      inline def setBundleDependenciesUndefined: Self = StObject.set(x, "bundleDependencies", js.undefined)
      
      inline def setBundleDependenciesVarargs(value: String*): Self = StObject.set(x, "bundleDependencies", js.Array(value*))
      
      inline def setBundledDependencies(value: js.Array[String] | Boolean): Self = StObject.set(x, "bundledDependencies", value.asInstanceOf[js.Any])
      
      inline def setBundledDependenciesUndefined: Self = StObject.set(x, "bundledDependencies", js.undefined)
      
      inline def setBundledDependenciesVarargs(value: String*): Self = StObject.set(x, "bundledDependencies", js.Array(value*))
      
      inline def setConfig(value: StringDictionary[js.UndefOr[Any]]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setContributors(value: js.Array[Person]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
      
      inline def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
      
      inline def setContributorsVarargs(value: Person*): Self = StObject.set(x, "contributors", js.Array(value*))
      
      inline def setCpu(value: js.Array[String]): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
      
      inline def setCpuVarargs(value: String*): Self = StObject.set(x, "cpu", js.Array(value*))
      
      inline def setDependencies(value: Dependency): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDevDependencies(value: Dependency): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      inline def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      inline def setDirectories(value: Bin): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
      
      inline def setDist(value: Shasum): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
      
      inline def setDistUndefined: Self = StObject.set(x, "dist", js.undefined)
      
      inline def setEngineStrict(value: Boolean): Self = StObject.set(x, "engineStrict", value.asInstanceOf[js.Any])
      
      inline def setEngineStrictUndefined: Self = StObject.set(x, "engineStrict", js.undefined)
      
      inline def setEngines(value: Node): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
      
      inline def setEnginesUndefined: Self = StObject.set(x, "engines", js.undefined)
      
      inline def setEsnext(value: String | Browser): Self = StObject.set(x, "esnext", value.asInstanceOf[js.Any])
      
      inline def setEsnextUndefined: Self = StObject.set(x, "esnext", js.undefined)
      
      inline def setExports(value: String | _empty | Default | js.Array[PackageExportsEntry]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      inline def setExportsNull: Self = StObject.set(x, "exports", null)
      
      inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
      
      inline def setExportsVarargs(value: PackageExportsEntry*): Self = StObject.set(x, "exports", js.Array(value*))
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setFunding(value: FundingUrl | FundingWay | (Array[FundingUrl | FundingWay])): Self = StObject.set(x, "funding", value.asInstanceOf[js.Any])
      
      inline def setFundingUndefined: Self = StObject.set(x, "funding", js.undefined)
      
      inline def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
      
      inline def setJspm(value: PackageJSON1): Self = StObject.set(x, "jspm", value.asInstanceOf[js.Any])
      
      inline def setJspmUndefined: Self = StObject.set(x, "jspm", js.undefined)
      
      inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
      
      inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      inline def setLicenses(value: js.Array[Type]): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
      
      inline def setLicensesUndefined: Self = StObject.set(x, "licenses", js.undefined)
      
      inline def setLicensesVarargs(value: Type*): Self = StObject.set(x, "licenses", js.Array(value*))
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def setMaintainers(value: js.Array[Person]): Self = StObject.set(x, "maintainers", value.asInstanceOf[js.Any])
      
      inline def setMaintainersUndefined: Self = StObject.set(x, "maintainers", js.undefined)
      
      inline def setMaintainersVarargs(value: Person*): Self = StObject.set(x, "maintainers", js.Array(value*))
      
      inline def setMan(value: js.Array[String] | String): Self = StObject.set(x, "man", value.asInstanceOf[js.Any])
      
      inline def setManUndefined: Self = StObject.set(x, "man", js.undefined)
      
      inline def setManVarargs(value: String*): Self = StObject.set(x, "man", js.Array(value*))
      
      inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOptionalDependencies(value: Dependency): Self = StObject.set(x, "optionalDependencies", value.asInstanceOf[js.Any])
      
      inline def setOptionalDependenciesUndefined: Self = StObject.set(x, "optionalDependencies", js.undefined)
      
      inline def setOs(value: js.Array[String]): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
      
      inline def setOsVarargs(value: String*): Self = StObject.set(x, "os", js.Array(value*))
      
      inline def setPackageManager(value: String): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
      
      inline def setPackageManagerUndefined: Self = StObject.set(x, "packageManager", js.undefined)
      
      inline def setPeerDependencies(value: Dependency): Self = StObject.set(x, "peerDependencies", value.asInstanceOf[js.Any])
      
      inline def setPeerDependenciesMeta(value: StringDictionary[js.UndefOr[Optional]]): Self = StObject.set(x, "peerDependenciesMeta", value.asInstanceOf[js.Any])
      
      inline def setPeerDependenciesMetaUndefined: Self = StObject.set(x, "peerDependenciesMeta", js.undefined)
      
      inline def setPeerDependenciesUndefined: Self = StObject.set(x, "peerDependencies", js.undefined)
      
      inline def setPreferGlobal(value: Boolean): Self = StObject.set(x, "preferGlobal", value.asInstanceOf[js.Any])
      
      inline def setPreferGlobalUndefined: Self = StObject.set(x, "preferGlobal", js.undefined)
      
      inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      inline def setPublishConfig(value: Access): Self = StObject.set(x, "publishConfig", value.asInstanceOf[js.Any])
      
      inline def setPublishConfigUndefined: Self = StObject.set(x, "publishConfig", js.undefined)
      
      inline def setReadme(value: String): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
      
      inline def setReadmeUndefined: Self = StObject.set(x, "readme", js.undefined)
      
      inline def setRepository(value: Directory | String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      inline def setResolutions(value: StringDictionary[js.UndefOr[Any]]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      inline def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
      
      inline def setScripts(value: Install): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      inline def setType(value: commonjs | module): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setTypesVersions(
        value: /**
        * Contains overrides for the TypeScript version that matches the version range matching the property key.
        */
      StringDictionary[js.UndefOr[`0`]]
      ): Self = StObject.set(x, "typesVersions", value.asInstanceOf[js.Any])
      
      inline def setTypesVersionsUndefined: Self = StObject.set(x, "typesVersions", js.undefined)
      
      inline def setTypings_(value: String): Self = StObject.set(x, "typings", value.asInstanceOf[js.Any])
      
      inline def setTypings_Undefined: Self = StObject.set(x, "typings", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setWorkspaces(value: js.Array[String] | Nohoist): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
      
      inline def setWorkspacesUndefined: Self = StObject.set(x, "workspaces", js.undefined)
      
      inline def setWorkspacesVarargs(value: String*): Self = StObject.set(x, "workspaces", js.Array(value*))
    }
  }
  
  type Person = Dictk | String
  
  type ScriptsInstallAfter = String
  
  type ScriptsPublishAfter = String
  
  type ScriptsRestart = String
  
  type ScriptsStart = String
  
  type ScriptsStop = String
  
  type ScriptsTest = String
  
  type ScriptsUninstallBefore = String
  
  type ScriptsVersionBefore = String
}
