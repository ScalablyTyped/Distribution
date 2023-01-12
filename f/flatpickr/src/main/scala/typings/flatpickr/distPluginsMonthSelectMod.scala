package typings.flatpickr

import typings.flatpickr.anon.PartialConfig
import typings.flatpickr.distTypesGlobalsMod.global.Date
import typings.flatpickr.distTypesOptionsMod.Plugin
import typings.std.AddEventListenerOptions
import typings.std.Element
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginsMonthSelectMod {
  
  @JSImport("flatpickr/dist/plugins/monthSelect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Plugin[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Plugin[js.Object]]
  inline def default(pluginConfig: PartialConfig): Plugin[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(pluginConfig.asInstanceOf[js.Any]).asInstanceOf[Plugin[js.Object]]
  
  trait Config extends StObject {
    
    var _stubbedCurrentMonth: js.UndefOr[Double] = js.undefined
    
    var altFormat: String
    
    var dateFormat: String
    
    var shorthand: Boolean
    
    var theme: String
  }
  object Config {
    
    inline def apply(altFormat: String, dateFormat: String, shorthand: Boolean, theme: String): Config = {
      val __obj = js.Dynamic.literal(altFormat = altFormat.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setAltFormat(value: String): Self = StObject.set(x, "altFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setShorthand(value: Boolean): Self = StObject.set(x, "shorthand", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def set_stubbedCurrentMonth(value: Double): Self = StObject.set(x, "_stubbedCurrentMonth", value.asInstanceOf[js.Any])
      
      inline def set_stubbedCurrentMonthUndefined: Self = StObject.set(x, "_stubbedCurrentMonth", js.undefined)
    }
  }
  
  @js.native
  trait ElementDate
    extends StObject
       with Element {
    
    var dateObj: Date = js.native
  }
  
  @js.native
  trait MonthElement
    extends StObject
       with HTMLSpanElement {
    
    @JSName("$i")
    var $i: Double = js.native
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var dateObj: Date = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
}
