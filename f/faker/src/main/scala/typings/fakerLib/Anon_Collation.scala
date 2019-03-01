package typings
package fakerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Collation extends js.Object {
  def collation(): java.lang.String
  def column(): java.lang.String
  def engine(): java.lang.String
  def `type`(): java.lang.String
}

object Anon_Collation {
  @scala.inline
  def apply(
    collation: js.Function0[java.lang.String],
    column: js.Function0[java.lang.String],
    engine: js.Function0[java.lang.String],
    `type`: js.Function0[java.lang.String]
  ): Anon_Collation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("collation")(collation)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("engine")(engine)
    __obj.asInstanceOf[Anon_Collation]
  }
}

