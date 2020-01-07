package typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a color in the RGBA color space. This representation is designed
  * for simplicity of conversion to/from color representations in various
  * languages over compactness; for example, the fields of this representation
  * can be trivially provided to the constructor of &quot;java.awt.Color&quot;
  * in Java; it can also be trivially provided to UIColor&#39;s
  * &quot;+colorWithRed:green:blue:alpha&quot; method in iOS; and, with just a
  * little work, it can be easily formatted into a CSS &quot;rgba()&quot;
  * string in JavaScript, as well.  Note: this proto does not carry information
  * about the absolute color space that should be used to interpret the RGB
  * value (e.g. sRGB, Adobe RGB, DCI-P3, BT.2020, etc.). By default,
  * applications SHOULD assume the sRGB color space.  Example (Java): import
  * com.google.type.Color;       // ...      public static java.awt.Color
  * fromProto(Color protocolor) {        float alpha = protocolor.hasAlpha() ?
  * protocolor.getAlpha().getValue()            : 1.0;         return new
  * java.awt.Color(            protocolor.getRed(), protocolor.getGreen(),
  * protocolor.getBlue(),            alpha);      }       public static Color
  * toProto(java.awt.Color color) {        float red = (float) color.getRed();
  * float green = (float) color.getGreen();        float blue = (float)
  * color.getBlue();        float denominator = 255.0;        Color.Builder
  * resultBuilder =            Color                .newBuilder() .setRed(red /
  * denominator)                .setGreen(green / denominator) .setBlue(blue /
  * denominator);        int alpha = color.getAlpha();        if (alpha != 255)
  * {          result.setAlpha(              FloatValue .newBuilder()
  * .setValue(((float) alpha) / denominator)                  .build()); }
  * return resultBuilder.build();      }      // ...  Example (iOS / Obj-C): //
  * ...      static UIColor* fromProto(Color* protocolor) {         float red =
  * [protocolor red];         float green = [protocolor green];         float
  * blue = [protocolor blue];         FloatValue* alpha_wrapper = [protocolor
  * alpha];         float alpha = 1.0;         if (alpha_wrapper != nil) {
  * alpha = [alpha_wrapper value];         }         return [UIColor
  * colorWithRed:red green:green blue:blue alpha:alpha];      }       static
  * Color* toProto(UIColor* color) {          CGFloat red, green, blue, alpha;
  * if (![color getRed:&amp;red green:&amp;green blue:&amp;blue
  * alpha:&amp;alpha]) {            return nil;          }          Color*
  * result = [[Color alloc] init];          [result setRed:red]; [result
  * setGreen:green];          [result setBlue:blue];          if (alpha &lt;=
  * 0.9999) {            [result setAlpha:floatWrapperWithValue(alpha)]; }
  * [result autorelease];          return result;     }     // ...   Example
  * (JavaScript):      // ...      var protoToCssColor = function(rgb_color) {
  * var redFrac = rgb_color.red || 0.0;        var greenFrac = rgb_color.green
  * || 0.0;        var blueFrac = rgb_color.blue || 0.0;        var red =
  * Math.floor(redFrac * 255);        var green = Math.floor(greenFrac * 255);
  * var blue = Math.floor(blueFrac * 255);         if (!(&#39;alpha&#39; in
  * rgb_color)) {           return rgbToCssColor_(red, green, blue);        }
  * var alphaFrac = rgb_color.alpha.value || 0.0;        var rgbParams = [red,
  * green, blue].join(&#39;,&#39;);        return [&#39;rgba(&#39;, rgbParams,
  * &#39;,&#39;, alphaFrac, &#39;)&#39;].join(&#39;&#39;);     };      var
  * rgbToCssColor_ = function(red, green, blue) {       var rgbNumber = new
  * Number((red &lt;&lt; 16) | (green &lt;&lt; 8) | blue);       var hexString
  * = rgbNumber.toString(16);       var missingZeros = 6 - hexString.length;
  * var resultBuilder = [&#39;#&#39;];       for (var i = 0; i &lt;
  * missingZeros; i++) {          resultBuilder.push(&#39;0&#39;);       }
  * resultBuilder.push(hexString);       return resultBuilder.join(&#39;&#39;);
  * };      // ...
  */
@js.native
trait Schema$Color extends js.Object {
  /**
    * The fraction of this color that should be applied to the pixel. That is,
    * the final pixel color is defined by the equation:    pixel color = alpha
    * * (this color) + (1.0 - alpha) * (background color)  This means that a
    * value of 1.0 corresponds to a solid color, whereas a value of 0.0
    * corresponds to a completely transparent color. This uses a wrapper
    * message rather than a simple float scalar so that it is possible to
    * distinguish between a default value and the value being unset. If
    * omitted, this color object is to be rendered as a solid color (as if the
    * alpha value had been explicitly given with a value of 1.0).
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * The amount of blue in the color as a value in the interval [0, 1].
    */
  var blue: js.UndefOr[Double] = js.native
  /**
    * The amount of green in the color as a value in the interval [0, 1].
    */
  var green: js.UndefOr[Double] = js.native
  /**
    * The amount of red in the color as a value in the interval [0, 1].
    */
  var red: js.UndefOr[Double] = js.native
}

object Schema$Color {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    blue: Int | Double = null,
    green: Int | Double = null,
    red: Int | Double = null
  ): Schema$Color = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (blue != null) __obj.updateDynamic("blue")(blue.asInstanceOf[js.Any])
    if (green != null) __obj.updateDynamic("green")(green.asInstanceOf[js.Any])
    if (red != null) __obj.updateDynamic("red")(red.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Color]
  }
}

