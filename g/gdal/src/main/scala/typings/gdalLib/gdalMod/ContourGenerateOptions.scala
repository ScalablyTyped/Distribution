package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ContourGenerateOptions extends js.Object {
  var dst: Layer
  var elevField: js.UndefOr[scala.Double] = js.undefined
  var fixedLevels: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var idField: js.UndefOr[scala.Double] = js.undefined
  var interval: js.UndefOr[scala.Double] = js.undefined
  var nodata: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var src: RasterBand
}

