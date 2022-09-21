package typings.floreal

import typings.floreal.dateMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("floreal", "Date")
  @js.native
  open class Date () extends ^ {
    def this(value: String) = this()
    def this(value: js.Date) = this()
    def this(value: Double) = this()
  }
  object Date {
    
    @JSImport("floreal", "Date")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("floreal", "Date.day_names")
    @js.native
    def dayNames: js.Array[String] = js.native
    
    inline def dayNames_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("day_names")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def firstDayOfYear(year: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("first_day_of_year")(year.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
}
