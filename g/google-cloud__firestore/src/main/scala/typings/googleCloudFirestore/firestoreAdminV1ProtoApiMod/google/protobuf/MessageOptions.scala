package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MessageOptions. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.MessageOptions")
@js.native
/**
  * Constructs a new MessageOptions.
  * @param [properties] Properties to set
  */
open class MessageOptions ()
  extends StObject
     with IMessageOptions {
  def this(properties: IMessageOptions) = this()
  
  /** MessageOptions deprecated. */
  @JSName("deprecated")
  var deprecated_MessageOptions: Boolean = js.native
  
  /** MessageOptions mapEntry. */
  @JSName("mapEntry")
  var mapEntry_MessageOptions: Boolean = js.native
  
  /** MessageOptions messageSetWireFormat. */
  @JSName("messageSetWireFormat")
  var messageSetWireFormat_MessageOptions: Boolean = js.native
  
  /** MessageOptions noStandardDescriptorAccessor. */
  @JSName("noStandardDescriptorAccessor")
  var noStandardDescriptorAccessor_MessageOptions: Boolean = js.native
  
  /**
    * Converts this MessageOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
  
  /** MessageOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_MessageOptions: js.Array[IUninterpretedOption] = js.native
}
object MessageOptions {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.MessageOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a MessageOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns MessageOptions
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): MessageOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[MessageOptions]
  
  /**
    * Creates a plain object from a MessageOptions message. Also converts values to other types if specified.
    * @param message MessageOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: MessageOptions): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: MessageOptions, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
}
