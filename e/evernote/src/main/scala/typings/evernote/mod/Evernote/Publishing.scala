package typings.evernote.mod.Evernote

import typings.evernote.AnonOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If a Notebook has been opened to the public, the Notebook will have a
  * reference to one of these structures, which gives the location and optional
  * description of the externally-visible public Notebook.
  * <dl>
  * <dt>uri</dt>
  *     <dd>If this field is present, then the notebook is published for
  *     mass consumption on the Internet under the provided URI, which is
  *     relative to a defined base publishing URI defined by the service.
  *     This field can only be modified via the web service GUI ... publishing
  *     cannot be modified via an offline client.
  *     <br/>
  *     Length:    EDAM_PUBLISHING_URI_LEN_MIN - EDAM_PUBLISHING_URI_LEN_MAX
  *     <br/>
  *     Regex:    EDAM_PUBLISHING_URI_REGEX
  *     </dd>
  *
  * <dt>order</dt>
  *     <dd>When the notes are publicly displayed, they will be sorted
  *     based on the requested criteria.
  *     </dd>
  *
  * <dt>ascending</dt>
  *     <dd>If this is set to true, then the public notes will be
  *     displayed in ascending order (e.g. from oldest to newest).    Otherwise,
  *     the notes will be displayed in descending order (e.g. newest to oldest).
  *     </dd>
  *
  * <dt>publicDescription</dt>
  *     <dd>This field may be used to provide a short
  *     description of the notebook, which may be displayed when (e.g.) the
  *     notebook is shown in a public view.    Can't begin or end with a space.
  *     <br/>
  *     Length:    EDAM_PUBLISHING_DESCRIPTION_LEN_MIN -
  *                        EDAM_PUBLISHING_DESCRIPTION_LEN_MAX
  *     <br/>
  *     Regex:    EDAM_PUBLISHING_DESCRIPTION_REGEX
  *     </dd>
  *
  * </dl>
  */
@JSImport("evernote", "Evernote.Publishing")
@js.native
class Publishing () extends js.Object {
  def this(args: AnonOrder) = this()
  var ascending: Boolean = js.native
  var order: NoteSortOrder = js.native
  var publicDescription: String = js.native
  var uri: String = js.native
}

