package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterBandOverviews extends StObject {
  
  def count(): Double
  
  def forEach(callback: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, Unit]): Unit
  
  def get(index: Double): RasterBand
  
  def getBySampleCount(samples: Double): RasterBand
  
  def map[T](callback: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, T]): js.Array[T]
}
object RasterBandOverviews {
  
  @scala.inline
  def apply(
    count: () => Double,
    forEach: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, Unit] => Unit,
    get: Double => RasterBand,
    getBySampleCount: Double => RasterBand,
    map: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, js.Any] => js.Array[js.Any]
  ): RasterBandOverviews = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), getBySampleCount = js.Any.fromFunction1(getBySampleCount), map = js.Any.fromFunction1(map))
    __obj.asInstanceOf[RasterBandOverviews]
  }
  
  @scala.inline
  implicit class RasterBandOverviewsMutableBuilder[Self <: RasterBandOverviews] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
    
    @scala.inline
    def setForEach(value: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: Double => RasterBand): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBySampleCount(value: Double => RasterBand): Self = StObject.set(x, "getBySampleCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMap(value: js.Function2[/* overviewBand */ RasterBand, /* i */ Double, js.Any] => js.Array[js.Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
  }
}
