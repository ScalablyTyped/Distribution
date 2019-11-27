package typings.fastDashTextDashEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fastTextEncoding {
  import org.scalablytyped.runtime.Instantiable1
  import org.scalablytyped.runtime.Instantiable2

  /**
    * TextDecoder class.
    */
  type TextDecoder = Instantiable2[
    js.UndefOr[/* utfLabel */ String], 
    js.UndefOr[/* options */ TextDecoderOptions], 
    TextDecoderClass
  ]
  /**
    * TextEncoder class.
    */
  type TextEncoder = Instantiable1[js.UndefOr[/* label */ String], TextEncoderClass]
}
