package typings.emberRouting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkComponentMod {
  
  @JSImport("@ember/routing/link-component", JSImport.Default)
  @js.native
  class default () extends LinkComponent
  
  @js.native
  trait LinkComponent
    extends typings.emberComponent.mod.default {
    
    /**
      * The CSS class to apply to `LinkComponent`'s element when its `active`
      * property is `true`.
      */
    var activeClass: String = js.native
    
    /**
      * Used to determine when this `LinkComponent` is active.
      */
    var currentWhen: js.Any = js.native
    
    /**
      * Sets the `rel` attribute of the `LinkComponent`'s HTML element.
      */
    var rel: String | Null = js.native
    
    /**
      * Determines whether the `LinkComponent` will trigger routing via
      * the `replaceWith` routing strategy.
      */
    var replace: Boolean = js.native
    
    /**
      * Sets the `tabindex` attribute of the `LinkComponent`'s HTML element.
      */
    var tabindex: String | Null = js.native
    
    /**
      * Sets the `target` attribute of the `LinkComponent`'s HTML element.
      */
    var target: String | Null = js.native
    
    /**
      * Sets the `title` attribute of the `LinkComponent`'s HTML element.
      */
    var title: String | Null = js.native
  }
}
