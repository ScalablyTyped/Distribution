package typings.expectPuppeteer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Interval at which pageFunctions may be executed.
    */
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.expectPuppeteer.expectPuppeteerStrings.mutation
    - typings.expectPuppeteer.expectPuppeteerStrings.raf
  */
  type ExpectPolling = typings.expectPuppeteer.mod._ExpectPolling | scala.Double
}
