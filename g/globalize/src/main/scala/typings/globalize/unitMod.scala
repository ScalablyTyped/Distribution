package typings.globalize

import org.scalablytyped.runtime.Shortcut
import typings.cldrjs.mod.CldrStatic
import typings.globalize.globalizeMod.Shared
import typings.globalize.globalizeMod.Static
import typings.globalize.globalizeStrings.long
import typings.globalize.globalizeStrings.narrow
import typings.globalize.globalizeStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unitMod extends Shortcut {
  
  @JSImport("globalize/dist/globalize/unit", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Static = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("globalize/dist/globalize/unit", JSImport.Namespace)
  @js.native
  class Class protected ()
    extends StObject
       with Shared {
    /**
      * Create a Globalize instance.
      * @param cldr Cldr instance of the instance.
      * @returns {Globalize} A Globalize instance
      */
    def this(cldr: CldrStatic) = this()
    /**
      * Create a Globalize instance.
      * @param {string} Locale string of the instance.
      * @returns {Globalize} A Globalize instance
      */
    def this(locale: String) = this()
  }
  
  type _To = js.Object & Static
  
  /* This means you don't have to write `^`, but can instead just say `unitMod.foo` */
  override def _to: js.Object & Static = ^
  
  /* augmented module */
  object globalizeDistGlobalizeAugmentingMod {
    
    @js.native
    trait Shared extends StObject {
      
      /**
        * Alias for .unitFormatter( unit, options )( value ).
        * @param {number} value The number to be formatted.
        * @param {string} unit String value indicating the unit to be formatted. eg. "day", "week", "month", etc. Could also be a compound unit, eg. "mile-per-hour" or "mile/hour"
        * @param {UnitFormatterOptions} options form: [String] eg. "long", "short" or "narrow".
        * @returns {string} Returns the unit formatted.
        */
      def formatUnit(value: Double, unit: String): String = js.native
      def formatUnit(value: Double, unit: String, options: UnitFormatterOptions): String = js.native
      
      /**
        * Returns a function that formats a unit according to the given unit, options, and the default/instance locale.
        * The returned function is invoked with one argument: the number value to be formatted.
        * @param unit String value indicating the unit to be formatted. eg. "day", "week", "month", etc. Could also be a compound unit, eg. "mile-per-hour" or "mile/hour"
        * @param options form: [String] eg. "long", "short" or "narrow".
        * @returns {Function} Returns a function that formats a unit according to the given unit, options, and the default/instance locale.
        */
      def unitFormatter(unit: String): js.Function1[/* value */ Double, String] = js.native
      def unitFormatter(unit: String, options: UnitFormatterOptions): js.Function1[/* value */ Double, String] = js.native
    }
    
    trait UnitFormatterOptions extends StObject {
      
      /**
        * form: [String] eg. "long", "short" or "narrow".
        */
      var form: js.UndefOr[long | short | narrow] = js.undefined
      
      /**
        * numberFormatter: [Function] a number formatter function. Defaults to Globalize .numberFormatter() for the current locale using the default options.
        */
      var numberFormatter: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberFormatterOptions */ js.Any
          ] = js.undefined
    }
    object UnitFormatterOptions {
      
      inline def apply(): UnitFormatterOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UnitFormatterOptions]
      }
      
      extension [Self <: UnitFormatterOptions](x: Self) {
        
        inline def setForm(value: long | short | narrow): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
        
        inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
        
        inline def setNumberFormatter(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberFormatterOptions */ js.Any
        ): Self = StObject.set(x, "numberFormatter", value.asInstanceOf[js.Any])
        
        inline def setNumberFormatterUndefined: Self = StObject.set(x, "numberFormatter", js.undefined)
      }
    }
  }
}
