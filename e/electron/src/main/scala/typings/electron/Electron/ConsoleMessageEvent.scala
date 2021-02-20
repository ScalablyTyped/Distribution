package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsoleMessageEvent extends Event {
  
  /**
    * The log level, from 0 to 3. In order it matches `verbose`, `info`, `warning` and
    * `error`.
    */
  var level: Double = js.native
  
  /**
    * The line number of the source that triggered this console message
    */
  var line: Double = js.native
  
  /**
    * The actual console message
    */
  var message: String = js.native
  
  var sourceId: String = js.native
}
