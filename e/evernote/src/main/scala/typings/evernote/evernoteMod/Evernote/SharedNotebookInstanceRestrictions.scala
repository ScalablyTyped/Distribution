package typings.evernote.evernoteMod.Evernote

import org.scalablytyped.runtime.TopLevel
import typings.evernote.evernoteMod.Evernote.SharedNotebookInstanceRestrictions.NO_SHARED_NOTEBOOKS
import typings.evernote.evernoteMod.Evernote.SharedNotebookInstanceRestrictions.ONLY_JOINED_OR_PREVIEW
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SharedNotebookInstanceRestrictions extends js.Object

/**
  * An enumeration describing restrictions on the domain of shared notebook
  * instances that are valid for a given operation, as used, for example, in
  * NotebookRestrictions.
  *
  * ONLY_JOINED_OR_PREVIEW: The domain consists of shared notebooks that
  *     "belong" to the recipient or still available for preview by any recipient.
  *     Shared notebooks that the recipient has joined (the username has already been
  *     assigned to our user) are in the domain.    Additionally, shared notebooks
  *     that allow preview and have not yet been joined are in the domain.
  *
  * NO_SHARED_NOTEBOOKS: No shared notebooks are applicable to the operation.
  */
@JSImport("evernote", "Evernote.SharedNotebookInstanceRestrictions")
@js.native
object SharedNotebookInstanceRestrictions extends js.Object {
  @js.native
  sealed trait NO_SHARED_NOTEBOOKS extends SharedNotebookInstanceRestrictions
  
  @js.native
  sealed trait ONLY_JOINED_OR_PREVIEW extends SharedNotebookInstanceRestrictions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SharedNotebookInstanceRestrictions with Double] = js.native
  /* 2 */ @js.native
  object NO_SHARED_NOTEBOOKS extends TopLevel[NO_SHARED_NOTEBOOKS with Double]
  
  /* 1 */ @js.native
  object ONLY_JOINED_OR_PREVIEW extends TopLevel[ONLY_JOINED_OR_PREVIEW with Double]
  
}

