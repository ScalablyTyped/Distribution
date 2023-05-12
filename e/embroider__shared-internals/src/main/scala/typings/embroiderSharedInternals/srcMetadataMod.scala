package typings.embroiderSharedInternals

import org.scalablytyped.runtime.StringDictionary
import typings.embroiderSharedInternals.anon.After
import typings.embroiderSharedInternals.anon.FileFilter
import typings.embroiderSharedInternals.embroiderSharedInternalsBooleans.`true`
import typings.embroiderSharedInternals.embroiderSharedInternalsInts.`2`
import typings.embroiderSharedInternals.embroiderSharedInternalsStrings.addon
import typings.embroiderSharedInternals.embroiderSharedInternalsStrings.app
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMetadataMod {
  
  trait AddonMeta extends StObject {
    
    var `app-js`: js.UndefOr[StringDictionary[Filename]] = js.undefined
    
    var `auto-upgraded`: js.UndefOr[`true`] = js.undefined
    
    var externals: js.UndefOr[js.Array[String]] = js.undefined
    
    var `fastboot-js`: js.UndefOr[StringDictionary[Filename]] = js.undefined
    
    var `implicit-modules`: js.UndefOr[js.Array[String]] = js.undefined
    
    var `implicit-scripts`: js.UndefOr[js.Array[Filename]] = js.undefined
    
    var `implicit-styles`: js.UndefOr[js.Array[Filename]] = js.undefined
    
    var `implicit-test-modules`: js.UndefOr[js.Array[String]] = js.undefined
    
    var `implicit-test-scripts`: js.UndefOr[js.Array[Filename]] = js.undefined
    
    var `implicit-test-styles`: js.UndefOr[js.Array[Filename]] = js.undefined
    
    var `lazy-engine`: js.UndefOr[Boolean] = js.undefined
    
    var main: js.UndefOr[String] = js.undefined
    
    var `order-index`: js.UndefOr[Double] = js.undefined
    
    var `public-assets`: js.UndefOr[StringDictionary[AppRelativeURL]] = js.undefined
    
    var `renamed-modules`: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var `renamed-packages`: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var `type`: addon
    
    var version: `2`
  }
  object AddonMeta {
    
    inline def apply(): AddonMeta = {
      val __obj = js.Dynamic.literal(version = 2)
      __obj.updateDynamic("type")("addon")
      __obj.asInstanceOf[AddonMeta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddonMeta] (val x: Self) extends AnyVal {
      
      inline def `setApp-js`(value: StringDictionary[Filename]): Self = StObject.set(x, "app-js", value.asInstanceOf[js.Any])
      
      inline def `setApp-jsUndefined`: Self = StObject.set(x, "app-js", js.undefined)
      
      inline def `setAuto-upgraded`(value: `true`): Self = StObject.set(x, "auto-upgraded", value.asInstanceOf[js.Any])
      
      inline def `setAuto-upgradedUndefined`: Self = StObject.set(x, "auto-upgraded", js.undefined)
      
      inline def setExternals(value: js.Array[String]): Self = StObject.set(x, "externals", value.asInstanceOf[js.Any])
      
      inline def setExternalsUndefined: Self = StObject.set(x, "externals", js.undefined)
      
      inline def setExternalsVarargs(value: String*): Self = StObject.set(x, "externals", js.Array(value*))
      
      inline def `setFastboot-js`(value: StringDictionary[Filename]): Self = StObject.set(x, "fastboot-js", value.asInstanceOf[js.Any])
      
      inline def `setFastboot-jsUndefined`: Self = StObject.set(x, "fastboot-js", js.undefined)
      
      inline def `setImplicit-modules`(value: js.Array[String]): Self = StObject.set(x, "implicit-modules", value.asInstanceOf[js.Any])
      
      inline def `setImplicit-modulesUndefined`: Self = StObject.set(x, "implicit-modules", js.undefined)
      
      inline def `setImplicit-modulesVarargs`(value: String*): Self = StObject.set(x, "implicit-modules", js.Array(value*))
      
      inline def `setImplicit-scripts`(value: js.Array[Filename]): Self = StObject.set(x, "implicit-scripts", value.asInstanceOf[js.Any])
      
      inline def `setImplicit-scriptsUndefined`: Self = StObject.set(x, "implicit-scripts", js.undefined)
      
      inline def `setImplicit-scriptsVarargs`(value: Filename*): Self = StObject.set(x, "implicit-scripts", js.Array(value*))
      
      inline def `setImplicit-styles`(value: js.Array[Filename]): Self = StObject.set(x, "implicit-styles", value.asInstanceOf[js.Any])
      
      inline def `setImplicit-stylesUndefined`: Self = StObject.set(x, "implicit-styles", js.undefined)
      
      inline def `setImplicit-stylesVarargs`(value: Filename*): Self = StObject.set(x, "implicit-styles", js.Array(value*))
      
      inline def `setImplicit-test-modules`(value: js.Array[String]): Self = StObject.set(x, "implicit-test-modules", value.asInstanceOf[js.Any])
      
      inline def `setImplicit-test-modulesUndefined`: Self = StObject.set(x, "implicit-test-modules", js.undefined)
      
      inline def `setImplicit-test-modulesVarargs`(value: String*): Self = StObject.set(x, "implicit-test-modules", js.Array(value*))
      
      inline def `setImplicit-test-scripts`(value: js.Array[Filename]): Self = StObject.set(x, "implicit-test-scripts", value.asInstanceOf[js.Any])
      
      inline def `setImplicit-test-scriptsUndefined`: Self = StObject.set(x, "implicit-test-scripts", js.undefined)
      
      inline def `setImplicit-test-scriptsVarargs`(value: Filename*): Self = StObject.set(x, "implicit-test-scripts", js.Array(value*))
      
      inline def `setImplicit-test-styles`(value: js.Array[Filename]): Self = StObject.set(x, "implicit-test-styles", value.asInstanceOf[js.Any])
      
      inline def `setImplicit-test-stylesUndefined`: Self = StObject.set(x, "implicit-test-styles", js.undefined)
      
      inline def `setImplicit-test-stylesVarargs`(value: Filename*): Self = StObject.set(x, "implicit-test-styles", js.Array(value*))
      
      inline def `setLazy-engine`(value: Boolean): Self = StObject.set(x, "lazy-engine", value.asInstanceOf[js.Any])
      
      inline def `setLazy-engineUndefined`: Self = StObject.set(x, "lazy-engine", js.undefined)
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def `setOrder-index`(value: Double): Self = StObject.set(x, "order-index", value.asInstanceOf[js.Any])
      
      inline def `setOrder-indexUndefined`: Self = StObject.set(x, "order-index", js.undefined)
      
      inline def `setPublic-assets`(value: StringDictionary[AppRelativeURL]): Self = StObject.set(x, "public-assets", value.asInstanceOf[js.Any])
      
      inline def `setPublic-assetsUndefined`: Self = StObject.set(x, "public-assets", js.undefined)
      
      inline def `setRenamed-modules`(value: StringDictionary[String]): Self = StObject.set(x, "renamed-modules", value.asInstanceOf[js.Any])
      
      inline def `setRenamed-modulesUndefined`: Self = StObject.set(x, "renamed-modules", js.undefined)
      
      inline def `setRenamed-packages`(value: StringDictionary[String]): Self = StObject.set(x, "renamed-packages", value.asInstanceOf[js.Any])
      
      inline def `setRenamed-packagesUndefined`: Self = StObject.set(x, "renamed-packages", js.undefined)
      
      inline def setType(value: addon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: `2`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppMeta extends StObject {
    
    var assets: js.Array[Filename]
    
    var `auto-upgraded`: js.UndefOr[`true`] = js.undefined
    
    var babel: FileFilter
    
    var main: js.UndefOr[String] = js.undefined
    
    var `resolvable-extensions`: js.Array[String]
    
    var `root-url`: String
    
    var `type`: app
    
    var version: `2`
  }
  object AppMeta {
    
    inline def apply(
      assets: js.Array[Filename],
      babel: FileFilter,
      `resolvable-extensions`: js.Array[String],
      `root-url`: String
    ): AppMeta = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], babel = babel.asInstanceOf[js.Any], version = 2)
      __obj.updateDynamic("resolvable-extensions")(`resolvable-extensions`.asInstanceOf[js.Any])
      __obj.updateDynamic("root-url")(`root-url`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("app")
      __obj.asInstanceOf[AppMeta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppMeta] (val x: Self) extends AnyVal {
      
      inline def setAssets(value: js.Array[Filename]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setAssetsVarargs(value: Filename*): Self = StObject.set(x, "assets", js.Array(value*))
      
      inline def `setAuto-upgraded`(value: `true`): Self = StObject.set(x, "auto-upgraded", value.asInstanceOf[js.Any])
      
      inline def `setAuto-upgradedUndefined`: Self = StObject.set(x, "auto-upgraded", js.undefined)
      
      inline def setBabel(value: FileFilter): Self = StObject.set(x, "babel", value.asInstanceOf[js.Any])
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def `setResolvable-extensions`(value: js.Array[String]): Self = StObject.set(x, "resolvable-extensions", value.asInstanceOf[js.Any])
      
      inline def `setResolvable-extensionsVarargs`(value: String*): Self = StObject.set(x, "resolvable-extensions", js.Array(value*))
      
      inline def `setRoot-url`(value: String): Self = StObject.set(x, "root-url", value.asInstanceOf[js.Any])
      
      inline def setType(value: app): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: `2`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type AppRelativeURL = String
  
  type Filename = String
  
  trait PackageInfo extends StObject {
    
    var dependencies: js.UndefOr[Record[String, String]] = js.undefined
    
    var devDependencies: js.UndefOr[Record[String, String]] = js.undefined
    
    var `ember-addon`: AddonMeta | AppMeta | After
    
    var exports: js.UndefOr[Record[String, String]] = js.undefined
    
    var keywords: js.UndefOr[js.Array[String]] = js.undefined
    
    var main: js.UndefOr[String] = js.undefined
    
    var module: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var peerDependencies: js.UndefOr[Record[String, String]] = js.undefined
    
    var version: String
  }
  object PackageInfo {
    
    inline def apply(`ember-addon`: AddonMeta | AppMeta | After, name: String, version: String): PackageInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("ember-addon")(`ember-addon`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PackageInfo] (val x: Self) extends AnyVal {
      
      inline def setDependencies(value: Record[String, String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDevDependencies(value: Record[String, String]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      inline def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      inline def `setEmber-addon`(value: AddonMeta | AppMeta | After): Self = StObject.set(x, "ember-addon", value.asInstanceOf[js.Any])
      
      inline def setExports(value: Record[String, String]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
      
      inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPeerDependencies(value: Record[String, String]): Self = StObject.set(x, "peerDependencies", value.asInstanceOf[js.Any])
      
      inline def setPeerDependenciesUndefined: Self = StObject.set(x, "peerDependencies", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
