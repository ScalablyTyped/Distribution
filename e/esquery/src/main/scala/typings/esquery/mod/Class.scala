package typings.esquery.mod

import typings.esquery.esqueryStrings.`class`
import typings.esquery.esqueryStrings.declaration
import typings.esquery.esqueryStrings.expression
import typings.esquery.esqueryStrings.function
import typings.esquery.esqueryStrings.pattern
import typings.esquery.esqueryStrings.statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Class
  extends Atom
     with Selector {
  var name: declaration | expression | function | pattern | statement = js.native
  @JSName("type")
  var type_Class: `class` = js.native
}

object Class {
  @scala.inline
  def apply(name: declaration | expression | function | pattern | statement, `type`: `class`): Class = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
  @scala.inline
  implicit class ClassOps[Self <: Class] (val x: Self) extends AnyVal {
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
    def setName(value: declaration | expression | function | pattern | statement): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `class`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

