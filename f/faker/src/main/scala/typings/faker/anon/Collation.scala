package typings.faker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collation extends js.Object {
  def collation(): String
  def column(): String
  def engine(): String
  def `type`(): String
}

object Collation {
  @scala.inline
  def apply(collation: () => String, column: () => String, engine: () => String, `type`: () => String): Collation = {
    val __obj = js.Dynamic.literal(collation = js.Any.fromFunction0(collation), column = js.Any.fromFunction0(column), engine = js.Any.fromFunction0(engine))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[Collation]
  }
}

