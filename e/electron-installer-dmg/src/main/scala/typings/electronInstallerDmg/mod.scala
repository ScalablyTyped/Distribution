package typings.electronInstallerDmg

import typings.electronInstallerDmg.anon.PartialSpecification
import typings.electronInstallerDmg.electronInstallerDmgStrings.UDBZ
import typings.electronInstallerDmg.electronInstallerDmgStrings.UDCO
import typings.electronInstallerDmg.electronInstallerDmgStrings.UDRO
import typings.electronInstallerDmg.electronInstallerDmgStrings.UDRW
import typings.electronInstallerDmg.electronInstallerDmgStrings.UDZO
import typings.electronInstallerDmg.electronInstallerDmgStrings.ULFO
import typings.electronInstallerDmg.electronInstallerDmgStrings.file
import typings.electronInstallerDmg.electronInstallerDmgStrings.link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(createOptions: CreateOptions): js.Promise[CreateOptions] = ^.asInstanceOf[js.Dynamic].apply(createOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CreateOptions]]
  
  @JSImport("electron-installer-dmg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Content extends StObject {
    
    var path: String
    
    var `type`: link | file
    
    var x: Double
    
    var y: Double
  }
  object Content {
    
    inline def apply(path: String, `type`: link | file, x: Double, y: Double): Content = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: link | file): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options passed to the `contents` function.
    */
  // Note: In the actual implementation, the entire `CreateOptions` object is
  // passed to the `contents` function, but in the type we omit the `contents`
  // field to avoid recursion.
  /* Inlined std.Omit<electron-installer-dmg.electron-installer-dmg.CreateOptions, 'contents'> */
  trait ContentsOptions extends StObject {
    
    var additionalDMGOptions: js.UndefOr[PartialSpecification] = js.undefined
    
    var appPath: String
    
    var background: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var iconSize: js.UndefOr[Double] = js.undefined
    
    var name: String
    
    var out: js.UndefOr[String] = js.undefined
    
    var overwrite: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object ContentsOptions {
    
    inline def apply(appPath: String, name: String): ContentsOptions = {
      val __obj = js.Dynamic.literal(appPath = appPath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentsOptions] (val x: Self) extends AnyVal {
      
      inline def setAdditionalDMGOptions(value: PartialSpecification): Self = StObject.set(x, "additionalDMGOptions", value.asInstanceOf[js.Any])
      
      inline def setAdditionalDMGOptionsUndefined: Self = StObject.set(x, "additionalDMGOptions", js.undefined)
      
      inline def setAppPath(value: String): Self = StObject.set(x, "appPath", value.asInstanceOf[js.Any])
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setFormat(value: UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait CreateOptions extends StObject {
    
    /**
      * Additional options to pass through to [`appdmg`](https://npm.im/appdmg).
      * You can use this to set additional features like `background-color` and `code-sign`.
      * See the docs of the `appdmg` module for all possible options.
      */
    var additionalDMGOptions: js.UndefOr[PartialSpecification] = js.undefined
    
    /**
      * The `.app` directory generated by
      * [electron-packager](https://github.com/electron-userland/electron-packager).
      */
    var appPath: String
    
    /** Path to the background for the DMG window. Background image should be of size 658×498. */
    var background: js.UndefOr[String] = js.undefined
    
    /**
      * The content that will appear in the window when user opens the .dmg file.
      * [Default: Array of two icons, application and application destination folder].
      */
    var contents: js.UndefOr[
        js.Array[Content] | (js.Function1[/* opts */ ContentsOptions, js.Array[Content]])
      ] = js.undefined
    
    /** Enable debug message output. */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /** Disk image format. [Default: `UDZO`]. */
    var format: js.UndefOr[UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO] = js.undefined
    
    /** Path to the icon to use for the app in the DMG window. */
    var icon: js.UndefOr[String] = js.undefined
    
    /** How big to make the icon for the app in the DMG. [Default: `80`]. */
    var iconSize: js.UndefOr[Double] = js.undefined
    
    /** The application name. */
    var name: String
    
    /** The directory to put the DMG into. [Default: `process.cwd()`]. */
    var out: js.UndefOr[String] = js.undefined
    
    /** Overwrite an existing DMG file if if already exists. */
    var overwrite: js.UndefOr[Boolean] = js.undefined
    
    /** The title of the produced DMG, which will be shown when mounted. */
    var title: js.UndefOr[String] = js.undefined
  }
  object CreateOptions {
    
    inline def apply(appPath: String, name: String): CreateOptions = {
      val __obj = js.Dynamic.literal(appPath = appPath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateOptions] (val x: Self) extends AnyVal {
      
      inline def setAdditionalDMGOptions(value: PartialSpecification): Self = StObject.set(x, "additionalDMGOptions", value.asInstanceOf[js.Any])
      
      inline def setAdditionalDMGOptionsUndefined: Self = StObject.set(x, "additionalDMGOptions", js.undefined)
      
      inline def setAppPath(value: String): Self = StObject.set(x, "appPath", value.asInstanceOf[js.Any])
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setContents(value: js.Array[Content] | (js.Function1[/* opts */ ContentsOptions, js.Array[Content]])): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setContentsFunction1(value: /* opts */ ContentsOptions => js.Array[Content]): Self = StObject.set(x, "contents", js.Any.fromFunction1(value))
      
      inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
      
      inline def setContentsVarargs(value: Content*): Self = StObject.set(x, "contents", js.Array(value*))
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setFormat(value: UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
