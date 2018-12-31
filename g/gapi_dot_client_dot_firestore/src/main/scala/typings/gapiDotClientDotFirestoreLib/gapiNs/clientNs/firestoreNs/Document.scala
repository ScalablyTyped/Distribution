package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  /**
    * Output only. The time at which the document was created.
    *
    * This value increases monotonically when a document is deleted then
    * recreated. It can also be compared to values from other documents and
    * the `read_time` of a query.
    */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The document's fields.
    *
    * The map keys represent field names.
    *
    * A simple field name contains only characters `a` to `z`, `A` to `Z`,
    * `0` to `9`, or `_`, and must not start with `0` to `9` or `_`. For example,
    * `foo_bar_17`.
    *
    * Field names matching the regular expression `__.&#42;__` are reserved. Reserved
    * field names are forbidden except in certain documented contexts. The map
    * keys, represented as UTF-8, must not exceed 1,500 bytes and cannot be
    * empty.
    *
    * Field paths may be used in other contexts to refer to structured fields
    * defined here. For `map_value`, the field path is represented by the simple
    * or quoted field names of the containing fields, delimited by `.`. For
    * example, the structured field
    * `"foo" : { map_value: { "x&y" : { string_value: "hello" }}}` would be
    * represented by the field path `foo.x&y`.
    *
    * Within a field path, a quoted field name starts and ends with `` ` `` and
    * may contain any character. Some characters, including `` ` ``, must be
    * escaped using a `\`. For example, `` `x&y` `` represents `x&y` and
    * `` `bak\`tik` `` represents `` bak`tik ``.
    */
  var fields: js.UndefOr[stdLib.Record[java.lang.String, Value]] = js.undefined
  /**
    * The resource name of the document, for example
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Output only. The time at which the document was last changed.
    *
    * This value is initally set to the `create_time` then increases
    * monotonically with each change to the document. It can also be
    * compared to values from other documents and the `read_time` of a query.
    */
  var updateTime: js.UndefOr[java.lang.String] = js.undefined
}

