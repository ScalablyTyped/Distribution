package typings.espruino.ENs

import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * <p>Convert hue, saturation and brightness to red, green and blue (packed into an integer)</p>
  * <p>This replaces <code>Graphics.setColorHSB</code> and <code>Graphics.setBgColorHSB</code>. On devices with 24 bit colour it can
  * be used as: <code>Graphics.setColorHSB(E.HSBtoRGB(h, s, b))</code></p>
  * 
  * @url http://www.espruino.com/Reference#l_E_HSBtoRGB
  */
@js.native
trait HSBtoRGB extends /**
  * 
  * @param hue 
  * @param sat 
  * @param bri 
  * @return  
  */
Instantiable3[/* hue */ Double, /* sat */ Double, /* bri */ Double, Double]

