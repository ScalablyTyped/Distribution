package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf.IAny
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace rpc. */
object rpc {
  
  /** Represents a Status. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.rpc.Status")
  @js.native
  /**
    * Constructs a new Status.
    * @param [properties] Properties to set
    */
  open class Status ()
    extends StObject
       with IStatus {
    def this(properties: IStatus) = this()
    
    /** Status code. */
    @JSName("code")
    var code_Status: Double = js.native
    
    /** Status details. */
    @JSName("details")
    var details_Status: js.Array[IAny] = js.native
    
    /** Status message. */
    @JSName("message")
    var message_Status: String = js.native
    
    /**
      * Converts this Status to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object Status {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.rpc.Status")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a Status message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Status
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): Status = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Status]
    
    /**
      * Creates a plain object from a Status message. Also converts values to other types if specified.
      * @param message Status
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Status): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Status, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /** Properties of a Status. */
  trait IStatus extends StObject {
    
    /** Status code */
    var code: js.UndefOr[Double | Null] = js.undefined
    
    /** Status details */
    var details: js.UndefOr[js.Array[IAny] | Null] = js.undefined
    
    /** Status message */
    var message: js.UndefOr[String | Null] = js.undefined
  }
  object IStatus {
    
    inline def apply(): IStatus = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStatus]
    }
    
    extension [Self <: IStatus](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeNull: Self = StObject.set(x, "code", null)
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setDetails(value: js.Array[IAny]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsNull: Self = StObject.set(x, "details", null)
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setDetailsVarargs(value: IAny*): Self = StObject.set(x, "details", js.Array(value*))
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageNull: Self = StObject.set(x, "message", null)
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
