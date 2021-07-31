package typings.googleFonts

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(list: List): String = ^.asInstanceOf[js.Dynamic].apply(list.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("google-fonts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def add(list: List): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(list.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type List = StringDictionary[Boolean | String | js.Array[String]]
}
