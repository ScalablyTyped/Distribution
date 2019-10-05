package typings.evernote.evernoteMod.Evernote

import typings.evernote.Anon_Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of the thing for which we are searching for related
  * entities.
  *
  * You must specify either <em>noteGuid</em> or <em>plainText</em>, but
  * not both. <em>filter</em> and <em>referenceUri</em> are optional.
  *
  * <dl>
  * <dt>noteGuid</dt>
  * <dd>The GUID of an existing note in your account for which related
  *         entities will be found.</dd>
  *
  * <dt>plainText</dt>
  * <dd>A string of plain text for which to find related entities.
  *         You should provide a text block with a number of characters between
  *         EDAM_RELATED_PLAINTEXT_LEN_MIN and EDAM_RELATED_PLAINTEXT_LEN_MAX.
  *         </dd>
  *
  * <dt>filter</dt>
  * <dd>The list of criteria that will constrain the notes being considered
  *         related.
  *         Please note that some of the parameters may be ignored, such as
  *         <em>order</em> and <em>ascending</em>.
  * </dd>
  *
  * <dt>referenceUri</dt>
  * <dd>A URI string specifying a reference entity, around which "relatedness"
  *         should be based. This can be an URL pointing to a web page, for example.
  * </dd>
  * </dl>
  */
@JSImport("evernote", "Evernote.RelatedQuery")
@js.native
class RelatedQuery () extends js.Object {
  def this(args: Anon_Filter) = this()
  var filter: NoteFilter = js.native
  var noteGuid: String = js.native
  var plainText: String = js.native
  var referenceUri: String = js.native
}

