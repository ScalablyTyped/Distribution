package typings.egg.eggMod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileStream extends Readable {
  var encoding: String = js.native
  var fieldname: String = js.native
  // tslint:disable-line
  var fields: js.Any = js.native
  var filename: String = js.native
  var mime: String = js.native
  var mimeType: String = js.native
  var transferEncoding: String = js.native
  var truncated: Boolean = js.native
}

