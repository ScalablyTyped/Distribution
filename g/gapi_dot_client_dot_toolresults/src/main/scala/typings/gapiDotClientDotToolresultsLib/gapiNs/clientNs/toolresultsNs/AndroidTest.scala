package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidTest extends js.Object {
  /** Infomation about the application under test. */
  var androidAppInfo: js.UndefOr[AndroidAppInfo] = js.undefined
  /** An Android instrumentation test. */
  var androidInstrumentationTest: js.UndefOr[AndroidInstrumentationTest] = js.undefined
  /** An Android robo test. */
  var androidRoboTest: js.UndefOr[AndroidRoboTest] = js.undefined
  /** Max time a test is allowed to run before it is automatically cancelled. */
  var testTimeout: js.UndefOr[Duration] = js.undefined
}

