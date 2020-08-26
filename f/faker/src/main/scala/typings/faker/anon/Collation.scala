package typings.faker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collation extends js.Object {
  def collation(): String = js.native
  def column(): String = js.native
  def engine(): String = js.native
  def `type`(): String = js.native
}

object Collation {
  @scala.inline
  def apply(collation: () => String, column: () => String, engine: () => String, `type`: () => String): Collation = {
    val __obj = js.Dynamic.literal(collation = js.Any.fromFunction0(collation), column = js.Any.fromFunction0(column), engine = js.Any.fromFunction0(engine))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[Collation]
  }
  @scala.inline
  implicit class CollationOps[Self <: Collation] (val x: Self) extends AnyVal {
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
    def setCollation(value: () => String): Self = this.set("collation", js.Any.fromFunction0(value))
    @scala.inline
    def setColumn(value: () => String): Self = this.set("column", js.Any.fromFunction0(value))
    @scala.inline
    def setEngine(value: () => String): Self = this.set("engine", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: () => String): Self = this.set("type", js.Any.fromFunction0(value))
  }
  
}

