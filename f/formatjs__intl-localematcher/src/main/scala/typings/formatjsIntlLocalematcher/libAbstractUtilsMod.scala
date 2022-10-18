package typings.formatjsIntlLocalematcher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAbstractUtilsMod {
  
  @JSImport("@formatjs/intl-localematcher/lib/abstract/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@formatjs/intl-localematcher/lib/abstract/utils", "UNICODE_EXTENSION_SEQUENCE_REGEX")
  @js.native
  val UNICODE_EXTENSION_SEQUENCE_REGEX: js.RegExp = js.native
  
  inline def invariant(condition: Boolean, message: String): /* asserts condition */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts condition */ Boolean]
  inline def invariant(condition: Boolean, message: String, Err: Any): /* asserts condition */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any], Err.asInstanceOf[js.Any])).asInstanceOf[/* asserts condition */ Boolean]
}
