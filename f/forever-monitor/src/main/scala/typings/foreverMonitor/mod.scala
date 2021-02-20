package typings.foreverMonitor

import typings.foreverMonitor.anon.Args
import typings.foreverMonitor.anon.Command
import typings.foreverMonitor.foreverMonitorBooleans.`false`
import typings.node.eventsMod.EventEmitter
import typings.node.processMod.global.NodeJS.ProcessEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("forever-monitor", "Monitor")
  @js.native
  class Monitor protected () extends EventEmitter {
    /**
      * @param script - Location of the target script to run.
      * @param [options] - Configuration for this instance.
      */
    def this(script: String) = this()
    def this(script: js.Array[String]) = this()
    def this(script: String, options: Options) = this()
    def this(script: js.Array[String], options: Options) = this()
    
    /**
      * @description Kills the ChildProcess object associated with this instance
      * @param [forceStop] - Value indicating whether short circuit forever auto-restart
      */
    def kill(): this.type = js.native
    def kill(forceStop: Boolean): this.type = js.native
    
    /**
      * @param command - Command string to parse
      * @param args - Additional default arguments
      */
    def parseCommand(command: String): `false` | Command = js.native
    def parseCommand(command: String, args: js.Array[String]): `false` | Command = js.native
    
    /**
      * @description Restarts the target script associated with this instance.
      */
    def restart(): this.type = js.native
    
    /**
      * @description Sends a message to a forked ChildProcess object associated with this instance
      */
    def send(): this.type = js.native
    def send(msg: js.Any): this.type = js.native
    
    /**
      * @description Start the process that this instance is configured for
      * @param [restart] - Value indicating whether this is a restart.
      */
    def start(): this.type = js.native
    def start(restart: Boolean): this.type = js.native
    
    /**
      * @description Stops the target script associated with this instance. Prevents it from auto-respawning
      */
    def stop(): this.type = js.native
    
    /**
      * @description Tries to spawn the target Forever child process.
      */
    def trySpawn(): Boolean = js.native
  }
  
  @JSImport("forever-monitor", "checkProcess")
  @js.native
  def checkProcess(pid: Double): Boolean = js.native
  
  @JSImport("forever-monitor", "kill")
  @js.native
  def kill(pid: Double): Unit = js.native
  @JSImport("forever-monitor", "kill")
  @js.native
  def kill(
    pid: Double,
    killTree: js.UndefOr[scala.Nothing],
    signal: js.UndefOr[scala.Nothing],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSImport("forever-monitor", "kill")
  @js.native
  def kill(pid: Double, killTree: js.UndefOr[scala.Nothing], signal: String): Unit = js.native
  @JSImport("forever-monitor", "kill")
  @js.native
  def kill(pid: Double, killTree: js.UndefOr[scala.Nothing], signal: String, callback: js.Function0[_]): Unit = js.native
  @JSImport("forever-monitor", "kill")
  @js.native
  def kill(pid: Double, killTree: Boolean): Unit = js.native
  @JSImport("forever-monitor", "kill")
  @js.native
  def kill(pid: Double, killTree: Boolean, signal: js.UndefOr[scala.Nothing], callback: js.Function0[_]): Unit = js.native
  @JSImport("forever-monitor", "kill")
  @js.native
  def kill(pid: Double, killTree: Boolean, signal: String): Unit = js.native
  @JSImport("forever-monitor", "kill")
  @js.native
  def kill(pid: Double, killTree: Boolean, signal: String, callback: js.Function0[_]): Unit = js.native
  
  @JSImport("forever-monitor", "start")
  @js.native
  def start(script: String): Monitor = js.native
  @JSImport("forever-monitor", "start")
  @js.native
  def start(script: String, options: Options): Monitor = js.native
  @JSImport("forever-monitor", "start")
  @js.native
  def start(script: js.Array[String]): Monitor = js.native
  @JSImport("forever-monitor", "start")
  @js.native
  def start(script: js.Array[String], options: Options): Monitor = js.native
  
  @JSImport("forever-monitor", "version")
  @js.native
  val version: String = js.native
  
  @js.native
  trait Options extends StObject {
    
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setErrFile(value: String): Self = StObject.set(x, "errFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrFileUndefined: Self = StObject.set(x, "errFile", js.undefined)
      
      @scala.inline
      def setKillTree(value: Boolean): Self = StObject.set(x, "killTree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKillTreeUndefined: Self = StObject.set(x, "killTree", js.undefined)
      
      @scala.inline
      def setLogFile(value: String): Self = StObject.set(x, "logFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogFileUndefined: Self = StObject.set(x, "logFile", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMinUptime(value: Double): Self = StObject.set(x, "minUptime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUptimeUndefined: Self = StObject.set(x, "minUptime", js.undefined)
      
      @scala.inline
      def setOutFile(value: String): Self = StObject.set(x, "outFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutFileUndefined: Self = StObject.set(x, "outFile", js.undefined)
      
      @scala.inline
      def setParser(value: (/* command */ String, /* args */ js.Array[String]) => Args): Self = StObject.set(x, "parser", js.Any.fromFunction2(value))
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      @scala.inline
      def setPidFile(value: String): Self = StObject.set(x, "pidFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPidFileUndefined: Self = StObject.set(x, "pidFile", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      @scala.inline
      def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDirUndefined: Self = StObject.set(x, "sourceDir", js.undefined)
      
      @scala.inline
      def setSpawnWith(value: SpawnWith): Self = StObject.set(x, "spawnWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpawnWithUndefined: Self = StObject.set(x, "spawnWith", js.undefined)
      
      @scala.inline
      def setSpinSleepTime(value: Double): Self = StObject.set(x, "spinSleepTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinSleepTimeUndefined: Self = StObject.set(x, "spinSleepTime", js.undefined)
      
      @scala.inline
      def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      @scala.inline
      def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchDirectory(value: String): Self = StObject.set(x, "watchDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchDirectoryUndefined: Self = StObject.set(x, "watchDirectory", js.undefined)
      
      @scala.inline
      def setWatchIgnoreDotFiles(value: Boolean): Self = StObject.set(x, "watchIgnoreDotFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchIgnoreDotFilesUndefined: Self = StObject.set(x, "watchIgnoreDotFiles", js.undefined)
      
      @scala.inline
      def setWatchIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "watchIgnorePatterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchIgnorePatternsUndefined: Self = StObject.set(x, "watchIgnorePatterns", js.undefined)
      
      @scala.inline
      def setWatchIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "watchIgnorePatterns", js.Array(value :_*))
      
      @scala.inline
      def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  @js.native
  trait SpawnWith extends StObject {
    
    var customFds: js.Array[Double] = js.native
    
    var gid: Double = js.native
    
    var setsid: Boolean = js.native
    
    var uid: Double = js.native
  }
  object SpawnWith {
    
    @scala.inline
    def apply(customFds: js.Array[Double], gid: Double, setsid: Boolean, uid: Double): SpawnWith = {
      val __obj = js.Dynamic.literal(customFds = customFds.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], setsid = setsid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpawnWith]
    }
    
    @scala.inline
    implicit class SpawnWithMutableBuilder[Self <: SpawnWith] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomFds(value: js.Array[Double]): Self = StObject.set(x, "customFds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomFdsVarargs(value: Double*): Self = StObject.set(x, "customFds", js.Array(value :_*))
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetsid(value: Boolean): Self = StObject.set(x, "setsid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
}
