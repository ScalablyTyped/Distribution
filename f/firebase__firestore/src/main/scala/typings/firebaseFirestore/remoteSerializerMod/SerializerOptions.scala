package typings.firebaseFirestore.remoteSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializerOptions extends js.Object {
  /**
    * The serializer supports both Protobuf.js and Proto3 JSON formats. By
    * setting this flag to true, the serializer will use the Proto3 JSON format.
    *
    * For a description of the Proto3 JSON format check
    * https://developers.google.com/protocol-buffers/docs/proto3#json
    */
  var useProto3Json: Boolean
}

object SerializerOptions {
  @scala.inline
  def apply(useProto3Json: Boolean): SerializerOptions = {
    val __obj = js.Dynamic.literal(useProto3Json = useProto3Json.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SerializerOptions]
  }
}

