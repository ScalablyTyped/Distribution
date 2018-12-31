package typings
package foreverDashMonitorLib.foreverDashMonitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var command: js.UndefOr[java.lang.String] = js.undefined
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var env: js.UndefOr[nodeLib.NodeJSNs.ProcessEnv] = js.undefined
  var errFile: js.UndefOr[java.lang.String] = js.undefined
  var killTree: js.UndefOr[scala.Boolean] = js.undefined
  var logFile: js.UndefOr[java.lang.String] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var minUptime: js.UndefOr[scala.Double] = js.undefined
  var outFile: js.UndefOr[java.lang.String] = js.undefined
  var parser: js.UndefOr[
    js.Function2[
      /* command */ java.lang.String, 
      /* args */ js.Array[java.lang.String], 
      foreverDashMonitorLib.Anon_CommandArgs
    ]
  ] = js.undefined
  var pidFile: js.UndefOr[java.lang.String] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  var sourceDir: js.UndefOr[java.lang.String] = js.undefined
  var spawnWith: js.UndefOr[SpawnWith] = js.undefined
  var spinSleepTime: js.UndefOr[scala.Double] = js.undefined
  var uid: js.UndefOr[java.lang.String] = js.undefined
  var watch: js.UndefOr[scala.Boolean] = js.undefined
  var watchDirectory: js.UndefOr[java.lang.String] = js.undefined
  var watchIgnoreDotFiles: js.UndefOr[scala.Boolean] = js.undefined
  var watchIgnorePatters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

