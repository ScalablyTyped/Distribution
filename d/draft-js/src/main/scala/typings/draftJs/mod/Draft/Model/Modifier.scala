package typings.draftJs.mod.Draft.Model

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Modifier {
  
  @js.native
  trait AtomicBlockUtils extends StObject
  
  /**
    * `DraftModifier` provides a set of convenience methods that apply
    * modifications to a `ContentState` object based on a target `SelectionState`.
    *
    * Any change to a `ContentState` should be decomposable into a series of
    * transaction functions that apply the required changes and return output
    * `ContentState` objects.
    *
    * These functions encapsulate some of the most common transaction sequences.
    */
  @js.native
  trait DraftModifier extends StObject
  
  @js.native
  trait RichTextEditorUtil extends StObject
  
  type URI = js.Any
}
