package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.googleCloudFirestoreStrings.readOnly
import typings.googleCloudFirestore.googleCloudFirestoreStrings.readTime
import typings.googleCloudFirestore.googleCloudFirestoreStrings.readWrite
import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf.ITimestamp
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TransactionOptions. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.TransactionOptions")
@js.native
/**
  * Constructs a new TransactionOptions.
  * @param [properties] Properties to set
  */
open class TransactionOptions ()
  extends StObject
     with ITransactionOptions {
  def this(properties: ITransactionOptions) = this()
  
  /** TransactionOptions mode. */
  var mode: js.UndefOr[readOnly | readWrite] = js.native
  
  /**
    * Converts this TransactionOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object TransactionOptions {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.TransactionOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a ReadOnly. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.TransactionOptions.ReadOnly")
  @js.native
  /**
    * Constructs a new ReadOnly.
    * @param [properties] Properties to set
    */
  open class ReadOnly ()
    extends StObject
       with IReadOnly {
    def this(properties: IReadOnly) = this()
    
    /** ReadOnly consistencySelector. */
    var consistencySelector: js.UndefOr[readTime] = js.native
    
    /**
      * Converts this ReadOnly to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object ReadOnly {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.TransactionOptions.ReadOnly")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a ReadOnly message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ReadOnly
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): ReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ReadOnly]
    
    /**
      * Creates a plain object from a ReadOnly message. Also converts values to other types if specified.
      * @param message ReadOnly
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: ReadOnly): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: ReadOnly, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /** Represents a ReadWrite. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.TransactionOptions.ReadWrite")
  @js.native
  /**
    * Constructs a new ReadWrite.
    * @param [properties] Properties to set
    */
  open class ReadWrite ()
    extends StObject
       with IReadWrite {
    def this(properties: IReadWrite) = this()
    
    /** ReadWrite retryTransaction. */
    @JSName("retryTransaction")
    var retryTransaction_ReadWrite: js.typedarray.Uint8Array = js.native
    
    /**
      * Converts this ReadWrite to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object ReadWrite {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.TransactionOptions.ReadWrite")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a ReadWrite message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ReadWrite
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): ReadWrite = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ReadWrite]
    
    /**
      * Creates a plain object from a ReadWrite message. Also converts values to other types if specified.
      * @param message ReadWrite
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: ReadWrite): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: ReadWrite, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /**
    * Creates a TransactionOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TransactionOptions
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): TransactionOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TransactionOptions]
  
  /**
    * Creates a plain object from a TransactionOptions message. Also converts values to other types if specified.
    * @param message TransactionOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: TransactionOptions): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: TransactionOptions, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /** Properties of a ReadOnly. */
  trait IReadOnly extends StObject {
    
    /** ReadOnly readTime */
    var readTime: js.UndefOr[ITimestamp | Null] = js.undefined
  }
  object IReadOnly {
    
    inline def apply(): IReadOnly = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IReadOnly]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IReadOnly] (val x: Self) extends AnyVal {
      
      inline def setReadTime(value: ITimestamp): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
      
      inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
      
      inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    }
  }
  
  /** Properties of a ReadWrite. */
  trait IReadWrite extends StObject {
    
    /** ReadWrite retryTransaction */
    var retryTransaction: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  }
  object IReadWrite {
    
    inline def apply(): IReadWrite = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IReadWrite]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IReadWrite] (val x: Self) extends AnyVal {
      
      inline def setRetryTransaction(value: js.typedarray.Uint8Array): Self = StObject.set(x, "retryTransaction", value.asInstanceOf[js.Any])
      
      inline def setRetryTransactionNull: Self = StObject.set(x, "retryTransaction", null)
      
      inline def setRetryTransactionUndefined: Self = StObject.set(x, "retryTransaction", js.undefined)
    }
  }
}
