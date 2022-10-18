package typings.googleCloudSpanner

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.anon.FnCall
import typings.googleCloudSpanner.anon.TypeofStruct
import typings.protobufjs.mod.common.IListValue
import typings.protobufjs.mod.common.ITimestamp
import typings.protobufjs.mod.common.IValue
import typings.std.Array
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCodecMod {
  
  @JSImport("@google-cloud/spanner/build/src/codec", "Float")
  @js.native
  open class Float protected ()
    extends StObject
       with WrappedNumber {
    def this(value: Double) = this()
    
    /* CompleteClass */
    var value: String | Double = js.native
    @JSName("value")
    var value_Float: Double = js.native
  }
  
  @JSImport("@google-cloud/spanner/build/src/codec", "Int")
  @js.native
  open class Int protected ()
    extends StObject
       with WrappedNumber {
    def this(value: String) = this()
    
    /* CompleteClass */
    var value: String | Double = js.native
    @JSName("value")
    var value_Int: String = js.native
  }
  
  @JSImport("@google-cloud/spanner/build/src/codec", "Numeric")
  @js.native
  open class Numeric protected () extends StObject {
    def this(value: String) = this()
    
    def toJSON(): String = js.native
    
    var value: String = js.native
  }
  
  @JSImport("@google-cloud/spanner/build/src/codec", "PGNumeric")
  @js.native
  open class PGNumeric protected () extends StObject {
    def this(pgValue: String) = this()
    def this(pgValue: Double) = this()
    
    def toJSON(): String = js.native
    
    var value: String = js.native
  }
  
  @JSImport("@google-cloud/spanner/build/src/codec", "SpannerDate")
  @js.native
  open class SpannerDate ()
    extends StObject
       with Date {
    def this(dateString: String) = this()
    def this(year: Double, month: Double, date: Double) = this()
  }
  
  @JSImport("@google-cloud/spanner/build/src/codec", "Struct")
  @js.native
  open class Struct ()
    extends StObject
       with Array[Field] {
    
    /**
      * Converts struct into a pojo (plain old JavaScript object).
      *
      * @param {JSONOptions} [options] JSON options.
      * @returns {object}
      */
    def toJSON(): Json = js.native
    def toJSON(options: JSONOptions): Json = js.native
  }
  /* static members */
  object Struct {
    
    @JSImport("@google-cloud/spanner/build/src/codec", "Struct")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Converts an array of fields to a struct.
      *
      * @private
      *
      * @param {object[]} fields List of struct fields.
      * @return {Struct}
      */
    inline def fromArray(fields: js.Array[Field]): Struct = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(fields.asInstanceOf[js.Any]).asInstanceOf[Struct]
    
    /**
      * Converts a JSON object to a struct.
      *
      * @private
      *
      * @param {object} json Struct JSON.
      * @return {Struct}
      */
    inline def fromJSON(json: Json): Struct = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Struct]
  }
  
  object codec {
    
    @JSImport("@google-cloud/spanner/build/src/codec", "codec")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@google-cloud/spanner/build/src/codec", "codec.Float")
    @js.native
    def Float: Instantiable1[/* value */ Double, typings.googleCloudSpanner.buildSrcCodecMod.Float] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@google-cloud/spanner/build/src/codec", "codec.Float")
    @js.native
    open class FloatCls protected () extends Float {
      def this(value: Double) = this()
    }
    
    inline def Float_=(x: Instantiable1[/* value */ Double, Float]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/spanner/build/src/codec", "codec.Int")
    @js.native
    def Int: Instantiable1[/* value */ String, typings.googleCloudSpanner.buildSrcCodecMod.Int] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@google-cloud/spanner/build/src/codec", "codec.Int")
    @js.native
    open class IntCls protected () extends Int {
      def this(value: String) = this()
    }
    
    inline def Int_=(x: Instantiable1[/* value */ String, Int]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Int")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/spanner/build/src/codec", "codec.Numeric")
    @js.native
    def Numeric: Instantiable1[/* value */ String, typings.googleCloudSpanner.buildSrcCodecMod.Numeric] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@google-cloud/spanner/build/src/codec", "codec.Numeric")
    @js.native
    open class NumericCls protected () extends Numeric {
      def this(value: String) = this()
    }
    
    inline def Numeric_=(x: Instantiable1[/* value */ String, Numeric]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Numeric")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/spanner/build/src/codec", "codec.PGNumeric")
    @js.native
    def PGNumeric: Instantiable1[
        /* pgValue */ String | Double, 
        typings.googleCloudSpanner.buildSrcCodecMod.PGNumeric
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@google-cloud/spanner/build/src/codec", "codec.PGNumeric")
    @js.native
    open class PGNumericCls protected () extends PGNumeric {
      def this(pgValue: String) = this()
      def this(pgValue: Double) = this()
    }
    
    inline def PGNumeric_=(x: Instantiable1[/* pgValue */ String | Double, PGNumeric]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PGNumeric")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/spanner/build/src/codec", "codec.SpannerDate")
    @js.native
    def SpannerDate: Instantiable1[
        /* dateString */ js.UndefOr[String], 
        typings.googleCloudSpanner.buildSrcCodecMod.SpannerDate
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@google-cloud/spanner/build/src/codec", "codec.SpannerDate")
    @js.native
    open class SpannerDateCls () extends SpannerDate {
      def this(dateString: String) = this()
    }
    
    inline def SpannerDate_=(x: Instantiable1[/* dateString */ js.UndefOr[String], SpannerDate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpannerDate")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/spanner/build/src/codec", "codec.Struct")
    @js.native
    def Struct: TypeofStruct = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@google-cloud/spanner/build/src/codec", "codec.Struct")
    @js.native
    open class StructCls () extends Struct
    
    inline def Struct_=(x: TypeofStruct): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Struct")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/spanner/build/src/codec", "codec.convertFieldsToJson")
    @js.native
    def convertFieldsToJson: js.Function2[/* fields */ js.Array[Field], /* options */ js.UndefOr[JSONOptions], Json] = js.native
    inline def convertFieldsToJson(fields: js.Array[Field]): Json = ^.asInstanceOf[js.Dynamic].applyDynamic("convertFieldsToJson")(fields.asInstanceOf[js.Any]).asInstanceOf[Json]
    inline def convertFieldsToJson(fields: js.Array[Field], options: JSONOptions): Json = (^.asInstanceOf[js.Dynamic].applyDynamic("convertFieldsToJson")(fields.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Json]
    inline def convertFieldsToJson_=(x: js.Function2[/* fields */ js.Array[Field], /* options */ js.UndefOr[JSONOptions], Json]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("convertFieldsToJson")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/spanner/build/src/codec", "codec.convertMsToProtoTimestamp")
    @js.native
    def convertMsToProtoTimestamp: js.Function1[
        /* ms */ Double, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify spannerClient.protobuf.ITimestamp */ Any
      ] = js.native
    inline def convertMsToProtoTimestamp(ms: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("convertMsToProtoTimestamp")(ms.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def convertMsToProtoTimestamp_=(
      x: js.Function1[
          /* ms */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify spannerClient.protobuf.ITimestamp */ Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("convertMsToProtoTimestamp")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/spanner/build/src/codec", "codec.convertProtoTimestampToDate")
    @js.native
    def convertProtoTimestampToDate: js.Function1[/* hasNanosSeconds */ ITimestamp, js.Date] = js.native
    inline def convertProtoTimestampToDate(hasNanosSeconds: ITimestamp): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("convertProtoTimestampToDate")(hasNanosSeconds.asInstanceOf[js.Any]).asInstanceOf[js.Date]
    inline def convertProtoTimestampToDate_=(x: js.Function1[/* hasNanosSeconds */ ITimestamp, js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("convertProtoTimestampToDate")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/spanner/build/src/codec", "codec.convertToListValue")
    @js.native
    def convertToListValue: FnCall = js.native
    inline def convertToListValue[T](value: T): IListValue = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToListValue")(value.asInstanceOf[js.Any]).asInstanceOf[IListValue]
    inline def convertToListValue_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("convertToListValue")(x.asInstanceOf[js.Any])
    
    inline def createTypeObject(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeObject")().asInstanceOf[Any]
    inline def createTypeObject(friendlyType: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeObject")(friendlyType.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def createTypeObject(friendlyType: Type): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeObject")(friendlyType.asInstanceOf[js.Any]).asInstanceOf[Any]
    @JSImport("@google-cloud/spanner/build/src/codec", "codec.createTypeObject")
    @js.native
    def createTypeObject_Fcodec: js.Function1[
        /* friendlyType */ js.UndefOr[String | Type], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify spannerClient.spanner.v1.Type */ Any
      ] = js.native
    
    inline def createTypeObject_Fcodec_=(
      x: js.Function1[
          /* friendlyType */ js.UndefOr[String | Type], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify spannerClient.spanner.v1.Type */ Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createTypeObject")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/spanner/build/src/codec", "codec.decode")
    @js.native
    def decode: js.Function2[
        /* value */ Value, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify spannerClient.spanner.v1.Type */ /* type */ Any, 
        Value
      ] = js.native
    inline def decode(
      value: Value,
      `type`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify spannerClient.spanner.v1.Type */ Any
    ): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Value]
    inline def decode_=(
      x: js.Function2[
          /* value */ Value, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify spannerClient.spanner.v1.Type */ /* type */ Any, 
          Value
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decode")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/spanner/build/src/codec", "codec.encode")
    @js.native
    def encode: js.Function1[/* value */ Value, IValue] = js.native
    inline def encode(value: Value): IValue = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(value.asInstanceOf[js.Any]).asInstanceOf[IValue]
    inline def encode_=(x: js.Function1[/* value */ Value, IValue]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encode")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/spanner/build/src/codec", "codec.getType")
    @js.native
    def getType: js.Function1[/* value */ Value, Type] = js.native
    inline def getType(value: Value): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(value.asInstanceOf[js.Any]).asInstanceOf[Type]
    inline def getType_=(x: js.Function1[/* value */ Value, Type]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getType")(x.asInstanceOf[js.Any])
  }
  
  trait Field extends StObject {
    
    var name: String
    
    var value: Value
  }
  object Field {
    
    inline def apply(name: String, value: Value): Field = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Field]
    }
    
    extension [Self <: Field](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldType
    extends StObject
       with Type {
    
    var name: String
  }
  object FieldType {
    
    inline def apply(name: String, `type`: String): FieldType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldType]
    }
    
    extension [Self <: FieldType](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSONOptions extends StObject {
    
    var includeNameless: js.UndefOr[Boolean] = js.undefined
    
    var wrapNumbers: js.UndefOr[Boolean] = js.undefined
    
    var wrapStructs: js.UndefOr[Boolean] = js.undefined
  }
  object JSONOptions {
    
    inline def apply(): JSONOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONOptions]
    }
    
    extension [Self <: JSONOptions](x: Self) {
      
      inline def setIncludeNameless(value: Boolean): Self = StObject.set(x, "includeNameless", value.asInstanceOf[js.Any])
      
      inline def setIncludeNamelessUndefined: Self = StObject.set(x, "includeNameless", js.undefined)
      
      inline def setWrapNumbers(value: Boolean): Self = StObject.set(x, "wrapNumbers", value.asInstanceOf[js.Any])
      
      inline def setWrapNumbersUndefined: Self = StObject.set(x, "wrapNumbers", js.undefined)
      
      inline def setWrapStructs(value: Boolean): Self = StObject.set(x, "wrapStructs", value.asInstanceOf[js.Any])
      
      inline def setWrapStructsUndefined: Self = StObject.set(x, "wrapStructs", js.undefined)
    }
  }
  
  type Json = StringDictionary[Value]
  
  trait Type extends StObject {
    
    var child: js.UndefOr[Type] = js.undefined
    
    var fields: js.UndefOr[js.Array[FieldType]] = js.undefined
    
    var `type`: String
  }
  object Type {
    
    inline def apply(`type`: String): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setChild(value: Type): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      inline def setFields(value: js.Array[FieldType]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: FieldType*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Value = Any
  
  /**
    * Using an abstract class to simplify checking for wrapped numbers.
    *
    * @private
    */
  trait WrappedNumber extends StObject {
    
    var value: String | Double
  }
  object WrappedNumber {
    
    inline def apply(value: String | Double): WrappedNumber = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrappedNumber]
    }
    
    extension [Self <: WrappedNumber](x: Self) {
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
