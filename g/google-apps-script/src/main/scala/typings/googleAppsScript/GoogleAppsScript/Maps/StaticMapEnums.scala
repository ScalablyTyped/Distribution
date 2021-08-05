package typings.googleAppsScript.GoogleAppsScript.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of enums used by StaticMap.
  */
trait StaticMapEnums extends StObject {
  
  var Color: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Color */ js.Any
  
  var Format: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Format */ js.Any
  
  var MarkerSize: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MarkerSize */ js.Any
  
  var Type: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type */ js.Any
}
object StaticMapEnums {
  
  inline def apply(
    Color: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Color */ js.Any,
    Format: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Format */ js.Any,
    MarkerSize: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MarkerSize */ js.Any,
    Type: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type */ js.Any
  ): StaticMapEnums = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], MarkerSize = MarkerSize.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticMapEnums]
  }
  
  extension [Self <: StaticMapEnums](x: Self) {
    
    inline def setColor(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Color */ js.Any): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Format */ js.Any): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setMarkerSize(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MarkerSize */ js.Any): Self = StObject.set(x, "MarkerSize", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type */ js.Any): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
