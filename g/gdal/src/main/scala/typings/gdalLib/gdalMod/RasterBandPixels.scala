package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RasterBandPixels extends js.Object {
  def get(x: scala.Double, y: scala.Double): scala.Double = js.native
  def read(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): TypedArray = js.native
  def read(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double, data: TypedArray): TypedArray = js.native
  def read(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    data: TypedArray,
    options: RasterBandPixelsReadOptions
  ): TypedArray = js.native
  def readBlock(x: scala.Double, y: scala.Double): TypedArray = js.native
  def readBlock(x: scala.Double, y: scala.Double, data: TypedArray): TypedArray = js.native
  def set(x: scala.Double, y: scala.Double, value: scala.Double): scala.Unit = js.native
  def write(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double, data: TypedArray): scala.Unit = js.native
  def write(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    data: TypedArray,
    options: RasterBandPixelsWriteOptions
  ): scala.Unit = js.native
  def writeBlock(x: scala.Double, y: scala.Double, data: TypedArray): scala.Unit = js.native
}

