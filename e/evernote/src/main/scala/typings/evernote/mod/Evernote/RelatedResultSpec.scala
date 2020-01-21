package typings.evernote.mod.Evernote

import typings.evernote.AnonIncludeContainingNotebooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of the thing for which the service will find related
  * entities, via findRelated(), together with a description of what
  * type of entities and how many you are seeking in the
  * RelatedResult.
  *
  * <dl>
  * <dt>maxNotes</dt>
  * <dd>Return notes that are related to the query, but no more than
  *         this many.    Any value greater than EDAM_RELATED_MAX_NOTES
  *         will be silently capped.    If you do not set this field, then
  *         no notes will be returned.</dd>
  *
  * <dt>maxNotebooks</dt>
  * <dd>Return notebooks that are related to the query, but no more than
  *         this many.    Any value greater than EDAM_RELATED_MAX_NOTEBOOKS
  *         will be silently capped.    If you do not set this field, then
  *         no notebooks will be returned.</dd>
  *
  * <dt>maxTags</dt>
  * <dd>Return tags that are related to the query, but no more than
  *         this many.    Any value greater than EDAM_RELATED_MAX_TAGS
  *         will be silently capped.    If you do not set this field, then
  *         no tags will be returned.</dd>
  * </dl>
  *
  * <dt>writableNotebooksOnly</dt>
  * <dd>Require that all returned related notebooks are writable.
  *         The user will be able to create notes in all returned notebooks.
  *         However, individual notes returned may still belong to notebooks
  *         in which the user lacks the ability to create notes.</dd>
  * </dl>
  *
  * <dt>includeContainingNotebooks</dt>
  * <dd>If set to <code>true</code>, return the containingNotebooks field
  *         in the RelatedResult, which will contain the list of notebooks to
  *         to which the returned related notes belong.</dd>
  * </dl>
  * </dl>
  */
@JSImport("evernote", "Evernote.RelatedResultSpec")
@js.native
class RelatedResultSpec () extends js.Object {
  def this(args: AnonIncludeContainingNotebooks) = this()
  var includeContainingNotebooks: Boolean = js.native
  var maxNotebooks: Double = js.native
  var maxNotes: Double = js.native
  var maxTags: Double = js.native
  var writableNotebooksOnly: Boolean = js.native
}

