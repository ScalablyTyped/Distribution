package typings.electron.Electron

import typings.electron.electronStrings.ignore
import typings.electron.electronStrings.inherit
import typings.electron.electronStrings.pipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForkOptions extends StObject {
  
  /**
    * With this flag, the utility process will be launched via the `Electron Helper
    * (Plugin).app` helper executable on macOS, which can be codesigned with
    * `com.apple.security.cs.disable-library-validation` and
    * `com.apple.security.cs.allow-unsigned-executable-memory` entitlements. This will
    * allow the utility process to load unsigned libraries. Unless you specifically
    * need this capability, it is best to leave this disabled. Default is `false`.
    *
    * @platform darwin
    */
  var allowLoadingUnsignedLibraries: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Current working directory of the child process.
    */
  var cwd: js.UndefOr[String] = js.undefined
  
  /**
    * Environment key-value pairs. Default is `process.env`.
    */
  var env: js.UndefOr[Env] = js.undefined
  
  /**
    * List of string arguments passed to the executable.
    */
  var execArgv: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Name of the process that will appear in `name` property of `child-process-gone`
    * event of `app`. Default is `node.mojom.NodeService`.
    */
  var serviceName: js.UndefOr[String] = js.undefined
  
  /**
    * Allows configuring the mode for `stdout` and `stderr` of the child process.
    * Default is `inherit`. String value can be one of `pipe`, `ignore`, `inherit`,
    * for more details on these values you can refer to stdio documentation from
    * Node.js. Currently this option only supports configuring `stdout` and `stderr`
    * to either `pipe`, `inherit` or `ignore`. Configuring `stdin` is not supported;
    * `stdin` will always be ignored. For example, the supported values will be
    * processed as following:
    */
  var stdio: js.UndefOr[(js.Array[pipe | ignore | inherit]) | String] = js.undefined
}
object ForkOptions {
  
  inline def apply(): ForkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForkOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForkOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowLoadingUnsignedLibraries(value: Boolean): Self = StObject.set(x, "allowLoadingUnsignedLibraries", value.asInstanceOf[js.Any])
    
    inline def setAllowLoadingUnsignedLibrariesUndefined: Self = StObject.set(x, "allowLoadingUnsignedLibraries", js.undefined)
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setEnv(value: Env): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setExecArgv(value: js.Array[String]): Self = StObject.set(x, "execArgv", value.asInstanceOf[js.Any])
    
    inline def setExecArgvUndefined: Self = StObject.set(x, "execArgv", js.undefined)
    
    inline def setExecArgvVarargs(value: String*): Self = StObject.set(x, "execArgv", js.Array(value*))
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setStdio(value: (js.Array[pipe | ignore | inherit]) | String): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
    
    inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
    
    inline def setStdioVarargs(value: (pipe | ignore | inherit)*): Self = StObject.set(x, "stdio", js.Array(value*))
  }
}
