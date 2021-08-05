package typings.fullcalendarVue

import typings.fullcalendarVue.optionsMod.CalendarProps
import typings.vue.optionsMod.Component
import typings.vue.vueMod.Vue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fullcalendar/vue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fullcalendar/vue", JSImport.Default)
  @js.native
  val default: Component[js.Any, js.Any, js.Any, CalendarProps] = js.native
  
  inline def install(Vue: js.Function0[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(Vue.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait FullCalendarComponent
    extends StObject
       with Vue {
    
    def buildCalendarOptions(): Unit = js.native
    
    def getApi(): js.Any = js.native
    
    def recordDirtyOption(optionName: js.Any, newVal: js.Any): Unit = js.native
    
    def renderDirty(): Unit = js.native
  }
}
