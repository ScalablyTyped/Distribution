package typings.easyXapiSupertest

import typings.easyXapiSupertest.childProcessMod.ChildProcess
import typings.easyXapiSupertest.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clusterMod {
  
  @JSImport("cluster", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cluster", "Worker")
  @js.native
  class Worker_ () extends EventEmitter {
    
    def destroy(): Unit = js.native
    def destroy(signal: String): Unit = js.native
    
    def disconnect(): Unit = js.native
    
    var id: String = js.native
    
    def kill(): Unit = js.native
    def kill(signal: String): Unit = js.native
    
    var process: ChildProcess = js.native
    
    def send(message: js.Any): Unit = js.native
    def send(message: js.Any, sendHandle: js.Any): Unit = js.native
    
    var suicide: Boolean = js.native
  }
  
  @JSImport("cluster", "addListener")
  @js.native
  def addListener(event: String, listener: js.Function): Unit = js.native
  
  @JSImport("cluster", "disconnect")
  @js.native
  def disconnect(): Unit = js.native
  @JSImport("cluster", "disconnect")
  @js.native
  def disconnect(callback: js.Function): Unit = js.native
  
  @JSImport("cluster", "emit")
  @js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  
  @JSImport("cluster", "fork")
  @js.native
  def fork(): Worker_ = js.native
  @JSImport("cluster", "fork")
  @js.native
  def fork(env: js.Any): Worker_ = js.native
  
  @JSImport("cluster", "isMaster")
  @js.native
  def isMaster: Boolean = js.native
  @scala.inline
  def isMaster_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMaster")(x.asInstanceOf[js.Any])
  
  @JSImport("cluster", "isWorker")
  @js.native
  def isWorker: Boolean = js.native
  @scala.inline
  def isWorker_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isWorker")(x.asInstanceOf[js.Any])
  
  @JSImport("cluster", "listeners")
  @js.native
  def listeners(event: String): js.Array[js.Function] = js.native
  
  @JSImport("cluster", "on")
  @js.native
  def on(event: String, listener: js.Function): js.Any = js.native
  
  @JSImport("cluster", "once")
  @js.native
  def once(event: String, listener: js.Function): Unit = js.native
  
  @JSImport("cluster", "removeAllListeners")
  @js.native
  def removeAllListeners(): Unit = js.native
  @JSImport("cluster", "removeAllListeners")
  @js.native
  def removeAllListeners(event: String): Unit = js.native
  
  @JSImport("cluster", "removeListener")
  @js.native
  def removeListener(event: String, listener: js.Function): Unit = js.native
  
  @JSImport("cluster", "setMaxListeners")
  @js.native
  def setMaxListeners(n: Double): Unit = js.native
  
  @JSImport("cluster", "settings")
  @js.native
  def settings: ClusterSettings = js.native
  @scala.inline
  def settings_=(x: ClusterSettings): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("settings")(x.asInstanceOf[js.Any])
  
  @JSImport("cluster", "setupMaster")
  @js.native
  def setupMaster(): Unit = js.native
  @JSImport("cluster", "setupMaster")
  @js.native
  def setupMaster(settings: ClusterSettings): Unit = js.native
  
  @JSImport("cluster", "worker")
  @js.native
  def worker: Worker_ = js.native
  @scala.inline
  def worker_=(x: Worker_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("worker")(x.asInstanceOf[js.Any])
  
  @JSImport("cluster", "workers")
  @js.native
  def workers: js.Array[Worker_] = js.native
  @scala.inline
  def workers_=(x: js.Array[Worker_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("workers")(x.asInstanceOf[js.Any])
  
  @js.native
  trait ClusterSettings extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.native
    
    var exec: js.UndefOr[String] = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
  }
  object ClusterSettings {
    
    @scala.inline
    def apply(): ClusterSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterSettings]
    }
    
    @scala.inline
    implicit class ClusterSettingsMutableBuilder[Self <: ClusterSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setExec(value: String): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
}
