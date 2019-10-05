package typings.dojo.dojox.lang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oo {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/oo/mixin.html
    *
    * mixes in two or more objects processing decorators and filters
    * using defaults as a fallback
    *
    * @param target target to receive new/updated properties
    * @param source source of properties, more than one source is allowed
    */
  type mixin = js.Function2[/* target */ js.Object, /* source */ js.Array[js.Object], Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/oo/rearrange.html
    *
    * Process properties in place by removing and renaming them.
    * Properties of an object are to be renamed or removed specified
    * by "map" argument. Only own properties of "map" are processed.
    *
    * @param bag the object to be processed
    * @param map the dictionary for renaming (false value indicates removal of the named property)
    */
  type rearrange = js.Function2[/* bag */ js.Object, /* map */ js.Object, Unit]
}
