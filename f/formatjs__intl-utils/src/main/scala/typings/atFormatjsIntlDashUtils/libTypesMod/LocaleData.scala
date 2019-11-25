package typings.atFormatjsIntlDashUtils.libTypesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleData[T] extends js.Object {
  var aliases: Record[String, String]
  var availableLocales: js.Array[String]
  var data: Record[Locale, T]
  var parentLocales: Record[String, String]
}

object LocaleData {
  @scala.inline
  def apply[T](
    aliases: Record[String, String],
    availableLocales: js.Array[String],
    data: Record[Locale, T],
    parentLocales: Record[String, String]
  ): LocaleData[T] = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], availableLocales = availableLocales.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], parentLocales = parentLocales.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocaleData[T]]
  }
}

