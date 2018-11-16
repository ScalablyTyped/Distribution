package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Option extends js.Object {
  /**
               * The option's name. For protobuf built-in options (options defined in
               * descriptor.proto), this is the short name. For example, `"map_entry"`.
               * For custom options, it should be the fully-qualified name. For example,
               * `"google.api.http"`.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The option's value packed in an Any message. If the value is a primitive,
               * the corresponding wrapper type defined in google/protobuf/wrappers.proto
               * should be used. If the value is an enum, it should be stored as an int32
               * value using the google.protobuf.Int32Value type.
               */
  var value: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
}

