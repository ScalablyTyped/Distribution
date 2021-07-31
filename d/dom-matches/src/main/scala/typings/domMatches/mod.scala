package typings.domMatches

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(element: Null, selector: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(element: Unit, selector: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(element: Element, selector: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("dom-matches", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
