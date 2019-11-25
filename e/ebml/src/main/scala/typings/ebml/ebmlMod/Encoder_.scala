package typings.ebml.ebmlMod

import typings.ebml.ebmlMod.Encoder.TagStackItem
import typings.ebml.ebmlStrings.end
import typings.node.Buffer
import typings.node.streamMod.Transform
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ebml", "Encoder")
@js.native
class Encoder_ () extends Transform {
  var buffer: Buffer = js.native
  var corked: Boolean = js.native
  var stack: js.Array[TagStackItem] = js.native
  def endTag(): Unit = js.native
  /**
    * @param tagName The name of the tag to start
    * @param info an information object with an `end` parameter
    */
  def startTag(
    tagName: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any,
    info: Pick[TagStackItem, end]
  ): Unit = js.native
  @JSName("writeTag")
  def writeTag_name(
    tagName: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any,
    tagData: Buffer
  ): Unit = js.native
}

