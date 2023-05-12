package typings.embroiderSharedInternals

import org.scalablytyped.runtime.StringDictionary
import typings.broccoliNodeApi.mod.Node
import typings.embroiderSharedInternals.anon.Addon
import typings.embroiderSharedInternals.anon.Name
import typings.embroiderSharedInternals.anon.Options
import typings.embroiderSharedInternals.anon.Type
import typings.embroiderSharedInternals.anon.Write
import typings.embroiderSharedInternals.embroiderSharedInternalsStrings.development
import typings.embroiderSharedInternals.embroiderSharedInternalsStrings.production
import typings.embroiderSharedInternals.embroiderSharedInternalsStrings.test
import typings.embroiderSharedInternals.srcMetadataMod.PackageInfo
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEmberCliModelsMod {
  
  @JSImport("@embroider/shared-internals/src/ember-cli-models", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findTopmostAddon(addon: AddonInstance): ShallowAddonInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("findTopmostAddon")(addon.asInstanceOf[js.Any]).asInstanceOf[ShallowAddonInstance]
  
  inline def isDeepAddonInstance(addon: AddonInstance): /* is @embroider/shared-internals.@embroider/shared-internals/src/ember-cli-models.DeepAddonInstance */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeepAddonInstance")(addon.asInstanceOf[js.Any]).asInstanceOf[/* is @embroider/shared-internals.@embroider/shared-internals/src/ember-cli-models.DeepAddonInstance */ Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.embroiderSharedInternals.srcEmberCliModelsMod.DeepAddonInstance
    - typings.embroiderSharedInternals.srcEmberCliModelsMod.ShallowAddonInstance
  */
  trait AddonInstance extends StObject
  
  type AddonTreePath = /* import warning: importer.ImportType#apply Failed type conversion: 'registry' | 'project' | 'pkg' | 'app' | 'root' | 'options' | 'addons' | 'name' | '_name' | '_super' | '_meta_' | 'moduleName' | 'isDevelopingAddon' | 'cacheKeyForTree' | 'getEngineConfigContents' | 'engineConfig' | 'treePaths' | 'treeForMethods'['treePaths'] */ js.Any
  
  @js.native
  trait AppInstance extends StObject {
    
    def addonPostprocessTree(which: String, tree: Node): Node = js.native
    
    var env: development | test | production = js.native
    
    def `import`(path: String): Unit = js.native
    def `import`(path: String, opts: Type): Unit = js.native
    
    var options: Any = js.native
    
    var project: Project = js.native
    
    def toTree(): Node = js.native
    def toTree(additionalTrees: js.Array[Node]): Node = js.native
  }
  
  @js.native
  trait BaseAddonInstance extends StObject {
    
    def _buildFastbootConfigTree(config: Any): Node = js.native
    
    def _findHost(): AppInstance = js.native
    
    var _meta_ : Any = js.native
    
    var _name: String = js.native
    
    def _shouldIncludeFiles(): Boolean = js.native
    
    var _super: Any = js.native
    
    def _treeFor(treeName: String): Node = js.native
    
    var addons: js.Array[AddonInstance] = js.native
    
    var app: Options = js.native
    
    var cacheKeyForTree: js.UndefOr[js.Function1[/* treeName */ String, String]] = js.native
    
    def compileStyles(tree: Node): Node = js.native
    
    var engineConfig: js.UndefOr[js.Function2[/* env */ String, /* config */ Any, Any]] = js.native
    
    var getEngineConfigContents: js.UndefOr[js.Function0[Any]] = js.native
    
    def hintingEnabled(): Boolean = js.native
    
    var isDevelopingAddon: js.UndefOr[js.Function0[Boolean]] = js.native
    
    def jshintAddonTree(): js.UndefOr[Node] = js.native
    
    var moduleName: js.UndefOr[js.Function0[String]] = js.native
    
    var name: String = js.native
    
    var options: Any = js.native
    
    def outputReady(config: Any): Any = js.native
    
    var pkg: PackageInfo = js.native
    
    def preprocessJs(tree: Node, sep: Any, moduleName: Any, config: Any): Node = js.native
    
    var project: Project = js.native
    
    var registry: EmberCliPreprocessRegistry = js.native
    
    var root: String = js.native
    
    def shouldCompileTemplates(): Boolean = js.native
    
    def treeForFastBoot(): js.UndefOr[Node] = js.native
    def treeForFastBoot(
      tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Funnel */ Any
    ): js.UndefOr[Node] = js.native
    
    var treeForMethods: Record[String, String] = js.native
    
    def treeGenerator(path: String): Node = js.native
    
    var treePaths: Addon = js.native
  }
  
  @js.native
  trait DeepAddonInstance
    extends StObject
       with BaseAddonInstance
       with AddonInstance {
    
    var parent: AddonInstance = js.native
  }
  
  trait EmberAppInstance extends StObject {
    
    var _customTransformsMap: Map[String, Any]
    
    var _nodeModules: Map[String, Name]
    
    var _scriptOutputFiles: OutputFileToInputFileMap
    
    var _styleOutputFiles: OutputFileToInputFileMap
    
    def addonPostprocessTree(which: String, tree: Node): Node
    
    var env: development | test | production
    
    def getLintTests(): Node
    
    var legacyTestFilesToAppend: js.Array[FilePath]
    
    var name: String
    
    var options: Any
    
    var otherAssetPaths: js.Array[Any]
    
    var project: Project
    
    var registry: EmberCliPreprocessRegistry
    
    def testIndex(): Node
    
    var tests: Boolean
    
    var trees: Any
    
    var vendorTestStaticStyles: js.Array[FilePath]
  }
  object EmberAppInstance {
    
    inline def apply(
      _customTransformsMap: Map[String, Any],
      _nodeModules: Map[String, Name],
      _scriptOutputFiles: OutputFileToInputFileMap,
      _styleOutputFiles: OutputFileToInputFileMap,
      addonPostprocessTree: (String, Node) => Node,
      env: development | test | production,
      getLintTests: () => Node,
      legacyTestFilesToAppend: js.Array[FilePath],
      name: String,
      options: Any,
      otherAssetPaths: js.Array[Any],
      project: Project,
      registry: EmberCliPreprocessRegistry,
      testIndex: () => Node,
      tests: Boolean,
      trees: Any,
      vendorTestStaticStyles: js.Array[FilePath]
    ): EmberAppInstance = {
      val __obj = js.Dynamic.literal(_customTransformsMap = _customTransformsMap.asInstanceOf[js.Any], _nodeModules = _nodeModules.asInstanceOf[js.Any], _scriptOutputFiles = _scriptOutputFiles.asInstanceOf[js.Any], _styleOutputFiles = _styleOutputFiles.asInstanceOf[js.Any], addonPostprocessTree = js.Any.fromFunction2(addonPostprocessTree), env = env.asInstanceOf[js.Any], getLintTests = js.Any.fromFunction0(getLintTests), legacyTestFilesToAppend = legacyTestFilesToAppend.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], otherAssetPaths = otherAssetPaths.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], testIndex = js.Any.fromFunction0(testIndex), tests = tests.asInstanceOf[js.Any], trees = trees.asInstanceOf[js.Any], vendorTestStaticStyles = vendorTestStaticStyles.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmberAppInstance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmberAppInstance] (val x: Self) extends AnyVal {
      
      inline def setAddonPostprocessTree(value: (String, Node) => Node): Self = StObject.set(x, "addonPostprocessTree", js.Any.fromFunction2(value))
      
      inline def setEnv(value: development | test | production): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setGetLintTests(value: () => Node): Self = StObject.set(x, "getLintTests", js.Any.fromFunction0(value))
      
      inline def setLegacyTestFilesToAppend(value: js.Array[FilePath]): Self = StObject.set(x, "legacyTestFilesToAppend", value.asInstanceOf[js.Any])
      
      inline def setLegacyTestFilesToAppendVarargs(value: FilePath*): Self = StObject.set(x, "legacyTestFilesToAppend", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOtherAssetPaths(value: js.Array[Any]): Self = StObject.set(x, "otherAssetPaths", value.asInstanceOf[js.Any])
      
      inline def setOtherAssetPathsVarargs(value: Any*): Self = StObject.set(x, "otherAssetPaths", js.Array(value*))
      
      inline def setProject(value: Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setRegistry(value: EmberCliPreprocessRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setTestIndex(value: () => Node): Self = StObject.set(x, "testIndex", js.Any.fromFunction0(value))
      
      inline def setTests(value: Boolean): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
      
      inline def setTrees(value: Any): Self = StObject.set(x, "trees", value.asInstanceOf[js.Any])
      
      inline def setVendorTestStaticStyles(value: js.Array[FilePath]): Self = StObject.set(x, "vendorTestStaticStyles", value.asInstanceOf[js.Any])
      
      inline def setVendorTestStaticStylesVarargs(value: FilePath*): Self = StObject.set(x, "vendorTestStaticStyles", js.Array(value*))
      
      inline def set_customTransformsMap(value: Map[String, Any]): Self = StObject.set(x, "_customTransformsMap", value.asInstanceOf[js.Any])
      
      inline def set_nodeModules(value: Map[String, Name]): Self = StObject.set(x, "_nodeModules", value.asInstanceOf[js.Any])
      
      inline def set_scriptOutputFiles(value: OutputFileToInputFileMap): Self = StObject.set(x, "_scriptOutputFiles", value.asInstanceOf[js.Any])
      
      inline def set_styleOutputFiles(value: OutputFileToInputFileMap): Self = StObject.set(x, "_styleOutputFiles", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmberCliPreprocessRegistry extends StObject {
    
    def add(`type`: String, plugin: PreprocessPlugin): Unit
    
    def extensionsForType(`type`: String): js.Array[String]
    
    def load(`type`: String): js.Array[PreprocessPlugin]
    
    def registeredForType(`type`: String): js.Array[PreprocessPlugin]
    
    def remove(`type`: String, pluginName: String): Unit
  }
  object EmberCliPreprocessRegistry {
    
    inline def apply(
      add: (String, PreprocessPlugin) => Unit,
      extensionsForType: String => js.Array[String],
      load: String => js.Array[PreprocessPlugin],
      registeredForType: String => js.Array[PreprocessPlugin],
      remove: (String, String) => Unit
    ): EmberCliPreprocessRegistry = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), extensionsForType = js.Any.fromFunction1(extensionsForType), load = js.Any.fromFunction1(load), registeredForType = js.Any.fromFunction1(registeredForType), remove = js.Any.fromFunction2(remove))
      __obj.asInstanceOf[EmberCliPreprocessRegistry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmberCliPreprocessRegistry] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: (String, PreprocessPlugin) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setExtensionsForType(value: String => js.Array[String]): Self = StObject.set(x, "extensionsForType", js.Any.fromFunction1(value))
      
      inline def setLoad(value: String => js.Array[PreprocessPlugin]): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setRegisteredForType(value: String => js.Array[PreprocessPlugin]): Self = StObject.set(x, "registeredForType", js.Any.fromFunction1(value))
      
      inline def setRemove(value: (String, String) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    }
  }
  
  type FilePath = String
  
  type OutputFileToInputFileMap = StringDictionary[js.Array[FilePath]]
  
  trait PreprocessPlugin extends StObject {
    
    var ext: String
    
    var name: String
  }
  object PreprocessPlugin {
    
    inline def apply(ext: String, name: String): PreprocessPlugin = {
      val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreprocessPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreprocessPlugin] (val x: Self) extends AnyVal {
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Project extends StObject {
    
    var addons: js.Array[AddonInstance]
    
    def configPath(): String
    
    def name(): String
    
    var pkg: PackageInfo
    
    var root: String
    
    var targets: Any
    
    var ui: Write
  }
  object Project {
    
    inline def apply(
      addons: js.Array[AddonInstance],
      configPath: () => String,
      name: () => String,
      pkg: PackageInfo,
      root: String,
      targets: Any,
      ui: Write
    ): Project = {
      val __obj = js.Dynamic.literal(addons = addons.asInstanceOf[js.Any], configPath = js.Any.fromFunction0(configPath), name = js.Any.fromFunction0(name), pkg = pkg.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any])
      __obj.asInstanceOf[Project]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Project] (val x: Self) extends AnyVal {
      
      inline def setAddons(value: js.Array[AddonInstance]): Self = StObject.set(x, "addons", value.asInstanceOf[js.Any])
      
      inline def setAddonsVarargs(value: AddonInstance*): Self = StObject.set(x, "addons", js.Array(value*))
      
      inline def setConfigPath(value: () => String): Self = StObject.set(x, "configPath", js.Any.fromFunction0(value))
      
      inline def setName(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
      
      inline def setPkg(value: PackageInfo): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setTargets(value: Any): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setUi(value: Write): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ShallowAddonInstance
    extends StObject
       with BaseAddonInstance
       with AddonInstance {
    
    @JSName("app")
    var app_ShallowAddonInstance: AppInstance = js.native
    
    var parent: Project = js.native
  }
}
