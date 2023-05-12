package typings.fullcalendarList

import typings.fullcalendarList.anon.DateHeaderIdRoot
import typings.preact.mod.createElement.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalCommonMod {
  
  @JSImport("@fullcalendar/list/internal-common", "L")
  @js.native
  open class L ()
    extends StObject
       with ListView
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateComponent<ViewProps> * / any */ @js.native
  trait ListView extends StObject {
    
    def _eventStoreToSegs(
      eventStore: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventStore */ Any,
      eventUiBases: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventUiHash */ Any,
      dayRanges: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateRange */ Any
        ]
    ): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Seg */ Any
      ] = js.native
    
    /* private */ var computeDateVars: Any = js.native
    
    def eventRangeToSegs(
      eventRange: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventRenderRange */ Any,
      dayRanges: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateRange */ Any
        ]
    ): js.Array[Any] = js.native
    
    def eventRangesToSegs(
      eventRanges: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventRenderRange */ Any
        ],
      dayRanges: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateRange */ Any
        ]
    ): js.Array[Any] = js.native
    
    /* private */ var eventStoreToSegs: Any = js.native
    
    def render(): Element = js.native
    
    def renderEmptyMessage(): Element = js.native
    
    def renderSegList(
      allSegs: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Seg */ Any
        ],
      dayDates: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateMarker */ Any
        ]
    ): Element = js.native
    
    def setRootEl(): Unit = js.native
    def setRootEl(rootEl: HTMLElement): Unit = js.native
    
    var state: DateHeaderIdRoot = js.native
  }
  
  trait NoEventsContentArg extends StObject {
    
    var text: String
    
    var view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewApi */ Any
  }
  object NoEventsContentArg {
    
    inline def apply(
      text: String,
      view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewApi */ Any
    ): NoEventsContentArg = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoEventsContentArg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NoEventsContentArg] (val x: Self) extends AnyVal {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setView(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewApi */ Any
      ): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  type NoEventsMountArg = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MountArg<NoEventsContentArg> */ Any
}
