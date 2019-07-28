package typings.gatsby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComponentContext[TContext] extends js.Object {
  var component: String
  var context: TContext
  var path: String
}

object Anon_ComponentContext {
  @scala.inline
  def apply[TContext](component: String, context: TContext, path: String): Anon_ComponentContext[TContext] = {
    val __obj = js.Dynamic.literal(component = component, context = context.asInstanceOf[js.Any], path = path)
  
    __obj.asInstanceOf[Anon_ComponentContext[TContext]]
  }
}

