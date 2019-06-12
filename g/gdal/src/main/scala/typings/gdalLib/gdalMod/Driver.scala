package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Driver extends js.Object {
  val description: java.lang.String = js.native
  def copyFiles(name_old: java.lang.String, name_new: java.lang.String): scala.Unit = js.native
  def create(filename: java.lang.String): Dataset = js.native
  def create(filename: java.lang.String, x_size: scala.Double): Dataset = js.native
  def create(filename: java.lang.String, x_size: scala.Double, y_size: scala.Double): Dataset = js.native
  def create(filename: java.lang.String, x_size: scala.Double, y_size: scala.Double, band_count: scala.Double): Dataset = js.native
  def create(
    filename: java.lang.String,
    x_size: scala.Double,
    y_size: scala.Double,
    band_count: scala.Double,
    data_type: scala.Double
  ): Dataset = js.native
  def create(
    filename: java.lang.String,
    x_size: scala.Double,
    y_size: scala.Double,
    band_count: scala.Double,
    data_type: scala.Double,
    creation_options: js.Array[java.lang.String]
  ): Dataset = js.native
  def create(
    filename: java.lang.String,
    x_size: scala.Double,
    y_size: scala.Double,
    band_count: scala.Double,
    data_type: scala.Double,
    creation_options: js.Object
  ): Dataset = js.native
  def createCopy(filename: java.lang.String, src: Dataset): Dataset = js.native
  def createCopy(filename: java.lang.String, src: Dataset, strict: scala.Boolean): Dataset = js.native
  def createCopy(
    filename: java.lang.String,
    src: Dataset,
    strict: scala.Boolean,
    options: js.Array[java.lang.String]
  ): Dataset = js.native
  def createCopy(filename: java.lang.String, src: Dataset, strict: scala.Boolean, options: js.Object): Dataset = js.native
  def deleteDataset(filename: java.lang.String): scala.Unit = js.native
  def getMetadata(): js.Object = js.native
  def getMetadata(domain: java.lang.String): js.Object = js.native
  def open(path: java.lang.String): Dataset = js.native
  @JSName("open")
  def open_r(path: java.lang.String, mode: gdalLib.gdalLibStrings.`r+`): Dataset = js.native
  @JSName("open")
  def open_r(path: java.lang.String, mode: gdalLib.gdalLibStrings.r): Dataset = js.native
  def rename(new_name: java.lang.String, old_name: java.lang.String): scala.Unit = js.native
}

