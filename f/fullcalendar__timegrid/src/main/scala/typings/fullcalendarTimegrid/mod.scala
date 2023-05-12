package typings.fullcalendarTimegrid

import org.scalablytyped.runtime.Shortcut
import typings.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  //# sourceMappingURL=ambient.d.ts.map
  @JSImport("@fullcalendar/timegrid", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginDef */ Any = js.native
  
  trait ExtraOptionRefiners extends StObject {
    
    /* standard es5 */
    def allDaySlot[T](): Boolean
    def allDaySlot[T](value: T): Boolean
    @JSName("allDaySlot")
    var allDaySlot_Original: BooleanConstructor
  }
  object ExtraOptionRefiners {
    
    inline def apply(allDaySlot: BooleanConstructor): ExtraOptionRefiners = {
      val __obj = js.Dynamic.literal(allDaySlot = allDaySlot.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtraOptionRefiners]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtraOptionRefiners] (val x: Self) extends AnyVal {
      
      inline def setAllDaySlot(value: BooleanConstructor): Self = StObject.set(x, "allDaySlot", value.asInstanceOf[js.Any])
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
