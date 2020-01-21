package typings.evernote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Evernote {
  type Callback[T] = js.Function2[
    /* err */ typings.evernote.mod.Evernote.EDAMUserException | typings.evernote.mod.Evernote.EDAMSystemException | typings.evernote.mod.Evernote.EDAMNotFoundException, 
    /* v */ T, 
    scala.Unit
  ]
}
