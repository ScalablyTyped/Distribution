package typings.gifwrap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gifwrap", "GifCodec")
@js.native
class GifCodec ()
  extends GifEncoder
     with GifDecoder {
  def this(options: GifCodecOptions) = this()
}

