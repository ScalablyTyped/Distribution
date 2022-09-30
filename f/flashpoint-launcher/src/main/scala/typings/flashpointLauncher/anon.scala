package typings.flashpointLauncher

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.flashpointLauncher.flashpointLauncherInts.`1`
import typings.flashpointLauncher.mod.AppPathOverride
import typings.flashpointLauncher.mod.AppPreferencesDataMainWindow
import typings.flashpointLauncher.mod.BrowsePageLayout
import typings.flashpointLauncher.mod.DeepPartial
import typings.flashpointLauncher.mod.Game
import typings.flashpointLauncher.mod.GameOrderBy
import typings.flashpointLauncher.mod.GameOrderDirection
import typings.flashpointLauncher.mod.Playlist
import typings.flashpointLauncher.mod.PlaylistGame
import typings.flashpointLauncher.mod.TagFilterGroup
import typings.std.FlatArray
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined flashpoint-launcher.flashpoint-launcher.DeepPartial<flashpoint-launcher.flashpoint-launcher.AppPreferencesDataMainWindow> */
  trait DeepPartialAppPreferences extends StObject {
    
    var height: js.UndefOr[Double | DeepPartial[js.UndefOr[Double]]] = js.undefined
    
    var maximized: js.UndefOr[Boolean | DeepPartial[Boolean]] = js.undefined
    
    var width: js.UndefOr[Double | DeepPartial[js.UndefOr[Double]]] = js.undefined
    
    var x: js.UndefOr[Double | DeepPartial[js.UndefOr[Double]]] = js.undefined
    
    var y: js.UndefOr[Double | DeepPartial[js.UndefOr[Double]]] = js.undefined
  }
  object DeepPartialAppPreferences {
    
    inline def apply(): DeepPartialAppPreferences = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeepPartialAppPreferences]
    }
    
    extension [Self <: DeepPartialAppPreferences](x: Self) {
      
      inline def setHeight(value: Double | DeepPartial[js.UndefOr[Double]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMaximized(value: Boolean | DeepPartial[Boolean]): Self = StObject.set(x, "maximized", value.asInstanceOf[js.Any])
      
      inline def setMaximizedUndefined: Self = StObject.set(x, "maximized", js.undefined)
      
      inline def setWidth(value: Double | DeepPartial[js.UndefOr[Double]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double | DeepPartial[js.UndefOr[Double]]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double | DeepPartial[js.UndefOr[Double]]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Inlined flashpoint-launcher.flashpoint-launcher.DeepPartial<flashpoint-launcher.flashpoint-launcher.AppPreferencesData> */
  trait DeepPartialAppPreferencesAppPathOverrides extends StObject {
    
    var appPathOverrides: js.UndefOr[js.Array[AppPathOverride] | DeepPartialArrayAppPathOv] = js.undefined
    
    var browsePageGameScale: js.UndefOr[Double | DeepPartial[Double]] = js.undefined
    
    var browsePageLayout: js.UndefOr[BrowsePageLayout | DeepPartial[BrowsePageLayout]] = js.undefined
    
    var browsePageLeftSidebarWidth: js.UndefOr[Double | DeepPartial[Double]] = js.undefined
    
    var browsePageRightSidebarWidth: js.UndefOr[Double | DeepPartial[Double]] = js.undefined
    
    var browsePageShowExtreme: js.UndefOr[Boolean | DeepPartial[Boolean]] = js.undefined
    
    var browsePageShowLeftSidebar: js.UndefOr[Boolean | DeepPartial[Boolean]] = js.undefined
    
    var browsePageShowRightSidebar: js.UndefOr[Boolean | DeepPartial[Boolean]] = js.undefined
    
    var browserModeProxy: js.UndefOr[String | DeepPartial[String]] = js.undefined
    
    var curatePageLeftSidebarWidth: js.UndefOr[Double | DeepPartial[Double]] = js.undefined
    
    var currentLanguage: js.UndefOr[String | DeepPartial[String]] = js.undefined
    
    var currentLogoSet: js.UndefOr[String | DeepPartial[js.UndefOr[String]]] = js.undefined
    
    var currentTheme: js.UndefOr[String | DeepPartial[js.UndefOr[String]]] = js.undefined
    
    var dataPacksFolderPath: js.UndefOr[String | DeepPartial[String]] = js.undefined
    
    var defaultLibrary: js.UndefOr[String | DeepPartial[String]] = js.undefined
    
    var disableExtremeGames: js.UndefOr[Boolean | DeepPartial[Boolean]] = js.undefined
    
    var enableEditing: js.UndefOr[Boolean | DeepPartial[Boolean]] = js.undefined
    
    var excludedRandomLibraries: js.UndefOr[js.Array[String] | DeepPartialArraystring] = js.undefined
    
    var extensionsPath: js.UndefOr[String | DeepPartial[String]] = js.undefined
    
    var fallbackLanguage: js.UndefOr[String | DeepPartial[String]] = js.undefined
    
    var gamesOrder: js.UndefOr[GameOrderDirection | DeepPartial[GameOrderDirection]] = js.undefined
    
    var gamesOrderBy: js.UndefOr[GameOrderBy | DeepPartial[GameOrderBy]] = js.undefined
    
    var htdocsFolderPath: js.UndefOr[String | DeepPartial[String]] = js.undefined
    
    var imageFolderPath: js.UndefOr[String | DeepPartial[String]] = js.undefined
    
    var jsonFolderPath: js.UndefOr[String | DeepPartial[String]] = js.undefined
    
    var keepArchiveKey: js.UndefOr[Boolean | DeepPartial[Boolean]] = js.undefined
    
    var lastSelectedLibrary: js.UndefOr[String | DeepPartial[String]] = js.undefined
    
    var logoFolderPath: js.UndefOr[String | DeepPartial[String]] = js.undefined
    
    var logoSetsFolderPath: js.UndefOr[String | DeepPartial[String]] = js.undefined
    
    var mainWindow: js.UndefOr[AppPreferencesDataMainWindow | DeepPartialAppPreferences] = js.undefined
    
    var metaEditsFolderPath: js.UndefOr[String | DeepPartial[String]] = js.undefined
    
    var nativePlatforms: js.UndefOr[js.Array[String] | DeepPartialArraystring] = js.undefined
    
    var onDemandBaseUrl: js.UndefOr[String | DeepPartial[String]] = js.undefined
    
    var onDemandImages: js.UndefOr[Boolean | DeepPartial[Boolean]] = js.undefined
    
    var platformFolderPath: js.UndefOr[String | DeepPartial[String]] = js.undefined
    
    var playlistFolderPath: js.UndefOr[String | DeepPartial[String]] = js.undefined
    
    var saveImportedCurations: js.UndefOr[Boolean | DeepPartial[Boolean]] = js.undefined
    
    var showBrokenGames: js.UndefOr[Boolean | DeepPartial[Boolean]] = js.undefined
    
    var showDeveloperTab: js.UndefOr[Boolean | DeepPartial[Boolean]] = js.undefined
    
    var showLogLevel: js.UndefOr[
        (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in flashpoint-launcher.flashpoint-launcher.LogLevel ]: boolean}
      */ typings.flashpointLauncher.flashpointLauncherStrings.DeepPartialAppPreferencesAppPathOverrides & TopLevel[Any]) | (DeepPartial[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in flashpoint-launcher.flashpoint-launcher.LogLevel ]: boolean}
      */ typings.flashpointLauncher.flashpointLauncherStrings.DeepPartialAppPreferencesAppPathOverrides & TopLevel[Any]
        ])
      ] = js.undefined
    
    var showLogSource: js.UndefOr[StringDictionary[Boolean] | js.Object] = js.undefined
    
    var symlinkCurationContent: js.UndefOr[Boolean | DeepPartial[Boolean]] = js.undefined
    
    var tagFilters: js.UndefOr[js.Array[TagFilterGroup] | DeepPartialArrayTagFilter] = js.undefined
    
    var tagFiltersInCurate: js.UndefOr[Boolean | DeepPartial[Boolean]] = js.undefined
    
    var themeFolderPath: js.UndefOr[String | DeepPartial[String]] = js.undefined
  }
  object DeepPartialAppPreferencesAppPathOverrides {
    
    inline def apply(): DeepPartialAppPreferencesAppPathOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeepPartialAppPreferencesAppPathOverrides]
    }
    
    extension [Self <: DeepPartialAppPreferencesAppPathOverrides](x: Self) {
      
      inline def setAppPathOverrides(value: js.Array[AppPathOverride] | DeepPartialArrayAppPathOv): Self = StObject.set(x, "appPathOverrides", value.asInstanceOf[js.Any])
      
      inline def setAppPathOverridesUndefined: Self = StObject.set(x, "appPathOverrides", js.undefined)
      
      inline def setAppPathOverridesVarargs(value: AppPathOverride*): Self = StObject.set(x, "appPathOverrides", js.Array(value*))
      
      inline def setBrowsePageGameScale(value: Double | DeepPartial[Double]): Self = StObject.set(x, "browsePageGameScale", value.asInstanceOf[js.Any])
      
      inline def setBrowsePageGameScaleUndefined: Self = StObject.set(x, "browsePageGameScale", js.undefined)
      
      inline def setBrowsePageLayout(value: BrowsePageLayout | DeepPartial[BrowsePageLayout]): Self = StObject.set(x, "browsePageLayout", value.asInstanceOf[js.Any])
      
      inline def setBrowsePageLayoutUndefined: Self = StObject.set(x, "browsePageLayout", js.undefined)
      
      inline def setBrowsePageLeftSidebarWidth(value: Double | DeepPartial[Double]): Self = StObject.set(x, "browsePageLeftSidebarWidth", value.asInstanceOf[js.Any])
      
      inline def setBrowsePageLeftSidebarWidthUndefined: Self = StObject.set(x, "browsePageLeftSidebarWidth", js.undefined)
      
      inline def setBrowsePageRightSidebarWidth(value: Double | DeepPartial[Double]): Self = StObject.set(x, "browsePageRightSidebarWidth", value.asInstanceOf[js.Any])
      
      inline def setBrowsePageRightSidebarWidthUndefined: Self = StObject.set(x, "browsePageRightSidebarWidth", js.undefined)
      
      inline def setBrowsePageShowExtreme(value: Boolean | DeepPartial[Boolean]): Self = StObject.set(x, "browsePageShowExtreme", value.asInstanceOf[js.Any])
      
      inline def setBrowsePageShowExtremeUndefined: Self = StObject.set(x, "browsePageShowExtreme", js.undefined)
      
      inline def setBrowsePageShowLeftSidebar(value: Boolean | DeepPartial[Boolean]): Self = StObject.set(x, "browsePageShowLeftSidebar", value.asInstanceOf[js.Any])
      
      inline def setBrowsePageShowLeftSidebarUndefined: Self = StObject.set(x, "browsePageShowLeftSidebar", js.undefined)
      
      inline def setBrowsePageShowRightSidebar(value: Boolean | DeepPartial[Boolean]): Self = StObject.set(x, "browsePageShowRightSidebar", value.asInstanceOf[js.Any])
      
      inline def setBrowsePageShowRightSidebarUndefined: Self = StObject.set(x, "browsePageShowRightSidebar", js.undefined)
      
      inline def setBrowserModeProxy(value: String | DeepPartial[String]): Self = StObject.set(x, "browserModeProxy", value.asInstanceOf[js.Any])
      
      inline def setBrowserModeProxyUndefined: Self = StObject.set(x, "browserModeProxy", js.undefined)
      
      inline def setCuratePageLeftSidebarWidth(value: Double | DeepPartial[Double]): Self = StObject.set(x, "curatePageLeftSidebarWidth", value.asInstanceOf[js.Any])
      
      inline def setCuratePageLeftSidebarWidthUndefined: Self = StObject.set(x, "curatePageLeftSidebarWidth", js.undefined)
      
      inline def setCurrentLanguage(value: String | DeepPartial[String]): Self = StObject.set(x, "currentLanguage", value.asInstanceOf[js.Any])
      
      inline def setCurrentLanguageUndefined: Self = StObject.set(x, "currentLanguage", js.undefined)
      
      inline def setCurrentLogoSet(value: String | DeepPartial[js.UndefOr[String]]): Self = StObject.set(x, "currentLogoSet", value.asInstanceOf[js.Any])
      
      inline def setCurrentLogoSetUndefined: Self = StObject.set(x, "currentLogoSet", js.undefined)
      
      inline def setCurrentTheme(value: String | DeepPartial[js.UndefOr[String]]): Self = StObject.set(x, "currentTheme", value.asInstanceOf[js.Any])
      
      inline def setCurrentThemeUndefined: Self = StObject.set(x, "currentTheme", js.undefined)
      
      inline def setDataPacksFolderPath(value: String | DeepPartial[String]): Self = StObject.set(x, "dataPacksFolderPath", value.asInstanceOf[js.Any])
      
      inline def setDataPacksFolderPathUndefined: Self = StObject.set(x, "dataPacksFolderPath", js.undefined)
      
      inline def setDefaultLibrary(value: String | DeepPartial[String]): Self = StObject.set(x, "defaultLibrary", value.asInstanceOf[js.Any])
      
      inline def setDefaultLibraryUndefined: Self = StObject.set(x, "defaultLibrary", js.undefined)
      
      inline def setDisableExtremeGames(value: Boolean | DeepPartial[Boolean]): Self = StObject.set(x, "disableExtremeGames", value.asInstanceOf[js.Any])
      
      inline def setDisableExtremeGamesUndefined: Self = StObject.set(x, "disableExtremeGames", js.undefined)
      
      inline def setEnableEditing(value: Boolean | DeepPartial[Boolean]): Self = StObject.set(x, "enableEditing", value.asInstanceOf[js.Any])
      
      inline def setEnableEditingUndefined: Self = StObject.set(x, "enableEditing", js.undefined)
      
      inline def setExcludedRandomLibraries(value: js.Array[String] | DeepPartialArraystring): Self = StObject.set(x, "excludedRandomLibraries", value.asInstanceOf[js.Any])
      
      inline def setExcludedRandomLibrariesUndefined: Self = StObject.set(x, "excludedRandomLibraries", js.undefined)
      
      inline def setExcludedRandomLibrariesVarargs(value: String*): Self = StObject.set(x, "excludedRandomLibraries", js.Array(value*))
      
      inline def setExtensionsPath(value: String | DeepPartial[String]): Self = StObject.set(x, "extensionsPath", value.asInstanceOf[js.Any])
      
      inline def setExtensionsPathUndefined: Self = StObject.set(x, "extensionsPath", js.undefined)
      
      inline def setFallbackLanguage(value: String | DeepPartial[String]): Self = StObject.set(x, "fallbackLanguage", value.asInstanceOf[js.Any])
      
      inline def setFallbackLanguageUndefined: Self = StObject.set(x, "fallbackLanguage", js.undefined)
      
      inline def setGamesOrder(value: GameOrderDirection | DeepPartial[GameOrderDirection]): Self = StObject.set(x, "gamesOrder", value.asInstanceOf[js.Any])
      
      inline def setGamesOrderBy(value: GameOrderBy | DeepPartial[GameOrderBy]): Self = StObject.set(x, "gamesOrderBy", value.asInstanceOf[js.Any])
      
      inline def setGamesOrderByUndefined: Self = StObject.set(x, "gamesOrderBy", js.undefined)
      
      inline def setGamesOrderUndefined: Self = StObject.set(x, "gamesOrder", js.undefined)
      
      inline def setHtdocsFolderPath(value: String | DeepPartial[String]): Self = StObject.set(x, "htdocsFolderPath", value.asInstanceOf[js.Any])
      
      inline def setHtdocsFolderPathUndefined: Self = StObject.set(x, "htdocsFolderPath", js.undefined)
      
      inline def setImageFolderPath(value: String | DeepPartial[String]): Self = StObject.set(x, "imageFolderPath", value.asInstanceOf[js.Any])
      
      inline def setImageFolderPathUndefined: Self = StObject.set(x, "imageFolderPath", js.undefined)
      
      inline def setJsonFolderPath(value: String | DeepPartial[String]): Self = StObject.set(x, "jsonFolderPath", value.asInstanceOf[js.Any])
      
      inline def setJsonFolderPathUndefined: Self = StObject.set(x, "jsonFolderPath", js.undefined)
      
      inline def setKeepArchiveKey(value: Boolean | DeepPartial[Boolean]): Self = StObject.set(x, "keepArchiveKey", value.asInstanceOf[js.Any])
      
      inline def setKeepArchiveKeyUndefined: Self = StObject.set(x, "keepArchiveKey", js.undefined)
      
      inline def setLastSelectedLibrary(value: String | DeepPartial[String]): Self = StObject.set(x, "lastSelectedLibrary", value.asInstanceOf[js.Any])
      
      inline def setLastSelectedLibraryUndefined: Self = StObject.set(x, "lastSelectedLibrary", js.undefined)
      
      inline def setLogoFolderPath(value: String | DeepPartial[String]): Self = StObject.set(x, "logoFolderPath", value.asInstanceOf[js.Any])
      
      inline def setLogoFolderPathUndefined: Self = StObject.set(x, "logoFolderPath", js.undefined)
      
      inline def setLogoSetsFolderPath(value: String | DeepPartial[String]): Self = StObject.set(x, "logoSetsFolderPath", value.asInstanceOf[js.Any])
      
      inline def setLogoSetsFolderPathUndefined: Self = StObject.set(x, "logoSetsFolderPath", js.undefined)
      
      inline def setMainWindow(value: AppPreferencesDataMainWindow | DeepPartialAppPreferences): Self = StObject.set(x, "mainWindow", value.asInstanceOf[js.Any])
      
      inline def setMainWindowUndefined: Self = StObject.set(x, "mainWindow", js.undefined)
      
      inline def setMetaEditsFolderPath(value: String | DeepPartial[String]): Self = StObject.set(x, "metaEditsFolderPath", value.asInstanceOf[js.Any])
      
      inline def setMetaEditsFolderPathUndefined: Self = StObject.set(x, "metaEditsFolderPath", js.undefined)
      
      inline def setNativePlatforms(value: js.Array[String] | DeepPartialArraystring): Self = StObject.set(x, "nativePlatforms", value.asInstanceOf[js.Any])
      
      inline def setNativePlatformsUndefined: Self = StObject.set(x, "nativePlatforms", js.undefined)
      
      inline def setNativePlatformsVarargs(value: String*): Self = StObject.set(x, "nativePlatforms", js.Array(value*))
      
      inline def setOnDemandBaseUrl(value: String | DeepPartial[String]): Self = StObject.set(x, "onDemandBaseUrl", value.asInstanceOf[js.Any])
      
      inline def setOnDemandBaseUrlUndefined: Self = StObject.set(x, "onDemandBaseUrl", js.undefined)
      
      inline def setOnDemandImages(value: Boolean | DeepPartial[Boolean]): Self = StObject.set(x, "onDemandImages", value.asInstanceOf[js.Any])
      
      inline def setOnDemandImagesUndefined: Self = StObject.set(x, "onDemandImages", js.undefined)
      
      inline def setPlatformFolderPath(value: String | DeepPartial[String]): Self = StObject.set(x, "platformFolderPath", value.asInstanceOf[js.Any])
      
      inline def setPlatformFolderPathUndefined: Self = StObject.set(x, "platformFolderPath", js.undefined)
      
      inline def setPlaylistFolderPath(value: String | DeepPartial[String]): Self = StObject.set(x, "playlistFolderPath", value.asInstanceOf[js.Any])
      
      inline def setPlaylistFolderPathUndefined: Self = StObject.set(x, "playlistFolderPath", js.undefined)
      
      inline def setSaveImportedCurations(value: Boolean | DeepPartial[Boolean]): Self = StObject.set(x, "saveImportedCurations", value.asInstanceOf[js.Any])
      
      inline def setSaveImportedCurationsUndefined: Self = StObject.set(x, "saveImportedCurations", js.undefined)
      
      inline def setShowBrokenGames(value: Boolean | DeepPartial[Boolean]): Self = StObject.set(x, "showBrokenGames", value.asInstanceOf[js.Any])
      
      inline def setShowBrokenGamesUndefined: Self = StObject.set(x, "showBrokenGames", js.undefined)
      
      inline def setShowDeveloperTab(value: Boolean | DeepPartial[Boolean]): Self = StObject.set(x, "showDeveloperTab", value.asInstanceOf[js.Any])
      
      inline def setShowDeveloperTabUndefined: Self = StObject.set(x, "showDeveloperTab", js.undefined)
      
      inline def setShowLogLevel(
        value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ key in flashpoint-launcher.flashpoint-launcher.LogLevel ]: boolean}
        */ typings.flashpointLauncher.flashpointLauncherStrings.DeepPartialAppPreferencesAppPathOverrides & TopLevel[Any]) | (DeepPartial[
              /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ key in flashpoint-launcher.flashpoint-launcher.LogLevel ]: boolean}
        */ typings.flashpointLauncher.flashpointLauncherStrings.DeepPartialAppPreferencesAppPathOverrides & TopLevel[Any]
            ])
      ): Self = StObject.set(x, "showLogLevel", value.asInstanceOf[js.Any])
      
      inline def setShowLogLevelUndefined: Self = StObject.set(x, "showLogLevel", js.undefined)
      
      inline def setShowLogSource(value: StringDictionary[Boolean] | js.Object): Self = StObject.set(x, "showLogSource", value.asInstanceOf[js.Any])
      
      inline def setShowLogSourceUndefined: Self = StObject.set(x, "showLogSource", js.undefined)
      
      inline def setSymlinkCurationContent(value: Boolean | DeepPartial[Boolean]): Self = StObject.set(x, "symlinkCurationContent", value.asInstanceOf[js.Any])
      
      inline def setSymlinkCurationContentUndefined: Self = StObject.set(x, "symlinkCurationContent", js.undefined)
      
      inline def setTagFilters(value: js.Array[TagFilterGroup] | DeepPartialArrayTagFilter): Self = StObject.set(x, "tagFilters", value.asInstanceOf[js.Any])
      
      inline def setTagFiltersInCurate(value: Boolean | DeepPartial[Boolean]): Self = StObject.set(x, "tagFiltersInCurate", value.asInstanceOf[js.Any])
      
      inline def setTagFiltersInCurateUndefined: Self = StObject.set(x, "tagFiltersInCurate", js.undefined)
      
      inline def setTagFiltersUndefined: Self = StObject.set(x, "tagFilters", js.undefined)
      
      inline def setTagFiltersVarargs(value: TagFilterGroup*): Self = StObject.set(x, "tagFilters", js.Array(value*))
      
      inline def setThemeFolderPath(value: String | DeepPartial[String]): Self = StObject.set(x, "themeFolderPath", value.asInstanceOf[js.Any])
      
      inline def setThemeFolderPathUndefined: Self = StObject.set(x, "themeFolderPath", js.undefined)
    }
  }
  
  /* Inlined flashpoint-launcher.flashpoint-launcher.DeepPartial<std.Array<flashpoint-launcher.flashpoint-launcher.AppPathOverride>> */
  trait DeepPartialArrayAppPathOv extends StObject {
    
    var at: js.UndefOr[
        (js.Function1[/* index */ Double, js.UndefOr[AppPathOverride]]) | (DeepPartial[js.Function1[/* index */ Double, js.UndefOr[AppPathOverride]]])
      ] = js.undefined
    
    var concat: js.UndefOr[
        (js.Function1[/* repeated */ js.Array[AppPathOverride], js.Array[AppPathOverride]]) | (DeepPartial[
          js.Function1[/* repeated */ js.Array[AppPathOverride], js.Array[AppPathOverride]]
        ])
      ] = js.undefined
    
    var copyWithin: js.UndefOr[
        (js.Function2[/* target */ Double, /* start */ Double, this.type]) | (DeepPartial[js.Function2[/* target */ Double, /* start */ Double, this.type]])
      ] = js.undefined
    
    var entries: js.UndefOr[
        (js.Function0[IterableIterator[js.Tuple2[Double, AppPathOverride]]]) | (DeepPartial[js.Function0[IterableIterator[js.Tuple2[Double, AppPathOverride]]]])
      ] = js.undefined
    
    var every: js.UndefOr[
        (js.Function1[
          /* predicate */ js.Function3[
            /* value */ AppPathOverride, 
            /* index */ Double, 
            /* array */ js.Array[AppPathOverride], 
            /* is flashpoint-launcher.flashpoint-launcher.AppPathOverride */ Boolean
          ], 
          /* is std.Array<flashpoint-launcher.flashpoint-launcher.AppPathOverride> */ Boolean
        ]) | (DeepPartial[
          js.Function1[
            /* predicate */ js.Function3[
              /* value */ AppPathOverride, 
              /* index */ Double, 
              /* array */ js.Array[AppPathOverride], 
              /* is flashpoint-launcher.flashpoint-launcher.AppPathOverride */ Boolean
            ], 
            /* is std.Array<flashpoint-launcher.flashpoint-launcher.AppPathOverride> */ Boolean
          ]
        ])
      ] = js.undefined
    
    var fill: js.UndefOr[
        (js.Function1[/* value */ AppPathOverride, this.type]) | (DeepPartial[js.Function1[/* value */ AppPathOverride, this.type]])
      ] = js.undefined
    
    var filter: js.UndefOr[
        (js.Function1[
          /* predicate */ js.Function3[
            /* value */ AppPathOverride, 
            /* index */ Double, 
            /* array */ js.Array[AppPathOverride], 
            /* is flashpoint-launcher.flashpoint-launcher.AppPathOverride */ Boolean
          ], 
          js.Array[AppPathOverride]
        ]) | (DeepPartial[
          js.Function1[
            /* predicate */ js.Function3[
              /* value */ AppPathOverride, 
              /* index */ Double, 
              /* array */ js.Array[AppPathOverride], 
              /* is flashpoint-launcher.flashpoint-launcher.AppPathOverride */ Boolean
            ], 
            js.Array[AppPathOverride]
          ]
        ])
      ] = js.undefined
    
    var find: js.UndefOr[
        (js.Function1[
          /* predicate */ js.ThisFunction3[
            /* this */ Unit, 
            /* value */ AppPathOverride, 
            /* index */ Double, 
            /* obj */ js.Array[AppPathOverride], 
            /* is flashpoint-launcher.flashpoint-launcher.AppPathOverride */ Boolean
          ], 
          js.UndefOr[AppPathOverride]
        ]) | (DeepPartial[
          js.Function1[
            /* predicate */ js.ThisFunction3[
              /* this */ Unit, 
              /* value */ AppPathOverride, 
              /* index */ Double, 
              /* obj */ js.Array[AppPathOverride], 
              /* is flashpoint-launcher.flashpoint-launcher.AppPathOverride */ Boolean
            ], 
            js.UndefOr[AppPathOverride]
          ]
        ])
      ] = js.undefined
    
    var findIndex: js.UndefOr[
        (js.Function1[
          /* predicate */ js.Function3[
            /* value */ AppPathOverride, 
            /* index */ Double, 
            /* obj */ js.Array[AppPathOverride], 
            Any
          ], 
          Double
        ]) | (DeepPartial[
          js.Function1[
            /* predicate */ js.Function3[
              /* value */ AppPathOverride, 
              /* index */ Double, 
              /* obj */ js.Array[AppPathOverride], 
              Any
            ], 
            Double
          ]
        ])
      ] = js.undefined
    
    var flat: js.UndefOr[
        (js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, `1`]]]) | (DeepPartial[js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, `1`]]]])
      ] = js.undefined
    
    var flatMap: js.UndefOr[
        (js.Function1[
          /* callback */ js.ThisFunction3[
            /* this */ Unit, 
            /* value */ AppPathOverride, 
            /* index */ Double, 
            /* array */ js.Array[AppPathOverride], 
            Any | js.Array[Any]
          ], 
          js.Array[Any]
        ]) | (DeepPartial[
          js.Function1[
            /* callback */ js.ThisFunction3[
              /* this */ Unit, 
              /* value */ AppPathOverride, 
              /* index */ Double, 
              /* array */ js.Array[AppPathOverride], 
              Any | js.Array[Any]
            ], 
            js.Array[Any]
          ]
        ])
      ] = js.undefined
    
    var forEach: js.UndefOr[
        (js.Function1[
          /* callbackfn */ js.Function3[
            /* value */ AppPathOverride, 
            /* index */ Double, 
            /* array */ js.Array[AppPathOverride], 
            Unit
          ], 
          Unit
        ]) | (DeepPartial[
          js.Function1[
            /* callbackfn */ js.Function3[
              /* value */ AppPathOverride, 
              /* index */ Double, 
              /* array */ js.Array[AppPathOverride], 
              Unit
            ], 
            Unit
          ]
        ])
      ] = js.undefined
    
    var includes: js.UndefOr[
        (js.Function1[/* searchElement */ AppPathOverride, Boolean]) | (DeepPartial[js.Function1[/* searchElement */ AppPathOverride, Boolean]])
      ] = js.undefined
    
    var indexOf: js.UndefOr[
        (js.Function1[/* searchElement */ AppPathOverride, Double]) | (DeepPartial[js.Function1[/* searchElement */ AppPathOverride, Double]])
      ] = js.undefined
    
    var join: js.UndefOr[js.Function0[String] | DeepPartial[js.Function0[String]]] = js.undefined
    
    var keys: js.UndefOr[
        js.Function0[IterableIterator[Double]] | DeepPartial[js.Function0[IterableIterator[Double]]]
      ] = js.undefined
    
    var lastIndexOf: js.UndefOr[
        (js.Function1[/* searchElement */ AppPathOverride, Double]) | (DeepPartial[js.Function1[/* searchElement */ AppPathOverride, Double]])
      ] = js.undefined
    
    var length: js.UndefOr[Double | DeepPartial[Double]] = js.undefined
    
    var map: js.UndefOr[
        (js.Function1[
          /* callbackfn */ js.Function3[
            /* value */ AppPathOverride, 
            /* index */ Double, 
            /* array */ js.Array[AppPathOverride], 
            Any
          ], 
          js.Array[Any]
        ]) | (DeepPartial[
          js.Function1[
            /* callbackfn */ js.Function3[
              /* value */ AppPathOverride, 
              /* index */ Double, 
              /* array */ js.Array[AppPathOverride], 
              Any
            ], 
            js.Array[Any]
          ]
        ])
      ] = js.undefined
    
    var pop: js.UndefOr[
        js.Function0[js.UndefOr[AppPathOverride]] | DeepPartial[js.Function0[js.UndefOr[AppPathOverride]]]
      ] = js.undefined
    
    var push: js.UndefOr[
        (js.Function1[/* repeated */ AppPathOverride, Double]) | (DeepPartial[js.Function1[/* repeated */ AppPathOverride, Double]])
      ] = js.undefined
    
    var reduce: js.UndefOr[
        (js.Function1[
          /* callbackfn */ js.Function4[
            /* previousValue */ AppPathOverride, 
            /* currentValue */ AppPathOverride, 
            /* currentIndex */ Double, 
            /* array */ js.Array[AppPathOverride], 
            AppPathOverride
          ], 
          AppPathOverride
        ]) | (DeepPartial[
          js.Function1[
            /* callbackfn */ js.Function4[
              /* previousValue */ AppPathOverride, 
              /* currentValue */ AppPathOverride, 
              /* currentIndex */ Double, 
              /* array */ js.Array[AppPathOverride], 
              AppPathOverride
            ], 
            AppPathOverride
          ]
        ])
      ] = js.undefined
    
    var reduceRight: js.UndefOr[
        (js.Function1[
          /* callbackfn */ js.Function4[
            /* previousValue */ AppPathOverride, 
            /* currentValue */ AppPathOverride, 
            /* currentIndex */ Double, 
            /* array */ js.Array[AppPathOverride], 
            AppPathOverride
          ], 
          AppPathOverride
        ]) | (DeepPartial[
          js.Function1[
            /* callbackfn */ js.Function4[
              /* previousValue */ AppPathOverride, 
              /* currentValue */ AppPathOverride, 
              /* currentIndex */ Double, 
              /* array */ js.Array[AppPathOverride], 
              AppPathOverride
            ], 
            AppPathOverride
          ]
        ])
      ] = js.undefined
    
    var reverse: js.UndefOr[
        js.Function0[js.Array[AppPathOverride]] | DeepPartial[js.Function0[js.Array[AppPathOverride]]]
      ] = js.undefined
    
    var shift: js.UndefOr[
        js.Function0[js.UndefOr[AppPathOverride]] | DeepPartial[js.Function0[js.UndefOr[AppPathOverride]]]
      ] = js.undefined
    
    var slice: js.UndefOr[
        js.Function0[js.Array[AppPathOverride]] | DeepPartial[js.Function0[js.Array[AppPathOverride]]]
      ] = js.undefined
    
    var some: js.UndefOr[
        (js.Function1[
          /* predicate */ js.Function3[
            /* value */ AppPathOverride, 
            /* index */ Double, 
            /* array */ js.Array[AppPathOverride], 
            Any
          ], 
          Boolean
        ]) | (DeepPartial[
          js.Function1[
            /* predicate */ js.Function3[
              /* value */ AppPathOverride, 
              /* index */ Double, 
              /* array */ js.Array[AppPathOverride], 
              Any
            ], 
            Boolean
          ]
        ])
      ] = js.undefined
    
    var sort: js.UndefOr[js.Function0[this.type] | DeepPartial[js.Function0[this.type]]] = js.undefined
    
    var splice: js.UndefOr[
        (js.Function1[/* start */ Double, js.Array[AppPathOverride]]) | (DeepPartial[js.Function1[/* start */ Double, js.Array[AppPathOverride]]])
      ] = js.undefined
    
    @JSName("toLocaleString")
    var toLocaleString_FDeepPartialArrayAppPathOv: js.UndefOr[js.Function0[String] | DeepPartial[js.Function0[String]]] = js.undefined
    
    @JSName("toString")
    var toString_FDeepPartialArrayAppPathOv: js.UndefOr[js.Function0[String] | DeepPartial[js.Function0[String]]] = js.undefined
    
    var unshift: js.UndefOr[
        (js.Function1[/* repeated */ AppPathOverride, Double]) | (DeepPartial[js.Function1[/* repeated */ AppPathOverride, Double]])
      ] = js.undefined
    
    var values: js.UndefOr[
        js.Function0[IterableIterator[AppPathOverride]] | DeepPartial[js.Function0[IterableIterator[AppPathOverride]]]
      ] = js.undefined
  }
  object DeepPartialArrayAppPathOv {
    
    inline def apply(): DeepPartialArrayAppPathOv = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeepPartialArrayAppPathOv]
    }
    
    extension [Self <: DeepPartialArrayAppPathOv](x: Self) {
      
      inline def setAt(
        value: (js.Function1[/* index */ Double, js.UndefOr[AppPathOverride]]) | (DeepPartial[js.Function1[/* index */ Double, js.UndefOr[AppPathOverride]]])
      ): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtFunction1(value: /* index */ Double => js.UndefOr[AppPathOverride]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setConcat(
        value: (js.Function1[/* repeated */ js.Array[AppPathOverride], js.Array[AppPathOverride]]) | (DeepPartial[
              js.Function1[/* repeated */ js.Array[AppPathOverride], js.Array[AppPathOverride]]
            ])
      ): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
      
      inline def setConcatFunction1(value: /* repeated */ js.Array[AppPathOverride] => js.Array[AppPathOverride]): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setConcatUndefined: Self = StObject.set(x, "concat", js.undefined)
      
      inline def setCopyWithin(
        value: (js.Function2[/* target */ Double, /* start */ Double, DeepPartialArrayAppPathOv]) | (DeepPartial[js.Function2[/* target */ Double, /* start */ Double, DeepPartialArrayAppPathOv]])
      ): Self = StObject.set(x, "copyWithin", value.asInstanceOf[js.Any])
      
      inline def setCopyWithinFunction2(value: (/* target */ Double, /* start */ Double) => DeepPartialArrayAppPathOv): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
      
      inline def setCopyWithinUndefined: Self = StObject.set(x, "copyWithin", js.undefined)
      
      inline def setEntries(
        value: (js.Function0[IterableIterator[js.Tuple2[Double, AppPathOverride]]]) | (DeepPartial[js.Function0[IterableIterator[js.Tuple2[Double, AppPathOverride]]]])
      ): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesFunction0(value: () => IterableIterator[js.Tuple2[Double, AppPathOverride]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      inline def setEvery(
        value: (js.Function1[
              /* predicate */ js.Function3[
                /* value */ AppPathOverride, 
                /* index */ Double, 
                /* array */ js.Array[AppPathOverride], 
                /* is flashpoint-launcher.flashpoint-launcher.AppPathOverride */ Boolean
              ], 
              /* is std.Array<flashpoint-launcher.flashpoint-launcher.AppPathOverride> */ Boolean
            ]) | (DeepPartial[
              js.Function1[
                /* predicate */ js.Function3[
                  /* value */ AppPathOverride, 
                  /* index */ Double, 
                  /* array */ js.Array[AppPathOverride], 
                  /* is flashpoint-launcher.flashpoint-launcher.AppPathOverride */ Boolean
                ], 
                /* is std.Array<flashpoint-launcher.flashpoint-launcher.AppPathOverride> */ Boolean
              ]
            ])
      ): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
      
      inline def setEveryFunction1(
        value: /* predicate */ js.Function3[
              /* value */ AppPathOverride, 
              /* index */ Double, 
              /* array */ js.Array[AppPathOverride], 
              /* is flashpoint-launcher.flashpoint-launcher.AppPathOverride */ Boolean
            ] => /* is std.Array<flashpoint-launcher.flashpoint-launcher.AppPathOverride> */ Boolean
      ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
      
      inline def setEveryUndefined: Self = StObject.set(x, "every", js.undefined)
      
      inline def setFill(
        value: (js.Function1[/* value */ AppPathOverride, DeepPartialArrayAppPathOv]) | (DeepPartial[js.Function1[/* value */ AppPathOverride, DeepPartialArrayAppPathOv]])
      ): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillFunction1(value: /* value */ AppPathOverride => DeepPartialArrayAppPathOv): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFilter(
        value: (js.Function1[
              /* predicate */ js.Function3[
                /* value */ AppPathOverride, 
                /* index */ Double, 
                /* array */ js.Array[AppPathOverride], 
                /* is flashpoint-launcher.flashpoint-launcher.AppPathOverride */ Boolean
              ], 
              js.Array[AppPathOverride]
            ]) | (DeepPartial[
              js.Function1[
                /* predicate */ js.Function3[
                  /* value */ AppPathOverride, 
                  /* index */ Double, 
                  /* array */ js.Array[AppPathOverride], 
                  /* is flashpoint-launcher.flashpoint-launcher.AppPathOverride */ Boolean
                ], 
                js.Array[AppPathOverride]
              ]
            ])
      ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction1(
        value: /* predicate */ js.Function3[
              /* value */ AppPathOverride, 
              /* index */ Double, 
              /* array */ js.Array[AppPathOverride], 
              /* is flashpoint-launcher.flashpoint-launcher.AppPathOverride */ Boolean
            ] => js.Array[AppPathOverride]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFind(
        value: (js.Function1[
              /* predicate */ js.ThisFunction3[
                /* this */ Unit, 
                /* value */ AppPathOverride, 
                /* index */ Double, 
                /* obj */ js.Array[AppPathOverride], 
                /* is flashpoint-launcher.flashpoint-launcher.AppPathOverride */ Boolean
              ], 
              js.UndefOr[AppPathOverride]
            ]) | (DeepPartial[
              js.Function1[
                /* predicate */ js.ThisFunction3[
                  /* this */ Unit, 
                  /* value */ AppPathOverride, 
                  /* index */ Double, 
                  /* obj */ js.Array[AppPathOverride], 
                  /* is flashpoint-launcher.flashpoint-launcher.AppPathOverride */ Boolean
                ], 
                js.UndefOr[AppPathOverride]
              ]
            ])
      ): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      inline def setFindFunction1(
        value: /* predicate */ js.ThisFunction3[
              /* this */ Unit, 
              /* value */ AppPathOverride, 
              /* index */ Double, 
              /* obj */ js.Array[AppPathOverride], 
              /* is flashpoint-launcher.flashpoint-launcher.AppPathOverride */ Boolean
            ] => js.UndefOr[AppPathOverride]
      ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindIndex(
        value: (js.Function1[
              /* predicate */ js.Function3[
                /* value */ AppPathOverride, 
                /* index */ Double, 
                /* obj */ js.Array[AppPathOverride], 
                Any
              ], 
              Double
            ]) | (DeepPartial[
              js.Function1[
                /* predicate */ js.Function3[
                  /* value */ AppPathOverride, 
                  /* index */ Double, 
                  /* obj */ js.Array[AppPathOverride], 
                  Any
                ], 
                Double
              ]
            ])
      ): Self = StObject.set(x, "findIndex", value.asInstanceOf[js.Any])
      
      inline def setFindIndexFunction1(
        value: /* predicate */ js.Function3[
              /* value */ AppPathOverride, 
              /* index */ Double, 
              /* obj */ js.Array[AppPathOverride], 
              Any
            ] => Double
      ): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
      
      inline def setFindIndexUndefined: Self = StObject.set(x, "findIndex", js.undefined)
      
      inline def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
      
      inline def setFlat(
        value: (js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, `1`]]]) | (DeepPartial[js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, `1`]]]])
      ): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatMap(
        value: (js.Function1[
              /* callback */ js.ThisFunction3[
                /* this */ Unit, 
                /* value */ AppPathOverride, 
                /* index */ Double, 
                /* array */ js.Array[AppPathOverride], 
                Any | js.Array[Any]
              ], 
              js.Array[Any]
            ]) | (DeepPartial[
              js.Function1[
                /* callback */ js.ThisFunction3[
                  /* this */ Unit, 
                  /* value */ AppPathOverride, 
                  /* index */ Double, 
                  /* array */ js.Array[AppPathOverride], 
                  Any | js.Array[Any]
                ], 
                js.Array[Any]
              ]
            ])
      ): Self = StObject.set(x, "flatMap", value.asInstanceOf[js.Any])
      
      inline def setFlatMapFunction1(
        value: /* callback */ js.ThisFunction3[
              /* this */ Unit, 
              /* value */ AppPathOverride, 
              /* index */ Double, 
              /* array */ js.Array[AppPathOverride], 
              Any | js.Array[Any]
            ] => js.Array[Any]
      ): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      inline def setFlatMapUndefined: Self = StObject.set(x, "flatMap", js.undefined)
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setForEach(
        value: (js.Function1[
              /* callbackfn */ js.Function3[
                /* value */ AppPathOverride, 
                /* index */ Double, 
                /* array */ js.Array[AppPathOverride], 
                Unit
              ], 
              Unit
            ]) | (DeepPartial[
              js.Function1[
                /* callbackfn */ js.Function3[
                  /* value */ AppPathOverride, 
                  /* index */ Double, 
                  /* array */ js.Array[AppPathOverride], 
                  Unit
                ], 
                Unit
              ]
            ])
      ): Self = StObject.set(x, "forEach", value.asInstanceOf[js.Any])
      
      inline def setForEachFunction1(
        value: /* callbackfn */ js.Function3[
              /* value */ AppPathOverride, 
              /* index */ Double, 
              /* array */ js.Array[AppPathOverride], 
              Unit
            ] => Unit
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setForEachUndefined: Self = StObject.set(x, "forEach", js.undefined)
      
      inline def setIncludes(
        value: (js.Function1[/* searchElement */ AppPathOverride, Boolean]) | (DeepPartial[js.Function1[/* searchElement */ AppPathOverride, Boolean]])
      ): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      inline def setIncludesFunction1(value: /* searchElement */ AppPathOverride => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
      
      inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
      
      inline def setIndexOf(
        value: (js.Function1[/* searchElement */ AppPathOverride, Double]) | (DeepPartial[js.Function1[/* searchElement */ AppPathOverride, Double]])
      ): Self = StObject.set(x, "indexOf", value.asInstanceOf[js.Any])
      
      inline def setIndexOfFunction1(value: /* searchElement */ AppPathOverride => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      inline def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
      
      inline def setJoin(value: js.Function0[String] | DeepPartial[js.Function0[String]]): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      inline def setJoinFunction0(value: () => String): Self = StObject.set(x, "join", js.Any.fromFunction0(value))
      
      inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
      
      inline def setKeys(
        value: js.Function0[IterableIterator[Double]] | DeepPartial[js.Function0[IterableIterator[Double]]]
      ): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysFunction0(value: () => IterableIterator[Double]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setLastIndexOf(
        value: (js.Function1[/* searchElement */ AppPathOverride, Double]) | (DeepPartial[js.Function1[/* searchElement */ AppPathOverride, Double]])
      ): Self = StObject.set(x, "lastIndexOf", value.asInstanceOf[js.Any])
      
      inline def setLastIndexOfFunction1(value: /* searchElement */ AppPathOverride => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
      
      inline def setLastIndexOfUndefined: Self = StObject.set(x, "lastIndexOf", js.undefined)
      
      inline def setLength(value: Double | DeepPartial[Double]): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMap(
        value: (js.Function1[
              /* callbackfn */ js.Function3[
                /* value */ AppPathOverride, 
                /* index */ Double, 
                /* array */ js.Array[AppPathOverride], 
                Any
              ], 
              js.Array[Any]
            ]) | (DeepPartial[
              js.Function1[
                /* callbackfn */ js.Function3[
                  /* value */ AppPathOverride, 
                  /* index */ Double, 
                  /* array */ js.Array[AppPathOverride], 
                  Any
                ], 
                js.Array[Any]
              ]
            ])
      ): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapFunction1(
        value: /* callbackfn */ js.Function3[
              /* value */ AppPathOverride, 
              /* index */ Double, 
              /* array */ js.Array[AppPathOverride], 
              Any
            ] => js.Array[Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setPop(
        value: js.Function0[js.UndefOr[AppPathOverride]] | DeepPartial[js.Function0[js.UndefOr[AppPathOverride]]]
      ): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
      
      inline def setPopFunction0(value: () => js.UndefOr[AppPathOverride]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
      
      inline def setPopUndefined: Self = StObject.set(x, "pop", js.undefined)
      
      inline def setPush(
        value: (js.Function1[/* repeated */ AppPathOverride, Double]) | (DeepPartial[js.Function1[/* repeated */ AppPathOverride, Double]])
      ): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushFunction1(value: /* repeated */ AppPathOverride => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      inline def setReduce(
        value: (js.Function1[
              /* callbackfn */ js.Function4[
                /* previousValue */ AppPathOverride, 
                /* currentValue */ AppPathOverride, 
                /* currentIndex */ Double, 
                /* array */ js.Array[AppPathOverride], 
                AppPathOverride
              ], 
              AppPathOverride
            ]) | (DeepPartial[
              js.Function1[
                /* callbackfn */ js.Function4[
                  /* previousValue */ AppPathOverride, 
                  /* currentValue */ AppPathOverride, 
                  /* currentIndex */ Double, 
                  /* array */ js.Array[AppPathOverride], 
                  AppPathOverride
                ], 
                AppPathOverride
              ]
            ])
      ): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
      
      inline def setReduceFunction1(
        value: /* callbackfn */ js.Function4[
              /* previousValue */ AppPathOverride, 
              /* currentValue */ AppPathOverride, 
              /* currentIndex */ Double, 
              /* array */ js.Array[AppPathOverride], 
              AppPathOverride
            ] => AppPathOverride
      ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
      
      inline def setReduceRight(
        value: (js.Function1[
              /* callbackfn */ js.Function4[
                /* previousValue */ AppPathOverride, 
                /* currentValue */ AppPathOverride, 
                /* currentIndex */ Double, 
                /* array */ js.Array[AppPathOverride], 
                AppPathOverride
              ], 
              AppPathOverride
            ]) | (DeepPartial[
              js.Function1[
                /* callbackfn */ js.Function4[
                  /* previousValue */ AppPathOverride, 
                  /* currentValue */ AppPathOverride, 
                  /* currentIndex */ Double, 
                  /* array */ js.Array[AppPathOverride], 
                  AppPathOverride
                ], 
                AppPathOverride
              ]
            ])
      ): Self = StObject.set(x, "reduceRight", value.asInstanceOf[js.Any])
      
      inline def setReduceRightFunction1(
        value: /* callbackfn */ js.Function4[
              /* previousValue */ AppPathOverride, 
              /* currentValue */ AppPathOverride, 
              /* currentIndex */ Double, 
              /* array */ js.Array[AppPathOverride], 
              AppPathOverride
            ] => AppPathOverride
      ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
      
      inline def setReduceRightUndefined: Self = StObject.set(x, "reduceRight", js.undefined)
      
      inline def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
      
      inline def setReverse(
        value: js.Function0[js.Array[AppPathOverride]] | DeepPartial[js.Function0[js.Array[AppPathOverride]]]
      ): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseFunction0(value: () => js.Array[AppPathOverride]): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setShift(
        value: js.Function0[js.UndefOr[AppPathOverride]] | DeepPartial[js.Function0[js.UndefOr[AppPathOverride]]]
      ): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      inline def setShiftFunction0(value: () => js.UndefOr[AppPathOverride]): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
      
      inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
      
      inline def setSlice(
        value: js.Function0[js.Array[AppPathOverride]] | DeepPartial[js.Function0[js.Array[AppPathOverride]]]
      ): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
      
      inline def setSliceFunction0(value: () => js.Array[AppPathOverride]): Self = StObject.set(x, "slice", js.Any.fromFunction0(value))
      
      inline def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
      
      inline def setSome(
        value: (js.Function1[
              /* predicate */ js.Function3[
                /* value */ AppPathOverride, 
                /* index */ Double, 
                /* array */ js.Array[AppPathOverride], 
                Any
              ], 
              Boolean
            ]) | (DeepPartial[
              js.Function1[
                /* predicate */ js.Function3[
                  /* value */ AppPathOverride, 
                  /* index */ Double, 
                  /* array */ js.Array[AppPathOverride], 
                  Any
                ], 
                Boolean
              ]
            ])
      ): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
      
      inline def setSomeFunction1(
        value: /* predicate */ js.Function3[
              /* value */ AppPathOverride, 
              /* index */ Double, 
              /* array */ js.Array[AppPathOverride], 
              Any
            ] => Boolean
      ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
      
      inline def setSomeUndefined: Self = StObject.set(x, "some", js.undefined)
      
      inline def setSort(
        value: js.Function0[DeepPartialArrayAppPathOv] | DeepPartial[js.Function0[DeepPartialArrayAppPathOv]]
      ): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortFunction0(value: () => DeepPartialArrayAppPathOv): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setSplice(
        value: (js.Function1[/* start */ Double, js.Array[AppPathOverride]]) | (DeepPartial[js.Function1[/* start */ Double, js.Array[AppPathOverride]]])
      ): Self = StObject.set(x, "splice", value.asInstanceOf[js.Any])
      
      inline def setSpliceFunction1(value: /* start */ Double => js.Array[AppPathOverride]): Self = StObject.set(x, "splice", js.Any.fromFunction1(value))
      
      inline def setSpliceUndefined: Self = StObject.set(x, "splice", js.undefined)
      
      inline def setToLocaleString(value: js.Function0[String] | DeepPartial[js.Function0[String]]): Self = StObject.set(x, "toLocaleString", value.asInstanceOf[js.Any])
      
      inline def setToLocaleStringFunction0(value: () => String): Self = StObject.set(x, "toLocaleString", js.Any.fromFunction0(value))
      
      inline def setToLocaleStringUndefined: Self = StObject.set(x, "toLocaleString", js.undefined)
      
      inline def setToString_(value: js.Function0[String] | DeepPartial[js.Function0[String]]): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
      
      inline def setToString_Function0(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
      
      inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
      
      inline def setUnshift(
        value: (js.Function1[/* repeated */ AppPathOverride, Double]) | (DeepPartial[js.Function1[/* repeated */ AppPathOverride, Double]])
      ): Self = StObject.set(x, "unshift", value.asInstanceOf[js.Any])
      
      inline def setUnshiftFunction1(value: /* repeated */ AppPathOverride => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
      
      inline def setUnshiftUndefined: Self = StObject.set(x, "unshift", js.undefined)
      
      inline def setValues(
        value: js.Function0[IterableIterator[AppPathOverride]] | DeepPartial[js.Function0[IterableIterator[AppPathOverride]]]
      ): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesFunction0(value: () => IterableIterator[AppPathOverride]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  /* Inlined flashpoint-launcher.flashpoint-launcher.DeepPartial<std.Array<flashpoint-launcher.flashpoint-launcher.TagFilterGroup>> */
  trait DeepPartialArrayTagFilter extends StObject {
    
    var at: js.UndefOr[
        (js.Function1[/* index */ Double, js.UndefOr[TagFilterGroup]]) | (DeepPartial[js.Function1[/* index */ Double, js.UndefOr[TagFilterGroup]]])
      ] = js.undefined
    
    var concat: js.UndefOr[
        (js.Function1[/* repeated */ js.Array[TagFilterGroup], js.Array[TagFilterGroup]]) | (DeepPartial[js.Function1[/* repeated */ js.Array[TagFilterGroup], js.Array[TagFilterGroup]]])
      ] = js.undefined
    
    var copyWithin: js.UndefOr[
        (js.Function2[/* target */ Double, /* start */ Double, this.type]) | (DeepPartial[js.Function2[/* target */ Double, /* start */ Double, this.type]])
      ] = js.undefined
    
    var entries: js.UndefOr[
        (js.Function0[IterableIterator[js.Tuple2[Double, TagFilterGroup]]]) | (DeepPartial[js.Function0[IterableIterator[js.Tuple2[Double, TagFilterGroup]]]])
      ] = js.undefined
    
    var every: js.UndefOr[
        (js.Function1[
          /* predicate */ js.Function3[
            /* value */ TagFilterGroup, 
            /* index */ Double, 
            /* array */ js.Array[TagFilterGroup], 
            /* is flashpoint-launcher.flashpoint-launcher.TagFilterGroup */ Boolean
          ], 
          /* is std.Array<flashpoint-launcher.flashpoint-launcher.TagFilterGroup> */ Boolean
        ]) | (DeepPartial[
          js.Function1[
            /* predicate */ js.Function3[
              /* value */ TagFilterGroup, 
              /* index */ Double, 
              /* array */ js.Array[TagFilterGroup], 
              /* is flashpoint-launcher.flashpoint-launcher.TagFilterGroup */ Boolean
            ], 
            /* is std.Array<flashpoint-launcher.flashpoint-launcher.TagFilterGroup> */ Boolean
          ]
        ])
      ] = js.undefined
    
    var fill: js.UndefOr[
        (js.Function1[/* value */ TagFilterGroup, this.type]) | (DeepPartial[js.Function1[/* value */ TagFilterGroup, this.type]])
      ] = js.undefined
    
    var filter: js.UndefOr[
        (js.Function1[
          /* predicate */ js.Function3[
            /* value */ TagFilterGroup, 
            /* index */ Double, 
            /* array */ js.Array[TagFilterGroup], 
            /* is flashpoint-launcher.flashpoint-launcher.TagFilterGroup */ Boolean
          ], 
          js.Array[TagFilterGroup]
        ]) | (DeepPartial[
          js.Function1[
            /* predicate */ js.Function3[
              /* value */ TagFilterGroup, 
              /* index */ Double, 
              /* array */ js.Array[TagFilterGroup], 
              /* is flashpoint-launcher.flashpoint-launcher.TagFilterGroup */ Boolean
            ], 
            js.Array[TagFilterGroup]
          ]
        ])
      ] = js.undefined
    
    var find: js.UndefOr[
        (js.Function1[
          /* predicate */ js.ThisFunction3[
            /* this */ Unit, 
            /* value */ TagFilterGroup, 
            /* index */ Double, 
            /* obj */ js.Array[TagFilterGroup], 
            /* is flashpoint-launcher.flashpoint-launcher.TagFilterGroup */ Boolean
          ], 
          js.UndefOr[TagFilterGroup]
        ]) | (DeepPartial[
          js.Function1[
            /* predicate */ js.ThisFunction3[
              /* this */ Unit, 
              /* value */ TagFilterGroup, 
              /* index */ Double, 
              /* obj */ js.Array[TagFilterGroup], 
              /* is flashpoint-launcher.flashpoint-launcher.TagFilterGroup */ Boolean
            ], 
            js.UndefOr[TagFilterGroup]
          ]
        ])
      ] = js.undefined
    
    var findIndex: js.UndefOr[
        (js.Function1[
          /* predicate */ js.Function3[
            /* value */ TagFilterGroup, 
            /* index */ Double, 
            /* obj */ js.Array[TagFilterGroup], 
            Any
          ], 
          Double
        ]) | (DeepPartial[
          js.Function1[
            /* predicate */ js.Function3[
              /* value */ TagFilterGroup, 
              /* index */ Double, 
              /* obj */ js.Array[TagFilterGroup], 
              Any
            ], 
            Double
          ]
        ])
      ] = js.undefined
    
    var flat: js.UndefOr[
        (js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, `1`]]]) | (DeepPartial[js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, `1`]]]])
      ] = js.undefined
    
    var flatMap: js.UndefOr[
        (js.Function1[
          /* callback */ js.ThisFunction3[
            /* this */ Unit, 
            /* value */ TagFilterGroup, 
            /* index */ Double, 
            /* array */ js.Array[TagFilterGroup], 
            Any | js.Array[Any]
          ], 
          js.Array[Any]
        ]) | (DeepPartial[
          js.Function1[
            /* callback */ js.ThisFunction3[
              /* this */ Unit, 
              /* value */ TagFilterGroup, 
              /* index */ Double, 
              /* array */ js.Array[TagFilterGroup], 
              Any | js.Array[Any]
            ], 
            js.Array[Any]
          ]
        ])
      ] = js.undefined
    
    var forEach: js.UndefOr[
        (js.Function1[
          /* callbackfn */ js.Function3[
            /* value */ TagFilterGroup, 
            /* index */ Double, 
            /* array */ js.Array[TagFilterGroup], 
            Unit
          ], 
          Unit
        ]) | (DeepPartial[
          js.Function1[
            /* callbackfn */ js.Function3[
              /* value */ TagFilterGroup, 
              /* index */ Double, 
              /* array */ js.Array[TagFilterGroup], 
              Unit
            ], 
            Unit
          ]
        ])
      ] = js.undefined
    
    var includes: js.UndefOr[
        (js.Function1[/* searchElement */ TagFilterGroup, Boolean]) | (DeepPartial[js.Function1[/* searchElement */ TagFilterGroup, Boolean]])
      ] = js.undefined
    
    var indexOf: js.UndefOr[
        (js.Function1[/* searchElement */ TagFilterGroup, Double]) | (DeepPartial[js.Function1[/* searchElement */ TagFilterGroup, Double]])
      ] = js.undefined
    
    var join: js.UndefOr[js.Function0[String] | DeepPartial[js.Function0[String]]] = js.undefined
    
    var keys: js.UndefOr[
        js.Function0[IterableIterator[Double]] | DeepPartial[js.Function0[IterableIterator[Double]]]
      ] = js.undefined
    
    var lastIndexOf: js.UndefOr[
        (js.Function1[/* searchElement */ TagFilterGroup, Double]) | (DeepPartial[js.Function1[/* searchElement */ TagFilterGroup, Double]])
      ] = js.undefined
    
    var length: js.UndefOr[Double | DeepPartial[Double]] = js.undefined
    
    var map: js.UndefOr[
        (js.Function1[
          /* callbackfn */ js.Function3[
            /* value */ TagFilterGroup, 
            /* index */ Double, 
            /* array */ js.Array[TagFilterGroup], 
            Any
          ], 
          js.Array[Any]
        ]) | (DeepPartial[
          js.Function1[
            /* callbackfn */ js.Function3[
              /* value */ TagFilterGroup, 
              /* index */ Double, 
              /* array */ js.Array[TagFilterGroup], 
              Any
            ], 
            js.Array[Any]
          ]
        ])
      ] = js.undefined
    
    var pop: js.UndefOr[
        js.Function0[js.UndefOr[TagFilterGroup]] | DeepPartial[js.Function0[js.UndefOr[TagFilterGroup]]]
      ] = js.undefined
    
    var push: js.UndefOr[
        (js.Function1[/* repeated */ TagFilterGroup, Double]) | (DeepPartial[js.Function1[/* repeated */ TagFilterGroup, Double]])
      ] = js.undefined
    
    var reduce: js.UndefOr[
        (js.Function1[
          /* callbackfn */ js.Function4[
            /* previousValue */ TagFilterGroup, 
            /* currentValue */ TagFilterGroup, 
            /* currentIndex */ Double, 
            /* array */ js.Array[TagFilterGroup], 
            TagFilterGroup
          ], 
          TagFilterGroup
        ]) | (DeepPartial[
          js.Function1[
            /* callbackfn */ js.Function4[
              /* previousValue */ TagFilterGroup, 
              /* currentValue */ TagFilterGroup, 
              /* currentIndex */ Double, 
              /* array */ js.Array[TagFilterGroup], 
              TagFilterGroup
            ], 
            TagFilterGroup
          ]
        ])
      ] = js.undefined
    
    var reduceRight: js.UndefOr[
        (js.Function1[
          /* callbackfn */ js.Function4[
            /* previousValue */ TagFilterGroup, 
            /* currentValue */ TagFilterGroup, 
            /* currentIndex */ Double, 
            /* array */ js.Array[TagFilterGroup], 
            TagFilterGroup
          ], 
          TagFilterGroup
        ]) | (DeepPartial[
          js.Function1[
            /* callbackfn */ js.Function4[
              /* previousValue */ TagFilterGroup, 
              /* currentValue */ TagFilterGroup, 
              /* currentIndex */ Double, 
              /* array */ js.Array[TagFilterGroup], 
              TagFilterGroup
            ], 
            TagFilterGroup
          ]
        ])
      ] = js.undefined
    
    var reverse: js.UndefOr[
        js.Function0[js.Array[TagFilterGroup]] | DeepPartial[js.Function0[js.Array[TagFilterGroup]]]
      ] = js.undefined
    
    var shift: js.UndefOr[
        js.Function0[js.UndefOr[TagFilterGroup]] | DeepPartial[js.Function0[js.UndefOr[TagFilterGroup]]]
      ] = js.undefined
    
    var slice: js.UndefOr[
        js.Function0[js.Array[TagFilterGroup]] | DeepPartial[js.Function0[js.Array[TagFilterGroup]]]
      ] = js.undefined
    
    var some: js.UndefOr[
        (js.Function1[
          /* predicate */ js.Function3[
            /* value */ TagFilterGroup, 
            /* index */ Double, 
            /* array */ js.Array[TagFilterGroup], 
            Any
          ], 
          Boolean
        ]) | (DeepPartial[
          js.Function1[
            /* predicate */ js.Function3[
              /* value */ TagFilterGroup, 
              /* index */ Double, 
              /* array */ js.Array[TagFilterGroup], 
              Any
            ], 
            Boolean
          ]
        ])
      ] = js.undefined
    
    var sort: js.UndefOr[js.Function0[this.type] | DeepPartial[js.Function0[this.type]]] = js.undefined
    
    var splice: js.UndefOr[
        (js.Function1[/* start */ Double, js.Array[TagFilterGroup]]) | (DeepPartial[js.Function1[/* start */ Double, js.Array[TagFilterGroup]]])
      ] = js.undefined
    
    @JSName("toLocaleString")
    var toLocaleString_FDeepPartialArrayTagFilter: js.UndefOr[js.Function0[String] | DeepPartial[js.Function0[String]]] = js.undefined
    
    @JSName("toString")
    var toString_FDeepPartialArrayTagFilter: js.UndefOr[js.Function0[String] | DeepPartial[js.Function0[String]]] = js.undefined
    
    var unshift: js.UndefOr[
        (js.Function1[/* repeated */ TagFilterGroup, Double]) | (DeepPartial[js.Function1[/* repeated */ TagFilterGroup, Double]])
      ] = js.undefined
    
    var values: js.UndefOr[
        js.Function0[IterableIterator[TagFilterGroup]] | DeepPartial[js.Function0[IterableIterator[TagFilterGroup]]]
      ] = js.undefined
  }
  object DeepPartialArrayTagFilter {
    
    inline def apply(): DeepPartialArrayTagFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeepPartialArrayTagFilter]
    }
    
    extension [Self <: DeepPartialArrayTagFilter](x: Self) {
      
      inline def setAt(
        value: (js.Function1[/* index */ Double, js.UndefOr[TagFilterGroup]]) | (DeepPartial[js.Function1[/* index */ Double, js.UndefOr[TagFilterGroup]]])
      ): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtFunction1(value: /* index */ Double => js.UndefOr[TagFilterGroup]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setConcat(
        value: (js.Function1[/* repeated */ js.Array[TagFilterGroup], js.Array[TagFilterGroup]]) | (DeepPartial[js.Function1[/* repeated */ js.Array[TagFilterGroup], js.Array[TagFilterGroup]]])
      ): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
      
      inline def setConcatFunction1(value: /* repeated */ js.Array[TagFilterGroup] => js.Array[TagFilterGroup]): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setConcatUndefined: Self = StObject.set(x, "concat", js.undefined)
      
      inline def setCopyWithin(
        value: (js.Function2[/* target */ Double, /* start */ Double, DeepPartialArrayTagFilter]) | (DeepPartial[js.Function2[/* target */ Double, /* start */ Double, DeepPartialArrayTagFilter]])
      ): Self = StObject.set(x, "copyWithin", value.asInstanceOf[js.Any])
      
      inline def setCopyWithinFunction2(value: (/* target */ Double, /* start */ Double) => DeepPartialArrayTagFilter): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
      
      inline def setCopyWithinUndefined: Self = StObject.set(x, "copyWithin", js.undefined)
      
      inline def setEntries(
        value: (js.Function0[IterableIterator[js.Tuple2[Double, TagFilterGroup]]]) | (DeepPartial[js.Function0[IterableIterator[js.Tuple2[Double, TagFilterGroup]]]])
      ): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesFunction0(value: () => IterableIterator[js.Tuple2[Double, TagFilterGroup]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      inline def setEvery(
        value: (js.Function1[
              /* predicate */ js.Function3[
                /* value */ TagFilterGroup, 
                /* index */ Double, 
                /* array */ js.Array[TagFilterGroup], 
                /* is flashpoint-launcher.flashpoint-launcher.TagFilterGroup */ Boolean
              ], 
              /* is std.Array<flashpoint-launcher.flashpoint-launcher.TagFilterGroup> */ Boolean
            ]) | (DeepPartial[
              js.Function1[
                /* predicate */ js.Function3[
                  /* value */ TagFilterGroup, 
                  /* index */ Double, 
                  /* array */ js.Array[TagFilterGroup], 
                  /* is flashpoint-launcher.flashpoint-launcher.TagFilterGroup */ Boolean
                ], 
                /* is std.Array<flashpoint-launcher.flashpoint-launcher.TagFilterGroup> */ Boolean
              ]
            ])
      ): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
      
      inline def setEveryFunction1(
        value: /* predicate */ js.Function3[
              /* value */ TagFilterGroup, 
              /* index */ Double, 
              /* array */ js.Array[TagFilterGroup], 
              /* is flashpoint-launcher.flashpoint-launcher.TagFilterGroup */ Boolean
            ] => /* is std.Array<flashpoint-launcher.flashpoint-launcher.TagFilterGroup> */ Boolean
      ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
      
      inline def setEveryUndefined: Self = StObject.set(x, "every", js.undefined)
      
      inline def setFill(
        value: (js.Function1[/* value */ TagFilterGroup, DeepPartialArrayTagFilter]) | (DeepPartial[js.Function1[/* value */ TagFilterGroup, DeepPartialArrayTagFilter]])
      ): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillFunction1(value: /* value */ TagFilterGroup => DeepPartialArrayTagFilter): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFilter(
        value: (js.Function1[
              /* predicate */ js.Function3[
                /* value */ TagFilterGroup, 
                /* index */ Double, 
                /* array */ js.Array[TagFilterGroup], 
                /* is flashpoint-launcher.flashpoint-launcher.TagFilterGroup */ Boolean
              ], 
              js.Array[TagFilterGroup]
            ]) | (DeepPartial[
              js.Function1[
                /* predicate */ js.Function3[
                  /* value */ TagFilterGroup, 
                  /* index */ Double, 
                  /* array */ js.Array[TagFilterGroup], 
                  /* is flashpoint-launcher.flashpoint-launcher.TagFilterGroup */ Boolean
                ], 
                js.Array[TagFilterGroup]
              ]
            ])
      ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction1(
        value: /* predicate */ js.Function3[
              /* value */ TagFilterGroup, 
              /* index */ Double, 
              /* array */ js.Array[TagFilterGroup], 
              /* is flashpoint-launcher.flashpoint-launcher.TagFilterGroup */ Boolean
            ] => js.Array[TagFilterGroup]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFind(
        value: (js.Function1[
              /* predicate */ js.ThisFunction3[
                /* this */ Unit, 
                /* value */ TagFilterGroup, 
                /* index */ Double, 
                /* obj */ js.Array[TagFilterGroup], 
                /* is flashpoint-launcher.flashpoint-launcher.TagFilterGroup */ Boolean
              ], 
              js.UndefOr[TagFilterGroup]
            ]) | (DeepPartial[
              js.Function1[
                /* predicate */ js.ThisFunction3[
                  /* this */ Unit, 
                  /* value */ TagFilterGroup, 
                  /* index */ Double, 
                  /* obj */ js.Array[TagFilterGroup], 
                  /* is flashpoint-launcher.flashpoint-launcher.TagFilterGroup */ Boolean
                ], 
                js.UndefOr[TagFilterGroup]
              ]
            ])
      ): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      inline def setFindFunction1(
        value: /* predicate */ js.ThisFunction3[
              /* this */ Unit, 
              /* value */ TagFilterGroup, 
              /* index */ Double, 
              /* obj */ js.Array[TagFilterGroup], 
              /* is flashpoint-launcher.flashpoint-launcher.TagFilterGroup */ Boolean
            ] => js.UndefOr[TagFilterGroup]
      ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindIndex(
        value: (js.Function1[
              /* predicate */ js.Function3[
                /* value */ TagFilterGroup, 
                /* index */ Double, 
                /* obj */ js.Array[TagFilterGroup], 
                Any
              ], 
              Double
            ]) | (DeepPartial[
              js.Function1[
                /* predicate */ js.Function3[
                  /* value */ TagFilterGroup, 
                  /* index */ Double, 
                  /* obj */ js.Array[TagFilterGroup], 
                  Any
                ], 
                Double
              ]
            ])
      ): Self = StObject.set(x, "findIndex", value.asInstanceOf[js.Any])
      
      inline def setFindIndexFunction1(
        value: /* predicate */ js.Function3[
              /* value */ TagFilterGroup, 
              /* index */ Double, 
              /* obj */ js.Array[TagFilterGroup], 
              Any
            ] => Double
      ): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
      
      inline def setFindIndexUndefined: Self = StObject.set(x, "findIndex", js.undefined)
      
      inline def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
      
      inline def setFlat(
        value: (js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, `1`]]]) | (DeepPartial[js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, `1`]]]])
      ): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatMap(
        value: (js.Function1[
              /* callback */ js.ThisFunction3[
                /* this */ Unit, 
                /* value */ TagFilterGroup, 
                /* index */ Double, 
                /* array */ js.Array[TagFilterGroup], 
                Any | js.Array[Any]
              ], 
              js.Array[Any]
            ]) | (DeepPartial[
              js.Function1[
                /* callback */ js.ThisFunction3[
                  /* this */ Unit, 
                  /* value */ TagFilterGroup, 
                  /* index */ Double, 
                  /* array */ js.Array[TagFilterGroup], 
                  Any | js.Array[Any]
                ], 
                js.Array[Any]
              ]
            ])
      ): Self = StObject.set(x, "flatMap", value.asInstanceOf[js.Any])
      
      inline def setFlatMapFunction1(
        value: /* callback */ js.ThisFunction3[
              /* this */ Unit, 
              /* value */ TagFilterGroup, 
              /* index */ Double, 
              /* array */ js.Array[TagFilterGroup], 
              Any | js.Array[Any]
            ] => js.Array[Any]
      ): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      inline def setFlatMapUndefined: Self = StObject.set(x, "flatMap", js.undefined)
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setForEach(
        value: (js.Function1[
              /* callbackfn */ js.Function3[
                /* value */ TagFilterGroup, 
                /* index */ Double, 
                /* array */ js.Array[TagFilterGroup], 
                Unit
              ], 
              Unit
            ]) | (DeepPartial[
              js.Function1[
                /* callbackfn */ js.Function3[
                  /* value */ TagFilterGroup, 
                  /* index */ Double, 
                  /* array */ js.Array[TagFilterGroup], 
                  Unit
                ], 
                Unit
              ]
            ])
      ): Self = StObject.set(x, "forEach", value.asInstanceOf[js.Any])
      
      inline def setForEachFunction1(
        value: /* callbackfn */ js.Function3[
              /* value */ TagFilterGroup, 
              /* index */ Double, 
              /* array */ js.Array[TagFilterGroup], 
              Unit
            ] => Unit
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setForEachUndefined: Self = StObject.set(x, "forEach", js.undefined)
      
      inline def setIncludes(
        value: (js.Function1[/* searchElement */ TagFilterGroup, Boolean]) | (DeepPartial[js.Function1[/* searchElement */ TagFilterGroup, Boolean]])
      ): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      inline def setIncludesFunction1(value: /* searchElement */ TagFilterGroup => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
      
      inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
      
      inline def setIndexOf(
        value: (js.Function1[/* searchElement */ TagFilterGroup, Double]) | (DeepPartial[js.Function1[/* searchElement */ TagFilterGroup, Double]])
      ): Self = StObject.set(x, "indexOf", value.asInstanceOf[js.Any])
      
      inline def setIndexOfFunction1(value: /* searchElement */ TagFilterGroup => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      inline def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
      
      inline def setJoin(value: js.Function0[String] | DeepPartial[js.Function0[String]]): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      inline def setJoinFunction0(value: () => String): Self = StObject.set(x, "join", js.Any.fromFunction0(value))
      
      inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
      
      inline def setKeys(
        value: js.Function0[IterableIterator[Double]] | DeepPartial[js.Function0[IterableIterator[Double]]]
      ): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysFunction0(value: () => IterableIterator[Double]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setLastIndexOf(
        value: (js.Function1[/* searchElement */ TagFilterGroup, Double]) | (DeepPartial[js.Function1[/* searchElement */ TagFilterGroup, Double]])
      ): Self = StObject.set(x, "lastIndexOf", value.asInstanceOf[js.Any])
      
      inline def setLastIndexOfFunction1(value: /* searchElement */ TagFilterGroup => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
      
      inline def setLastIndexOfUndefined: Self = StObject.set(x, "lastIndexOf", js.undefined)
      
      inline def setLength(value: Double | DeepPartial[Double]): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMap(
        value: (js.Function1[
              /* callbackfn */ js.Function3[
                /* value */ TagFilterGroup, 
                /* index */ Double, 
                /* array */ js.Array[TagFilterGroup], 
                Any
              ], 
              js.Array[Any]
            ]) | (DeepPartial[
              js.Function1[
                /* callbackfn */ js.Function3[
                  /* value */ TagFilterGroup, 
                  /* index */ Double, 
                  /* array */ js.Array[TagFilterGroup], 
                  Any
                ], 
                js.Array[Any]
              ]
            ])
      ): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapFunction1(
        value: /* callbackfn */ js.Function3[
              /* value */ TagFilterGroup, 
              /* index */ Double, 
              /* array */ js.Array[TagFilterGroup], 
              Any
            ] => js.Array[Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setPop(
        value: js.Function0[js.UndefOr[TagFilterGroup]] | DeepPartial[js.Function0[js.UndefOr[TagFilterGroup]]]
      ): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
      
      inline def setPopFunction0(value: () => js.UndefOr[TagFilterGroup]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
      
      inline def setPopUndefined: Self = StObject.set(x, "pop", js.undefined)
      
      inline def setPush(
        value: (js.Function1[/* repeated */ TagFilterGroup, Double]) | (DeepPartial[js.Function1[/* repeated */ TagFilterGroup, Double]])
      ): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushFunction1(value: /* repeated */ TagFilterGroup => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      inline def setReduce(
        value: (js.Function1[
              /* callbackfn */ js.Function4[
                /* previousValue */ TagFilterGroup, 
                /* currentValue */ TagFilterGroup, 
                /* currentIndex */ Double, 
                /* array */ js.Array[TagFilterGroup], 
                TagFilterGroup
              ], 
              TagFilterGroup
            ]) | (DeepPartial[
              js.Function1[
                /* callbackfn */ js.Function4[
                  /* previousValue */ TagFilterGroup, 
                  /* currentValue */ TagFilterGroup, 
                  /* currentIndex */ Double, 
                  /* array */ js.Array[TagFilterGroup], 
                  TagFilterGroup
                ], 
                TagFilterGroup
              ]
            ])
      ): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
      
      inline def setReduceFunction1(
        value: /* callbackfn */ js.Function4[
              /* previousValue */ TagFilterGroup, 
              /* currentValue */ TagFilterGroup, 
              /* currentIndex */ Double, 
              /* array */ js.Array[TagFilterGroup], 
              TagFilterGroup
            ] => TagFilterGroup
      ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
      
      inline def setReduceRight(
        value: (js.Function1[
              /* callbackfn */ js.Function4[
                /* previousValue */ TagFilterGroup, 
                /* currentValue */ TagFilterGroup, 
                /* currentIndex */ Double, 
                /* array */ js.Array[TagFilterGroup], 
                TagFilterGroup
              ], 
              TagFilterGroup
            ]) | (DeepPartial[
              js.Function1[
                /* callbackfn */ js.Function4[
                  /* previousValue */ TagFilterGroup, 
                  /* currentValue */ TagFilterGroup, 
                  /* currentIndex */ Double, 
                  /* array */ js.Array[TagFilterGroup], 
                  TagFilterGroup
                ], 
                TagFilterGroup
              ]
            ])
      ): Self = StObject.set(x, "reduceRight", value.asInstanceOf[js.Any])
      
      inline def setReduceRightFunction1(
        value: /* callbackfn */ js.Function4[
              /* previousValue */ TagFilterGroup, 
              /* currentValue */ TagFilterGroup, 
              /* currentIndex */ Double, 
              /* array */ js.Array[TagFilterGroup], 
              TagFilterGroup
            ] => TagFilterGroup
      ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
      
      inline def setReduceRightUndefined: Self = StObject.set(x, "reduceRight", js.undefined)
      
      inline def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
      
      inline def setReverse(
        value: js.Function0[js.Array[TagFilterGroup]] | DeepPartial[js.Function0[js.Array[TagFilterGroup]]]
      ): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseFunction0(value: () => js.Array[TagFilterGroup]): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setShift(
        value: js.Function0[js.UndefOr[TagFilterGroup]] | DeepPartial[js.Function0[js.UndefOr[TagFilterGroup]]]
      ): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      inline def setShiftFunction0(value: () => js.UndefOr[TagFilterGroup]): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
      
      inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
      
      inline def setSlice(
        value: js.Function0[js.Array[TagFilterGroup]] | DeepPartial[js.Function0[js.Array[TagFilterGroup]]]
      ): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
      
      inline def setSliceFunction0(value: () => js.Array[TagFilterGroup]): Self = StObject.set(x, "slice", js.Any.fromFunction0(value))
      
      inline def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
      
      inline def setSome(
        value: (js.Function1[
              /* predicate */ js.Function3[
                /* value */ TagFilterGroup, 
                /* index */ Double, 
                /* array */ js.Array[TagFilterGroup], 
                Any
              ], 
              Boolean
            ]) | (DeepPartial[
              js.Function1[
                /* predicate */ js.Function3[
                  /* value */ TagFilterGroup, 
                  /* index */ Double, 
                  /* array */ js.Array[TagFilterGroup], 
                  Any
                ], 
                Boolean
              ]
            ])
      ): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
      
      inline def setSomeFunction1(
        value: /* predicate */ js.Function3[
              /* value */ TagFilterGroup, 
              /* index */ Double, 
              /* array */ js.Array[TagFilterGroup], 
              Any
            ] => Boolean
      ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
      
      inline def setSomeUndefined: Self = StObject.set(x, "some", js.undefined)
      
      inline def setSort(
        value: js.Function0[DeepPartialArrayTagFilter] | DeepPartial[js.Function0[DeepPartialArrayTagFilter]]
      ): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortFunction0(value: () => DeepPartialArrayTagFilter): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setSplice(
        value: (js.Function1[/* start */ Double, js.Array[TagFilterGroup]]) | (DeepPartial[js.Function1[/* start */ Double, js.Array[TagFilterGroup]]])
      ): Self = StObject.set(x, "splice", value.asInstanceOf[js.Any])
      
      inline def setSpliceFunction1(value: /* start */ Double => js.Array[TagFilterGroup]): Self = StObject.set(x, "splice", js.Any.fromFunction1(value))
      
      inline def setSpliceUndefined: Self = StObject.set(x, "splice", js.undefined)
      
      inline def setToLocaleString(value: js.Function0[String] | DeepPartial[js.Function0[String]]): Self = StObject.set(x, "toLocaleString", value.asInstanceOf[js.Any])
      
      inline def setToLocaleStringFunction0(value: () => String): Self = StObject.set(x, "toLocaleString", js.Any.fromFunction0(value))
      
      inline def setToLocaleStringUndefined: Self = StObject.set(x, "toLocaleString", js.undefined)
      
      inline def setToString_(value: js.Function0[String] | DeepPartial[js.Function0[String]]): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
      
      inline def setToString_Function0(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
      
      inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
      
      inline def setUnshift(
        value: (js.Function1[/* repeated */ TagFilterGroup, Double]) | (DeepPartial[js.Function1[/* repeated */ TagFilterGroup, Double]])
      ): Self = StObject.set(x, "unshift", value.asInstanceOf[js.Any])
      
      inline def setUnshiftFunction1(value: /* repeated */ TagFilterGroup => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
      
      inline def setUnshiftUndefined: Self = StObject.set(x, "unshift", js.undefined)
      
      inline def setValues(
        value: js.Function0[IterableIterator[TagFilterGroup]] | DeepPartial[js.Function0[IterableIterator[TagFilterGroup]]]
      ): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesFunction0(value: () => IterableIterator[TagFilterGroup]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  /* Inlined flashpoint-launcher.flashpoint-launcher.DeepPartial<std.Array<string>> */
  trait DeepPartialArraystring extends StObject {
    
    var at: js.UndefOr[
        (js.Function1[/* index */ Double, js.UndefOr[String]]) | (DeepPartial[js.Function1[/* index */ Double, js.UndefOr[String]]])
      ] = js.undefined
    
    var concat: js.UndefOr[
        (js.Function1[/* repeated */ js.Array[String], js.Array[String]]) | (DeepPartial[js.Function1[/* repeated */ js.Array[String], js.Array[String]]])
      ] = js.undefined
    
    var copyWithin: js.UndefOr[
        (js.Function2[/* target */ Double, /* start */ Double, this.type]) | (DeepPartial[js.Function2[/* target */ Double, /* start */ Double, this.type]])
      ] = js.undefined
    
    var entries: js.UndefOr[
        (js.Function0[IterableIterator[js.Tuple2[Double, String]]]) | (DeepPartial[js.Function0[IterableIterator[js.Tuple2[Double, String]]]])
      ] = js.undefined
    
    var every: js.UndefOr[
        (js.Function1[
          /* predicate */ js.Function3[
            /* value */ String, 
            /* index */ Double, 
            /* array */ js.Array[String], 
            /* is string */ Boolean
          ], 
          /* is std.Array<string> */ Boolean
        ]) | (DeepPartial[
          js.Function1[
            /* predicate */ js.Function3[
              /* value */ String, 
              /* index */ Double, 
              /* array */ js.Array[String], 
              /* is string */ Boolean
            ], 
            /* is std.Array<string> */ Boolean
          ]
        ])
      ] = js.undefined
    
    var fill: js.UndefOr[
        (js.Function1[/* value */ String, this.type]) | (DeepPartial[js.Function1[/* value */ String, this.type]])
      ] = js.undefined
    
    var filter: js.UndefOr[
        (js.Function1[
          /* predicate */ js.Function3[
            /* value */ String, 
            /* index */ Double, 
            /* array */ js.Array[String], 
            /* is string */ Boolean
          ], 
          js.Array[String]
        ]) | (DeepPartial[
          js.Function1[
            /* predicate */ js.Function3[
              /* value */ String, 
              /* index */ Double, 
              /* array */ js.Array[String], 
              /* is string */ Boolean
            ], 
            js.Array[String]
          ]
        ])
      ] = js.undefined
    
    var find: js.UndefOr[
        (js.Function1[
          /* predicate */ js.ThisFunction3[
            /* this */ Unit, 
            /* value */ String, 
            /* index */ Double, 
            /* obj */ js.Array[String], 
            /* is string */ Boolean
          ], 
          js.UndefOr[String]
        ]) | (DeepPartial[
          js.Function1[
            /* predicate */ js.ThisFunction3[
              /* this */ Unit, 
              /* value */ String, 
              /* index */ Double, 
              /* obj */ js.Array[String], 
              /* is string */ Boolean
            ], 
            js.UndefOr[String]
          ]
        ])
      ] = js.undefined
    
    var findIndex: js.UndefOr[
        (js.Function1[
          /* predicate */ js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], Any], 
          Double
        ]) | (DeepPartial[
          js.Function1[
            /* predicate */ js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], Any], 
            Double
          ]
        ])
      ] = js.undefined
    
    var flat: js.UndefOr[
        (js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, `1`]]]) | (DeepPartial[js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, `1`]]]])
      ] = js.undefined
    
    var flatMap: js.UndefOr[
        (js.Function1[
          /* callback */ js.ThisFunction3[
            /* this */ Unit, 
            /* value */ String, 
            /* index */ Double, 
            /* array */ js.Array[String], 
            Any | js.Array[Any]
          ], 
          js.Array[Any]
        ]) | (DeepPartial[
          js.Function1[
            /* callback */ js.ThisFunction3[
              /* this */ Unit, 
              /* value */ String, 
              /* index */ Double, 
              /* array */ js.Array[String], 
              Any | js.Array[Any]
            ], 
            js.Array[Any]
          ]
        ])
      ] = js.undefined
    
    var forEach: js.UndefOr[
        (js.Function1[
          /* callbackfn */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit], 
          Unit
        ]) | (DeepPartial[
          js.Function1[
            /* callbackfn */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit], 
            Unit
          ]
        ])
      ] = js.undefined
    
    var includes: js.UndefOr[
        (js.Function1[/* searchElement */ String, Boolean]) | (DeepPartial[js.Function1[/* searchElement */ String, Boolean]])
      ] = js.undefined
    
    var indexOf: js.UndefOr[
        (js.Function1[/* searchElement */ String, Double]) | (DeepPartial[js.Function1[/* searchElement */ String, Double]])
      ] = js.undefined
    
    var join: js.UndefOr[js.Function0[String] | DeepPartial[js.Function0[String]]] = js.undefined
    
    var keys: js.UndefOr[
        js.Function0[IterableIterator[Double]] | DeepPartial[js.Function0[IterableIterator[Double]]]
      ] = js.undefined
    
    var lastIndexOf: js.UndefOr[
        (js.Function1[/* searchElement */ String, Double]) | (DeepPartial[js.Function1[/* searchElement */ String, Double]])
      ] = js.undefined
    
    var length: js.UndefOr[Double | DeepPartial[Double]] = js.undefined
    
    var map: js.UndefOr[
        (js.Function1[
          /* callbackfn */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any], 
          js.Array[Any]
        ]) | (DeepPartial[
          js.Function1[
            /* callbackfn */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any], 
            js.Array[Any]
          ]
        ])
      ] = js.undefined
    
    var pop: js.UndefOr[js.Function0[js.UndefOr[String]] | DeepPartial[js.Function0[js.UndefOr[String]]]] = js.undefined
    
    var push: js.UndefOr[
        (js.Function1[/* repeated */ String, Double]) | (DeepPartial[js.Function1[/* repeated */ String, Double]])
      ] = js.undefined
    
    var reduce: js.UndefOr[
        (js.Function1[
          /* callbackfn */ js.Function4[
            /* previousValue */ String, 
            /* currentValue */ String, 
            /* currentIndex */ Double, 
            /* array */ js.Array[String], 
            String
          ], 
          String
        ]) | (DeepPartial[
          js.Function1[
            /* callbackfn */ js.Function4[
              /* previousValue */ String, 
              /* currentValue */ String, 
              /* currentIndex */ Double, 
              /* array */ js.Array[String], 
              String
            ], 
            String
          ]
        ])
      ] = js.undefined
    
    var reduceRight: js.UndefOr[
        (js.Function1[
          /* callbackfn */ js.Function4[
            /* previousValue */ String, 
            /* currentValue */ String, 
            /* currentIndex */ Double, 
            /* array */ js.Array[String], 
            String
          ], 
          String
        ]) | (DeepPartial[
          js.Function1[
            /* callbackfn */ js.Function4[
              /* previousValue */ String, 
              /* currentValue */ String, 
              /* currentIndex */ Double, 
              /* array */ js.Array[String], 
              String
            ], 
            String
          ]
        ])
      ] = js.undefined
    
    var reverse: js.UndefOr[js.Function0[js.Array[String]] | DeepPartial[js.Function0[js.Array[String]]]] = js.undefined
    
    var shift: js.UndefOr[js.Function0[js.UndefOr[String]] | DeepPartial[js.Function0[js.UndefOr[String]]]] = js.undefined
    
    var slice: js.UndefOr[js.Function0[js.Array[String]] | DeepPartial[js.Function0[js.Array[String]]]] = js.undefined
    
    var some: js.UndefOr[
        (js.Function1[
          /* predicate */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any], 
          Boolean
        ]) | (DeepPartial[
          js.Function1[
            /* predicate */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any], 
            Boolean
          ]
        ])
      ] = js.undefined
    
    var sort: js.UndefOr[js.Function0[this.type] | DeepPartial[js.Function0[this.type]]] = js.undefined
    
    var splice: js.UndefOr[
        (js.Function1[/* start */ Double, js.Array[String]]) | (DeepPartial[js.Function1[/* start */ Double, js.Array[String]]])
      ] = js.undefined
    
    @JSName("toLocaleString")
    var toLocaleString_FDeepPartialArraystring: js.UndefOr[js.Function0[String] | DeepPartial[js.Function0[String]]] = js.undefined
    
    @JSName("toString")
    var toString_FDeepPartialArraystring: js.UndefOr[js.Function0[String] | DeepPartial[js.Function0[String]]] = js.undefined
    
    var unshift: js.UndefOr[
        (js.Function1[/* repeated */ String, Double]) | (DeepPartial[js.Function1[/* repeated */ String, Double]])
      ] = js.undefined
    
    var values: js.UndefOr[
        js.Function0[IterableIterator[String]] | DeepPartial[js.Function0[IterableIterator[String]]]
      ] = js.undefined
  }
  object DeepPartialArraystring {
    
    inline def apply(): DeepPartialArraystring = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeepPartialArraystring]
    }
    
    extension [Self <: DeepPartialArraystring](x: Self) {
      
      inline def setAt(
        value: (js.Function1[/* index */ Double, js.UndefOr[String]]) | (DeepPartial[js.Function1[/* index */ Double, js.UndefOr[String]]])
      ): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtFunction1(value: /* index */ Double => js.UndefOr[String]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setConcat(
        value: (js.Function1[/* repeated */ js.Array[String], js.Array[String]]) | (DeepPartial[js.Function1[/* repeated */ js.Array[String], js.Array[String]]])
      ): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
      
      inline def setConcatFunction1(value: /* repeated */ js.Array[String] => js.Array[String]): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setConcatUndefined: Self = StObject.set(x, "concat", js.undefined)
      
      inline def setCopyWithin(
        value: (js.Function2[/* target */ Double, /* start */ Double, DeepPartialArraystring]) | (DeepPartial[js.Function2[/* target */ Double, /* start */ Double, DeepPartialArraystring]])
      ): Self = StObject.set(x, "copyWithin", value.asInstanceOf[js.Any])
      
      inline def setCopyWithinFunction2(value: (/* target */ Double, /* start */ Double) => DeepPartialArraystring): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
      
      inline def setCopyWithinUndefined: Self = StObject.set(x, "copyWithin", js.undefined)
      
      inline def setEntries(
        value: (js.Function0[IterableIterator[js.Tuple2[Double, String]]]) | (DeepPartial[js.Function0[IterableIterator[js.Tuple2[Double, String]]]])
      ): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesFunction0(value: () => IterableIterator[js.Tuple2[Double, String]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      inline def setEvery(
        value: (js.Function1[
              /* predicate */ js.Function3[
                /* value */ String, 
                /* index */ Double, 
                /* array */ js.Array[String], 
                /* is string */ Boolean
              ], 
              /* is std.Array<string> */ Boolean
            ]) | (DeepPartial[
              js.Function1[
                /* predicate */ js.Function3[
                  /* value */ String, 
                  /* index */ Double, 
                  /* array */ js.Array[String], 
                  /* is string */ Boolean
                ], 
                /* is std.Array<string> */ Boolean
              ]
            ])
      ): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
      
      inline def setEveryFunction1(
        value: /* predicate */ js.Function3[
              /* value */ String, 
              /* index */ Double, 
              /* array */ js.Array[String], 
              /* is string */ Boolean
            ] => /* is std.Array<string> */ Boolean
      ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
      
      inline def setEveryUndefined: Self = StObject.set(x, "every", js.undefined)
      
      inline def setFill(
        value: (js.Function1[/* value */ String, DeepPartialArraystring]) | (DeepPartial[js.Function1[/* value */ String, DeepPartialArraystring]])
      ): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillFunction1(value: /* value */ String => DeepPartialArraystring): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFilter(
        value: (js.Function1[
              /* predicate */ js.Function3[
                /* value */ String, 
                /* index */ Double, 
                /* array */ js.Array[String], 
                /* is string */ Boolean
              ], 
              js.Array[String]
            ]) | (DeepPartial[
              js.Function1[
                /* predicate */ js.Function3[
                  /* value */ String, 
                  /* index */ Double, 
                  /* array */ js.Array[String], 
                  /* is string */ Boolean
                ], 
                js.Array[String]
              ]
            ])
      ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction1(
        value: /* predicate */ js.Function3[
              /* value */ String, 
              /* index */ Double, 
              /* array */ js.Array[String], 
              /* is string */ Boolean
            ] => js.Array[String]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFind(
        value: (js.Function1[
              /* predicate */ js.ThisFunction3[
                /* this */ Unit, 
                /* value */ String, 
                /* index */ Double, 
                /* obj */ js.Array[String], 
                /* is string */ Boolean
              ], 
              js.UndefOr[String]
            ]) | (DeepPartial[
              js.Function1[
                /* predicate */ js.ThisFunction3[
                  /* this */ Unit, 
                  /* value */ String, 
                  /* index */ Double, 
                  /* obj */ js.Array[String], 
                  /* is string */ Boolean
                ], 
                js.UndefOr[String]
              ]
            ])
      ): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      inline def setFindFunction1(
        value: /* predicate */ js.ThisFunction3[
              /* this */ Unit, 
              /* value */ String, 
              /* index */ Double, 
              /* obj */ js.Array[String], 
              /* is string */ Boolean
            ] => js.UndefOr[String]
      ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindIndex(
        value: (js.Function1[
              /* predicate */ js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], Any], 
              Double
            ]) | (DeepPartial[
              js.Function1[
                /* predicate */ js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], Any], 
                Double
              ]
            ])
      ): Self = StObject.set(x, "findIndex", value.asInstanceOf[js.Any])
      
      inline def setFindIndexFunction1(
        value: /* predicate */ js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], Any] => Double
      ): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
      
      inline def setFindIndexUndefined: Self = StObject.set(x, "findIndex", js.undefined)
      
      inline def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
      
      inline def setFlat(
        value: (js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, `1`]]]) | (DeepPartial[js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, `1`]]]])
      ): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatMap(
        value: (js.Function1[
              /* callback */ js.ThisFunction3[
                /* this */ Unit, 
                /* value */ String, 
                /* index */ Double, 
                /* array */ js.Array[String], 
                Any | js.Array[Any]
              ], 
              js.Array[Any]
            ]) | (DeepPartial[
              js.Function1[
                /* callback */ js.ThisFunction3[
                  /* this */ Unit, 
                  /* value */ String, 
                  /* index */ Double, 
                  /* array */ js.Array[String], 
                  Any | js.Array[Any]
                ], 
                js.Array[Any]
              ]
            ])
      ): Self = StObject.set(x, "flatMap", value.asInstanceOf[js.Any])
      
      inline def setFlatMapFunction1(
        value: /* callback */ js.ThisFunction3[
              /* this */ Unit, 
              /* value */ String, 
              /* index */ Double, 
              /* array */ js.Array[String], 
              Any | js.Array[Any]
            ] => js.Array[Any]
      ): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      inline def setFlatMapUndefined: Self = StObject.set(x, "flatMap", js.undefined)
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setForEach(
        value: (js.Function1[
              /* callbackfn */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit], 
              Unit
            ]) | (DeepPartial[
              js.Function1[
                /* callbackfn */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit], 
                Unit
              ]
            ])
      ): Self = StObject.set(x, "forEach", value.asInstanceOf[js.Any])
      
      inline def setForEachFunction1(
        value: /* callbackfn */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit] => Unit
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setForEachUndefined: Self = StObject.set(x, "forEach", js.undefined)
      
      inline def setIncludes(
        value: (js.Function1[/* searchElement */ String, Boolean]) | (DeepPartial[js.Function1[/* searchElement */ String, Boolean]])
      ): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      inline def setIncludesFunction1(value: /* searchElement */ String => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
      
      inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
      
      inline def setIndexOf(
        value: (js.Function1[/* searchElement */ String, Double]) | (DeepPartial[js.Function1[/* searchElement */ String, Double]])
      ): Self = StObject.set(x, "indexOf", value.asInstanceOf[js.Any])
      
      inline def setIndexOfFunction1(value: /* searchElement */ String => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      inline def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
      
      inline def setJoin(value: js.Function0[String] | DeepPartial[js.Function0[String]]): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      inline def setJoinFunction0(value: () => String): Self = StObject.set(x, "join", js.Any.fromFunction0(value))
      
      inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
      
      inline def setKeys(
        value: js.Function0[IterableIterator[Double]] | DeepPartial[js.Function0[IterableIterator[Double]]]
      ): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysFunction0(value: () => IterableIterator[Double]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setLastIndexOf(
        value: (js.Function1[/* searchElement */ String, Double]) | (DeepPartial[js.Function1[/* searchElement */ String, Double]])
      ): Self = StObject.set(x, "lastIndexOf", value.asInstanceOf[js.Any])
      
      inline def setLastIndexOfFunction1(value: /* searchElement */ String => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
      
      inline def setLastIndexOfUndefined: Self = StObject.set(x, "lastIndexOf", js.undefined)
      
      inline def setLength(value: Double | DeepPartial[Double]): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMap(
        value: (js.Function1[
              /* callbackfn */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any], 
              js.Array[Any]
            ]) | (DeepPartial[
              js.Function1[
                /* callbackfn */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any], 
                js.Array[Any]
              ]
            ])
      ): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapFunction1(
        value: /* callbackfn */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any] => js.Array[Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setPop(value: js.Function0[js.UndefOr[String]] | DeepPartial[js.Function0[js.UndefOr[String]]]): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
      
      inline def setPopFunction0(value: () => js.UndefOr[String]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
      
      inline def setPopUndefined: Self = StObject.set(x, "pop", js.undefined)
      
      inline def setPush(
        value: (js.Function1[/* repeated */ String, Double]) | (DeepPartial[js.Function1[/* repeated */ String, Double]])
      ): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushFunction1(value: /* repeated */ String => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      inline def setReduce(
        value: (js.Function1[
              /* callbackfn */ js.Function4[
                /* previousValue */ String, 
                /* currentValue */ String, 
                /* currentIndex */ Double, 
                /* array */ js.Array[String], 
                String
              ], 
              String
            ]) | (DeepPartial[
              js.Function1[
                /* callbackfn */ js.Function4[
                  /* previousValue */ String, 
                  /* currentValue */ String, 
                  /* currentIndex */ Double, 
                  /* array */ js.Array[String], 
                  String
                ], 
                String
              ]
            ])
      ): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
      
      inline def setReduceFunction1(
        value: /* callbackfn */ js.Function4[
              /* previousValue */ String, 
              /* currentValue */ String, 
              /* currentIndex */ Double, 
              /* array */ js.Array[String], 
              String
            ] => String
      ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
      
      inline def setReduceRight(
        value: (js.Function1[
              /* callbackfn */ js.Function4[
                /* previousValue */ String, 
                /* currentValue */ String, 
                /* currentIndex */ Double, 
                /* array */ js.Array[String], 
                String
              ], 
              String
            ]) | (DeepPartial[
              js.Function1[
                /* callbackfn */ js.Function4[
                  /* previousValue */ String, 
                  /* currentValue */ String, 
                  /* currentIndex */ Double, 
                  /* array */ js.Array[String], 
                  String
                ], 
                String
              ]
            ])
      ): Self = StObject.set(x, "reduceRight", value.asInstanceOf[js.Any])
      
      inline def setReduceRightFunction1(
        value: /* callbackfn */ js.Function4[
              /* previousValue */ String, 
              /* currentValue */ String, 
              /* currentIndex */ Double, 
              /* array */ js.Array[String], 
              String
            ] => String
      ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
      
      inline def setReduceRightUndefined: Self = StObject.set(x, "reduceRight", js.undefined)
      
      inline def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
      
      inline def setReverse(value: js.Function0[js.Array[String]] | DeepPartial[js.Function0[js.Array[String]]]): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseFunction0(value: () => js.Array[String]): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setShift(value: js.Function0[js.UndefOr[String]] | DeepPartial[js.Function0[js.UndefOr[String]]]): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      inline def setShiftFunction0(value: () => js.UndefOr[String]): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
      
      inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
      
      inline def setSlice(value: js.Function0[js.Array[String]] | DeepPartial[js.Function0[js.Array[String]]]): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
      
      inline def setSliceFunction0(value: () => js.Array[String]): Self = StObject.set(x, "slice", js.Any.fromFunction0(value))
      
      inline def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
      
      inline def setSome(
        value: (js.Function1[
              /* predicate */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any], 
              Boolean
            ]) | (DeepPartial[
              js.Function1[
                /* predicate */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any], 
                Boolean
              ]
            ])
      ): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
      
      inline def setSomeFunction1(
        value: /* predicate */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any] => Boolean
      ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
      
      inline def setSomeUndefined: Self = StObject.set(x, "some", js.undefined)
      
      inline def setSort(value: js.Function0[DeepPartialArraystring] | DeepPartial[js.Function0[DeepPartialArraystring]]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortFunction0(value: () => DeepPartialArraystring): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setSplice(
        value: (js.Function1[/* start */ Double, js.Array[String]]) | (DeepPartial[js.Function1[/* start */ Double, js.Array[String]]])
      ): Self = StObject.set(x, "splice", value.asInstanceOf[js.Any])
      
      inline def setSpliceFunction1(value: /* start */ Double => js.Array[String]): Self = StObject.set(x, "splice", js.Any.fromFunction1(value))
      
      inline def setSpliceUndefined: Self = StObject.set(x, "splice", js.undefined)
      
      inline def setToLocaleString(value: js.Function0[String] | DeepPartial[js.Function0[String]]): Self = StObject.set(x, "toLocaleString", value.asInstanceOf[js.Any])
      
      inline def setToLocaleStringFunction0(value: () => String): Self = StObject.set(x, "toLocaleString", js.Any.fromFunction0(value))
      
      inline def setToLocaleStringUndefined: Self = StObject.set(x, "toLocaleString", js.undefined)
      
      inline def setToString_(value: js.Function0[String] | DeepPartial[js.Function0[String]]): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
      
      inline def setToString_Function0(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
      
      inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
      
      inline def setUnshift(
        value: (js.Function1[/* repeated */ String, Double]) | (DeepPartial[js.Function1[/* repeated */ String, Double]])
      ): Self = StObject.set(x, "unshift", value.asInstanceOf[js.Any])
      
      inline def setUnshiftFunction1(value: /* repeated */ String => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
      
      inline def setUnshiftUndefined: Self = StObject.set(x, "unshift", js.undefined)
      
      inline def setValues(
        value: js.Function0[IterableIterator[String]] | DeepPartial[js.Function0[IterableIterator[String]]]
      ): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesFunction0(value: () => IterableIterator[String]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  trait Key extends StObject {
    
    var key: String
    
    var value: Any
  }
  object Key {
    
    inline def apply(key: String, value: Any): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewGame extends StObject {
    
    var newGame: Game
    
    var oldGame: Game
  }
  object NewGame {
    
    inline def apply(newGame: Game, oldGame: Game): NewGame = {
      val __obj = js.Dynamic.literal(newGame = newGame.asInstanceOf[js.Any], oldGame = oldGame.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewGame]
    }
    
    extension [Self <: NewGame](x: Self) {
      
      inline def setNewGame(value: Game): Self = StObject.set(x, "newGame", value.asInstanceOf[js.Any])
      
      inline def setOldGame(value: Game): Self = StObject.set(x, "oldGame", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewPlaylist extends StObject {
    
    var newPlaylist: Playlist
    
    var oldPlaylist: Playlist
  }
  object NewPlaylist {
    
    inline def apply(newPlaylist: Playlist, oldPlaylist: Playlist): NewPlaylist = {
      val __obj = js.Dynamic.literal(newPlaylist = newPlaylist.asInstanceOf[js.Any], oldPlaylist = oldPlaylist.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewPlaylist]
    }
    
    extension [Self <: NewPlaylist](x: Self) {
      
      inline def setNewPlaylist(value: Playlist): Self = StObject.set(x, "newPlaylist", value.asInstanceOf[js.Any])
      
      inline def setOldPlaylist(value: Playlist): Self = StObject.set(x, "oldPlaylist", value.asInstanceOf[js.Any])
    }
  }
  
  trait OldGame extends StObject {
    
    var newGame: PlaylistGame
    
    var oldGame: PlaylistGame
  }
  object OldGame {
    
    inline def apply(newGame: PlaylistGame, oldGame: PlaylistGame): OldGame = {
      val __obj = js.Dynamic.literal(newGame = newGame.asInstanceOf[js.Any], oldGame = oldGame.asInstanceOf[js.Any])
      __obj.asInstanceOf[OldGame]
    }
    
    extension [Self <: OldGame](x: Self) {
      
      inline def setNewGame(value: PlaylistGame): Self = StObject.set(x, "newGame", value.asInstanceOf[js.Any])
      
      inline def setOldGame(value: PlaylistGame): Self = StObject.set(x, "oldGame", value.asInstanceOf[js.Any])
    }
  }
}
