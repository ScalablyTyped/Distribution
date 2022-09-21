package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains state of all non-config settings the user can change in the application.
  * This is the data contained in the Preferences file.
  */
trait AppPreferencesData
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /** Application path overrides to check during app launches */
  var appPathOverrides: js.Array[AppPathOverride]
  
  /** Scale of the games at the BrowsePage. */
  var browsePageGameScale: Double
  
  /** Layout of game collection at BrowsePage. */
  var browsePageLayout: BrowsePageLayout
  
  /** Width of the left sidebar. (Browse Page) */
  var browsePageLeftSidebarWidth: Double
  
  /** Width of the right sidebar. (Browse Page) */
  var browsePageRightSidebarWidth: Double
  
  /** If "Extreme" games should be shown at the BrowsePage. */
  var browsePageShowExtreme: Boolean
  
  /** If the left sidebar at the BrowsePage should be visible. */
  var browsePageShowLeftSidebar: Boolean
  
  /** If the right sidebar at the BrowsePage should be visible. */
  var browsePageShowRightSidebar: Boolean
  
  /** Proxy server to use during Browser Mode */
  var browserModeProxy: String
  
  /** Width of the left sidebar. (Curate Page) */
  var curatePageLeftSidebarWidth: Double
  
  /** Current language */
  var currentLanguage: String
  
  /** Filename of the current logo set */
  var currentLogoSet: js.UndefOr[String] = js.undefined
  
  /** Filename of the current theme. */
  var currentTheme: js.UndefOr[String] = js.undefined
  
  /** Path to store Game Data packs */
  var dataPacksFolderPath: String
  
  /** Default Library for new games etc. */
  var defaultLibrary: String
  
  /** If games flagged as "extreme" should be hidden (mainly for parental control) */
  var disableExtremeGames: Boolean
  
  /** If editing games, additional applications and playlists should be allowed. */
  var enableEditing: Boolean
  
  /** Libraries that should be excluded from random picks. */
  var excludedRandomLibraries: js.Array[String]
  
  /** Path to load User extensions from (relative to the flashpoint path) */
  var extensionsPath: String
  
  /** Default language used for fallback */
  var fallbackLanguage: String
  
  /** What order the games should appear in. */
  var gamesOrder: GameOrderDirection
  
  /** What property to order the games by. */
  var gamesOrderBy: GameOrderBy
  
  /** Path to the htdocs folder (relative to the flashpoint path) */
  var htdocsFolderPath: String
  
  /** Path to the image folder (relative to the flashpoint path) */
  var imageFolderPath: String
  
  /** Path to the json folder (relative to the flashpoint path) */
  var jsonFolderPath: String
  
  /** Assign the same UUID to imported games as in the curation archive */
  var keepArchiveKey: Boolean
  
  /** The "route" of the last selected library (empty string selects the default). */
  var lastSelectedLibrary: String
  
  /** Path to the logo folder (relative to the flashpoint path) */
  var logoFolderPath: String
  
  /** Path to the logo sets folder (relative to the flashpoint path) */
  var logoSetsFolderPath: String
  
  /** Position and size of the main window. */
  var mainWindow: AppPreferencesDataMainWindow
  
  /** Path of the meta edits folder (relative to the flashpoint path) */
  var metaEditsFolderPath: String
  
  /** Array of native locked platforms */
  var nativePlatforms: js.Array[String]
  
  /** Base URL of the server to download missing thumbnails/screenshots from. */
  var onDemandBaseUrl: String
  
  /** Download missing thumbnails/screenshots from a remote server. */
  var onDemandImages: Boolean
  
  /** Path to the platform folder (relative to the flashpoint path) */
  var platformFolderPath: String
  
  /** Path to the playlist folder (relative to the flashpoint path) */
  var playlistFolderPath: String
  
  /** Save curations after importing */
  var saveImportedCurations: Boolean
  
  /** If games flagged as "broken" should be hidden */
  var showBrokenGames: Boolean
  
  /** If the "Developer" tab should be visible in the header. */
  var showDeveloperTab: Boolean
  
  /** Levels to show/hide in the log page. */
  var showLogLevel: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in flashpoint-launcher.flashpoint-launcher.LogLevel ]: boolean}
    */ typings.flashpointLauncher.flashpointLauncherStrings.AppPreferencesData & TopLevel[Any]
  
  /** Sources to show/hide in the log page. */
  var showLogSource: StringDictionary[Boolean]
  
  /** Whether to symlink or copy curation content when running (Symlink required for MAD4FP) */
  var symlinkCurationContent: Boolean
  
  /** Tag filter groups */
  var tagFilters: js.Array[TagFilterGroup]
  
  /** Use Tag Filters in the Curate suggestions */
  var tagFiltersInCurate: Boolean
  
  /** Path to the theme folder (relative to the flashpoint path) */
  var themeFolderPath: String
}
object AppPreferencesData {
  
