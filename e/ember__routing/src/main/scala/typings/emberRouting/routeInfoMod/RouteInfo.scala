package typings.emberRouting.routeInfoMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteInfo extends js.Object {
  /**
    * A reference to the childe route's `RouteInfo`.
    * This can be used to traverse downward to the leafmost `RouteInfo`.
    */
  val child: RouteInfo | Null
  /**
    * The final segment of the fully-qualified name of the route, like "index".
    */
  val localName: String
  /**
    * The dot-separated, fully-qualified name of the route, like "people.index".
    */
  val name: String
  /**
    * The ordered list of the names of the params required for this route.
    * It will contain the same strings as `Object.keys(params)`, but here the order is significant.
    * This allows users to correctly pass params into routes programmatically.
    */
  val paramNames: js.Array[String]
  /**
    * The values of the route's parameters.
    * These are the same params that are received as arguments to the route's `model` hook.
    * Contains only the parameters valid for this route, if any (params for parent or child routes are not merged).
    */
  val params: StringDictionary[js.UndefOr[String]]
  /**
    * A reference to the parent route's `RouteInfo`.
    * This can be used to traverse upward to the topmost `RouteInfo`.
    */
  val parent: RouteInfo | Null
  /**
    * The values of any query params on this route.
    */
  val queryParams: StringDictionary[js.UndefOr[String]]
  /**
    * Allows you to traverse through the linked list of `RouteInfo`s from the topmost to leafmost.
    * Returns the first `RouteInfo` in the linked list for which the callback returns true.
    *
    * @param callback the callback to execute.
    */
  def find(callback: js.Function1[/* item */ this.type, Boolean]): js.UndefOr[RouteInfo]
}

object RouteInfo {
  @scala.inline
  def apply(
    find: js.Function1[RouteInfo, Boolean] => js.UndefOr[RouteInfo],
    localName: String,
    name: String,
    paramNames: js.Array[String],
    params: StringDictionary[js.UndefOr[String]],
    queryParams: StringDictionary[js.UndefOr[String]],
    child: RouteInfo = null,
    parent: RouteInfo = null
  ): RouteInfo = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), localName = localName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paramNames = paramNames.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any], child = child.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteInfo]
  }
}

