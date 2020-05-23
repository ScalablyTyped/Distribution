package typings.formatjsIntlUtils.anon

import typings.formatjsIntlUtils.displaynamesTypesMod.ScriptCode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Short extends js.Object {
  var long: Record[ScriptCode, String]
  var narrow: Record[ScriptCode, String]
  var short: Record[ScriptCode, String]
}

object Short {
  @scala.inline
  def apply(
    long: Record[ScriptCode, String],
    narrow: Record[ScriptCode, String],
    short: Record[ScriptCode, String]
  ): Short = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[Short]
  }
}

