package typings.googleCloudPubsub

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object histogramMod {
  
  @JSImport("@google-cloud/pubsub/build/src/histogram", "Histogram")
  @js.native
  class Histogram () extends StObject {
    def this(options: HistogramOptions) = this()
    
    /*!
      * Adds a value to the histogram.
      *
      * @private
      * @param {numnber} value - The value in milliseconds.
      */
    def add(value: Double): Unit = js.native
    
    var data: Map[Double, Double] = js.native
    
    var length: Double = js.native
    
    var options: HistogramOptions = js.native
    
    /*!
      * Retrieves the nth percentile of recorded values.
      *
      * @private
      * @param {number} percent The requested percentage.
      * @return {number}
      */
    def percentile(percent: Double): Double = js.native
  }
  
  @js.native
  trait HistogramOptions extends StObject {
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
  }
  object HistogramOptions {
    
    @scala.inline
    def apply(): HistogramOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HistogramOptions]
    }
    
    @scala.inline
    implicit class HistogramOptionsMutableBuilder[Self <: HistogramOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
}
