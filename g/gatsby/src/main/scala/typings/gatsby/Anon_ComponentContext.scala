package typings.gatsby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComponentContext[TContext] extends js.Object {
  var component: String
  var context: TContext
  var matchPath: js.UndefOr[String] = js.undefined
  var path: String
}

object Anon_ComponentContext {
  @scala.inline
  def apply[TContext](component: String, context: TContext, path: String, matchPath: String = null): Anon_ComponentContext[TContext] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (matchPath != null) __obj.updateDynamic("matchPath")(matchPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ComponentContext[TContext]]
  }
}

