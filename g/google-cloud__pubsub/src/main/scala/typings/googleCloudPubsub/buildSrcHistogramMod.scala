package typings.googleCloudPubsub

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcHistogramMod {
  
  @JSImport("@google-cloud/pubsub/build/src/histogram", "Histogram")
  @js.native
  open class Histogram () extends StObject {
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
  
  trait HistogramOptions extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
  }
  object HistogramOptions {
    
    inline def apply(): HistogramOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HistogramOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HistogramOptions] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
}
