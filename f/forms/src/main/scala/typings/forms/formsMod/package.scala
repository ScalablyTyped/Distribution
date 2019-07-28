package typings.forms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formsMod {
  type FieldIterator = js.Function2[/* name */ String, /* field */ FieldBound, String]
  type FormHandleCallback = js.Function1[/* form */ Form, Unit]
  type RenderFunction = js.Function2[/* name */ String, /* field */ Field, String]
  type ValidatorFunction = js.Function3[
    /* form */ FormBound, 
    /* field */ FieldBound, 
    /* callback */ js.Function1[/* err */ js.UndefOr[String], Unit], 
    Unit
  ]
}
