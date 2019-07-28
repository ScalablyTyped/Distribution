package typings.formidable.formidableMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Part extends Stream {
  var filename: js.UndefOr[String] = js.native
  var headers: StringDictionary[String] = js.native
  var mime: js.UndefOr[String] = js.native
  var name: String = js.native
}

