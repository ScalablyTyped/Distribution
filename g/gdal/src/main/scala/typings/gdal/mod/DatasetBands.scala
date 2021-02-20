package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetBands extends StObject {
  
  def count(): Double = js.native
  
  def create(dataType: Double): RasterBand = js.native
  
  val ds: Dataset = js.native
  
  def forEach(callback: js.Function2[/* band */ RasterBand, /* i */ Double, Unit]): Unit = js.native
  
  def get(id: Double): RasterBand = js.native
  
  def map[T](callback: js.Function2[/* band */ RasterBand, /* i */ Double, T]): js.Array[T] = js.native
}
object DatasetBands {
  
  @scala.inline
  def apply(
    count: () => Double,
    create: Double => RasterBand,
    ds: Dataset,
    forEach: js.Function2[/* band */ RasterBand, /* i */ Double, Unit] => Unit,
    get: Double => RasterBand,
    map: js.Function2[/* band */ RasterBand, /* i */ Double, js.Any] => js.Array[js.Any]
  ): DatasetBands = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), create = js.Any.fromFunction1(create), ds = ds.asInstanceOf[js.Any], forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), map = js.Any.fromFunction1(map))
    __obj.asInstanceOf[DatasetBands]
  }
  
  @scala.inline
  implicit class DatasetBandsMutableBuilder[Self <: DatasetBands] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreate(value: Double => RasterBand): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDs(value: Dataset): Self = StObject.set(x, "ds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForEach(value: js.Function2[/* band */ RasterBand, /* i */ Double, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: Double => RasterBand): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMap(value: js.Function2[/* band */ RasterBand, /* i */ Double, js.Any] => js.Array[js.Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
  }
}
