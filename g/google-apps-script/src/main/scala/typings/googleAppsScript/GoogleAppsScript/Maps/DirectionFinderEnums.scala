package typings.googleAppsScript.GoogleAppsScript.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of enums used by DirectionFinder.
  */
trait DirectionFinderEnums extends StObject {
  
  var Avoid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Avoid */ Any
  
  var Mode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Mode */ Any
}
object DirectionFinderEnums {
  
  inline def apply(
    Avoid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Avoid */ Any,
    Mode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Mode */ Any
  ): DirectionFinderEnums = {
    val __obj = js.Dynamic.literal(Avoid = Avoid.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionFinderEnums]
  }
  
  extension [Self <: DirectionFinderEnums](x: Self) {
    
    inline def setAvoid(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Avoid */ Any): Self = StObject.set(x, "Avoid", value.asInstanceOf[js.Any])
    
    inline def setMode(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Mode */ Any): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
  }
}
