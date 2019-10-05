package typings.dojo.dojox.encoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object digests {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/digests/MD5.html
    *
    * computes the digest of data, and returns the result according to type outputType
    *
    * @param data
    * @param outputType       Optional
    */
  type MD5 = js.Function2[/* data */ String, /* outputType */ js.UndefOr[js.Object], Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/digests/SHA1.html
    *
    * Computes the SHA1 digest of the data, and returns the result according to output type.
    *
    * @param data
    * @param outputType       Optional
    */
  type SHA1 = js.Function2[/* data */ String, /* outputType */ js.UndefOr[js.Object], Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/digests/SHA224.html
    *
    *
    * @param data
    * @param outputType       Optional
    */
  type SHA224 = js.Function2[/* data */ String, /* outputType */ js.UndefOr[Double], Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/digests/SHA256.html
    *
    *
    * @param data
    * @param outputType       Optional
    */
  type SHA256 = js.Function2[/* data */ String, /* outputType */ js.UndefOr[Double], Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/digests/SHA384.html
    *
    *
    * @param data
    * @param outputType       Optional
    */
  type SHA384 = js.Function2[/* data */ String, /* outputType */ js.UndefOr[Double], Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/digests/SHA512.html
    *
    *
    * @param data
    * @param outputType       Optional
    */
  type SHA512 = js.Function2[/* data */ String, /* outputType */ js.UndefOr[Double], Unit]
  type _base = _base_
}
