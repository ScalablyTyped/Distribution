package typings.dialogflow.mod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.protobuf.FieldDescriptorProto.Label
import typings.dialogflow.mod.google.protobuf.FieldDescriptorProto.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a FieldDescriptorProto. */
@JSImport("dialogflow/protos/protos", "google.protobuf.FieldDescriptorProto")
@js.native
/**
  * Constructs a new FieldDescriptorProto.
  * @param [properties] Properties to set
  */
class FieldDescriptorProto_ () extends IFieldDescriptorProto {
  def this(properties: IFieldDescriptorProto) = this()
  /** FieldDescriptorProto defaultValue. */
  @JSName("defaultValue")
  var defaultValue_FieldDescriptorProto_ : String = js.native
  /** FieldDescriptorProto extendee. */
  @JSName("extendee")
  var extendee_FieldDescriptorProto_ : String = js.native
  /** FieldDescriptorProto jsonName. */
  @JSName("jsonName")
  var jsonName_FieldDescriptorProto_ : String = js.native
  /** FieldDescriptorProto label. */
  @JSName("label")
  var label_FieldDescriptorProto_ : Label | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldDescriptorProto.Label * / any */ String) = js.native
  /** FieldDescriptorProto name. */
  @JSName("name")
  var name_FieldDescriptorProto_ : String = js.native
  /** FieldDescriptorProto number. */
  @JSName("number")
  var number_FieldDescriptorProto_ : Double = js.native
  /** FieldDescriptorProto oneofIndex. */
  @JSName("oneofIndex")
  var oneofIndex_FieldDescriptorProto_ : Double = js.native
  /** FieldDescriptorProto typeName. */
  @JSName("typeName")
  var typeName_FieldDescriptorProto_ : String = js.native
  /** FieldDescriptorProto type. */
  @JSName("type")
  var type_FieldDescriptorProto_ : Type | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldDescriptorProto.Type * / any */ String) = js.native
  /**
    * Converts this FieldDescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

