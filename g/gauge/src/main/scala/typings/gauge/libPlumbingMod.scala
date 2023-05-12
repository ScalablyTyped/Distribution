package typings.gauge

import typings.gauge.libThemesMod.ThemeName
import typings.gauge.libThemesMod.ThemeObject
import typings.gauge.libThemesMod.ThemeOpts
import typings.gauge.templateMod.Status
import typings.gauge.templateMod.Template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlumbingMod {
  
  @JSImport("gauge/lib/plumbing", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Plumbing {
    /**
      * @param theme - The theme to use.
      * @param template - The template to use.
      * @param width - How wide your gauge should be.
      */
    def this(theme: ThemeName, template: Template, width: Double) = this()
    def this(theme: ThemeObject, template: Template, width: Double) = this()
    def this(theme: ThemeOpts, template: Template, width: Double) = this()
  }
  
  @js.native
  trait Plumbing extends StObject {
    
    /**
      * Return the string necessary to hide the progress bar.
      */
    def hide(): String = js.native
    
    /**
      * Return a string to hide the cursor.
      */
    def hideCursor(): String = js.native
    
    /**
      * Change the active template.
      */
    def setTemplate(template: Template): Unit = js.native
    
    /**
      * Change the active theme.
      */
    def setTheme(theme: ThemeName): Unit = js.native
    def setTheme(theme: ThemeObject): Unit = js.native
    def setTheme(theme: ThemeOpts): Unit = js.native
    
    /**
      * Change the width to render at.
      */
    def setWidth(width: Double): Unit = js.native
    
    /**
      * Using `status` for values, render the provided template with the theme and
      * return a string that is suitable for printing to update the gauge.
      */
    def show(status: Status): String = js.native
    
    /**
      * Return a string to show the cursor.
      */
    def showCursor(): String = js.native
  }
}
