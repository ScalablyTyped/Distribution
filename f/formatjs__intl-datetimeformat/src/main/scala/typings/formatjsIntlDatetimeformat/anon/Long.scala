package typings.formatjsIntlDatetimeformat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Long extends js.Object {
  var long: js.Array[String] = js.native
  var narrow: js.Array[String] = js.native
  var short: js.Array[String] = js.native
}

object Long {
  @scala.inline
  def apply(long: js.Array[String], narrow: js.Array[String], short: js.Array[String]): Long = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[Long]
  }
  @scala.inline
  implicit class LongOps[Self <: Long] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLongVarargs(value: String*): Self = this.set("long", js.Array(value :_*))
    @scala.inline
    def setLong(value: js.Array[String]): Self = this.set("long", value.asInstanceOf[js.Any])
    @scala.inline
    def setNarrowVarargs(value: String*): Self = this.set("narrow", js.Array(value :_*))
    @scala.inline
    def setNarrow(value: js.Array[String]): Self = this.set("narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortVarargs(value: String*): Self = this.set("short", js.Array(value :_*))
    @scala.inline
    def setShort(value: js.Array[String]): Self = this.set("short", value.asInstanceOf[js.Any])
  }
  
}

