package typings.gauge

import org.scalablytyped.runtime.Instantiable3
import typings.gauge.libPlumbingMod.default
import typings.gauge.libThemesMod.ThemeName
import typings.gauge.libThemesMod.ThemeObject
import typings.gauge.libThemesMod.ThemeOpts
import typings.gauge.templateMod.Status
import typings.gauge.templateMod.Template
import typings.gauge.templateMod.TemplateObject
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This is the typical interface to the module– it provides a pretty
    * fire-and-forget interface to displaying your status information.
    * @see {@link https://github.com/npm/gauge#the-gauge-class}
    */
  @JSImport("gauge", JSImport.Namespace)
  @js.native
  /**
    * Constructs a new gauge. Gauges are drawn on a single line, and are not
    * drawn if stream isn't a tty and a tty isn't explicitly provided.
    * @param options - An option object.
    * @param stream - A stream that progress bar updates are to be written to. Gauge honors backpressure and will pause most writing if it is indicated. (default STDERR)
    */
  open class ^[T /* <: Options | Stream */] ()
    extends StObject
       with Gauge[T] {
    def this(options: T) = this()
    def this(
      options: T,
      stream: /* import warning: importer.ImportType#apply Failed type conversion: T extends gauge.gauge.Options ? node.stream.Stream : gauge.gauge.Options */ js.Any
    ) = this()
    def this(
      options: Unit,
      stream: /* import warning: importer.ImportType#apply Failed type conversion: T extends gauge.gauge.Options ? node.stream.Stream : gauge.gauge.Options */ js.Any
    ) = this()
  }
  
  @JSImport("gauge", "Plumbing")
  @js.native
  open class Plumbing protected () extends default {
    /**
      * @param theme - The theme to use.
      * @param template - The template to use.
      * @param width - How wide your gauge should be.
      */
    def this(theme: ThemeName, template: Template, width: Double) = this()
    def this(theme: ThemeObject, template: Template, width: Double) = this()
    def this(theme: ThemeOpts, template: Template, width: Double) = this()
  }
  
  @JSImport("gauge", "Themes")
  @js.native
  val Themes: typings.gauge.libThemesMod.Themes = js.native
  
  /**
    * This is the typical interface to the module– it provides a pretty
    * fire-and-forget interface to displaying your status information.
    * @see {@link https://github.com/npm/gauge#the-gauge-class}
    */
  @js.native
  trait Gauge[T /* <: Options | Stream */] extends StObject {
    
    /**
      * Hides the gauge and ignores further calls to `show` or `pulse`.
      */
    def disable(): Unit = js.native
    
    /**
      * Shows the gauge and resumes updating when `show` or `pulse` is called.
      */
    def enable(): Unit = js.native
    
    /**
      * Removes the gauge from the terminal.
      *
      * @remarks
      * Optionally, takes argument callback `cb` that is called after IO has had an
      * opportunity to happen (currently this just means after `setImmediate` has
      * called back). It turns out this is important when you're pausing the
      * progress bar on one filehandle and printing to another– otherwise (with a
      * big enough print) node can end up printing the "end progress bar" bits to
      * the progress bar filehandle while other stuff is printing to another
      * filehandle. These getting interleaved can cause corruption in some
      * terminals.
      */
    def hide(): Unit = js.native
    def hide(cb: js.Function0[Unit]): Unit = js.native
    
    /**
      * Returns `true` if the gauge is enabled.
      */
    def isEnabled(): Boolean = js.native
    
    /**
      * Spins the spinner in the gauge to show output. If `subsection` is included
      * then it will be combined with the last name passed to `gauge.show`.
      */
    def pulse(): Unit = js.native
    def pulse(subsection: String): Unit = js.native
    
    /**
      * Change the active template, will be displayed with the next `show` or `pulse`.
      */
    def setTemplate(template: Template): Unit = js.native
    
    /**
      * Change the active theme, will be displayed with the next `show` or `pulse`.
      */
    def setTheme[T /* <: ThemeName | ThemeObject | ThemeOpts */](
      theme: /* import warning: importer.ImportType#apply Failed type conversion: T extends string ? gauge.gauge/lib/themes.ThemeName : T */ js.Any
    ): Unit = js.native
    
    /**
      * Change the themeset to select a theme from. The same as the `themes` option
      * used in the constructor. The theme will be reselected from this themeset.
      */
    def setThemeset(themes: typings.gauge.libThemesMod.Themes): Unit = js.native
    
    /**
      * The first argument is either the section, the name of the current thing
      * contributing to progress, or an object with keys like section, subsection &
      * completed (or any others you have types for in a custom template). If you
      * don't want to update or set any of these you can pass `null` and it will be
      * ignored.
      *
      * The second argument is the percent completed as a value between 0 and 1.
      * Without it, completion is just not updated. You'll also note that
      * completion can be passed in as part of a status object as the first
      * argument. If both it and the completed argument are passed in, the
      * completed argument wins.
      */
    def show(): Unit = js.native
    def show(status: String): Unit = js.native
    def show(status: String, completed: Double): Unit = js.native
    def show(status: Null, completed: Double): Unit = js.native
    def show(status: Status): Unit = js.native
    def show(status: Status, completed: Double): Unit = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * The class to use to actually generate the gauge for printing. Ordinarily
      * you shouldn't need to override this.
      * @defaultValue `require('gauge/plumbing')`
      * @see {@link https://github.com/npm/gauge#plumbing}
      */
    var Plumbing: js.UndefOr[
        Instantiable3[
          /* theme */ ThemeName | ThemeObject | ThemeOpts, 
          /* template */ Template, 
          /* width */ Double, 
          default
        ]
      ] = js.undefined
    
    /**
      * Ordinarily an exit handler is registered to make sure the cursor is turned
      * back on and the progress bar erased when the process exits, even if you
      * Ctrl-C out or otherwise exit unexpectedly. You can disable this and it
      * won't register the exit handler.
      * @defaultValue `true`
      */
    var cleanupOnExit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true the gauge starts enabled. If disabled then all update commands are
      * ignored and no gauge will be printed until you call .enable().
      * @defaultValue `true` if tty is a TTY, `false` otherwise
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When this is true a timer is created to trigger once every updateInterval
      * ms, when false, updates are printed as soon as they come in but updates
      * more often than updateInterval are ignored.
      * @defaultValue `true`
      */
    var fixedFramerate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, then the cursor will be hidden while the gauge is displayed.
      * @defaultValue `true`
      */
    var hideCursor: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A template is an array of objects and strings that, after being evaluated,
      * will be turned into the gauge line. The various template elements can
      * either be plain strings, in which case they will be be included verbatum in
      * the output, or a `Template` object.
      * @defaultValue The default is what npm uses.
      * @see {@link https://github.com/npm/gauge#templates}
      */
    var template: js.UndefOr[Template] = js.undefined
    
    /**
      * Select a theme for use. Possible values:
      * - Theme object, in which case the `themes` is not used.
      * - The name of a theme, which will be looked up in the current `themes` object.
      * - A configuration object with any of `hasUnicode`, `hasColor`, or `platform` keys.
      * @defaultValue picked using a combination of best guesses at current OS, color support, and unicode support
      */
    var theme: js.UndefOr[ThemeName | ThemeObject | ThemeOpts] = js.undefined
    
    /**
      * A themeset to use when selecting the theme to use.
      * @defaultValue `require('gauge/themes')`
      * @see {@link https://github.com/npm/gauge#themes}
      */
    var themes: js.UndefOr[typings.gauge.libThemesMod.Themes] = js.undefined
    
    /**
      * The tty that you're ultimately writing to. This is used for detecting the
      * width of the terminal and resizes. The width used is tty.columns - 1. If no
      * tty is available then a width of 79 is assumed.
      * @defaultValue the same as stream
      */
    var tty: js.UndefOr[Stream] = js.undefined
    
    /**
      * How often gauge updates should be drawn, in milliseconds.
      * @defaultValue `50`
      */
    var updateInterval: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCleanupOnExit(value: Boolean): Self = StObject.set(x, "cleanupOnExit", value.asInstanceOf[js.Any])
      
      inline def setCleanupOnExitUndefined: Self = StObject.set(x, "cleanupOnExit", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFixedFramerate(value: Boolean): Self = StObject.set(x, "fixedFramerate", value.asInstanceOf[js.Any])
      
      inline def setFixedFramerateUndefined: Self = StObject.set(x, "fixedFramerate", js.undefined)
      
      inline def setHideCursor(value: Boolean): Self = StObject.set(x, "hideCursor", value.asInstanceOf[js.Any])
      
      inline def setHideCursorUndefined: Self = StObject.set(x, "hideCursor", js.undefined)
      
      inline def setPlumbing(
        value: Instantiable3[
              /* theme */ ThemeName | ThemeObject | ThemeOpts, 
              /* template */ Template, 
              /* width */ Double, 
              default
            ]
      ): Self = StObject.set(x, "Plumbing", value.asInstanceOf[js.Any])
      
      inline def setPlumbingUndefined: Self = StObject.set(x, "Plumbing", js.undefined)
      
      inline def setTemplate(value: Template): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTemplateVarargs(value: (String | TemplateObject)*): Self = StObject.set(x, "template", js.Array(value*))
      
      inline def setTheme(value: ThemeName | ThemeObject | ThemeOpts): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setThemes(value: typings.gauge.libThemesMod.Themes): Self = StObject.set(x, "themes", value.asInstanceOf[js.Any])
      
      inline def setThemesUndefined: Self = StObject.set(x, "themes", js.undefined)
      
      inline def setTty(value: Stream): Self = StObject.set(x, "tty", value.asInstanceOf[js.Any])
      
      inline def setTtyUndefined: Self = StObject.set(x, "tty", js.undefined)
      
      inline def setUpdateInterval(value: Double): Self = StObject.set(x, "updateInterval", value.asInstanceOf[js.Any])
      
      inline def setUpdateIntervalUndefined: Self = StObject.set(x, "updateInterval", js.undefined)
    }
  }
  
  type TemplateEntry = String | TemplateObject
}
