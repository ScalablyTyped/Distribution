package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.DocumentTransform.FieldTransform.ServerValue
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.DocumentTransform.IFieldTransform
import typings.googleCloudFirestore.googleCloudFirestoreStrings.appendMissingElements
import typings.googleCloudFirestore.googleCloudFirestoreStrings.increment
import typings.googleCloudFirestore.googleCloudFirestoreStrings.maximum
import typings.googleCloudFirestore.googleCloudFirestoreStrings.minimum
import typings.googleCloudFirestore.googleCloudFirestoreStrings.removeAllFromArray
import typings.googleCloudFirestore.googleCloudFirestoreStrings.setToServerValue
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DocumentTransform. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.DocumentTransform")
@js.native
/**
  * Constructs a new DocumentTransform.
  * @param [properties] Properties to set
  */
open class DocumentTransform ()
  extends StObject
     with IDocumentTransform {
  def this(properties: IDocumentTransform) = this()
  
  /** DocumentTransform document. */
  @JSName("document")
  var document_DocumentTransform: String = js.native
  
  /** DocumentTransform fieldTransforms. */
  @JSName("fieldTransforms")
  var fieldTransforms_DocumentTransform: js.Array[IFieldTransform] = js.native
  
  /**
    * Converts this DocumentTransform to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object DocumentTransform {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.DocumentTransform")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a FieldTransform. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.DocumentTransform.FieldTransform")
  @js.native
  /**
    * Constructs a new FieldTransform.
    * @param [properties] Properties to set
    */
  open class FieldTransform ()
    extends StObject
       with IFieldTransform {
    def this(properties: IFieldTransform) = this()
    
    /** FieldTransform fieldPath. */
    @JSName("fieldPath")
    var fieldPath_FieldTransform: String = js.native
    
    /**
      * Converts this FieldTransform to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /** FieldTransform transformType. */
    var transformType: js.UndefOr[
        setToServerValue | increment | maximum | minimum | appendMissingElements | removeAllFromArray
      ] = js.native
  }
  object FieldTransform {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.DocumentTransform.FieldTransform")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a FieldTransform message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns FieldTransform
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): FieldTransform = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[FieldTransform]
    
    /**
      * Creates a plain object from a FieldTransform message. Also converts values to other types if specified.
      * @param message FieldTransform
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: FieldTransform): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: FieldTransform, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /** ServerValue enum. */
    /* Rewritten from type alias, can be one of: 
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.SERVER_VALUE_UNSPECIFIED
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.REQUEST_TIME
    */
    trait ServerValue extends StObject
    object ServerValue {
      
      inline def REQUEST_TIME: typings.googleCloudFirestore.googleCloudFirestoreStrings.REQUEST_TIME = "REQUEST_TIME".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.REQUEST_TIME]
      
      inline def SERVER_VALUE_UNSPECIFIED: typings.googleCloudFirestore.googleCloudFirestoreStrings.SERVER_VALUE_UNSPECIFIED = "SERVER_VALUE_UNSPECIFIED".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.SERVER_VALUE_UNSPECIFIED]
    }
  }
  
  /**
    * Creates a DocumentTransform message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DocumentTransform
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): DocumentTransform = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DocumentTransform]
  
  /**
    * Creates a plain object from a DocumentTransform message. Also converts values to other types if specified.
    * @param message DocumentTransform
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: DocumentTransform): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: DocumentTransform, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /** Properties of a FieldTransform. */
  trait IFieldTransform extends StObject {
    
    /** FieldTransform appendMissingElements */
    var appendMissingElements: js.UndefOr[IArrayValue | Null] = js.undefined
    
    /** FieldTransform fieldPath */
    var fieldPath: js.UndefOr[String | Null] = js.undefined
    
    /** FieldTransform increment */
    var increment: js.UndefOr[IValue | Null] = js.undefined
    
    /** FieldTransform maximum */
    var maximum: js.UndefOr[IValue | Null] = js.undefined
    
    /** FieldTransform minimum */
    var minimum: js.UndefOr[IValue | Null] = js.undefined
    
    /** FieldTransform removeAllFromArray */
    var removeAllFromArray: js.UndefOr[IArrayValue | Null] = js.undefined
    
    /** FieldTransform setToServerValue */
    var setToServerValue: js.UndefOr[ServerValue | Null] = js.undefined
  }
  object IFieldTransform {
    
    inline def apply(): IFieldTransform = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFieldTransform]
    }
    
    extension [Self <: IFieldTransform](x: Self) {
      
      inline def setAppendMissingElements(value: IArrayValue): Self = StObject.set(x, "appendMissingElements", value.asInstanceOf[js.Any])
      
      inline def setAppendMissingElementsNull: Self = StObject.set(x, "appendMissingElements", null)
      
      inline def setAppendMissingElementsUndefined: Self = StObject.set(x, "appendMissingElements", js.undefined)
      
      inline def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
      
      inline def setFieldPathNull: Self = StObject.set(x, "fieldPath", null)
      
      inline def setFieldPathUndefined: Self = StObject.set(x, "fieldPath", js.undefined)
      
      inline def setIncrement(value: IValue): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
      
      inline def setIncrementNull: Self = StObject.set(x, "increment", null)
      
      inline def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
      
      inline def setMaximum(value: IValue): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumNull: Self = StObject.set(x, "maximum", null)
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      inline def setMinimum(value: IValue): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      inline def setMinimumNull: Self = StObject.set(x, "minimum", null)
      
      inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      inline def setRemoveAllFromArray(value: IArrayValue): Self = StObject.set(x, "removeAllFromArray", value.asInstanceOf[js.Any])
      
      inline def setRemoveAllFromArrayNull: Self = StObject.set(x, "removeAllFromArray", null)
      
      inline def setRemoveAllFromArrayUndefined: Self = StObject.set(x, "removeAllFromArray", js.undefined)
      
      inline def setSetToServerValue(value: ServerValue): Self = StObject.set(x, "setToServerValue", value.asInstanceOf[js.Any])
      
      inline def setSetToServerValueNull: Self = StObject.set(x, "setToServerValue", null)
      
      inline def setSetToServerValueUndefined: Self = StObject.set(x, "setToServerValue", js.undefined)
    }
  }
}
