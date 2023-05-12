package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsEntityUtilsMod {
  
  @JSImport("epcis2.js/utils/entityUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns an instance of an Event object corresponding to the object passed in param
    * e.g if you provide {isA: 'ObjectEvent', ...}, it will return an ObjectEvent instance created
    * from the parameter
    *
    * @return an event corresponding to the parameter
    */
  inline def default(obj: Any): typings.epcis2Js.entityEventsEventMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.epcis2Js.entityEventsEventMod.default]
}
