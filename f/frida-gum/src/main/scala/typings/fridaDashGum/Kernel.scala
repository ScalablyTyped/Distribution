package typings.fridaDashGum

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Kernel")
@js.native
object Kernel extends js.Object {
  /**
    * Whether the Kernel API is available.
    */
  val available: Boolean = js.native
  /**
    * Base address of the kernel. Can be overridden with any non-zero UInt64.
    */
  var base: UInt64 = js.native
  /**
    * Size of kernel page in bytes.
    */
  val pageSize: Double = js.native
  /**
    * Allocates kernel memory.
    *
    * @param size Size of the allocation in bytes (will be rounded up to a multiple of the kernel's page size).
    */
  def alloc(size: Double): UInt64 = js.native
  def alloc(size: UInt64): UInt64 = js.native
  /**
    * Enumerates all ranges of a kernel module.
    *
    * @param name Name of the module, or `null` for the module of the kernel itself.
    * @param protection Include ranges with at least this protection.
    */
  def enumerateModuleRanges(name: String, protection: PageProtection): js.Array[KernelModuleRangeDetails] = js.native
  def enumerateModuleRanges(name: Null, protection: PageProtection): js.Array[KernelModuleRangeDetails] = js.native
  /**
    * Enumerates kernel modules loaded right now.
    */
  def enumerateModules(): js.Array[KernelModuleDetails] = js.native
  def enumerateRanges(specifier: EnumerateRangesSpecifier): js.Array[KernelRangeDetails] = js.native
  /**
    * Enumerates all kernel memory ranges matching `specifier`.
    *
    * @param specifier The kind of ranges to include.
    */
  def enumerateRanges(specifier: PageProtection): js.Array[KernelRangeDetails] = js.native
  /**
    * Changes the page protection on a region of kernel memory.
    *
    * @param address Starting address.
    * @param size Number of bytes. Must be a multiple of Process#pageSize.
    * @param protection Desired page protection.
    */
  def protect(address: UInt64, size: Double, protection: PageProtection): Boolean = js.native
  def protect(address: UInt64, size: UInt64, protection: PageProtection): Boolean = js.native
  def readByteArray(address: UInt64, length: Double): ArrayBuffer | Null = js.native
  def readCString(address: UInt64, size: Double): String | Null = js.native
  def readDouble(address: UInt64): Double = js.native
  def readFloat(address: UInt64): Double = js.native
  def readInt(address: UInt64): Double = js.native
  def readLong(address: UInt64): Double | Int64 = js.native
  def readS16(address: UInt64): Double = js.native
  def readS32(address: UInt64): Double = js.native
  def readS64(address: UInt64): Int64 = js.native
  def readS8(address: UInt64): Double = js.native
  def readShort(address: UInt64): Double = js.native
  def readU16(address: UInt64): Double = js.native
  def readU32(address: UInt64): Double = js.native
  def readU64(address: UInt64): UInt64 = js.native
  def readU8(address: UInt64): Double = js.native
  def readUInt(address: UInt64): Double = js.native
  def readULong(address: UInt64): Double | UInt64 = js.native
  def readUShort(address: UInt64): Double = js.native
  def readUtf16String(address: UInt64, length: Double): String | Null = js.native
  def readUtf8String(address: UInt64, size: Double): String | Null = js.native
  /**
    * Scans kernel memory for occurences of `pattern` in the memory range given by `address` and `size`.
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
  def scan(address: UInt64, size: Double, pattern: String, callbacks: KernelMemoryScanCallbacks): Unit = js.native
  def scan(address: UInt64, size: UInt64, pattern: String, callbacks: KernelMemoryScanCallbacks): Unit = js.native
  /**
    * Synchronous version of `scan()`.
    *
    * @param address Starting address to scan from.
    * @param size Number of bytes to scan.
    * @param pattern Match pattern, see `Memory.scan()` for details.
    */
  def scanSync(address: UInt64, size: Double, pattern: String): js.Array[KernelMemoryScanMatch] = js.native
  def scanSync(address: UInt64, size: UInt64, pattern: String): js.Array[KernelMemoryScanMatch] = js.native
  def writeByteArray(address: UInt64, value: js.Array[Double]): Unit = js.native
  def writeByteArray(address: UInt64, value: ArrayBuffer): Unit = js.native
  def writeDouble(address: UInt64, value: Double): Unit = js.native
  def writeFloat(address: UInt64, value: Double): Unit = js.native
  def writeInt(address: UInt64, value: Double): Unit = js.native
  def writeInt(address: UInt64, value: Int64): Unit = js.native
  def writeLong(address: UInt64, value: Double): Unit = js.native
  def writeLong(address: UInt64, value: Int64): Unit = js.native
  def writeS16(address: UInt64, value: Double): Unit = js.native
  def writeS16(address: UInt64, value: Int64): Unit = js.native
  def writeS32(address: UInt64, value: Double): Unit = js.native
  def writeS32(address: UInt64, value: Int64): Unit = js.native
  def writeS64(address: UInt64, value: Double): Unit = js.native
  def writeS64(address: UInt64, value: Int64): Unit = js.native
  def writeS8(address: UInt64, value: Double): Unit = js.native
  def writeS8(address: UInt64, value: Int64): Unit = js.native
  def writeShort(address: UInt64, value: Double): Unit = js.native
  def writeShort(address: UInt64, value: Int64): Unit = js.native
  def writeU16(address: UInt64, value: Double): Unit = js.native
  def writeU16(address: UInt64, value: UInt64): Unit = js.native
  def writeU32(address: UInt64, value: Double): Unit = js.native
  def writeU32(address: UInt64, value: UInt64): Unit = js.native
  def writeU64(address: UInt64, value: Double): Unit = js.native
  def writeU64(address: UInt64, value: UInt64): Unit = js.native
  def writeU8(address: UInt64, value: Double): Unit = js.native
  def writeU8(address: UInt64, value: UInt64): Unit = js.native
  def writeUInt(address: UInt64, value: Double): Unit = js.native
  def writeUInt(address: UInt64, value: UInt64): Unit = js.native
  def writeULong(address: UInt64, value: Double): Unit = js.native
  def writeULong(address: UInt64, value: UInt64): Unit = js.native
  def writeUShort(address: UInt64, value: Double): Unit = js.native
  def writeUShort(address: UInt64, value: UInt64): Unit = js.native
  def writeUtf16String(address: UInt64, value: String): Unit = js.native
  def writeUtf8String(address: UInt64, value: String): Unit = js.native
}

