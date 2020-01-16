package typings.downscale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object downscaleMod {
  import typings.std.File
  import typings.std.HTMLImageElement
  import typings.std.HTMLVideoElement

  type ImageSource = File | HTMLImageElement | HTMLVideoElement | String
}
