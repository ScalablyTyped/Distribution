package typings.ejs.ejsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  def get(key: String): js.UndefOr[TemplateFunction]
  def set(key: String, `val`: TemplateFunction): Unit
}

object Cache {
  @scala.inline
  def apply(get: String => js.UndefOr[TemplateFunction], set: (String, TemplateFunction) => Unit): Cache = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[Cache]
  }
}

@JSImport("ejs", "cache")
@js.native
object cache extends TopLevel[Cache]

