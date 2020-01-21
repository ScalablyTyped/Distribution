package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Memory")
@js.native
object Memory extends js.Object {
  /**
    * Allocates `size` bytes of memory on Frida's private heap, or, if `size` is a multiple of Process#pageSize,
    * one or more raw memory pages managed by the OS. The allocated memory will be released when the returned
    * NativePointer value gets garbage collected. This means you need to keep a reference to it while the pointer
    * is being used by code outside the JavaScript runtime.
    *
    * @param size Number of bytes to allocate.
    */
  def alloc(size: Double): NativePointer = js.native
  def alloc(size: UInt64_): NativePointer = js.native
  /**
    * Allocates, encodes and writes out `str` as an ANSI string on Frida's private heap.
    * See Memory#alloc() for details about its lifetime.
    *
    * @param str String to allocate.
    */
  def allocAnsiString(str: String): NativePointer = js.native
  /**
    * Allocates, encodes and writes out `str` as a UTF-16 string on Frida's private heap.
    * See Memory#alloc() for details about its lifetime.
    *
    * @param str String to allocate.
    */
  def allocUtf16String(str: String): NativePointer = js.native
  /**
    * Allocates, encodes and writes out `str` as a UTF-8 string on Frida's private heap.
    * See Memory#alloc() for details about its lifetime.
    *
    * @param str String to allocate.
    */
  def allocUtf8String(str: String): NativePointer = js.native
  /**
    * Just like memcpy.
    *
    * @param dst Destination address.
    * @param src Sources address.
    * @param n Number of bytes to copy.
    */
  def copy(dst: NativePointerValue, src: NativePointerValue, n: Double): Unit = js.native
  def copy(dst: NativePointerValue, src: NativePointerValue, n: UInt64_): Unit = js.native
  /**
    * Short-hand for Memory#alloc() followed by Memory#copy(). See Memory#alloc() for details about lifetime.
    *
    * @param address Address to copy from.
    * @param size Number of bytes to copy.
    */
  def dup(address: NativePointerValue, size: Double): NativePointer = js.native
  def dup(address: NativePointerValue, size: UInt64_): NativePointer = js.native
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
  def patchCode(address: NativePointerValue, size: Double, apply: MemoryPatchApplyCallback): Unit = js.native
  def patchCode(address: NativePointerValue, size: UInt64_, apply: MemoryPatchApplyCallback): Unit = js.native
  /**
    * Changes the page protection on a region of memory.
    *
    * @param address Starting address.
    * @param size Number of bytes. Must be a multiple of Process#pageSize.
    * @param protection Desired page protection.
    */
  def protect(address: NativePointerValue, size: Double, protection: PageProtection): Boolean = js.native
  def protect(address: NativePointerValue, size: UInt64_, protection: PageProtection): Boolean = js.native
  /**
    * Scans memory for occurences of `pattern` in the memory range given by `address` and `size`.
    *
    * @param address Starting address to scan from.
    * @param size Number of bytes to scan.
    * @param pattern Match pattern of the form “13 37 ?? ff” to match 0x13 followed by 0x37 followed by any byte
    *                followed by 0xff. For more advanced matching it is also possible to specify an r2-style mask.
    *                The mask is bitwise AND-ed against both the needle and the haystack. To specify the mask append
    *                a `:` character after the needle, followed by the mask using the same syntax.
    *                For example: “13 37 13 37 : 1f ff ff f1”.
    *                For convenience it is also possible to specify nibble-level wildcards, like “?3 37 13 ?7”,
    *                which gets translated into masks behind the scenes.
    * @param callbacks Object with callbacks.
    */
  def scan(address: NativePointerValue, size: Double, pattern: String, callbacks: MemoryScanCallbacks): Unit = js.native
  def scan(address: NativePointerValue, size: UInt64_, pattern: String, callbacks: MemoryScanCallbacks): Unit = js.native
  /**
    * Synchronous version of `scan()`.
    *
    * @param address Starting address to scan from.
    * @param size Number of bytes to scan.
    * @param pattern Match pattern, see `Memory.scan()` for details.
    */
  def scanSync(address: NativePointerValue, size: Double, pattern: String): js.Array[MemoryScanMatch] = js.native
  def scanSync(address: NativePointerValue, size: UInt64_, pattern: String): js.Array[MemoryScanMatch] = js.native
}

