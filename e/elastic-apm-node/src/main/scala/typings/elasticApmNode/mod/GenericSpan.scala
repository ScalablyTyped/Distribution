package typings.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericSpan extends Taggable {
  var action: String | Null = js.native
  var subtype: String | Null = js.native
  var traceparent: String = js.native
  // The following properties and methods are currently not documented as their API isn't considered official:
  // timestamp, ended, id, traceId, parentId, sampled, duration()
  var `type`: String | Null = js.native
  def setType(): Unit = js.native
  def setType(`type`: String): Unit = js.native
  def setType(`type`: String, subtype: String): Unit = js.native
  def setType(`type`: String, subtype: String, action: String): Unit = js.native
  def setType(`type`: String, subtype: Null, action: String): Unit = js.native
  def setType(`type`: Null, subtype: String): Unit = js.native
  def setType(`type`: Null, subtype: String, action: String): Unit = js.native
  def setType(`type`: Null, subtype: Null, action: String): Unit = js.native
}

