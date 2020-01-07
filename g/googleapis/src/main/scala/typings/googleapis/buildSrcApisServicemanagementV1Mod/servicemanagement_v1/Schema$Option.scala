package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A protocol buffer option, which can be attached to a message, field,
  * enumeration, etc.
  */
@js.native
trait Schema$Option extends js.Object {
  /**
    * The option&#39;s name. For protobuf built-in options (options defined in
    * descriptor.proto), this is the short name. For example,
    * `&quot;map_entry&quot;`. For custom options, it should be the
    * fully-qualified name. For example, `&quot;google.api.http&quot;`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The option&#39;s value packed in an Any message. If the value is a
    * primitive, the corresponding wrapper type defined in
    * google/protobuf/wrappers.proto should be used. If the value is an enum,
    * it should be stored as an int32 value using the
    * google.protobuf.Int32Value type.
    */
  var value: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object Schema$Option {
  @scala.inline
  def apply(name: String = null, value: StringDictionary[js.Any] = null): Schema$Option = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Option]
  }
}

