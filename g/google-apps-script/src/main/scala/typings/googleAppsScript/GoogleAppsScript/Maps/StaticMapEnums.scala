package typings.googleAppsScript.GoogleAppsScript.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of enums used by StaticMap.
  */
trait StaticMapEnums extends StObject {
  
  var Color: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Color */ Any
  
  var Format: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Format */ Any
  
  var MarkerSize: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MarkerSize */ Any
  
  var Type: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type */ Any
}
object StaticMapEnums {
  
  inline def apply(
    Color: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Color */ Any,
    Format: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Format */ Any,
    MarkerSize: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MarkerSize */ Any,
    Type: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type */ Any
  ): StaticMapEnums = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], MarkerSize = MarkerSize.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticMapEnums]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StaticMapEnums] (val x: Self) extends AnyVal {
    
    inline def setColor(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Color */ Any): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Format */ Any): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setMarkerSize(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MarkerSize */ Any): Self = StObject.set(x, "MarkerSize", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type */ Any): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
