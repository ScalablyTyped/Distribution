package typings.foreverDashMonitor.foreverDashMonitorMod

import typings.foreverDashMonitor.Anon_Args
import typings.node.NodeJSNs.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var command: js.UndefOr[String] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[ProcessEnv] = js.undefined
  var errFile: js.UndefOr[String] = js.undefined
  var killTree: js.UndefOr[Boolean] = js.undefined
  var logFile: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var minUptime: js.UndefOr[Double] = js.undefined
  var outFile: js.UndefOr[String] = js.undefined
  var parser: js.UndefOr[js.Function2[/* command */ String, /* args */ js.Array[String], Anon_Args]] = js.undefined
  var pidFile: js.UndefOr[String] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var sourceDir: js.UndefOr[String] = js.undefined
  var spawnWith: js.UndefOr[SpawnWith] = js.undefined
  var spinSleepTime: js.UndefOr[Double] = js.undefined
  var uid: js.UndefOr[String] = js.undefined
  var watch: js.UndefOr[Boolean] = js.undefined
  var watchDirectory: js.UndefOr[String] = js.undefined
  var watchIgnoreDotFiles: js.UndefOr[Boolean] = js.undefined
  var watchIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    command: String = null,
    cwd: String = null,
    env: ProcessEnv = null,
    errFile: String = null,
    killTree: js.UndefOr[Boolean] = js.undefined,
    logFile: String = null,
    max: Int | Double = null,
    minUptime: Int | Double = null,
    outFile: String = null,
    parser: (/* command */ String, /* args */ js.Array[String]) => Anon_Args = null,
    pidFile: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    sourceDir: String = null,
    spawnWith: SpawnWith = null,
    spinSleepTime: Int | Double = null,
    uid: String = null,
    watch: js.UndefOr[Boolean] = js.undefined,
    watchDirectory: String = null,
    watchIgnoreDotFiles: js.UndefOr[Boolean] = js.undefined,
    watchIgnorePatterns: js.Array[String] = null
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
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction2(parser))
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

