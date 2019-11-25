package typings.gdal.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gdal.gdalStrings.NEAREST
  - typings.gdal.gdalStrings.GAUSS
  - typings.gdal.gdalStrings.CUBIC
  - typings.gdal.gdalStrings.AVERAGE
  - typings.gdal.gdalStrings.MODE
  - typings.gdal.gdalStrings.AVERAGE_MAGPHASE
  - typings.gdal.gdalStrings.NONE
*/
trait Resampling extends js.Object

object Resampling {
  @scala.inline
  def AVERAGE: typings.gdal.gdalStrings.AVERAGE = this.cast("AVERAGE")
  @scala.inline
  def AVERAGE_MAGPHASE: typings.gdal.gdalStrings.AVERAGE_MAGPHASE = this.cast("AVERAGE_MAGPHASE")
  @scala.inline
  def CUBIC: typings.gdal.gdalStrings.CUBIC = this.cast("CUBIC")
  @scala.inline
  def GAUSS: typings.gdal.gdalStrings.GAUSS = this.cast("GAUSS")
  @scala.inline
  def MODE: typings.gdal.gdalStrings.MODE = this.cast("MODE")
  @scala.inline
  def NEAREST: typings.gdal.gdalStrings.NEAREST = this.cast("NEAREST")
  @scala.inline
  def NONE: typings.gdal.gdalStrings.NONE = this.cast("NONE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

