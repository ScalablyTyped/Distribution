package typings.dialogflow.protosProtosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.protosProtosMod.google.protobuf.EnumDescriptorProto.IEnumReservedRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an EnumDescriptorProto. */
@JSImport("dialogflow/protos/protos", "google.protobuf.EnumDescriptorProto")
@js.native
/**
  * Constructs a new EnumDescriptorProto.
  * @param [properties] Properties to set
  */
class EnumDescriptorProto_ () extends IEnumDescriptorProto {
  def this(properties: IEnumDescriptorProto) = this()
  /** EnumDescriptorProto name. */
  @JSName("name")
  var name_EnumDescriptorProto_ : String = js.native
  /** EnumDescriptorProto reservedName. */
  @JSName("reservedName")
  var reservedName_EnumDescriptorProto_ : js.Array[String] = js.native
  /** EnumDescriptorProto reservedRange. */
  @JSName("reservedRange")
  var reservedRange_EnumDescriptorProto_ : js.Array[IEnumReservedRange] = js.native
  /** EnumDescriptorProto value. */
  @JSName("value")
  var value_EnumDescriptorProto_ : js.Array[IEnumValueDescriptorProto] = js.native
  /**
    * Converts this EnumDescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

