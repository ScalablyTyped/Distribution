package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layersummary extends js.Object {
  /** The number of annotations for this layer. */
  var annotationCount: js.UndefOr[scala.Double] = js.undefined
  /** The list of annotation types contained for this layer. */
  var annotationTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Link to get data for this annotation. */
  var annotationsDataLink: js.UndefOr[java.lang.String] = js.undefined
  /** The link to get the annotations for this layer. */
  var annotationsLink: js.UndefOr[java.lang.String] = js.undefined
  /** The content version this resource is for. */
  var contentVersion: js.UndefOr[java.lang.String] = js.undefined
  /** The number of data items for this layer. */
  var dataCount: js.UndefOr[scala.Double] = js.undefined
  /** Unique id of this layer summary. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Resource Type */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The layer id for this summary. */
  var layerId: js.UndefOr[java.lang.String] = js.undefined
  /** URL to this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Timestamp for the last time an item in this layer was updated. (RFC 3339 UTC date-time format). */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The current version of this layer's volume annotations. Note that this version applies only to the data in the books.layers.volumeAnnotations.&#42;
    * responses. The actual annotation data is versioned separately.
    */
  var volumeAnnotationsVersion: js.UndefOr[java.lang.String] = js.undefined
  /** The volume id this resource is for. */
  var volumeId: js.UndefOr[java.lang.String] = js.undefined
}

