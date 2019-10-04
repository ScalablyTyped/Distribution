package typings.ebml.ebmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagMetadata extends js.Object {
  /** Size of data in bytes */
  var dataSize: Double
  /** End byte offset if known, else `-1` */
  var end: Double
  /** Element name */
  var name: /* import warning: ImportType.apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any
  /** Start byte offset */
  var start: Double
  /** EBML ID */
  var tag: Double
  /** EBML ID as a hex string */
  var tagStr: String
  /** Data type */
  var `type`: /* import warning: ImportType.apply Failed type conversion: ebml.ebml.EBMLTagSchema['type'] */ js.Any
}

object TagMetadata {
  @scala.inline
  def apply(
    dataSize: Double,
    end: Double,
    name: /* import warning: ImportType.apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any,
    start: Double,
    tag: Double,
    tagStr: String,
    `type`: /* import warning: ImportType.apply Failed type conversion: ebml.ebml.EBMLTagSchema['type'] */ js.Any
  ): TagMetadata = {
    val __obj = js.Dynamic.literal(dataSize = dataSize, end = end, name = name, start = start, tag = tag, tagStr = tagStr)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TagMetadata]
  }
}

