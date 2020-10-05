package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageFaviconUpdatedEvent extends Event {
  /**
    * Array of URLs.
    */
  var favicons: js.Array[String] = js.native
}

