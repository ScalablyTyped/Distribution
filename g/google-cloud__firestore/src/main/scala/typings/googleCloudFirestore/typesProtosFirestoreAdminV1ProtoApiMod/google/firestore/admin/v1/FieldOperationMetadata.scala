package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.FieldOperationMetadata.IIndexConfigDelta
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.FieldOperationMetadata.IndexConfigDelta.ChangeType
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FieldOperationMetadata. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.FieldOperationMetadata")
@js.native
/**
  * Constructs a new FieldOperationMetadata.
  * @param [properties] Properties to set
  */
open class FieldOperationMetadata ()
  extends StObject
     with IFieldOperationMetadata {
  def this(properties: IFieldOperationMetadata) = this()
  
  /** FieldOperationMetadata field. */
  @JSName("field")
  var field_FieldOperationMetadata: String = js.native
  
  /** FieldOperationMetadata indexConfigDeltas. */
  @JSName("indexConfigDeltas")
  var indexConfigDeltas_FieldOperationMetadata: js.Array[IIndexConfigDelta] = js.native
  
  /** FieldOperationMetadata state. */
  @JSName("state")
  var state_FieldOperationMetadata: OperationState = js.native
  
  /**
    * Converts this FieldOperationMetadata to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object FieldOperationMetadata {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.FieldOperationMetadata")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents an IndexConfigDelta. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.FieldOperationMetadata.IndexConfigDelta")
  @js.native
  /**
    * Constructs a new IndexConfigDelta.
    * @param [properties] Properties to set
    */
  open class IndexConfigDelta ()
    extends StObject
       with IIndexConfigDelta {
    def this(properties: IIndexConfigDelta) = this()
    
    /** IndexConfigDelta changeType. */
    @JSName("changeType")
    var changeType_IndexConfigDelta: ChangeType = js.native
    
    /**
      * Converts this IndexConfigDelta to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object IndexConfigDelta {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.FieldOperationMetadata.IndexConfigDelta")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an IndexConfigDelta message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns IndexConfigDelta
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): IndexConfigDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[IndexConfigDelta]
    
    /**
      * Creates a plain object from an IndexConfigDelta message. Also converts values to other types if specified.
      * @param message IndexConfigDelta
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: IndexConfigDelta): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: IndexConfigDelta, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /** ChangeType enum. */
    /* Rewritten from type alias, can be one of: 
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.CHANGE_TYPE_UNSPECIFIED
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.ADD
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.REMOVE
    */
    trait ChangeType extends StObject
    object ChangeType {
      
      inline def ADD: typings.googleCloudFirestore.googleCloudFirestoreStrings.ADD = "ADD".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.ADD]
      
      inline def CHANGE_TYPE_UNSPECIFIED: typings.googleCloudFirestore.googleCloudFirestoreStrings.CHANGE_TYPE_UNSPECIFIED = "CHANGE_TYPE_UNSPECIFIED".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.CHANGE_TYPE_UNSPECIFIED]
      
      inline def REMOVE: typings.googleCloudFirestore.googleCloudFirestoreStrings.REMOVE = "REMOVE".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.REMOVE]
    }
  }
  
  /**
    * Creates a FieldOperationMetadata message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FieldOperationMetadata
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): FieldOperationMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[FieldOperationMetadata]
  
  /**
    * Creates a plain object from a FieldOperationMetadata message. Also converts values to other types if specified.
    * @param message FieldOperationMetadata
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: FieldOperationMetadata): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: FieldOperationMetadata, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /** Properties of an IndexConfigDelta. */
  trait IIndexConfigDelta extends StObject {
    
    /** IndexConfigDelta changeType */
    var changeType: js.UndefOr[ChangeType | Null] = js.undefined
    
    /** IndexConfigDelta index */
    var index: js.UndefOr[IIndex | Null] = js.undefined
  }
  object IIndexConfigDelta {
    
    inline def apply(): IIndexConfigDelta = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IIndexConfigDelta]
    }
    
    extension [Self <: IIndexConfigDelta](x: Self) {
      
      inline def setChangeType(value: ChangeType): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
      
      inline def setChangeTypeNull: Self = StObject.set(x, "changeType", null)
      
      inline def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
      
      inline def setIndex(value: IIndex): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexNull: Self = StObject.set(x, "index", null)
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    }
  }
}
