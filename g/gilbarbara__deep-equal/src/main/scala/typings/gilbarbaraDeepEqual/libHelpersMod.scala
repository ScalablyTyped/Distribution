package typings.gilbarbaraDeepEqual

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelpersMod {
  
  @JSImport("@gilbarbara/deep-equal/lib/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isFunction(value: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isNull(value: Any): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(value.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
  
  inline def isObject(value: Any): /* is @gilbarbara/deep-equal.@gilbarbara/deep-equal/lib/types.AnyObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @gilbarbara/deep-equal.@gilbarbara/deep-equal/lib/types.AnyObject */ Boolean]
  
  inline def isRegex(value: Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegex")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
  
  inline def isUndefined(value: Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
}
