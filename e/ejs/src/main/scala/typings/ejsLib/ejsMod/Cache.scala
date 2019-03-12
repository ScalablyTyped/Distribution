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
    get: java.lang.String => js.UndefOr[TemplateFunction],
    set: (java.lang.String, TemplateFunction) => scala.Unit
  ): Cache = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[Cache]
  }
}

