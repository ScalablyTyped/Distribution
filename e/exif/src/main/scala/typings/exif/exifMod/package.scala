package typings.exif

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object exifMod {
  type ExifCallback = js.Function3[/* error */ Error | Null, /* data */ ExifData, /* dataPath */ String, Unit]
  type ExifImageCallback = js.Function2[/* error */ Error | Null, /* data */ ExifData, Unit]
}
