package typings.fullcalendarVue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fullcalendar/vue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fullcalendar/vue", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_vue.ExtendedVue<Vue<Record<string, any>, Record<string, any>, never, never, (event : string, args : ...any): Vue<Record<string, any>, Record<string, any>, never, never, any>>, {  renderId :number,   customRenderingMap :Map<string, CustomRendering<any>>}, {getApi (): Calendar, buildOptions (suppliedOptions : CalendarOptions | undefined): CalendarOptions}, unknown, {  options :CalendarOptions}, {}, imported_v3-component-options.ComponentOptionsMixin, imported_v3-component-options.ComponentOptionsMixin> */ Any = js.native
  
  inline def install(
    Vue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(Vue.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
