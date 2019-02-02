package typings
package diffLib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyPatchesOptions extends ApplyPatchOptions {
  def complete(err: js.Any): scala.Unit
  def loadFile(
    index: ParsedDiff,
    callback: js.Function2[/* err */ js.Any, /* data */ java.lang.String, scala.Unit]
  ): scala.Unit
  def patched(index: ParsedDiff, content: java.lang.String, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit
}

