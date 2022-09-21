package typings.easyXapiSupertest

import typings.easyXapiSupertest.childProcessMod.ChildProcess
import typings.easyXapiSupertest.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clusterMod {
  
  @JSImport("cluster", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cluster", "Worker")
  @js.native
  open class Worker_ () extends EventEmitter {
    
    def destroy(): Unit = js.native
    def destroy(signal: String): Unit = js.native
    
    def disconnect(): Unit = js.native
    
    var id: String = js.native
    
    def kill(): Unit = js.native
    def kill(signal: String): Unit = js.native
    
    var process: ChildProcess = js.native
    
    def send(message: Any): Unit = js.native
    def send(message: Any, sendHandle: Any): Unit = js.native
    
    var suicide: Boolean = js.native
  }
  
  inline def addListener(event: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def disconnect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")().asInstanceOf[Unit]
  inline def disconnect(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def emit(event: String, args: Any*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(List(event.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
  
  inline def fork(): Worker_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fork")().asInstanceOf[Worker_]
  inline def fork(env: Any): Worker_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fork")(env.asInstanceOf[js.Any]).asInstanceOf[Worker_]
  
  @JSImport("cluster", "isMaster")
  @js.native
  def isMaster: Boolean = js.native
  inline def isMaster_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMaster")(x.asInstanceOf[js.Any])
  
  @JSImport("cluster", "isWorker")
  @js.native
  def isWorker: Boolean = js.native
  inline def isWorker_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isWorker")(x.asInstanceOf[js.Any])
  
  inline def listeners(event: String): js.Array[js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("listeners")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Function]]
  
  inline def on(event: String, listener: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def once(event: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeAllListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")().asInstanceOf[Unit]
  inline def removeAllListeners(event: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeListener(event: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setMaxListeners(n: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxListeners")(n.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("cluster", "settings")
  @js.native
  def settings: ClusterSettings = js.native
  inline def settings_=(x: ClusterSettings): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("settings")(x.asInstanceOf[js.Any])
  
  inline def setupMaster(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupMaster")().asInstanceOf[Unit]
  inline def setupMaster(settings: ClusterSettings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupMaster")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("cluster", "worker")
  @js.native
  def worker: Worker_ = js.native
  inline def worker_=(x: Worker_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("worker")(x.asInstanceOf[js.Any])
  
  @JSImport("cluster", "workers")
  @js.native
  def workers: js.Array[Worker_] = js.native
  inline def workers_=(x: js.Array[Worker_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("workers")(x.asInstanceOf[js.Any])
  
  trait ClusterSettings extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    var exec: js.UndefOr[String] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object ClusterSettings {
    
    inline def apply(): ClusterSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterSettings]
    }
    
    extension [Self <: ClusterSettings](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setExec(value: String): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
      
      inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
}
