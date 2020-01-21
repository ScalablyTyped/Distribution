package typings.ebml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagMetadata extends js.Object {
  /** Size of data in bytes */
  var dataSize: Double
  /** End byte offset if known, else `-1` */
  var end: Double
  /** Element name */
  var name: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any
  /** Start byte offset */
  var start: Double
  /** EBML ID */
  var tag: Double
  /** EBML ID as a hex string */
  var tagStr: String
  /** Data type */
  var `type`: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['type'] */ js.Any
}

object TagMetadata {
  @scala.inline
  def apply(
    dataSize: Double,
    end: Double,
    name: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any,
    start: Double,
    tag: Double,
    tagStr: String,
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['type'] */ js.Any
  ): TagMetadata = {
    val __obj = js.Dynamic.literal(dataSize = dataSize.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagStr = tagStr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagMetadata]
  }
}

