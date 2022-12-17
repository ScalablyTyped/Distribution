package typings.foreverMonitor

import typings.foreverMonitor.anon.Args
import typings.foreverMonitor.anon.Command
import typings.foreverMonitor.foreverMonitorBooleans.`false`
import typings.node.eventsMod.EventEmitter
import typings.node.processMod.global.NodeJS.ProcessEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("forever-monitor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("forever-monitor", "Monitor")
  @js.native
  open class Monitor protected () extends EventEmitter {
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
    def send(msg: Any): this.type = js.native
    
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
  
  inline def checkProcess(pid: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkProcess")(pid.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def kill(pid: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def kill(pid: Double, killTree: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pid.asInstanceOf[js.Any], killTree.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def kill(pid: Double, killTree: Boolean, signal: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pid.asInstanceOf[js.Any], killTree.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def kill(pid: Double, killTree: Boolean, signal: String, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pid.asInstanceOf[js.Any], killTree.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def kill(pid: Double, killTree: Boolean, signal: Unit, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pid.asInstanceOf[js.Any], killTree.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def kill(pid: Double, killTree: Unit, signal: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pid.asInstanceOf[js.Any], killTree.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def kill(pid: Double, killTree: Unit, signal: String, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pid.asInstanceOf[js.Any], killTree.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def kill(pid: Double, killTree: Unit, signal: Unit, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pid.asInstanceOf[js.Any], killTree.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def start(script: String): Monitor = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(script.asInstanceOf[js.Any]).asInstanceOf[Monitor]
  inline def start(script: String, options: Options): Monitor = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(script.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Monitor]
  inline def start(script: js.Array[String]): Monitor = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(script.asInstanceOf[js.Any]).asInstanceOf[Monitor]
  inline def start(script: js.Array[String], options: Options): Monitor = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(script.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Monitor]
  
  @JSImport("forever-monitor", "version")
  @js.native
  val version: String = js.native
  
  trait Options extends StObject {
    
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
    
    var parser: js.UndefOr[js.Function2[/* command */ String, /* args */ js.Array[String], Args]] = js.undefined
    
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setErrFile(value: String): Self = StObject.set(x, "errFile", value.asInstanceOf[js.Any])
      
      inline def setErrFileUndefined: Self = StObject.set(x, "errFile", js.undefined)
      
      inline def setKillTree(value: Boolean): Self = StObject.set(x, "killTree", value.asInstanceOf[js.Any])
      
      inline def setKillTreeUndefined: Self = StObject.set(x, "killTree", js.undefined)
      
      inline def setLogFile(value: String): Self = StObject.set(x, "logFile", value.asInstanceOf[js.Any])
      
      inline def setLogFileUndefined: Self = StObject.set(x, "logFile", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMinUptime(value: Double): Self = StObject.set(x, "minUptime", value.asInstanceOf[js.Any])
      
      inline def setMinUptimeUndefined: Self = StObject.set(x, "minUptime", js.undefined)
      
      inline def setOutFile(value: String): Self = StObject.set(x, "outFile", value.asInstanceOf[js.Any])
      
      inline def setOutFileUndefined: Self = StObject.set(x, "outFile", js.undefined)
      
      inline def setParser(value: (/* command */ String, /* args */ js.Array[String]) => Args): Self = StObject.set(x, "parser", js.Any.fromFunction2(value))
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setPidFile(value: String): Self = StObject.set(x, "pidFile", value.asInstanceOf[js.Any])
      
      inline def setPidFileUndefined: Self = StObject.set(x, "pidFile", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
      
      inline def setSourceDirUndefined: Self = StObject.set(x, "sourceDir", js.undefined)
      
      inline def setSpawnWith(value: SpawnWith): Self = StObject.set(x, "spawnWith", value.asInstanceOf[js.Any])
      
      inline def setSpawnWithUndefined: Self = StObject.set(x, "spawnWith", js.undefined)
      
      inline def setSpinSleepTime(value: Double): Self = StObject.set(x, "spinSleepTime", value.asInstanceOf[js.Any])
      
      inline def setSpinSleepTimeUndefined: Self = StObject.set(x, "spinSleepTime", js.undefined)
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchDirectory(value: String): Self = StObject.set(x, "watchDirectory", value.asInstanceOf[js.Any])
      
      inline def setWatchDirectoryUndefined: Self = StObject.set(x, "watchDirectory", js.undefined)
      
      inline def setWatchIgnoreDotFiles(value: Boolean): Self = StObject.set(x, "watchIgnoreDotFiles", value.asInstanceOf[js.Any])
      
      inline def setWatchIgnoreDotFilesUndefined: Self = StObject.set(x, "watchIgnoreDotFiles", js.undefined)
      
      inline def setWatchIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "watchIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setWatchIgnorePatternsUndefined: Self = StObject.set(x, "watchIgnorePatterns", js.undefined)
      
      inline def setWatchIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "watchIgnorePatterns", js.Array(value*))
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  trait SpawnWith extends StObject {
    
    var customFds: js.Array[Double]
    
    var gid: Double
    
    var setsid: Boolean
    
    var uid: Double
  }
  object SpawnWith {
    
    inline def apply(customFds: js.Array[Double], gid: Double, setsid: Boolean, uid: Double): SpawnWith = {
      val __obj = js.Dynamic.literal(customFds = customFds.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], setsid = setsid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpawnWith]
    }
    
    extension [Self <: SpawnWith](x: Self) {
      
      inline def setCustomFds(value: js.Array[Double]): Self = StObject.set(x, "customFds", value.asInstanceOf[js.Any])
      
      inline def setCustomFdsVarargs(value: Double*): Self = StObject.set(x, "customFds", js.Array(value*))
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setSetsid(value: Boolean): Self = StObject.set(x, "setsid", value.asInstanceOf[js.Any])
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
}
