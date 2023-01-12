package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageBuildOptions extends StObject {
  
  var abortSignal: js.UndefOr[AbortSignal] = js.undefined
  
  var authconfig: js.UndefOr[AuthConfig] = js.undefined
  
  var buildargs: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var cachefrom: js.UndefOr[String] = js.undefined
  
  var cpuperiod: js.UndefOr[Double] = js.undefined
  
  var cpuquota: js.UndefOr[Double] = js.undefined
  
  var cpusetcpus: js.UndefOr[Double] = js.undefined
  
  var cpushares: js.UndefOr[Double] = js.undefined
  
  var dockerfile: js.UndefOr[String] = js.undefined
  
  var extrahosts: js.UndefOr[String] = js.undefined
  
  var forcerm: js.UndefOr[Boolean] = js.undefined
  
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var memory: js.UndefOr[Double] = js.undefined
  
  var memswap: js.UndefOr[Double] = js.undefined
  
  var networkmode: js.UndefOr[String] = js.undefined
  
  var outputs: js.UndefOr[String] = js.undefined
  
  var platform: js.UndefOr[String] = js.undefined
  
  var pull: js.UndefOr[String] = js.undefined
  
  var q: js.UndefOr[Boolean] = js.undefined
  
  var registryconfig: js.UndefOr[RegistryConfig] = js.undefined
  
  var remote: js.UndefOr[String] = js.undefined
  
  var rm: js.UndefOr[Boolean] = js.undefined
  
  var shmsize: js.UndefOr[Double] = js.undefined
  
  var squash: js.UndefOr[Boolean] = js.undefined
  
  var t: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
}
object ImageBuildOptions {
  
  inline def apply(): ImageBuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageBuildOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageBuildOptions] (val x: Self) extends AnyVal {
    
    inline def setAbortSignal(value: AbortSignal): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
    
    inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
    
    inline def setAuthconfig(value: AuthConfig): Self = StObject.set(x, "authconfig", value.asInstanceOf[js.Any])
    
    inline def setAuthconfigUndefined: Self = StObject.set(x, "authconfig", js.undefined)
    
    inline def setBuildargs(value: StringDictionary[String]): Self = StObject.set(x, "buildargs", value.asInstanceOf[js.Any])
    
    inline def setBuildargsUndefined: Self = StObject.set(x, "buildargs", js.undefined)
    
    inline def setCachefrom(value: String): Self = StObject.set(x, "cachefrom", value.asInstanceOf[js.Any])
    
    inline def setCachefromUndefined: Self = StObject.set(x, "cachefrom", js.undefined)
    
    inline def setCpuperiod(value: Double): Self = StObject.set(x, "cpuperiod", value.asInstanceOf[js.Any])
    
    inline def setCpuperiodUndefined: Self = StObject.set(x, "cpuperiod", js.undefined)
    
    inline def setCpuquota(value: Double): Self = StObject.set(x, "cpuquota", value.asInstanceOf[js.Any])
    
    inline def setCpuquotaUndefined: Self = StObject.set(x, "cpuquota", js.undefined)
    
    inline def setCpusetcpus(value: Double): Self = StObject.set(x, "cpusetcpus", value.asInstanceOf[js.Any])
    
    inline def setCpusetcpusUndefined: Self = StObject.set(x, "cpusetcpus", js.undefined)
    
    inline def setCpushares(value: Double): Self = StObject.set(x, "cpushares", value.asInstanceOf[js.Any])
    
    inline def setCpusharesUndefined: Self = StObject.set(x, "cpushares", js.undefined)
    
    inline def setDockerfile(value: String): Self = StObject.set(x, "dockerfile", value.asInstanceOf[js.Any])
    
    inline def setDockerfileUndefined: Self = StObject.set(x, "dockerfile", js.undefined)
    
    inline def setExtrahosts(value: String): Self = StObject.set(x, "extrahosts", value.asInstanceOf[js.Any])
    
    inline def setExtrahostsUndefined: Self = StObject.set(x, "extrahosts", js.undefined)
    
    inline def setForcerm(value: Boolean): Self = StObject.set(x, "forcerm", value.asInstanceOf[js.Any])
    
    inline def setForcermUndefined: Self = StObject.set(x, "forcerm", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    inline def setMemswap(value: Double): Self = StObject.set(x, "memswap", value.asInstanceOf[js.Any])
    
    inline def setMemswapUndefined: Self = StObject.set(x, "memswap", js.undefined)
    
    inline def setNetworkmode(value: String): Self = StObject.set(x, "networkmode", value.asInstanceOf[js.Any])
    
    inline def setNetworkmodeUndefined: Self = StObject.set(x, "networkmode", js.undefined)
    
    inline def setOutputs(value: String): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setPull(value: String): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
    
    inline def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
    
    inline def setQ(value: Boolean): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setRegistryconfig(value: RegistryConfig): Self = StObject.set(x, "registryconfig", value.asInstanceOf[js.Any])
    
    inline def setRegistryconfigUndefined: Self = StObject.set(x, "registryconfig", js.undefined)
    
    inline def setRemote(value: String): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    inline def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
    
    inline def setRm(value: Boolean): Self = StObject.set(x, "rm", value.asInstanceOf[js.Any])
    
    inline def setRmUndefined: Self = StObject.set(x, "rm", js.undefined)
    
    inline def setShmsize(value: Double): Self = StObject.set(x, "shmsize", value.asInstanceOf[js.Any])
    
    inline def setShmsizeUndefined: Self = StObject.set(x, "shmsize", js.undefined)
    
    inline def setSquash(value: Boolean): Self = StObject.set(x, "squash", value.asInstanceOf[js.Any])
    
    inline def setSquashUndefined: Self = StObject.set(x, "squash", js.undefined)
    
    inline def setT(value: String): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
