package typings.googleGax.operationsMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.protobuf.DescriptorProto.IExtensionRange
import typings.googleGax.operationsMod.google.protobuf.DescriptorProto.IReservedRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a DescriptorProto. */
@JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto")
@js.native
/**
  * Constructs a new DescriptorProto.
  * @param [properties] Properties to set
  */
class DescriptorProto_ () extends IDescriptorProto {
  def this(properties: IDescriptorProto) = this()
  /** DescriptorProto enumType. */
  @JSName("enumType")
  var enumType_DescriptorProto_ : js.Array[IEnumDescriptorProto] = js.native
  /** DescriptorProto extensionRange. */
  @JSName("extensionRange")
  var extensionRange_DescriptorProto_ : js.Array[IExtensionRange] = js.native
  /** DescriptorProto extension. */
  @JSName("extension")
  var extension_DescriptorProto_ : js.Array[IFieldDescriptorProto] = js.native
  /** DescriptorProto field. */
  @JSName("field")
  var field_DescriptorProto_ : js.Array[IFieldDescriptorProto] = js.native
  /** DescriptorProto name. */
  @JSName("name")
  var name_DescriptorProto_ : String = js.native
  /** DescriptorProto nestedType. */
  @JSName("nestedType")
  var nestedType_DescriptorProto_ : js.Array[IDescriptorProto] = js.native
  /** DescriptorProto oneofDecl. */
  @JSName("oneofDecl")
  var oneofDecl_DescriptorProto_ : js.Array[IOneofDescriptorProto] = js.native
  /** DescriptorProto reservedName. */
  @JSName("reservedName")
  var reservedName_DescriptorProto_ : js.Array[String] = js.native
  /** DescriptorProto reservedRange. */
  @JSName("reservedRange")
  var reservedRange_DescriptorProto_ : js.Array[IReservedRange] = js.native
  /**
    * Converts this DescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

