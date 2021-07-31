package typings.expoLinearGradient

import org.scalablytyped.runtime.Instantiable0
import typings.expoLinearGradient.mod.LinearGradientPoint
import typings.expoLinearGradient.nativeLinearGradientTypesMod.NativeLinearGradientPoint
import typings.react.mod.ReactNode
import typings.reactNative.mod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Colors extends StObject {
    
    /**
      * An array of colors that represent stops in the gradient. At least two colors are required
      * (for a single-color background, use the `style.backgroundColor` prop on a `View` component).
      */
    var colors: js.Array[String]
    
    /**
      * An object `{ x: number; y: number }` or array `[x, y]` that represents the point
      * at which the gradient ends, as a fraction of the overall size of the gradient ranging from 0 to 1, inclusive.
      *
      * For example, `{ x: 0.1, y: 0.2 }` means that the gradient will end `10%` from the left and `20%` from the bottom.
      *
      * **On web**, this only changes the angle of the gradient because CSS gradients don't support changing the end position.
      */
    var end: js.UndefOr[LinearGradientPoint | Null] = js.undefined
    
    /**
      * An array that contains `number`s ranging from 0 to 1, inclusive, and is the same length as the `colors` property.
      * Each number indicates a color-stop location where each respective color should be located.
      *
      * For example, `[0.5, 0.8]` would render:
      * - the first color, solid, from the beginning of the gradient view to 50% through (the middle);
      * - a gradient from the first color to the second from the 50% point to the 80% point; and
      * - the second color, solid, from the 80% point to the end of the gradient view.
      *
      * The color-stop locations must be ascending from least to greatest.
      */
    var locations: js.UndefOr[js.Array[Double] | Null] = js.undefined
    
    /**
      * An object `{ x: number; y: number }` or array `[x, y]` that represents the point
      * at which the gradient starts, as a fraction of the overall size of the gradient ranging from 0 to 1, inclusive.
      *
      * For example, `{ x: 0.1, y: 0.2 }` means that the gradient will start `10%` from the left and `20%` from the top.
      *
      * **On web**, this only changes the angle of the gradient because CSS gradients don't support changing the starting position.
      */
    var start: js.UndefOr[LinearGradientPoint | Null] = js.undefined
  }
  object Colors {
    
    @scala.inline
    def apply(colors: js.Array[String]): Colors = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.asInstanceOf[Colors]
    }
    
    @scala.inline
    implicit class ColorsMutableBuilder[Self <: Colors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setEnd(value: LinearGradientPoint): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndNull: Self = StObject.set(x, "end", null)
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setLocations(value: js.Array[Double]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationsNull: Self = StObject.set(x, "locations", null)
      
      @scala.inline
      def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
      
      @scala.inline
      def setLocationsVarargs(value: Double*): Self = StObject.set(x, "locations", js.Array(value :_*))
      
      @scala.inline
      def setStart(value: LinearGradientPoint): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartNull: Self = StObject.set(x, "start", null)
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  /* Inlined react.react.PropsWithChildren<{  colors :std.Array<number>,   locations :std.Array<number> | null | undefined,   startPoint :expo-linear-gradient.expo-linear-gradient/build/NativeLinearGradient.types.NativeLinearGradientPoint | null | undefined,   endPoint :expo-linear-gradient.expo-linear-gradient/build/NativeLinearGradient.types.NativeLinearGradientPoint | null | undefined}> */
  trait PropsWithChildrencolorsAr extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var colors: js.Array[Double]
    
    var endPoint: js.UndefOr[NativeLinearGradientPoint | Null] = js.undefined
    
    var locations: js.UndefOr[js.Array[Double] | Null] = js.undefined
    
    var startPoint: js.UndefOr[NativeLinearGradientPoint | Null] = js.undefined
  }
  object PropsWithChildrencolorsAr {
    
    @scala.inline
    def apply(colors: js.Array[Double]): PropsWithChildrencolorsAr = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsWithChildrencolorsAr]
    }
    
    @scala.inline
    implicit class PropsWithChildrencolorsArMutableBuilder[Self <: PropsWithChildrencolorsAr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setColors(value: js.Array[Double]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsVarargs(value: Double*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setEndPoint(value: NativeLinearGradientPoint): Self = StObject.set(x, "endPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndPointNull: Self = StObject.set(x, "endPoint", null)
      
      @scala.inline
      def setEndPointUndefined: Self = StObject.set(x, "endPoint", js.undefined)
      
      @scala.inline
      def setLocations(value: js.Array[Double]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationsNull: Self = StObject.set(x, "locations", null)
      
      @scala.inline
      def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
      
      @scala.inline
      def setLocationsVarargs(value: Double*): Self = StObject.set(x, "locations", js.Array(value :_*))
      
      @scala.inline
      def setStartPoint(value: NativeLinearGradientPoint): Self = StObject.set(x, "startPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPointNull: Self = StObject.set(x, "startPoint", null)
      
      @scala.inline
      def setStartPointUndefined: Self = StObject.set(x, "startPoint", js.undefined)
    }
  }
  
  @js.native
  trait TypeofView
    extends StObject
       with Instantiable0[View] {
    
    /**
      * Is 3D Touch / Force Touch available (i.e. will touch events include `force`)
      * @platform ios
      */
    var forceTouchAvailable: Boolean = js.native
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
