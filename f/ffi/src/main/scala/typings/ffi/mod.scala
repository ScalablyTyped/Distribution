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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ffi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CIF(retType: Any, types: js.Array[Any]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("CIF")(retType.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def CIF(retType: Any, types: js.Array[Any], abi: Any): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("CIF")(retType.asInstanceOf[js.Any], types.asInstanceOf[js.Any], abi.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def CIFVar(retType: Any, types: js.Array[Any], numFixedArgs: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("CIF_var")(retType.asInstanceOf[js.Any], types.asInstanceOf[js.Any], numFixedArgs.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def CIFVar(retType: Any, types: js.Array[Any], numFixedArgs: Double, abi: Any): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("CIF_var")(retType.asInstanceOf[js.Any], types.asInstanceOf[js.Any], numFixedArgs.asInstanceOf[js.Any], abi.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @js.native
  trait Callback
    extends StObject
       with Instantiable3[/* retType */ Any, /* argTypes */ js.Array[Any], /* fn */ Any, Buffer]
       with Instantiable4[/* retType */ Any, /* argTypes */ js.Array[Any], /* abi */ Double, /* fn */ Any, Buffer] {
    
    def apply(retType: Any, argTypes: js.Array[Any], abi: Double, fn: Any): Buffer = js.native
    def apply(retType: Any, argTypes: js.Array[Any], fn: Any): Buffer = js.native
  }
  @JSImport("ffi", "Callback")
  @js.native
  val Callback: typings.ffi.mod.Callback = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ffi", "Callback")
  @js.native
  open class CallbackCls protected ()
    extends StObject
       with Buffer {
    def this(retType: Any, argTypes: js.Array[Any], fn: Any) = this()
    def this(retType: Any, argTypes: js.Array[Any], abi: Double, fn: Any) = this()
  }
  
  trait DynamicLibrary extends StObject {
    
    /** Close library, returns the result of the `dlclose` system function. */
    def close(): Double
    
    /** Get the result of the `dlerror` system function. */
    def error(): String
    
    /** Get a symbol from this library. */
    def get(symbol: String): Buffer
  }
  object DynamicLibrary {
    
    inline def apply(): DynamicLibrary = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[DynamicLibrary]
    inline def apply(path: String): DynamicLibrary = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[DynamicLibrary]
    inline def apply(path: String, mode: Double): DynamicLibrary = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[DynamicLibrary]
    inline def apply(path: Unit, mode: Double): DynamicLibrary = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[DynamicLibrary]
    
    @JSImport("ffi", "DynamicLibrary")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ffi", "DynamicLibrary.FLAGS")
    @js.native
    def FLAGS: RTLDDEFAUL = js.native
    inline def FLAGS_=(x: RTLDDEFAUL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAGS")(x.asInstanceOf[js.Any])
    
    extension [Self <: DynamicLibrary](x: Self) {
      
      inline def setClose(value: () => Double): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setError(value: () => String): Self = StObject.set(x, "error", js.Any.fromFunction0(value))
      
      inline def setGet(value: String => Buffer): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ffi", "DynamicLibrary")
  @js.native
  open class DynamicLibraryCls ()
    extends StObject
       with DynamicLibrary {
    def this(path: String) = this()
    def this(path: String, mode: Double) = this()
    def this(path: Unit, mode: Double) = this()
    
    /** Close library, returns the result of the `dlclose` system function. */
    /* CompleteClass */
    override def close(): Double = js.native
    
    /** Get the result of the `dlerror` system function. */
    /* CompleteClass */
    override def error(): String = js.native
    
    /** Get a symbol from this library. */
    /* CompleteClass */
    override def get(symbol: String): Buffer = js.native
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
    
    def apply(args: Any*): Any = js.native
    
    def async(args: Any*): Unit = js.native
  }
  object ForeignFunction {
    
    @JSImport("ffi", "ForeignFunction")
    @js.native
    def apply(ptr: Buffer, retType: String, argTypes: js.Array[Any]): ForeignFunction = js.native
    @JSImport("ffi", "ForeignFunction")
    @js.native
    def apply(ptr: Buffer, retType: String, argTypes: js.Array[Any], abi: Double): ForeignFunction = js.native
    @JSImport("ffi", "ForeignFunction")
    @js.native
    def apply(ptr: Buffer, retType: Type, argTypes: js.Array[Any]): ForeignFunction = js.native
    @JSImport("ffi", "ForeignFunction")
    @js.native
    def apply(ptr: Buffer, retType: Type, argTypes: js.Array[Any], abi: Double): ForeignFunction = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ffi", "ForeignFunction")
  @js.native
  open class ForeignFunctionCls protected ()
    extends StObject
       with ForeignFunction {
    def this(ptr: Buffer, retType: String, argTypes: js.Array[Any]) = this()
    def this(ptr: Buffer, retType: Type, argTypes: js.Array[Any]) = this()
    def this(ptr: Buffer, retType: String, argTypes: js.Array[Any], abi: Double) = this()
    def this(ptr: Buffer, retType: Type, argTypes: js.Array[Any], abi: Double) = this()
  }
  
  @js.native
  trait Function
    extends StObject
       with Type {
    
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
    def toPointer(fn: js.Function1[/* repeated */ Any, Any]): Buffer = js.native
  }
  object Function {
    
    @JSImport("ffi", "Function")
    @js.native
    def apply(retType: String, argTypes: js.Array[Any]): Function = js.native
    @JSImport("ffi", "Function")
    @js.native
    def apply(retType: String, argTypes: js.Array[Any], abi: Double): Function = js.native
    @JSImport("ffi", "Function")
    @js.native
    def apply(retType: Type, argTypes: js.Array[Any]): Function = js.native
    @JSImport("ffi", "Function")
    @js.native
    def apply(retType: Type, argTypes: js.Array[Any], abi: Double): Function = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ffi", "Function")
  @js.native
  open class FunctionCls protected ()
    extends StObject
       with Function {
    def this(retType: String, argTypes: js.Array[Any]) = this()
    def this(retType: Type, argTypes: js.Array[Any]) = this()
    def this(retType: String, argTypes: js.Array[Any], abi: Double) = this()
    def this(retType: Type, argTypes: js.Array[Any], abi: Double) = this()
    
    /** To invoke when `ref.get` is invoked on a buffer of this type. */
    /* CompleteClass */
    override def get(buffer: typings.node.bufferMod.global.Buffer, offset: Double): Any = js.native
    
    /** The current level of indirection of the buffer. */
    /* CompleteClass */
    var indirection: Double = js.native
    
    /** To invoke when `ref.set` is invoked on a buffer of this type. */
    /* CompleteClass */
    override def set(buffer: typings.node.bufferMod.global.Buffer, offset: Double, value: Any): Unit = js.native
    
    /** The size in bytes required to hold this datatype. */
    /* CompleteClass */
    var size: Double = js.native
  }
  
  @JSImport("ffi", "HAS_OBJC")
  @js.native
  val HAS_OBJC: Boolean = js.native
  
  @JSImport("ffi", "LIB_EXT")
  @js.native
  val LIB_EXT: String = js.native
  
  @js.native
  trait Library
    extends StObject
       with /**
    * @param libFile name of library
    * @param funcs hash of [retType, [...argType], opts?: {abi?, async?, varargs?}]
    * @param lib hash that will be extended
    */
  Instantiable1[/* libFile */ String, Any]
       with Instantiable2[/* libFile */ String, /* funcs */ StringDictionary[js.Array[Any]], Any]
       with Instantiable3[
          /* libFile */ String, 
          (/* funcs */ StringDictionary[js.Array[Any]]) | (/* funcs */ Unit), 
          /* lib */ js.Object, 
          Any
        ] {
    
    /**
      * @param libFile name of library
      * @param funcs hash of [retType, [...argType], opts?: {abi?, async?, varargs?}]
      * @param lib hash that will be extended
      */
    def apply(libFile: String): Any = js.native
    def apply(libFile: String, funcs: StringDictionary[js.Array[Any]]): Any = js.native
    def apply(libFile: String, funcs: StringDictionary[js.Array[Any]], lib: js.Object): Any = js.native
    def apply(libFile: String, funcs: Unit, lib: js.Object): Any = js.native
    
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
    def apply(args: Any*): ForeignFunction = js.native
    
    /**
      * Return type as a property of the function generator to
      * allow for monkey patching the return value in the very rare case where the
      * return type is variadic as well
      */
    var returnType: Any = js.native
  }
  object VariadicForeignFunction {
    
    @JSImport("ffi", "VariadicForeignFunction")
    @js.native
    def apply(ptr: Buffer, ret: String, fixedArgs: js.Array[Any]): VariadicForeignFunction = js.native
    @JSImport("ffi", "VariadicForeignFunction")
    @js.native
    def apply(ptr: Buffer, ret: String, fixedArgs: js.Array[Any], abi: Double): VariadicForeignFunction = js.native
    @JSImport("ffi", "VariadicForeignFunction")
    @js.native
    def apply(ptr: Buffer, ret: Type, fixedArgs: js.Array[Any]): VariadicForeignFunction = js.native
    @JSImport("ffi", "VariadicForeignFunction")
    @js.native
    def apply(ptr: Buffer, ret: Type, fixedArgs: js.Array[Any], abi: Double): VariadicForeignFunction = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ffi", "VariadicForeignFunction")
  @js.native
  open class VariadicForeignFunctionCls protected ()
    extends StObject
       with VariadicForeignFunction {
    def this(ptr: Buffer, ret: String, fixedArgs: js.Array[Any]) = this()
    def this(ptr: Buffer, ret: Type, fixedArgs: js.Array[Any]) = this()
    def this(ptr: Buffer, ret: String, fixedArgs: js.Array[Any], abi: Double) = this()
    def this(ptr: Buffer, ret: Type, fixedArgs: js.Array[Any], abi: Double) = this()
  }
  
  inline def errno(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("errno")().asInstanceOf[Double]
  
  object ffiType {
    
    inline def apply(`type`: String): Buffer = ^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    /** Get a `ffi_type *` Buffer appropriate for the given type. */
    inline def apply(`type`: Type): Buffer = ^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    @JSImport("ffi", "ffiType")
    @js.native
    val ^ : js.Any = js.native
    
    inline def FFI_TYPE(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("FFI_TYPE")().asInstanceOf[Any]
    /** Pass it an existing Buffer instance to use that as the backing buffer. */
    inline def FFI_TYPE(arg: typings.node.bufferMod.global.Buffer): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("FFI_TYPE")(arg.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def FFI_TYPE(arg: typings.node.bufferMod.global.Buffer, data: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("FFI_TYPE")(arg.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def FFI_TYPE(data: js.Object): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("FFI_TYPE")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
    @JSImport("ffi", "ffiType.FFI_TYPE")
    @js.native
    def FFI_TYPE_FffiType: StructType = js.native
    
    inline def FFI_TYPE_FffiType_=(x: StructType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FFI_TYPE")(x.asInstanceOf[js.Any])
  }
  
  object types {
    
    @JSImport("ffi", "types")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ffi", "types.CString")
    @js.native
    def CString: Type = js.native
    inline def CString_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CString")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.Object")
    @js.native
    def Object: Type = js.native
    inline def Object_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.bool")
    @js.native
    def bool: Type = js.native
    inline def bool_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bool")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.byte")
    @js.native
    def byte: Type = js.native
    inline def byte_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byte")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.char")
    @js.native
    def char: Type = js.native
    inline def char_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("char")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.double")
    @js.native
    def double: Type = js.native
    inline def double_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("double")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.float")
    @js.native
    def float: Type = js.native
    inline def float_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("float")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.int")
    @js.native
    def int: Type = js.native
    
    @JSImport("ffi", "types.int16")
    @js.native
    def int16: Type = js.native
    inline def int16_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int16")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.int32")
    @js.native
    def int32: Type = js.native
    inline def int32_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int32")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.int64")
    @js.native
    def int64: Type = js.native
    inline def int64_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int64")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.int8")
    @js.native
    def int8: Type = js.native
    inline def int8_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int8")(x.asInstanceOf[js.Any])
    
    inline def int_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.long")
    @js.native
    def long: Type = js.native
    inline def long_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("long")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.longlong")
    @js.native
    def longlong: Type = js.native
    inline def longlong_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("longlong")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.short")
    @js.native
    def short: Type = js.native
    inline def short_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("short")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.size_t")
    @js.native
    def sizeT: Type = js.native
    
    inline def sizeT_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size_t")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.uchar")
    @js.native
    def uchar: Type = js.native
    inline def uchar_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uchar")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.uint")
    @js.native
    def uint: Type = js.native
    
    @JSImport("ffi", "types.uint16")
    @js.native
    def uint16: Type = js.native
    inline def uint16_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint16")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.uint32")
    @js.native
    def uint32: Type = js.native
    inline def uint32_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint32")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.uint64")
    @js.native
    def uint64: Type = js.native
    inline def uint64_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint64")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.uint8")
    @js.native
    def uint8: Type = js.native
    inline def uint8_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint8")(x.asInstanceOf[js.Any])
    
    inline def uint_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.ulong")
    @js.native
    def ulong: Type = js.native
    inline def ulong_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ulong")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.ulonglong")
    @js.native
    def ulonglong: Type = js.native
    inline def ulonglong_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ulonglong")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.ushort")
    @js.native
    def ushort: Type = js.native
    inline def ushort_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ushort")(x.asInstanceOf[js.Any])
    
    @JSImport("ffi", "types.void")
    @js.native
    def void: Type = js.native
    inline def void_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("void")(x.asInstanceOf[js.Any])
  }
}
