package typings.evernote.evernoteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Evernote {
  type Callback[T] = js.Function2[
    /* err */ EDAMUserException | EDAMSystemException | EDAMNotFoundException, 
    /* v */ T, 
    Unit
  ]
}
