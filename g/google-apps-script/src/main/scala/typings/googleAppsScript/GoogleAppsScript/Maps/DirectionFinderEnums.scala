package typings.googleAppsScript.GoogleAppsScript.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of enums used by DirectionFinder.
  */
trait DirectionFinderEnums extends StObject {
  
  var Avoid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Avoid */ js.Any
  
  var Mode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Mode */ js.Any
}
object DirectionFinderEnums {
  
  @scala.inline
  def apply(
    Avoid: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Avoid */ js.Any,
    Mode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Mode */ js.Any
  ): DirectionFinderEnums = {
    val __obj = js.Dynamic.literal(Avoid = Avoid.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionFinderEnums]
  }
  
  @scala.inline
  implicit class DirectionFinderEnumsMutableBuilder[Self <: DirectionFinderEnums] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvoid(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Avoid */ js.Any): Self = StObject.set(x, "Avoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Mode */ js.Any): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
  }
}
