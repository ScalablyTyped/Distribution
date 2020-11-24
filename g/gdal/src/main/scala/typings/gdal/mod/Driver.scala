package typings.gdal.mod

import typings.gdal.gdalStrings.r
import typings.gdal.gdalStrings.rPlussign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Driver extends js.Object {
  
  def copyFiles(name_old: String, name_new: String): Unit = js.native
  
  def create(filename: String): Dataset = js.native
  def create(
    filename: String,
    x_size: js.UndefOr[scala.Nothing],
    y_size: js.UndefOr[scala.Nothing],
    band_count: js.UndefOr[scala.Nothing],
    data_type: js.UndefOr[scala.Nothing],
    creation_options: js.Array[String]
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: js.UndefOr[scala.Nothing],
    y_size: js.UndefOr[scala.Nothing],
    band_count: js.UndefOr[scala.Nothing],
    data_type: js.UndefOr[scala.Nothing],
    creation_options: js.Object
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: js.UndefOr[scala.Nothing],
    y_size: js.UndefOr[scala.Nothing],
    band_count: js.UndefOr[scala.Nothing],
    data_type: Double
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: js.UndefOr[scala.Nothing],
    y_size: js.UndefOr[scala.Nothing],
    band_count: js.UndefOr[scala.Nothing],
    data_type: Double,
    creation_options: js.Array[String]
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: js.UndefOr[scala.Nothing],
    y_size: js.UndefOr[scala.Nothing],
    band_count: js.UndefOr[scala.Nothing],
    data_type: Double,
    creation_options: js.Object
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: js.UndefOr[scala.Nothing],
    y_size: js.UndefOr[scala.Nothing],
    band_count: Double
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: js.UndefOr[scala.Nothing],
    y_size: js.UndefOr[scala.Nothing],
    band_count: Double,
    data_type: js.UndefOr[scala.Nothing],
    creation_options: js.Array[String]
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: js.UndefOr[scala.Nothing],
    y_size: js.UndefOr[scala.Nothing],
    band_count: Double,
    data_type: js.UndefOr[scala.Nothing],
    creation_options: js.Object
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: js.UndefOr[scala.Nothing],
    y_size: js.UndefOr[scala.Nothing],
    band_count: Double,
    data_type: Double
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: js.UndefOr[scala.Nothing],
    y_size: js.UndefOr[scala.Nothing],
    band_count: Double,
    data_type: Double,
    creation_options: js.Array[String]
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: js.UndefOr[scala.Nothing],
    y_size: js.UndefOr[scala.Nothing],
    band_count: Double,
    data_type: Double,
    creation_options: js.Object
  ): Dataset = js.native
  def create(filename: String, x_size: js.UndefOr[scala.Nothing], y_size: Double): Dataset = js.native
  def create(
    filename: String,
    x_size: js.UndefOr[scala.Nothing],
    y_size: Double,
    band_count: js.UndefOr[scala.Nothing],
    data_type: js.UndefOr[scala.Nothing],
    creation_options: js.Array[String]
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: js.UndefOr[scala.Nothing],
    y_size: Double,
    band_count: js.UndefOr[scala.Nothing],
    data_type: js.UndefOr[scala.Nothing],
    creation_options: js.Object
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: js.UndefOr[scala.Nothing],
    y_size: Double,
    band_count: js.UndefOr[scala.Nothing],
    data_type: Double
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: js.UndefOr[scala.Nothing],
    y_size: Double,
    band_count: js.UndefOr[scala.Nothing],
    data_type: Double,
    creation_options: js.Array[String]
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: js.UndefOr[scala.Nothing],
    y_size: Double,
    band_count: js.UndefOr[scala.Nothing],
    data_type: Double,
    creation_options: js.Object
  ): Dataset = js.native
  def create(filename: String, x_size: js.UndefOr[scala.Nothing], y_size: Double, band_count: Double): Dataset = js.native
  def create(
    filename: String,
    x_size: js.UndefOr[scala.Nothing],
    y_size: Double,
    band_count: Double,
    data_type: js.UndefOr[scala.Nothing],
    creation_options: js.Array[String]
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: js.UndefOr[scala.Nothing],
    y_size: Double,
    band_count: Double,
    data_type: js.UndefOr[scala.Nothing],
    creation_options: js.Object
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: js.UndefOr[scala.Nothing],
    y_size: Double,
    band_count: Double,
    data_type: Double
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: js.UndefOr[scala.Nothing],
    y_size: Double,
    band_count: Double,
    data_type: Double,
    creation_options: js.Array[String]
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: js.UndefOr[scala.Nothing],
    y_size: Double,
    band_count: Double,
    data_type: Double,
    creation_options: js.Object
  ): Dataset = js.native
  def create(filename: String, x_size: Double): Dataset = js.native
  def create(
    filename: String,
    x_size: Double,
    y_size: js.UndefOr[scala.Nothing],
    band_count: js.UndefOr[scala.Nothing],
    data_type: js.UndefOr[scala.Nothing],
    creation_options: js.Array[String]
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: Double,
    y_size: js.UndefOr[scala.Nothing],
    band_count: js.UndefOr[scala.Nothing],
    data_type: js.UndefOr[scala.Nothing],
    creation_options: js.Object
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: Double,
    y_size: js.UndefOr[scala.Nothing],
    band_count: js.UndefOr[scala.Nothing],
    data_type: Double
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: Double,
    y_size: js.UndefOr[scala.Nothing],
    band_count: js.UndefOr[scala.Nothing],
    data_type: Double,
    creation_options: js.Array[String]
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: Double,
    y_size: js.UndefOr[scala.Nothing],
    band_count: js.UndefOr[scala.Nothing],
    data_type: Double,
    creation_options: js.Object
  ): Dataset = js.native
  def create(filename: String, x_size: Double, y_size: js.UndefOr[scala.Nothing], band_count: Double): Dataset = js.native
  def create(
    filename: String,
    x_size: Double,
    y_size: js.UndefOr[scala.Nothing],
    band_count: Double,
    data_type: js.UndefOr[scala.Nothing],
    creation_options: js.Array[String]
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: Double,
    y_size: js.UndefOr[scala.Nothing],
    band_count: Double,
    data_type: js.UndefOr[scala.Nothing],
    creation_options: js.Object
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: Double,
    y_size: js.UndefOr[scala.Nothing],
    band_count: Double,
    data_type: Double
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: Double,
    y_size: js.UndefOr[scala.Nothing],
    band_count: Double,
    data_type: Double,
    creation_options: js.Array[String]
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: Double,
    y_size: js.UndefOr[scala.Nothing],
    band_count: Double,
    data_type: Double,
    creation_options: js.Object
  ): Dataset = js.native
  def create(filename: String, x_size: Double, y_size: Double): Dataset = js.native
  def create(
    filename: String,
    x_size: Double,
    y_size: Double,
    band_count: js.UndefOr[scala.Nothing],
    data_type: js.UndefOr[scala.Nothing],
    creation_options: js.Array[String]
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: Double,
    y_size: Double,
    band_count: js.UndefOr[scala.Nothing],
    data_type: js.UndefOr[scala.Nothing],
    creation_options: js.Object
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: Double,
    y_size: Double,
    band_count: js.UndefOr[scala.Nothing],
    data_type: Double
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: Double,
    y_size: Double,
    band_count: js.UndefOr[scala.Nothing],
    data_type: Double,
    creation_options: js.Array[String]
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: Double,
    y_size: Double,
    band_count: js.UndefOr[scala.Nothing],
    data_type: Double,
    creation_options: js.Object
  ): Dataset = js.native
  def create(filename: String, x_size: Double, y_size: Double, band_count: Double): Dataset = js.native
  def create(
    filename: String,
    x_size: Double,
    y_size: Double,
    band_count: Double,
    data_type: js.UndefOr[scala.Nothing],
    creation_options: js.Array[String]
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: Double,
    y_size: Double,
    band_count: Double,
    data_type: js.UndefOr[scala.Nothing],
    creation_options: js.Object
  ): Dataset = js.native
  def create(filename: String, x_size: Double, y_size: Double, band_count: Double, data_type: Double): Dataset = js.native
  def create(
    filename: String,
    x_size: Double,
    y_size: Double,
    band_count: Double,
    data_type: Double,
    creation_options: js.Array[String]
  ): Dataset = js.native
  def create(
    filename: String,
    x_size: Double,
    y_size: Double,
    band_count: Double,
    data_type: Double,
    creation_options: js.Object
  ): Dataset = js.native
  
  def createCopy(filename: String, src: Dataset): Dataset = js.native
  def createCopy(filename: String, src: Dataset, strict: js.UndefOr[scala.Nothing], options: js.Array[String]): Dataset = js.native
  def createCopy(filename: String, src: Dataset, strict: js.UndefOr[scala.Nothing], options: js.Object): Dataset = js.native
  def createCopy(filename: String, src: Dataset, strict: Boolean): Dataset = js.native
  def createCopy(filename: String, src: Dataset, strict: Boolean, options: js.Array[String]): Dataset = js.native
  def createCopy(filename: String, src: Dataset, strict: Boolean, options: js.Object): Dataset = js.native
  
  def deleteDataset(filename: String): Unit = js.native
  
  val description: String = js.native
  
  def getMetadata(): js.Object = js.native
  def getMetadata(domain: String): js.Object = js.native
  
  def open(path: String): Dataset = js.native
  @JSName("open")
  def open_r(path: String, mode: r): Dataset = js.native
  @JSName("open")
  def open_r(path: String, mode: rPlussign): Dataset = js.native
  
  def rename(new_name: String, old_name: String): Unit = js.native
}
