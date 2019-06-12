package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Kernel")
@js.native
object KernelNs extends js.Object {
  /**
    * Whether the Kernel API is available.
    */
  val available: scala.Boolean = js.native
  /**
    * Base address of the kernel. Can be overridden with any non-zero UInt64.
    */
  var base: fridaDashGumLib.UInt64 = js.native
  /**
    * Size of kernel page in bytes.
    */
  val pageSize: scala.Double = js.native
  def alloc(size: fridaDashGumLib.UInt64): fridaDashGumLib.UInt64 = js.native
  /**
    * Allocates kernel memory.
    *
    * @param size Size of the allocation in bytes (will be rounded up to a multiple of the kernel's page size).
    */
  def alloc(size: scala.Double): fridaDashGumLib.UInt64 = js.native
  /**
    * Enumerates all ranges of a kernel module.
    *
    * @param name Name of the module, or `null` for the module of the kernel itself.
    * @param protection Include ranges with at least this protection.
    */
  def enumerateModuleRanges(name: java.lang.String, protection: fridaDashGumLib.PageProtection): js.Array[fridaDashGumLib.KernelModuleRangeDetails] = js.native
  def enumerateModuleRanges(name: scala.Null, protection: fridaDashGumLib.PageProtection): js.Array[fridaDashGumLib.KernelModuleRangeDetails] = js.native
  /**
    * Enumerates kernel modules loaded right now.
    */
  def enumerateModules(): js.Array[fridaDashGumLib.KernelModuleDetails] = js.native
  def enumerateRanges(specifier: fridaDashGumLib.EnumerateRangesSpecifier): js.Array[fridaDashGumLib.KernelRangeDetails] = js.native
  /**
    * Enumerates all kernel memory ranges matching `specifier`.
    *
    * @param specifier The kind of ranges to include.
    */
  def enumerateRanges(specifier: fridaDashGumLib.PageProtection): js.Array[fridaDashGumLib.KernelRangeDetails] = js.native
  def protect(
    address: fridaDashGumLib.UInt64,
    size: fridaDashGumLib.UInt64,
    protection: fridaDashGumLib.PageProtection
  ): scala.Boolean = js.native
  /**
    * Changes the page protection on a region of kernel memory.
    *
    * @param address Starting address.
    * @param size Number of bytes. Must be a multiple of Process#pageSize.
    * @param protection Desired page protection.
    */
  def protect(address: fridaDashGumLib.UInt64, size: scala.Double, protection: fridaDashGumLib.PageProtection): scala.Boolean = js.native
  def readByteArray(address: fridaDashGumLib.UInt64, length: scala.Double): stdLib.ArrayBuffer | scala.Null = js.native
  def readCString(address: fridaDashGumLib.UInt64, size: scala.Double): java.lang.String | scala.Null = js.native
  def readDouble(address: fridaDashGumLib.UInt64): scala.Double = js.native
  def readFloat(address: fridaDashGumLib.UInt64): scala.Double = js.native
  def readInt(address: fridaDashGumLib.UInt64): scala.Double = js.native
  def readLong(address: fridaDashGumLib.UInt64): scala.Double | fridaDashGumLib.Int64 = js.native
  def readS16(address: fridaDashGumLib.UInt64): scala.Double = js.native
  def readS32(address: fridaDashGumLib.UInt64): scala.Double = js.native
  def readS64(address: fridaDashGumLib.UInt64): fridaDashGumLib.Int64 = js.native
  def readS8(address: fridaDashGumLib.UInt64): scala.Double = js.native
  def readShort(address: fridaDashGumLib.UInt64): scala.Double = js.native
  def readU16(address: fridaDashGumLib.UInt64): scala.Double = js.native
  def readU32(address: fridaDashGumLib.UInt64): scala.Double = js.native
  def readU64(address: fridaDashGumLib.UInt64): fridaDashGumLib.UInt64 = js.native
  def readU8(address: fridaDashGumLib.UInt64): scala.Double = js.native
  def readUInt(address: fridaDashGumLib.UInt64): scala.Double = js.native
  def readULong(address: fridaDashGumLib.UInt64): scala.Double | fridaDashGumLib.UInt64 = js.native
  def readUShort(address: fridaDashGumLib.UInt64): scala.Double = js.native
  def readUtf16String(address: fridaDashGumLib.UInt64, length: scala.Double): java.lang.String | scala.Null = js.native
  def readUtf8String(address: fridaDashGumLib.UInt64, size: scala.Double): java.lang.String | scala.Null = js.native
  def scan(
    address: fridaDashGumLib.UInt64,
    size: fridaDashGumLib.UInt64,
    pattern: java.lang.String,
    callbacks: fridaDashGumLib.KernelMemoryScanCallbacks
  ): scala.Unit = js.native
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
  def scan(
    address: fridaDashGumLib.UInt64,
    size: scala.Double,
    pattern: java.lang.String,
    callbacks: fridaDashGumLib.KernelMemoryScanCallbacks
  ): scala.Unit = js.native
  def scanSync(address: fridaDashGumLib.UInt64, size: fridaDashGumLib.UInt64, pattern: java.lang.String): js.Array[fridaDashGumLib.KernelMemoryScanMatch] = js.native
  /**
    * Synchronous version of `scan()`.
    *
    * @param address Starting address to scan from.
    * @param size Number of bytes to scan.
    * @param pattern Match pattern, see `Memory.scan()` for details.
    */
  def scanSync(address: fridaDashGumLib.UInt64, size: scala.Double, pattern: java.lang.String): js.Array[fridaDashGumLib.KernelMemoryScanMatch] = js.native
  def writeByteArray(address: fridaDashGumLib.UInt64, value: js.Array[scala.Double]): scala.Unit = js.native
  def writeByteArray(address: fridaDashGumLib.UInt64, value: stdLib.ArrayBuffer): scala.Unit = js.native
  def writeDouble(address: fridaDashGumLib.UInt64, value: scala.Double): scala.Unit = js.native
  def writeFloat(address: fridaDashGumLib.UInt64, value: scala.Double): scala.Unit = js.native
  def writeInt(address: fridaDashGumLib.UInt64, value: fridaDashGumLib.Int64): scala.Unit = js.native
  def writeInt(address: fridaDashGumLib.UInt64, value: scala.Double): scala.Unit = js.native
  def writeLong(address: fridaDashGumLib.UInt64, value: fridaDashGumLib.Int64): scala.Unit = js.native
  def writeLong(address: fridaDashGumLib.UInt64, value: scala.Double): scala.Unit = js.native
  def writeS16(address: fridaDashGumLib.UInt64, value: fridaDashGumLib.Int64): scala.Unit = js.native
  def writeS16(address: fridaDashGumLib.UInt64, value: scala.Double): scala.Unit = js.native
  def writeS32(address: fridaDashGumLib.UInt64, value: fridaDashGumLib.Int64): scala.Unit = js.native
  def writeS32(address: fridaDashGumLib.UInt64, value: scala.Double): scala.Unit = js.native
  def writeS64(address: fridaDashGumLib.UInt64, value: fridaDashGumLib.Int64): scala.Unit = js.native
  def writeS64(address: fridaDashGumLib.UInt64, value: scala.Double): scala.Unit = js.native
  def writeS8(address: fridaDashGumLib.UInt64, value: fridaDashGumLib.Int64): scala.Unit = js.native
  def writeS8(address: fridaDashGumLib.UInt64, value: scala.Double): scala.Unit = js.native
  def writeShort(address: fridaDashGumLib.UInt64, value: fridaDashGumLib.Int64): scala.Unit = js.native
  def writeShort(address: fridaDashGumLib.UInt64, value: scala.Double): scala.Unit = js.native
  def writeU16(address: fridaDashGumLib.UInt64, value: fridaDashGumLib.UInt64): scala.Unit = js.native
  def writeU16(address: fridaDashGumLib.UInt64, value: scala.Double): scala.Unit = js.native
  def writeU32(address: fridaDashGumLib.UInt64, value: fridaDashGumLib.UInt64): scala.Unit = js.native
  def writeU32(address: fridaDashGumLib.UInt64, value: scala.Double): scala.Unit = js.native
  def writeU64(address: fridaDashGumLib.UInt64, value: fridaDashGumLib.UInt64): scala.Unit = js.native
  def writeU64(address: fridaDashGumLib.UInt64, value: scala.Double): scala.Unit = js.native
  def writeU8(address: fridaDashGumLib.UInt64, value: fridaDashGumLib.UInt64): scala.Unit = js.native
  def writeU8(address: fridaDashGumLib.UInt64, value: scala.Double): scala.Unit = js.native
  def writeUInt(address: fridaDashGumLib.UInt64, value: fridaDashGumLib.UInt64): scala.Unit = js.native
  def writeUInt(address: fridaDashGumLib.UInt64, value: scala.Double): scala.Unit = js.native
  def writeULong(address: fridaDashGumLib.UInt64, value: fridaDashGumLib.UInt64): scala.Unit = js.native
  def writeULong(address: fridaDashGumLib.UInt64, value: scala.Double): scala.Unit = js.native
  def writeUShort(address: fridaDashGumLib.UInt64, value: fridaDashGumLib.UInt64): scala.Unit = js.native
  def writeUShort(address: fridaDashGumLib.UInt64, value: scala.Double): scala.Unit = js.native
  def writeUtf16String(address: fridaDashGumLib.UInt64, value: java.lang.String): scala.Unit = js.native
  def writeUtf8String(address: fridaDashGumLib.UInt64, value: java.lang.String): scala.Unit = js.native
}

