package typings.diacritics

import typings.diacritics.anon.Base
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("diacritics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def remove(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("diacritics", "replacementList")
  @js.native
  val replacementList: js.Array[Base] = js.native
}
