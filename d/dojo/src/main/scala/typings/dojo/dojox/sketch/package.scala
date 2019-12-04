package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sketch {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/sketch/Anchor.html
    *
    *
    * @param an
    * @param id
    * @param isControl
    */
  type Anchor = js.Function3[/* an */ js.Any, /* id */ js.Any, /* isControl */ js.Any, Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/sketch/Annotation.html
    *
    *
    * @param figure
    * @param id
    */
  type Annotation = js.Function2[/* figure */ js.Any, /* id */ js.Any, Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/sketch/DoubleArrowAnnotation.html
    *
    *
    * @param figure
    * @param id
    */
  type DoubleArrowAnnotation = js.Function2[/* figure */ js.Any, /* id */ js.Any, Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/sketch/Figure.html
    *
    *
    * @param mixin
    */
  type Figure = js.Function1[/* mixin */ js.Any, Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/sketch/LeadAnnotation.html
    *
    *
    * @param figure
    * @param id
    */
  type LeadAnnotation = js.Function2[/* figure */ js.Any, /* id */ js.Any, Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/sketch/PreexistingAnnotation.html
    *
    *
    * @param figure
    * @param id
    */
  type PreexistingAnnotation = js.Function2[/* figure */ js.Any, /* id */ js.Any, Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/sketch/SingleArrowAnnotation.html
    *
    *
    * @param figure
    * @param id
    */
  type SingleArrowAnnotation = js.Function2[/* figure */ js.Any, /* id */ js.Any, Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/sketch/UnderlineAnnotation.html
    *
    *
    * @param figure
    * @param id
    */
  type UnderlineAnnotation = js.Function2[/* figure */ js.Any, /* id */ js.Any, Unit]
}
