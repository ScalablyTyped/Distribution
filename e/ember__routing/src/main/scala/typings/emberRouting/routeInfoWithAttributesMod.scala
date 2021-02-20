package typings.emberRouting

import org.scalablytyped.runtime.StringDictionary
import typings.emberRouting.routeInfoMod.RouteInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeInfoWithAttributesMod {
  
  @js.native
  trait RouteInfoWithAttributes extends RouteInfo {
    
    /**
      * This is the resolved return value from the
      * route's model hook.
      */
    val attributes: js.Any = js.native
  }
  object RouteInfoWithAttributes {
    
    @scala.inline
    def apply(
      attributes: js.Any,
      find: js.Function1[RouteInfoWithAttributes, Boolean] => js.UndefOr[RouteInfo],
      localName: String,
      metadata: js.Any,
      name: String,
      paramNames: js.Array[String],
      params: StringDictionary[js.UndefOr[String]],
      queryParams: StringDictionary[js.UndefOr[String]]
    ): RouteInfoWithAttributes = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], find = js.Any.fromFunction1(find), localName = localName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paramNames = paramNames.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteInfoWithAttributes]
    }
    
    @scala.inline
    implicit class RouteInfoWithAttributesMutableBuilder[Self <: RouteInfoWithAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    }
  }
}
