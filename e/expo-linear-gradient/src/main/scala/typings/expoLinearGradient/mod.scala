package typings.expoLinearGradient

import typings.expoLinearGradient.anon.X
import typings.expoLinearGradient.buildNativeLinearGradientDottypesMod.NativeLinearGradientPoint
import typings.react.mod.Component
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-linear-gradient", "LinearGradient")
  @js.native
  open class LinearGradient protected ()
    extends Component[LinearGradientProps, js.Object, Any] {
    def this(props: LinearGradientProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LinearGradientProps, context: Any) = this()
  }
  
  type LinearGradientPoint = X | NativeLinearGradientPoint
  
  trait LinearGradientProps
    extends StObject
       with ViewProps {
    
    /**
      * An array of colors that represent stops in the gradient. At least two colors are required
      * (for a single-color background, use the `style.backgroundColor` prop on a `View` component).
      */
    var colors: js.Array[String]
    
    /**
      * For example, `{ x: 0.1, y: 0.2 }` means that the gradient will end `10%` from the left and `20%` from the bottom.
      *
      * **On web**, this only changes the angle of the gradient because CSS gradients don't support changing the end position.
      * @default { x: 0.5, y: 1.0 }
      */
    var end: js.UndefOr[LinearGradientPoint | Null] = js.undefined
    
    /**
      * An array that contains `number`s ranging from `0` to `1`, inclusive, and is the same length as the `colors` property.
      * Each number indicates a color-stop location where each respective color should be located.
      * If not specified, the colors will be distributed evenly across the gradient.
      *
      * For example, `[0.5, 0.8]` would render:
      * - the first color, solid, from the beginning of the gradient view to 50% through (the middle);
      * - a gradient from the first color to the second from the 50% point to the 80% point; and
      * - the second color, solid, from the 80% point to the end of the gradient view.
      *
      * > The color-stop locations must be ascending from least to greatest.
      * @default []
      */
    var locations: js.UndefOr[js.Array[Double] | Null] = js.undefined
    
    /**
      * For example, `{ x: 0.1, y: 0.2 }` means that the gradient will start `10%` from the left and `20%` from the top.
      *
      * **On web**, this only changes the angle of the gradient because CSS gradients don't support changing the starting position.
      * @default { x: 0.5, y: 0.0 }
      */
    var start: js.UndefOr[LinearGradientPoint | Null] = js.undefined
  }
  object LinearGradientProps {
    
    inline def apply(colors: js.Array[String]): LinearGradientProps = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinearGradientProps]
    }
    
    extension [Self <: LinearGradientProps](x: Self) {
      
      inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setEnd(value: LinearGradientPoint): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndNull: Self = StObject.set(x, "end", null)
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setLocations(value: js.Array[Double]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsNull: Self = StObject.set(x, "locations", null)
      
      inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
      
      inline def setLocationsVarargs(value: Double*): Self = StObject.set(x, "locations", js.Array(value*))
      
      inline def setStart(value: LinearGradientPoint): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartNull: Self = StObject.set(x, "start", null)
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
