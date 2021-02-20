package typings.emberRouting

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeInfoMod {
  
  @js.native
  trait RouteInfo extends StObject {
    
    /**
      * A reference to the childe route's `RouteInfo`.
      * This can be used to traverse downward to the leafmost `RouteInfo`.
      */
    val child: RouteInfo | Null = js.native
    
    /**
      * Allows you to traverse through the linked list of `RouteInfo`s from the topmost to leafmost.
      * Returns the first `RouteInfo` in the linked list for which the callback returns true.
      *
      * @param callback the callback to execute.
      */
    def find(callback: js.Function1[/* item */ this.type, Boolean]): js.UndefOr[RouteInfo] = js.native
    
    /**
      * The final segment of the fully-qualified name of the route, like "index".
      */
    val localName: String = js.native
    
    /**
      * Will contain the result `Route#buildRouteInfoMetadata`
      * for the corresponding Route.
      */
    val metadata: js.Any = js.native
    
    /**
      * The dot-separated, fully-qualified name of the route, like "people.index".
      */
    val name: String = js.native
    
    /**
      * The ordered list of the names of the params required for this route.
      * It will contain the same strings as `Object.keys(params)`, but here the order is significant.
      * This allows users to correctly pass params into routes programmatically.
      */
    val paramNames: js.Array[String] = js.native
    
    /**
      * The values of the route's parameters.
      * These are the same params that are received as arguments to the route's `model` hook.
      * Contains only the parameters valid for this route, if any (params for parent or child routes are not merged).
      */
    val params: StringDictionary[js.UndefOr[String]] = js.native
    
    /**
      * A reference to the parent route's `RouteInfo`.
      * This can be used to traverse upward to the topmost `RouteInfo`.
      */
    val parent: RouteInfo | Null = js.native
    
    /**
      * The values of any query params on this route.
      */
    val queryParams: StringDictionary[js.UndefOr[String]] = js.native
  }
  object RouteInfo {
    
    @scala.inline
    def apply(
      find: js.Function1[RouteInfo, Boolean] => js.UndefOr[RouteInfo],
      localName: String,
      metadata: js.Any,
      name: String,
      paramNames: js.Array[String],
      params: StringDictionary[js.UndefOr[String]],
      queryParams: StringDictionary[js.UndefOr[String]]
    ): RouteInfo = {
      val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), localName = localName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paramNames = paramNames.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteInfo]
    }
    
    @scala.inline
    implicit class RouteInfoMutableBuilder[Self <: RouteInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChild(value: RouteInfo): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildNull: Self = StObject.set(x, "child", null)
      
      @scala.inline
      def setFind(value: js.Function1[RouteInfo, Boolean] => js.UndefOr[RouteInfo]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamNames(value: js.Array[String]): Self = StObject.set(x, "paramNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamNamesVarargs(value: String*): Self = StObject.set(x, "paramNames", js.Array(value :_*))
      
      @scala.inline
      def setParams(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: RouteInfo): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNull: Self = StObject.set(x, "parent", null)
      
      @scala.inline
      def setQueryParams(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    }
  }
}
