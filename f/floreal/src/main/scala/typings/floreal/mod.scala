package typings.floreal

import typings.floreal.dateMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("floreal", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Date () extends ^ {
    def this(value: String) = this()
    def this(value: Double) = this()
  }
  
  /* static members */
  @js.native
  object Date extends js.Object {
    var day_names: js.Array[String] = js.native
    def first_day_of_year(year: js.Any): js.Any = js.native
  }
  
}

