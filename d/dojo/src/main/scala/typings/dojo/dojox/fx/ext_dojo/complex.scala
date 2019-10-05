package typings.dojo.dojox.fx.ext_dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/fx/ext-dojo/complex.html
  *
  * Extends dojo/_base/fx.animateProperty to animate a "complex property". The primary example is the
  * clip style: rect(10px 30px 10px 50px).
  * Note this can also be used with (and is actually intended for)
  * CSS3 properties, such as transform:
  * transform: rotate(10deg) translateX(0px)
  * The standard animation doesn't know what to do with something like
  * rect(...). This class identifies complex properties by they being a
  * string and having parenthesis. If so, that property is made into a
  * dojox.fx._Complex object and the getValue() is obtained from
  * there.
  *
  */
trait complex extends js.Object

