package typings.evernote.mod.Evernote

import typings.evernote.AnonActive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Every media file that is embedded or attached to a note is represented
  * through a Resource entry.
  * <dl>
  * <dt>guid</dt>
  *     <dd>The unique identifier of this resource.    Will be set whenever
  *     a resource is retrieved from the service, but may be null when a client
  *     is creating a resource.
  *     <br/>
  *     Length:    EDAM_GUID_LEN_MIN - EDAM_GUID_LEN_MAX
  *     <br/>
  *     Regex:    EDAM_GUID_REGEX
  *     </dd>
  *
  * <dt>noteGuid</dt>
  *     <dd>The unique identifier of the Note that holds this
  *     Resource. Will be set whenever the resource is retrieved from the service,
  *     but may be null when a client is creating a resource.
  *     <br/>
  *     Length:    EDAM_GUID_LEN_MIN - EDAM_GUID_LEN_MAX
  *     <br/>
  *     Regex:    EDAM_GUID_REGEX
  *     </dd>
  *
  * <dt>data</dt>
  *     <dd>The contents of the resource.
  *     Maximum length:    The data.body is limited to EDAM_RESOURCE_SIZE_MAX_FREE
  *     for free accounts and EDAM_RESOURCE_SIZE_MAX_PREMIUM for premium accounts.
  *     </dd>
  *
  * <dt>mime</dt>
  *     <dd>The MIME type for the embedded resource.    E.g. "image/gif"
  *     <br/>
  *     Length:    EDAM_MIME_LEN_MIN - EDAM_MIME_LEN_MAX
  *     <br/>
  *     Regex:    EDAM_MIME_REGEX
  *     </dd>
  *
  * <dt>width</dt>
  *     <dd>If set, this contains the display width of this resource, in
  *     pixels.
  *     </dd>
  *
  * <dt>height</dt>
  *     <dd>If set, this contains the display height of this resource,
  *     in pixels.
  *     </dd>
  *
  * <dt>duration</dt>
  *     <dd>DEPRECATED: ignored.
  *     </dd>
  *
  * <dt>active</dt>
  *     <dd>DEPRECATED: ignored.
  *     </dd>
  *
  * <dt>recognition</dt>
  *     <dd>If set, this will hold the encoded data that provides
  *     information on search and recognition within this resource.
  *     </dd>
  *
  * <dt>attributes</dt>
  *     <dd>A list of the attributes for this resource.
  *     </dd>
  *
  * <dt>updateSequenceNum</dt>
  *     <dd>A number identifying the last transaction to
  *     modify the state of this object. The USN values are sequential within an
  *     account, and can be used to compare the order of modifications within the
  *     service.
  *     </dd>
  *
  * <dt>alternateData</dt>
  *     <dd>Some Resources may be assigned an alternate data format by the service
  *     which may be more appropriate for indexing or rendering than the original
  *     data provided by the user.    In these cases, the alternate data form will
  *     be available via this Data element.    If a Resource has no alternate form,
  *     this field will be unset.</dd>
  * </dl>
  */
@JSImport("evernote", "Evernote.Resource")
@js.native
class Resource () extends js.Object {
  def this(args: AnonActive) = this()
  var active: Boolean = js.native
  var alternateData: Data = js.native
  var attributes: ResourceAttributes = js.native
  var data: Data = js.native
  var duration: Double = js.native
  var guid: String = js.native
  var height: Double = js.native
  var mime: String = js.native
  var noteGuid: String = js.native
  var recognition: Data = js.native
  var updateSequenceNum: Double = js.native
  var width: Double = js.native
}

