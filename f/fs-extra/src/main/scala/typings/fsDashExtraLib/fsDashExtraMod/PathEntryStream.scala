package typings
package fsDashExtraLib.fsDashExtraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathEntryStream extends js.Object {
  def read(): PathEntry | scala.Null
}

object PathEntryStream {
  @scala.inline
  def apply(read: js.Function0[PathEntry | scala.Null]): PathEntryStream = {
    val __obj = js.Dynamic.literal(read = read)
  
    __obj.asInstanceOf[PathEntryStream]
  }
}

