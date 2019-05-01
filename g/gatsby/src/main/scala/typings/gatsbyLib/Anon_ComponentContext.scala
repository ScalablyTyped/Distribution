package typings
package gatsbyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComponentContext extends js.Object {
  var component: java.lang.String
  var context: stdLib.Record[java.lang.String, _]
  var path: java.lang.String
}

object Anon_ComponentContext {
  @scala.inline
  def apply(component: java.lang.String, context: stdLib.Record[java.lang.String, _], path: java.lang.String): Anon_ComponentContext = {
    val __obj = js.Dynamic.literal(component = component, context = context, path = path)
  
    __obj.asInstanceOf[Anon_ComponentContext]
  }
}

