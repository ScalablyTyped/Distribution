package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetBands extends StObject {
  
  def count(): Double
  
  def create(dataType: Double): RasterBand
  
  val ds: Dataset
  
  def forEach(callback: js.Function2[/* band */ RasterBand, /* i */ Double, Unit]): Unit
  
  def get(id: Double): RasterBand
  
  def map[T](callback: js.Function2[/* band */ RasterBand, /* i */ Double, T]): js.Array[T]
}
object DatasetBands {
  
  inline def apply(
    count: () => Double,
    create: Double => RasterBand,
    ds: Dataset,
    forEach: js.Function2[/* band */ RasterBand, /* i */ Double, Unit] => Unit,
    get: Double => RasterBand,
    map: js.Function2[/* band */ RasterBand, /* i */ Double, Any] => js.Array[Any]
  ): DatasetBands = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), create = js.Any.fromFunction1(create), ds = ds.asInstanceOf[js.Any], forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), map = js.Any.fromFunction1(map))
    __obj.asInstanceOf[DatasetBands]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetBands] (val x: Self) extends AnyVal {
    
    inline def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
    
    inline def setCreate(value: Double => RasterBand): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setDs(value: Dataset): Self = StObject.set(x, "ds", value.asInstanceOf[js.Any])
    
    inline def setForEach(value: js.Function2[/* band */ RasterBand, /* i */ Double, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    
    inline def setGet(value: Double => RasterBand): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setMap(value: js.Function2[/* band */ RasterBand, /* i */ Double, Any] => js.Array[Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
  }
}
