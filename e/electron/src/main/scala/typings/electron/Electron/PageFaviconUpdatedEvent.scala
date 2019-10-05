package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageFaviconUpdatedEvent extends Event {
  /**
    * Array of URLs.
    */
  var favicons: js.Array[String] = js.native
}

