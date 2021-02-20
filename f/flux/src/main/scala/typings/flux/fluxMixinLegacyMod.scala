package typings.flux

import typings.flux.fluxStoreMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fluxMixinLegacyMod {
  
  /**
    * `FluxContainer` should be preferred over this mixin, but it requires using
    * react with classes. So this mixin is provided where it is not yet possible
    * to convert a container to be a class.
    *
    * This mixin should be used for React components that have state based purely
    * on stores. `this.props` will not be available inside of `calculateState()`.
    *
    * This mixin will only `setState` not replace it, so you should always return
    * every key in your state unless you know what you are doing.
    *
    * On the second calculateState when prevState is not null, the state will be
    * updated to contain the previous foo AND the bar that was just returned. Only
    * returning bar will not delete foo.
    */
  @JSImport("flux/lib/FluxMixinLegacy", JSImport.Namespace)
  @js.native
  def apply(stores: js.Array[^[_]]): js.Any = js.native
  @JSImport("flux/lib/FluxMixinLegacy", JSImport.Namespace)
  @js.native
  def apply(stores: js.Array[^[_]], options: Options): js.Any = js.native
  
  @js.native
  trait Options extends StObject {
    
    var withProps: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWithProps(value: Boolean): Self = StObject.set(x, "withProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithPropsUndefined: Self = StObject.set(x, "withProps", js.undefined)
    }
  }
}
