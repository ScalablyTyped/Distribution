package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterBandPixels extends StObject {
  
  def get(x: Double, y: Double): Double = js.native
  
  def read(x: Double, y: Double, width: Double, height: Double): TypedArray = js.native
  def read(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    data: Unit,
    options: RasterBandPixelsReadOptions
  ): TypedArray = js.native
  def read(x: Double, y: Double, width: Double, height: Double, data: TypedArray): TypedArray = js.native
  def read(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    data: TypedArray,
    options: RasterBandPixelsReadOptions
  ): TypedArray = js.native
  
  def readBlock(x: Double, y: Double): TypedArray = js.native
  def readBlock(x: Double, y: Double, data: TypedArray): TypedArray = js.native
  
  def set(x: Double, y: Double, value: Double): Unit = js.native
  
  def write(x: Double, y: Double, width: Double, height: Double, data: TypedArray): Unit = js.native
  def write(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    data: TypedArray,
    options: RasterBandPixelsWriteOptions
  ): Unit = js.native
  
  def writeBlock(x: Double, y: Double, data: TypedArray): Unit = js.native
}
