package typings.floreal

import typings.floreal.dateMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("floreal", "Date")
  @js.native
  class Date () extends ^ {
    def this(value: String) = this()
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
    
    @scala.inline
    def dayNames_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("day_names")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("floreal", "Date.first_day_of_year")
    @js.native
    def firstDayOfYear(year: js.Any): js.Any = js.native
  }
}
