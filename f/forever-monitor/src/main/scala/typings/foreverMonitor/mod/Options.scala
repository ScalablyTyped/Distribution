package typings.foreverMonitor.mod

import typings.foreverMonitor.anon.Args
import typings.node.processMod.global.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.native
  var command: js.UndefOr[String] = js.native
  var cwd: js.UndefOr[String] = js.native
  var env: js.UndefOr[ProcessEnv] = js.native
  var errFile: js.UndefOr[String] = js.native
  var killTree: js.UndefOr[Boolean] = js.native
  var logFile: js.UndefOr[String] = js.native
  var max: js.UndefOr[Double] = js.native
  var minUptime: js.UndefOr[Double] = js.native
  var outFile: js.UndefOr[String] = js.native
  var parser: js.UndefOr[js.Function2[/* command */ String, /* args */ js.Array[String], Args]] = js.native
  var pidFile: js.UndefOr[String] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var sourceDir: js.UndefOr[String] = js.native
  var spawnWith: js.UndefOr[SpawnWith] = js.native
  var spinSleepTime: js.UndefOr[Double] = js.native
  var uid: js.UndefOr[String] = js.native
  var watch: js.UndefOr[Boolean] = js.native
  var watchDirectory: js.UndefOr[String] = js.native
  var watchIgnoreDotFiles: js.UndefOr[Boolean] = js.native
  var watchIgnorePatterns: js.UndefOr[js.Array[String]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setEnv(value: ProcessEnv): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setErrFile(value: String): Self = this.set("errFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrFile: Self = this.set("errFile", js.undefined)
    @scala.inline
    def setKillTree(value: Boolean): Self = this.set("killTree", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKillTree: Self = this.set("killTree", js.undefined)
    @scala.inline
    def setLogFile(value: String): Self = this.set("logFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogFile: Self = this.set("logFile", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMinUptime(value: Double): Self = this.set("minUptime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinUptime: Self = this.set("minUptime", js.undefined)
    @scala.inline
    def setOutFile(value: String): Self = this.set("outFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutFile: Self = this.set("outFile", js.undefined)
    @scala.inline
    def setParser(value: (/* command */ String, /* args */ js.Array[String]) => Args): Self = this.set("parser", js.Any.fromFunction2(value))
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    @scala.inline
    def setPidFile(value: String): Self = this.set("pidFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePidFile: Self = this.set("pidFile", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setSourceDir(value: String): Self = this.set("sourceDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceDir: Self = this.set("sourceDir", js.undefined)
    @scala.inline
    def setSpawnWith(value: SpawnWith): Self = this.set("spawnWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpawnWith: Self = this.set("spawnWith", js.undefined)
    @scala.inline
    def setSpinSleepTime(value: Double): Self = this.set("spinSleepTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpinSleepTime: Self = this.set("spinSleepTime", js.undefined)
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
    @scala.inline
    def setWatch(value: Boolean): Self = this.set("watch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
    @scala.inline
    def setWatchDirectory(value: String): Self = this.set("watchDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatchDirectory: Self = this.set("watchDirectory", js.undefined)
    @scala.inline
    def setWatchIgnoreDotFiles(value: Boolean): Self = this.set("watchIgnoreDotFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatchIgnoreDotFiles: Self = this.set("watchIgnoreDotFiles", js.undefined)
    @scala.inline
    def setWatchIgnorePatternsVarargs(value: String*): Self = this.set("watchIgnorePatterns", js.Array(value :_*))
    @scala.inline
    def setWatchIgnorePatterns(value: js.Array[String]): Self = this.set("watchIgnorePatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatchIgnorePatterns: Self = this.set("watchIgnorePatterns", js.undefined)
  }
  
}

