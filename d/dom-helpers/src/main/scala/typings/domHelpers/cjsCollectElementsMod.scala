package typings.domHelpers

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsCollectElementsMod {
  
  @JSImport("dom-helpers/cjs/collectElements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: Null, direction: TraverseDirection): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def default(node: Element, direction: TraverseDirection): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.domHelpers.domHelpersStrings.parentElement
    - typings.domHelpers.domHelpersStrings.previousElementSibling
    - typings.domHelpers.domHelpersStrings.nextElementSibling
  */
  trait TraverseDirection extends StObject
  object TraverseDirection {
    
    inline def nextElementSibling: typings.domHelpers.domHelpersStrings.nextElementSibling = "nextElementSibling".asInstanceOf[typings.domHelpers.domHelpersStrings.nextElementSibling]
    
    inline def parentElement: typings.domHelpers.domHelpersStrings.parentElement = "parentElement".asInstanceOf[typings.domHelpers.domHelpersStrings.parentElement]
    
    inline def previousElementSibling: typings.domHelpers.domHelpersStrings.previousElementSibling = "previousElementSibling".asInstanceOf[typings.domHelpers.domHelpersStrings.previousElementSibling]
  }
}
