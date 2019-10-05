package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uuid {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/uuid/Uuid.html
    *
    * This is the constructor for the Uuid class.  The Uuid class offers
    * methods for inspecting existing UUIDs.
    *
    * @param input       Optional
    */
  type Uuid = js.Function1[/* input */ js.UndefOr[String], Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/uuid/generateRandomUuid.html
    *
    * This function generates random UUIDs, meaning "version 4" UUIDs.
    * A typical generated value would be something like this:
    * "3b12f1df-5232-4804-897e-917bf397618a"
    *
    * For more information about random UUIDs, see sections 4.4 and
    * 4.5 of RFC 4122: http://tools.ietf.org/html/rfc4122#section-4.4
    *
    * This generator function is designed to be small and fast,
    * but not necessarily good.
    *
    * Small: This generator has a small footprint. Once comments are
    * stripped, it's only about 25 lines of code, and it doesn't
    * dojo.require() any other modules.
    *
    * Fast: This generator can generate lots of new UUIDs fairly quickly
    * (at least, more quickly than the other dojo UUID generators).
    *
    * Not necessarily good: We use Math.random() as our source
    * of randomness, which may or may not provide much randomness.
    *
    */
  type generateRandomUuid = js.Function0[Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/uuid/generateTimeBasedUuid.html
    *
    * This function generates time-based UUIDs, meaning "version 1" UUIDs.
    * For more info, see
    * http://www.webdav.org/specs/draft-leach-uuids-guids-01.txt
    * http://www.infonuovo.com/dma/csdocs/sketch/instidid.htm
    * http://kruithof.xs4all.nl/uuid/uuidgen
    * http://www.opengroup.org/onlinepubs/009629399/apdxa.htm#tagcjh_20
    * http://jakarta.apache.org/commons/sandbox/id/apidocs/org/apache/commons/id/uuid/clock/Clock.html
    *
    * @param node       OptionalA 12-character hex string representing either a pseudo-node orhardware-node (an IEEE 802.3 network node).  A hardware-nodewill be something like "017bf397618a", always with the first bitbeing 0.  A pseudo-node will be something like "f17bf397618a",always with the first bit being 1.
    */
  type generateTimeBasedUuid = js.Function1[/* node */ js.UndefOr[String], Unit]
}
