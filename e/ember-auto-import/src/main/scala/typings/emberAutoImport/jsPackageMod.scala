package typings.emberAutoImport

import org.scalablytyped.runtime.StringDictionary
import typings.babelCore.mod.TransformOptions
import typings.emberAutoImport.emberAutoImportBooleans.`true`
import typings.emberAutoImport.emberAutoImportStrings._package
import typings.emberAutoImport.emberAutoImportStrings.dep
import typings.emberAutoImport.emberAutoImportStrings.imprecise
import typings.emberAutoImport.emberAutoImportStrings.local
import typings.emberAutoImport.emberAutoImportStrings.url
import typings.std.Map
import typings.std.Record
import typings.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsPackageMod {
  
  @JSImport("ember-auto-import/js/package", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ember-auto-import/js/package", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Package {
    def this(child: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AddonInstance */ Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("ember-auto-import/js/package", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def categorize(importedPath: String): local | url | imprecise | dep = ^.asInstanceOf[js.Dynamic].applyDynamic("categorize")(importedPath.asInstanceOf[js.Any]).asInstanceOf[local | url | imprecise | dep]
    inline def categorize(importedPath: String, partial: Boolean): local | url | imprecise | dep = (^.asInstanceOf[js.Dynamic].applyDynamic("categorize")(importedPath.asInstanceOf[js.Any], partial.asInstanceOf[js.Any])).asInstanceOf[local | url | imprecise | dep]
    
    inline def lookupParentOf(
      child: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AddonInstance */ Any
    ): Package = ^.asInstanceOf[js.Dynamic].applyDynamic("lookupParentOf")(child.asInstanceOf[js.Any]).asInstanceOf[Package]
  }
  
  inline def reloadDevPackages(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reloadDevPackages")().asInstanceOf[Unit]
  
  trait DepResolution extends StObject {
    
    var packageName: String
    
    var packageRoot: String
    
    var path: String
    
    var `type`: _package
  }
  object DepResolution {
    
    inline def apply(packageName: String, packageRoot: String, path: String): DepResolution = {
      val __obj = js.Dynamic.literal(packageName = packageName.asInstanceOf[js.Any], packageRoot = packageRoot.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("package")
      __obj.asInstanceOf[DepResolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DepResolution] (val x: Self) extends AnyVal {
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setPackageRoot(value: String): Self = StObject.set(x, "packageRoot", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: _package): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImpreciseResolution extends StObject {
    
    var `type`: imprecise
  }
  object ImpreciseResolution {
    
    inline def apply(): ImpreciseResolution = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("imprecise")
      __obj.asInstanceOf[ImpreciseResolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImpreciseResolution] (val x: Self) extends AnyVal {
      
      inline def setType(value: imprecise): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocalResolution extends StObject {
    
    var local: String
    
    var `type`: local
  }
  object LocalResolution {
    
    inline def apply(local: String): LocalResolution = {
      val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("local")
      __obj.asInstanceOf[LocalResolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocalResolution] (val x: Self) extends AnyVal {
      
      inline def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setType(value: local): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var alias: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var cssLoaderOptions: js.UndefOr[Record[String, Any]] = js.undefined
    
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var forbidEval: js.UndefOr[Boolean] = js.undefined
    
    var insertScriptsAt: js.UndefOr[String] = js.undefined
    
    var insertStylesAt: js.UndefOr[String] = js.undefined
    
    var miniCssExtractPluginOptions: js.UndefOr[Record[String, Any]] = js.undefined
    
    var publicAssetURL: js.UndefOr[String] = js.undefined
    
    var skipBabel: js.UndefOr[js.Array[typings.emberAutoImport.anon.Package]] = js.undefined
    
    var styleLoaderOptions: js.UndefOr[Record[String, Any]] = js.undefined
    
    var watchDependencies: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
    
    var webpack: js.UndefOr[Configuration] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAlias(value: StringDictionary[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setCssLoaderOptions(value: Record[String, Any]): Self = StObject.set(x, "cssLoaderOptions", value.asInstanceOf[js.Any])
      
      inline def setCssLoaderOptionsUndefined: Self = StObject.set(x, "cssLoaderOptions", js.undefined)
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setForbidEval(value: Boolean): Self = StObject.set(x, "forbidEval", value.asInstanceOf[js.Any])
      
      inline def setForbidEvalUndefined: Self = StObject.set(x, "forbidEval", js.undefined)
      
      inline def setInsertScriptsAt(value: String): Self = StObject.set(x, "insertScriptsAt", value.asInstanceOf[js.Any])
      
      inline def setInsertScriptsAtUndefined: Self = StObject.set(x, "insertScriptsAt", js.undefined)
      
      inline def setInsertStylesAt(value: String): Self = StObject.set(x, "insertStylesAt", value.asInstanceOf[js.Any])
      
      inline def setInsertStylesAtUndefined: Self = StObject.set(x, "insertStylesAt", js.undefined)
      
      inline def setMiniCssExtractPluginOptions(value: Record[String, Any]): Self = StObject.set(x, "miniCssExtractPluginOptions", value.asInstanceOf[js.Any])
      
      inline def setMiniCssExtractPluginOptionsUndefined: Self = StObject.set(x, "miniCssExtractPluginOptions", js.undefined)
      
      inline def setPublicAssetURL(value: String): Self = StObject.set(x, "publicAssetURL", value.asInstanceOf[js.Any])
      
      inline def setPublicAssetURLUndefined: Self = StObject.set(x, "publicAssetURL", js.undefined)
      
      inline def setSkipBabel(value: js.Array[typings.emberAutoImport.anon.Package]): Self = StObject.set(x, "skipBabel", value.asInstanceOf[js.Any])
      
      inline def setSkipBabelUndefined: Self = StObject.set(x, "skipBabel", js.undefined)
      
      inline def setSkipBabelVarargs(value: typings.emberAutoImport.anon.Package*): Self = StObject.set(x, "skipBabel", js.Array(value*))
      
      inline def setStyleLoaderOptions(value: Record[String, Any]): Self = StObject.set(x, "styleLoaderOptions", value.asInstanceOf[js.Any])
      
      inline def setStyleLoaderOptionsUndefined: Self = StObject.set(x, "styleLoaderOptions", js.undefined)
      
      inline def setWatchDependencies(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "watchDependencies", value.asInstanceOf[js.Any])
      
      inline def setWatchDependenciesUndefined: Self = StObject.set(x, "watchDependencies", js.undefined)
      
      inline def setWatchDependenciesVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "watchDependencies", js.Array(value*))
      
      inline def setWebpack(value: Configuration): Self = StObject.set(x, "webpack", value.asInstanceOf[js.Any])
      
      inline def setWebpackUndefined: Self = StObject.set(x, "webpack", js.undefined)
    }
  }
  
  @js.native
  trait Package extends StObject {
    
    /* private */ var _babelMajorVersion: Any = js.native
    
    /* private */ var _babelOptions: Any = js.native
    
    /* private */ var _emberCLIBabelExtensions: Any = js.native
    
    def _ensureBabelDetails(): Unit = js.native
    
    /* private */ var _hasBabelDetails: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _parent: Any = js.native
    
    /* private */ var aliasFor: Any = js.native
    
    def aliases: js.UndefOr[Record[String, String]] = js.native
    
    /* private */ var assertAllowedDependency: Any = js.native
    
    /* private */ var autoImportOptions: Any = js.native
    
    def babelMajorVersion: js.UndefOr[Double] = js.native
    
    def babelOptions: TransformOptions = js.native
    
    def browserslist(): String = js.native
    
    /* private */ var buildBabelOptions: Any = js.native
    
    def cleanBabelConfig(): TransformOptions = js.native
    
    def cssLoaderOptions: js.UndefOr[Record[String, Any]] = js.native
    
    /* private */ var excludesDependency: Any = js.native
    
    def fileExtensions: js.Array[String] = js.native
    
    def forbidsEval: Boolean = js.native
    
    def hasDependency(name: String): Boolean = js.native
    
    /* private */ var hasNonDevDependency: Any = js.native
    
    def insertScriptsAt: js.UndefOr[String] = js.native
    
    def insertStylesAt: js.UndefOr[String] = js.native
    
    var isAddon: Boolean = js.native
    
    /* private */ var isDeveloping: Any = js.native
    
    def isFastBootEnabled: Boolean = js.native
    
    /* private */ var macrosConfig: Any = js.native
    
    var magicDeps: js.UndefOr[Map[String, String]] = js.native
    
    def miniCssExtractPluginOptions: js.UndefOr[Record[String, Any]] = js.native
    
    var name: String = js.native
    
    def namespace: String = js.native
    
    /* private */ def pkg: Any = js.native
    
    /* private */ var pkgCache: Any = js.native
    
    /* private */ var pkgGeneration: Any = js.native
    
    /* private */ var pkgRoot: Any = js.native
    
    def publicAssetURL(): String = js.native
    
    def requestedRange(packageName: String): js.UndefOr[String] = js.native
    
    def resolve(importedPath: String, fromPath: String): js.UndefOr[DepResolution | LocalResolution | URLResolution] = js.native
    @JSName("resolve")
    def resolve_true(importedPath: String, fromPath: String, partial: `true`): js.UndefOr[DepResolution | LocalResolution | URLResolution | ImpreciseResolution] = js.native
    
    var root: String = js.native
    
    def skipBabel: js.UndefOr[js.Array[typings.emberAutoImport.anon.Package]] = js.native
    
    def styleLoaderOptions: js.UndefOr[Record[String, Any]] = js.native
    
    def watchedDirectories: js.UndefOr[js.Array[String]] = js.native
    
    def webpackConfig: Any = js.native
  }
  
  trait URLResolution extends StObject {
    
    var `type`: url
    
    var url: String
  }
  object URLResolution {
    
    inline def apply(url: String): URLResolution = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("url")
      __obj.asInstanceOf[URLResolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: URLResolution] (val x: Self) extends AnyVal {
      
      inline def setType(value: url): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
