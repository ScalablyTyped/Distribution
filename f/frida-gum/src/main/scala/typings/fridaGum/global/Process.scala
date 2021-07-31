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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Process {
  
  @JSGlobal("Process")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Architecture of the current process.
    */
  @JSGlobal("Process.arch")
  @js.native
  val arch: Architecture = js.native
  
  /**
    * Whether Frida will avoid modifying existing code in memory and will not try to run unsigned code.
    * Currently this property will always be set to Optional unless you are using Gadget and have configured
    * it to assume that code-signing is required. This property allows you to determine whether the Interceptor
    * API is off limits, and whether it is safe to modify code or run unsigned code.
    */
  @JSGlobal("Process.codeSigningPolicy")
  @js.native
  val codeSigningPolicy: CodeSigningPolicy = js.native
  
  /**
    * Just like `enumerateRanges()`, but for individual memory allocations known to the system heap.
    */
  @scala.inline
  def enumerateMallocRanges(): js.Array[RangeDetails] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateMallocRanges")().asInstanceOf[js.Array[RangeDetails]]
  
  /**
    * Enumerates modules loaded right now.
    */
  @scala.inline
  def enumerateModules(): js.Array[typings.fridaGum.Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateModules")().asInstanceOf[js.Array[typings.fridaGum.Module]]
  
  @scala.inline
  def enumerateRanges(specifier: EnumerateRangesSpecifier): js.Array[RangeDetails] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateRanges")(specifier.asInstanceOf[js.Any]).asInstanceOf[js.Array[RangeDetails]]
  /**
    * Enumerates memory ranges satisfying `specifier`.
    *
    * @param specifier The kind of ranges to include.
    */
  @scala.inline
  def enumerateRanges(specifier: PageProtection): js.Array[RangeDetails] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateRanges")(specifier.asInstanceOf[js.Any]).asInstanceOf[js.Array[RangeDetails]]
  
  /**
    * Enumerates all threads.
    */
  @scala.inline
  def enumerateThreads(): js.Array[ThreadDetails] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateThreads")().asInstanceOf[js.Array[ThreadDetails]]
  
  /**
    * Looks up a module by address. Returns null if not found.
    */
  @scala.inline
  def findModuleByAddress(address: NativePointerValue): typings.fridaGum.Module | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findModuleByAddress")(address.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.Module | Null]
  
  /**
    * Looks up a module by name. Returns null if not found.
    */
  @scala.inline
  def findModuleByName(name: String): typings.fridaGum.Module | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findModuleByName")(name.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.Module | Null]
  
  /**
    * Looks up a memory range by address. Returns null if not found.
    */
  @scala.inline
  def findRangeByAddress(address: NativePointerValue): RangeDetails | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findRangeByAddress")(address.asInstanceOf[js.Any]).asInstanceOf[RangeDetails | Null]
  
  /**
    * Gets this thread’s OS-specific id.
    */
  @scala.inline
  def getCurrentThreadId(): ThreadId = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentThreadId")().asInstanceOf[ThreadId]
  
  /**
    * Looks up a module by address. Throws an exception if not found.
    */
  @scala.inline
  def getModuleByAddress(address: NativePointerValue): typings.fridaGum.Module = ^.asInstanceOf[js.Dynamic].applyDynamic("getModuleByAddress")(address.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.Module]
  
  /**
    * Looks up a module by name. Throws an exception if not found.
    */
  @scala.inline
  def getModuleByName(name: String): typings.fridaGum.Module = ^.asInstanceOf[js.Dynamic].applyDynamic("getModuleByName")(name.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.Module]
  
  /**
    * Looks up a memory range by address. Throws an exception if not found.
    */
  @scala.inline
  def getRangeByAddress(address: NativePointerValue): RangeDetails = ^.asInstanceOf[js.Dynamic].applyDynamic("getRangeByAddress")(address.asInstanceOf[js.Any]).asInstanceOf[RangeDetails]
  
  /**
    * PID of the current process.
    */
  @JSGlobal("Process.id")
  @js.native
  val id: Double = js.native
  
  /**
    * Determines whether a debugger is currently attached.
    */
  @scala.inline
  def isDebuggerAttached(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDebuggerAttached")().asInstanceOf[Boolean]
  
  /**
    * Size of a virtual memory page in bytes. This is used to make your scripts more portable.
    */
  @JSGlobal("Process.pageSize")
  @js.native
  val pageSize: Double = js.native
  
  /**
    * Platform of the current process.
    */
  @JSGlobal("Process.platform")
  @js.native
  val platform: Platform = js.native
  
  /**
    * Size of a pointer in bytes. This is used to make your scripts more portable.
    */
  @JSGlobal("Process.pointerSize")
  @js.native
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
  @scala.inline
  def setExceptionHandler(callback: ExceptionHandlerCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setExceptionHandler")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
