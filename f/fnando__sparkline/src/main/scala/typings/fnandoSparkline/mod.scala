package typings.fnandoSparkline

import typings.fnandoSparkline.anon.Value
import typings.std.MouseEvent
import typings.std.Partial
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fnando/sparkline", JSImport.Default)
  @js.native
  def default[TEntry /* <: SparklineNativeEntry */](svg: SVGSVGElement, entries: js.Array[TEntry]): String = js.native
  @JSImport("@fnando/sparkline", JSImport.Default)
  @js.native
  def default[TEntry /* <: SparklineNativeEntry */](svg: SVGSVGElement, entries: js.Array[TEntry], options: SparklineNativeOptions[TEntry]): String = js.native
  @JSImport("@fnando/sparkline", JSImport.Default)
  @js.native
  def default[TEntry](svg: SVGSVGElement, entries: js.Array[TEntry], options: SparklineNonNativeOptions[TEntry]): String = js.native
  
  @JSImport("@fnando/sparkline", "sparkline")
  @js.native
  def sparkline[TEntry /* <: SparklineNativeEntry */](svg: SVGSVGElement, entries: js.Array[TEntry]): String = js.native
  @JSImport("@fnando/sparkline", "sparkline")
  @js.native
  def sparkline[TEntry /* <: SparklineNativeEntry */](svg: SVGSVGElement, entries: js.Array[TEntry], options: SparklineNativeOptions[TEntry]): String = js.native
  @JSImport("@fnando/sparkline", "sparkline")
  @js.native
  def sparkline[TEntry](svg: SVGSVGElement, entries: js.Array[TEntry], options: SparklineNonNativeOptions[TEntry]): String = js.native
  
  type SparklineNativeEntry = Double | Value
  
  type SparklineNativeOptions[TEntry] = SparklineOptions | Partial[SparklineOptionsFetch[TEntry]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.fnandoSparkline.mod.SparklineOptions
    - typings.fnandoSparkline.mod.SparklineOptionsFetch[TEntry]
  */
  trait SparklineNonNativeOptions[TEntry] extends StObject
  object SparklineNonNativeOptions {
    
    @scala.inline
    def SparklineOptions(): typings.fnandoSparkline.mod.SparklineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.fnandoSparkline.mod.SparklineOptions]
    }
    
    @scala.inline
    def SparklineOptionsFetch[TEntry](fetch: TEntry => Double): typings.fnandoSparkline.mod.SparklineOptionsFetch[TEntry] = {
      val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
      __obj.asInstanceOf[typings.fnandoSparkline.mod.SparklineOptionsFetch[TEntry]]
    }
  }
  
  @js.native
  trait SparklineOptions
    extends SparklineNonNativeOptions[js.Any] {
    
    /**
      * Set the cursor width. The default is 2.
      */
    var cursorwidth: js.UndefOr[Double] = js.native
    
    /**
      * When true, this enables the interactive mode. You don't have to set this option if you're providing a onmousemove callback.
      */
    var interactive: js.UndefOr[Boolean] = js.native
    
    /**
      * By setting this callback function, you'll enable the interactive mode (unless you set options.interactive to false).
      */
    var onmousemove: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
    
    /**
      * This callback function is called every time the mouse leaves the SVG area. You can use it to hide things like tooltips.
      */
    var onmouseout: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
    
    /**
      * Set the spot radius. The default is 2.
      */
    var spotRadius: js.UndefOr[Double] = js.native
  }
  object SparklineOptions {
    
    @scala.inline
    def apply(): SparklineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SparklineOptions]
    }
    
    @scala.inline
    implicit class SparklineOptionsMutableBuilder[Self <: SparklineOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCursorwidth(value: Double): Self = StObject.set(x, "cursorwidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorwidthUndefined: Self = StObject.set(x, "cursorwidth", js.undefined)
      
      @scala.inline
      def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      @scala.inline
      def setOnmousemove(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onmousemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnmousemoveUndefined: Self = StObject.set(x, "onmousemove", js.undefined)
      
      @scala.inline
      def setOnmouseout(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onmouseout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnmouseoutUndefined: Self = StObject.set(x, "onmouseout", js.undefined)
      
      @scala.inline
      def setSpotRadius(value: Double): Self = StObject.set(x, "spotRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpotRadiusUndefined: Self = StObject.set(x, "spotRadius", js.undefined)
    }
  }
  
  @js.native
  trait SparklineOptionsFetch[TEntry] extends SparklineNonNativeOptions[TEntry] {
    
    /**
      * Use this function to return the value if you have a different data structure that's not natively supported by sparkline.
      */
    def fetch(entry: TEntry): Double = js.native
  }
  object SparklineOptionsFetch {
    
    @scala.inline
    def apply[TEntry](fetch: TEntry => Double): SparklineOptionsFetch[TEntry] = {
      val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
      __obj.asInstanceOf[SparklineOptionsFetch[TEntry]]
    }
    
    @scala.inline
    implicit class SparklineOptionsFetchMutableBuilder[Self <: SparklineOptionsFetch[_], TEntry] (val x: Self with SparklineOptionsFetch[TEntry]) extends AnyVal {
      
      @scala.inline
      def setFetch(value: TEntry => Double): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
    }
  }
}
