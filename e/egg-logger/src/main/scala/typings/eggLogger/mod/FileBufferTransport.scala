package typings.eggLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("egg-logger", "FileBufferTransport")
@js.native
class FileBufferTransport () extends Transport[FileBufferTransportOptions] {
  def flush(): Unit = js.native
}

