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
      foreverDashMonitorLib.Anon_Args
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
  var watchIgnorePatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String] = null,
    command: java.lang.String = null,
    cwd: java.lang.String = null,
    env: nodeLib.NodeJSNs.ProcessEnv = null,
    errFile: java.lang.String = null,
    killTree: js.UndefOr[scala.Boolean] = js.undefined,
    logFile: java.lang.String = null,
    max: scala.Int | scala.Double = null,
    minUptime: scala.Int | scala.Double = null,
    outFile: java.lang.String = null,
    parser: js.Function2[
      /* command */ java.lang.String, 
      /* args */ js.Array[java.lang.String], 
      foreverDashMonitorLib.Anon_Args
    ] = null,
    pidFile: java.lang.String = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    sourceDir: java.lang.String = null,
    spawnWith: SpawnWith = null,
    spinSleepTime: scala.Int | scala.Double = null,
    uid: java.lang.String = null,
    watch: js.UndefOr[scala.Boolean] = js.undefined,
    watchDirectory: java.lang.String = null,
    watchIgnoreDotFiles: js.UndefOr[scala.Boolean] = js.undefined,
    watchIgnorePatterns: js.Array[java.lang.String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (command != null) __obj.updateDynamic("command")(command)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (env != null) __obj.updateDynamic("env")(env)
    if (errFile != null) __obj.updateDynamic("errFile")(errFile)
    if (!js.isUndefined(killTree)) __obj.updateDynamic("killTree")(killTree)
    if (logFile != null) __obj.updateDynamic("logFile")(logFile)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (minUptime != null) __obj.updateDynamic("minUptime")(minUptime.asInstanceOf[js.Any])
    if (outFile != null) __obj.updateDynamic("outFile")(outFile)
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (pidFile != null) __obj.updateDynamic("pidFile")(pidFile)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (sourceDir != null) __obj.updateDynamic("sourceDir")(sourceDir)
    if (spawnWith != null) __obj.updateDynamic("spawnWith")(spawnWith)
    if (spinSleepTime != null) __obj.updateDynamic("spinSleepTime")(spinSleepTime.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid)
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch)
    if (watchDirectory != null) __obj.updateDynamic("watchDirectory")(watchDirectory)
    if (!js.isUndefined(watchIgnoreDotFiles)) __obj.updateDynamic("watchIgnoreDotFiles")(watchIgnoreDotFiles)
    if (watchIgnorePatterns != null) __obj.updateDynamic("watchIgnorePatterns")(watchIgnorePatterns)
    __obj.asInstanceOf[Options]
  }
}

