package typings
package espruinoLib.ENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * <p>Performs a Fast Fourier Transform (fft) on the supplied data and writes it back into the original arrays. Note that if only one array is supplied, the data written back is the modulus of the complex result <code>sqrt(r*r+i*i)</code>.</p>
     * 
     * @url http://www.espruino.com/Reference#l_E_FFT
     */
@js.native
trait FFT
  extends /**
         * 
         * @param arrReal 
         * @param arrImage 
         * @param inverse 
         * @return  
         */
org.scalablytyped.runtime.Instantiable3[/* arrReal */ js.Any, /* arrImage */ js.Any, /* inverse */ scala.Boolean, FFT]

