package typings
package gdalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gdalMod {
  type Resampling = gdalLib.gdalLibStrings.NEAREST | gdalLib.gdalLibStrings.GAUSS | gdalLib.gdalLibStrings.CUBIC | gdalLib.gdalLibStrings.AVERAGE | gdalLib.gdalLibStrings.MODE | gdalLib.gdalLibStrings.AVERAGE_MAGPHASE | gdalLib.gdalLibStrings.NONE
  type TypedArray = stdLib.Int8Array | stdLib.Uint8Array | stdLib.Uint8ClampedArray | stdLib.Int16Array | stdLib.Uint16Array | stdLib.Int32Array | stdLib.Uint32Array | stdLib.Float32Array | stdLib.Float64Array
}
