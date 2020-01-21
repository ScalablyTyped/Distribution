package typings.evernote.mod.Evernote

import typings.evernote.AnonNotebookDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If a Notebook contained in an Evernote Business account has been published
  * the to business library, the Notebook will have a reference to one of these
  * structures, which specifies how the Notebook will be represented in the
  * library.
  *
  * <dl>
  * <dt>notebookDescription</dt>
  *     <dd>A short description of the notebook's content that will be displayed
  *             in the business library user interface. The description may not begin
  *             or end with whitespace.
  *     <br/>
  *     Length: EDAM_BUSINESS_NOTEBOOK_DESCRIPTION_LEN_MIN -
  *                     EDAM_BUSINESS_NOTEBOOK_DESCRIPTION_LEN_MAX
  *     <br/>
  *     Regex:    EDAM_BUSINESS_NOTEBOOK_DESCRIPTION_REGEX
  *     </dd>
  *
  * <dt>privilege</dt>
  *     <dd>The privileges that will be granted to users who join the notebook through
  *             the business library.
  *     </dd>
  *
  * <dt>recommended</dt>
  *     <dd>Whether the notebook should be "recommended" when displayed in the business
  *             library user interface.
  *     </dd>
  * </dl>
  */
@JSImport("evernote", "Evernote.BusinessNotebook")
@js.native
class BusinessNotebook () extends js.Object {
  def this(args: AnonNotebookDescription) = this()
  var notebookDescription: String = js.native
  var privilege: SharedNotebookPrivilegeLevel = js.native
  var recommended: Boolean = js.native
}

