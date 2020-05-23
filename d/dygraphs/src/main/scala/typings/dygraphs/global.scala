package typings.dygraphs

import typings.dygraphs.anon.ErrorPlotter
import typings.dygraphs.dygraphs.Data
import typings.dygraphs.dygraphs.Options
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Dygraph protected ()
    extends typings.dygraphs.Dygraph {
    def this(container: String, data: js.Function0[Data]) = this()
    def this(container: String, data: Data) = this()
    def this(container: HTMLElement, data: js.Function0[Data]) = this()
    def this(container: HTMLElement, data: Data) = this()
    def this(container: String, data: js.Function0[Data], options: Options) = this()
    def this(container: String, data: Data, options: Options) = this()
    def this(container: HTMLElement, data: js.Function0[Data], options: Options) = this()
    def this(container: HTMLElement, data: Data, options: Options) = this()
  }
  
  /* static members */
  @js.native
  object Dygraph extends js.Object {
    var ANNUAL: Double = js.native
    var BIANNUAL: Double = js.native
    var CENTENNIAL: Double = js.native
    var DAILY: Double = js.native
    var DASHED_LINE: js.Array[Double] = js.native
    var DECADAL: Double = js.native
    var DOTTED_LINE: js.Array[Double] = js.native
    var DOT_DASH_LINE: js.Array[Double] = js.native
    var FIVE_MINUTELY: Double = js.native
    var FIVE_SECONDLY: Double = js.native
    var HOURLY: Double = js.native
    var MINUTELY: Double = js.native
    var MONTHLY: Double = js.native
    var NUM_GRANULARITIES: Double = js.native
    var Plotters: ErrorPlotter = js.native
    var QUARTERLY: Double = js.native
    // Tick granularities (passed to ticker).
    var SECONDLY: Double = js.native
    var SIX_HOURLY: Double = js.native
    var TEN_MINUTELY: Double = js.native
    var TEN_SECONDLY: Double = js.native
    var THIRTY_MINUTELY: Double = js.native
    var THIRTY_SECONDLY: Double = js.native
    var TWO_DAILY: Double = js.native
    var TWO_HOURLY: Double = js.native
    var TWO_MINUTELY: Double = js.native
    var TWO_SECONDLY: Double = js.native
    var WEEKLY: Double = js.native
    var defaultInteractionModel: js.Any = js.native
  }
  
}

