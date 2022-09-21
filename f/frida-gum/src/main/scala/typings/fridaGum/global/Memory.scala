package typings.fridaGum.global

import typings.fridaGum.MemoryAllocOptions
import typings.fridaGum.MemoryPatchApplyCallback
import typings.fridaGum.MemoryScanCallbacks
import typings.fridaGum.MemoryScanMatch
import typings.fridaGum.NativePointerValue
import typings.fridaGum.PageProtection
import typings.fridaGum.UInt64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Memory {
  
  @JSGlobal("Memory")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Allocates `size` bytes of memory on Frida's private heap, or, if `size` is a multiple of Process#pageSize,
    * one or more raw memory pages managed by the OS. The allocated memory will be released when the returned
    * NativePointer value gets garbage collected. This means you need to keep a reference to it while the pointer
    * is being used by code outside the JavaScript runtime.
    *
    * @param size Number of bytes to allocate.
    * @param options Options to customize the memory allocation.
    */
  inline def alloc(size: Double): typings.fridaGum.NativePointer = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.NativePointer]
  inline def alloc(size: Double, options: MemoryAllocOptions): typings.fridaGum.NativePointer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fridaGum.NativePointer]
  inline def alloc(size: UInt64): typings.fridaGum.NativePointer = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.NativePointer]
  inline def alloc(size: UInt64, options: MemoryAllocOptions): typings.fridaGum.NativePointer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fridaGum.NativePointer]
  
  /**
    * Allocates, encodes and writes out `str` as an ANSI string on Frida's private heap.
    * See Memory#alloc() for details about its lifetime.
    *
    * @param str String to allocate.
    */
  inline def allocAnsiString(str: String): typings.fridaGum.NativePointer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocAnsiString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.NativePointer]
  
  /**
    * Allocates, encodes and writes out `str` as a UTF-16 string on Frida's private heap.
    * See Memory#alloc() for details about its lifetime.
    *
    * @param str String to allocate.
    */
  inline def allocUtf16String(str: String): typings.fridaGum.NativePointer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocUtf16String")(str.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.NativePointer]
  
  /**
    * Allocates, encodes and writes out `str` as a UTF-8 string on Frida's private heap.
    * See Memory#alloc() for details about its lifetime.
    *
    * @param str String to allocate.
    */
  inline def allocUtf8String(str: String): typings.fridaGum.NativePointer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocUtf8String")(str.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.NativePointer]
  
  /**
    * Just like memcpy.
    *
    * @param dst Destination address.
    * @param src Sources address.
    * @param n Number of bytes to copy.
    */
  inline def copy(dst: NativePointerValue, src: NativePointerValue, n: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(dst.asInstanceOf[js.Any], src.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copy(dst: NativePointerValue, src: NativePointerValue, n: UInt64): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(dst.asInstanceOf[js.Any], src.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Short-hand for Memory#alloc() followed by Memory#copy(). See Memory#alloc() for details about lifetime.
    *
    * @param address Address to copy from.
    * @param size Number of bytes to copy.
    */
  inline def dup(address: NativePointerValue, size: Double): typings.fridaGum.NativePointer = (^.asInstanceOf[js.Dynamic].applyDynamic("dup")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.fridaGum.NativePointer]
  inline def dup(address: NativePointerValue, size: UInt64): typings.fridaGum.NativePointer = (^.asInstanceOf[js.Dynamic].applyDynamic("dup")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.fridaGum.NativePointer]
  
  /**
    * Safely modifies `size` bytes at `address`. The supplied function `apply` gets called with a writable pointer
    * where you must write the desired modifications before returning. Do not make any assumptions about this being
    * the same location as address, as some systems require modifications to be written to a temporary location before
    * being mapped into memory on top of the original memory page (e.g. on iOS, where directly modifying in-memory
    * code may result in the process losing its CS_VALID status).
    *
    * @param address Starting address to modify.
    * @param size Number of bytes to modify.
    * @param apply Function that applies the desired changes.
    */
  inline def patchCode(address: NativePointerValue, size: Double, apply: MemoryPatchApplyCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("patchCode")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any], apply.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def patchCode(address: NativePointerValue, size: UInt64, apply: MemoryPatchApplyCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("patchCode")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any], apply.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Changes the page protection on a region of memory.
    *
    * @param address Starting address.
    * @param size Number of bytes. Must be a multiple of Process#pageSize.
    * @param protection Desired page protection.
    */
  inline def protect(address: NativePointerValue, size: Double, protection: PageProtection): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("protect")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any], protection.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def protect(address: NativePointerValue, size: UInt64, protection: PageProtection): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("protect")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any], protection.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Scans memory for occurences of `pattern` in the memory range given by `address` and `size`.
    *
    * @param address Starting address to scan from.
    * @param size Number of bytes to scan.
    * @param pattern Match pattern, see `MatchPattern` for details.
    * @param callbacks Object with callbacks.
    */
  inline def scan(address: NativePointerValue, size: Double, pattern: String, callbacks: MemoryScanCallbacks): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def scan(
    address: NativePointerValue,
    size: Double,
    pattern: typings.fridaGum.MatchPattern,
    callbacks: MemoryScanCallbacks
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def scan(address: NativePointerValue, size: UInt64, pattern: String, callbacks: MemoryScanCallbacks): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def scan(
    address: NativePointerValue,
    size: UInt64,
    pattern: typings.fridaGum.MatchPattern,
    callbacks: MemoryScanCallbacks
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Synchronous version of `scan()`.
    *
    * @param address Starting address to scan from.
    * @param size Number of bytes to scan.
    * @param pattern Match pattern, see `MatchPattern` for details.
    */
  inline def scanSync(address: NativePointerValue, size: Double, pattern: String): js.Array[MemoryScanMatch] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanSync")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[js.Array[MemoryScanMatch]]
  inline def scanSync(address: NativePointerValue, size: Double, pattern: typings.fridaGum.MatchPattern): js.Array[MemoryScanMatch] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanSync")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[js.Array[MemoryScanMatch]]
  inline def scanSync(address: NativePointerValue, size: UInt64, pattern: String): js.Array[MemoryScanMatch] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanSync")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[js.Array[MemoryScanMatch]]
  inline def scanSync(address: NativePointerValue, size: UInt64, pattern: typings.fridaGum.MatchPattern): js.Array[MemoryScanMatch] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanSync")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[js.Array[MemoryScanMatch]]
}
