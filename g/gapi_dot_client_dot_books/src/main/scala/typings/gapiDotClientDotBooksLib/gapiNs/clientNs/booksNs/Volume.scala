package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Volume extends js.Object {
  /**
    * Any information about a volume related to reading or obtaining that volume text. This information can depend on country (books may be public domain in
    * one country but not in another, e.g.).
    */
  var accessInfo: js.UndefOr[gapiDotClientDotBooksLib.Anon_Embeddable] = js.undefined
  /** Opaque identifier for a specific version of a volume resource. (In LITE projection) */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** Unique identifier for a volume. (In LITE projection.) */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for a volume. (In LITE projection.) */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** What layers exist in this volume and high level information about them. */
  var layerInfo: js.UndefOr[gapiDotClientDotBooksLib.Anon_Layers] = js.undefined
  /** Recommendation related information for this volume. */
  var recommendedInfo: js.UndefOr[gapiDotClientDotBooksLib.Anon_Explanation] = js.undefined
  /**
    * Any information about a volume related to the eBookstore and/or purchaseability. This information can depend on the country where the request
    * originates from (i.e. books may not be for sale in certain countries).
    */
  var saleInfo: js.UndefOr[gapiDotClientDotBooksLib.Anon_IsEbook] = js.undefined
  /** Search result information related to this volume. */
  var searchInfo: js.UndefOr[gapiDotClientDotBooksLib.Anon_TextSnippet] = js.undefined
  /** URL to this resource. (In LITE projection.) */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** User specific information related to this volume. (e.g. page this user last read or whether they purchased this book) */
  var userInfo: js.UndefOr[gapiDotClientDotBooksLib.Anon_AcquisitionType] = js.undefined
  /** General volume information. */
  var volumeInfo: js.UndefOr[gapiDotClientDotBooksLib.Anon_Subtitle] = js.undefined
}

