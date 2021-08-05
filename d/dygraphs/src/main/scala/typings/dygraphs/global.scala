package typings.dygraphs

import typings.dygraphs.dygraphs.Data
import typings.dygraphs.dygraphs.Options
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Dygraph")
  @js.native
  class Dygraph protected ()
    extends StObject
       with typings.dygraphs.Dygraph {
    def this(container: String, data: js.Function0[Data]) = this()
    def this(container: String, data: Data) = this()
    def this(container: HTMLElement, data: js.Function0[Data]) = this()
    def this(container: HTMLElement, data: Data) = this()
    def this(container: String, data: js.Function0[Data], options: Options) = this()
    def this(container: String, data: Data, options: Options) = this()
    def this(container: HTMLElement, data: js.Function0[Data], options: Options) = this()
    def this(container: HTMLElement, data: Data, options: Options) = this()
  }
  object Dygraph {
    
    @JSGlobal("Dygraph")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Dygraph.ANNUAL")
    @js.native
    def ANNUAL: Double = js.native
    inline def ANNUAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANNUAL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.BIANNUAL")
    @js.native
    def BIANNUAL: Double = js.native
    inline def BIANNUAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BIANNUAL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.CENTENNIAL")
    @js.native
    def CENTENNIAL: Double = js.native
    inline def CENTENNIAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CENTENNIAL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.DAILY")
    @js.native
    def DAILY: Double = js.native
    inline def DAILY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DAILY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.DASHED_LINE")
    @js.native
    def DASHED_LINE: js.Array[Double] = js.native
    inline def DASHED_LINE_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DASHED_LINE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.DECADAL")
    @js.native
    def DECADAL: Double = js.native
    inline def DECADAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DECADAL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.DOTTED_LINE")
    @js.native
    def DOTTED_LINE: js.Array[Double] = js.native
    inline def DOTTED_LINE_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOTTED_LINE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.DOT_DASH_LINE")
    @js.native
    def DOT_DASH_LINE: js.Array[Double] = js.native
    inline def DOT_DASH_LINE_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOT_DASH_LINE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.FIVE_MINUTELY")
    @js.native
    def FIVE_MINUTELY: Double = js.native
    inline def FIVE_MINUTELY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIVE_MINUTELY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.FIVE_SECONDLY")
    @js.native
    def FIVE_SECONDLY: Double = js.native
    inline def FIVE_SECONDLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIVE_SECONDLY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.HOURLY")
    @js.native
    def HOURLY: Double = js.native
    inline def HOURLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOURLY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.MINUTELY")
    @js.native
    def MINUTELY: Double = js.native
    inline def MINUTELY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINUTELY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.MONTHLY")
    @js.native
    def MONTHLY: Double = js.native
    inline def MONTHLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MONTHLY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.NUM_GRANULARITIES")
    @js.native
    def NUM_GRANULARITIES: Double = js.native
    inline def NUM_GRANULARITIES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUM_GRANULARITIES")(x.asInstanceOf[js.Any])
    
    /* static member */
    object Plotters {
      
      @JSGlobal("Dygraph.Plotters")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Dygraph.Plotters.errorPlotter")
      @js.native
      def errorPlotter: js.Any = js.native
      inline def errorPlotter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("errorPlotter")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Dygraph.Plotters.fillPlotter")
      @js.native
      def fillPlotter: js.Any = js.native
      inline def fillPlotter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fillPlotter")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Dygraph.Plotters.linePlotter")
      @js.native
      def linePlotter: js.Any = js.native
      inline def linePlotter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linePlotter")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSGlobal("Dygraph.QUARTERLY")
    @js.native
    def QUARTERLY: Double = js.native
    inline def QUARTERLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUARTERLY")(x.asInstanceOf[js.Any])
    
    // Tick granularities (passed to ticker).
    /* static member */
    @JSGlobal("Dygraph.SECONDLY")
    @js.native
    def SECONDLY: Double = js.native
    inline def SECONDLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECONDLY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.SIX_HOURLY")
    @js.native
    def SIX_HOURLY: Double = js.native
    inline def SIX_HOURLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIX_HOURLY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.TEN_MINUTELY")
    @js.native
    def TEN_MINUTELY: Double = js.native
    inline def TEN_MINUTELY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEN_MINUTELY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.TEN_SECONDLY")
    @js.native
    def TEN_SECONDLY: Double = js.native
    inline def TEN_SECONDLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEN_SECONDLY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.THIRTY_MINUTELY")
    @js.native
    def THIRTY_MINUTELY: Double = js.native
    inline def THIRTY_MINUTELY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THIRTY_MINUTELY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.THIRTY_SECONDLY")
    @js.native
    def THIRTY_SECONDLY: Double = js.native
    inline def THIRTY_SECONDLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THIRTY_SECONDLY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.TWO_DAILY")
    @js.native
    def TWO_DAILY: Double = js.native
    inline def TWO_DAILY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TWO_DAILY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.TWO_HOURLY")
    @js.native
    def TWO_HOURLY: Double = js.native
    inline def TWO_HOURLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TWO_HOURLY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.TWO_MINUTELY")
    @js.native
    def TWO_MINUTELY: Double = js.native
    inline def TWO_MINUTELY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TWO_MINUTELY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.TWO_SECONDLY")
    @js.native
    def TWO_SECONDLY: Double = js.native
    inline def TWO_SECONDLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TWO_SECONDLY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.WEEKLY")
    @js.native
    def WEEKLY: Double = js.native
    inline def WEEKLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WEEKLY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dygraph.defaultInteractionModel")
    @js.native
    def defaultInteractionModel: js.Any = js.native
    inline def defaultInteractionModel_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultInteractionModel")(x.asInstanceOf[js.Any])
  }
}
