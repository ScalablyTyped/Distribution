package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Collection of Service related API function */
object services {
  
  @JSImport("flashpoint-launcher", "services")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a managed process given info, will die when disposed. (Does not start it)
    * @param name Name of the process
    * @param info Process info to run.
    * @param basePath Override for directory to start in (info is relative to this), Extension path if none given
    * @returns A managed process.
    */
  inline def createProcess(name: String, info: ProcessInfo, opts: ProcessOpts): DisposableChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("createProcess")(name.asInstanceOf[js.Any], info.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DisposableChildProcess]
  inline def createProcess(name: String, info: ProcessInfo, opts: ProcessOpts, basePath: String): DisposableChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("createProcess")(name.asInstanceOf[js.Any], info.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[DisposableChildProcess]
  
  /**
    * Returns the service info of all running services
    */
  inline def getServices(): js.Array[ManagedChildProcess] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServices")().asInstanceOf[js.Array[ManagedChildProcess]]
  
  @JSImport("flashpoint-launcher", "services.onServiceChange")
  @js.native
  val onServiceChange: Event[ServiceChange] = js.native
  
  // Events
  @JSImport("flashpoint-launcher", "services.onServiceNew")
  @js.native
  val onServiceNew: Event[ManagedChildProcess] = js.native
  
  @JSImport("flashpoint-launcher", "services.onServiceRemove")
  @js.native
  val onServiceRemove: Event[ManagedChildProcess] = js.native
  
  /**
    * Kills and removes a service process started by runService
    * @param process Service process to remove
    */
  inline def removeService(process: ManagedChildProcess): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeService")(process.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Runs a managed service given info, will die when the launcher exits.
    * @param name Name of the service
    * @param info Service info to run.
    * @param basePath Override for directory to start in (info is relative to this), Extension path if none given
    * @returns A managed process. Can be passed to removeService.
    */
  inline def runService(name: String, info: ProcessInfo, opts: ProcessOpts): ManagedChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("runService")(name.asInstanceOf[js.Any], info.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ManagedChildProcess]
  inline def runService(name: String, info: ProcessInfo, opts: ProcessOpts, basePath: String): ManagedChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("runService")(name.asInstanceOf[js.Any], info.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[ManagedChildProcess]
}
