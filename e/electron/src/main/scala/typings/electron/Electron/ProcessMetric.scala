package typings.electron.Electron

import typings.electron.electronStrings.Browser
import typings.electron.electronStrings.GPU
import typings.electron.electronStrings.Tab
import typings.electron.electronStrings.Unknown
import typings.electron.electronStrings.Utility
import typings.electron.electronStrings.Zygote
import typings.electron.electronStrings.`Pepper Plugin Broker`
import typings.electron.electronStrings.`Pepper Plugin`
import typings.electron.electronStrings.`Sandbox helper`
import typings.electron.electronStrings.high
import typings.electron.electronStrings.low
import typings.electron.electronStrings.medium
import typings.electron.electronStrings.unknown_
import typings.electron.electronStrings.untrusted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessMetric extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/process-metric
  /**
    * CPU usage of the process.
    */
  var cpu: CPUUsage
  
  /**
    * Creation time for this process. The time is represented as number of
    * milliseconds since epoch. Since the `pid` can be reused after a process dies, it
    * is useful to use both the `pid` and the `creationTime` to uniquely identify a
    * process.
    */
  var creationTime: Double
  
  /**
    * One of the following values:
    *
    * @platform win32
    */
  var integrityLevel: js.UndefOr[untrusted | low | medium | high | unknown_] = js.undefined
  
  /**
    * Memory information for the process.
    */
  var memory: MemoryInfo
  
  /**
    * The name of the process. i.e. for plugins it might be Flash. Examples for
    * utility: `Audio Service`, `Content Decryption Module Service`, `Network
    * Service`, `Video Capture`, etc.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Process id of the process.
    */
  var pid: Double
  
  /**
    * Whether the process is sandboxed on OS level.
    *
    * @platform darwin,win32
    */
  var sandboxed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Process type. One of the following values:
    */
  var `type`: Browser | Tab | Utility | Zygote | (`Sandbox helper`) | GPU | (`Pepper Plugin`) | (`Pepper Plugin Broker`) | Unknown
}
object ProcessMetric {
  
  inline def apply(
    cpu: CPUUsage,
    creationTime: Double,
    memory: MemoryInfo,
    pid: Double,
    `type`: Browser | Tab | Utility | Zygote | (`Sandbox helper`) | GPU | (`Pepper Plugin`) | (`Pepper Plugin Broker`) | Unknown
  ): ProcessMetric = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessMetric]
  }
  
  extension [Self <: ProcessMetric](x: Self) {
    
    inline def setCpu(value: CPUUsage): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: Double): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setIntegrityLevel(value: untrusted | low | medium | high | unknown_): Self = StObject.set(x, "integrityLevel", value.asInstanceOf[js.Any])
    
    inline def setIntegrityLevelUndefined: Self = StObject.set(x, "integrityLevel", js.undefined)
    
    inline def setMemory(value: MemoryInfo): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setSandboxed(value: Boolean): Self = StObject.set(x, "sandboxed", value.asInstanceOf[js.Any])
    
    inline def setSandboxedUndefined: Self = StObject.set(x, "sandboxed", js.undefined)
    
    inline def setType(
      value: Browser | Tab | Utility | Zygote | (`Sandbox helper`) | GPU | (`Pepper Plugin`) | (`Pepper Plugin Broker`) | Unknown
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
