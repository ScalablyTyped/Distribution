package typings.ffi

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import typings.ffi.anon.RTLDDEFAUL
import typings.ref.mod.Type
import typings.refStruct.mod.StructType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ffi", "CIF")
  @js.native
  def CIF(retType: js.Any, types: js.Array[_]): Buffer = js.native
  @JSImport("ffi", "CIF")
  @js.native
  def CIF(retType: js.Any, types: js.Array[_], abi: js.Any): Buffer = js.native
  
  @JSImport("ffi", "CIF_var")
  @js.native
  def CIFVar(retType: js.Any, types: js.Array[_], numFixedArgs: Double): Buffer = js.native
  @JSImport("ffi", "CIF_var")
  @js.native
  def CIFVar(retType: js.Any, types: js.Array[_], numFixedArgs: Double, abi: js.Any): Buffer = js.native
  
  @js.native
  trait Callback
    extends Instantiable3[/* retType */ js.Any, /* argTypes */ js.Array[js.Any], /* fn */ js.Any, Buffer]
       with Instantiable4[
          /* retType */ js.Any, 
          /* argTypes */ js.Array[js.Any], 
          /* abi */ Double, 
          /* fn */ js.Any, 
          Buffer
        ] {
    
    def apply(retType: js.Any, argTypes: js.Array[_], abi: Double, fn: js.Any): Buffer = js.native
    def apply(retType: js.Any, argTypes: js.Array[_], fn: js.Any): Buffer = js.native
  }
  @JSImport("ffi", "Callback")
  @js.native
  val Callback: typings.ffi.mod.Callback = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ffi", "Callback")
  @js.native
  class CallbackCls protected () extends Buffer {
    def this(retType: js.Any, argTypes: js.Array[_], fn: js.Any) = this()
    def this(retType: js.Any, argTypes: js.Array[_], abi: Double, fn: js.Any) = this()
  }
  
  @js.native
  trait DynamicLibrary extends StObject {
    
    /** Close library, returns the result of the `dlclose` system function. */
    def close(): Double = js.native
    
    /** Get the result of the `dlerror` system function. */
    def error(): String = js.native
    
    /** Get a symbol from this library. */
    def get(symbol: String): Buffer = js.native
  }
  object DynamicLibrary {
    
    @JSImport("ffi", "DynamicLibrary")
    @js.native
    def apply(): DynamicLibrary = js.native
    @JSImport("ffi", "DynamicLibrary")
    @js.native
    def apply(path: js.UndefOr[scala.Nothing], mode: Double): DynamicLibrary = js.native
    @JSImport("ffi", "DynamicLibrary")
    @js.native
    def apply(path: String): DynamicLibrary = js.native
    @JSImport("ffi", "DynamicLibrary")
    @js.native
    def apply(path: String, mode: Double): DynamicLibrary = js.native
    @JSImport("ffi", "DynamicLibrary")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ffi", "DynamicLibrary.FLAGS")
    @js.native
    def FLAGS: RTLDDEFAUL = js.native
    @scala.inline
    def FLAGS_=(x: RTLDDEFAUL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAGS")(x.asInstanceOf[js.Any])
    
    @scala.inline
    implicit class DynamicLibraryMutableBuilder[Self <: DynamicLibrary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Double): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setError(value: () => String): Self = StObject.set(x, "error", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet(value: String => Buffer): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ffi", "DynamicLibrary")
  @js.native
  class DynamicLibraryCls () extends DynamicLibrary {
    def this(path: String) = this()
    def this(path: js.UndefOr[scala.Nothing], mode: Double) = this()
    def this(path: String, mode: Double) = this()
  }
  
  @JSImport("ffi", "FFI_BAD_ABI")
  @js.native
  val FFI_BAD_ABI: Double = js.native
  
  @JSImport("ffi", "FFI_BAD_TYPEDEF")
  @js.native
  val FFI_BAD_TYPEDEF: Double = js.native
  
  @JSImport("ffi", "FFI_DEFAULT_ABI")
  @js.native
  val FFI_DEFAULT_ABI: Double = js.native
  
  @JSImport("ffi", "FFI_FASTCALL")
  @js.native
  val FFI_FASTCALL: Double = js.native
  
  @JSImport("ffi", "FFI_FIRST_ABI")
  @js.native
  val FFI_FIRST_ABI: Double = js.native
  
  @JSImport("ffi", "FFI_LAST_ABI")
  @js.native
  val FFI_LAST_ABI: Double = js.native
  
  @JSImport("ffi", "FFI_OK")
  @js.native
  val FFI_OK: Double = js.native
  
  @JSImport("ffi", "FFI_STDCALL")
  @js.native
  val FFI_STDCALL: Double = js.native
  
  @JSImport("ffi", "FFI_SYSV")
  @js.native
  val FFI_SYSV: Double = js.native
  
  @JSImport("ffi", "FFI_THISCALL")
  @js.native
  val FFI_THISCALL: Double = js.native
  
  @JSImport("ffi", "FFI_TYPE")
  @js.native
  val FFI_TYPE: StructType = js.native
  
  @JSImport("ffi", "FFI_UNIX64")
  @js.native
  val FFI_UNIX64: Double = js.native
  
  @JSImport("ffi", "FFI_VFP")
  @js.native
  val FFI_VFP: Double = js.native
  
  @JSImport("ffi", "FFI_WIN64")
  @js.native
  val FFI_WIN64: Double = js.native
  
  @js.native
  trait ForeignFunction extends StObject {
    
    def apply(args: js.Any*): js.Any = js.native
    
    def async(args: js.Any*): Unit = js.native
  }
  @JSImport("ffi", "ForeignFunction")
  @js.native
  def ForeignFunction(ptr: Buffer, retType: String, argTypes: js.Array[_]): ForeignFunction = js.native
  @JSImport("ffi", "ForeignFunction")
  @js.native
  def ForeignFunction(ptr: Buffer, retType: String, argTypes: js.Array[_], abi: Double): ForeignFunction = js.native
  @JSImport("ffi", "ForeignFunction")
  @js.native
  def ForeignFunction(ptr: Buffer, retType: Type, argTypes: js.Array[_]): ForeignFunction = js.native
  @JSImport("ffi", "ForeignFunction")
  @js.native
  def ForeignFunction(ptr: Buffer, retType: Type, argTypes: js.Array[_], abi: Double): ForeignFunction = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ffi", "ForeignFunction")
  @js.native
  class ForeignFunctionCls protected () extends ForeignFunction {
    def this(ptr: Buffer, retType: String, argTypes: js.Array[_]) = this()
    def this(ptr: Buffer, retType: Type, argTypes: js.Array[_]) = this()
    def this(ptr: Buffer, retType: String, argTypes: js.Array[_], abi: Double) = this()
    def this(ptr: Buffer, retType: Type, argTypes: js.Array[_], abi: Double) = this()
  }
  
  @js.native
  trait Function extends Type {
    
    var abi: Double = js.native
    
    /** The type of arguments. */
    var argTypes: js.Array[Type] = js.native
    
    /** Is set for node-ffi functions. */
    var ffi_type: Buffer = js.native
    
    /** The type of return value. */
    var retType: Type = js.native
    
    /** Get a `ForeignFunction` of this function type. */
    def toFunction(buf: Buffer): ForeignFunction = js.native
    
    /** Get a `Callback` pointer of this function type. */
    def toPointer(fn: js.Function1[/* repeated */ js.Any, _]): Buffer = js.native
  }
  @JSImport("ffi", "Function")
  @js.native
  def Function(retType: String, argTypes: js.Array[_]): Function = js.native
  @JSImport("ffi", "Function")
  @js.native
  def Function(retType: String, argTypes: js.Array[_], abi: Double): Function = js.native
  @JSImport("ffi", "Function")
  @js.native
  def Function(retType: Type, argTypes: js.Array[_]): Function = js.native
  @JSImport("ffi", "Function")
  @js.native
  def Function(retType: Type, argTypes: js.Array[_], abi: Double): Function = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ffi", "Function")
  @js.native
  class FunctionCls protected () extends Function {
    def this(retType: String, argTypes: js.Array[_]) = this()
    def this(retType: Type, argTypes: js.Array[_]) = this()
    def this(retType: String, argTypes: js.Array[_], abi: Double) = this()
    def this(retType: Type, argTypes: js.Array[_], abi: Double) = this()
  }
  
  @JSImport("ffi", "HAS_OBJC")
  @js.native
  val HAS_OBJC: Boolean = js.native
  
  @JSImport("ffi", "LIB_EXT")
  @js.native
  val LIB_EXT: String = js.native
  
  @js.native
  trait Library
    extends /**
    * @param libFile name of library
    * @param funcs hash of [retType, [...argType], opts?: {abi?, async?, varargs?}]
    * @param lib hash that will be extended
    */
  Instantiable1[/* libFile */ String, js.Any]
       with Instantiable2[/* libFile */ String, /* funcs */ StringDictionary[js.Array[js.Any]], js.Any]
       with Instantiable3[
          /* libFile */ String, 
          js.UndefOr[/* funcs */ StringDictionary[js.Array[js.Any]]], 
          /* lib */ js.Object, 
          js.Any
        ] {
    
    /**
      * @param libFile name of library
      * @param funcs hash of [retType, [...argType], opts?: {abi?, async?, varargs?}]
      * @param lib hash that will be extended
      */
    def apply(libFile: String): js.Any = js.native
    def apply(libFile: String, funcs: js.UndefOr[scala.Nothing], lib: js.Object): js.Any = js.native
    def apply(libFile: String, funcs: StringDictionary[js.Array[_]]): js.Any = js.native
    def apply(libFile: String, funcs: StringDictionary[js.Array[_]], lib: js.Object): js.Any = js.native
    
    /** The extension to use on libraries. */
    var EXT: String = js.native
  }
  @JSImport("ffi", "Library")
  @js.native
  val Library: typings.ffi.mod.Library = js.native
  
  @JSImport("ffi", "RTLD_DEFAULT")
  @js.native
  val RTLD_DEFAULT: Buffer = js.native
  
  @JSImport("ffi", "RTLD_GLOBAL")
  @js.native
  val RTLD_GLOBAL: Double = js.native
  
  @JSImport("ffi", "RTLD_LAZY")
  @js.native
  val RTLD_LAZY: Double = js.native
  
  @JSImport("ffi", "RTLD_LOCAL")
  @js.native
  val RTLD_LOCAL: Double = js.native
  
  @JSImport("ffi", "RTLD_NEXT")
  @js.native
  val RTLD_NEXT: Buffer = js.native
  
  @JSImport("ffi", "RTLD_NODELETE")
  @js.native
  val RTLD_NODELETE: Double = js.native
  
  @JSImport("ffi", "RTLD_NOLOAD")
  @js.native
  val RTLD_NOLOAD: Double = js.native
  
  @JSImport("ffi", "RTLD_NOW")
  @js.native
  val RTLD_NOW: Double = js.native
  
  @js.native
  trait VariadicForeignFunction extends StObject {
    
    /**
      * What gets returned is another function that needs to be invoked with the rest
      * of the variadic types that are being invoked from the function.
      */
    def apply(args: js.Any*): ForeignFunction = js.native
    
    /**
      * Return type as a property of the function generator to
      * allow for monkey patching the return value in the very rare case where the
      * return type is variadic as well
      */
    var returnType: js.Any = js.native
  }
  @JSImport("ffi", "VariadicForeignFunction")
  @js.native
  def VariadicForeignFunction(ptr: Buffer, ret: String, fixedArgs: js.Array[_]): VariadicForeignFunction = js.native
  @JSImport("ffi", "VariadicForeignFunction")
  @js.native
  def VariadicForeignFunction(ptr: Buffer, ret: String, fixedArgs: js.Array[_], abi: Double): VariadicForeignFunction = js.native
  @JSImport("ffi", "VariadicForeignFunction")
  @js.native
  def VariadicForeignFunction(ptr: Buffer, ret: Type, fixedArgs: js.Array[_]): VariadicForeignFunction = js.native
  @JSImport("ffi", "VariadicForeignFunction")
  @js.native
  def VariadicForeignFunction(ptr: Buffer, ret: Type, fixedArgs: js.Array[_], abi: Double): VariadicForeignFunction = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ffi", "VariadicForeignFunction")
  @js.native
  class VariadicForeignFunctionCls protected () extends VariadicForeignFunction {
    def this(ptr: Buffer, ret: String, fixedArgs: js.Array[_]) = this()
    def this(ptr: Buffer, ret: Type, fixedArgs: js.Array[_]) = this()
    def this(ptr: Buffer, ret: String, fixedArgs: js.Array[_], abi: Double) = this()
    def this(ptr: Buffer, ret: Type, fixedArgs: js.Array[_], abi: Double) = this()
  }
  
  @JSImport("ffi", "errno")
  @js.native
  def errno(): Double = js.native
  
  object ffiType {
    
    @JSImport("ffi", "ffiType")
    @js.native
    def apply(`type`: String): Buffer = js.native
    /** Get a `ffi_type *` Buffer appropriate for the given type. */
    @JSImport("ffi", "ffiType")
    @js.native
    def apply(`type`: Type): Buffer = js.native
    @JSImport("ffi", "ffiType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ffi", "ffiType.FFI_TYPE")
    @js.native
    def FFI_TYPE(): js.Any = js.native
    /** Pass it an existing Buffer instance to use that as the backing buffer. */
    @JSImport("ffi", "ffiType.FFI_TYPE")
    @js.native
    def FFI_TYPE(arg: typings.node.Buffer): js.Any = js.native
    @JSImport("ffi", "ffiType.FFI_TYPE")
    @js.native
    def FFI_TYPE(arg: typings.node.Buffer, data: js.Object): js.Any = js.native
    @JSImport("ffi", "ffiType.FFI_TYPE")
    @js.native
    def FFI_TYPE(data: js.Object): js.Any = js.native
    @JSImport("ffi", "ffiType.FFI_TYPE")
    @js.native
    def FFI_TYPE_FffiType: StructType = js.native
    
    @scala.inline
    def FFI_TYPE_FffiType_=(x: StructType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FFI_TYPE")(x.asInstanceOf[js.Any])
  }
  
  object types {
    
    @JSImport("ffi", "types")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ffi", "types.CString")
    @js.native
    def CString: Type = js.native
    @scala.inline
    def CString_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CString")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.Object")
    @js.native
    def Object: Type = js.native
    @scala.inline
    def Object_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.bool")
    @js.native
    def bool: Type = js.native
    @scala.inline
    def bool_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bool")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.byte")
    @js.native
    def byte: Type = js.native
    @scala.inline
    def byte_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byte")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.char")
    @js.native
    def char: Type = js.native
    @scala.inline
    def char_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("char")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.double")
    @js.native
    def double: Type = js.native
    @scala.inline
    def double_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("double")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.float")
    @js.native
    def float: Type = js.native
    @scala.inline
    def float_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("float")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.int")
    @js.native
    def int: Type = js.native
    
    @JSImport("ffi", "types.int16")
    @js.native
    def int16: Type = js.native
    @scala.inline
    def int16_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int16")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.int32")
    @js.native
    def int32: Type = js.native
    @scala.inline
    def int32_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int32")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.int64")
    @js.native
    def int64: Type = js.native
    @scala.inline
    def int64_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int64")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.int8")
    @js.native
    def int8: Type = js.native
    @scala.inline
    def int8_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int8")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def int_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.long")
    @js.native
    def long: Type = js.native
    @scala.inline
    def long_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("long")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.longlong")
    @js.native
    def longlong: Type = js.native
    @scala.inline
    def longlong_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("longlong")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.short")
    @js.native
    def short: Type = js.native
    @scala.inline
    def short_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("short")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.size_t")
    @js.native
    def sizeT: Type = js.native
    
    @scala.inline
    def sizeT_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size_t")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.uchar")
    @js.native
    def uchar: Type = js.native
    @scala.inline
    def uchar_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uchar")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.uint")
    @js.native
    def uint: Type = js.native
    
    @JSImport("ffi", "types.uint16")
    @js.native
    def uint16: Type = js.native
    @scala.inline
    def uint16_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint16")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.uint32")
    @js.native
    def uint32: Type = js.native
    @scala.inline
    def uint32_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint32")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.uint64")
    @js.native
    def uint64: Type = js.native
    @scala.inline
    def uint64_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint64")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.uint8")
    @js.native
    def uint8: Type = js.native
    @scala.inline
    def uint8_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint8")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def uint_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.ulong")
    @js.native
    def ulong: Type = js.native
    @scala.inline
    def ulong_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ulong")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.ulonglong")
    @js.native
    def ulonglong: Type = js.native
    @scala.inline
    def ulonglong_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ulonglong")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.ushort")
    @js.native
    def ushort: Type = js.native
    @scala.inline
    def ushort_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ushort")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.void")
    @js.native
    def void: Type = js.native
    @scala.inline
    def void_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("void")(x.asInstanceOf[js.Any])
  }
}
