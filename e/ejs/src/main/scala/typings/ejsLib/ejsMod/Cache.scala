package typings
package ejsLib.ejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  def get(key: java.lang.String): js.UndefOr[TemplateFunction]
  def set(key: java.lang.String, `val`: TemplateFunction): scala.Unit
}

object Cache {
  @scala.inline
  def apply(
    get: js.Function1[java.lang.String, js.UndefOr[TemplateFunction]],
    set: js.Function2[java.lang.String, TemplateFunction, scala.Unit]
  ): Cache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[Cache]
  }
}

