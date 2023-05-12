package typings.fsExtra

import typings.fsExtra.fsExtraStrings.buffer
import typings.node.NodeJS.ArrayBufferView
import typings.node.NodeJS.ErrnoException
import typings.node.anon.Encoding
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.anon.ObjectEncodingOptionsflag
import typings.node.anon.ObjectEncodingOptionswith
import typings.node.anon.ObjectEncodingOptionswithEncoding
import typings.node.anon.Recursive
import typings.node.anon.StatOptionsbigintfalseund
import typings.node.anon.StatOptionsbiginttrue
import typings.node.anon.`2`
import typings.node.anon.encodingBufferEncodingflaEncoding
import typings.node.anon.encodingnullundefinedflagEncoding
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.BufferEncodingOption
import typings.node.fsMod.Dir
import typings.node.fsMod.Dirent
import typings.node.fsMod.EncodingOption
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.OpenDirOptions
import typings.node.fsMod.OpenMode
import typings.node.fsMod.PathLike
import typings.node.fsMod.PathOrFileDescriptor
import typings.node.fsMod.ReadAsyncOptions
import typings.node.fsMod.ReadPosition
import typings.node.fsMod.RmDirOptions
import typings.node.fsMod.RmOptions
import typings.node.fsMod.StatOptions
import typings.node.fsMod.Stats
import typings.node.fsMod.TimeLike
import typings.node.fsMod.WriteFileOptions
import typings.node.fsMod.symlink.Type
import typings.std.BigInt64Array
import typings.std.BigUint64Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Native extends StObject {
    
    def native(path: PathLike): js.Promise[String] = js.native
    def native(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = js.native
    def native(path: PathLike, options: EncodingOption): js.Promise[String] = js.native
  }
  
  @js.native
  trait Typeofaccess extends StObject {
    
    def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, mode: Double, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, mode: Unit, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait TypeofappendFile extends StObject {
    
    def apply(file: PathOrFileDescriptor, data: String, callback: NoParamCallback): Unit = js.native
    def apply(file: PathOrFileDescriptor, data: js.typedarray.Uint8Array, callback: NoParamCallback): Unit = js.native
    def apply(path: PathOrFileDescriptor, data: String, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
    def apply(
      path: PathOrFileDescriptor,
      data: js.typedarray.Uint8Array,
      options: WriteFileOptions,
      callback: NoParamCallback
    ): Unit = js.native
  }
  
  @js.native
  trait Typeofchmod extends StObject {
    
    def apply(path: PathLike, mode: Mode, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeofchown extends StObject {
    
    def apply(path: PathLike, uid: Double, gid: Double, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeofclose extends StObject {
    
    def apply(fd: Double): Unit = js.native
    def apply(fd: Double, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait TypeofcopyFile extends StObject {
    
    def apply(src: PathLike, dest: PathLike, callback: NoParamCallback): Unit = js.native
    def apply(src: PathLike, dest: PathLike, mode: Double, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeofexists extends StObject {
    
    def apply(path: PathLike, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
  }
  
  @js.native
  trait Typeoffchmod extends StObject {
    
    def apply(fd: Double, mode: Mode, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeoffchown extends StObject {
    
    def apply(fd: Double, uid: Double, gid: Double, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeoffdatasync extends StObject {
    
    def apply(fd: Double, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeoffstat extends StObject {
    
    def apply(fd: Double, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
    def apply(
      fd: Double,
      options: Unit,
      callback: js.Function2[ErrnoException | Null, BigIntStats | (/* stats */ Stats), Unit]
    ): Unit = js.native
    def apply(
      fd: Double,
      options: StatOptionsbigintfalseund,
      callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]
    ): Unit = js.native
    def apply(
      fd: Double,
      options: StatOptionsbiginttrue,
      callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ BigIntStats, Unit]
    ): Unit = js.native
    def apply(
      fd: Double,
      options: StatOptions,
      callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats | BigIntStats, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Typeoffsync extends StObject {
    
    def apply(fd: Double, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeofftruncate extends StObject {
    
    def apply(fd: Double, callback: NoParamCallback): Unit = js.native
    def apply(fd: Double, len: Double, callback: NoParamCallback): Unit = js.native
    def apply(fd: Double, len: Null, callback: NoParamCallback): Unit = js.native
    def apply(fd: Double, len: Unit, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeoffutimes extends StObject {
    
    def apply(fd: Double, atime: TimeLike, mtime: TimeLike, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeoflchmod extends StObject {
    
    def apply(path: PathLike, mode: Mode, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeoflchown extends StObject {
    
    def apply(path: PathLike, uid: Double, gid: Double, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeoflink extends StObject {
    
    def apply(existingPath: PathLike, newPath: PathLike, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeoflstat extends StObject {
    
    def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
    def apply(
      path: PathLike,
      options: Unit,
      callback: js.Function2[ErrnoException | Null, BigIntStats | (/* stats */ Stats), Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: StatOptionsbigintfalseund,
      callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: StatOptionsbiginttrue,
      callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ BigIntStats, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: StatOptions,
      callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats | BigIntStats, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Typeofmkdir extends StObject {
    
    def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
    def apply(
      path: PathLike,
      options: Null,
      callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def apply(path: PathLike, options: Null, callback: NoParamCallback): Unit = js.native
    def apply(
      path: PathLike,
      options: Unit,
      callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def apply(path: PathLike, options: Unit, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecurMode, callback: NoParamCallback): Unit = js.native
    def apply(
      path: PathLike,
      options: MakeDirectoryOptionsrecur,
      callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: MakeDirectoryOptions,
      callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: Mode,
      callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def apply(path: PathLike, options: Mode, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeofmkdtemp extends StObject {
    
    def apply(prefix: String, callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String, Unit]): Unit = js.native
    def apply(
      prefix: String,
      options: buffer,
      callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
    ): Unit = js.native
    def apply(
      prefix: String,
      options: `2`,
      callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
    ): Unit = js.native
    def apply(
      prefix: String,
      options: EncodingOption,
      callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ String), Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Typeofopen extends StObject {
    
    def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]): Unit = js.native
    def apply(
      path: PathLike,
      flags: Unit,
      callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      flags: Unit,
      mode: Null,
      callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      flags: Unit,
      mode: Unit,
      callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      flags: Unit,
      mode: Mode,
      callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      flags: OpenMode,
      callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      flags: OpenMode,
      mode: Null,
      callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      flags: OpenMode,
      mode: Unit,
      callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      flags: OpenMode,
      mode: Mode,
      callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Typeofopendir extends StObject {
    
    def apply(path: PathLike, cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ Dir, Unit]): Unit = js.native
    def apply(
      path: PathLike,
      options: OpenDirOptions,
      cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ Dir, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Typeofread extends StObject {
    
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Double,
      length: Double,
      position: ReadPosition,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Double,
      length: Double,
      position: ReadPosition,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Double,
      length: Double,
      position: ReadPosition,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Double,
      length: Double,
      position: ReadPosition,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Double,
      length: Double,
      position: ReadPosition,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Double,
      length: Double,
      position: ReadPosition,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Double,
      length: Double,
      position: ReadPosition,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Double,
      length: Double,
      position: ReadPosition,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Double,
      length: Double,
      position: ReadPosition,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Double,
      length: Double,
      position: ReadPosition,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Double,
      length: Double,
      position: ReadPosition,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Double,
      length: Double,
      position: ReadPosition,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffer */ ArrayBufferView, 
          Unit
        ]
    ): Unit = js.native
    def apply[TBuffer /* <: ArrayBufferView */](
      fd: Double,
      options: ReadAsyncOptions[TBuffer],
      callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ TBuffer, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeofreadFile extends StObject {
    
    def apply(
      path: PathOrFileDescriptor,
      callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]
    ): Unit = js.native
    def apply(
      path: PathOrFileDescriptor,
      options: Null,
      callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | String, Unit]
    ): Unit = js.native
    def apply(
      path: PathOrFileDescriptor,
      options: Unit,
      callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | String, Unit]
    ): Unit = js.native
    def apply(
      path: PathOrFileDescriptor,
      options: ObjectEncodingOptionsflag,
      callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String | Buffer, Unit]
    ): Unit = js.native
    def apply(
      path: PathOrFileDescriptor,
      options: encodingBufferEncodingflaEncoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
    ): Unit = js.native
    def apply(
      path: PathOrFileDescriptor,
      options: encodingnullundefinedflagEncoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]
    ): Unit = js.native
    def apply(
      path: PathOrFileDescriptor,
      options: BufferEncoding,
      callback: js.Function2[ErrnoException | Null, Buffer | (/* data */ String), Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Typeofreaddir extends StObject {
    
    def apply(
      path: PathLike,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: Null,
      callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: Unit,
      callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: buffer,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: Encoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: ObjectEncodingOptionswithEncoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Dirent], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: ObjectEncodingOptionswith,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: Recursive,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: BufferEncoding,
      callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Typeofreadlink extends StObject {
    
    def apply(
      path: PathLike,
      callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ String, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: BufferEncodingOption,
      callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ Buffer, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: EncodingOption,
      callback: js.Function2[ErrnoException | Null, Buffer | (/* linkString */ String), Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Typeofreadv extends StObject {
    
    def apply(
      fd: Double,
      buffers: js.Array[ArrayBufferView],
      cb: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffers */ js.Array[ArrayBufferView], 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffers: js.Array[ArrayBufferView],
      position: Double,
      cb: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesRead */ Double, 
          /* buffers */ js.Array[ArrayBufferView], 
          Unit
        ]
    ): Unit = js.native
  }
  
  @js.native
  trait Typeofrealpath extends StObject {
    
    def apply(
      path: PathLike,
      callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: BufferEncodingOption,
      callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: EncodingOption,
      callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
    ): Unit = js.native
    
    def native(
      path: PathLike,
      callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
    ): Unit = js.native
    def native(
      path: PathLike,
      options: BufferEncodingOption,
      callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
    ): Unit = js.native
    /**
      * Asynchronous [`realpath(3)`](http://man7.org/linux/man-pages/man3/realpath.3.html).
      *
      * The `callback` gets two arguments `(err, resolvedPath)`.
      *
      * Only paths that can be converted to UTF8 strings are supported.
      *
      * The optional `options` argument can be a string specifying an encoding, or an
      * object with an `encoding` property specifying the character encoding to use for
      * the path passed to the callback. If the `encoding` is set to `'buffer'`,
      * the path returned will be passed as a `Buffer` object.
      *
      * On Linux, when Node.js is linked against musl libc, the procfs file system must
      * be mounted on `/proc` in order for this function to work. Glibc does not have
      * this restriction.
      * @since v9.2.0
      */
    def native(
      path: PathLike,
      options: EncodingOption,
      callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Typeofrename extends StObject {
    
    def apply(oldPath: PathLike, newPath: PathLike, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeofrm extends StObject {
    
    def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, options: RmOptions, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeofrmdir extends StObject {
    
    def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, options: RmDirOptions, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeofstat extends StObject {
    
    def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
    def apply(
      path: PathLike,
      options: Unit,
      callback: js.Function2[ErrnoException | Null, BigIntStats | (/* stats */ Stats), Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: StatOptionsbigintfalseund,
      callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: StatOptionsbiginttrue,
      callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ BigIntStats, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: StatOptions,
      callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats | BigIntStats, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Typeofsymlink extends StObject {
    
    def apply(target: PathLike, path: PathLike, callback: NoParamCallback): Unit = js.native
    def apply(target: PathLike, path: PathLike, `type`: Null, callback: NoParamCallback): Unit = js.native
    def apply(target: PathLike, path: PathLike, `type`: Unit, callback: NoParamCallback): Unit = js.native
    def apply(target: PathLike, path: PathLike, `type`: Type, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeoftruncate extends StObject {
    
    def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, len: Double, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, len: Null, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, len: Unit, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeofunlink extends StObject {
    
    def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeofutimes extends StObject {
    
    def apply(path: PathLike, atime: TimeLike, mtime: TimeLike, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeofwrite extends StObject {
    
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Double,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Double,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Double,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Double,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Double,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Double,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Double,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Double,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Double,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Double,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Double,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Null,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Null,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Null,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Null,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Null,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Null,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Null,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Null,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Null,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Null,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Null,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Null,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Unit,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Unit,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Unit,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Unit,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Unit,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Unit,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Unit,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Unit,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Unit,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Unit,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Unit,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.DataView,
      offset: Unit,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.DataView, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Double,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Double,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Double,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Double,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Double,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Double,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Double,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Double,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Double,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Double,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Double,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Null,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Null,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Null,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Null,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Null,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Null,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Null,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Null,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Null,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Null,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Null,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Null,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Unit,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Unit,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Unit,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Unit,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Unit,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Unit,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Unit,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Unit,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Unit,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Unit,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Unit,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float32Array,
      offset: Unit,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Double,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Double,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Double,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Double,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Double,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Double,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Double,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Double,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Double,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Double,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Double,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Null,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Null,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Null,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Null,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Null,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Null,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Null,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Null,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Null,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Null,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Null,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Null,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Unit,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Unit,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Unit,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Unit,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Unit,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Unit,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Unit,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Unit,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Unit,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Unit,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Unit,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Float64Array,
      offset: Unit,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Float64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Double,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Double,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Double,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Double,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Double,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Double,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Double,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Double,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Double,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Double,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Double,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Null,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Null,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Null,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Null,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Null,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Null,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Null,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Null,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Null,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Null,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Null,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Null,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Unit,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Unit,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Unit,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Unit,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Unit,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Unit,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Unit,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Unit,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Unit,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Unit,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Unit,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int16Array,
      offset: Unit,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Double,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Double,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Double,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Double,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Double,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Double,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Double,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Double,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Double,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Double,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Double,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Null,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Null,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Null,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Null,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Null,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Null,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Null,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Null,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Null,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Null,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Null,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Null,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Unit,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Unit,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Unit,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Unit,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Unit,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Unit,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Unit,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Unit,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Unit,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Unit,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Unit,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int32Array,
      offset: Unit,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Double,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Double,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Double,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Double,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Double,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Double,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Double,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Double,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Double,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Double,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Double,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Null,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Null,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Null,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Null,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Null,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Null,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Null,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Null,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Null,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Null,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Null,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Null,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Unit,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Unit,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Unit,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Unit,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Unit,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Unit,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Unit,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Unit,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Unit,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Unit,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Unit,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Int8Array,
      offset: Unit,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Int8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Double,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Double,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Double,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Double,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Double,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Double,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Double,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Double,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Double,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Double,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Double,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Null,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Null,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Null,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Null,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Null,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Null,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Null,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Null,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Null,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Null,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Null,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Null,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Unit,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Unit,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Unit,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Unit,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Unit,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Unit,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Unit,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Unit,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Unit,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Unit,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Unit,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint16Array,
      offset: Unit,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint16Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Double,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Double,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Double,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Double,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Double,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Double,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Double,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Double,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Double,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Double,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Double,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Null,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Null,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Null,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Null,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Null,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Null,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Null,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Null,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Null,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Null,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Null,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Null,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Unit,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Unit,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Unit,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Unit,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Unit,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Unit,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Unit,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Unit,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Unit,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Unit,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Unit,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint32Array,
      offset: Unit,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint32Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Double,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Double,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Double,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Double,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Double,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Double,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Double,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Double,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Double,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Double,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Double,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Null,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Null,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Null,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Null,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Null,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Null,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Null,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Null,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Null,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Null,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Null,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Null,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Unit,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Unit,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Unit,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Unit,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Unit,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Unit,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Unit,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Unit,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Unit,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Unit,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Unit,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8Array,
      offset: Unit,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Double,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Double,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Double,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Double,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Double,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Double,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Double,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Double,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Double,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Double,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Double,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Null,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Null,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Null,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Null,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Null,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Null,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Null,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Null,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Null,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Null,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Null,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Null,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Unit,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Unit,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Unit,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Unit,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Unit,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Unit,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Unit,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Unit,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Unit,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Unit,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Unit,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Unit,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ js.typedarray.Uint8ClampedArray, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Double,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Double,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Double,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Double,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Double,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Double,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Double,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Double,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Double,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Double,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Double,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Null,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Null,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Null,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Null,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Null,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Null,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Null,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Null,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Null,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Null,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Null,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Null,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Unit,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Unit,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Unit,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Unit,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Unit,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Unit,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Unit,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Unit,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Unit,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Unit,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Unit,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigInt64Array,
      offset: Unit,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigInt64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Double,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Double,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Double,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Double,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Double,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Double,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Double,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Double,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Double,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Double,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Double,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Double,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Null,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Null,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Null,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Null,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Null,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Null,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Null,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Null,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Null,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Null,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Null,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Null,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Unit,
      length: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Unit,
      length: Double,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Unit,
      length: Double,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Unit,
      length: Double,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Unit,
      length: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Unit,
      length: Null,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Unit,
      length: Null,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Unit,
      length: Null,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Unit,
      length: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Unit,
      length: Unit,
      position: Double,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Unit,
      length: Unit,
      position: Null,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffer: BigUint64Array,
      offset: Unit,
      length: Unit,
      position: Unit,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* written */ Double, 
          /* buffer */ BigUint64Array, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      string: String,
      callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
    ): Unit = js.native
    def apply(
      fd: Double,
      string: String,
      position: Double,
      callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
    ): Unit = js.native
    def apply(
      fd: Double,
      string: String,
      position: Double,
      encoding: Null,
      callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
    ): Unit = js.native
    def apply(
      fd: Double,
      string: String,
      position: Double,
      encoding: Unit,
      callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
    ): Unit = js.native
    def apply(
      fd: Double,
      string: String,
      position: Double,
      encoding: BufferEncoding,
      callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
    ): Unit = js.native
    def apply(
      fd: Double,
      string: String,
      position: Null,
      callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
    ): Unit = js.native
    def apply(
      fd: Double,
      string: String,
      position: Null,
      encoding: Null,
      callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
    ): Unit = js.native
    def apply(
      fd: Double,
      string: String,
      position: Null,
      encoding: Unit,
      callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
    ): Unit = js.native
    def apply(
      fd: Double,
      string: String,
      position: Null,
      encoding: BufferEncoding,
      callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
    ): Unit = js.native
    def apply(
      fd: Double,
      string: String,
      position: Unit,
      callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
    ): Unit = js.native
    def apply(
      fd: Double,
      string: String,
      position: Unit,
      encoding: Null,
      callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
    ): Unit = js.native
    def apply(
      fd: Double,
      string: String,
      position: Unit,
      encoding: Unit,
      callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
    ): Unit = js.native
    def apply(
      fd: Double,
      string: String,
      position: Unit,
      encoding: BufferEncoding,
      callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeofwriteFile extends StObject {
    
    def apply(file: PathOrFileDescriptor, data: String, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
    def apply(
      file: PathOrFileDescriptor,
      data: ArrayBufferView,
      options: WriteFileOptions,
      callback: NoParamCallback
    ): Unit = js.native
    def apply(path: PathOrFileDescriptor, data: String, callback: NoParamCallback): Unit = js.native
    def apply(path: PathOrFileDescriptor, data: ArrayBufferView, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeofwritev extends StObject {
    
    def apply(
      fd: Double,
      buffers: js.Array[ArrayBufferView],
      cb: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesWritten */ Double, 
          /* buffers */ js.Array[ArrayBufferView], 
          Unit
        ]
    ): Unit = js.native
    def apply(
      fd: Double,
      buffers: js.Array[ArrayBufferView],
      position: Double,
      cb: js.Function3[
          /* err */ ErrnoException | Null, 
          /* bytesWritten */ Double, 
          /* buffers */ js.Array[ArrayBufferView], 
          Unit
        ]
    ): Unit = js.native
  }
}
