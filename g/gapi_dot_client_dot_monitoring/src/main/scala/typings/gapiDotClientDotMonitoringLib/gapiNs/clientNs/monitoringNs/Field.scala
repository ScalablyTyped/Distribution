package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  /** The field cardinality. */
  var cardinality: js.UndefOr[java.lang.String] = js.undefined
  /** The string value of the default value of this field. Proto2 syntax only. */
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  /** The field JSON name. */
  var jsonName: js.UndefOr[java.lang.String] = js.undefined
  /** The field type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The field name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The field number. */
  var number: js.UndefOr[scala.Double] = js.undefined
  /** The index of the field type in Type.oneofs, for message or enumeration types. The first type has index 1; zero means the type is not in the list. */
  var oneofIndex: js.UndefOr[scala.Double] = js.undefined
  /** The protocol buffer options. */
  var options: js.UndefOr[js.Array[Option]] = js.undefined
  /** Whether to use alternative packed wire representation. */
  var packed: js.UndefOr[scala.Boolean] = js.undefined
  /** The field type URL, without the scheme, for message or enumeration types. Example: "type.googleapis.com/google.protobuf.Timestamp". */
  var typeUrl: js.UndefOr[java.lang.String] = js.undefined
}

