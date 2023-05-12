package typings.fullcalendarMultimonth

import org.scalablytyped.runtime.Shortcut
import typings.std.NumberConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  //# sourceMappingURL=ambient.d.ts.map
  @JSImport("@fullcalendar/multimonth", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginDef */ Any = js.native
  
  trait ExtraOptionRefiners extends StObject {
    
    /* standard es5 */
    def multiMonthMaxColumns(): Double
    def multiMonthMaxColumns(value: Any): Double
    @JSName("multiMonthMaxColumns")
    var multiMonthMaxColumns_Original: NumberConstructor
    
    /* standard es5 */
    def multiMonthMinWidth(): Double
    def multiMonthMinWidth(value: Any): Double
    @JSName("multiMonthMinWidth")
    var multiMonthMinWidth_Original: NumberConstructor
  }
  object ExtraOptionRefiners {
    
    inline def apply(multiMonthMaxColumns: NumberConstructor, multiMonthMinWidth: NumberConstructor): ExtraOptionRefiners = {
      val __obj = js.Dynamic.literal(multiMonthMaxColumns = multiMonthMaxColumns.asInstanceOf[js.Any], multiMonthMinWidth = multiMonthMinWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtraOptionRefiners]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtraOptionRefiners] (val x: Self) extends AnyVal {
      
      inline def setMultiMonthMaxColumns(value: NumberConstructor): Self = StObject.set(x, "multiMonthMaxColumns", value.asInstanceOf[js.Any])
      
      inline def setMultiMonthMinWidth(value: NumberConstructor): Self = StObject.set(x, "multiMonthMinWidth", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginDef */ Any
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginDef */ Any = default
  
  /* augmented module */
  object fullcalendarCoreInternalAugmentingMod {
    
    type BaseOptionRefiners = ExtraOptionRefiners
  }
}
