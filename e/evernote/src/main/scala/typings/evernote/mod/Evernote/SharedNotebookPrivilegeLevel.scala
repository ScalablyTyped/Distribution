package typings.evernote.mod.Evernote

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SharedNotebookPrivilegeLevel extends js.Object

/**
  * Privilege levels for accessing shared notebooks.
  *
  * READ_NOTEBOOK: Recipient is able to read the contents of the shared notebook
  *     but does to have access to information about other recipients of the
  *     notebook or the activity stream information.
  *
  * MODIFY_NOTEBOOK_PLUS_ACTIVITY: Recipient has rights to read and modify the contents
  *     of the shared notebook, including the right to move notes to the trash and to create
  *     notes in the notebook.    The recipient can also access information about other
  *     recipients and the activity stream.
  *
  * READ_NOTEBOOK_PLUS_ACTIVITY: Recipient has READ_NOTEBOOK rights and can also
  *     access information about other recipients and the activity stream.
  *
  * GROUP: If the user belongs to a group, such as a Business, that has a defined
  *     privilege level, use the privilege level of the group as the privilege for
  *     the individual.
  *
  * FULL_ACCESS: Recipient has full rights to the shared notebook and recipient lists,
  *     including privilege to revoke and create invitations and to change privilege
  *     levels on invitations for individuals.    This privilege level is primarily intended
  *     for use by individual shares.
  *
  * BUSINESS_FULL_ACCESS: Intended for use with Business Notebooks, a
  * BUSINESS_FULL_ACCESS level is FULL_ACCESS with the additional rights to
  * change how the notebook will appear in the business library, including the
  * rights to publish and unpublish the notebook from the library.
  */
@JSImport("evernote", "Evernote.SharedNotebookPrivilegeLevel")
@js.native
object SharedNotebookPrivilegeLevel extends js.Object {
  @js.native
  sealed trait BUSINESS_FULL_ACCESS extends SharedNotebookPrivilegeLevel
  
  @js.native
  sealed trait FULL_ACCESS extends SharedNotebookPrivilegeLevel
  
  @js.native
  sealed trait GROUP extends SharedNotebookPrivilegeLevel
  
  @js.native
  sealed trait MODIFY_NOTEBOOK_PLUS_ACTIVITY extends SharedNotebookPrivilegeLevel
  
  @js.native
  sealed trait READ_NOTEBOOK extends SharedNotebookPrivilegeLevel
  
  @js.native
  sealed trait READ_NOTEBOOK_PLUS_ACTIVITY extends SharedNotebookPrivilegeLevel
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SharedNotebookPrivilegeLevel with Double] = js.native
  /* 5 */ @js.native
  object BUSINESS_FULL_ACCESS extends TopLevel[BUSINESS_FULL_ACCESS with Double]
  
  /* 4 */ @js.native
  object FULL_ACCESS extends TopLevel[FULL_ACCESS with Double]
  
  /* 3 */ @js.native
  object GROUP extends TopLevel[GROUP with Double]
  
  /* 1 */ @js.native
  object MODIFY_NOTEBOOK_PLUS_ACTIVITY extends TopLevel[MODIFY_NOTEBOOK_PLUS_ACTIVITY with Double]
  
  /* 0 */ @js.native
  object READ_NOTEBOOK extends TopLevel[READ_NOTEBOOK with Double]
  
  /* 2 */ @js.native
  object READ_NOTEBOOK_PLUS_ACTIVITY extends TopLevel[READ_NOTEBOOK_PLUS_ACTIVITY with Double]
  
}

