package typings.fbt.mod

import typings.fbt.anon.Validated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fbt", "FbtResult")
@js.native
open class FbtResult protected () extends StObject {
  def this(contents: js.Array[Any]) = this()
  def this(contents: js.Array[Any], errorListener: Any) = this()
  
  // Hack for allowing FBTResult to play nice in React components
  var _store: js.UndefOr[Validated] = js.native
  
  def getContents(): Any = js.native
  
  // This relies on toString() which contains i18n logging logic to track impressions.
  // I.e. If you use this, i18n will register the string as displayed!
  def toJSON(): String = js.native
}
