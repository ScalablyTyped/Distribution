package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.DescriptorProto.IExtensionRange
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.DescriptorProto.IReservedRange
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DescriptorProto. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.DescriptorProto")
@js.native
/**
  * Constructs a new DescriptorProto.
  * @param [properties] Properties to set
  */
open class DescriptorProto ()
  extends StObject
     with IDescriptorProto {
  def this(properties: IDescriptorProto) = this()
  
  /** DescriptorProto enumType. */
  @JSName("enumType")
  var enumType_DescriptorProto: js.Array[IEnumDescriptorProto] = js.native
  
  /** DescriptorProto extensionRange. */
  @JSName("extensionRange")
  var extensionRange_DescriptorProto: js.Array[IExtensionRange] = js.native
  
  /** DescriptorProto extension. */
  @JSName("extension")
  var extension_DescriptorProto: js.Array[IFieldDescriptorProto] = js.native
  
  /** DescriptorProto field. */
  @JSName("field")
  var field_DescriptorProto: js.Array[IFieldDescriptorProto] = js.native
  
  /** DescriptorProto name. */
  @JSName("name")
  var name_DescriptorProto: String = js.native
  
  /** DescriptorProto nestedType. */
  @JSName("nestedType")
  var nestedType_DescriptorProto: js.Array[IDescriptorProto] = js.native
  
  /** DescriptorProto oneofDecl. */
  @JSName("oneofDecl")
  var oneofDecl_DescriptorProto: js.Array[IOneofDescriptorProto] = js.native
  
  /** DescriptorProto reservedName. */
  @JSName("reservedName")
  var reservedName_DescriptorProto: js.Array[String] = js.native
  
  /** DescriptorProto reservedRange. */
  @JSName("reservedRange")
  var reservedRange_DescriptorProto: js.Array[IReservedRange] = js.native
  
  /**
    * Converts this DescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
}
object DescriptorProto {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.DescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents an ExtensionRange. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.DescriptorProto.ExtensionRange")
  @js.native
  /**
    * Constructs a new ExtensionRange.
    * @param [properties] Properties to set
    */
  open class ExtensionRange ()
    extends StObject
       with IExtensionRange {
    def this(properties: IExtensionRange) = this()
    
    /** ExtensionRange end. */
    @JSName("end")
    var end_ExtensionRange: Double = js.native
    
    /** ExtensionRange start. */
    @JSName("start")
    var start_ExtensionRange: Double = js.native
    
    /**
      * Converts this ExtensionRange to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[scala.Any] = js.native
  }
  object ExtensionRange {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.DescriptorProto.ExtensionRange")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an ExtensionRange message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ExtensionRange
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[scala.Any]): ExtensionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ExtensionRange]
    
    /**
      * Creates a plain object from an ExtensionRange message. Also converts values to other types if specified.
      * @param message ExtensionRange
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: ExtensionRange): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
    inline def toObject(message: ExtensionRange, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
  }
  
  /** Represents a ReservedRange. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.DescriptorProto.ReservedRange")
  @js.native
  /**
    * Constructs a new ReservedRange.
    * @param [properties] Properties to set
    */
  open class ReservedRange ()
    extends StObject
       with IReservedRange {
    def this(properties: IReservedRange) = this()
    
    /** ReservedRange end. */
    @JSName("end")
    var end_ReservedRange: Double = js.native
    
    /** ReservedRange start. */
    @JSName("start")
    var start_ReservedRange: Double = js.native
    
    /**
      * Converts this ReservedRange to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[scala.Any] = js.native
  }
  object ReservedRange {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.DescriptorProto.ReservedRange")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a ReservedRange message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ReservedRange
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[scala.Any]): ReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ReservedRange]
    
    /**
      * Creates a plain object from a ReservedRange message. Also converts values to other types if specified.
      * @param message ReservedRange
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: ReservedRange): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
    inline def toObject(message: ReservedRange, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
  }
  
  /**
    * Creates a DescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DescriptorProto
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): DescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DescriptorProto]
  
  /**
    * Creates a plain object from a DescriptorProto message. Also converts values to other types if specified.
    * @param message DescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: DescriptorProto): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: DescriptorProto, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
  
  /** Properties of an ExtensionRange. */
  trait IExtensionRange extends StObject {
    
    /** ExtensionRange end */
    var end: js.UndefOr[Double | Null] = js.undefined
    
    /** ExtensionRange start */
    var start: js.UndefOr[Double | Null] = js.undefined
  }
  object IExtensionRange {
    
    inline def apply(): IExtensionRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IExtensionRange]
    }
    
    extension [Self <: IExtensionRange](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndNull: Self = StObject.set(x, "end", null)
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartNull: Self = StObject.set(x, "start", null)
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  /** Properties of a ReservedRange. */
  trait IReservedRange extends StObject {
    
    /** ReservedRange end */
    var end: js.UndefOr[Double | Null] = js.undefined
    
    /** ReservedRange start */
    var start: js.UndefOr[Double | Null] = js.undefined
  }
  object IReservedRange {
    
    inline def apply(): IReservedRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IReservedRange]
    }
    
    extension [Self <: IReservedRange](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndNull: Self = StObject.set(x, "end", null)
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartNull: Self = StObject.set(x, "start", null)
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
