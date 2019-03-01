package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fastifyDashMultipartLib {
  type MultipartHandler = js.Function5[
    /* field */ java.lang.String, 
    /* file */ js.Any, 
    /* filename */ java.lang.String, 
    /* encoding */ java.lang.String, 
    /* mimetype */ java.lang.String, 
    scala.Unit
  ]
}
