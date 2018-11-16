package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BigtableColumn extends js.Object {
  /**
               * [Optional] The encoding of the values when the type is not STRING. Acceptable encoding values are: TEXT - indicates values are alphanumeric text
               * strings. BINARY - indicates values are encoded using HBase Bytes.toBytes family of functions. 'encoding' can also be set at the column family level.
               * However, the setting at this level takes precedence if 'encoding' is set at both levels.
               */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
               * [Optional] If the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]&#42;, a valid identifier must be provided as
               * the column field name and is used as field name in queries.
               */
  var fieldName: js.UndefOr[java.lang.String] = js.undefined
  /**
               * [Optional] If this is set, only the latest version of value in this column are exposed. 'onlyReadLatest' can also be set at the column family level.
               * However, the setting at this level takes precedence if 'onlyReadLatest' is set at both levels.
               */
  var onlyReadLatest: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * [Required] Qualifier of the column. Columns in the parent column family that has this exact qualifier are exposed as . field. If the qualifier is valid
               * UTF-8 string, it can be specified in the qualifier_string field. Otherwise, a base-64 encoded value must be set to qualifier_encoded. The column field
               * name is the same as the column qualifier. However, if the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]&#42;,
               * a valid identifier must be provided as field_name.
               */
  var qualifierEncoded: js.UndefOr[java.lang.String] = js.undefined
  var qualifierString: js.UndefOr[java.lang.String] = js.undefined
  /**
               * [Optional] The type to convert the value in cells of this column. The values are expected to be encoded using HBase Bytes.toBytes function when using
               * the BINARY encoding value. Following BigQuery types are allowed (case-sensitive) - BYTES STRING INTEGER FLOAT BOOLEAN Default type is BYTES. 'type' can
               * also be set at the column family level. However, the setting at this level takes precedence if 'type' is set at both levels.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