  inline def apply(
    appPathOverrides: js.Array[AppPathOverride],
    browsePageGameScale: Double,
    browsePageLayout: BrowsePageLayout,
    browsePageLeftSidebarWidth: Double,
    browsePageRightSidebarWidth: Double,
    browsePageShowExtreme: Boolean,
    browsePageShowLeftSidebar: Boolean,
    browsePageShowRightSidebar: Boolean,
    browserModeProxy: String,
    curatePageLeftSidebarWidth: Double,
    currentLanguage: String,
    dataPacksFolderPath: String,
    defaultLibrary: String,
    disableExtremeGames: Boolean,
    enableEditing: Boolean,
    excludedRandomLibraries: js.Array[String],
    extensionsPath: String,
    fallbackLanguage: String,
    gamesOrder: GameOrderDirection,
    gamesOrderBy: GameOrderBy,
    htdocsFolderPath: String,
    imageFolderPath: String,
    jsonFolderPath: String,
    keepArchiveKey: Boolean,
    lastSelectedLibrary: String,
    logoFolderPath: String,
    logoSetsFolderPath: String,
    mainWindow: AppPreferencesDataMainWindow,
    metaEditsFolderPath: String,
    nativePlatforms: js.Array[String],
    onDemandBaseUrl: String,
    onDemandImages: Boolean,
    platformFolderPath: String,
    playlistFolderPath: String,
    saveImportedCurations: Boolean,
    showBrokenGames: Boolean,
    showDeveloperTab: Boolean,
    showLogLevel: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in flashpoint-launcher.flashpoint-launcher.LogLevel ]: boolean}
    */ typings.flashpointLauncher.flashpointLauncherStrings.AppPreferencesData & TopLevel[Any],
    showLogSource: StringDictionary[Boolean],
    symlinkCurationContent: Boolean,
    tagFilters: js.Array[TagFilterGroup],
    tagFiltersInCurate: Boolean,
    themeFolderPath: String
  ): AppPreferencesData = {
    val __obj = js.Dynamic.literal(appPathOverrides = appPathOverrides.asInstanceOf[js.Any], browsePageGameScale = browsePageGameScale.asInstanceOf[js.Any], browsePageLayout = browsePageLayout.asInstanceOf[js.Any], browsePageLeftSidebarWidth = browsePageLeftSidebarWidth.asInstanceOf[js.Any], browsePageRightSidebarWidth = browsePageRightSidebarWidth.asInstanceOf[js.Any], browsePageShowExtreme = browsePageShowExtreme.asInstanceOf[js.Any], browsePageShowLeftSidebar = browsePageShowLeftSidebar.asInstanceOf[js.Any], browsePageShowRightSidebar = browsePageShowRightSidebar.asInstanceOf[js.Any], browserModeProxy = browserModeProxy.asInstanceOf[js.Any], curatePageLeftSidebarWidth = curatePageLeftSidebarWidth.asInstanceOf[js.Any], currentLanguage = currentLanguage.asInstanceOf[js.Any], dataPacksFolderPath = dataPacksFolderPath.asInstanceOf[js.Any], defaultLibrary = defaultLibrary.asInstanceOf[js.Any], disableExtremeGames = disableExtremeGames.asInstanceOf[js.Any], enableEditing = enableEditing.asInstanceOf[js.Any], excludedRandomLibraries = excludedRandomLibraries.asInstanceOf[js.Any], extensionsPath = extensionsPath.asInstanceOf[js.Any], fallbackLanguage = fallbackLanguage.asInstanceOf[js.Any], gamesOrder = gamesOrder.asInstanceOf[js.Any], gamesOrderBy = gamesOrderBy.asInstanceOf[js.Any], htdocsFolderPath = htdocsFolderPath.asInstanceOf[js.Any], imageFolderPath = imageFolderPath.asInstanceOf[js.Any], jsonFolderPath = jsonFolderPath.asInstanceOf[js.Any], keepArchiveKey = keepArchiveKey.asInstanceOf[js.Any], lastSelectedLibrary = lastSelectedLibrary.asInstanceOf[js.Any], logoFolderPath = logoFolderPath.asInstanceOf[js.Any], logoSetsFolderPath = logoSetsFolderPath.asInstanceOf[js.Any], mainWindow = mainWindow.asInstanceOf[js.Any], metaEditsFolderPath = metaEditsFolderPath.asInstanceOf[js.Any], nativePlatforms = nativePlatforms.asInstanceOf[js.Any], onDemandBaseUrl = onDemandBaseUrl.asInstanceOf[js.Any], onDemandImages = onDemandImages.asInstanceOf[js.Any], platformFolderPath = platformFolderPath.asInstanceOf[js.Any], playlistFolderPath = playlistFolderPath.asInstanceOf[js.Any], saveImportedCurations = saveImportedCurations.asInstanceOf[js.Any], showBrokenGames = showBrokenGames.asInstanceOf[js.Any], showDeveloperTab = showDeveloperTab.asInstanceOf[js.Any], showLogLevel = showLogLevel.asInstanceOf[js.Any], showLogSource = showLogSource.asInstanceOf[js.Any], symlinkCurationContent = symlinkCurationContent.asInstanceOf[js.Any], tagFilters = tagFilters.asInstanceOf[js.Any], tagFiltersInCurate = tagFiltersInCurate.asInstanceOf[js.Any], themeFolderPath = themeFolderPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppPreferencesData]
  }
  
  extension [Self <: AppPreferencesData](x: Self) {
    
    inline def setAppPathOverrides(value: js.Array[AppPathOverride]): Self = StObject.set(x, "appPathOverrides", value.asInstanceOf[js.Any])
    
    inline def setAppPathOverridesVarargs(value: AppPathOverride*): Self = StObject.set(x, "appPathOverrides", js.Array(value*))
    
    inline def setBrowsePageGameScale(value: Double): Self = StObject.set(x, "browsePageGameScale", value.asInstanceOf[js.Any])
    
    inline def setBrowsePageLayout(value: BrowsePageLayout): Self = StObject.set(x, "browsePageLayout", value.asInstanceOf[js.Any])
    
    inline def setBrowsePageLeftSidebarWidth(value: Double): Self = StObject.set(x, "browsePageLeftSidebarWidth", value.asInstanceOf[js.Any])
    
    inline def setBrowsePageRightSidebarWidth(value: Double): Self = StObject.set(x, "browsePageRightSidebarWidth", value.asInstanceOf[js.Any])
    
    inline def setBrowsePageShowExtreme(value: Boolean): Self = StObject.set(x, "browsePageShowExtreme", value.asInstanceOf[js.Any])
    
    inline def setBrowsePageShowLeftSidebar(value: Boolean): Self = StObject.set(x, "browsePageShowLeftSidebar", value.asInstanceOf[js.Any])
    
    inline def setBrowsePageShowRightSidebar(value: Boolean): Self = StObject.set(x, "browsePageShowRightSidebar", value.asInstanceOf[js.Any])
    
    inline def setBrowserModeProxy(value: String): Self = StObject.set(x, "browserModeProxy", value.asInstanceOf[js.Any])
    
    inline def setCuratePageLeftSidebarWidth(value: Double): Self = StObject.set(x, "curatePageLeftSidebarWidth", value.asInstanceOf[js.Any])
    
    inline def setCurrentLanguage(value: String): Self = StObject.set(x, "currentLanguage", value.asInstanceOf[js.Any])
    
    inline def setCurrentLogoSet(value: String): Self = StObject.set(x, "currentLogoSet", value.asInstanceOf[js.Any])
    
    inline def setCurrentLogoSetUndefined: Self = StObject.set(x, "currentLogoSet", js.undefined)
    
    inline def setCurrentTheme(value: String): Self = StObject.set(x, "currentTheme", value.asInstanceOf[js.Any])
    
    inline def setCurrentThemeUndefined: Self = StObject.set(x, "currentTheme", js.undefined)
    
    inline def setDataPacksFolderPath(value: String): Self = StObject.set(x, "dataPacksFolderPath", value.asInstanceOf[js.Any])
    
    inline def setDefaultLibrary(value: String): Self = StObject.set(x, "defaultLibrary", value.asInstanceOf[js.Any])
    
    inline def setDisableExtremeGames(value: Boolean): Self = StObject.set(x, "disableExtremeGames", value.asInstanceOf[js.Any])
    
    inline def setEnableEditing(value: Boolean): Self = StObject.set(x, "enableEditing", value.asInstanceOf[js.Any])
    
    inline def setExcludedRandomLibraries(value: js.Array[String]): Self = StObject.set(x, "excludedRandomLibraries", value.asInstanceOf[js.Any])
    
    inline def setExcludedRandomLibrariesVarargs(value: String*): Self = StObject.set(x, "excludedRandomLibraries", js.Array(value*))
    
    inline def setExtensionsPath(value: String): Self = StObject.set(x, "extensionsPath", value.asInstanceOf[js.Any])
    
    inline def setFallbackLanguage(value: String): Self = StObject.set(x, "fallbackLanguage", value.asInstanceOf[js.Any])
    
    inline def setGamesOrder(value: GameOrderDirection): Self = StObject.set(x, "gamesOrder", value.asInstanceOf[js.Any])
    
    inline def setGamesOrderBy(value: GameOrderBy): Self = StObject.set(x, "gamesOrderBy", value.asInstanceOf[js.Any])
    
    inline def setHtdocsFolderPath(value: String): Self = StObject.set(x, "htdocsFolderPath", value.asInstanceOf[js.Any])
    
    inline def setImageFolderPath(value: String): Self = StObject.set(x, "imageFolderPath", value.asInstanceOf[js.Any])
    
    inline def setJsonFolderPath(value: String): Self = StObject.set(x, "jsonFolderPath", value.asInstanceOf[js.Any])
    
    inline def setKeepArchiveKey(value: Boolean): Self = StObject.set(x, "keepArchiveKey", value.asInstanceOf[js.Any])
    
    inline def setLastSelectedLibrary(value: String): Self = StObject.set(x, "lastSelectedLibrary", value.asInstanceOf[js.Any])
    
    inline def setLogoFolderPath(value: String): Self = StObject.set(x, "logoFolderPath", value.asInstanceOf[js.Any])
    
    inline def setLogoSetsFolderPath(value: String): Self = StObject.set(x, "logoSetsFolderPath", value.asInstanceOf[js.Any])
    
    inline def setMainWindow(value: AppPreferencesDataMainWindow): Self = StObject.set(x, "mainWindow", value.asInstanceOf[js.Any])
    
    inline def setMetaEditsFolderPath(value: String): Self = StObject.set(x, "metaEditsFolderPath", value.asInstanceOf[js.Any])
    
    inline def setNativePlatforms(value: js.Array[String]): Self = StObject.set(x, "nativePlatforms", value.asInstanceOf[js.Any])
    
    inline def setNativePlatformsVarargs(value: String*): Self = StObject.set(x, "nativePlatforms", js.Array(value*))
    
    inline def setOnDemandBaseUrl(value: String): Self = StObject.set(x, "onDemandBaseUrl", value.asInstanceOf[js.Any])
    
    inline def setOnDemandImages(value: Boolean): Self = StObject.set(x, "onDemandImages", value.asInstanceOf[js.Any])
    
    inline def setPlatformFolderPath(value: String): Self = StObject.set(x, "platformFolderPath", value.asInstanceOf[js.Any])
    
    inline def setPlaylistFolderPath(value: String): Self = StObject.set(x, "playlistFolderPath", value.asInstanceOf[js.Any])
    
    inline def setSaveImportedCurations(value: Boolean): Self = StObject.set(x, "saveImportedCurations", value.asInstanceOf[js.Any])
    
    inline def setShowBrokenGames(value: Boolean): Self = StObject.set(x, "showBrokenGames", value.asInstanceOf[js.Any])
    
    inline def setShowDeveloperTab(value: Boolean): Self = StObject.set(x, "showDeveloperTab", value.asInstanceOf[js.Any])
    
    inline def setShowLogLevel(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in flashpoint-launcher.flashpoint-launcher.LogLevel ]: boolean}
      */ typings.flashpointLauncher.flashpointLauncherStrings.AppPreferencesData & TopLevel[Any]
    ): Self = StObject.set(x, "showLogLevel", value.asInstanceOf[js.Any])
    
    inline def setShowLogSource(value: StringDictionary[Boolean]): Self = StObject.set(x, "showLogSource", value.asInstanceOf[js.Any])
    
    inline def setSymlinkCurationContent(value: Boolean): Self = StObject.set(x, "symlinkCurationContent", value.asInstanceOf[js.Any])
    
    inline def setTagFilters(value: js.Array[TagFilterGroup]): Self = StObject.set(x, "tagFilters", value.asInstanceOf[js.Any])
    
    inline def setTagFiltersInCurate(value: Boolean): Self = StObject.set(x, "tagFiltersInCurate", value.asInstanceOf[js.Any])
    
    inline def setTagFiltersVarargs(value: TagFilterGroup*): Self = StObject.set(x, "tagFilters", js.Array(value*))
    
    inline def setThemeFolderPath(value: String): Self = StObject.set(x, "themeFolderPath", value.asInstanceOf[js.Any])
  }
}
