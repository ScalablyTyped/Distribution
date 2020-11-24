package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetBands extends js.Object {
  
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
  implicit class DatasetBandsOps[Self <: DatasetBands] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCount(value: () => Double): Self = this.set("count", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreate(value: Double => RasterBand): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDs(value: Dataset): Self = this.set("ds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForEach(value: js.Function2[/* band */ RasterBand, /* i */ Double, Unit] => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: Double => RasterBand): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMap(value: js.Function2[/* band */ RasterBand, /* i */ Double, js.Any] => js.Array[js.Any]): Self = this.set("map", js.Any.fromFunction1(value))
  }
}
