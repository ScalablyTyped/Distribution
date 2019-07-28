package typings.exif

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InteropIndex extends js.Object {
  var InteropIndex: js.UndefOr[String] = js.undefined
  var InteropVersion: js.UndefOr[Buffer] = js.undefined
}

object Anon_InteropIndex {
  @scala.inline
  def apply(InteropIndex: String = null, InteropVersion: Buffer = null): Anon_InteropIndex = {
    val __obj = js.Dynamic.literal()
    if (InteropIndex != null) __obj.updateDynamic("InteropIndex")(InteropIndex)
    if (InteropVersion != null) __obj.updateDynamic("InteropVersion")(InteropVersion)
    __obj.asInstanceOf[Anon_InteropIndex]
  }
}

