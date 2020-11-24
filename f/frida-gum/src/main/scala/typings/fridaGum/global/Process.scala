package typings.fridaGum.global

import typings.fridaGum.Architecture
import typings.fridaGum.CodeSigningPolicy
import typings.fridaGum.EnumerateRangesSpecifier
import typings.fridaGum.ExceptionHandlerCallback
import typings.fridaGum.NativePointerValue
import typings.fridaGum.PageProtection
import typings.fridaGum.Platform
import typings.fridaGum.RangeDetails
import typings.fridaGum.ThreadDetails
import typings.fridaGum.ThreadId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Process")
@js.native
object Process extends js.Object {
  
  /**
    * Architecture of the current process.
    */
  val arch: Architecture = js.native
  
  /**
    * Whether Frida will avoid modifying existing code in memory and will not try to run unsigned code.
    * Currently this property will always be set to Optional unless you are using Gadget and have configured
    * it to assume that code-signing is required. This property allows you to determine whether the Interceptor
    * API is off limits, and whether it is safe to modify code or run unsigned code.
    */
  val codeSigningPolicy: CodeSigningPolicy = js.native
  
  /**
    * Just like `enumerateRanges()`, but for individual memory allocations known to the system heap.
    */
  def enumerateMallocRanges(): js.Array[RangeDetails] = js.native
  
  /**
    * Enumerates modules loaded right now.
    */
  def enumerateModules(): js.Array[typings.fridaGum.Module] = js.native
  
  def enumerateRanges(specifier: EnumerateRangesSpecifier): js.Array[RangeDetails] = js.native
  /**
    * Enumerates memory ranges satisfying `specifier`.
    *
    * @param specifier The kind of ranges to include.
    */
  def enumerateRanges(specifier: PageProtection): js.Array[RangeDetails] = js.native
  
  /**
    * Enumerates all threads.
    */
  def enumerateThreads(): js.Array[ThreadDetails] = js.native
  
  /**
    * Looks up a module by address. Returns null if not found.
    */
  def findModuleByAddress(address: NativePointerValue): typings.fridaGum.Module | Null = js.native
  
  /**
    * Looks up a module by name. Returns null if not found.
    */
  def findModuleByName(name: String): typings.fridaGum.Module | Null = js.native
  
  /**
    * Looks up a memory range by address. Returns null if not found.
    */
  def findRangeByAddress(address: NativePointerValue): RangeDetails | Null = js.native
  
  /**
    * Gets this thread’s OS-specific id.
    */
  def getCurrentThreadId(): ThreadId = js.native
  
  /**
    * Looks up a module by address. Throws an exception if not found.
    */
  def getModuleByAddress(address: NativePointerValue): typings.fridaGum.Module = js.native
  
  /**
    * Looks up a module by name. Throws an exception if not found.
    */
  def getModuleByName(name: String): typings.fridaGum.Module = js.native
  
  /**
    * Looks up a memory range by address. Throws an exception if not found.
    */
  def getRangeByAddress(address: NativePointerValue): RangeDetails = js.native
  
  /**
    * PID of the current process.
    */
  val id: Double = js.native
  
  /**
    * Determines whether a debugger is currently attached.
    */
  def isDebuggerAttached(): Boolean = js.native
  
  /**
    * Size of a virtual memory page in bytes. This is used to make your scripts more portable.
    */
  val pageSize: Double = js.native
  
  /**
    * Platform of the current process.
    */
  val platform: Platform = js.native
  
  /**
    * Size of a pointer in bytes. This is used to make your scripts more portable.
    */
  val pointerSize: Double = js.native
  
  /**
    * Installs a process-wide exception handler callback that gets a chance to
    * handle native exceptions before the hosting process itself does.
    *
    * It is up to your callback to decide what to do with the exception.
    * It could for example:
    * - Log the issue.
    * - Notify your application through a `send()` followed by a blocking `recv()` for acknowledgement of the sent data
    *   being received.
    * - Modify registers and memory to recover from the exception.
    *
    * You should return `true` if you did handle the exception, in which case
    * Frida will resume the thread immediately. If you do not return `true`,
    * Frida will forward the exception to the hosting process' exception
    * handler, if it has one, or let the OS terminate the process.
    */
  def setExceptionHandler(callback: ExceptionHandlerCallback): Unit = js.native
}
