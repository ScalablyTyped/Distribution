package typings.gauge

import org.scalablytyped.runtime.Shortcut
import typings.gauge.anon.ActivityIndicatorTheme
import typings.gauge.anon.Darwin
import typings.gauge.gaugeStrings.ASCII
import typings.gauge.gaugeStrings.brailleSpinner
import typings.gauge.gaugeStrings.colorASCII
import typings.gauge.gaugeStrings.colorBrailleSpinner
import typings.gauge.gaugeStrings.fallback
import typings.gauge.templateMod.LiteralUnion
import typings.gauge.templateMod.Primitive
import typings.gauge.templateMod.Status
import typings.node.processMod.global.NodeJS.Platform
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libThemesMod extends Shortcut {
  
  @JSImport("gauge/lib/themes", JSImport.Default)
  @js.native
  val default: Themes = js.native
  
  trait SetDefaultOpts extends StObject {
    
    /**
      * If your theme uses color you should set this to true.
      * @defaultValue `false`
      */
    var hasColor: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If your theme uses unicode you should set this to true.
      * @defaultValue `false`
      */
    var hasUnicode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If your theme is platform specific, specify that here with the platform
      * from process.platform, eg, `win32`, `darwin`, etc
      * @defaultValue `fallback`
      */
    var platform: js.UndefOr[Platform | fallback] = js.undefined
  }
  object SetDefaultOpts {
    
    inline def apply(): SetDefaultOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetDefaultOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetDefaultOpts] (val x: Self) extends AnyVal {
      
      inline def setHasColor(value: Boolean): Self = StObject.set(x, "hasColor", value.asInstanceOf[js.Any])
      
      inline def setHasColorUndefined: Self = StObject.set(x, "hasColor", js.undefined)
      
      inline def setHasUnicode(value: Boolean): Self = StObject.set(x, "hasUnicode", value.asInstanceOf[js.Any])
      
      inline def setHasUnicodeUndefined: Self = StObject.set(x, "hasUnicode", js.undefined)
      
      inline def setPlatform(value: Platform | fallback): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    }
  }
  
  /**
    * @param values - an object with values provided via `gauge.show`.
    * @param theme - the theme specific to this item or this theme object.
    * @param width - the number of characters wide your result should be.
    */
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ThemeFn = (values : gauge.gauge/template.Status, theme : gauge.gauge/lib/themes.ThemeObject, width : number): gauge.gauge/lib/themes.ThemeObject
  }}}
  to avoid circular code involving: 
  - gauge.gauge/lib/themes.ThemeFn
  - gauge.gauge/lib/themes.ThemeObject
  */
  @js.native
  trait ThemeFn extends StObject {
    
    def apply(values: Status, theme: ThemeObject, width: Double): ThemeObject = js.native
  }
  
  type ThemeName = LiteralUnion[ASCII | colorASCII | brailleSpinner | colorBrailleSpinner, String]
  
  type ThemeObject = (Record[String, Primitive | ThemeFn]) & ActivityIndicatorTheme
  
  trait ThemeOpts extends StObject {
    
    /**
      * If true, fetch a color theme, if no color theme is available a non-color
      * theme will be used.
      */
    var hasColor: Boolean
    
    /**
      * If true, fetch a unicode theme, if no unicode theme is available then a
      * non-unicode theme will be used.
      */
    var hasUnicode: Boolean
    
    /**
      * If no platform match is available then `fallback` is used instead.
      * @defaultValue `process.platform`
      */
    var platform: js.UndefOr[Platform] = js.undefined
  }
  object ThemeOpts {
    
    inline def apply(hasColor: Boolean, hasUnicode: Boolean): ThemeOpts = {
      val __obj = js.Dynamic.literal(hasColor = hasColor.asInstanceOf[js.Any], hasUnicode = hasUnicode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThemeOpts] (val x: Self) extends AnyVal {
      
      inline def setHasColor(value: Boolean): Self = StObject.set(x, "hasColor", value.asInstanceOf[js.Any])
      
      inline def setHasUnicode(value: Boolean): Self = StObject.set(x, "hasUnicode", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    }
  }
  
  @js.native
  trait Themes extends StObject {
    
    def apply(): ThemeObject = js.native
    def apply(opts: ThemeOpts): ThemeObject = js.native
    
    /**
      * Adds a named theme to the themeset. You can pass in either a theme object,
      * as returned by `themes.newTheme` or the arguments you'd pass to
      * `themes.newTheme`.
      */
    def addTheme(themeName: ThemeName, themeObj: ThemeObject): Unit = js.native
    def addTheme(themeName: ThemeName, themeObj: ThemeObject, newTheme: ThemeObject): Unit = js.native
    
    /**
      * This mixes-in `theme` into all themes currently defined. It also adds it to
      * the default parent theme for this themeset, so future themes added to this
      * themeset will get the values from `theme` by default.
      */
    def addToAllThemes(theme: ThemeObject): Unit = js.native
    
    var baseTheme: ThemeObject = js.native
    
    var defaults: Darwin = js.native
    
    /**
      * Theme objects are a function that fetches the default theme based on
      * platform, unicode, and color support. If no compatible theme can be found
      * then an error will be thrown with a `code` of `EMISSINGTHEME`.
      */
    def getDefault(): ThemeObject = js.native
    def getDefault(opts: ThemeOpts): ThemeObject = js.native
    
    /**
      * Returns the theme object from this theme set named `name`. If `name` does not
      * exist in this themeset an error will be thrown with a code of
      * `EMISSINGTHEME`.
      */
    def getTheme(name: ThemeName): ThemeObject = js.native
    
    /**
      * Return a list of all of the names of the themes in this themeset. Suitable
      * for use in `themes.getTheme(…)`.
      */
    def getThemeNames(): js.Array[ThemeName] = js.native
    
    /**
      * Create a new theme object based on `parentTheme`. If no `parentTheme` is
      * provided then a minimal parentTheme that defines functions for rendering
      * the activity indicator (spinner) and progress bar will be defined. (This
      * fallback parent is defined in `gauge/base-theme`.)
      */
    def newTheme(parentTheme: ThemeObject): ThemeObject = js.native
    def newTheme(parentTheme: ThemeObject, newTheme: ThemeObject): ThemeObject = js.native
    
    /**
      * Copy the current themeset into a new one. This allows you to easily inherit
      * one themeset from another.
      */
    def newThemeSet(): Themes = js.native
    
    /**
      * @param opts - an object with the following properties: `platform`, `hasUnicode`, `hasColor`
      * @param themeName - the name of the theme (as given to `addTheme`) to use for this set of `opts`.
      */
    def setDefault[T /* <: SetDefaultOpts | ThemeName */](opts: T): Unit = js.native
    def setDefault[T /* <: SetDefaultOpts | ThemeName */](
      opts: T,
      themeName: /* import warning: importer.ImportType#apply Failed type conversion: T extends gauge.gauge/lib/themes.SetDefaultOpts ? gauge.gauge/lib/themes.ThemeName : never */ js.Any
    ): Unit = js.native
    
    var themes: Record[ThemeName, ThemeObject] = js.native
  }
  
  type _To = Themes
  
  /* This means you don't have to write `default`, but can instead just say `libThemesMod.foo` */
  override def _to: Themes = default
}
