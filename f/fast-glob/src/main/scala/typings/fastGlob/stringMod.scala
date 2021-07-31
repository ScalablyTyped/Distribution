package typings.fastGlob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringMod {
  
  @JSImport("fast-glob/out/utils/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isEmpty(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isString(input: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(input.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
}
