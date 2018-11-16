package typings
package formsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formsMod {
  type FieldIterator = js.Function2[/* name */ java.lang.String, /* field */ FieldBound, java.lang.String]
  type FormHandleCallback = js.Function1[/* form */ Form, scala.Unit]
  type RenderFunction = js.Function2[/* name */ java.lang.String, /* field */ Field, java.lang.String]
  type ValidatorFunction = js.Function3[
    /* form */ FormBound, 
    /* field */ FieldBound, 
    /* callback */ js.Function1[/* err */ js.UndefOr[java.lang.String], scala.Unit], 
    scala.Unit
  ]
}
