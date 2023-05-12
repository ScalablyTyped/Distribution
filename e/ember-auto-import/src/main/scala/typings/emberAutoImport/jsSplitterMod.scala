package typings.emberAutoImport

import typings.emberAutoImport.jsAnalyzerMod.LiteralImport
import typings.emberAutoImport.jsAnalyzerMod.TemplateImport
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSplitterMod {
  
  @JSImport("ember-auto-import/js/splitter", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Splitter {
    def this(options: SplitterOptions) = this()
    
    /* private */ /* CompleteClass */
    var assertSafeVersion: Any = js.native
    
    /* private */ /* CompleteClass */
    var bundleFor: Any = js.native
    
    /* private */ /* CompleteClass */
    var chooseBundle: Any = js.native
    
    /* private */ /* CompleteClass */
    var computeDeps: Any = js.native
    
    /* private */ /* CompleteClass */
    var computeTargets: Any = js.native
    
    /* CompleteClass */
    override def deps(): js.Promise[Map[String, BundleDependencies]] = js.native
    
    /* private */ /* CompleteClass */
    var handleLiteralImport: Any = js.native
    
    /* private */ /* CompleteClass */
    var handleTemplateImport: Any = js.native
    
    /* private */ /* CompleteClass */
    var importsChanged: Any = js.native
    
    /* private */ /* CompleteClass */
    var lastDeps: Any = js.native
    
    /* private */ /* CompleteClass */
    var lastImports: Any = js.native
    
    /* private */ /* CompleteClass */
    var options: Any = js.native
    
    /* private */ /* CompleteClass */
    var packageVersions: Any = js.native
    
    /* private */ /* CompleteClass */
    var sortBundle: Any = js.native
    
    /* private */ /* CompleteClass */
    var sortDependencies: Any = js.native
    
    /* private */ /* CompleteClass */
    var versionOfPackage: Any = js.native
  }
  
  trait BundleDependencies extends StObject {
    
    var dynamicImports: js.Array[ResolvedImport]
    
    var dynamicTemplateImports: js.Array[ResolvedTemplateImport]
    
    var staticImports: js.Array[ResolvedImport]
    
    var staticTemplateImports: js.Array[ResolvedTemplateImport]
  }
  object BundleDependencies {
    
    inline def apply(
      dynamicImports: js.Array[ResolvedImport],
      dynamicTemplateImports: js.Array[ResolvedTemplateImport],
      staticImports: js.Array[ResolvedImport],
      staticTemplateImports: js.Array[ResolvedTemplateImport]
    ): BundleDependencies = {
      val __obj = js.Dynamic.literal(dynamicImports = dynamicImports.asInstanceOf[js.Any], dynamicTemplateImports = dynamicTemplateImports.asInstanceOf[js.Any], staticImports = staticImports.asInstanceOf[js.Any], staticTemplateImports = staticTemplateImports.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundleDependencies]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BundleDependencies] (val x: Self) extends AnyVal {
      
      inline def setDynamicImports(value: js.Array[ResolvedImport]): Self = StObject.set(x, "dynamicImports", value.asInstanceOf[js.Any])
      
      inline def setDynamicImportsVarargs(value: ResolvedImport*): Self = StObject.set(x, "dynamicImports", js.Array(value*))
      
      inline def setDynamicTemplateImports(value: js.Array[ResolvedTemplateImport]): Self = StObject.set(x, "dynamicTemplateImports", value.asInstanceOf[js.Any])
      
      inline def setDynamicTemplateImportsVarargs(value: ResolvedTemplateImport*): Self = StObject.set(x, "dynamicTemplateImports", js.Array(value*))
      
      inline def setStaticImports(value: js.Array[ResolvedImport]): Self = StObject.set(x, "staticImports", value.asInstanceOf[js.Any])
      
      inline def setStaticImportsVarargs(value: ResolvedImport*): Self = StObject.set(x, "staticImports", js.Array(value*))
      
      inline def setStaticTemplateImports(value: js.Array[ResolvedTemplateImport]): Self = StObject.set(x, "staticTemplateImports", value.asInstanceOf[js.Any])
      
      inline def setStaticTemplateImportsVarargs(value: ResolvedTemplateImport*): Self = StObject.set(x, "staticTemplateImports", js.Array(value*))
    }
  }
  
  trait ResolvedImport extends StObject {
    
    var importedBy: js.Array[LiteralImport]
    
    var packageName: String
    
    var packageRoot: String
    
    var specifier: String
  }
  object ResolvedImport {
    
    inline def apply(importedBy: js.Array[LiteralImport], packageName: String, packageRoot: String, specifier: String): ResolvedImport = {
      val __obj = js.Dynamic.literal(importedBy = importedBy.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], packageRoot = packageRoot.asInstanceOf[js.Any], specifier = specifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedImport]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolvedImport] (val x: Self) extends AnyVal {
      
      inline def setImportedBy(value: js.Array[LiteralImport]): Self = StObject.set(x, "importedBy", value.asInstanceOf[js.Any])
      
      inline def setImportedByVarargs(value: LiteralImport*): Self = StObject.set(x, "importedBy", js.Array(value*))
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setPackageRoot(value: String): Self = StObject.set(x, "packageRoot", value.asInstanceOf[js.Any])
      
      inline def setSpecifier(value: String): Self = StObject.set(x, "specifier", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolvedTemplateImport extends StObject {
    
    var cookedQuasis: js.Array[String]
    
    var expressionNameHints: js.Array[String]
    
    var importedBy: js.Array[TemplateImport]
    
    var packageName: String
    
    var packageRoot: String
  }
  object ResolvedTemplateImport {
    
    inline def apply(
      cookedQuasis: js.Array[String],
      expressionNameHints: js.Array[String],
      importedBy: js.Array[TemplateImport],
      packageName: String,
      packageRoot: String
    ): ResolvedTemplateImport = {
      val __obj = js.Dynamic.literal(cookedQuasis = cookedQuasis.asInstanceOf[js.Any], expressionNameHints = expressionNameHints.asInstanceOf[js.Any], importedBy = importedBy.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], packageRoot = packageRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedTemplateImport]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolvedTemplateImport] (val x: Self) extends AnyVal {
      
      inline def setCookedQuasis(value: js.Array[String]): Self = StObject.set(x, "cookedQuasis", value.asInstanceOf[js.Any])
      
      inline def setCookedQuasisVarargs(value: String*): Self = StObject.set(x, "cookedQuasis", js.Array(value*))
      
      inline def setExpressionNameHints(value: js.Array[String]): Self = StObject.set(x, "expressionNameHints", value.asInstanceOf[js.Any])
      
      inline def setExpressionNameHintsVarargs(value: String*): Self = StObject.set(x, "expressionNameHints", js.Array(value*))
      
      inline def setImportedBy(value: js.Array[TemplateImport]): Self = StObject.set(x, "importedBy", value.asInstanceOf[js.Any])
      
      inline def setImportedByVarargs(value: TemplateImport*): Self = StObject.set(x, "importedBy", js.Array(value*))
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setPackageRoot(value: String): Self = StObject.set(x, "packageRoot", value.asInstanceOf[js.Any])
    }
  }
  
  trait Splitter extends StObject {
    
    /* private */ var assertSafeVersion: Any
    
    /* private */ var bundleFor: Any
    
    /* private */ var chooseBundle: Any
    
    /* private */ var computeDeps: Any
    
    /* private */ var computeTargets: Any
    
    def deps(): js.Promise[Map[String, BundleDependencies]]
    
    /* private */ var handleLiteralImport: Any
    
    /* private */ var handleTemplateImport: Any
    
    /* private */ var importsChanged: Any
    
    /* private */ var lastDeps: Any
    
    /* private */ var lastImports: Any
    
    /* private */ var options: Any
    
    /* private */ var packageVersions: Any
    
    /* private */ var sortBundle: Any
    
    /* private */ var sortDependencies: Any
    
    /* private */ var versionOfPackage: Any
  }
  object Splitter {
    
    inline def apply(
      assertSafeVersion: Any,
      bundleFor: Any,
      chooseBundle: Any,
      computeDeps: Any,
      computeTargets: Any,
      deps: () => js.Promise[Map[String, BundleDependencies]],
      handleLiteralImport: Any,
      handleTemplateImport: Any,
      importsChanged: Any,
      lastDeps: Any,
      lastImports: Any,
      options: Any,
      packageVersions: Any,
      sortBundle: Any,
      sortDependencies: Any,
      versionOfPackage: Any
    ): Splitter = {
      val __obj = js.Dynamic.literal(assertSafeVersion = assertSafeVersion.asInstanceOf[js.Any], bundleFor = bundleFor.asInstanceOf[js.Any], chooseBundle = chooseBundle.asInstanceOf[js.Any], computeDeps = computeDeps.asInstanceOf[js.Any], computeTargets = computeTargets.asInstanceOf[js.Any], deps = js.Any.fromFunction0(deps), handleLiteralImport = handleLiteralImport.asInstanceOf[js.Any], handleTemplateImport = handleTemplateImport.asInstanceOf[js.Any], importsChanged = importsChanged.asInstanceOf[js.Any], lastDeps = lastDeps.asInstanceOf[js.Any], lastImports = lastImports.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], packageVersions = packageVersions.asInstanceOf[js.Any], sortBundle = sortBundle.asInstanceOf[js.Any], sortDependencies = sortDependencies.asInstanceOf[js.Any], versionOfPackage = versionOfPackage.asInstanceOf[js.Any])
      __obj.asInstanceOf[Splitter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Splitter] (val x: Self) extends AnyVal {
      
      inline def setAssertSafeVersion(value: Any): Self = StObject.set(x, "assertSafeVersion", value.asInstanceOf[js.Any])
      
      inline def setBundleFor(value: Any): Self = StObject.set(x, "bundleFor", value.asInstanceOf[js.Any])
      
      inline def setChooseBundle(value: Any): Self = StObject.set(x, "chooseBundle", value.asInstanceOf[js.Any])
      
      inline def setComputeDeps(value: Any): Self = StObject.set(x, "computeDeps", value.asInstanceOf[js.Any])
      
      inline def setComputeTargets(value: Any): Self = StObject.set(x, "computeTargets", value.asInstanceOf[js.Any])
      
      inline def setDeps(value: () => js.Promise[Map[String, BundleDependencies]]): Self = StObject.set(x, "deps", js.Any.fromFunction0(value))
      
      inline def setHandleLiteralImport(value: Any): Self = StObject.set(x, "handleLiteralImport", value.asInstanceOf[js.Any])
      
      inline def setHandleTemplateImport(value: Any): Self = StObject.set(x, "handleTemplateImport", value.asInstanceOf[js.Any])
      
      inline def setImportsChanged(value: Any): Self = StObject.set(x, "importsChanged", value.asInstanceOf[js.Any])
      
      inline def setLastDeps(value: Any): Self = StObject.set(x, "lastDeps", value.asInstanceOf[js.Any])
      
      inline def setLastImports(value: Any): Self = StObject.set(x, "lastImports", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPackageVersions(value: Any): Self = StObject.set(x, "packageVersions", value.asInstanceOf[js.Any])
      
      inline def setSortBundle(value: Any): Self = StObject.set(x, "sortBundle", value.asInstanceOf[js.Any])
      
      inline def setSortDependencies(value: Any): Self = StObject.set(x, "sortDependencies", value.asInstanceOf[js.Any])
      
      inline def setVersionOfPackage(value: Any): Self = StObject.set(x, "versionOfPackage", value.asInstanceOf[js.Any])
    }
  }
  
  trait SplitterOptions extends StObject {
    
    var analyzers: Map[
        typings.emberAutoImport.jsAnalyzerMod.default, 
        typings.emberAutoImport.jsPackageMod.default
      ]
    
    var bundles: typings.emberAutoImport.jsBundleConfigMod.default
  }
  object SplitterOptions {
    
    inline def apply(
      analyzers: Map[
          typings.emberAutoImport.jsAnalyzerMod.default, 
          typings.emberAutoImport.jsPackageMod.default
        ],
      bundles: typings.emberAutoImport.jsBundleConfigMod.default
    ): SplitterOptions = {
      val __obj = js.Dynamic.literal(analyzers = analyzers.asInstanceOf[js.Any], bundles = bundles.asInstanceOf[js.Any])
      __obj.asInstanceOf[SplitterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SplitterOptions] (val x: Self) extends AnyVal {
      
      inline def setAnalyzers(
        value: Map[
              typings.emberAutoImport.jsAnalyzerMod.default, 
              typings.emberAutoImport.jsPackageMod.default
            ]
      ): Self = StObject.set(x, "analyzers", value.asInstanceOf[js.Any])
      
      inline def setBundles(value: typings.emberAutoImport.jsBundleConfigMod.default): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    }
  }
}
