package typings.fullcalendarVue

import org.scalablytyped.runtime.Shortcut
import typings.fullcalendarVue.optionsMod.CalendarProps
import typings.vue.optionsMod.Component
import typings.vue.vueMod.Vue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@fullcalendar/vue", JSImport.Default)
  @js.native
  val default: Component[js.Any, js.Any, js.Any, CalendarProps] = js.native
  
  @JSImport("@fullcalendar/vue", "install")
  @js.native
  def install(Vue: js.Function0[_]): Unit = js.native
  
  @js.native
  trait FullCalendarComponent extends Vue {
    
    def buildCalendarOptions(): Unit = js.native
    
    def getApi(): js.Any = js.native
    
    def recordDirtyOption(optionName: js.Any, newVal: js.Any): Unit = js.native
    
    def renderDirty(): Unit = js.native
  }
  
  type _To = Component[js.Any, js.Any, js.Any, CalendarProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Component[js.Any, js.Any, js.Any, CalendarProps] = default
}
