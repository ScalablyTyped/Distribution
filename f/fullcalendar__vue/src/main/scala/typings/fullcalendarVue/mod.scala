package typings.fullcalendarVue

import typings.fullcalendarVue.optionsMod.CalendarProps
import typings.vue.optionsMod.Component
import typings.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/vue", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val default: Component[js.Any, js.Any, js.Any, CalendarProps] = js.native
  
  def install(Vue: js.Function0[_]): Unit = js.native
  
  @js.native
  trait FullCalendarComponent extends Vue {
    
    def buildCalendarOptions(): Unit = js.native
    
    def getApi(): js.Any = js.native
    
    def recordDirtyOption(optionName: js.Any, newVal: js.Any): Unit = js.native
    
    def renderDirty(): Unit = js.native
  }
}
