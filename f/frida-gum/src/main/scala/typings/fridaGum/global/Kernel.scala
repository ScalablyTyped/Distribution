package typings.fridaGum.global

import typings.fridaGum.ArrayBuffer
import typings.fridaGum.EnumerateRangesSpecifier
import typings.fridaGum.Int64
import typings.fridaGum.KernelMemoryScanCallbacks
import typings.fridaGum.KernelMemoryScanMatch
import typings.fridaGum.KernelModuleDetails
import typings.fridaGum.KernelModuleRangeDetails
import typings.fridaGum.KernelRangeDetails
import typings.fridaGum.PageProtection
import typings.fridaGum.UInt64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Kernel {
  
  @JSGlobal("Kernel")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Allocates kernel memory.
    *
    * @param size Size of the allocation in bytes (will be rounded up to a multiple of the kernel's page size).
    */
  inline def alloc(size: Double): UInt64 = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any]).asInstanceOf[UInt64]
  inline def alloc(size: UInt64): UInt64 = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any]).asInstanceOf[UInt64]
  
  /**
    * Whether the Kernel API is available.
    */
  @JSGlobal("Kernel.available")
  @js.native
  val available: Boolean = js.native
  
  /**
    * Base address of the kernel. Can be overridden with any non-zero UInt64.
    */
  @JSGlobal("Kernel.base")
  @js.native
  def base: UInt64 = js.native
  inline def base_=(x: UInt64): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base")(x.asInstanceOf[js.Any])
  
  /**
    * Enumerates all ranges of a kernel module.
    *
    * @param name Name of the module, or `null` for the module of the kernel itself.
    * @param protection Include ranges with at least this protection.
    */
  inline def enumerateModuleRanges(name: String, protection: PageProtection): js.Array[KernelModuleRangeDetails] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerateModuleRanges")(name.asInstanceOf[js.Any], protection.asInstanceOf[js.Any])).asInstanceOf[js.Array[KernelModuleRangeDetails]]
  inline def enumerateModuleRanges(name: Null, protection: PageProtection): js.Array[KernelModuleRangeDetails] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerateModuleRanges")(name.asInstanceOf[js.Any], protection.asInstanceOf[js.Any])).asInstanceOf[js.Array[KernelModuleRangeDetails]]
  
  /**
    * Enumerates kernel modules loaded right now.
    */
  inline def enumerateModules(): js.Array[KernelModuleDetails] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateModules")().asInstanceOf[js.Array[KernelModuleDetails]]
  
  inline def enumerateRanges(specifier: EnumerateRangesSpecifier): js.Array[KernelRangeDetails] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateRanges")(specifier.asInstanceOf[js.Any]).asInstanceOf[js.Array[KernelRangeDetails]]
  /**
    * Enumerates all kernel memory ranges matching `specifier`.
    *
    * @param specifier The kind of ranges to include.
    */
  inline def enumerateRanges(specifier: PageProtection): js.Array[KernelRangeDetails] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateRanges")(specifier.asInstanceOf[js.Any]).asInstanceOf[js.Array[KernelRangeDetails]]
  
  /**
    * Size of kernel page in bytes.
    */
  @JSGlobal("Kernel.pageSize")
  @js.native
  val pageSize: Double = js.native
  
  /**
    * Changes the page protection on a region of kernel memory.
    *
    * @param address Starting address.
    * @param size Number of bytes. Must be a multiple of Process#pageSize.
    * @param protection Desired page protection.
    */
  inline def protect(address: UInt64, size: Double, protection: PageProtection): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("protect")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any], protection.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def protect(address: UInt64, size: UInt64, protection: PageProtection): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("protect")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any], protection.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def readByteArray(address: UInt64, length: Double): ArrayBuffer | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("readByteArray")(address.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ArrayBuffer | Null]
  
  inline def readCString(address: UInt64, size: Double): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("readCString")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def readDouble(address: UInt64): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readDouble")(address.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readFloat(address: UInt64): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readFloat")(address.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readInt(address: UInt64): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readInt")(address.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readLong(address: UInt64): Double | Int64 = ^.asInstanceOf[js.Dynamic].applyDynamic("readLong")(address.asInstanceOf[js.Any]).asInstanceOf[Double | Int64]
  
  inline def readS16(address: UInt64): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readS16")(address.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readS32(address: UInt64): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readS32")(address.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readS64(address: UInt64): Int64 = ^.asInstanceOf[js.Dynamic].applyDynamic("readS64")(address.asInstanceOf[js.Any]).asInstanceOf[Int64]
  
  inline def readS8(address: UInt64): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readS8")(address.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readShort(address: UInt64): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readShort")(address.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readU16(address: UInt64): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readU16")(address.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readU32(address: UInt64): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readU32")(address.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readU64(address: UInt64): UInt64 = ^.asInstanceOf[js.Dynamic].applyDynamic("readU64")(address.asInstanceOf[js.Any]).asInstanceOf[UInt64]
  
  inline def readU8(address: UInt64): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readU8")(address.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readUInt(address: UInt64): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readUInt")(address.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readULong(address: UInt64): Double | UInt64 = ^.asInstanceOf[js.Dynamic].applyDynamic("readULong")(address.asInstanceOf[js.Any]).asInstanceOf[Double | UInt64]
  
  inline def readUShort(address: UInt64): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readUShort")(address.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readUtf16String(address: UInt64, length: Double): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("readUtf16String")(address.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def readUtf8String(address: UInt64, size: Double): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("readUtf8String")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  /**
    * Scans kernel memory for occurences of `pattern` in the memory range given by `address` and `size`.
    *
    * @param address Starting address to scan from.
    * @param size Number of bytes to scan.
    * @param pattern Match pattern, see `MatchPattern` for details.
    * @param callbacks Object with callbacks.
    */
  inline def scan(address: UInt64, size: Double, pattern: String, callbacks: KernelMemoryScanCallbacks): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def scan(
    address: UInt64,
    size: Double,
    pattern: typings.fridaGum.MatchPattern,
    callbacks: KernelMemoryScanCallbacks
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def scan(address: UInt64, size: UInt64, pattern: String, callbacks: KernelMemoryScanCallbacks): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def scan(
    address: UInt64,
    size: UInt64,
    pattern: typings.fridaGum.MatchPattern,
    callbacks: KernelMemoryScanCallbacks
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Synchronous version of `scan()`.
    *
    * @param address Starting address to scan from.
    * @param size Number of bytes to scan.
    * @param pattern Match pattern, see `Memory.scan()` for details.
    */
  inline def scanSync(address: UInt64, size: Double, pattern: String): js.Array[KernelMemoryScanMatch] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanSync")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[js.Array[KernelMemoryScanMatch]]
  inline def scanSync(address: UInt64, size: Double, pattern: typings.fridaGum.MatchPattern): js.Array[KernelMemoryScanMatch] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanSync")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[js.Array[KernelMemoryScanMatch]]
  inline def scanSync(address: UInt64, size: UInt64, pattern: String): js.Array[KernelMemoryScanMatch] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanSync")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[js.Array[KernelMemoryScanMatch]]
  inline def scanSync(address: UInt64, size: UInt64, pattern: typings.fridaGum.MatchPattern): js.Array[KernelMemoryScanMatch] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanSync")(address.asInstanceOf[js.Any], size.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[js.Array[KernelMemoryScanMatch]]
  
  inline def writeByteArray(address: UInt64, value: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeByteArray")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeByteArray(address: UInt64, value: ArrayBuffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeByteArray")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeDouble(address: UInt64, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDouble")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeFloat(address: UInt64, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFloat")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeInt(address: UInt64, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeInt")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeInt(address: UInt64, value: Int64): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeInt")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeLong(address: UInt64, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeLong")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeLong(address: UInt64, value: Int64): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeLong")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeS16(address: UInt64, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeS16")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeS16(address: UInt64, value: Int64): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeS16")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeS32(address: UInt64, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeS32")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeS32(address: UInt64, value: Int64): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeS32")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeS64(address: UInt64, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeS64")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeS64(address: UInt64, value: Int64): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeS64")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeS8(address: UInt64, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeS8")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeS8(address: UInt64, value: Int64): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeS8")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeShort(address: UInt64, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeShort")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeShort(address: UInt64, value: Int64): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeShort")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeU16(address: UInt64, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeU16")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeU16(address: UInt64, value: UInt64): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeU16")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeU32(address: UInt64, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeU32")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeU32(address: UInt64, value: UInt64): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeU32")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeU64(address: UInt64, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeU64")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeU64(address: UInt64, value: UInt64): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeU64")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeU8(address: UInt64, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeU8")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeU8(address: UInt64, value: UInt64): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeU8")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeUInt(address: UInt64, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUInt")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeUInt(address: UInt64, value: UInt64): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUInt")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeULong(address: UInt64, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeULong")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeULong(address: UInt64, value: UInt64): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeULong")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeUShort(address: UInt64, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUShort")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeUShort(address: UInt64, value: UInt64): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUShort")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeUtf16String(address: UInt64, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUtf16String")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeUtf8String(address: UInt64, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUtf8String")(address.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
