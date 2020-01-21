package typings.evernote.mod.Evernote

import typings.evernote.AnonContainingNotebooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of calling findRelated().    The contents of the notes,
  * notebooks, and tags fields will be in decreasing order of expected
  * relevance.    It is possible that fewer results than requested will be
  * returned even if there are enough distinct entities in the account
  * in cases where the relevance is estimated to be low.
  *
  * <dl>
  * <dt>notes</dt>
  * <dd>If notes have been requested to be included, this will be the
  *         list of notes.</dd>
  *
  * <dt>notebooks</dt>
  * <dd>If notebooks have been requested to be included, this will be the
  *         list of notebooks.</dd>
  *
  * <dt>tags</dt>
  * <dd>If tags have been requested to be included, this will be the list
  *         of tags.</dd>
  * </dl>
  *
  * <dt>containingNotebooks</dt>
  * <dd>If <code>includeContainingNotebooks</code> is set to <code>true</code>
  *         in the RelatedResultSpec, return the list of notebooks to
  *         to which the returned related notes belong. The notebooks in this
  *         list will occur once per notebook GUID and are represented as
  *         NotebookDescriptor objects.</dd>
  * </dl>
  * </dl>
  */
@JSImport("evernote", "Evernote.RelatedResult")
@js.native
class RelatedResult () extends js.Object {
  def this(args: AnonContainingNotebooks) = this()
  var containingNotebooks: js.Array[NotebookDescriptor] = js.native
  var notebooks: js.Array[Notebook] = js.native
  var notes: js.Array[Note] = js.native
  var tags: js.Array[Tag] = js.native
}

