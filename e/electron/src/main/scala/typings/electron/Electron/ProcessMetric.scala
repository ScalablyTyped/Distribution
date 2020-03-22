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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessMetric extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/process-metric
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
  @scala.inline
  def apply(
    cpu: CPUUsage,
    creationTime: Double,
    memory: MemoryInfo,
    pid: Double,
    `type`: Browser | Tab | Utility | Zygote | (`Sandbox helper`) | GPU | (`Pepper Plugin`) | (`Pepper Plugin Broker`) | Unknown,
    integrityLevel: untrusted | low | medium | high | unknown_ = null,
    sandboxed: js.UndefOr[Boolean] = js.undefined
  ): ProcessMetric = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (integrityLevel != null) __obj.updateDynamic("integrityLevel")(integrityLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(sandboxed)) __obj.updateDynamic("sandboxed")(sandboxed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessMetric]
  }
}

