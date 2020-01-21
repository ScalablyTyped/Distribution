package typings.ffmpeg.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Error
import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ffmpeg", JSImport.Namespace)
@js.native
class ^ protected () extends Promise[Video] {
  def this(filePath: String) = this()
  def this(filePath: String, cb: js.Function2[/* err */ Error, /* video */ Video, Unit]) = this()
}

@JSImport("ffmpeg", JSImport.Namespace)
@js.native
object ^ extends TopLevel[Iffmpeg]

