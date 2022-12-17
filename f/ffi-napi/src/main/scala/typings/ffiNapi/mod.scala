package typings.ffiNapi

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.ffiNapi.anon.Alignment
import typings.ffiNapi.anon.Elements
import typings.ffiNapi.ffiNapiStrings.void
import typings.refNapi.mod.CoerceType_
import typings.refNapi.mod.CoerceTypes
import typings.refNapi.mod.NamedType
import typings.refNapi.mod.NamedTypeLike
import typings.refNapi.mod.Pointer
import typings.refNapi.mod.Type
import typings.refNapi.mod.TypeLike
import typings.refNapi.mod.TypesRegistry
import typings.refNapi.mod.UnderlyingType
import typings.refNapi.mod.UnderlyingTypes
import typings.refStructDi.mod.StructType
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ffi-napi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CIF(retType: TypeLike, types: js.Array[TypeLike]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("CIF")(retType.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def CIF(retType: TypeLike, types: js.Array[TypeLike], abi: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("CIF")(retType.asInstanceOf[js.Any], types.asInstanceOf[js.Any], abi.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def CIFVar(retType: TypeLike, types: js.Array[TypeLike], numFixedArgs: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("CIF_var")(retType.asInstanceOf[js.Any], types.asInstanceOf[js.Any], numFixedArgs.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def CIFVar(retType: TypeLike, types: js.Array[TypeLike], numFixedArgs: Double, abi: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("CIF_var")(retType.asInstanceOf[js.Any], types.asInstanceOf[js.Any], numFixedArgs.asInstanceOf[js.Any], abi.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @js.native
  trait Callback
    extends StObject
       with // NOTE: This overload is a subtype of the next overload, but provides better completions.
  Instantiable3[
          (/* retType */ NamedTypeLike) | (/* retType */ TypeLike), 
          /* argTypes */ js.Array[NamedTypeLike | TypeLike], 
          /* fn */ js.Function1[
            (/* repeated */ Any) | (/* ags */ UnderlyingTypes[js.Array[NamedTypeLike | TypeLike]]), 
            Any | (UnderlyingType[NamedTypeLike | TypeLike])
          ], 
          Buffer | (Pointer[
            js.Function1[
              /* args */ UnderlyingTypes[js.Array[NamedTypeLike | TypeLike]], 
              UnderlyingType[NamedTypeLike | TypeLike]
            ]
          ])
        ]
       with // NOTE: This overload is a subtype of the next overload, but provides better completions.
  Instantiable4[
          (/* retType */ NamedTypeLike) | (/* retType */ TypeLike), 
          /* argTypes */ js.Array[NamedTypeLike | TypeLike], 
          /* abi */ Double, 
          /* fn */ js.Function1[
            (/* repeated */ Any) | (/* args */ UnderlyingTypes[js.Array[NamedTypeLike | TypeLike]]), 
            Any | (UnderlyingType[NamedTypeLike | TypeLike])
          ], 
          Buffer | (Pointer[
            js.Function1[
              /* args */ UnderlyingTypes[js.Array[NamedTypeLike | TypeLike]], 
              UnderlyingType[NamedTypeLike | TypeLike]
            ]
          ])
        ] {
    
    def apply(
      retType: TypeLike,
      argTypes: js.Array[TypeLike],
      abi: Double,
      fn: js.Function1[/* repeated */ Any, Any]
    ): Buffer = js.native
    def apply(retType: TypeLike, argTypes: js.Array[TypeLike], fn: js.Function1[/* repeated */ Any, Any]): Buffer = js.native
    // NOTE: This overload is a subtype of the next overload, but provides better completions.
    def apply[TReturnType /* <: NamedTypeLike */, TArgTypes /* <: js.Array[NamedTypeLike] */](
      retType: TReturnType,
      argTypes: TArgTypes,
      abi: Double,
      fn: js.Function1[/* args */ UnderlyingTypes[TArgTypes], UnderlyingType[TReturnType]]
    ): Pointer[js.Function1[/* args */ UnderlyingTypes[TArgTypes], UnderlyingType[TReturnType]]] = js.native
    // NOTE: This overload is a subtype of the next overload, but provides better completions.
    def apply[TReturnType /* <: NamedTypeLike */, TArgTypes /* <: js.Array[NamedTypeLike] */](
      retType: TReturnType,
      argTypes: TArgTypes,
      fn: js.Function1[/* ags */ UnderlyingTypes[TArgTypes], UnderlyingType[TReturnType]]
    ): Pointer[js.Function1[/* args */ UnderlyingTypes[TArgTypes], UnderlyingType[TReturnType]]] = js.native
  }
  @JSImport("ffi-napi", "Callback")
  @js.native
  val Callback: typings.ffiNapi.mod.Callback = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ffi-napi", "Callback")
  @js.native
  open class CallbackCls[TReturnType /* <: NamedTypeLike */, TArgTypes /* <: js.Array[NamedTypeLike] */] protected ()
    extends StObject
       with Pointer[js.Function1[/* args */ UnderlyingTypes[TArgTypes], UnderlyingType[TReturnType]]] {
    // NOTE: This overload is a subtype of the next overload, but provides better completions.
    def this(
      retType: TReturnType,
      argTypes: TArgTypes,
      fn: js.Function1[/* ags */ UnderlyingTypes[TArgTypes], UnderlyingType[TReturnType]]
    ) = this()
    // NOTE: This overload is a subtype of the next overload, but provides better completions.
    def this(
      retType: TReturnType,
      argTypes: TArgTypes,
      abi: Double,
      fn: js.Function1[/* args */ UnderlyingTypes[TArgTypes], UnderlyingType[TReturnType]]
    ) = this()
  }
  
  @JSImport("ffi-napi", "DynamicLibrary")
  @js.native
  /**
    * @param mode One of the numeric {@link DynamicLibrary.FLAGS} values.
    */
  open class DynamicLibrary () extends StObject {
    def this(path: String) = this()
    def this(path: String, mode: Double) = this()
    def this(path: Unit, mode: Double) = this()
    
    /**
      * Close library, returns the result of the `dlclose` system function.
      */
    def close(): Double = js.native
    
    /**
      * Get the result of the `dlerror` system function.
      */
    def error(): String = js.native
    
    /**
      * Get a symbol from this library.
      */
    def get(symbol: String): Buffer = js.native
    
    /**
      * Returns the path originally passed to the constructor.
      */
    def path(): String = js.native
  }
  object DynamicLibrary {
    
    inline def apply(): DynamicLibrary = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[DynamicLibrary]
    inline def apply(path: String): DynamicLibrary = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[DynamicLibrary]
    inline def apply(path: String, mode: Double): DynamicLibrary = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[DynamicLibrary]
    inline def apply(path: Unit, mode: Double): DynamicLibrary = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[DynamicLibrary]
    
    @JSImport("ffi-napi", "DynamicLibrary")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Exported flags from "dlfcn.h"
      */
    object FLAGS {
      
      @JSImport("ffi-napi", "DynamicLibrary.FLAGS.RTLD_DEFAULT")
      @js.native
      val RTLD_DEFAULT: Pointer[Any] = js.native
      
      // not defined on Windows
      @JSImport("ffi-napi", "DynamicLibrary.FLAGS.RTLD_FIRST")
      @js.native
      val RTLD_FIRST: js.UndefOr[Double] = js.native
      
      @JSImport("ffi-napi", "DynamicLibrary.FLAGS.RTLD_GLOBAL")
      @js.native
      val RTLD_GLOBAL: Double = js.native
      
      // flags for dlopen()
      @JSImport("ffi-napi", "DynamicLibrary.FLAGS.RTLD_LAZY")
      @js.native
      val RTLD_LAZY: Double = js.native
      
      @JSImport("ffi-napi", "DynamicLibrary.FLAGS.RTLD_LOCAL")
      @js.native
      val RTLD_LOCAL: Double = js.native
      
      // not defined on Windows
      @JSImport("ffi-napi", "DynamicLibrary.FLAGS.RTLD_MAIN_ONLY")
      @js.native
      val RTLD_MAIN_ONLY: js.UndefOr[Pointer[Any]] = js.native
      
      // not defined on Windows
      // flags for dlsym()
      @JSImport("ffi-napi", "DynamicLibrary.FLAGS.RTLD_NEXT")
      @js.native
      val RTLD_NEXT: Pointer[Any] = js.native
      
      // not defined on Windows
      @JSImport("ffi-napi", "DynamicLibrary.FLAGS.RTLD_NODELETE")
      @js.native
      val RTLD_NODELETE: js.UndefOr[Double] = js.native
      
      @JSImport("ffi-napi", "DynamicLibrary.FLAGS.RTLD_NOLOAD")
      @js.native
      val RTLD_NOLOAD: js.UndefOr[Double] = js.native
      
      @JSImport("ffi-napi", "DynamicLibrary.FLAGS.RTLD_NOW")
      @js.native
      val RTLD_NOW: Double = js.native
      
      @JSImport("ffi-napi", "DynamicLibrary.FLAGS.RTLD_SELF")
      @js.native
      val RTLD_SELF: js.UndefOr[Pointer[Any]] = js.native
    }
  }
  
  @JSImport("ffi-napi", "FFI_ARG_SIZE")
  @js.native
  val FFI_ARG_SIZE: Double = js.native
  
  @JSImport("ffi-napi", "FFI_BAD_ABI")
  @js.native
  val FFI_BAD_ABI: Double = js.native
  
  @JSImport("ffi-napi", "FFI_BAD_TYPEDEF")
  @js.native
  val FFI_BAD_TYPEDEF: Double = js.native
  
  @JSImport("ffi-napi", "FFI_CIF_SIZE")
  @js.native
  val FFI_CIF_SIZE: Double = js.native
  
  @JSImport("ffi-napi", "FFI_DEFAULT_ABI")
  @js.native
  val FFI_DEFAULT_ABI: Double = js.native
  
  @JSImport("ffi-napi", "FFI_FASTCALL")
  @js.native
  val FFI_FASTCALL: js.UndefOr[Double] = js.native
  
  @JSImport("ffi-napi", "FFI_FIRST_ABI")
  @js.native
  val FFI_FIRST_ABI: Double = js.native
  
  @JSImport("ffi-napi", "FFI_LAST_ABI")
  @js.native
  val FFI_LAST_ABI: Double = js.native
  
  @JSImport("ffi-napi", "FFI_MS_CDECL")
  @js.native
  val FFI_MS_CDECL: js.UndefOr[Double] = js.native
  
  @JSImport("ffi-napi", "FFI_OK")
  @js.native
  val FFI_OK: Double = js.native
  
  @JSImport("ffi-napi", "FFI_SARG_SIZE")
  @js.native
  val FFI_SARG_SIZE: Double = js.native
  
  @JSImport("ffi-napi", "FFI_STDCALL")
  @js.native
  val FFI_STDCALL: js.UndefOr[Double] = js.native
  
  @JSImport("ffi-napi", "FFI_SYSV")
  @js.native
  val FFI_SYSV: js.UndefOr[Double] = js.native
  
  @JSImport("ffi-napi", "FFI_THISCALL")
  @js.native
  val FFI_THISCALL: js.UndefOr[Double] = js.native
  
  /**
    * Define the `ffi_type` struct (see deps/libffi/include/ffi.h) for use in JS.
    * This struct type is used internally to define custom struct ret/arg types.
    */
  @JSImport("ffi-napi", "FFI_TYPE")
  @js.native
  val FFI_TYPE: StructType[Alignment] = js.native
  
  @JSImport("ffi-napi", "FFI_TYPES")
  @js.native
  val FFI_TYPES: FfiTypesRegistry = js.native
  
  @JSImport("ffi-napi", "FFI_TYPE_SIZE")
  @js.native
  val FFI_TYPE_SIZE: Double = js.native
  
  @JSImport("ffi-napi", "FFI_UNIX64")
  @js.native
  val FFI_UNIX64: js.UndefOr[Double] = js.native
  
  @JSImport("ffi-napi", "FFI_VFP")
  @js.native
  val FFI_VFP: js.UndefOr[Double] = js.native
  
  @JSImport("ffi-napi", "FFI_WIN64")
  @js.native
  val FFI_WIN64: js.UndefOr[Double] = js.native
  
  @js.native
  trait ForeignFunction[TReturn, TArgs /* <: js.Array[Any] */] extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): TReturn = js.native
    
    def async(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [...TArgs, (err : any, value : TReturn): void] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: TArgs */ js.Array[TArgs]
    ): Unit = js.native
  }
  object ForeignFunction {
    
    @JSImport("ffi-napi", "ForeignFunction")
    @js.native
    def apply(ptr: Buffer, retType: TypeLike, argTypes: js.Array[TypeLike]): ForeignFunction[Any, js.Array[Any]] = js.native
    @JSImport("ffi-napi", "ForeignFunction")
    @js.native
    def apply(ptr: Buffer, retType: TypeLike, argTypes: js.Array[TypeLike], abi: Double): ForeignFunction[Any, js.Array[Any]] = js.native
    // NOTE: This overload is a subtype of the next overload, but provides better completions.
    @JSImport("ffi-napi", "ForeignFunction")
    @js.native
    def apply[TReturnType /* <: NamedType */, TArgTypes /* <: js.Array[TypeLike] | ArgTypesInferenceMarker */](ptr: Buffer, retType: TReturnType, argTypes: TArgTypes): ForeignFunction[UnderlyingType[TReturnType], UnderlyingTypes[TArgTypes]] = js.native
    @JSImport("ffi-napi", "ForeignFunction")
    @js.native
    def apply[TReturnType /* <: NamedType */, TArgTypes /* <: js.Array[TypeLike] | ArgTypesInferenceMarker */](ptr: Buffer, retType: TReturnType, argTypes: TArgTypes, abi: Double): ForeignFunction[UnderlyingType[TReturnType], UnderlyingTypes[TArgTypes]] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ffi-napi", "ForeignFunction")
  @js.native
  open class ForeignFunctionCls[TReturnType /* <: NamedType */, TArgTypes /* <: js.Array[TypeLike] | ArgTypesInferenceMarker */] protected ()
    extends StObject
       with ForeignFunction[UnderlyingType[TReturnType], UnderlyingTypes[TArgTypes]] {
    // NOTE: This overload is a subtype of the next overload, but provides better completions.
    def this(ptr: Buffer, retType: TReturnType, argTypes: TArgTypes) = this()
    def this(ptr: Buffer, retType: TReturnType, argTypes: TArgTypes, abi: Double) = this()
  }
  
  @js.native
  trait Function[TReturnType /* <: Type[Any] */, TArgTypes /* <: js.Array[Type[Any]] */]
    extends StObject
       with Type[js.Function1[/* args */ UnderlyingTypes[TArgTypes], UnderlyingType[TReturnType]]] {
    
    var abi: Double = js.native
    
    /** The type of arguments. */
    var argTypes: TArgTypes = js.native
    
    /** Is set for node-ffi functions. */
    var ffi_type: PFFI_TYPE = js.native
    
    /** The type of return value. */
    var retType: TReturnType = js.native
    
    /** Get a `ForeignFunction` of this function type. */
    def toFunction(buf: Buffer): ForeignFunction[UnderlyingType[TReturnType], UnderlyingTypes[TArgTypes]] = js.native
    
    /** Get a `Callback` pointer of this function type. */
    def toPointer(fn: js.Function1[/* args */ UnderlyingTypes[TArgTypes], UnderlyingType[TReturnType]]): Pointer[js.Function1[/* args */ UnderlyingTypes[TArgTypes], UnderlyingType[TReturnType]]] = js.native
  }
  object Function {
    
    @JSImport("ffi-napi", "Function")
    @js.native
    def apply(retType: TypeLike, argTypes: js.Array[TypeLike]): Function[Type[Any], js.Array[Type[Any]]] = js.native
    @JSImport("ffi-napi", "Function")
    @js.native
    def apply(retType: TypeLike, argTypes: js.Array[TypeLike], abi: Double): Function[Type[Any], js.Array[Type[Any]]] = js.native
    // NOTE: This overload is a subtype of the next overload, but provides better completions.
    @JSImport("ffi-napi", "Function")
    @js.native
    def apply[TReturnType /* <: NamedTypeLike */, TArgTypes /* <: js.Array[NamedTypeLike] | ArgTypesInferenceMarker */](retType: TReturnType, argTypes: TArgTypes): Function[CoerceType_[TReturnType], CoerceTypes[TArgTypes]] = js.native
    @JSImport("ffi-napi", "Function")
    @js.native
    def apply[TReturnType /* <: NamedTypeLike */, TArgTypes /* <: js.Array[NamedTypeLike] | ArgTypesInferenceMarker */](retType: TReturnType, argTypes: TArgTypes, abi: Double): Function[CoerceType_[TReturnType], CoerceTypes[TArgTypes]] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ffi-napi", "Function")
  @js.native
  open class FunctionCls[TReturnType /* <: NamedTypeLike */, TArgTypes /* <: js.Array[NamedTypeLike] | ArgTypesInferenceMarker */] protected ()
    extends StObject
       with Function[CoerceType_[TReturnType], CoerceTypes[TArgTypes]] {
    // NOTE: This overload is a subtype of the next overload, but provides better completions.
    def this(retType: TReturnType, argTypes: TArgTypes) = this()
    def this(retType: TReturnType, argTypes: TArgTypes, abi: Double) = this()
    
    /** To invoke when `ref.get` is invoked on a buffer of this type. */
    /* CompleteClass */
    override def get(buffer: typings.refNapi.mod.global.Buffer, offset: Double): js.Function1[
        /* args */ UnderlyingTypes[CoerceTypes[TArgTypes]], 
        UnderlyingType[CoerceType_[TReturnType]]
      ] = js.native
    
    /** The current level of indirection of the buffer. */
    /* CompleteClass */
    var indirection: Double = js.native
    
    /** To invoke when `ref.set` is invoked on a buffer of this type. */
    /* CompleteClass */
    override def set(
      buffer: typings.refNapi.mod.global.Buffer,
      offset: Double,
      value: js.Function1[
          /* args */ UnderlyingTypes[CoerceTypes[TArgTypes]], 
          UnderlyingType[CoerceType_[TReturnType]]
        ]
    ): Unit = js.native
    
    /** The size in bytes required to hold this datatype. */
    /* CompleteClass */
    var size: Double = js.native
  }
  
  @JSImport("ffi-napi", "HAS_OBJC")
  @js.native
  val HAS_OBJC: Boolean = js.native
  
  @JSImport("ffi-napi", "LIB_EXT")
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
  Instantiable0[Any]
       with /**
    * @param libFile name of library
    * @param funcs hash of [retType, [...argType], opts?: {abi?, async?, varargs?}]
    * @param lib hash that will be extended
    */
  Instantiable2[
          (/* libFile */ Null) | (/* libFile */ String), 
          LibraryObjectDefinitionBase | LibraryObjectDefinitionInferenceMarker | (/* funcs */ Record[
            String, 
            js.Tuple3[
              /* retType */ TypeLike, 
              /* argTypes */ js.Array[TypeLike], 
              js.UndefOr[LibraryFunctionOptions]
            ]
          ]), 
          Any | (LibraryObject[
            LibraryObjectDefinitionToLibraryDefinition[LibraryObjectDefinitionBase | LibraryObjectDefinitionInferenceMarker]
          ])
        ]
       with /**
    * @param libFile name of library
    * @param funcs hash of [retType, [...argType], opts?: {abi?, async?, varargs?}]
    * @param lib hash that will be extended
    */
  Instantiable3[
          (/* libFile */ Null) | (/* libFile */ String), 
          LibraryObjectDefinitionBase | LibraryObjectDefinitionInferenceMarker | (/* funcs */ Record[
            String, 
            js.Tuple3[
              /* retType */ TypeLike, 
              /* argTypes */ js.Array[TypeLike], 
              js.UndefOr[LibraryFunctionOptions]
            ]
          ]) | (/* funcs */ Unit), 
          /* lib */ js.Object, 
          Any | (LibraryObject[
            LibraryObjectDefinitionToLibraryDefinition[LibraryObjectDefinitionBase | LibraryObjectDefinitionInferenceMarker]
          ])
        ]
       with Instantiable1[/* libFile */ String, Any] {
    
    /**
      * @param libFile name of library
      * @param funcs hash of [retType, [...argType], opts?: {abi?, async?, varargs?}]
      * @param lib hash that will be extended
      */
    def apply(): Any = js.native
    def apply(libFile: String): Any = js.native
    def apply(libFile: String, funcs: Unit, lib: js.Object): Any = js.native
    def apply(
      libFile: String,
      funcs: Record[
          String, 
          js.Tuple3[
            /* retType */ TypeLike, 
            /* argTypes */ js.Array[TypeLike], 
            /* opts */ js.UndefOr[LibraryFunctionOptions]
          ]
        ]
    ): Any = js.native
    def apply(
      libFile: String,
      funcs: Record[
          String, 
          js.Tuple3[
            /* retType */ TypeLike, 
            /* argTypes */ js.Array[TypeLike], 
            /* opts */ js.UndefOr[LibraryFunctionOptions]
          ]
        ],
      lib: js.Object
    ): Any = js.native
    def apply(libFile: Null, funcs: Unit, lib: js.Object): Any = js.native
    def apply(
      libFile: Null,
      funcs: Record[
          String, 
          js.Tuple3[
            /* retType */ TypeLike, 
            /* argTypes */ js.Array[TypeLike], 
            /* opts */ js.UndefOr[LibraryFunctionOptions]
          ]
        ]
    ): Any = js.native
    def apply(
      libFile: Null,
      funcs: Record[
          String, 
          js.Tuple3[
            /* retType */ TypeLike, 
            /* argTypes */ js.Array[TypeLike], 
            /* opts */ js.UndefOr[LibraryFunctionOptions]
          ]
        ],
      lib: js.Object
    ): Any = js.native
    /**
      * @param libFile name of library
      * @param funcs hash of [retType, [...argType], opts?: {abi?, async?, varargs?}]
      * @param lib hash that will be extended
      */
    def apply[TDefinition /* <: LibraryObjectDefinitionBase | LibraryObjectDefinitionInferenceMarker */](libFile: String, funcs: TDefinition): LibraryObject[LibraryObjectDefinitionToLibraryDefinition[TDefinition]] = js.native
    def apply[TDefinition /* <: LibraryObjectDefinitionBase | LibraryObjectDefinitionInferenceMarker */](libFile: String, funcs: TDefinition, lib: js.Object): LibraryObject[LibraryObjectDefinitionToLibraryDefinition[TDefinition]] = js.native
    def apply[TDefinition /* <: LibraryObjectDefinitionBase | LibraryObjectDefinitionInferenceMarker */](libFile: Null, funcs: TDefinition): LibraryObject[LibraryObjectDefinitionToLibraryDefinition[TDefinition]] = js.native
    def apply[TDefinition /* <: LibraryObjectDefinitionBase | LibraryObjectDefinitionInferenceMarker */](libFile: Null, funcs: TDefinition, lib: js.Object): LibraryObject[LibraryObjectDefinitionToLibraryDefinition[TDefinition]] = js.native
    /**
      * @param libFile name of library
      * @param funcs hash of [retType, [...argType], opts?: {abi?, async?, varargs?}]
      * @param lib hash that will be extended
      */
    def apply[TDefinition /* <: LibraryObjectDefinitionBase | LibraryObjectDefinitionInferenceMarker */, T](libFile: String, funcs: TDefinition, lib: T): T & LibraryObject[LibraryObjectDefinitionToLibraryDefinition[TDefinition]] = js.native
    def apply[TDefinition /* <: LibraryObjectDefinitionBase | LibraryObjectDefinitionInferenceMarker */, T](libFile: Null, funcs: TDefinition, lib: T): T & LibraryObject[LibraryObjectDefinitionToLibraryDefinition[TDefinition]] = js.native
    
    /** The extension to use on libraries. */
    var EXT: String = js.native
  }
  @JSImport("ffi-napi", "Library")
  @js.native
  val Library: typings.ffiNapi.mod.Library = js.native
  
  @JSImport("ffi-napi", "RTLD_DEFAULT")
  @js.native
  val RTLD_DEFAULT: Pointer[Any] = js.native
  
  // not defined on Windows
  @JSImport("ffi-napi", "RTLD_FIRST")
  @js.native
  val RTLD_FIRST: js.UndefOr[Double] = js.native
  
  @JSImport("ffi-napi", "RTLD_GLOBAL")
  @js.native
  val RTLD_GLOBAL: Double = js.native
  
  // flags for dlopen()
  @JSImport("ffi-napi", "RTLD_LAZY")
  @js.native
  val RTLD_LAZY: Double = js.native
  
  @JSImport("ffi-napi", "RTLD_LOCAL")
  @js.native
  val RTLD_LOCAL: Double = js.native
  
  // not defined on Windows
  @JSImport("ffi-napi", "RTLD_MAIN_ONLY")
  @js.native
  val RTLD_MAIN_ONLY: js.UndefOr[Pointer[Any]] = js.native
  
  // not defined on Windows
  // flags for dlsym()
  @JSImport("ffi-napi", "RTLD_NEXT")
  @js.native
  val RTLD_NEXT: Pointer[Any] = js.native
  
  // not defined on Windows
  @JSImport("ffi-napi", "RTLD_NODELETE")
  @js.native
  val RTLD_NODELETE: js.UndefOr[Double] = js.native
  
  @JSImport("ffi-napi", "RTLD_NOLOAD")
  @js.native
  val RTLD_NOLOAD: js.UndefOr[Double] = js.native
  
  @JSImport("ffi-napi", "RTLD_NOW")
  @js.native
  val RTLD_NOW: Double = js.native
  
  @JSImport("ffi-napi", "RTLD_SELF")
  @js.native
  val RTLD_SELF: js.UndefOr[Pointer[Any]] = js.native
  
  @js.native
  trait VariadicForeignFunction[TReturnType /* <: Type[Any] */, TArgTypes /* <: js.Array[Type[Any]] */] extends StObject {
    
    /**
      * What gets returned is another function that needs to be invoked with the rest
      * of the variadic types that are being invoked from the function.
      */
    // NOTE: This overload is a subtype of the next overload, but provides better completions.
    def apply[A /* <: js.Array[NamedTypeLike] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: A
    ): ForeignFunction[
        UnderlyingType[TReturnType], 
        /* import warning: importer.ImportType#apply c repeated non-array type: never */ js.Array[scala.Nothing]
      ] = js.native
    
    /**
      * Return type as a property of the function generator to
      * allow for monkey patching the return value in the very rare case where the
      * return type is variadic as well
      */
    var returnType: TReturnType = js.native
  }
  object VariadicForeignFunction {
    
    @JSImport("ffi-napi", "VariadicForeignFunction")
    @js.native
    def apply(ptr: Buffer, ret: TypeLike, fixedArgs: js.Array[TypeLike]): VariadicForeignFunction[Type[Any], js.Array[Type[Any]]] = js.native
    @JSImport("ffi-napi", "VariadicForeignFunction")
    @js.native
    def apply(ptr: Buffer, ret: TypeLike, fixedArgs: js.Array[TypeLike], abi: Double): VariadicForeignFunction[Type[Any], js.Array[Type[Any]]] = js.native
    // NOTE: This overload is a subtype of the next overload, but provides better completions.
    @JSImport("ffi-napi", "VariadicForeignFunction")
    @js.native
    def apply[TReturnType /* <: NamedTypeLike */, TArgTypes /* <: js.Array[NamedTypeLike] | ArgTypesInferenceMarker */](ptr: Buffer, ret: TReturnType, fixedArgs: TArgTypes): VariadicForeignFunction[CoerceType_[TReturnType], CoerceTypes[TArgTypes]] = js.native
    @JSImport("ffi-napi", "VariadicForeignFunction")
    @js.native
    def apply[TReturnType /* <: NamedTypeLike */, TArgTypes /* <: js.Array[NamedTypeLike] | ArgTypesInferenceMarker */](ptr: Buffer, ret: TReturnType, fixedArgs: TArgTypes, abi: Double): VariadicForeignFunction[CoerceType_[TReturnType], CoerceTypes[TArgTypes]] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ffi-napi", "VariadicForeignFunction")
  @js.native
  open class VariadicForeignFunctionCls[TReturnType /* <: NamedTypeLike */, TArgTypes /* <: js.Array[NamedTypeLike] | ArgTypesInferenceMarker */] protected ()
    extends StObject
       with VariadicForeignFunction[CoerceType_[TReturnType], CoerceTypes[TArgTypes]] {
    // NOTE: This overload is a subtype of the next overload, but provides better completions.
    def this(ptr: Buffer, ret: TReturnType, fixedArgs: TArgTypes) = this()
    def this(ptr: Buffer, ret: TReturnType, fixedArgs: TArgTypes, abi: Double) = this()
  }
  
  inline def errno(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("errno")().asInstanceOf[Double]
  
  object ffiType {
    
    inline def apply(`type`: TypeLike): Pointer[typings.ffiNapi.mod.ffiType.FFI_TYPE] = ^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any]).asInstanceOf[Pointer[typings.ffiNapi.mod.ffiType.FFI_TYPE]]
    
    @JSImport("ffi-napi", "ffiType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Define the `ffi_type` struct (see deps/libffi/include/ffi.h) for use in JS.
      * This struct type is used internally to define custom struct ret/arg types.
      */
    @JSImport("ffi-napi", "ffiType.FFI_TYPE")
    @js.native
    val FFI_TYPE: StructType[Alignment] = js.native
    type FFI_TYPE = ReturnType[StructType[Elements]]
  }
  
  @JSImport("ffi-napi", "types")
  @js.native
  def types: TypesRegistry = js.native
  inline def types_=(x: TypesRegistry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("types")(x.asInstanceOf[js.Any])
  
  type ArgTypesInferenceMarker = js.Array[void]
  
  trait FfiTypesRegistry extends StObject {
    
    var char: PFFI_TYPE
    
    var double: PFFI_TYPE
    
    var float: PFFI_TYPE
    
    var int: PFFI_TYPE
    
    var int16: PFFI_TYPE
    
    var int32: PFFI_TYPE
    
    var int64: PFFI_TYPE
    
    var int8: PFFI_TYPE
    
    var long: PFFI_TYPE
    
    var longlong: PFFI_TYPE
    
    var pointer: PFFI_TYPE
    
    var short: PFFI_TYPE
    
    var uchar: PFFI_TYPE
    
    var uint: PFFI_TYPE
    
    var uint16: PFFI_TYPE
    
    var uint32: PFFI_TYPE
    
    var uint64: PFFI_TYPE
    
    var uint8: PFFI_TYPE
    
    var ulong: PFFI_TYPE
    
    var ulonglong: PFFI_TYPE
    
    var ushort: PFFI_TYPE
    
    var void: PFFI_TYPE
  }
  object FfiTypesRegistry {
    
    inline def apply(
      char: PFFI_TYPE,
      double: PFFI_TYPE,
      float: PFFI_TYPE,
      int: PFFI_TYPE,
      int16: PFFI_TYPE,
      int32: PFFI_TYPE,
      int64: PFFI_TYPE,
      int8: PFFI_TYPE,
      long: PFFI_TYPE,
      longlong: PFFI_TYPE,
      pointer: PFFI_TYPE,
      short: PFFI_TYPE,
      uchar: PFFI_TYPE,
      uint: PFFI_TYPE,
      uint16: PFFI_TYPE,
      uint32: PFFI_TYPE,
      uint64: PFFI_TYPE,
      uint8: PFFI_TYPE,
      ulong: PFFI_TYPE,
      ulonglong: PFFI_TYPE,
      ushort: PFFI_TYPE,
      void: PFFI_TYPE
    ): FfiTypesRegistry = {
      val __obj = js.Dynamic.literal(char = char.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], int = int.asInstanceOf[js.Any], int16 = int16.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], int64 = int64.asInstanceOf[js.Any], int8 = int8.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], longlong = longlong.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any], uchar = uchar.asInstanceOf[js.Any], uint = uint.asInstanceOf[js.Any], uint16 = uint16.asInstanceOf[js.Any], uint32 = uint32.asInstanceOf[js.Any], uint64 = uint64.asInstanceOf[js.Any], uint8 = uint8.asInstanceOf[js.Any], ulong = ulong.asInstanceOf[js.Any], ulonglong = ulonglong.asInstanceOf[js.Any], ushort = ushort.asInstanceOf[js.Any], void = void.asInstanceOf[js.Any])
      __obj.asInstanceOf[FfiTypesRegistry]
    }
    
    extension [Self <: FfiTypesRegistry](x: Self) {
      
      inline def setChar(value: PFFI_TYPE): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
      
      inline def setDouble(value: PFFI_TYPE): Self = StObject.set(x, "double", value.asInstanceOf[js.Any])
      
      inline def setFloat(value: PFFI_TYPE): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setInt(value: PFFI_TYPE): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
      
      inline def setInt16(value: PFFI_TYPE): Self = StObject.set(x, "int16", value.asInstanceOf[js.Any])
      
      inline def setInt32(value: PFFI_TYPE): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
      
      inline def setInt64(value: PFFI_TYPE): Self = StObject.set(x, "int64", value.asInstanceOf[js.Any])
      
      inline def setInt8(value: PFFI_TYPE): Self = StObject.set(x, "int8", value.asInstanceOf[js.Any])
      
      inline def setLong(value: PFFI_TYPE): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      inline def setLonglong(value: PFFI_TYPE): Self = StObject.set(x, "longlong", value.asInstanceOf[js.Any])
      
      inline def setPointer(value: PFFI_TYPE): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      inline def setShort(value: PFFI_TYPE): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setUchar(value: PFFI_TYPE): Self = StObject.set(x, "uchar", value.asInstanceOf[js.Any])
      
      inline def setUint(value: PFFI_TYPE): Self = StObject.set(x, "uint", value.asInstanceOf[js.Any])
      
      inline def setUint16(value: PFFI_TYPE): Self = StObject.set(x, "uint16", value.asInstanceOf[js.Any])
      
      inline def setUint32(value: PFFI_TYPE): Self = StObject.set(x, "uint32", value.asInstanceOf[js.Any])
      
      inline def setUint64(value: PFFI_TYPE): Self = StObject.set(x, "uint64", value.asInstanceOf[js.Any])
      
      inline def setUint8(value: PFFI_TYPE): Self = StObject.set(x, "uint8", value.asInstanceOf[js.Any])
      
      inline def setUlong(value: PFFI_TYPE): Self = StObject.set(x, "ulong", value.asInstanceOf[js.Any])
      
      inline def setUlonglong(value: PFFI_TYPE): Self = StObject.set(x, "ulonglong", value.asInstanceOf[js.Any])
      
      inline def setUshort(value: PFFI_TYPE): Self = StObject.set(x, "ushort", value.asInstanceOf[js.Any])
      
      inline def setVoid(value: PFFI_TYPE): Self = StObject.set(x, "void", value.asInstanceOf[js.Any])
    }
  }
  
  type LibraryDefinitionBase = Record[
    String, 
    js.Tuple3[
      /* retType */ Type[Any], 
      /* argTypes */ js.Array[Type[Any]], 
      /* opts */ js.UndefOr[LibraryFunctionOptions]
    ]
  ]
  
  trait LibraryFunctionOptions extends StObject {
    
    var abi: js.UndefOr[Double] = js.undefined
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var varargs: js.UndefOr[Boolean] = js.undefined
  }
  object LibraryFunctionOptions {
    
    inline def apply(): LibraryFunctionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LibraryFunctionOptions]
    }
    
    extension [Self <: LibraryFunctionOptions](x: Self) {
      
      inline def setAbi(value: Double): Self = StObject.set(x, "abi", value.asInstanceOf[js.Any])
      
      inline def setAbiUndefined: Self = StObject.set(x, "abi", js.undefined)
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setVarargs(value: Boolean): Self = StObject.set(x, "varargs", value.asInstanceOf[js.Any])
      
      inline def setVarargsUndefined: Self = StObject.set(x, "varargs", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    [T] extends [never] | [0] ? any : // catches T extends never/any (since `0` doesn't overlap with our constraint)
  {[ P in keyof T ]: T[P][2] extends undefined? ffi-napi.ffi-napi.ForeignFunction<ref-napi.ref-napi.UnderlyingType<T[P][0]>, ref-napi.ref-napi.UnderlyingTypes<T[P][1]>> : T[P][2] extends {  varargs :true}? ffi-napi.ffi-napi.VariadicForeignFunction<T[P][0], T[P][1]> : T[P][2] extends {  async :true}? (args : [...ref-napi.ref-napi.UnderlyingTypes<T[P][1]>, (err : any, value : ref-napi.ref-napi.UnderlyingType<T[P][0]>): void]): void : ffi-napi.ffi-napi.ForeignFunction<ref-napi.ref-napi.UnderlyingType<T[P][0]>, ref-napi.ref-napi.UnderlyingTypes<T[P][1]>>}
    }}}
    */
  @js.native
  trait LibraryObject[T /* <: LibraryDefinitionBase */] extends StObject
  
  type LibraryObjectDefinitionBase = Record[
    String, 
    js.Tuple3[
      /* retType */ TypeLike, 
      /* argTypes */ js.Array[TypeLike], 
      /* opts */ js.UndefOr[LibraryFunctionOptions]
    ]
  ]
  
  type LibraryObjectDefinitionInferenceMarker = Record[String, js.Tuple2[void, /* argTypes */ ArgTypesInferenceMarker]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    [T] extends [never] | [0] ? any : // catches T extends never/any (since `0` doesn't overlap with our constraint)
  {[ P in keyof T ]: [retType: ref-napi.ref-napi.CoerceType<T[P][0]>, argTypes: ref-napi.ref-napi.CoerceTypes<T[P][1]>, opts: T[P][2]]}
    }}}
    */
  @js.native
  trait LibraryObjectDefinitionToLibraryDefinition[T /* <: LibraryObjectDefinitionBase */] extends StObject
  
  type PFFI_TYPE = Pointer[typings.ffiNapi.mod.ffiType.FFI_TYPE]
  
  /* augmented module */
  object refNapiAugmentingMod {
    
    trait Type extends StObject {
      
      /**
        * Determines the FFI_TYPE set for a type.
        */
      var ffi_type: js.UndefOr[PFFI_TYPE] = js.undefined
    }
    object Type {
      
      inline def apply(): typings.ffiNapi.mod.refNapiAugmentingMod.Type = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.ffiNapi.mod.refNapiAugmentingMod.Type]
      }
      
      extension [Self <: typings.ffiNapi.mod.refNapiAugmentingMod.Type](x: Self) {
        
        inline def setFfi_type(value: PFFI_TYPE): Self = StObject.set(x, "ffi_type", value.asInstanceOf[js.Any])
        
        inline def setFfi_typeUndefined: Self = StObject.set(x, "ffi_type", js.undefined)
      }
    }
  }
}
