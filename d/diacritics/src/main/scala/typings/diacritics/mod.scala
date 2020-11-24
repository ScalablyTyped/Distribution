package typings.diacritics

import org.scalablytyped.runtime.StringDictionary
import typings.diacritics.anon.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diacritics", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def remove(str: String): String = js.native
  
  val replacementList: js.Array[Base] = js.native
  
  @js.native
  object diacriticsMap extends /* key */ StringDictionary[String]
}
