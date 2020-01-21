package typings.evernote.mod.Evernote

import typings.evernote.AnonAltitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structure holding the optional attributes of a Resource
  * <dl>
  * <dt>sourceURL</dt>
  *     <dd>the original location where the resource was hosted
  *     <br/>
  *        Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX
  *     </dd>
  *
  * <dt>timestamp</dt>
  *     <dd>the date and time that is associated with this resource
  *     (e.g. the time embedded in an image from a digital camera with a clock)
  *     </dd>
  *
  * <dt>latitude</dt>
  *     <dd>the latitude where the resource was captured
  *     </dd>
  *
  * <dt>longitude</dt>
  *     <dd>the longitude where the resource was captured
  *     </dd>
  *
  * <dt>altitude</dt>
  *     <dd>the altitude where the resource was captured
  *     </dd>
  *
  * <dt>cameraMake</dt>
  *     <dd>information about an image's camera, e.g. as embedded in
  *     the image's EXIF data
  *     <br/>
  *     Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX
  *     </dd>
  *
  * <dt>cameraModel</dt>
  *     <dd>information about an image's camera, e.g. as embedded
  *     in the image's EXIF data
  *     <br/>
  *     Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX
  *     </dd>
  *
  * <dt>clientWillIndex</dt>
  *     <dd>if true, then the original client that submitted
  *     the resource plans to submit the recognition index for this resource at a
  *     later time.
  *     </dd>
  *
  * <dt>recoType</dt>
  *     <dd>DEPRECATED - this field is no longer set by the service, so should
  *         be ignored.
  *     </dd>
  *
  * <dt>fileName</dt>
  *     <dd>if the resource came from a source that provided an
  *     explicit file name, the original name will be stored here.    Many resources
  *     come from unnamed sources, so this will not always be set.
  *     </dd>
  *
  * <dt>attachment</dt>
  *     <dd>this will be true if the resource should be displayed as an attachment,
  *     or false if the resource should be displayed inline (if possible).
  *     </dd>
  *
  * <dt>applicationData</dt>
  * <dd>Provides a location for applications to store a relatively small
  * (4kb) blob of data associated with a Resource that is not visible to the user
  * and that is opaque to the Evernote service. A single application may use at most
  * one entry in this map, using its API consumer key as the map key. See the
  * documentation for LazyMap for a description of when the actual map values
  * are returned by the service.
  * <p>To safely add or modify your application's entry in the map, use
  * NoteStore.setResourceApplicationDataEntry. To safely remove your application's
  * entry from the map, use NoteStore.unsetResourceApplicationDataEntry.</p>
  * Minimum length of a name (key): EDAM_APPLICATIONDATA_NAME_LEN_MIN
  * <br/>
  * Sum max size of key and value: EDAM_APPLICATIONDATA_ENTRY_LEN_MAX
  * <br/>
  * Syntax regex for name (key): EDAM_APPLICATIONDATA_NAME_REGEX
  * </dd>
  *
  * </dl>
  */
@JSImport("evernote", "Evernote.ResourceAttributes")
@js.native
class ResourceAttributes () extends js.Object {
  def this(args: AnonAltitude) = this()
  var altitude: Double = js.native
  var applicationData: LazyMap = js.native
  var attachment: Boolean = js.native
  var cameraMake: String = js.native
  var cameraModel: String = js.native
  var clientWillIndex: Boolean = js.native
  var fileName: String = js.native
  var latitude: Double = js.native
  var longitude: Double = js.native
  var recoType: String = js.native
  var sourceURL: String = js.native
  var timestamp: Double = js.native
}

