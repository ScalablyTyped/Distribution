package typings
package gatsbyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComponentContext[TContext] extends js.Object {
  var component: java.lang.String
  var context: TContext
  var path: java.lang.String
}

object Anon_ComponentContext {
  @scala.inline
  def apply[TContext](component: java.lang.String, context: TContext, path: java.lang.String): Anon_ComponentContext[TContext] = {
    val __obj = js.Dynamic.literal(component = component, context = context.asInstanceOf[js.Any], path = path)
  
    __obj.asInstanceOf[Anon_ComponentContext[TContext]]
  }
}

