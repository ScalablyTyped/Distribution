package typings.diffMatchPatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chars1 extends js.Object {
  var chars1: String = js.native
  var chars2: String = js.native
  var lineArray: js.Array[String] = js.native
}

object Chars1 {
  @scala.inline
  def apply(chars1: String, chars2: String, lineArray: js.Array[String]): Chars1 = {
    val __obj = js.Dynamic.literal(chars1 = chars1.asInstanceOf[js.Any], chars2 = chars2.asInstanceOf[js.Any], lineArray = lineArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chars1]
  }
  @scala.inline
  implicit class Chars1Ops[Self <: Chars1] (val x: Self) extends AnyVal {
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
    def setChars1(value: String): Self = this.set("chars1", value.asInstanceOf[js.Any])
    @scala.inline
    def setChars2(value: String): Self = this.set("chars2", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineArrayVarargs(value: String*): Self = this.set("lineArray", js.Array(value :_*))
    @scala.inline
    def setLineArray(value: js.Array[String]): Self = this.set("lineArray", value.asInstanceOf[js.Any])
  }
  
}

