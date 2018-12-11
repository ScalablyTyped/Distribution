package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RasterBandOverviews extends js.Object {
  def count(): scala.Double
  def forEach(callback: js.Function2[/* overviewBand */ RasterBand, /* i */ scala.Double, scala.Unit]): scala.Unit
  def get(index: scala.Double): RasterBand
  def getBySampleCount(samples: scala.Double): RasterBand
  def map[T](callback: js.Function2[/* overviewBand */ RasterBand, /* i */ scala.Double, T]): js.Array[T]
}

